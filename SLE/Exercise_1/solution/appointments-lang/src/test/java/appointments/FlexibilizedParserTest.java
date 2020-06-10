// (c) https://github.com/MontiCore/monticore
package appointments;
/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import appointmentsflexibilized._ast.ASTAppointment;
import appointmentsflexibilized._parser.AppointmentsFlexibilizedParser;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO: Write me!
 *
 * @author (last commit) $Author$
 */
public class FlexibilizedParserTest {
  @BeforeClass
  public static void disableFailQuick(){
    Log.enableFailQuick(false);
  }


  @Nested class Parse {

    @ParameterizedTest
    @CsvSource({ "src/main/resources/example/Example1.ap",
        "src/main/resources/example/Example2.ap",
        "src/main/resources/example/Example3.ap",
        "src/main/resources/example/Example4.ap",
        "src/main/resources/flexibilized/Example5.ap" })
    void shouldParseValidModel(String modelFilePath) throws IOException {
      //given
      AppointmentsFlexibilizedParser p = new AppointmentsFlexibilizedParser();

      //when
      Optional<ASTAppointment> result = p.parse(modelFilePath);

      //then
      assertThat(result).isPresent();
    }
  }
}
