package automata;
// (c) https://github.com/MontiCore/monticore

import automata._ast.ASTAutomaton;
import automata._parser.AutomataParser;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class AutomataParserTest {

  @BeforeClass
  public static void disableFailQuick() {
    Log.enableFailQuick(false);
  }


  @ParameterizedTest
  @CsvSource({ "src/test/resources/PingPongAut.aut",
      "src/test/resources/InvalidAut.aut",
      "src/test/resources/FootballGameAut.aut"})
  public void testParsePingPongAut(String modelFilePath) throws IOException {
    AutomataParser parser = new AutomataParser();
    Optional<ASTAutomaton> result = parser.parse(modelFilePath);
    assertThat(result).isPresent();
  }

}
