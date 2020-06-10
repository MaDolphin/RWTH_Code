/* (c) https://github.com/MontiCore/monticore */
package automata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * TODO: Write me!
 *
 * @author (last commit) $Author$
 */
public class AutomatonToolTest {
  
  @Test
  public void executeMain() {
    AutomataTool.main(new String[] { "src/main/resources/example/PingPong.aut" });
    
    assertTrue(!false);
  }
  
}
