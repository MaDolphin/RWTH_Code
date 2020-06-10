// (c) https://github.com/MontiCore/monticore
package appointments;

/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import appointments._ast.ASTAppointment;
import appointments._parser.AppointmentsParser;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.util.Optional;

/**
 * Main class for the Appointments DSL tool.
 *
 * @author (last commit) $Author$
 */
public class AppointmentsTool {
  
  /**
   * Use the single argument for specifying the single input appointments file.
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
    final ASTAppointment ast = parse(model);
    Log.info(model + " parsed successfully!", AppointmentsTool.class.getName());
    
  }
  
  /**
   * Parse the model contained in the specified file.
   *
   * @param model - file to parse
   * @return
   */
  public static ASTAppointment parse(String model) {
    try {
      AppointmentsParser parser = new AppointmentsParser() ;
      Optional<ASTAppointment> appointment = parser.parse(model);
      
      if (!parser.hasErrors() && appointment.isPresent()) {
        return appointment.get();
      }
      Log.error("Model could not be parsed.");
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
    return null;
  }
}
