// (c) https://github.com/MontiCore/monticore
package guitartab._parser;

import guitartab._ast.ASTSixStrings;
import guitartab._ast.ASTTab;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO
 *
 * @author (last commit) kirchhof
 * @version 1.0, 19.03.2019
 * @since 1.0
 */
public class GuitarTabParserTest {

  @Nested class Parse {
    @Test void shouldParseFile() throws IOException {
      //given
      GuitarTabParser parser = new GuitarTabParser();
      String pathToInput = "src/test/resources/ValidInputWithoutLengths.tab";

      //when
      Optional<ASTTab> result = parser.parse(pathToInput);

      //then
      assertThat(result).isPresent();
    }
  }
}
