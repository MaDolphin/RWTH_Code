// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import de.se_rwth.commons.logging.Log;
import guitartab._ast.ASTGuitarString;
import guitartab._ast.ASTSixStrings;
import guitartab._cocos.GuitarTabASTGuitarStringCoCo;
import guitartab._cocos.GuitarTabASTSixStringsCoCo;
import org.assertj.core.util.VisibleForTesting;

import java.util.Optional;

/**
 * Guitars do not have an unlimited number of frets.
 * According toWikipedia, guitars have at most 24 frets [1].
 *
 * [1] https://en.wikipedia.org/wiki/Guitar#Frets
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class FretLimit implements GuitarTabASTGuitarStringCoCo {

  /** Maximum allowed fret */
  private static final int MAX_FRET = 24;

  @VisibleForTesting
  public static final String FRET_TOO_HIGH =
      "0xY0100 No fret may be higher than " + MAX_FRET;

  @Override public void check(ASTGuitarString node) {
    //given

    //when
    boolean fretOutOfBounds = false;
    for (int i = 0; i < node.getContentList().size(); i++) {
      Optional<Integer> currentFret = node.getFret(i);
      if (currentFret.isPresent()) {
        fretOutOfBounds |= currentFret.get() > MAX_FRET;
      }
    }

    //then
    if (fretOutOfBounds) {
      Log.error(FRET_TOO_HIGH);
    }
  }
}
