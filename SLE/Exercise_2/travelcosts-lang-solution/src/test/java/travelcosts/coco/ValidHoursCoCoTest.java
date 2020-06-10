// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidHoursCoCoTest extends AbstractCoCoTest {
  
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
  public void testHours() throws IOException {
    checkInvalid(basedir + "invalid/ValidHours.tc");
  }
  
  
  private void checkInvalid(String s) throws IOException {
    parseAndRunCoCos(s);
    assertEquals(1,Log.getFindings().size());
    assertEquals(ValidHoursCoCo.message,Log.getFindings().get(0).getMsg());
  }
  
}