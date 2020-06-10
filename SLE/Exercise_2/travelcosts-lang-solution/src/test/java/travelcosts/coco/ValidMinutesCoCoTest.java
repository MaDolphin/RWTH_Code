// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._cocos.TravelCostsCoCoChecker;
import travelcosts._parser.TravelCostsParser;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidMinutesCoCoTest extends AbstractCoCoTest {
  
  protected static String basedir ="src/test/resources/";
  
  @BeforeClass
  public static void disableFailQuick(){
    LogStub.init();
  }
  
  @After
  public void clearLog(){
    Log.getFindings().clear();
  }
  
  
  @Test
  public void testMinutes() throws IOException {
    checkInvalid(basedir + "invalid/ValidMinutes.tc");
  }
  
  
  private void checkInvalid(String s) throws IOException {
    parseAndRunCoCos(s);
    assertEquals(1,Log.getFindings().size());
    assertEquals(ValidMinutesCoCo.message,Log.getFindings().get(0).getMsg());
  }
  
}