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

public class PrintStatesTest extends AbstractTest {
	

  @Test
  public void printTestState() {
	  ASTAutomaton a =  parseModel("src/test/resources/automata/parser/PingPong.aut");
	  List<String> names = a.getStateNames();
		  
	  assertEquals("NoGame",names.get(0));
	  assertEquals("Ping",names.get(1));
	  assertEquals("Pong",names.get(2));
		  
	  }
	
}