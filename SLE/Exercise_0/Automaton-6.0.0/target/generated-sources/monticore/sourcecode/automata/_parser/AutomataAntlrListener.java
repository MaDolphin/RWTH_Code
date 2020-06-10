// Generated from /Users/hhk/Downloads/Automaton-6.0.0/target/generated-sources/monticore/sourcecode/automata/_parser/AutomataAntlr.g4 by ANTLR 4.7.1

package automata._parser;
import de.monticore.antlr4.MCParser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutomataAntlrParser}.
 */
public interface AutomataAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#automaton_eof}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton_eof(AutomataAntlrParser.Automaton_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#automaton_eof}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton_eof(AutomataAntlrParser.Automaton_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#automaton}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton(AutomataAntlrParser.AutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#automaton}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton(AutomataAntlrParser.AutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#state_eof}.
	 * @param ctx the parse tree
	 */
	void enterState_eof(AutomataAntlrParser.State_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#state_eof}.
	 * @param ctx the parse tree
	 */
	void exitState_eof(AutomataAntlrParser.State_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(AutomataAntlrParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(AutomataAntlrParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#transition_eof}.
	 * @param ctx the parse tree
	 */
	void enterTransition_eof(AutomataAntlrParser.Transition_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#transition_eof}.
	 * @param ctx the parse tree
	 */
	void exitTransition_eof(AutomataAntlrParser.Transition_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomataAntlrParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(AutomataAntlrParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomataAntlrParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(AutomataAntlrParser.TransitionContext ctx);
}