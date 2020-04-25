// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrivalBeforeDepartureCoCo implements TravelCostsASTTravelExpenseReportCoCo {
  
  protected static String message = "Departure starts before Arrival is completed";
  
  @Override public void check(ASTTravelExpenseReport node) {
      Log.error(message);
  }
  
  
  
}
