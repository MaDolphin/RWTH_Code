// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import guitartab._ast.ASTSixStrings;
import guitartab.utils.Notes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;

/**
 * Each note should have one length information (if the tab uses length information)
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class OneLengthPerNoteTest extends AbstractCocoTest{
  private static final String MODEL_ROOT = "src/test/resources/";

  @Override public CocoTestInput prepareTest(String pathToModelFile) {
    CocoTestInput result = super.prepareTest(pathToModelFile);
    OneLengthPerNote systemUnderTest = new OneLengthPerNote();
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

  @CsvSource({ "InvalidModels/LengthMissing.tab" })
  @ParameterizedTest void shouldFailForInvalidModel(String inputModel) {
    //given
    CocoTestInput input = prepareTest(MODEL_ROOT + inputModel);

    //when
    executeCoCo(input);

    //then
    checkResults(OneLengthPerNote.THERE_ARE_NOTES_WITHOUT_LENGTH);
  }
}
