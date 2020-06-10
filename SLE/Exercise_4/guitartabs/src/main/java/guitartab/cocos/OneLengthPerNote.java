// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import de.se_rwth.commons.logging.Log;
import guitartab._ast.ASTGuitarString;
import guitartab._ast.ASTSixStrings;
import guitartab.utils.IndexRange;
import guitartab._cocos.GuitarTabASTSixStringsCoCo;
import org.assertj.core.util.VisibleForTesting;

import java.util.Optional;

/**
 * If a length line is used, then every note must have a length
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class OneLengthPerNote implements GuitarTabASTSixStringsCoCo {

  @VisibleForTesting
  public static final String THERE_ARE_NOTES_WITHOUT_LENGTH =
      "0xY0300 Each note must have a length";

  @Override public void check(ASTSixStrings node) {
    //Exclude tabs without length information
    if (!node.isPresentLengthLine()) {
      return;
    }

    //given

    //when
    boolean lengthMissing = false;
    for (ASTGuitarString guitarString : node.getGuitarStringList()) {
      for (int i = 0; i < guitarString.getContentList().size(); i++) {
        Optional<Integer> currentFret = guitarString.getFret(i);
        if (currentFret.isPresent()) {
          IndexRange range = node.getRangeOfNotesAt(i).get();
          lengthMissing |= !node.getLengthLine().getLengthInRange(range).isPresent();
        }
      }
    }

    //then
    if (lengthMissing) {
      Log.error(THERE_ARE_NOTES_WITHOUT_LENGTH);
    }
  }
}
