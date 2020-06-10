package automata;

import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ParseTrafficLightTest extends AbstractTest {

    @Test
    public void testParseTrafficLight() {
        ASTAutomaton a = parseModel("src/main/resources/example/TrafficLight.aut");
        assertNotNull(a);
    }
}
