/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;


 public  class AutomataSymbolTableCreator  implements automata._visitor.AutomataVisitor {

    /* generated by template core.Attribute*/
 protected  Deque<automata._symboltable.IAutomataScope> scopeStack = new java.util.ArrayDeque<>();

    /* generated by template core.Attribute*/
 private  automata._visitor.AutomataVisitor realThis = this;

    /* generated by template core.Attribute*/
 protected  automata._symboltable.IAutomataScope firstCreatedScope ;


    /* generated by template core.Constructor*/
 public  AutomataSymbolTableCreator(automata._symboltable.IAutomataScope enclosingScope)  {
    putOnStack(Log.errorIfNull(enclosingScope));
}

    /* generated by template core.Constructor*/
 public  AutomataSymbolTableCreator(Deque<? extends automata._symboltable.IAutomataScope> scopeStack)  {
    this.scopeStack = Log.errorIfNull((Deque<automata._symboltable.IAutomataScope>)scopeStack);
}


    /* generated by template core.Method*/
 public  automata._visitor.AutomataVisitor getRealThis ()  {
      /* generated by template methods.Get*/

return this.realThis;

}

    /* generated by template core.Method*/
 public  void setRealThis (automata._visitor.AutomataVisitor realThis)  {
      /* generated by template methods.Set*/

this.realThis = realThis;

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope getFirstCreatedScope ()  {
      /* generated by template methods.Get*/

return this.firstCreatedScope;

}

    /* generated by template core.Method*/
 public  automata._symboltable.AutomataArtifactScope createFromAST (automata._ast.ASTAutomaton rootNode)  {
      /* generated by template _symboltable.symboltablecreator.CreateFromAST*/

  Log.errorIfNull(rootNode, "0xA7004x869 Error by creating of the AutomataSymbolTableCreator symbol table: top ast node is null");
  automata._symboltable.AutomataArtifactScope artifactScope = new automata._symboltable.AutomataArtifactScope(Optional.empty(), "", new ArrayList<>());
  putOnStack(artifactScope);
  rootNode.accept(getRealThis());
  return artifactScope;
}

    /* generated by template core.Method*/
 public  void putOnStack (automata._symboltable.IAutomataScope scope)  {
      /* generated by template _symboltable.symboltablecreator.PutOnStack*/
  Log.errorIfNull(scope);

if (scope.getEnclosingScope() == null && getCurrentScope().isPresent()) {
    scope.setEnclosingScope(getCurrentScope().get());
    getCurrentScope().get().addSubScope(scope);
} else if (scope.getEnclosingScope() != null && getCurrentScope().isPresent()) {
    if (scope.getEnclosingScope() != getCurrentScope().get()) {
      Log.warn("0xA1043 The enclosing scope is not the same as the current scope on the stack.");
    }
  }

  if (firstCreatedScope == null) {
    firstCreatedScope = scope;
  }

  scopeStack.addLast(scope);
}

    /* generated by template core.Method*/
 public  final  Optional<automata._symboltable.IAutomataScope> getCurrentScope ()  {
      return Optional.ofNullable(scopeStack.peekLast());
}

    /* generated by template core.Method*/
 public  final  Optional<automata._symboltable.IAutomataScope> removeCurrentScope ()  {
      return Optional.ofNullable(scopeStack.pollLast());
}

    /* generated by template core.Method*/
 protected  void setAutomatonScopeStack (Deque<automata._symboltable.IAutomataScope> scopeStack)  {
      this.scopeStack = scopeStack;
}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomataScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  automata._symboltable.IAutomataScope scope = automata._symboltable.AutomataSymTabMill.automataScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTAutomaton node)  {
      /* generated by template _symboltable.symboltablecreator.Visit*/

  automata._symboltable.AutomatonSymbol symbol = create_Automaton(node);
  initialize_Automaton(symbol, node);
  addToScopeAndLinkWithNode(symbol, node);
}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTAutomaton node)  {
      removeCurrentScope();
}

    /* generated by template core.Method*/
 protected  automata._symboltable.AutomatonSymbol create_Automaton (automata._ast.ASTAutomaton ast)  {
      return new automata._symboltable.AutomatonSymbol(ast.getName());
}

    /* generated by template core.Method*/
 protected  void initialize_Automaton (automata._symboltable.AutomatonSymbol symbol,automata._ast.ASTAutomaton ast)  {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 public  void addToScopeAndLinkWithNode (automata._symboltable.AutomatonSymbol symbol,automata._ast.ASTAutomaton ast)  {
      /* generated by template _symboltable.symboltablecreator.AddToScopeAndLinkWithNode*/

  addToScope(symbol);
  automata._symboltable.IAutomataScope scope = createScope(false);
  putOnStack(scope);
  symbol.setSpannedScope(scope);
  setLinkBetweenSymbolAndNode(symbol, ast);
}

    /* generated by template core.Method*/
 public  void setLinkBetweenSymbolAndNode (automata._symboltable.AutomatonSymbol symbol,automata._ast.ASTAutomaton ast)  {
      /* generated by template _symboltable.symboltablecreator.SetLinkBetweenSymbolAndNode*/

  // symbol -> ast
  symbol.setAstNode(ast);

  // ast -> symbol
  ast.setSymbol(symbol);
  ast.setEnclosingScope(symbol.getEnclosingScope());

  // ast -> spannedScope
  ast.setSpannedScope(symbol.getSpannedScope());

}

    /* generated by template core.Method*/
 public  void setLinkBetweenSpannedScopeAndNode (automata._symboltable.IAutomataScope scope,automata._ast.ASTAutomaton ast)  {
      /* generated by template _symboltable.symboltablecreator.SetLinkBetweenSpannedScopeAndNode*/

  // scope -> ast
  scope.setAstNode(ast);

  // ast -> scope
  ast.setSpannedScope((automata._symboltable.AutomataScope) scope);
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTState node)  {
      /* generated by template _symboltable.symboltablecreator.Visit*/

  automata._symboltable.StateSymbol symbol = create_State(node);
  initialize_State(symbol, node);
  addToScopeAndLinkWithNode(symbol, node);
}

    /* generated by template core.Method*/
 public  void endVisit (automata._ast.ASTState node)  {
      removeCurrentScope();
}

    /* generated by template core.Method*/
 protected  automata._symboltable.StateSymbol create_State (automata._ast.ASTState ast)  {
      return new automata._symboltable.StateSymbol(ast.getName());
}

    /* generated by template core.Method*/
 protected  void initialize_State (automata._symboltable.StateSymbol symbol,automata._ast.ASTState ast)  {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 public  void addToScopeAndLinkWithNode (automata._symboltable.StateSymbol symbol,automata._ast.ASTState ast)  {
      /* generated by template _symboltable.symboltablecreator.AddToScopeAndLinkWithNode*/

  addToScope(symbol);
  automata._symboltable.IAutomataScope scope = createScope(false);
  putOnStack(scope);
  symbol.setSpannedScope(scope);
  setLinkBetweenSymbolAndNode(symbol, ast);
}

    /* generated by template core.Method*/
 public  void setLinkBetweenSymbolAndNode (automata._symboltable.StateSymbol symbol,automata._ast.ASTState ast)  {
      /* generated by template _symboltable.symboltablecreator.SetLinkBetweenSymbolAndNode*/

  // symbol -> ast
  symbol.setAstNode(ast);

  // ast -> symbol
  ast.setSymbol(symbol);
  ast.setEnclosingScope(symbol.getEnclosingScope());

  // ast -> spannedScope
  ast.setSpannedScope(symbol.getSpannedScope());

}

    /* generated by template core.Method*/
 public  void setLinkBetweenSpannedScopeAndNode (automata._symboltable.IAutomataScope scope,automata._ast.ASTState ast)  {
      /* generated by template _symboltable.symboltablecreator.SetLinkBetweenSpannedScopeAndNode*/

  // scope -> ast
  scope.setAstNode(ast);

  // ast -> scope
  ast.setSpannedScope((automata._symboltable.AutomataScope) scope);
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTTransition node)  {
      /* generated by template _symboltable.symboltablecreator.VisitNoSymbol*/
  if (getCurrentScope().isPresent()) {
    node.setEnclosingScope(getCurrentScope().get());
  }
  else {
    Log.error("Could not set enclosing scope of ASTNode \"" + node
              + "\", because no scope is set yet!");
  }
}

    /* generated by template core.Method*/
 public  void addToScope (automata._symboltable.AutomatonSymbol symbol)  {
      /* generated by template _symboltable.symboltablecreator.AddToScope*/
  if (getCurrentScope().isPresent()) {
    getCurrentScope().get().add(symbol);
  } else {
    Log.warn("0xA50212 Symbol cannot be added to current scope, since no scope exists.");
  }

}

    /* generated by template core.Method*/
 public  void addToScope (automata._symboltable.StateSymbol symbol)  {
      /* generated by template _symboltable.symboltablecreator.AddToScope*/
  if (getCurrentScope().isPresent()) {
    getCurrentScope().get().add(symbol);
  } else {
    Log.warn("0xA50212 Symbol cannot be added to current scope, since no scope exists.");
  }

}

}
