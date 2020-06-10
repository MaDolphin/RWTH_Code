/* (c) https://github.com/MontiCore/monticore */
package automata.visitors;

import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link CountStates}.
 *
 * @author Robert Heim
 */
public class CountStatesTest extends AbstractTest {
  
  @Test
  public void test() {
    ASTAutomaton automaton = parseModel("src/test/resources/automata/visitors/valid/A.aut");
    CountStates cs = new CountStates();
    cs.handle(automaton);
    assertEquals(3, cs.getCount());
  }
}
