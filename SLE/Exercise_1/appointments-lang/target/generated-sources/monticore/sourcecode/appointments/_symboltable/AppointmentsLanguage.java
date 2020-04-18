/* generated from model Appointments */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package appointments._symboltable;

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


 abstract  public  class AppointmentsLanguage  implements de.monticore.IModelingLanguage<AppointmentsModelLoader> {

    /* generated by template core.Attribute*/
 private  AppointmentsModelLoader modelLoader ;

    /* generated by template core.Attribute*/
 private  String name ;

    /* generated by template core.Attribute*/
 private  String fileExtension ;


    /* generated by template core.Constructor*/
 public  AppointmentsLanguage(String langName,String fileEnding)  {
    /* generated by template _symboltable.language.Constructor*/
  this.name = langName;
  this.fileExtension = fileEnding;
  this.modelLoader = provideModelLoader();
}


    /* generated by template core.Method*/
 public  AppointmentsModelLoader getModelLoader ()  {
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
 public  appointments._symboltable.AppointmentsSymbolTableCreatorDelegator getSymbolTableCreator (appointments._symboltable.IAppointmentsGlobalScope enclosingScope)  {
       return new appointments._symboltable.AppointmentsSymbolTableCreatorDelegator(enclosingScope);
}

    /* generated by template core.Method*/
 protected  AppointmentsModelLoader provideModelLoader ()  {
      return new AppointmentsModelLoader(this);
}

    /* generated by template core.Method*/
 public  appointments._parser.AppointmentsParser getParser ()  {
      return new appointments._parser.AppointmentsParser();
}

}
