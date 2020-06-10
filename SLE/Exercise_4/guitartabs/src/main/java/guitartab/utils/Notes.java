// (c) https://github.com/MontiCore/monticore
package guitartab.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Notes that should be played together
 *
 * @author (last commit) kirchhof
 * @version 1.0, 22.03.2019
 * @since 1.0
 */
public class Notes {

  /**
   * Should contain 6 values. One for each string of the guitar. Ordered from high pitch to low
   * pitch (E-B-G-D-A-E)
   */
  private List<Optional<Integer>> frets = new ArrayList<>();

  /**
   * Length information given in "fraction of a bar"
   */
  private Optional<Integer> length = Optional.empty();

  /* ============================================================ */
  /* ====================== GENERATED CODE ====================== */
  /* ============================================================ */

  public List<Optional<Integer>> getFrets() {
    return frets;
  }

  public Optional<Integer> getLength() {
    return length;
  }

  public void setLength(Optional<Integer> length) {
    this.length = length;
  }
}
