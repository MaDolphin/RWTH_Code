package classdiagrams._symboltable;


import com.google.common.collect.ImmutableSet;
import de.se_rwth.commons.Names;

import java.util.Collections;
import java.util.Set;

// Exercise 5.1a
public class ClassDiagramsLanguage extends ClassDiagramsLanguageTOP {
  public ClassDiagramsLanguage() {
    super("CD4Analysis Language", "cd");
  }

  @Override
  protected ClassDiagramsModelLoader provideModelLoader() {
    return new ClassDiagramsModelLoader(this);
  }

  // Exercise 5.2b
  @Override
  protected Set<String> calculateModelNamesForCDType(String name) {
    // e.g., if p.CD.Clazz, return p.CD
    if (!Names.getQualifier(name).isEmpty()) {
      return ImmutableSet.of(Names.getQualifier(name));
    }
    return Collections.emptySet();
  }
}
