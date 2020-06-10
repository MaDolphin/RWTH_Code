// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._cocos.TravelCostsCoCoChecker;
import travelcosts._parser.TravelCostsParser;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

abstract public class AbstractCoCoTest {
  
  protected void parseAndRunCoCos(String s) throws IOException {
    Optional<ASTTravelExpenseReport> tc = new TravelCostsParser().parse(s);
    assertTrue(tc.isPresent());
    TravelCostsCoCoChecker checker = TravelCostsCoCos.getCheckerForAllCoCos();
    checker.checkAll(tc.get());
  }
}
