// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.util.Collections.*;

/**
 * TODO
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
class AllLinesHaveTheSameLengthTest extends AbstractCocoTest {

  private static final String MODEL_ROOT = "src/test/resources/";

  @Override public CocoTestInput prepareTest(String pathToModelFile) {
    CocoTestInput result = super.prepareTest(pathToModelFile);
    AllLinesHaveTheSameLength systemUnderTest = new AllLinesHaveTheSameLength();
    result.getChecker().addCoCo(systemUnderTest);
    return result;
  }

  @CsvSource({ "ValidInputWithoutLengths.tab",
      "ValidInputWithLengths.tab"})
  @ParameterizedTest void shouldAcceptValidModel(String inputModel) {
    //given
    CocoTestInput input = prepareTest(MODEL_ROOT + inputModel);

    //when
    executeCoCo(input);

    //then
    checkResults(EMPTY_LIST);
  }

  @CsvSource({ "InvalidModels/LinesHaveDifferentLengths.tab",
      "InvalidModels/LengthLineHasDifferentLength.tab"})
  @ParameterizedTest void shouldFailForInvalidModel(String inputModel) {
    //given
    CocoTestInput input = prepareTest(MODEL_ROOT + inputModel);

    //when
    executeCoCo(input);

    //then
    checkResults(AllLinesHaveTheSameLength.LINES_HAVE_DIFFERENT_LENGTHS);
  }
}
