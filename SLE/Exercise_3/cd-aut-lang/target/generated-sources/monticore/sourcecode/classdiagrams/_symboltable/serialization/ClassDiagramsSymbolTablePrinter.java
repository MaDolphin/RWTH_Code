/* generated from model ClassDiagrams */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._symboltable.serialization;

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

/* generated by template core.Annotations*/
// empty template

 public  class ClassDiagramsSymbolTablePrinter  implements classdiagrams._visitor.ClassDiagramsSymbolVisitor,classdiagrams._visitor.ClassDiagramsScopeVisitor {

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.serialization.JsonPrinter printer = new de.monticore.symboltable.serialization.JsonPrinter();



    /* generated by template core.Method*/
 public  ClassDiagramsSymbolTablePrinter getRealThis ()  {
      return this;
}

    /* generated by template core.Method*/
 public  String getSerializedString ()  {
      return this.printer.getContent();
}

    /* generated by template core.Method*/
 protected  List<classdiagrams._symboltable.IClassDiagramsScope> filterRelevantSubScopes (List<? extends classdiagrams._symboltable.IClassDiagramsScope> subScopes)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.FilterRelevantSubScopes*/

  List<classdiagrams._symboltable.IClassDiagramsScope> result = new ArrayList<>();
  for (classdiagrams._symboltable.IClassDiagramsScope scope : subScopes) {
    if(hasSymbolsInSubScopes(scope)) {
      result.add(scope);
    }
  }
  return result;
}

    /* generated by template core.Method*/
 protected  boolean hasSymbolsInSubScopes (classdiagrams._symboltable.IClassDiagramsScope scope)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.HasSymbolsInSubScopes*/

  boolean hasSymbolsInSubScopes = false;
  for (classdiagrams._symboltable.IClassDiagramsScope subScope : scope.getSubScopes()) {
    hasSymbolsInSubScopes |= hasSymbolsInSubScopes(subScope);
  if (hasSymbolsInSubScopes) return true;
  }
  return hasSymbolsInSubScopes | scope.getSymbolsSize()>0;
}

    /* generated by template core.Method*/
 protected  void addScopeSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.AddScopeSpanningSymbol*/
  if (null != spanningSymbol) {
    printer.beginObject(de.monticore.symboltable.serialization.JsonConstants.SCOPE_SPANNING_SYMBOL);
    printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, spanningSymbol.getClass().getName());
    printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, spanningSymbol.getName());
    printer.endObject();
  }
}

    /* generated by template core.Method*/
 protected  void serializeRelevantSubScopes (classdiagrams._symboltable.IClassDiagramsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeRelevantSubScopes*/

  List<classdiagrams._symboltable.IClassDiagramsScope> subScopes = filterRelevantSubScopes(node.getSubScopes());
  if (!subScopes.isEmpty()) {
    printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    subScopes.stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }
}

    /* generated by template core.Method*/
 protected  void serializeLocalSymbols (classdiagrams._symboltable.IClassDiagramsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeLocalSymbols*/

  if (!node.getLocalCDDefinitionSymbols().isEmpty()) {
    printer.beginArray("cDDefinitionSymbols");
    node.getLocalCDDefinitionSymbols().stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }

}

    /* generated by template core.Method*/
 public  void visit (classdiagrams._symboltable.ClassDiagramsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "classdiagrams._symboltable.ClassDiagramsScope");
  printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, node.getName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.IS_SHADOWING_SCOPE, node.isShadowing());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS, node.isExportingSymbols());
  if (node.isPresentSpanningSymbol()) {
    addScopeSpanningSymbol(node.getSpanningSymbol());
  }
  serializeLocalSymbols(node);
  serializeAdditionalScopeAttributes(node);
}

    /* generated by template core.Method*/
 public  void endVisit (classdiagrams._symboltable.ClassDiagramsScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (classdiagrams._symboltable.ClassDiagramsScope node)  {
      serializeRelevantSubScopes(node);
}

    /* generated by template core.Method*/
 public  void visit (classdiagrams._symboltable.CDDefinitionSymbol node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitSymbol*/

  printer.beginObject();
  // Name and kind are part of every serialized symbol
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "classdiagrams._symboltable.CDDefinitionSymbol");
  printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, node.getName());
  // Serialize all relevant additional attributes (introduced by symbolRules)
  serializeCDDefinition(node);
}

    /* generated by template core.Method*/
 public  void endVisit (classdiagrams._symboltable.CDDefinitionSymbol node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 protected  void serializeCDDefinition (classdiagrams._symboltable.CDDefinitionSymbol node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

    /* generated by template core.Method*/
 protected  void serializeAdditionalScopeAttributes (classdiagrams._symboltable.ClassDiagramsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

}