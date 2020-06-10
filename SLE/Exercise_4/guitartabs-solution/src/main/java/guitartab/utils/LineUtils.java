// (c) https://github.com/MontiCore/monticore
package guitartab.utils;

import java.util.List;
import java.util.Optional;

/**
 * Utils for working with lines in a tabulator
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class LineUtils {
  /**
   * Returns the number at the given index as integer.
   *
   * @param index      the index at which to search for a number
   * @param stringList list of digits and "-"
   * @return number at the given position
   */
  public static Optional<Integer> getNumber(int index, List<String> stringList) {

    // Check if there is any number
    if (stringList.get(index).equals("-")) {
      return Optional.empty();
    }

    Integer result = getNumberEndingAtIndex(findEndIndexOfNumber(index, stringList), stringList);

    return Optional.of(result);
  }

  /**
   * Returns the number at the given index range as integer.
   *
   * @param range      the index range at which to search for a number
   * @param stringList list of digits and "-"
   * @return number at the given position
   */
  public static Optional<Integer> getNumber(IndexRange range, List<String> stringList) {

    Optional<Integer> startIndex = getIndexOfFirstDigitWithinRange(range, stringList);
    if (!startIndex.isPresent()) {
      return Optional.empty();
    }
    Integer stopIndex = findEndIndexOfNumber(startIndex.get(), stringList);
    if (stopIndex > range.getStop()) {
      stopIndex = range.getStop();
    }

    return Optional.of(getNumberEndingAtIndex(stopIndex, stringList, startIndex.get()));
  }

  /**
   * Get the index of the first, i.e. lowest index, digit within the given range of the stringList
   *
   * @param range      a range of indices to search in
   * @param stringList a list of digits or "-"
   * @return the lowest index containing a digit, Optional.empty if none found
   */
  public static Optional<Integer> getIndexOfFirstDigitWithinRange(IndexRange range,
      List<String> stringList) {

    if (!stringList.get(range.getStart()).equals("-")) {
      return Optional.of(range.getStart());
    }

    if (range.getStart() == range.getStop()) {
      return Optional.empty();
    }

    IndexRange smallerRange = new IndexRange(range.getStart() + 1, range.getStop());
    return getIndexOfFirstDigitWithinRange(smallerRange, stringList);
  }

  /**
   * Finds the index at which a number ends (assuming it consists of multiple digits).
   * Caller has to guarantee there is actually a digit at the given index.
   *
   * @param index      an arbitrary index of digit of a number
   * @param stringList list of digits and "-"
   * @return the index of the last digit of the number
   */
  public static int findEndIndexOfNumber(int index, List<String> stringList) {
    if (index >= stringList.size()) {
      return stringList.size() - 1;
    }

    String contentAtIndex = stringList.get(index);
    if (!contentAtIndex.equals("-")) {
      return findEndIndexOfNumber(index + 1, stringList);
    }
    else {
      return index - 1;
    }
  }

  /**
   * Finds the index at which a number starts (assuming it consists of multiple digits).
   * Caller has to guarantee there is actually a digit at the given index.
   *
   * @param index      an arbitrary index of digit of a number
   * @param stringList list of digits and "-"
   * @return the index of the first digit of the number
   */
  public static int findStartIndexOfNumber(int index, List<String> stringList) {
    if (index <= 0) {
      return 0;
    }

    String contentAtIndex = stringList.get(index);
    if (!contentAtIndex.equals("-")) {
      return findStartIndexOfNumber(index - 1, stringList);
    }
    else {
      return index + 1;
    }
  }

  /**
   * Get the int representation of the fret ending at the given index
   *
   * @param index      the index of the last digit of the fret
   * @param stringList list of digits and "-"
   * @return int representation of the fret
   */
  public static int getNumberEndingAtIndex(int index, List<String> stringList) {
    if (stringList.get(index).equals("-")) {
      return 0;
    }
    return Integer.valueOf(stringList.get(index)) +
        10 * getNumberEndingAtIndex(index - 1, stringList);
  }

  /**
   * Get the int representation of the fret ending at the given index
   *
   * @param index      the index of the last digit of the fret
   * @param stringList list of digits and "-"
   * @param lowerBound index at which to stop searching for more digits
   * @return int representation of the fret
   */
  public static int getNumberEndingAtIndex(int index, List<String> stringList, int lowerBound) {
    if (stringList.get(index).equals("-")) {
      return 0;
    }
    if (index == lowerBound) {
      return Integer.valueOf(stringList.get(index));
    }
    return Integer.valueOf(stringList.get(index)) +
        10 * getNumberEndingAtIndex(index - 1, stringList, lowerBound);
  }

  /**
   * Get the range of indices of the number at the given index, i.e. the indices at which the number
   * at the given index starts / ends
   *
   * @param index      index of the number for which the range of indices is searched
   * @param stringList list of digits and "-"
   * @return start / end index of the number at the given index, Optional.empty if there is no digit at the given index
   */
  public static Optional<IndexRange> getRangeOfNumberAtIndex(int index, List<String> stringList) {
    if (stringList.get(index).equals("-")) {
      return Optional.empty();
    }

    IndexRange result = new IndexRange(
        findStartIndexOfNumber(index, stringList),
        findEndIndexOfNumber(index, stringList)
    );

    return Optional.of(result);
  }
}
