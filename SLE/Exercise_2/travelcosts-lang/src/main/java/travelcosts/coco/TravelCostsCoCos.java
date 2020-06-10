// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import travelcosts._cocos.TravelCostsCoCoChecker;

public class TravelCostsCoCos {
  
  public static TravelCostsCoCoChecker getCheckerForAllCoCos() {
    final TravelCostsCoCoChecker checker = new TravelCostsCoCoChecker();
    checker.addCoCo(new ArrivalBeforeDepartureCoCo());
    return checker;
  }
  
}
