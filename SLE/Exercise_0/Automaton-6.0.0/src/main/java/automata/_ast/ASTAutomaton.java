package automata._ast;

import java.util.ArrayList;
import java.util.List;

public class ASTAutomaton extends ASTAutomatonTOP {
	
	protected ASTAutomaton() {
		super();
	}
	
	public List<String> getStateNames(){
		List<ASTState> states =  this.states;
		List<String> names = new ArrayList<String>();
		for(ASTState s : states) {
			names.add(s.getName());
		}
		return names;
	}
}