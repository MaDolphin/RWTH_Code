package calendars;

import calendarswithappointments._ast.ASTCalendarsWithAppointments;
import calendarswithappointments._parser.CalendarsWithAppointmentsParser;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
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
public class CalendarsParserTest {
    @BeforeClass
    public static void disableFailQuick(){
        Log.enableFailQuick(false);
    }

    @Nested class Parse {

        @ParameterizedTest
        @CsvSource({"src/main/resources/calendar/Peter.cal","src/main/resources/calendar/Tina.cal"})
        void shouldParseValidModel(String modelFilePath) throws IOException {
            //given
            CalendarsWithAppointmentsParser p = new CalendarsWithAppointmentsParser();
            Optional<ASTCalendarsWithAppointments> parse = p.parseCalendarsWithAppointments(modelFilePath);
            assertNotNull(parse);

            //when
            //TODO: write me


            //then
            //TODO: write me
        }

    }

}
