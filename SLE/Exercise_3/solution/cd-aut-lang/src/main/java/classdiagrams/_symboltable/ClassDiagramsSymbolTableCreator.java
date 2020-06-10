package classdiagrams._symboltable;


import classdiagrams._ast.ASTCDClass;
import classdiagrams._ast.ASTCDInterface;
import classdiagrams._ast.ASTModifier;

import java.util.Deque;

// Exercise 5.2c
public class ClassDiagramsSymbolTableCreator extends ClassDiagramsSymbolTableCreatorTOP {

  public ClassDiagramsSymbolTableCreator(IClassDiagramsScope enclosingScope) {
    super(enclosingScope);
  }

  public ClassDiagramsSymbolTableCreator(Deque<? extends IClassDiagramsScope> scopeStack) {
    super(scopeStack);
  }

  @Override
  protected void initialize_CDInterface(CDTypeSymbol symbol, ASTCDInterface ast) {
    if (ast.isPresentModifier()) {
      setModifier(symbol, ast.getModifier());
    }
  }

  @Override
  protected void initialize_CDClass(CDTypeSymbol symbol, ASTCDClass ast) {
    if (ast.isPresentModifier()) {
      setModifier(symbol, ast.getModifier());
    }
  }

  protected void setModifier(CDTypeSymbol symbol, ASTModifier modifier) {
    if (modifier.isPrivate()) {
      symbol.setIsPrivate(true);
    } else if (modifier.isPublic()) {
      symbol.setIsPublic(true);
    } else if (modifier.isProtected()) {
      symbol.setIsProtected(true);
    }
  }
}


