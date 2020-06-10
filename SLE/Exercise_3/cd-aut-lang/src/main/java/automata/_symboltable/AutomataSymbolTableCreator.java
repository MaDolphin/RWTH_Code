package automata._symboltable;

import automata._ast.ASTAutomaton;
import de.monticore.symboltable.ImportStatement;
import de.monticore.types.mcbasictypes._ast.ASTMCImportStatement;
import de.se_rwth.commons.logging.Log;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

public class AutomataSymbolTableCreator extends AutomataSymbolTableCreatorTOP {

  public AutomataSymbolTableCreator(IAutomataScope enclosingScope) {
    super(enclosingScope);
  }

  public AutomataSymbolTableCreator(Deque<? extends IAutomataScope> scopeStack) {
    super(scopeStack);
  }

  @Override
  public  AutomataArtifactScope createFromAST (automata._ast.ASTAutomaton rootNode)  {
    Log.errorIfNull(rootNode, "0xA7004x869 Error by creating of the AutomataSymbolTableCreator symbol table: top ast node is null");
    automata._symboltable.AutomataArtifactScope artifactScope = new automata._symboltable.AutomataArtifactScope(Optional.empty(),
        "", getAllImportStatements(rootNode));
    putOnStack(artifactScope);
    rootNode.accept(getRealThis());
    return artifactScope;
  }

  protected List<ImportStatement> getAllImportStatements(ASTAutomaton node){
    final List<ImportStatement> imports = new ArrayList<>();
    if (node.getMCImportStatementList() != null) {
      for (ASTMCImportStatement imp : node.getMCImportStatementList()) {
        String qualifiedImport = imp.getQName();
        imports.add(new ImportStatement(qualifiedImport, imp.isStar()));
      }
    }
    return imports;
  }

}
