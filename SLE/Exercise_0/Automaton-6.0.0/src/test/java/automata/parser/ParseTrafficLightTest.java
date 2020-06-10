package automata.parser;

import automata._ast.ASTState;
import automata._parser.AutomataParser;
import automata._ast.ASTAutomaton;
import automata.lang.AbstractTest;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ParseTrafficLightTest extends AbstractTest {
	

  @Test
  public void testTrafficLight() {
	    ASTAutomaton a = parseModel("src/test/resources/automata/parser/TrafficLight.aut");
	    assertNotNull(a);
  }
	
}
