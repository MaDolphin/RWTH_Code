// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MinutesValidCoCoTest extends AbstractCoCoTest {
  
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
    checkInvalid(basedir+ "invalid/InvalidMinutes.tc");
  }

  @Test
  public void test1() throws IOException {
    checkValid(basedir + "example/Example1.tc");
  }

  @Test
  public void test2() throws IOException {
    checkValid(basedir + "example/Example2.tc");
  }

  @Test
  public void test3() throws IOException {
    checkValid(basedir + "example/Example3.tc");
  }
  
  private void checkInvalid(String s) throws IOException {
    parseAndRunCoCos(s);
    assertEquals(1,Log.getFindings().size());
    assertEquals(MinutesValidCoCo.message,Log.getFindings().get(0).getMsg());
  }
  
  private void checkValid(String s) throws IOException {
    parseAndRunCoCos(s);
    assertTrue("The model "+ s + " produced the following errors:" + Log.getFindings().toString(), Log.getFindings().isEmpty());
  }

}