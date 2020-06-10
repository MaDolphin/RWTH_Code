package automata;

import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrintStatesTest extends AbstractTest {

    @Test
    public void testPrintPingPongStates() {
        // given
        ASTAutomaton a = parseModel("src/test/resources/automata/parser/PingPong.aut");
        assertNotNull(a);

        // when
        List<String> stateNames = a.getStateNames();

        // then
        assertNotNull(stateNames);
        assertEquals(3, stateNames.size());
        assertTrue(stateNames.contains("NoGame"));
        assertTrue(stateNames.contains("Ping"));
        assertTrue(stateNames.contains("Pong"));
    }
}
