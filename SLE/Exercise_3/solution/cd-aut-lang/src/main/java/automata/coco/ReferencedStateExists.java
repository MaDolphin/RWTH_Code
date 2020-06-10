package automata.coco;

import automata._ast.ASTTransition;
import automata._cocos.AutomataASTTransitionCoCo;
import de.se_rwth.commons.logging.Log;

// Exercise 5.4a
public class ReferencedStateExists implements AutomataASTTransitionCoCo {

  public static final String ERROR_CODE = "0xAut01";

  public static final String ERROR_MSG_FORMAT = " The transition '%s - %s > %s' references the state '%s' which does not exist.";

  // Exercise 5.4b
  @Override
  public void check(ASTTransition node) {
    // resolve for State in enclosingScope of the transition to check if the StateSymbol actually exists
    // this is done for the node.getFrom() and node.getTo() Name
    if (!node.getEnclosingScope().resolveState(node.getFrom()).isPresent()) {
      String errorString = String.format(ERROR_CODE + ERROR_MSG_FORMAT, node.getFrom(), node.getInput(), node.getTo(), node.getFrom());
      Log.error(errorString, node.get_SourcePositionStart());
    } else if (!node.getEnclosingScope().resolveState(node.getTo()).isPresent()) {
      String errorString = String.format(ERROR_CODE + ERROR_MSG_FORMAT, node.getFrom(), node.getInput(), node.getTo(), node.getTo());
      Log.error(errorString, node.get_SourcePositionStart());
    }
  }
}
