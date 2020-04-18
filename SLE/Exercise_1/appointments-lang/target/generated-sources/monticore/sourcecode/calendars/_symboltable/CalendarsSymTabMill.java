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


 public  class CalendarsSymTabMill  {

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill mill ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsModelLoader ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsSymbolTableCreator ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsSymbolTableCreatorDelegator ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsGlobalScope ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsArtifactScope ;

    /* generated by template core.Attribute*/
 protected  static  CalendarsSymTabMill calendarsScope ;


    /* generated by template core.Constructor*/
 protected  CalendarsSymTabMill()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 protected  static  CalendarsSymTabMill getMill ()  {
      /* generated by template _symboltable.symTabMill.GetMill*/

  if (mill == null) {
    mill = new CalendarsSymTabMill();
  }
  return mill;
}

    /* generated by template core.Method*/
 public  static  void initMe (CalendarsSymTabMill a)  {
      /* generated by template _symboltable.symTabMill.InitMe*/

  mill = a;
  calendarsModelLoader = mill;
  calendarsSymbolTableCreator = mill;
  calendarsSymbolTableCreatorDelegator = mill;
  calendarsGlobalScope = mill;
  calendarsArtifactScope = mill;
  calendarsScope = mill;

}

    /* generated by template core.Method*/
 public  static  void init ()  {
      mill = new CalendarsSymTabMill();
}

    /* generated by template core.Method*/
 public  static  void reset ()  {
      /* generated by template _symboltable.symTabMill.Reset*/

  mill = null;
  calendarsModelLoader = null;
  calendarsSymbolTableCreator = null;
  calendarsSymbolTableCreatorDelegator = null;
  calendarsGlobalScope = null;
  calendarsArtifactScope = null;
  calendarsScope = null;
  de.monticore.literals.mccommonliterals._symboltable.MCCommonLiteralsSymTabMill.reset();
  de.monticore.mcbasics._symboltable.MCBasicsSymTabMill.reset();
  de.monticore.literals.mcliteralsbasis._symboltable.MCLiteralsBasisSymTabMill.reset();

}

    /* generated by template core.Method*/
 protected  CalendarsModelLoaderBuilder _calendarsModelLoaderBuilder ()  {
      return new CalendarsModelLoaderBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsModelLoaderBuilder calendarsModelLoaderBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsModelLoader == null) {
    calendarsModelLoader = getMill();
  }
  return calendarsModelLoader._calendarsModelLoaderBuilder();
}

    /* generated by template core.Method*/
 protected  CalendarsSymbolTableCreatorBuilder _calendarsSymbolTableCreatorBuilder ()  {
      return new CalendarsSymbolTableCreatorBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsSymbolTableCreatorBuilder calendarsSymbolTableCreatorBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsSymbolTableCreator == null) {
    calendarsSymbolTableCreator = getMill();
  }
  return calendarsSymbolTableCreator._calendarsSymbolTableCreatorBuilder();
}

    /* generated by template core.Method*/
 protected  CalendarsSymbolTableCreatorDelegatorBuilder _calendarsSymbolTableCreatorDelegatorBuilder ()  {
      return new CalendarsSymbolTableCreatorDelegatorBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsSymbolTableCreatorDelegatorBuilder calendarsSymbolTableCreatorDelegatorBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsSymbolTableCreatorDelegator == null) {
    calendarsSymbolTableCreatorDelegator = getMill();
  }
  return calendarsSymbolTableCreatorDelegator._calendarsSymbolTableCreatorDelegatorBuilder();
}

    /* generated by template core.Method*/
 protected  CalendarsGlobalScopeBuilder _calendarsGlobalScopeBuilder ()  {
      return new CalendarsGlobalScopeBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsGlobalScopeBuilder calendarsGlobalScopeBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsGlobalScope == null) {
    calendarsGlobalScope = getMill();
  }
  return calendarsGlobalScope._calendarsGlobalScopeBuilder();
}

    /* generated by template core.Method*/
 protected  CalendarsArtifactScopeBuilder _calendarsArtifactScopeBuilder ()  {
      return new CalendarsArtifactScopeBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsArtifactScopeBuilder calendarsArtifactScopeBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsArtifactScope == null) {
    calendarsArtifactScope = getMill();
  }
  return calendarsArtifactScope._calendarsArtifactScopeBuilder();
}

    /* generated by template core.Method*/
 protected  CalendarsScopeBuilder _calendarsScopeBuilder ()  {
      return new CalendarsScopeBuilder();
}

    /* generated by template core.Method*/
 public  static  CalendarsScopeBuilder calendarsScopeBuilder ()  {
      /* generated by template _symboltable.symTabMill.BuilderMethod*/

  if (calendarsScope == null) {
    calendarsScope = getMill();
  }
  return calendarsScope._calendarsScopeBuilder();
}

}
