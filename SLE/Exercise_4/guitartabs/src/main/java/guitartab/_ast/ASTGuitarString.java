// (c) https://github.com/MontiCore/monticore
package guitartab._ast;

import guitartab.utils.IndexRange;
import guitartab.utils.LineUtils;

import java.util.Optional;

/**
 * A single tab line intended to show notes to play on a guitar
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class ASTGuitarString extends ASTGuitarStringTOP {

  protected  ASTGuitarString () {
    // empty body
  }

  protected  ASTGuitarString (java.util.List<String> contents) {
    setContentList(contents);
  }

  /**
   * Returns the fret at the given index as integer.
   * @param index the index at which to search for a fret
   * @return fret at the given position
   */
  public Optional<Integer> getFret(int index) {
    return LineUtils.getNumber(index, getContentList());
  }

  /**
   * Returns the first fret information found within the given range
   * @param start index at which to start searching
   * @param end index at which to stop searching
   * @return the first fret information found within the given range, Optional.empty if none found
   */
  public Optional<Integer> getFretInRange(int start, int end) {
    return LineUtils.getNumber(new IndexRange(start, end), getContentList());
  }

  public Optional<Integer> getFretInRange(IndexRange range) {
    return getFretInRange(range.getStart(), range.getStop());
  }

  /**
   * Returns the index range of the fret information at the given index
   * @param index index of one of the digits of the fret number
   * @return start / end index of the digits of the fret
   */
  public Optional<IndexRange> getRangeOfFret(int index) {
    return LineUtils.getRangeOfNumberAtIndex(index, getContentList());
  }
}
