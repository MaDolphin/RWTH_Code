// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import de.se_rwth.commons.logging.Log;
import guitartab._ast.ASTSixStrings;
import guitartab._ast.ASTGuitarString;
import guitartab._cocos.GuitarTabASTGuitarStringCoCo;
import guitartab._cocos.GuitarTabASTSixStringsCoCo;
import org.assertj.core.util.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Checks that all lines, i.e. strings, within a tab have the same length.
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class AllLinesHaveTheSameLength implements GuitarTabASTSixStringsCoCo {

  @VisibleForTesting
  public static final String LINES_HAVE_DIFFERENT_LENGTHS =
      "0xY0100 All lines within a tab must have the same length";

  @Override public void check(ASTSixStrings node) {
    //given
    List<String> firstLine = node.getGuitarString(0).getContentList();
    int lengthOfFirstLine = firstLine.size();

    //when / then
    for (ASTGuitarString string : node.getGuitarStringList()) {
      if (string.getContentList().size() != lengthOfFirstLine) {
        Log.error(LINES_HAVE_DIFFERENT_LENGTHS);
      }
    }

    if (node.isPresentLengthLine()) {
      if (node.getLengthLine().getContentList().size() != lengthOfFirstLine) {
        Log.error(LINES_HAVE_DIFFERENT_LENGTHS);
      }
    }
  }
}
