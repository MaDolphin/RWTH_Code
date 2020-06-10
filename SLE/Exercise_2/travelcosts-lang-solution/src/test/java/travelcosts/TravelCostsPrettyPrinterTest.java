// (c) https://github.com/MontiCore/monticore
package travelcosts;

import de.monticore.prettyprint.IndentPrinter;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.Test;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._parser.TravelCostsParser;
import travelcosts.prettyprint.TravelCostPrettyPrinter;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TravelCostsPrettyPrinterTest {
  protected static String basedir ="src/test/resources/example/";
  
  @BeforeClass
  public static void disableFailQuick(){
    Log.enableFailQuick(false);
  }
  
  @Test
  public void test1() throws IOException {
    check(basedir + "Example1.tc");
  }
  
  @Test
  public void test2() throws IOException {
    check(basedir + "Example2.tc");
  }
  
  @Test
  public void test3() throws IOException {
    check(basedir + "Example3.tc");
  }
  
  @Test
  public void test4() throws IOException {
    check(basedir + "Example4.tc");
  }
  
  private void check(String s) throws IOException {
    TravelCostsParser p = new TravelCostsParser();
    Optional<ASTTravelExpenseReport> tc = p.parse(s);
    assertTrue(tc.isPresent());
    TravelCostPrettyPrinter pp = new TravelCostPrettyPrinter(new IndentPrinter());
    String printed = pp.prettyprint(tc.get());
    Log.info(printed, this.getClass().getName());
    Optional<ASTTravelExpenseReport> parsed = p.parse_String(printed);
    assertTrue("Printed model " + s + " could not be parsed" , parsed.isPresent());
    assertTrue("Printed and parsed model " + s + " is not identical to parsed original model", tc.get().deepEquals(parsed.get()));
  }
  
}
