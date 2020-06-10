// (c) https://github.com/MontiCore/monticore
package travelcosts;

/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._parser.TravelCostsParser;

import java.io.IOException;
import java.util.Optional;

/**
 * Main class for the DSL tool.
 *
 * @author (last commit) $Author$
 */
public class TravelCostsTool {
  
  /**
   * Use the single argument for specifying the single input travelcosts file.
   *
   * @param args
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      Log.error("Please specify only one single path to the input model.");
      return;
    }
    String model = args[0];
    
    // parse the model and create the AST representation
    final ASTTravelExpenseReport ast = parse(model);
    Log.info(model + " parsed successfully!", TravelCostsTool.class.getName());
    
  }
  
  /**
   * Parse the model contained in the specified file.
   *
   * @param model - file to parse
   * @return
   */
  public static ASTTravelExpenseReport parse(String model) {
    try {
      TravelCostsParser parser = new TravelCostsParser() ;
      Optional<ASTTravelExpenseReport> travelExpenseReport = parser.parse(model);
      
      if (!parser.hasErrors() && travelExpenseReport.isPresent()) {
        return travelExpenseReport.get();
      }
      Log.error("Model could not be parsed.");
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
    return null;
  }
}
