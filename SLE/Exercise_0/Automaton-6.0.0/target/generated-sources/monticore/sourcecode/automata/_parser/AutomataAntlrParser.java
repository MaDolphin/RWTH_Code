// Generated from /Users/hhk/Downloads/Automaton-6.0.0/target/generated-sources/monticore/sourcecode/automata/_parser/AutomataAntlr.g4 by ANTLR 4.7.1

package automata._parser;
import de.monticore.antlr4.MCParser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutomataAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LTLT=5, GTGT=6, LCURLY=7, SEMI=8, RCURLY=9, 
		MINUS=10, GT=11, Name=12, WS=13, SL_COMMENT=14, ML_COMMENT=15;
	public static final int
		RULE_automaton_eof = 0, RULE_automaton = 1, RULE_state_eof = 2, RULE_state = 3, 
		RULE_transition_eof = 4, RULE_transition = 5;
	public static final String[] ruleNames = {
		"automaton_eof", "automaton", "state_eof", "state", "transition_eof", 
		"transition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'aut'", "'state'", "'initial'", "'final'", "'<<'", "'>>'", "'{'", 
		"';'", "'}'", "'-'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LTLT", "GTGT", "LCURLY", "SEMI", "RCURLY", 
		"MINUS", "GT", "Name", "WS", "SL_COMMENT", "ML_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AutomataAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // convert function for Name
	private String convertName(Token t)  {
	    return t.getText();
	}

	  // convert function for NEWLINE
	private String convertNEWLINE(Token t)  {
	    return t.getText();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText();
	}

	  // convert function for SL_COMMENT
	private String convertSL_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for ML_COMMENT
	private String convertML_COMMENT(Token t)  {
	    return t.getText();
	}


	public AutomataAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Automaton_eofContext extends ParserRuleContext {
		public automata._ast.ASTAutomaton ret = null;
		public AutomatonContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public AutomatonContext automaton() {
			return getRuleContext(AutomatonContext.class,0);
		}
		public Automaton_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterAutomaton_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitAutomaton_eof(this);
		}
	}

	public final Automaton_eofContext automaton_eof() throws RecognitionException {
		Automaton_eofContext _localctx = new Automaton_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_automaton_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((Automaton_eofContext)_localctx).tmp = automaton();
			((Automaton_eofContext)_localctx).ret =  ((Automaton_eofContext)_localctx).tmp.ret;
			setState(14);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutomatonContext extends ParserRuleContext {
		public automata._ast.ASTAutomaton ret = null;
		public Token tmp0;
		public StateContext tmp1;
		public TransitionContext tmp2;
		public TerminalNode LCURLY() { return getToken(AutomataAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutomataAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(AutomataAntlrParser.Name, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public AutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitAutomaton(this);
		}
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_automaton);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		automata._ast.ASTAutomaton _aNode = null;
		_aNode=automata._ast.AutomataNodeFactory.createASTAutomaton();
		((AutomatonContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			{
			setState(17);
			((AutomatonContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((AutomatonContext)_localctx).tmp0));
			}
			setState(20);
			match(LCURLY);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==Name) {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(21);
					((AutomatonContext)_localctx).tmp1 = state();
					addToIteratedAttributeIfNotNull(_aNode.getStateList(), _localctx.tmp1.ret);
					}
					break;
				case Name:
					{
					setState(24);
					((AutomatonContext)_localctx).tmp2 = transition();
					addToIteratedAttributeIfNotNull(_aNode.getTransitionList(), _localctx.tmp2.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_eofContext extends ParserRuleContext {
		public automata._ast.ASTState ret = null;
		public StateContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public State_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterState_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitState_eof(this);
		}
	}

	public final State_eofContext state_eof() throws RecognitionException {
		State_eofContext _localctx = new State_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((State_eofContext)_localctx).tmp = state();
			((State_eofContext)_localctx).ret =  ((State_eofContext)_localctx).tmp.ret;
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public automata._ast.ASTState ret = null;
		public Token tmp0;
		public StateContext tmp1;
		public TerminalNode SEMI() { return getToken(AutomataAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(AutomataAntlrParser.Name, 0); }
		public TerminalNode LCURLY() { return getToken(AutomataAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutomataAntlrParser.RCURLY, 0); }
		public List<TerminalNode> LTLT() { return getTokens(AutomataAntlrParser.LTLT); }
		public TerminalNode LTLT(int i) {
			return getToken(AutomataAntlrParser.LTLT, i);
		}
		public List<TerminalNode> GTGT() { return getTokens(AutomataAntlrParser.GTGT); }
		public TerminalNode GTGT(int i) {
			return getToken(AutomataAntlrParser.GTGT, i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		automata._ast.ASTState _aNode = null;
		_aNode=automata._ast.AutomataNodeFactory.createASTState();
		((StateContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__1);
			{
			setState(39);
			((StateContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((StateContext)_localctx).tmp0));
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LTLT) {
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(42);
					match(LTLT);
					{
					setState(43);
					match(T__2);

					_aNode.setInitial(true);

					}
					setState(46);
					match(GTGT);
					}
					}
					break;
				case 2:
					{
					{
					setState(47);
					match(LTLT);
					{
					setState(48);
					match(T__3);

					_aNode.setFinal(true);

					}
					setState(51);
					match(GTGT);
					}
					}
					break;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				{
				setState(57);
				match(LCURLY);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(58);
					((StateContext)_localctx).tmp1 = state();
					addToIteratedAttributeIfNotNull(_aNode.getStateList(), _localctx.tmp1.ret);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RCURLY);
				}
				}
				break;
			case SEMI:
				{
				setState(67);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transition_eofContext extends ParserRuleContext {
		public automata._ast.ASTTransition ret = null;
		public TransitionContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public Transition_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterTransition_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitTransition_eof(this);
		}
	}

	public final Transition_eofContext transition_eof() throws RecognitionException {
		Transition_eofContext _localctx = new Transition_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transition_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((Transition_eofContext)_localctx).tmp = transition();
			((Transition_eofContext)_localctx).ret =  ((Transition_eofContext)_localctx).tmp.ret;
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public automata._ast.ASTTransition ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode MINUS() { return getToken(AutomataAntlrParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(AutomataAntlrParser.GT, 0); }
		public TerminalNode SEMI() { return getToken(AutomataAntlrParser.SEMI, 0); }
		public List<TerminalNode> Name() { return getTokens(AutomataAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(AutomataAntlrParser.Name, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transition);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		automata._ast.ASTTransition _aNode = null;
		_aNode=automata._ast.AutomataNodeFactory.createASTTransition();
		((TransitionContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			((TransitionContext)_localctx).tmp0 = match(Name);
			_aNode.setFrom(convertName(((TransitionContext)_localctx).tmp0));
			}
			setState(77);
			match(MINUS);
			{
			setState(78);
			((TransitionContext)_localctx).tmp1 = match(Name);
			_aNode.setInput(convertName(((TransitionContext)_localctx).tmp1));
			}
			setState(81);
			match(GT);
			{
			setState(82);
			((TransitionContext)_localctx).tmp2 = match(Name);
			_aNode.setTo(convertName(((TransitionContext)_localctx).tmp2));
			}
			setState(85);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\67\n"+
		"\5\f\5\16\5:\13\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\5\3\5\5\5"+
		"G\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2Y\2\16\3\2\2\2\4\22\3\2\2\2\6$\3\2\2\2"+
		"\b(\3\2\2\2\nH\3\2\2\2\fL\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\21\7"+
		"\2\2\3\21\3\3\2\2\2\22\23\7\3\2\2\23\24\7\16\2\2\24\25\b\3\1\2\25\26\3"+
		"\2\2\2\26\37\7\t\2\2\27\30\5\b\5\2\30\31\b\3\1\2\31\36\3\2\2\2\32\33\5"+
		"\f\7\2\33\34\b\3\1\2\34\36\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\13\2\2#\5\3"+
		"\2\2\2$%\5\b\5\2%&\b\4\1\2&\'\7\2\2\3\'\7\3\2\2\2()\7\4\2\2)*\7\16\2\2"+
		"*+\b\5\1\2+8\3\2\2\2,-\7\7\2\2-.\7\5\2\2./\b\5\1\2/\60\3\2\2\2\60\67\7"+
		"\b\2\2\61\62\7\7\2\2\62\63\7\6\2\2\63\64\b\5\1\2\64\65\3\2\2\2\65\67\7"+
		"\b\2\2\66,\3\2\2\2\66\61\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29F\3"+
		"\2\2\2:8\3\2\2\2;A\7\t\2\2<=\5\b\5\2=>\b\5\1\2>@\3\2\2\2?<\3\2\2\2@C\3"+
		"\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DG\7\13\2\2EG\7\n\2\2F;"+
		"\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\5\f\7\2IJ\b\6\1\2JK\7\2\2\3K\13\3\2\2"+
		"\2LM\7\16\2\2MN\b\7\1\2NO\3\2\2\2OP\7\f\2\2PQ\7\16\2\2QR\b\7\1\2RS\3\2"+
		"\2\2ST\7\r\2\2TU\7\16\2\2UV\b\7\1\2VW\3\2\2\2WX\7\n\2\2X\r\3\2\2\2\b\35"+
		"\37\668AF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}