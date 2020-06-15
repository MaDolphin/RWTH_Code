/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._symboltable.serialization;

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

 public  class CalendarsSymbolTablePrinter  implements calendars._visitor.CalendarsSymbolVisitor,calendars._visitor.CalendarsScopeVisitor {

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.serialization.JsonPrinter printer = new de.monticore.symboltable.serialization.JsonPrinter();



    /* generated by template core.Method*/
 public  CalendarsSymbolTablePrinter getRealThis ()  {
      return this;
}

    /* generated by template core.Method*/
 public  String getSerializedString ()  {
      return this.printer.getContent();
}

    /* generated by template core.Method*/
 protected  List<calendars._symboltable.ICalendarsScope> filterRelevantSubScopes (List<? extends calendars._symboltable.ICalendarsScope> subScopes)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.FilterRelevantSubScopes*/

  List<calendars._symboltable.ICalendarsScope> result = new ArrayList<>();
  for (calendars._symboltable.ICalendarsScope scope : subScopes) {
    if(hasSymbolsInSubScopes(scope)) {
      result.add(scope);
    }
  }
  return result;
}

    /* generated by template core.Method*/
 protected  boolean hasSymbolsInSubScopes (calendars._symboltable.ICalendarsScope scope)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.HasSymbolsInSubScopes*/

  boolean hasSymbolsInSubScopes = false;
  for (calendars._symboltable.ICalendarsScope subScope : scope.getSubScopes()) {
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
 protected  void serializeRelevantSubScopes (calendars._symboltable.ICalendarsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeRelevantSubScopes*/

  List<calendars._symboltable.ICalendarsScope> subScopes = filterRelevantSubScopes(node.getSubScopes());
  if (!subScopes.isEmpty()) {
    printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.SUBSCOPES);
    subScopes.stream().forEach(s -> s.accept(getRealThis()));
    printer.endArray();
  }
}

    /* generated by template core.Method*/
 protected  void serializeLocalSymbols (calendars._symboltable.ICalendarsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeLocalSymbols*/


}

    /* generated by template core.Method*/
 public  void visit (calendars._symboltable.CalendarsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "calendars._symboltable.CalendarsScope");
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
 public  void endVisit (calendars._symboltable.CalendarsScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (calendars._symboltable.CalendarsScope node)  {
      serializeRelevantSubScopes(node);
}

    /* generated by template core.Method*/
 protected  void serializeAdditionalScopeAttributes (calendars._symboltable.CalendarsScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.SerializeSymbol*/


}

    /* generated by template core.Method*/
 public  void visit (calendars._symboltable.CalendarsArtifactScope node)  {
      /* generated by template _symboltable.serialization.symbolTablePrinter.VisitArtifactScope*/

  printer.beginObject();
  printer.member(de.monticore.symboltable.serialization.JsonConstants.KIND, "calendars._symboltable.CalendarsArtifactScope");
  printer.member(de.monticore.symboltable.serialization.JsonConstants.NAME, node.getName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.PACKAGE, node.getPackageName());
  printer.member(de.monticore.symboltable.serialization.JsonConstants.EXPORTS_SYMBOLS, node.isExportingSymbols());
  printer.beginArray(de.monticore.symboltable.serialization.JsonConstants.IMPORTS);
  node.getImportList().forEach(x -> printer.value(x.toString()));
  printer.endArray();
  if (node.isPresentSpanningSymbol()) {
    addScopeSpanningSymbol(node.getSpanningSymbol());
  }
  serializeLocalSymbols(node);
  serializeAdditionalScopeAttributes(node);
}

    /* generated by template core.Method*/
 public  void endVisit (calendars._symboltable.CalendarsArtifactScope node)  {
      printer.endObject();
}

    /* generated by template core.Method*/
 public  void traverse (calendars._symboltable.CalendarsArtifactScope node)  {
      traverse((calendars._symboltable.CalendarsScope) node);
}

}