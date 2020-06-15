/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._symboltable;

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


 abstract  public  class CalendarsLanguage  implements de.monticore.IModelingLanguage<CalendarsModelLoader> {

    /* generated by template core.Attribute*/
 private  CalendarsModelLoader modelLoader ;

    /* generated by template core.Attribute*/
 private  String name ;

    /* generated by template core.Attribute*/
 private  String fileExtension ;


    /* generated by template core.Constructor*/
 public  CalendarsLanguage(String langName,String fileEnding)  {
    /* generated by template _symboltable.language.Constructor*/
  this.name = langName;
  this.fileExtension = fileEnding;
  this.modelLoader = provideModelLoader();
}


    /* generated by template core.Method*/
 public  CalendarsModelLoader getModelLoader ()  {
      /* generated by template methods.Get*/

return this.modelLoader;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  String getFileExtension ()  {
      /* generated by template methods.Get*/

return this.fileExtension;

}

    /* generated by template core.Method*/
 public  calendars._symboltable.CalendarsSymbolTableCreatorDelegator getSymbolTableCreator (calendars._symboltable.ICalendarsGlobalScope enclosingScope)  {
       return new calendars._symboltable.CalendarsSymbolTableCreatorDelegator(enclosingScope);
}

    /* generated by template core.Method*/
 protected  CalendarsModelLoader provideModelLoader ()  {
      return new CalendarsModelLoader(this);
}

    /* generated by template core.Method*/
 public  calendars._parser.CalendarsParser getParser ()  {
      return new calendars._parser.CalendarsParser();
}

}