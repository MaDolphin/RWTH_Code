package automata._ast;

import java.util.List;
import java.util.stream.Collectors;

public class ASTAutomaton extends ASTAutomatonTOP {

    // Exercise 0.2d
    public List<String> getStateNames() {
        return streamStates().map(ASTState::getName).collect(Collectors.toList());
    }
}
