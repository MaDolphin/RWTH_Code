// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/appointmentsflexibilized/_parser/AppointmentsFlexibilizedAntlr.g4 by ANTLR 4.7.1

package appointmentsflexibilized._parser;
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
public class AppointmentsFlexibilizedAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COLON=14, LCURLY=15, MINUS=16, 
		RCURLY=17, POINT=18, SLASH=19, Name=20, WS=21, SL_COMMENT=22, ML_COMMENT=23, 
		Digits=24, Char=25, String=26;
	public static final int
		RULE_nullLiteral_eof = 0, RULE_nullLiteral = 1, RULE_booleanLiteral_eof = 2, 
		RULE_booleanLiteral = 3, RULE_charLiteral_eof = 4, RULE_charLiteral = 5, 
		RULE_stringLiteral_eof = 6, RULE_stringLiteral = 7, RULE_natLiteral_eof = 8, 
		RULE_natLiteral = 9, RULE_signedNatLiteral_eof = 10, RULE_signedNatLiteral = 11, 
		RULE_basicLongLiteral_eof = 12, RULE_basicLongLiteral = 13, RULE_signedBasicLongLiteral_eof = 14, 
		RULE_signedBasicLongLiteral = 15, RULE_basicFloatLiteral_eof = 16, RULE_basicFloatLiteral = 17, 
		RULE_signedBasicFloatLiteral_eof = 18, RULE_signedBasicFloatLiteral = 19, 
		RULE_basicDoubleLiteral_eof = 20, RULE_basicDoubleLiteral = 21, RULE_signedBasicDoubleLiteral_eof = 22, 
		RULE_signedBasicDoubleLiteral = 23, RULE_appointment_eof = 24, RULE_appointment = 25, 
		RULE_start_eof = 26, RULE_start = 27, RULE_end_eof = 28, RULE_end = 29, 
		RULE_date_eof = 30, RULE_date = 31, RULE_time_eof = 32, RULE_time = 33, 
		RULE_r__break_eof = 34, RULE_r__break = 35, RULE_participants_eof = 36, 
		RULE_participants = 37, RULE_frequency_eof = 38, RULE_frequency = 39, 
		RULE_literal_eof = 40, RULE_literal = 41, RULE_signedLiteral_eof = 42, 
		RULE_signedLiteral = 43, RULE_numericLiteral_eof = 44, RULE_numericLiteral = 45, 
		RULE_signedNumericLiteral_eof = 46, RULE_signedNumericLiteral = 47, RULE_i_eof = 48, 
		RULE_i = 49;
	public static final String[] ruleNames = {
		"nullLiteral_eof", "nullLiteral", "booleanLiteral_eof", "booleanLiteral", 
		"charLiteral_eof", "charLiteral", "stringLiteral_eof", "stringLiteral", 
		"natLiteral_eof", "natLiteral", "signedNatLiteral_eof", "signedNatLiteral", 
		"basicLongLiteral_eof", "basicLongLiteral", "signedBasicLongLiteral_eof", 
		"signedBasicLongLiteral", "basicFloatLiteral_eof", "basicFloatLiteral", 
		"signedBasicFloatLiteral_eof", "signedBasicFloatLiteral", "basicDoubleLiteral_eof", 
		"basicDoubleLiteral", "signedBasicDoubleLiteral_eof", "signedBasicDoubleLiteral", 
		"appointment_eof", "appointment", "start_eof", "start", "end_eof", "end", 
		"date_eof", "date", "time_eof", "time", "r__break_eof", "r__break", "participants_eof", 
		"participants", "frequency_eof", "frequency", "literal_eof", "literal", 
		"signedLiteral_eof", "signedLiteral", "numericLiteral_eof", "numericLiteral", 
		"signedNumericLiteral_eof", "signedNumericLiteral", "i_eof", "i"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'appointment'", "'start'", "'end'", 
		"'break'", "'participants:'", "', '", "'once'", "'daily'", "'weekly'", 
		"'monthly'", "':'", "'{'", "'-'", "'}'", "'.'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COLON", "LCURLY", "MINUS", "RCURLY", "POINT", "SLASH", "Name", 
		"WS", "SL_COMMENT", "ML_COMMENT", "Digits", "Char", "String"
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
	public String getGrammarFileName() { return "AppointmentsFlexibilizedAntlr.g4"; }

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

	  // convert function for Digits
	private String convertDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Char
	private String convertChar(Token t)  {
	    return t.getText();
	}

	  // convert function for SingleCharacter
	private String convertSingleCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for String
	private String convertString(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacters
	private String convertStringCharacters(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalEscape
	private String convertOctalEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for UnicodeEscape
	private String convertUnicodeEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for ZeroToThree
	private String convertZeroToThree(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigit
	private String convertOctalDigit(Token t)  {
	    return t.getText();
	}


	public AppointmentsFlexibilizedAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public NullLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNullLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNullLiteral_eof(this);
		}
	}

	public final NullLiteral_eofContext nullLiteral_eof() throws RecognitionException {
		NullLiteral_eofContext _localctx = new NullLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((NullLiteral_eofContext)_localctx).tmp = nullLiteral();
			((NullLiteral_eofContext)_localctx).ret =  ((NullLiteral_eofContext)_localctx).tmp.ret;
			setState(102);
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

	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNullLiteral(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nullLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTNullLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTNullLiteral();
		((NullLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
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

	public static class BooleanLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBooleanLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBooleanLiteral_eof(this);
		}
	}

	public final BooleanLiteral_eofContext booleanLiteral_eof() throws RecognitionException {
		BooleanLiteral_eofContext _localctx = new BooleanLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((BooleanLiteral_eofContext)_localctx).tmp = booleanLiteral();
			((BooleanLiteral_eofContext)_localctx).ret =  ((BooleanLiteral_eofContext)_localctx).tmp.ret;
			setState(108);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBooleanLiteral();
		((BooleanLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(110);
				match(T__1);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case T__2:
				{
				setState(112);
				match(T__2);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);

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

	public static class CharLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public CharLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterCharLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitCharLiteral_eof(this);
		}
	}

	public final CharLiteral_eofContext charLiteral_eof() throws RecognitionException {
		CharLiteral_eofContext _localctx = new CharLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((CharLiteral_eofContext)_localctx).tmp = charLiteral();
			((CharLiteral_eofContext)_localctx).ret =  ((CharLiteral_eofContext)_localctx).tmp.ret;
			setState(118);
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

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(AppointmentsFlexibilizedAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitCharLiteral(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_charLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTCharLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTCharLiteral();
		((CharLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			((CharLiteralContext)_localctx).tmp0 = match(Char);
			_aNode.setSource(convertChar(((CharLiteralContext)_localctx).tmp0));
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

	public static class StringLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public StringLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterStringLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitStringLiteral_eof(this);
		}
	}

	public final StringLiteral_eofContext stringLiteral_eof() throws RecognitionException {
		StringLiteral_eofContext _localctx = new StringLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((StringLiteral_eofContext)_localctx).tmp = stringLiteral();
			((StringLiteral_eofContext)_localctx).ret =  ((StringLiteral_eofContext)_localctx).tmp.ret;
			setState(125);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public Token tmp0;
		public TerminalNode String() { return getToken(AppointmentsFlexibilizedAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTStringLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTStringLiteral();
		((StringLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			((StringLiteralContext)_localctx).tmp0 = match(String);
			_aNode.setSource(convertString(((StringLiteralContext)_localctx).tmp0));
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

	public static class NatLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public NatLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public NatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNatLiteral_eof(this);
		}
	}

	public final NatLiteral_eofContext natLiteral_eof() throws RecognitionException {
		NatLiteral_eofContext _localctx = new NatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((NatLiteral_eofContext)_localctx).tmp = natLiteral();
			((NatLiteral_eofContext)_localctx).ret =  ((NatLiteral_eofContext)_localctx).tmp.ret;
			setState(132);
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

	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(AppointmentsFlexibilizedAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNatLiteral(this);
		}
	}

	public final NatLiteralContext natLiteral() throws RecognitionException {
		NatLiteralContext _localctx = new NatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_natLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTNatLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTNatLiteral();
		((NatLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			((NatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((NatLiteralContext)_localctx).tmp0));
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

	public static class SignedNatLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public SignedNatLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedNatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedNatLiteral_eof(this);
		}
	}

	public final SignedNatLiteral_eofContext signedNatLiteral_eof() throws RecognitionException {
		SignedNatLiteral_eofContext _localctx = new SignedNatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedNatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((SignedNatLiteral_eofContext)_localctx).tmp = signedNatLiteral();
			((SignedNatLiteral_eofContext)_localctx).ret =  ((SignedNatLiteral_eofContext)_localctx).tmp.ret;
			setState(139);
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

	public static class SignedNatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(AppointmentsFlexibilizedAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsFlexibilizedAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedNatLiteral(this);
		}
	}

	public final SignedNatLiteralContext signedNatLiteral() throws RecognitionException {
		SignedNatLiteralContext _localctx = new SignedNatLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedNatLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedNatLiteral();
		((SignedNatLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(141);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(145);
			((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
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

	public static class BasicLongLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public BasicLongLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicLongLiteral_eof(this);
		}
	}

	public final BasicLongLiteral_eofContext basicLongLiteral_eof() throws RecognitionException {
		BasicLongLiteral_eofContext _localctx = new BasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((BasicLongLiteral_eofContext)_localctx).tmp = basicLongLiteral();
			((BasicLongLiteral_eofContext)_localctx).ret =  ((BasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(150);
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

	public static class BasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(AppointmentsFlexibilizedAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(AppointmentsFlexibilizedAntlrParser.Name, 0); }
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicLongLiteral(this);
		}
	}

	public final BasicLongLiteralContext basicLongLiteral() throws RecognitionException {
		BasicLongLiteralContext _localctx = new BasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_basicLongLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicLongLiteral();
		((BasicLongLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(155);
			((BasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((BasicLongLiteralContext)_localctx).tmp1));
			}
			setState(158);
			if (!(is("l","L"))) throw new FailedPredicateException(this, "is(\"l\",\"L\")");
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

	public static class SignedBasicLongLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public SignedBasicLongLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicLongLiteral_eof(this);
		}
	}

	public final SignedBasicLongLiteral_eofContext signedBasicLongLiteral_eof() throws RecognitionException {
		SignedBasicLongLiteral_eofContext _localctx = new SignedBasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signedBasicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((SignedBasicLongLiteral_eofContext)_localctx).tmp = signedBasicLongLiteral();
			((SignedBasicLongLiteral_eofContext)_localctx).ret =  ((SignedBasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(162);
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

	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(AppointmentsFlexibilizedAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(AppointmentsFlexibilizedAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsFlexibilizedAntlrParser.MINUS, 0); }
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicLongLiteral(this);
		}
	}

	public final SignedBasicLongLiteralContext signedBasicLongLiteral() throws RecognitionException {
		SignedBasicLongLiteralContext _localctx = new SignedBasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_signedBasicLongLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicLongLiteral();
		((SignedBasicLongLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(164);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(168);
			((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(171);
			((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((SignedBasicLongLiteralContext)_localctx).tmp1));
			}
			setState(174);
			if (!(is("l","L"))) throw new FailedPredicateException(this, "is(\"l\",\"L\")");
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

	public static class BasicFloatLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public BasicFloatLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicFloatLiteral_eof(this);
		}
	}

	public final BasicFloatLiteral_eofContext basicFloatLiteral_eof() throws RecognitionException {
		BasicFloatLiteral_eofContext _localctx = new BasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((BasicFloatLiteral_eofContext)_localctx).tmp = basicFloatLiteral();
			((BasicFloatLiteral_eofContext)_localctx).ret =  ((BasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(178);
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

	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode POINT() { return getToken(AppointmentsFlexibilizedAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(AppointmentsFlexibilizedAntlrParser.Name, 0); }
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicFloatLiteral(this);
		}
	}

	public final BasicFloatLiteralContext basicFloatLiteral() throws RecognitionException {
		BasicFloatLiteralContext _localctx = new BasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_basicFloatLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicFloatLiteral();
		((BasicFloatLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(183);
			match(POINT);
			{
			setState(184);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(187);
			((BasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((BasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(190);
			if (!(is("f","F"))) throw new FailedPredicateException(this, "is(\"f\",\"F\")");
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

	public static class SignedBasicFloatLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public SignedBasicFloatLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicFloatLiteral_eof(this);
		}
	}

	public final SignedBasicFloatLiteral_eofContext signedBasicFloatLiteral_eof() throws RecognitionException {
		SignedBasicFloatLiteral_eofContext _localctx = new SignedBasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedBasicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((SignedBasicFloatLiteral_eofContext)_localctx).tmp = signedBasicFloatLiteral();
			((SignedBasicFloatLiteral_eofContext)_localctx).ret =  ((SignedBasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(194);
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

	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode POINT() { return getToken(AppointmentsFlexibilizedAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(AppointmentsFlexibilizedAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsFlexibilizedAntlrParser.MINUS, 0); }
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicFloatLiteral(this);
		}
	}

	public final SignedBasicFloatLiteralContext signedBasicFloatLiteral() throws RecognitionException {
		SignedBasicFloatLiteralContext _localctx = new SignedBasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_signedBasicFloatLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicFloatLiteral();
		((SignedBasicFloatLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(196);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(200);
			((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(203);
			match(POINT);
			{
			setState(204);
			((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(207);
			((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((SignedBasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(210);
			if (!(is("f","F"))) throw new FailedPredicateException(this, "is(\"f\",\"F\")");
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

	public static class BasicDoubleLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public BasicDoubleLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public BasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicDoubleLiteral_eof(this);
		}
	}

	public final BasicDoubleLiteral_eofContext basicDoubleLiteral_eof() throws RecognitionException {
		BasicDoubleLiteral_eofContext _localctx = new BasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((BasicDoubleLiteral_eofContext)_localctx).tmp = basicDoubleLiteral();
			((BasicDoubleLiteral_eofContext)_localctx).ret =  ((BasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(214);
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

	public static class BasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(AppointmentsFlexibilizedAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitBasicDoubleLiteral(this);
		}
	}

	public final BasicDoubleLiteralContext basicDoubleLiteral() throws RecognitionException {
		BasicDoubleLiteralContext _localctx = new BasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_basicDoubleLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTBasicDoubleLiteral();
		((BasicDoubleLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(219);
			match(POINT);
			{
			setState(220);
			((BasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp1));
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

	public static class SignedBasicDoubleLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public SignedBasicDoubleLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicDoubleLiteral_eof(this);
		}
	}

	public final SignedBasicDoubleLiteral_eofContext signedBasicDoubleLiteral_eof() throws RecognitionException {
		SignedBasicDoubleLiteral_eofContext _localctx = new SignedBasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedBasicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((SignedBasicDoubleLiteral_eofContext)_localctx).tmp = signedBasicDoubleLiteral();
			((SignedBasicDoubleLiteral_eofContext)_localctx).ret =  ((SignedBasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(225);
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

	public static class SignedBasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(AppointmentsFlexibilizedAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public TerminalNode MINUS() { return getToken(AppointmentsFlexibilizedAntlrParser.MINUS, 0); }
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedBasicDoubleLiteral(this);
		}
	}

	public final SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() throws RecognitionException {
		SignedBasicDoubleLiteralContext _localctx = new SignedBasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signedBasicDoubleLiteral);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral _aNode = null;
		_aNode=de.monticore.literals.mccommonliterals._ast.MCCommonLiteralsNodeFactory.createASTSignedBasicDoubleLiteral();
		((SignedBasicDoubleLiteralContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(227);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(231);
			((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(234);
			match(POINT);
			{
			setState(235);
			((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
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

	public static class Appointment_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTAppointment ret = null;
		public AppointmentContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public AppointmentContext appointment() {
			return getRuleContext(AppointmentContext.class,0);
		}
		public Appointment_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointment_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterAppointment_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitAppointment_eof(this);
		}
	}

	public final Appointment_eofContext appointment_eof() throws RecognitionException {
		Appointment_eofContext _localctx = new Appointment_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_appointment_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((Appointment_eofContext)_localctx).tmp = appointment();
			((Appointment_eofContext)_localctx).ret =  ((Appointment_eofContext)_localctx).tmp.ret;
			setState(240);
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

	public static class AppointmentContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTAppointment ret = null;
		public Token tmp0;
		public IContext tmp1;
		public TerminalNode LCURLY() { return getToken(AppointmentsFlexibilizedAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AppointmentsFlexibilizedAntlrParser.RCURLY, 0); }
		public TerminalNode String() { return getToken(AppointmentsFlexibilizedAntlrParser.String, 0); }
		public List<IContext> i() {
			return getRuleContexts(IContext.class);
		}
		public IContext i(int i) {
			return getRuleContext(IContext.class,i);
		}
		public AppointmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterAppointment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitAppointment(this);
		}
	}

	public final AppointmentContext appointment() throws RecognitionException {
		AppointmentContext _localctx = new AppointmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_appointment);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTAppointment _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTAppointment();
		((AppointmentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__3);
			{
			setState(243);
			((AppointmentContext)_localctx).tmp0 = match(String);
			_aNode.setString(convertString(((AppointmentContext)_localctx).tmp0));
			}
			setState(246);
			match(LCURLY);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Digits))) != 0)) {
				{
				{
				setState(247);
				((AppointmentContext)_localctx).tmp1 = i();
				addToIteratedAttributeIfNotNull(_aNode.getIList(), _localctx.tmp1.ret);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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

	public static class Start_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTStart ret = null;
		public StartContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Start_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterStart_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitStart_eof(this);
		}
	}

	public final Start_eofContext start_eof() throws RecognitionException {
		Start_eofContext _localctx = new Start_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_start_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((Start_eofContext)_localctx).tmp = start();
			((Start_eofContext)_localctx).ret =  ((Start_eofContext)_localctx).tmp.ret;
			setState(259);
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

	public static class StartContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTStart ret = null;
		public DateContext tmp0;
		public TimeContext tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsFlexibilizedAntlrParser.COLON, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_start);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTStart _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTStart();
		((StartContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__4);
			setState(262);
			match(COLON);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(263);
				((StartContext)_localctx).tmp0 = date();
				_aNode.setDate(_localctx.tmp0.ret);
				}
				break;
			}
			setState(268);
			((StartContext)_localctx).tmp1 = time();
			_aNode.setTime(_localctx.tmp1.ret);
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

	public static class End_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTEnd ret = null;
		public EndContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public End_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterEnd_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitEnd_eof(this);
		}
	}

	public final End_eofContext end_eof() throws RecognitionException {
		End_eofContext _localctx = new End_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_end_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((End_eofContext)_localctx).tmp = end();
			((End_eofContext)_localctx).ret =  ((End_eofContext)_localctx).tmp.ret;
			setState(273);
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

	public static class EndContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTEnd ret = null;
		public DateContext tmp0;
		public TimeContext tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsFlexibilizedAntlrParser.COLON, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_end);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTEnd _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTEnd();
		((EndContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__5);
			setState(276);
			match(COLON);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(277);
				((EndContext)_localctx).tmp0 = date();
				_aNode.setDate(_localctx.tmp0.ret);
				}
				break;
			}
			setState(282);
			((EndContext)_localctx).tmp1 = time();
			_aNode.setTime(_localctx.tmp1.ret);
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

	public static class Date_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTDate ret = null;
		public DateContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Date_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterDate_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitDate_eof(this);
		}
	}

	public final Date_eofContext date_eof() throws RecognitionException {
		Date_eofContext _localctx = new Date_eofContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_date_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((Date_eofContext)_localctx).tmp = date();
			((Date_eofContext)_localctx).ret =  ((Date_eofContext)_localctx).tmp.ret;
			setState(287);
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

	public static class DateContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTDate ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public List<TerminalNode> SLASH() { return getTokens(AppointmentsFlexibilizedAntlrParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.SLASH, i);
		}
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_date);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTDate _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTDate();
		((DateContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			((DateContext)_localctx).tmp0 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((DateContext)_localctx).tmp0));
			}
			setState(292);
			match(SLASH);
			{
			setState(293);
			((DateContext)_localctx).tmp1 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((DateContext)_localctx).tmp1));
			}
			setState(296);
			match(SLASH);
			{
			setState(297);
			((DateContext)_localctx).tmp2 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((DateContext)_localctx).tmp2));
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

	public static class Time_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTTime ret = null;
		public TimeContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Time_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterTime_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitTime_eof(this);
		}
	}

	public final Time_eofContext time_eof() throws RecognitionException {
		Time_eofContext _localctx = new Time_eofContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_time_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((Time_eofContext)_localctx).tmp = time();
			((Time_eofContext)_localctx).ret =  ((Time_eofContext)_localctx).tmp.ret;
			setState(302);
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

	public static class TimeContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTTime ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsFlexibilizedAntlrParser.COLON, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsFlexibilizedAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.Digits, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_time);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTTime _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTTime();
		((TimeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			((TimeContext)_localctx).tmp0 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((TimeContext)_localctx).tmp0));
			}
			setState(307);
			match(COLON);
			{
			setState(308);
			((TimeContext)_localctx).tmp1 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((TimeContext)_localctx).tmp1));
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

	public static class R__break_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTBreak ret = null;
		public R__breakContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public R__breakContext r__break() {
			return getRuleContext(R__breakContext.class,0);
		}
		public R__break_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r__break_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterR__break_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitR__break_eof(this);
		}
	}

	public final R__break_eofContext r__break_eof() throws RecognitionException {
		R__break_eofContext _localctx = new R__break_eofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_r__break_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((R__break_eofContext)_localctx).tmp = r__break();
			((R__break_eofContext)_localctx).ret =  ((R__break_eofContext)_localctx).tmp.ret;
			setState(313);
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

	public static class R__breakContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTBreak ret = null;
		public StartContext tmp0;
		public EndContext tmp1;
		public TerminalNode LCURLY() { return getToken(AppointmentsFlexibilizedAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AppointmentsFlexibilizedAntlrParser.RCURLY, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public R__breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r__break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterR__break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitR__break(this);
		}
	}

	public final R__breakContext r__break() throws RecognitionException {
		R__breakContext _localctx = new R__breakContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_r__break);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTBreak _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTBreak();
		((R__breakContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__6);
			setState(316);
			match(LCURLY);
			setState(317);
			((R__breakContext)_localctx).tmp0 = start();
			_aNode.setStart(_localctx.tmp0.ret);
			setState(319);
			((R__breakContext)_localctx).tmp1 = end();
			_aNode.setEnd(_localctx.tmp1.ret);
			setState(321);
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

	public static class Participants_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTParticipants ret = null;
		public ParticipantsContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public ParticipantsContext participants() {
			return getRuleContext(ParticipantsContext.class,0);
		}
		public Participants_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participants_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterParticipants_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitParticipants_eof(this);
		}
	}

	public final Participants_eofContext participants_eof() throws RecognitionException {
		Participants_eofContext _localctx = new Participants_eofContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_participants_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((Participants_eofContext)_localctx).tmp = participants();
			((Participants_eofContext)_localctx).ret =  ((Participants_eofContext)_localctx).tmp.ret;
			setState(325);
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

	public static class ParticipantsContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTParticipants ret = null;
		public Token tmp0;
		public Token tmp1;
		public List<TerminalNode> String() { return getTokens(AppointmentsFlexibilizedAntlrParser.String); }
		public TerminalNode String(int i) {
			return getToken(AppointmentsFlexibilizedAntlrParser.String, i);
		}
		public ParticipantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterParticipants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitParticipants(this);
		}
	}

	public final ParticipantsContext participants() throws RecognitionException {
		ParticipantsContext _localctx = new ParticipantsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_participants);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTParticipants _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTParticipants();
		((ParticipantsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__7);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(328);
					((ParticipantsContext)_localctx).tmp0 = match(String);
					 addToIteratedAttributeIfNotNull(_aNode.getStringList(), convertString(((ParticipantsContext)_localctx).tmp0));
					}
					setState(331);
					match(T__8);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String) {
				{
				{
				{
				setState(337);
				((ParticipantsContext)_localctx).tmp1 = match(String);
				 addToIteratedAttributeIfNotNull(_aNode.getStringList(), convertString(((ParticipantsContext)_localctx).tmp1));
				}
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Frequency_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTFrequency ret = null;
		public FrequencyContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public Frequency_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequency_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterFrequency_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitFrequency_eof(this);
		}
	}

	public final Frequency_eofContext frequency_eof() throws RecognitionException {
		Frequency_eofContext _localctx = new Frequency_eofContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_frequency_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((Frequency_eofContext)_localctx).tmp = frequency();
			((Frequency_eofContext)_localctx).ret =  ((Frequency_eofContext)_localctx).tmp.ret;
			setState(346);
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

	public static class FrequencyContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTFrequency ret = null;
		public FrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterFrequency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitFrequency(this);
		}
	}

	public final FrequencyContext frequency() throws RecognitionException {
		FrequencyContext _localctx = new FrequencyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_frequency);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointmentsflexibilized._ast.ASTFrequency _aNode = null;
		_aNode=appointmentsflexibilized._ast.AppointmentsFlexibilizedNodeFactory.createASTFrequency();
		((FrequencyContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Literal_eofContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret = null;
		public LiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(352);
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

	public static class LiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret;
		public NullLiteralContext tmp0;
		public BooleanLiteralContext tmp1;
		public CharLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public NumericLiteralContext tmp4;
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((LiteralContext)_localctx).tmp0 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				((LiteralContext)_localctx).tmp1 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				((LiteralContext)_localctx).tmp2 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				((LiteralContext)_localctx).tmp3 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				((LiteralContext)_localctx).tmp4 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SignedLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret = null;
		public SignedLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedLiteralContext signedLiteral() {
			return getRuleContext(SignedLiteralContext.class,0);
		}
		public SignedLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedLiteral_eof(this);
		}
	}

	public final SignedLiteral_eofContext signedLiteral_eof() throws RecognitionException {
		SignedLiteral_eofContext _localctx = new SignedLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_signedLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((SignedLiteral_eofContext)_localctx).tmp = signedLiteral();
			((SignedLiteral_eofContext)_localctx).ret =  ((SignedLiteral_eofContext)_localctx).tmp.ret;
			setState(373);
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

	public static class SignedLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret;
		public NullLiteralContext tmp0;
		public BooleanLiteralContext tmp1;
		public CharLiteralContext tmp2;
		public StringLiteralContext tmp3;
		public SignedNumericLiteralContext tmp5;
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedLiteral(this);
		}
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_signedLiteral);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				((SignedLiteralContext)_localctx).tmp0 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				((SignedLiteralContext)_localctx).tmp1 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				((SignedLiteralContext)_localctx).tmp2 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				((SignedLiteralContext)_localctx).tmp3 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case MINUS:
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				((SignedLiteralContext)_localctx).tmp5 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumericLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret = null;
		public NumericLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNumericLiteral_eof(this);
		}
	}

	public final NumericLiteral_eofContext numericLiteral_eof() throws RecognitionException {
		NumericLiteral_eofContext _localctx = new NumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((NumericLiteral_eofContext)_localctx).tmp = numericLiteral();
			((NumericLiteral_eofContext)_localctx).ret =  ((NumericLiteral_eofContext)_localctx).tmp.ret;
			setState(394);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret;
		public NatLiteralContext tmp6;
		public BasicLongLiteralContext tmp7;
		public BasicFloatLiteralContext tmp8;
		public BasicDoubleLiteralContext tmp9;
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numericLiteral);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((NumericLiteralContext)_localctx).tmp6 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((NumericLiteralContext)_localctx).tmp7 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				((NumericLiteralContext)_localctx).tmp8 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				((NumericLiteralContext)_localctx).tmp9 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
				}
				break;
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

	public static class SignedNumericLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret = null;
		public SignedNumericLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedNumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedNumericLiteral_eof(this);
		}
	}

	public final SignedNumericLiteral_eofContext signedNumericLiteral_eof() throws RecognitionException {
		SignedNumericLiteral_eofContext _localctx = new SignedNumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_signedNumericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			((SignedNumericLiteral_eofContext)_localctx).tmp = signedNumericLiteral();
			((SignedNumericLiteral_eofContext)_localctx).ret =  ((SignedNumericLiteral_eofContext)_localctx).tmp.ret;
			setState(412);
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

	public static class SignedNumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret;
		public SignedNatLiteralContext tmp10;
		public SignedBasicLongLiteralContext tmp11;
		public SignedBasicFloatLiteralContext tmp12;
		public SignedBasicDoubleLiteralContext tmp13;
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedNumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterSignedNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitSignedNumericLiteral(this);
		}
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_signedNumericLiteral);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				((SignedNumericLiteralContext)_localctx).tmp10 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				((SignedNumericLiteralContext)_localctx).tmp11 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
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

	public static class I_eofContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTI ret = null;
		public IContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsFlexibilizedAntlrParser.EOF, 0); }
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public I_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterI_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitI_eof(this);
		}
	}

	public final I_eofContext i_eof() throws RecognitionException {
		I_eofContext _localctx = new I_eofContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_i_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((I_eofContext)_localctx).tmp = i();
			((I_eofContext)_localctx).ret =  ((I_eofContext)_localctx).tmp.ret;
			setState(430);
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

	public static class IContext extends ParserRuleContext {
		public appointmentsflexibilized._ast.ASTI ret;
		public StartContext tmp14;
		public EndContext tmp15;
		public DateContext tmp16;
		public TimeContext tmp17;
		public R__breakContext tmp18;
		public ParticipantsContext tmp19;
		public FrequencyContext tmp20;
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public R__breakContext r__break() {
			return getRuleContext(R__breakContext.class,0);
		}
		public ParticipantsContext participants() {
			return getRuleContext(ParticipantsContext.class,0);
		}
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsFlexibilizedAntlrListener ) ((AppointmentsFlexibilizedAntlrListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_i);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((IContext)_localctx).tmp14 = start();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp14.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				((IContext)_localctx).tmp15 = end();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp15.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				((IContext)_localctx).tmp16 = date();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp16.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				((IContext)_localctx).tmp17 = time();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp17.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				((IContext)_localctx).tmp18 = r__break();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp18.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				((IContext)_localctx).tmp19 = participants();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp19.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				((IContext)_localctx).tmp20 = frequency();
				((IContext)_localctx).ret = ((IContext)_localctx).tmp20.ret;
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return basicLongLiteral_sempred((BasicLongLiteralContext)_localctx, predIndex);
		case 15:
			return signedBasicLongLiteral_sempred((SignedBasicLongLiteralContext)_localctx, predIndex);
		case 17:
			return basicFloatLiteral_sempred((BasicFloatLiteralContext)_localctx, predIndex);
		case 19:
			return signedBasicFloatLiteral_sempred((SignedBasicFloatLiteralContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean basicLongLiteral_sempred(BasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return is("l","L");
		}
		return true;
	}
	private boolean signedBasicLongLiteral_sempred(SignedBasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return is("l","L");
		}
		return true;
	}
	private boolean basicFloatLiteral_sempred(BasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return is("f","F");
		}
		return true;
	}
	private boolean signedBasicFloatLiteral_sempred(SignedBasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return is("f","F");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u01ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0092\n\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\5\21\u00a9\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00c9\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00e8\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u00fd\n\33\f\33\16\33\u0100\13\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u010d\n\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u011b\n\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\7\'\u014f\n\'\f\'\16\'\u0152\13\'\3\'\3\'\7\'\u0156"+
		"\n\'\f\'\16\'\u0159\13\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0174\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0189\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\5/\u019b\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01ad\n\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c8\n\63\3\63\2\2"+
		"\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bd\2\3\3\2\f\17\2\u01b5\2f\3\2\2\2\4j\3\2\2\2\6l\3\2\2"+
		"\2\bt\3\2\2\2\nv\3\2\2\2\fz\3\2\2\2\16}\3\2\2\2\20\u0081\3\2\2\2\22\u0084"+
		"\3\2\2\2\24\u0088\3\2\2\2\26\u008b\3\2\2\2\30\u0091\3\2\2\2\32\u0096\3"+
		"\2\2\2\34\u009a\3\2\2\2\36\u00a2\3\2\2\2 \u00a8\3\2\2\2\"\u00b2\3\2\2"+
		"\2$\u00b6\3\2\2\2&\u00c2\3\2\2\2(\u00c8\3\2\2\2*\u00d6\3\2\2\2,\u00da"+
		"\3\2\2\2.\u00e1\3\2\2\2\60\u00e7\3\2\2\2\62\u00f0\3\2\2\2\64\u00f4\3\2"+
		"\2\2\66\u0103\3\2\2\28\u0107\3\2\2\2:\u0111\3\2\2\2<\u0115\3\2\2\2>\u011f"+
		"\3\2\2\2@\u0123\3\2\2\2B\u012e\3\2\2\2D\u0132\3\2\2\2F\u0139\3\2\2\2H"+
		"\u013d\3\2\2\2J\u0145\3\2\2\2L\u0149\3\2\2\2N\u015a\3\2\2\2P\u015e\3\2"+
		"\2\2R\u0160\3\2\2\2T\u0173\3\2\2\2V\u0175\3\2\2\2X\u0188\3\2\2\2Z\u018a"+
		"\3\2\2\2\\\u019a\3\2\2\2^\u019c\3\2\2\2`\u01ac\3\2\2\2b\u01ae\3\2\2\2"+
		"d\u01c7\3\2\2\2fg\5\4\3\2gh\b\2\1\2hi\7\2\2\3i\3\3\2\2\2jk\7\3\2\2k\5"+
		"\3\2\2\2lm\5\b\5\2mn\b\4\1\2no\7\2\2\3o\7\3\2\2\2pq\7\4\2\2qu\b\5\1\2"+
		"rs\7\5\2\2su\b\5\1\2tp\3\2\2\2tr\3\2\2\2u\t\3\2\2\2vw\5\f\7\2wx\b\6\1"+
		"\2xy\7\2\2\3y\13\3\2\2\2z{\7\33\2\2{|\b\7\1\2|\r\3\2\2\2}~\5\20\t\2~\177"+
		"\b\b\1\2\177\u0080\7\2\2\3\u0080\17\3\2\2\2\u0081\u0082\7\34\2\2\u0082"+
		"\u0083\b\t\1\2\u0083\21\3\2\2\2\u0084\u0085\5\24\13\2\u0085\u0086\b\n"+
		"\1\2\u0086\u0087\7\2\2\3\u0087\23\3\2\2\2\u0088\u0089\7\32\2\2\u0089\u008a"+
		"\b\13\1\2\u008a\25\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\b\f\1\2\u008d"+
		"\u008e\7\2\2\3\u008e\27\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0092\b\r\1"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\7\32\2\2\u0094\u0095\b\r\1\2\u0095\31\3\2\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\u0098\b\16\1\2\u0098\u0099\7\2\2\3\u0099\33\3\2\2\2\u009a\u009b\7\32"+
		"\2\2\u009b\u009c\b\17\1\2\u009c\u009d\3\2\2\2\u009d\u009e\7\26\2\2\u009e"+
		"\u009f\b\17\1\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\6\17\2\2\u00a1\35\3\2"+
		"\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\b\20\1\2\u00a4\u00a5\7\2\2\3\u00a5"+
		"\37\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a9\b\21\1\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab"+
		"\u00ac\b\21\1\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\b"+
		"\21\1\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\6\21\3\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b3\5$\23\2\u00b3\u00b4\b\22\1\2\u00b4\u00b5\7\2\2\3\u00b5#\3\2\2\2"+
		"\u00b6\u00b7\7\32\2\2\u00b7\u00b8\b\23\1\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\7\24\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\b\23\1\2\u00bc\u00bd\3\2\2"+
		"\2\u00bd\u00be\7\26\2\2\u00be\u00bf\b\23\1\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\6\23\4\2\u00c1%\3\2\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\b\24\1"+
		"\2\u00c4\u00c5\7\2\2\3\u00c5\'\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c9"+
		"\b\25\1\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\7\32\2\2\u00cb\u00cc\b\25\1\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\7\24\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\b\25\1\2\u00d0\u00d1\3\2\2"+
		"\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\b\25\1\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\6\25\5\2\u00d5)\3\2\2\2\u00d6\u00d7\5,\27\2\u00d7\u00d8\b\26\1"+
		"\2\u00d8\u00d9\7\2\2\3\u00d9+\3\2\2\2\u00da\u00db\7\32\2\2\u00db\u00dc"+
		"\b\27\1\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\7\32\2"+
		"\2\u00df\u00e0\b\27\1\2\u00e0-\3\2\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3"+
		"\b\30\1\2\u00e3\u00e4\7\2\2\3\u00e4/\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6"+
		"\u00e8\b\31\1\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb\b\31\1\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\7\24\2\2\u00ed\u00ee\7\32\2\2\u00ee\u00ef\b\31\1\2\u00ef\61\3\2"+
		"\2\2\u00f0\u00f1\5\64\33\2\u00f1\u00f2\b\32\1\2\u00f2\u00f3\7\2\2\3\u00f3"+
		"\63\3\2\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\b\33"+
		"\1\2\u00f7\u00f8\3\2\2\2\u00f8\u00fe\7\21\2\2\u00f9\u00fa\5d\63\2\u00fa"+
		"\u00fb\b\33\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\23\2\2\u0102\65\3\2\2\2\u0103\u0104\58\35"+
		"\2\u0104\u0105\b\34\1\2\u0105\u0106\7\2\2\3\u0106\67\3\2\2\2\u0107\u0108"+
		"\7\7\2\2\u0108\u010c\7\20\2\2\u0109\u010a\5@!\2\u010a\u010b\b\35\1\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\5D#\2\u010f\u0110\b\35\1\2\u01109\3\2\2\2\u0111\u0112"+
		"\5<\37\2\u0112\u0113\b\36\1\2\u0113\u0114\7\2\2\3\u0114;\3\2\2\2\u0115"+
		"\u0116\7\b\2\2\u0116\u011a\7\20\2\2\u0117\u0118\5@!\2\u0118\u0119\b\37"+
		"\1\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\5D#\2\u011d\u011e\b\37\1\2\u011e=\3\2\2\2\u011f"+
		"\u0120\5@!\2\u0120\u0121\b \1\2\u0121\u0122\7\2\2\3\u0122?\3\2\2\2\u0123"+
		"\u0124\7\32\2\2\u0124\u0125\b!\1\2\u0125\u0126\3\2\2\2\u0126\u0127\7\25"+
		"\2\2\u0127\u0128\7\32\2\2\u0128\u0129\b!\1\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\7\25\2\2\u012b\u012c\7\32\2\2\u012c\u012d\b!\1\2\u012dA\3\2\2\2"+
		"\u012e\u012f\5D#\2\u012f\u0130\b\"\1\2\u0130\u0131\7\2\2\3\u0131C\3\2"+
		"\2\2\u0132\u0133\7\32\2\2\u0133\u0134\b#\1\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\7\20\2\2\u0136\u0137\7\32\2\2\u0137\u0138\b#\1\2\u0138E\3\2\2\2"+
		"\u0139\u013a\5H%\2\u013a\u013b\b$\1\2\u013b\u013c\7\2\2\3\u013cG\3\2\2"+
		"\2\u013d\u013e\7\t\2\2\u013e\u013f\7\21\2\2\u013f\u0140\58\35\2\u0140"+
		"\u0141\b%\1\2\u0141\u0142\5<\37\2\u0142\u0143\b%\1\2\u0143\u0144\7\23"+
		"\2\2\u0144I\3\2\2\2\u0145\u0146\5L\'\2\u0146\u0147\b&\1\2\u0147\u0148"+
		"\7\2\2\3\u0148K\3\2\2\2\u0149\u0150\7\n\2\2\u014a\u014b\7\34\2\2\u014b"+
		"\u014c\b\'\1\2\u014c\u014d\3\2\2\2\u014d\u014f\7\13\2\2\u014e\u014a\3"+
		"\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0157\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\34\2\2\u0154\u0156\b"+
		"\'\1\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158M\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5P)\2\u015b"+
		"\u015c\b(\1\2\u015c\u015d\7\2\2\3\u015dO\3\2\2\2\u015e\u015f\t\2\2\2\u015f"+
		"Q\3\2\2\2\u0160\u0161\5T+\2\u0161\u0162\b*\1\2\u0162\u0163\7\2\2\3\u0163"+
		"S\3\2\2\2\u0164\u0165\5\4\3\2\u0165\u0166\b+\1\2\u0166\u0174\3\2\2\2\u0167"+
		"\u0168\5\b\5\2\u0168\u0169\b+\1\2\u0169\u0174\3\2\2\2\u016a\u016b\5\f"+
		"\7\2\u016b\u016c\b+\1\2\u016c\u0174\3\2\2\2\u016d\u016e\5\20\t\2\u016e"+
		"\u016f\b+\1\2\u016f\u0174\3\2\2\2\u0170\u0171\5\\/\2\u0171\u0172\b+\1"+
		"\2\u0172\u0174\3\2\2\2\u0173\u0164\3\2\2\2\u0173\u0167\3\2\2\2\u0173\u016a"+
		"\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0170\3\2\2\2\u0174U\3\2\2\2\u0175"+
		"\u0176\5X-\2\u0176\u0177\b,\1\2\u0177\u0178\7\2\2\3\u0178W\3\2\2\2\u0179"+
		"\u017a\5\4\3\2\u017a\u017b\b-\1\2\u017b\u0189\3\2\2\2\u017c\u017d\5\b"+
		"\5\2\u017d\u017e\b-\1\2\u017e\u0189\3\2\2\2\u017f\u0180\5\f\7\2\u0180"+
		"\u0181\b-\1\2\u0181\u0189\3\2\2\2\u0182\u0183\5\20\t\2\u0183\u0184\b-"+
		"\1\2\u0184\u0189\3\2\2\2\u0185\u0186\5`\61\2\u0186\u0187\b-\1\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0179\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u017f\3\2"+
		"\2\2\u0188\u0182\3\2\2\2\u0188\u0185\3\2\2\2\u0189Y\3\2\2\2\u018a\u018b"+
		"\5\\/\2\u018b\u018c\b.\1\2\u018c\u018d\7\2\2\3\u018d[\3\2\2\2\u018e\u018f"+
		"\5\24\13\2\u018f\u0190\b/\1\2\u0190\u019b\3\2\2\2\u0191\u0192\5\34\17"+
		"\2\u0192\u0193\b/\1\2\u0193\u019b\3\2\2\2\u0194\u0195\5$\23\2\u0195\u0196"+
		"\b/\1\2\u0196\u019b\3\2\2\2\u0197\u0198\5,\27\2\u0198\u0199\b/\1\2\u0199"+
		"\u019b\3\2\2\2\u019a\u018e\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0194\3\2"+
		"\2\2\u019a\u0197\3\2\2\2\u019b]\3\2\2\2\u019c\u019d\5`\61\2\u019d\u019e"+
		"\b\60\1\2\u019e\u019f\7\2\2\3\u019f_\3\2\2\2\u01a0\u01a1\5\30\r\2\u01a1"+
		"\u01a2\b\61\1\2\u01a2\u01ad\3\2\2\2\u01a3\u01a4\5 \21\2\u01a4\u01a5\b"+
		"\61\1\2\u01a5\u01ad\3\2\2\2\u01a6\u01a7\5(\25\2\u01a7\u01a8\b\61\1\2\u01a8"+
		"\u01ad\3\2\2\2\u01a9\u01aa\5\60\31\2\u01aa\u01ab\b\61\1\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ada\3\2\2\2\u01ae\u01af\5d\63\2\u01af\u01b0\b\62\1\2"+
		"\u01b0\u01b1\7\2\2\3\u01b1c\3\2\2\2\u01b2\u01b3\58\35\2\u01b3\u01b4\b"+
		"\63\1\2\u01b4\u01c8\3\2\2\2\u01b5\u01b6\5<\37\2\u01b6\u01b7\b\63\1\2\u01b7"+
		"\u01c8\3\2\2\2\u01b8\u01b9\5@!\2\u01b9\u01ba\b\63\1\2\u01ba\u01c8\3\2"+
		"\2\2\u01bb\u01bc\5D#\2\u01bc\u01bd\b\63\1\2\u01bd\u01c8\3\2\2\2\u01be"+
		"\u01bf\5H%\2\u01bf\u01c0\b\63\1\2\u01c0\u01c8\3\2\2\2\u01c1\u01c2\5L\'"+
		"\2\u01c2\u01c3\b\63\1\2\u01c3\u01c8\3\2\2\2\u01c4\u01c5\5P)\2\u01c5\u01c6"+
		"\b\63\1\2\u01c6\u01c8\3\2\2\2\u01c7\u01b2\3\2\2\2\u01c7\u01b5\3\2\2\2"+
		"\u01c7\u01b8\3\2\2\2\u01c7\u01bb\3\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01c1"+
		"\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c8e\3\2\2\2\21t\u0091\u00a8\u00c8\u00e7"+
		"\u00fe\u010c\u011a\u0150\u0157\u0173\u0188\u019a\u01ac\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}