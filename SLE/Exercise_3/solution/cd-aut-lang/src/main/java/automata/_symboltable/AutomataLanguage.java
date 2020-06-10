package automata._symboltable;

import com.google.common.collect.ImmutableSet;
import de.monticore.utils.Names;

import java.util.Collections;
import java.util.Set;

// Exercise 5.1a
public class AutomataLanguage extends AutomataLanguageTOP{

  public AutomataLanguage() {
    super("AutomataLanguage Language", "aut");
  }

  @Override
  protected AutomataModelLoader provideModelLoader() {
    return new AutomataModelLoader(this);
  }

  // Exercise 5.2b
  @Override
  protected Set<String> calculateModelNamesForState(String name) {
    // e.g., if p.Automaton.State, return p.Automaton
    if (!Names.getQualifier(name).isEmpty()) {
      return ImmutableSet.of(Names.getQualifier(name));
    }

    return Collections.emptySet();
  }
}
