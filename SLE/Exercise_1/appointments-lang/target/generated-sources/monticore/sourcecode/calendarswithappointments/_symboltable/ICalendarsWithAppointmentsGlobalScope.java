/* generated from model CalendarsWithAppointments */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package calendarswithappointments._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface ICalendarsWithAppointmentsGlobalScope extends calendarswithappointments._symboltable.ICalendarsWithAppointmentsScope,de.monticore.symboltable.IGlobalScope {



  /* generated by template core.Method*/
 abstract  public  CalendarsWithAppointmentsLanguage getCalendarsWithAppointmentsLanguage () ;
  /* generated by template core.Method*/
 abstract  public  void cache (String calculatedModelName) ;
  default /* generated by template core.Method*/
 public  boolean checkIfContinueAsSubScope (String symbolName)  {
      return false;
}

  /* generated by template core.Method*/
 abstract  public  boolean continueWithModelLoader (String calculatedModelName,CalendarsWithAppointmentsModelLoader modelLoader) ;
  default /* generated by template core.Method*/
 public  ICalendarsWithAppointmentsGlobalScope getRealThis ()  {
      return this;
}

}