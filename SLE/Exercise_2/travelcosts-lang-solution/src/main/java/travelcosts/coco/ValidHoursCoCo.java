// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.ASTTime;
import travelcosts._cocos.TravelCostsASTTimeCoCo;

public class ValidHoursCoCo implements TravelCostsASTTimeCoCo {
  
  protected static String message = "Hours are not allowed to be greater 23";
  
  @Override
  public void check(ASTTime node) {
    if(node.getHours().getValue() > 23){
      Log.error(message);
    }
  }
}
