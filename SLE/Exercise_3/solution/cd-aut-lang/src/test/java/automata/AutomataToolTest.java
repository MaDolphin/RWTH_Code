package automata;

import de.se_rwth.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Exercise 5.4c
public class AutomataToolTest {

  @Before
  public void disableFailQuick() {
    Log.enableFailQuick(false);
    Log.getFindings().clear();
  }

  /**
   * All States are actually CDTypes
   */
  @Test
  public void testValidCoCo() {
    AutomataTool.main(new String[]{"src/test/resources/PingPongAut.aut"});

    assertEquals(0, Log.getErrorCount());
  }

  /**
   * no State or CDType is defined with the name 'C'
   */
  @Test
  public void testInValidCoCo() {
    AutomataTool.main(new String[]{"src/test/resources/InvalidAut.aut"});

    assertEquals(1, Log.getErrorCount());
    assertEquals("0xAut01 The transition 'A - ac > C' references the state 'C' which does not exist.",
        Log.getFindings().get(0).getMsg());
  }

  /**
   * some States are defined as actual States, some are defined as CDTypes
   * but non is defined for the name 'Break'
   */
  @Test
  public void testFootballGameCoCo() {
    AutomataTool.main(new String[]{"src/test/resources/FootballGameAut.aut"});

    assertEquals(3, Log.getErrorCount());
    assertEquals("0xAut01 The transition 'Play - breakWistle > Break' references the state 'Break' which does not exist.",
        Log.getFindings().get(1).getMsg());
    assertEquals("0xAut01 The transition 'Extension - breakWistle > Break' references the state 'Break' which does not exist.",
        Log.getFindings().get(2).getMsg());
  }
}
