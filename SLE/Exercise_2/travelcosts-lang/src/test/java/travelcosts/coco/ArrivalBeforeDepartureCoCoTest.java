// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._cocos.TravelCostsCoCoChecker;
import travelcosts._parser.TravelCostsParser;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.*;


public class ArrivalBeforeDepartureCoCoTest extends AbstractCoCoTest {
  
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
  public void testTime() throws IOException {
    checkInvalid(basedir+ "invalid/DBATime.tc");
  }
  
  @Test
  public void testTime2() throws IOException {
    checkInvalid(basedir+ "invalid/DBATime2.tc");
  }
  
  @Test
  public void testDay() throws IOException {
    checkInvalid(basedir+ "invalid/DBADay.tc");
  }
  
  @Test
  public void testDay2() throws IOException {
    checkInvalid(basedir + "invalid/DBADay2.tc");
  }
  
  @Test
  public void testYear() throws IOException {
    checkInvalid(basedir + "invalid/DBAYear.tc");
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
    assertEquals(ArrivalBeforeDepartureCoCo.message,Log.getFindings().get(0).getMsg());
  }
  
  private void checkValid(String s) throws IOException {
    parseAndRunCoCos(s);
    assertTrue("The model "+ s + " produced the following errors:" + Log.getFindings().toString(), Log.getFindings().isEmpty());
  }

}