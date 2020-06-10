// (c) https://github.com/MontiCore/monticore
package travelcosts;
/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.Test;
import travelcosts._ast.ASTTravelExpenseReport;
import travelcosts._parser.TravelCostsParser;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * TODO: Write me!
 *
 * @author (last commit) $Author$
 */
public class TravelCostsParserTest {
  
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
  
  private void check(String s) throws IOException {
    TravelCostsParser p = new TravelCostsParser();
    Optional<ASTTravelExpenseReport> tc = p.parse(s);
    assertTrue(tc.isPresent());
  }
  
}
