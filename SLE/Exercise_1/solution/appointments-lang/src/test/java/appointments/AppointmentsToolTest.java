// (c) https://github.com/MontiCore/monticore
package appointments;
/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Nested;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO: Write me!
 *
 * @author (last commit) $Author$
 */
public class AppointmentsToolTest {
  @BeforeClass
  public static void disableFailQuick(){
    Log.enableFailQuick(false);
  }

  @Nested class Main {
    @ParameterizedTest
    @CsvSource({ "src/main/resources/example/Example1.ap"})
    void shouldNotLogErrorsForValidInput(String modelFilePath) {
      //given
      String[] parameters = new String[] {modelFilePath};

      //when
      AppointmentsTool.main(parameters);

      //then
      assertThat(Log.getFindings()).isEmpty();
    }
  }
}
