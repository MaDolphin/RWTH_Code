package automata;
// (c) https://github.com/MontiCore/monticore

import automata._symboltable.*;
import classdiagrams._symboltable.ClassDiagramsGlobalScope;
import classdiagrams._symboltable.ClassDiagramsSymTabMill;
import de.monticore.io.paths.ModelPath;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class StateResolvingDelegateTest {

  private static final String MODEL_PATH = "src/test/resources";

  @BeforeClass
  public static void disableFailQuick() {
    Log.enableFailQuick(false);
  }

//  @Test
//  public void testResolveStateAsType() {
//    ClassDiagramsLanguage contactsLanguage = ClassDiagramsSymTabMill.classDiagramsLanguageBuilder().build();
//    ModelPath modelPath = new ModelPath(Paths.get(MODEL_PATH));
//    ClassDiagramsGlobalScope contactsGlobalScope = ClassDiagramsSymTabMill.classDiagramsGlobalScopeBuilder()
//        .setModelPath(modelPath)
//        .setClassDiagramsLanguage(contactsLanguage)
//        .build();
//
//    State2CDTypeResolvingDelegate resolvingDelegate = new State2CDTypeResolvingDelegate(contactsGlobalScope);
//
//    AutomataLanguage birthdayCalendarLanguage = AutomataSymTabMill.automataLanguageBuilder().build();
//    AutomataGlobalScope calendarGlobalScope = AutomataSymTabMill.automataGlobalScopeBuilder()
//        .setModelPath(modelPath)
//        .setAutomataLanguage(birthdayCalendarLanguage)
//        .build();
//
//    calendarGlobalScope.addAdaptedStateSymbolResolvingDelegate(resolvingDelegate);
//
//    calendarGlobalScope.resolveAutomaton("PingPongAut");
//    Optional<StateSymbol> franziscaContact = calendarGlobalScope.getSubScopes().get(0).resolveState("Ping");
//        assertTrue(franziscaContact.isPresent());
//  }

}
