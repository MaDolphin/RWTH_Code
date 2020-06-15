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


 public  class AppointmentsSymbolTableCreatorDelegatorBuilder  {

    /* generated by template core.Attribute*/
 protected  AppointmentsSymbolTableCreatorDelegatorBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  Deque<appointments._symboltable.IAppointmentsScope> scopeStack ;

    /* generated by template core.Attribute*/
 protected  appointments._symboltable.IAppointmentsGlobalScope globalScope ;


    /* generated by template core.Constructor*/
 protected  AppointmentsSymbolTableCreatorDelegatorBuilder()  {
    this.realBuilder = (AppointmentsSymbolTableCreatorDelegatorBuilder) this;
}


    /* generated by template core.Method*/
 public  AppointmentsSymbolTableCreatorDelegator build ()  {
      /* generated by template _symboltable.symboltablecreatordelegator.Build*/

  AppointmentsSymbolTableCreatorDelegator obj = new AppointmentsSymbolTableCreatorDelegator(globalScope);
  obj.scopeStack = this.scopeStack;
  return obj;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (scopeStack == null) {
            return false;
        }
        if (globalScope == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  Deque<appointments._symboltable.IAppointmentsScope> getScopeStack ()  {
      /* generated by template methods.Get*/

return this.scopeStack;

}

    /* generated by template core.Method*/
 public  appointments._symboltable.IAppointmentsGlobalScope getGlobalScope ()  {
      /* generated by template methods.Get*/

return this.globalScope;

}

    /* generated by template core.Method*/
 public  AppointmentsSymbolTableCreatorDelegatorBuilder setScopeStack (Deque<appointments._symboltable.IAppointmentsScope> scopeStack)  {
      /* generated by template _ast.builder.Set*/

    this.scopeStack = scopeStack;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AppointmentsSymbolTableCreatorDelegatorBuilder setGlobalScope (appointments._symboltable.IAppointmentsGlobalScope globalScope)  {
      /* generated by template _ast.builder.Set*/

    this.globalScope = globalScope;
    return this.realBuilder;

}

}