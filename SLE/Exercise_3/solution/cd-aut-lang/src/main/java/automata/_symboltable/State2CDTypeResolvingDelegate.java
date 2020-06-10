package automata._symboltable;

import classdiagrams._symboltable.CDTypeSymbol;
import classdiagrams._symboltable.ClassDiagramsGlobalScope;
import de.monticore.symboltable.modifiers.AccessModifier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Exercise 5.3a
public class State2CDTypeResolvingDelegate implements IStateSymbolResolvingDelegate {

  // Exercise 5.3b
  protected ClassDiagramsGlobalScope cdGlobalScope;

  public State2CDTypeResolvingDelegate(ClassDiagramsGlobalScope cdGlobalScope) {
    this.cdGlobalScope = cdGlobalScope;
  }

  // Exercise 5.3c
  @Override
  public List<StateSymbol> resolveAdaptedStateSymbol(boolean foundSymbols, String name,
                                                     AccessModifier modifier, Predicate<StateSymbol> predicate) {
    // used for finding all CDTypeSymbols with the given name
    List<CDTypeSymbol> cdTypeSymbolList = cdGlobalScope.resolveCDTypeMany(name, modifier);
    List<StateSymbol> stateSymbolList = new ArrayList<>();
    // implementation of the adaptation: create StateSymbols from the found CDTypeSymbols
    // only public CDTypeSymbols should be adapted to a StateSymbol
    for (CDTypeSymbol typeSymbol : cdTypeSymbolList) {
      if(typeSymbol.isIsPublic()){
        stateSymbolList.add(AutomataSymTabMill.stateSymbolBuilder()
            .setName(typeSymbol.getName())
            .build());
      }
    }
    return stateSymbolList;
  }
}
