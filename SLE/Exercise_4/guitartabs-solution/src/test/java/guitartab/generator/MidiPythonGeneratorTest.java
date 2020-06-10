// (c) https://github.com/MontiCore/monticore
package guitartab.generator;

import guitartab.AbstractTest;
import guitartab._ast.ASTTab;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author kirchhof
 */
class MidiPythonGeneratorTest extends AbstractTest {
  @CsvSource({
      "src/test/resources/ValidInputWithLengths.tab, src/test/resources/ExpectedGenerator.py" })
  @ParameterizedTest void shouldAcceptValidModel(String inputModel, String expectedPath) {
    // given
    ASTTab ast = parseModel(inputModel);
    Path expectedPythonFile = Paths.get(expectedPath);

    //when
    Path pythonFile = MidiPythonGenerator.generate(ast);

    //then
    assertThat(pythonFile).exists();
    assertThat(pythonFile).hasSameContentAs(expectedPythonFile);
  }
}