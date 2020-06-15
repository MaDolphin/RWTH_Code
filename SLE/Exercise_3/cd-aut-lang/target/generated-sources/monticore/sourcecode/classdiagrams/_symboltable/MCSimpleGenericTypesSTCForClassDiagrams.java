/* generated from model ClassDiagrams */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._symboltable;

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


 public  class MCSimpleGenericTypesSTCForClassDiagrams extends de.monticore.types.mcsimplegenerictypes._symboltable.MCSimpleGenericTypesSymbolTableCreator  {


    /* generated by template core.Constructor*/
 public  MCSimpleGenericTypesSTCForClassDiagrams(Deque<? extends de.monticore.types.mcsimplegenerictypes._symboltable.IMCSimpleGenericTypesScope> scopeStack)  {
    super(scopeStack);
}


    /* generated by template core.Method*/
 public  classdiagrams._symboltable.IClassDiagramsScope createScope (boolean shadowing)  {
      /* generated by template _symboltable.symboltablecreator.CreateScope*/

  classdiagrams._symboltable.IClassDiagramsScope scope = classdiagrams._symboltable.ClassDiagramsSymTabMill.classDiagramsScopeBuilder().build();
  scope.setShadowing(shadowing);
  return scope;
}

}