// (c) https://github.com/MontiCore/monticore
package guitartab._ast;

import guitartab.utils.IndexRange;
import guitartab.utils.LineUtils;
import guitartab.utils.Notes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A full tab containing all six strings of the guitar and, optionally, length information
 *
 * @author (last commit) kirchhof
 * @version 1.0, 20.03.19
 * @since 1.0
 */
public class ASTSixStrings extends ASTSixStringsTOP {
  protected ASTSixStrings() {
    // empty body
  }

  protected ASTSixStrings(
      java.util.List<guitartab._ast.ASTGuitarString> guitarStrings,
      java.util.List<String> linebreaks,
      Optional<ASTLengthLine> lengthLine
  ) {
    setGuitarStringList(guitarStrings);
    setLinebreakList(linebreaks);
    if (lengthLine.isPresent()) {
      setLengthLine(lengthLine.get());
    } else {
      setLengthLineAbsent();
    }

  }

  /**
   * Get start / end index of the notes at the given index across all guitar strings
   *
   * @param index an index one of the digits of the note
   * @return start / end index of the notes at the given index across all guitar strings, Optional.empty if no notes found
   */
  public Optional<IndexRange> getRangeOfNotesAt(int index) {
    List<Optional<IndexRange>> foundRanges = new ArrayList<>();
    for (ASTGuitarString string : getGuitarStringList()) {
      foundRanges.add(LineUtils.getRangeOfNumberAtIndex(index, string.getContentList()));
    }

    List<Integer> startIndices = foundRanges.stream()
        .filter(Optional::isPresent)
        .map(x -> x.get().getStart())
        .collect(Collectors.toList());

    List<Integer> endIndices = foundRanges.stream()
        .filter(Optional::isPresent)
        .map(x -> x.get().getStop())
        .collect(Collectors.toList());

    if (startIndices.isEmpty()) {
      //No ranges found
      return Optional.empty();
    }

    IndexRange result = new IndexRange(
        startIndices.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new),
        endIndices.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new)
    );

    return Optional.of(result);
  }

  /**
   * Return an ordered list of all notes (including their length) that should be played at the
   * same time
   *
   * @return a ordered list of notes that should be played together
   */
  public List<Notes> getAllNotes() {
    int lineLength = getGuitarStringList().get(0).getContentList().size();
    List<Notes> allNotes = new ArrayList<>();

    for (int i = 0; i < lineLength; i++) {
      Optional<IndexRange> currentRange = getRangeOfNotesAt(i);
      Notes currentChord = new Notes();
      if (currentRange.isPresent()) {
        for (int j = 0; j < getGuitarStringList().size(); j++) {
          currentChord.getFrets().add(
              getGuitarStringList().get(j).getFretInRange(currentRange.get())
          );
        }
        if (!isPresentLengthLine()) {
          currentChord.setLength(Optional.empty());
        } else if (getLengthLine().getLengthInRange(currentRange.get()).isPresent()) {
          currentChord.setLength(getLengthLine().getLengthInRange(currentRange.get()));
        }
        allNotes.add(currentChord);
        // Skip the rest of the range
        i = currentRange.get().getStop();
      }
    }

    return allNotes;
  }

}
