// (c) https://github.com/MontiCore/monticore
package guitartab._ast;

import guitartab.utils.IndexRange;
import guitartab.utils.LineUtils;

import java.util.Optional;

/**
 * a single line in the tab intended to show lengths of notes
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class ASTLengthLine extends ASTLengthLineTOP {

  protected  ASTLengthLine () {
    // empty body
  }

  protected  ASTLengthLine (java.util.List<String> contents) {
    setContentList(contents);
  }

  /**
   * Returns the length at the given index as integer.
   * @param index the index at which to search for a length
   * @return length at the given position
   */
  public Optional<Integer> getLength(int index) {
    return LineUtils.getNumber(index, getContentList());
  }

  /**
   * Returns the first length information found within the given range
   * @param start index at which to start searching
   * @param end index at which to stop searching
   * @return the first length information found within the given range, Optional.empty if none found
   */
  public Optional<Integer> getLengthInRange(int start, int end) {
    return LineUtils.getNumber(new IndexRange(start, end), getContentList());
  }

  public Optional<Integer> getLengthInRange(IndexRange range) {
    return getLengthInRange(range.getStart(), range.getStop());
  }
}
