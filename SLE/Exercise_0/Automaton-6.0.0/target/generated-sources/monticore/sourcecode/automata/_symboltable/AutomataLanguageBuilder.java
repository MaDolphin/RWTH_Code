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


 public  class AutomataLanguageBuilder  {

    /* generated by template core.Attribute*/
 protected  AutomataLanguageBuilder realBuilder ;

    /* generated by template core.Attribute*/
 private  AutomataModelLoader modelLoader ;

    /* generated by template core.Attribute*/
 private  String name ;

    /* generated by template core.Attribute*/
 private  String fileExtension ;


    /* generated by template core.Constructor*/
 protected  AutomataLanguageBuilder()  {
    this.realBuilder = (AutomataLanguageBuilder) this;
}


    /* generated by template core.Method*/
 public  AutomataLanguage build ()  {
      return new AutomataLanguage();
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (modelLoader == null) {
            return false;
        }
        if (name == null) {
            return false;
        }
        if (fileExtension == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  AutomataModelLoader getModelLoader ()  {
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
 public  AutomataLanguageBuilder setModelLoader (AutomataModelLoader modelLoader)  {
      /* generated by template _ast.builder.Set*/

    this.modelLoader = modelLoader;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataLanguageBuilder setName (String name)  {
      /* generated by template _ast.builder.Set*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataLanguageBuilder setFileExtension (String fileExtension)  {
      /* generated by template _ast.builder.Set*/

    this.fileExtension = fileExtension;
    return this.realBuilder;

}

}