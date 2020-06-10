// (c) https://github.com/MontiCore/monticore
package appointments;
/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */


import calendars._ast.ASTCalendar;
import calendarswithappointments._parser.CalendarsWithAppointmentsParser;
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
public class CalendarsParserTest {
  @BeforeClass
  public static void disableFailQuick(){
    Log.enableFailQuick(false);
  }

  @Nested class Parse {

    @ParameterizedTest
    @CsvSource({ "src/main/resources/calendar/Peter.cal",
        "src/main/resources/calendar/Tina.cal" })
    void shouldParseValidModel(String modelFilePath) throws IOException {
      //given
      CalendarsWithAppointmentsParser p = new CalendarsWithAppointmentsParser();

      //when
      Optional<ASTCalendar> result = p.parse(modelFilePath);

      //then
      assertThat(result).isPresent();
    }

  }
}
