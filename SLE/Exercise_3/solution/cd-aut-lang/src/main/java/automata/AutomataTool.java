package automata;/* (c) https://github.com/MontiCore/monticore */


import automata._ast.ASTAutomaton;
import automata._cocos.AutomataCoCoChecker;
import automata._parser.AutomataParser;
import automata._symboltable.*;
import automata.coco.ReferencedStateExists;
import classdiagrams._symboltable.ClassDiagramsGlobalScope;
import classdiagrams._symboltable.ClassDiagramsLanguage;
import classdiagrams._symboltable.ClassDiagramsSymTabMill;
import de.monticore.io.paths.ModelPath;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * Main class for the Automaton DSL tool.
 *
 * @author (last commit) $Author$
 */
public class AutomataTool {

  private static final String MODEL_PATH = "src/test/resources";

  /**
   * Use the single argument for specifying the single input automata file.
   *
   * @param args
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      Log.error("Please specify only one single path to the input model.");
      return;
    }
    String model = args[0];
    
    // setup the language infrastructure
    final AutomataLanguage lang = AutomataSymTabMill.automataLanguageBuilder().build();

    // parse the model and create the AST representation
    final ASTAutomaton ast = parse(model);
    Log.info(model + " parsed successfully!", AutomataTool.class.getName());
    
    // setup the symbol table
    createSymbolTable(lang, ast);
    
    // execute a custom set of context conditions
    AutomataCoCoChecker customCoCos = new AutomataCoCoChecker();
    // Exercise 5.4c
    customCoCos.addCoCo(new ReferencedStateExists());
    customCoCos.checkAll(ast);
  }
  
  /**
   * Parse the model contained in the specified file.
   *
   * @param model - file to parse
   * @return
   */
  public static ASTAutomaton parse(String model) {
    try {
      AutomataParser parser = new AutomataParser() ;
      Optional<ASTAutomaton> optAutomaton = parser.parse(model);
      
      if (!parser.hasErrors() && optAutomaton.isPresent()) {
        return optAutomaton.get();
      }
      Log.error("Model could not be parsed.");
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
    return null;
  }
  
  /**
   * Create the symbol table from the parsed AST.
   *
   * @param lang
   * @param ast
   * @return
   */
  public static void createSymbolTable(AutomataLanguage lang, ASTAutomaton ast) {
    ModelPath modelPath = new ModelPath(Paths.get(MODEL_PATH));
    // this is needed for the creation of the global scope
    ClassDiagramsLanguage contactsLanguage = ClassDiagramsSymTabMill.classDiagramsLanguageBuilder().build();
    // needed for the resolving delegate which gets a global scope of type ClassDiagramsGlobalScope
    ClassDiagramsGlobalScope contactsGlobalScope = ClassDiagramsSymTabMill.classDiagramsGlobalScopeBuilder()
        .setModelPath(modelPath)
        .setClassDiagramsLanguage(contactsLanguage)
        .build();

    // Exercise 5.3e
    // instantiate a new State2CDTypeResolvingDelegate with the previously created global scope
    State2CDTypeResolvingDelegate resolvingDelegate = new State2CDTypeResolvingDelegate(contactsGlobalScope);

    AutomataGlobalScope globalScope = new AutomataGlobalScope(modelPath, lang);

    // Exercise 5.3e
    // add the resolvingDelegate to the AutomataGlobalScope, so that CDType symbols can also be found when resolved for state
    globalScope.addAdaptedStateSymbolResolvingDelegate(resolvingDelegate);

    AutomataSymbolTableCreatorDelegator symbolTable = lang.getSymbolTableCreator(globalScope);
    // create the actual symboltable
    symbolTable.createFromAST(ast);
  }

}
