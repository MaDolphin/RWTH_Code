// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.ASTTime;
import travelcosts._cocos.TravelCostsASTTimeCoCo;

public class ValidMinutesCoCo implements TravelCostsASTTimeCoCo {
  
  protected static String message = "Minutes are not allowed to be greater 59";
  
  @Override
  public void check(ASTTime node) {
    if(node.isPresentMinutes()){
      if(node.getMinutes().getValue() > 59){
        Log.error(message);
      }
    }
  }
}
