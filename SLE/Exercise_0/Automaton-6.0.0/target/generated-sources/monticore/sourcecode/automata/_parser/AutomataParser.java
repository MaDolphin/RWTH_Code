/* generated by template parser.MCParser*/



package automata._parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import java.util.Optional;
import de.monticore.antlr4.MCConcreteParser;
import de.monticore.antlr4.MCErrorListener;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class AutomataParser extends MCConcreteParser {

  protected AutomataAntlrParser create(String filename) throws IOException {
    AutomataAntlrLexer lexer = new AutomataAntlrLexer(new  ANTLRFileStream(filename, StandardCharsets.UTF_8.name()));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AutomataAntlrParser parser = new AutomataAntlrParser(tokens);
    lexer.setMCParser(parser);  
    lexer.removeErrorListeners();
    lexer.addErrorListener(new MCErrorListener(parser));
    parser.setFilename(filename);
    setError(false);
    return parser;
  }
  
  protected AutomataAntlrParser create(Reader reader) throws IOException {
    AutomataAntlrLexer lexer = new AutomataAntlrLexer(new ANTLRInputStream(reader));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    AutomataAntlrParser parser = new AutomataAntlrParser(tokens);
    lexer.setMCParser(parser);  
    lexer.removeErrorListeners();
    lexer.addErrorListener(new MCErrorListener(parser));
    parser.setFilename("StringReader");
    setError(false);
    return parser;
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.lang.String)
   */
  @Override
  public Optional<automata._ast.ASTAutomaton> parse(String fileName) throws IOException {
    return parseAutomaton(fileName);
  }
  
  /**
   * @see de.monticore.antlr4.MCConcreteParser#parse(java.io.Reader)
   */
  @Override
  public Optional<automata._ast.ASTAutomaton> parse(Reader reader) throws IOException {
    return parseAutomaton(reader);
  }
  
  public Optional<automata._ast.ASTAutomaton> parse_String(String str) throws IOException {
    return parse_StringAutomaton(str);
  }
 
    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<automata._ast.ASTAutomaton> parseAutomaton(String filename) throws IOException {   
    AutomataAntlrParser parser = create(filename);    
	automata._ast.ASTAutomaton ast;
    ast = parser.automaton_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTAutomaton> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<automata._ast.ASTAutomaton> parseAutomaton(Reader reader) throws IOException {
 	AutomataAntlrParser parser = create(reader);
	automata._ast.ASTAutomaton ast;
    ast = parser.automaton_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTAutomaton> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<automata._ast.ASTAutomaton> parse_StringAutomaton(String str) throws IOException {
    return parseAutomaton(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<automata._ast.ASTState> parseState(String filename) throws IOException {   
    AutomataAntlrParser parser = create(filename);    
	automata._ast.ASTState ast;
    ast = parser.state_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTState> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<automata._ast.ASTState> parseState(Reader reader) throws IOException {
 	AutomataAntlrParser parser = create(reader);
	automata._ast.ASTState ast;
    ast = parser.state_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTState> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<automata._ast.ASTState> parse_StringState(String str) throws IOException {
    return parseState(new StringReader(str));
  }
  

    /* generated by template parser.MCParserMethods*/


  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the file
   */
  public Optional<automata._ast.ASTTransition> parseTransition(String filename) throws IOException {   
    AutomataAntlrParser parser = create(filename);    
	automata._ast.ASTTransition ast;
    ast = parser.transition_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTTransition> empty();
    }
    return Optional.ofNullable(ast);
  }

  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the content of the reader
   * */
  public  Optional<automata._ast.ASTTransition> parseTransition(Reader reader) throws IOException {
 	AutomataAntlrParser parser = create(reader);
	automata._ast.ASTTransition ast;
    ast = parser.transition_eof().ret;
    if (parser.hasErrors()) {
      setError(true);
      return Optional.<automata._ast.ASTTransition> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param str String to parse from
   * @return Resulting AST
   * @throws IOException if something went wrong parsing the string
   * */
  public  Optional<automata._ast.ASTTransition> parse_StringTransition(String str) throws IOException {
    return parseTransition(new StringReader(str));
  }
  


}