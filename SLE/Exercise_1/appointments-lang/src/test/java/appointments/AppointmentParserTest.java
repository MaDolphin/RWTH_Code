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
import org.junit.BeforeClass;

import org.junit.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;

/**
 * TODO: Write me!
 *
 * @author (last commit) $Author$
 */
public class AppointmentParserTest {
  @BeforeClass
  public static void disableFailQuick(){
    Log.enableFailQuick(false);
  }

  @Nested class Parse {

    @ParameterizedTest
    @CsvSource({"src/main/resources/example/Example1.ap","src/main/resources/example/Example2.ap","src/main/resources/example/Example3.ap","src/main/resources/example/Example4.ap"})
    void shouldParseValidModel(String modelFilePath) throws IOException {
      //given
      AppointmentsParser p = new AppointmentsParser();
      Optional<ASTAppointment> parse = p.parse(modelFilePath);
      assertNotNull(parse);

      //when
      //TODO: write me


      //then
      //TODO: write me
    }

  }
  
}
