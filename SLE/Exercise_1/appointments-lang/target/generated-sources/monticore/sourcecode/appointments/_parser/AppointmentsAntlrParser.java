// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/appointments/_parser/AppointmentsAntlr.g4 by ANTLR 4.7.1

package appointments._parser;
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
public class AppointmentsAntlrParser extends MCParser {
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
		RULE_r__break_eof = 34, RULE_r__break = 35, RULE_literal_eof = 36, RULE_literal = 37, 
		RULE_signedLiteral_eof = 38, RULE_signedLiteral = 39, RULE_numericLiteral_eof = 40, 
		RULE_numericLiteral = 41, RULE_signedNumericLiteral_eof = 42, RULE_signedNumericLiteral = 43;
	public static final String[] ruleNames = {
		"nullLiteral_eof", "nullLiteral", "booleanLiteral_eof", "booleanLiteral", 
		"charLiteral_eof", "charLiteral", "stringLiteral_eof", "stringLiteral", 
		"natLiteral_eof", "natLiteral", "signedNatLiteral_eof", "signedNatLiteral", 
		"basicLongLiteral_eof", "basicLongLiteral", "signedBasicLongLiteral_eof", 
		"signedBasicLongLiteral", "basicFloatLiteral_eof", "basicFloatLiteral", 
		"signedBasicFloatLiteral_eof", "signedBasicFloatLiteral", "basicDoubleLiteral_eof", 
		"basicDoubleLiteral", "signedBasicDoubleLiteral_eof", "signedBasicDoubleLiteral", 
		"appointment_eof", "appointment", "start_eof", "start", "end_eof", "end", 
		"date_eof", "date", "time_eof", "time", "r__break_eof", "r__break", "literal_eof", 
		"literal", "signedLiteral_eof", "signedLiteral", "numericLiteral_eof", 
		"numericLiteral", "signedNumericLiteral_eof", "signedNumericLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'appointment'", "'participants:'", 
		"', '", "'once'", "'daily'", "'weekly'", "'monthly'", "'start'", "'end'", 
		"'break'", "':'", "'{'", "'-'", "'}'", "'.'", "'/'"
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
	public String getGrammarFileName() { return "AppointmentsAntlr.g4"; }

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


	public AppointmentsAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public NullLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNullLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNullLiteral_eof(this);
		}
	}

	public final NullLiteral_eofContext nullLiteral_eof() throws RecognitionException {
		NullLiteral_eofContext _localctx = new NullLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((NullLiteral_eofContext)_localctx).tmp = nullLiteral();
			((NullLiteral_eofContext)_localctx).ret =  ((NullLiteral_eofContext)_localctx).tmp.ret;
			setState(90);
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNullLiteral(this);
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
			setState(92);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBooleanLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBooleanLiteral_eof(this);
		}
	}

	public final BooleanLiteral_eofContext booleanLiteral_eof() throws RecognitionException {
		BooleanLiteral_eofContext _localctx = new BooleanLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((BooleanLiteral_eofContext)_localctx).tmp = booleanLiteral();
			((BooleanLiteral_eofContext)_localctx).ret =  ((BooleanLiteral_eofContext)_localctx).tmp.ret;
			setState(96);
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBooleanLiteral(this);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(98);
				match(T__1);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case T__2:
				{
				setState(100);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterCharLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitCharLiteral_eof(this);
		}
	}

	public final CharLiteral_eofContext charLiteral_eof() throws RecognitionException {
		CharLiteral_eofContext _localctx = new CharLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((CharLiteral_eofContext)_localctx).tmp = charLiteral();
			((CharLiteral_eofContext)_localctx).ret =  ((CharLiteral_eofContext)_localctx).tmp.ret;
			setState(106);
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
		public TerminalNode Char() { return getToken(AppointmentsAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitCharLiteral(this);
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
			setState(108);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterStringLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitStringLiteral_eof(this);
		}
	}

	public final StringLiteral_eofContext stringLiteral_eof() throws RecognitionException {
		StringLiteral_eofContext _localctx = new StringLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((StringLiteral_eofContext)_localctx).tmp = stringLiteral();
			((StringLiteral_eofContext)_localctx).ret =  ((StringLiteral_eofContext)_localctx).tmp.ret;
			setState(113);
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
		public TerminalNode String() { return getToken(AppointmentsAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitStringLiteral(this);
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
			setState(115);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public NatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNatLiteral_eof(this);
		}
	}

	public final NatLiteral_eofContext natLiteral_eof() throws RecognitionException {
		NatLiteral_eofContext _localctx = new NatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((NatLiteral_eofContext)_localctx).tmp = natLiteral();
			((NatLiteral_eofContext)_localctx).ret =  ((NatLiteral_eofContext)_localctx).tmp.ret;
			setState(120);
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
		public TerminalNode Digits() { return getToken(AppointmentsAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNatLiteral(this);
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
			setState(122);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedNatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedNatLiteral_eof(this);
		}
	}

	public final SignedNatLiteral_eofContext signedNatLiteral_eof() throws RecognitionException {
		SignedNatLiteral_eofContext _localctx = new SignedNatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedNatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((SignedNatLiteral_eofContext)_localctx).tmp = signedNatLiteral();
			((SignedNatLiteral_eofContext)_localctx).ret =  ((SignedNatLiteral_eofContext)_localctx).tmp.ret;
			setState(127);
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
		public TerminalNode Digits() { return getToken(AppointmentsAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedNatLiteral(this);
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(129);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(133);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicLongLiteral_eof(this);
		}
	}

	public final BasicLongLiteral_eofContext basicLongLiteral_eof() throws RecognitionException {
		BasicLongLiteral_eofContext _localctx = new BasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((BasicLongLiteral_eofContext)_localctx).tmp = basicLongLiteral();
			((BasicLongLiteral_eofContext)_localctx).ret =  ((BasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(138);
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
		public TerminalNode Digits() { return getToken(AppointmentsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(AppointmentsAntlrParser.Name, 0); }
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicLongLiteral(this);
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
			setState(140);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(143);
			((BasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((BasicLongLiteralContext)_localctx).tmp1));
			}
			setState(146);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicLongLiteral_eof(this);
		}
	}

	public final SignedBasicLongLiteral_eofContext signedBasicLongLiteral_eof() throws RecognitionException {
		SignedBasicLongLiteral_eofContext _localctx = new SignedBasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signedBasicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((SignedBasicLongLiteral_eofContext)_localctx).tmp = signedBasicLongLiteral();
			((SignedBasicLongLiteral_eofContext)_localctx).ret =  ((SignedBasicLongLiteral_eofContext)_localctx).tmp.ret;
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

	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(AppointmentsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(AppointmentsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsAntlrParser.MINUS, 0); }
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicLongLiteral(this);
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
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(152);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(156);
			((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(159);
			((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((SignedBasicLongLiteralContext)_localctx).tmp1));
			}
			setState(162);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicFloatLiteral_eof(this);
		}
	}

	public final BasicFloatLiteral_eofContext basicFloatLiteral_eof() throws RecognitionException {
		BasicFloatLiteral_eofContext _localctx = new BasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((BasicFloatLiteral_eofContext)_localctx).tmp = basicFloatLiteral();
			((BasicFloatLiteral_eofContext)_localctx).ret =  ((BasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(166);
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
		public TerminalNode POINT() { return getToken(AppointmentsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(AppointmentsAntlrParser.Name, 0); }
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicFloatLiteral(this);
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
			setState(168);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(171);
			match(POINT);
			{
			setState(172);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(175);
			((BasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((BasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(178);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicFloatLiteral_eof(this);
		}
	}

	public final SignedBasicFloatLiteral_eofContext signedBasicFloatLiteral_eof() throws RecognitionException {
		SignedBasicFloatLiteral_eofContext _localctx = new SignedBasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedBasicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((SignedBasicFloatLiteral_eofContext)_localctx).tmp = signedBasicFloatLiteral();
			((SignedBasicFloatLiteral_eofContext)_localctx).ret =  ((SignedBasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(182);
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
		public TerminalNode POINT() { return getToken(AppointmentsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(AppointmentsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(AppointmentsAntlrParser.MINUS, 0); }
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicFloatLiteral(this);
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
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(184);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(188);
			((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(191);
			match(POINT);
			{
			setState(192);
			((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(195);
			((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((SignedBasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(198);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public BasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicDoubleLiteral_eof(this);
		}
	}

	public final BasicDoubleLiteral_eofContext basicDoubleLiteral_eof() throws RecognitionException {
		BasicDoubleLiteral_eofContext _localctx = new BasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((BasicDoubleLiteral_eofContext)_localctx).tmp = basicDoubleLiteral();
			((BasicDoubleLiteral_eofContext)_localctx).ret =  ((BasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(202);
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
		public TerminalNode POINT() { return getToken(AppointmentsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitBasicDoubleLiteral(this);
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
			setState(204);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(207);
			match(POINT);
			{
			setState(208);
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicDoubleLiteral_eof(this);
		}
	}

	public final SignedBasicDoubleLiteral_eofContext signedBasicDoubleLiteral_eof() throws RecognitionException {
		SignedBasicDoubleLiteral_eofContext _localctx = new SignedBasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedBasicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((SignedBasicDoubleLiteral_eofContext)_localctx).tmp = signedBasicDoubleLiteral();
			((SignedBasicDoubleLiteral_eofContext)_localctx).ret =  ((SignedBasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(213);
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
		public TerminalNode POINT() { return getToken(AppointmentsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public TerminalNode MINUS() { return getToken(AppointmentsAntlrParser.MINUS, 0); }
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedBasicDoubleLiteral(this);
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
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(215);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(219);
			((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(222);
			match(POINT);
			{
			setState(223);
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
		public appointments._ast.ASTAppointment ret = null;
		public AppointmentContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public AppointmentContext appointment() {
			return getRuleContext(AppointmentContext.class,0);
		}
		public Appointment_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointment_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterAppointment_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitAppointment_eof(this);
		}
	}

	public final Appointment_eofContext appointment_eof() throws RecognitionException {
		Appointment_eofContext _localctx = new Appointment_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_appointment_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((Appointment_eofContext)_localctx).tmp = appointment();
			((Appointment_eofContext)_localctx).ret =  ((Appointment_eofContext)_localctx).tmp.ret;
			setState(228);
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
		public appointments._ast.ASTAppointment ret = null;
		public Token tmp0;
		public StartContext tmp1;
		public EndContext tmp2;
		public Token tmp3;
		public Token tmp4;
		public R__breakContext tmp5;
		public TerminalNode LCURLY() { return getToken(AppointmentsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AppointmentsAntlrParser.RCURLY, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<TerminalNode> String() { return getTokens(AppointmentsAntlrParser.String); }
		public TerminalNode String(int i) {
			return getToken(AppointmentsAntlrParser.String, i);
		}
		public List<R__breakContext> r__break() {
			return getRuleContexts(R__breakContext.class);
		}
		public R__breakContext r__break(int i) {
			return getRuleContext(R__breakContext.class,i);
		}
		public AppointmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterAppointment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitAppointment(this);
		}
	}

	public final AppointmentContext appointment() throws RecognitionException {
		AppointmentContext _localctx = new AppointmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_appointment);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTAppointment _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTAppointment();
		((AppointmentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__3);
			{
			setState(231);
			((AppointmentContext)_localctx).tmp0 = match(String);
			 addToIteratedAttributeIfNotNull(_aNode.getStringList(), convertString(((AppointmentContext)_localctx).tmp0));
			}
			setState(234);
			match(LCURLY);
			setState(235);
			((AppointmentContext)_localctx).tmp1 = start();
			_aNode.setStart(_localctx.tmp1.ret);
			setState(237);
			((AppointmentContext)_localctx).tmp2 = end();
			_aNode.setEnd(_localctx.tmp2.ret);
			setState(239);
			match(T__4);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(240);
					((AppointmentContext)_localctx).tmp3 = match(String);
					 addToIteratedAttributeIfNotNull(_aNode.getStringList(), convertString(((AppointmentContext)_localctx).tmp3));
					}
					setState(243);
					match(T__5);
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==String) {
				{
				{
				{
				setState(249);
				((AppointmentContext)_localctx).tmp4 = match(String);
				 addToIteratedAttributeIfNotNull(_aNode.getStringList(), convertString(((AppointmentContext)_localctx).tmp4));
				}
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(257);
				((AppointmentContext)_localctx).tmp5 = r__break();
				addToIteratedAttributeIfNotNull(_aNode.getBreakList(), _localctx.tmp5.ret);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
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
		public appointments._ast.ASTStart ret = null;
		public StartContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Start_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterStart_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitStart_eof(this);
		}
	}

	public final Start_eofContext start_eof() throws RecognitionException {
		Start_eofContext _localctx = new Start_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_start_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((Start_eofContext)_localctx).tmp = start();
			((Start_eofContext)_localctx).ret =  ((Start_eofContext)_localctx).tmp.ret;
			setState(269);
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
		public appointments._ast.ASTStart ret = null;
		public DateContext tmp0;
		public TimeContext tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsAntlrParser.COLON, 0); }
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_start);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTStart _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTStart();
		((StartContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__10);
			setState(272);
			match(COLON);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(273);
				((StartContext)_localctx).tmp0 = date();
				_aNode.setDate(_localctx.tmp0.ret);
				}
				break;
			}
			setState(278);
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
		public appointments._ast.ASTEnd ret = null;
		public EndContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public End_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterEnd_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitEnd_eof(this);
		}
	}

	public final End_eofContext end_eof() throws RecognitionException {
		End_eofContext _localctx = new End_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_end_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((End_eofContext)_localctx).tmp = end();
			((End_eofContext)_localctx).ret =  ((End_eofContext)_localctx).tmp.ret;
			setState(283);
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
		public appointments._ast.ASTEnd ret = null;
		public DateContext tmp0;
		public TimeContext tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsAntlrParser.COLON, 0); }
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_end);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTEnd _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTEnd();
		((EndContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__11);
			setState(286);
			match(COLON);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(287);
				((EndContext)_localctx).tmp0 = date();
				_aNode.setDate(_localctx.tmp0.ret);
				}
				break;
			}
			setState(292);
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
		public appointments._ast.ASTDate ret = null;
		public DateContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Date_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterDate_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitDate_eof(this);
		}
	}

	public final Date_eofContext date_eof() throws RecognitionException {
		Date_eofContext _localctx = new Date_eofContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_date_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((Date_eofContext)_localctx).tmp = date();
			((Date_eofContext)_localctx).ret =  ((Date_eofContext)_localctx).tmp.ret;
			setState(297);
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
		public appointments._ast.ASTDate ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public List<TerminalNode> SLASH() { return getTokens(AppointmentsAntlrParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AppointmentsAntlrParser.SLASH, i);
		}
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_date);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTDate _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTDate();
		((DateContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			((DateContext)_localctx).tmp0 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((DateContext)_localctx).tmp0));
			}
			setState(302);
			match(SLASH);
			{
			setState(303);
			((DateContext)_localctx).tmp1 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((DateContext)_localctx).tmp1));
			}
			setState(306);
			match(SLASH);
			{
			setState(307);
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
		public appointments._ast.ASTTime ret = null;
		public TimeContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Time_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterTime_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitTime_eof(this);
		}
	}

	public final Time_eofContext time_eof() throws RecognitionException {
		Time_eofContext _localctx = new Time_eofContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_time_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((Time_eofContext)_localctx).tmp = time();
			((Time_eofContext)_localctx).ret =  ((Time_eofContext)_localctx).tmp.ret;
			setState(312);
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
		public appointments._ast.ASTTime ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode COLON() { return getToken(AppointmentsAntlrParser.COLON, 0); }
		public List<TerminalNode> Digits() { return getTokens(AppointmentsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(AppointmentsAntlrParser.Digits, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_time);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTTime _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTTime();
		((TimeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			((TimeContext)_localctx).tmp0 = match(Digits);
			 addToIteratedAttributeIfNotNull(_aNode.getDigitsList(), convertDigits(((TimeContext)_localctx).tmp0));
			}
			setState(317);
			match(COLON);
			{
			setState(318);
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
		public appointments._ast.ASTBreak ret = null;
		public R__breakContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public R__breakContext r__break() {
			return getRuleContext(R__breakContext.class,0);
		}
		public R__break_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r__break_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterR__break_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitR__break_eof(this);
		}
	}

	public final R__break_eofContext r__break_eof() throws RecognitionException {
		R__break_eofContext _localctx = new R__break_eofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_r__break_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			((R__break_eofContext)_localctx).tmp = r__break();
			((R__break_eofContext)_localctx).ret =  ((R__break_eofContext)_localctx).tmp.ret;
			setState(323);
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
		public appointments._ast.ASTBreak ret = null;
		public StartContext tmp0;
		public EndContext tmp1;
		public TerminalNode LCURLY() { return getToken(AppointmentsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AppointmentsAntlrParser.RCURLY, 0); }
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterR__break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitR__break(this);
		}
	}

	public final R__breakContext r__break() throws RecognitionException {
		R__breakContext _localctx = new R__breakContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_r__break);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		appointments._ast.ASTBreak _aNode = null;
		_aNode=appointments._ast.AppointmentsNodeFactory.createASTBreak();
		((R__breakContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__12);
			setState(326);
			match(LCURLY);
			setState(327);
			((R__breakContext)_localctx).tmp0 = start();
			_aNode.setStart(_localctx.tmp0.ret);
			setState(329);
			((R__breakContext)_localctx).tmp1 = end();
			_aNode.setEnd(_localctx.tmp1.ret);
			setState(331);
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

	public static class Literal_eofContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret = null;
		public LiteralContext tmp;
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(335);
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
		public NullLiteralContext tmp2;
		public BooleanLiteralContext tmp3;
		public CharLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public NumericLiteralContext tmp6;
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				((LiteralContext)_localctx).tmp2 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((LiteralContext)_localctx).tmp3 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				((LiteralContext)_localctx).tmp4 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				((LiteralContext)_localctx).tmp5 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				((LiteralContext)_localctx).tmp6 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp6.ret;
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedLiteralContext signedLiteral() {
			return getRuleContext(SignedLiteralContext.class,0);
		}
		public SignedLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedLiteral_eof(this);
		}
	}

	public final SignedLiteral_eofContext signedLiteral_eof() throws RecognitionException {
		SignedLiteral_eofContext _localctx = new SignedLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_signedLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((SignedLiteral_eofContext)_localctx).tmp = signedLiteral();
			((SignedLiteral_eofContext)_localctx).ret =  ((SignedLiteral_eofContext)_localctx).tmp.ret;
			setState(356);
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
		public NullLiteralContext tmp2;
		public BooleanLiteralContext tmp3;
		public CharLiteralContext tmp4;
		public StringLiteralContext tmp5;
		public SignedNumericLiteralContext tmp7;
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedLiteral(this);
		}
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_signedLiteral);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				((SignedLiteralContext)_localctx).tmp2 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((SignedLiteralContext)_localctx).tmp3 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				((SignedLiteralContext)_localctx).tmp4 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp4.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				((SignedLiteralContext)_localctx).tmp5 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case MINUS:
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				((SignedLiteralContext)_localctx).tmp7 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp7.ret;
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNumericLiteral_eof(this);
		}
	}

	public final NumericLiteral_eofContext numericLiteral_eof() throws RecognitionException {
		NumericLiteral_eofContext _localctx = new NumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_numericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((NumericLiteral_eofContext)_localctx).tmp = numericLiteral();
			((NumericLiteral_eofContext)_localctx).ret =  ((NumericLiteral_eofContext)_localctx).tmp.ret;
			setState(377);
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
		public NatLiteralContext tmp8;
		public BasicLongLiteralContext tmp9;
		public BasicFloatLiteralContext tmp10;
		public BasicDoubleLiteralContext tmp11;
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_numericLiteral);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				((NumericLiteralContext)_localctx).tmp8 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				((NumericLiteralContext)_localctx).tmp9 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((NumericLiteralContext)_localctx).tmp10 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				((NumericLiteralContext)_localctx).tmp11 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp11.ret;
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
		public TerminalNode EOF() { return getToken(AppointmentsAntlrParser.EOF, 0); }
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedNumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedNumericLiteral_eof(this);
		}
	}

	public final SignedNumericLiteral_eofContext signedNumericLiteral_eof() throws RecognitionException {
		SignedNumericLiteral_eofContext _localctx = new SignedNumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_signedNumericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((SignedNumericLiteral_eofContext)_localctx).tmp = signedNumericLiteral();
			((SignedNumericLiteral_eofContext)_localctx).ret =  ((SignedNumericLiteral_eofContext)_localctx).tmp.ret;
			setState(395);
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
		public SignedNatLiteralContext tmp12;
		public SignedBasicLongLiteralContext tmp13;
		public SignedBasicFloatLiteralContext tmp14;
		public SignedBasicDoubleLiteralContext tmp15;
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
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).enterSignedNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AppointmentsAntlrListener ) ((AppointmentsAntlrListener)listener).exitSignedNumericLiteral(this);
		}
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_signedNumericLiteral);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				((SignedNumericLiteralContext)_localctx).tmp14 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp14.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				((SignedNumericLiteralContext)_localctx).tmp15 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp15.ret;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u019e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"i\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0086\n\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\5\21\u009d\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00bd\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u00dc\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33\7\33\u00fe\n\33\f\33"+
		"\16\33\u0101\13\33\3\33\3\33\3\33\3\33\7\33\u0107\n\33\f\33\16\33\u010a"+
		"\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0117"+
		"\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0125\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0163\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u0178\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u018a\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u019c\n"+
		"-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVX\2\3\3\2\t\f\2\u0189\2Z\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2"+
		"\bh\3\2\2\2\nj\3\2\2\2\fn\3\2\2\2\16q\3\2\2\2\20u\3\2\2\2\22x\3\2\2\2"+
		"\24|\3\2\2\2\26\177\3\2\2\2\30\u0085\3\2\2\2\32\u008a\3\2\2\2\34\u008e"+
		"\3\2\2\2\36\u0096\3\2\2\2 \u009c\3\2\2\2\"\u00a6\3\2\2\2$\u00aa\3\2\2"+
		"\2&\u00b6\3\2\2\2(\u00bc\3\2\2\2*\u00ca\3\2\2\2,\u00ce\3\2\2\2.\u00d5"+
		"\3\2\2\2\60\u00db\3\2\2\2\62\u00e4\3\2\2\2\64\u00e8\3\2\2\2\66\u010d\3"+
		"\2\2\28\u0111\3\2\2\2:\u011b\3\2\2\2<\u011f\3\2\2\2>\u0129\3\2\2\2@\u012d"+
		"\3\2\2\2B\u0138\3\2\2\2D\u013c\3\2\2\2F\u0143\3\2\2\2H\u0147\3\2\2\2J"+
		"\u014f\3\2\2\2L\u0162\3\2\2\2N\u0164\3\2\2\2P\u0177\3\2\2\2R\u0179\3\2"+
		"\2\2T\u0189\3\2\2\2V\u018b\3\2\2\2X\u019b\3\2\2\2Z[\5\4\3\2[\\\b\2\1\2"+
		"\\]\7\2\2\3]\3\3\2\2\2^_\7\3\2\2_\5\3\2\2\2`a\5\b\5\2ab\b\4\1\2bc\7\2"+
		"\2\3c\7\3\2\2\2de\7\4\2\2ei\b\5\1\2fg\7\5\2\2gi\b\5\1\2hd\3\2\2\2hf\3"+
		"\2\2\2i\t\3\2\2\2jk\5\f\7\2kl\b\6\1\2lm\7\2\2\3m\13\3\2\2\2no\7\33\2\2"+
		"op\b\7\1\2p\r\3\2\2\2qr\5\20\t\2rs\b\b\1\2st\7\2\2\3t\17\3\2\2\2uv\7\34"+
		"\2\2vw\b\t\1\2w\21\3\2\2\2xy\5\24\13\2yz\b\n\1\2z{\7\2\2\3{\23\3\2\2\2"+
		"|}\7\32\2\2}~\b\13\1\2~\25\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\b\f"+
		"\1\2\u0081\u0082\7\2\2\3\u0082\27\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0086"+
		"\b\r\1\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\7\32\2\2\u0088\u0089\b\r\1\2\u0089\31\3\2\2\2\u008a\u008b\5\34"+
		"\17\2\u008b\u008c\b\16\1\2\u008c\u008d\7\2\2\3\u008d\33\3\2\2\2\u008e"+
		"\u008f\7\32\2\2\u008f\u0090\b\17\1\2\u0090\u0091\3\2\2\2\u0091\u0092\7"+
		"\26\2\2\u0092\u0093\b\17\1\2\u0093\u0094\3\2\2\2\u0094\u0095\6\17\2\2"+
		"\u0095\35\3\2\2\2\u0096\u0097\5 \21\2\u0097\u0098\b\20\1\2\u0098\u0099"+
		"\7\2\2\3\u0099\37\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009d\b\21\1\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\32"+
		"\2\2\u009f\u00a0\b\21\1\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2"+
		"\u00a3\b\21\1\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\6\21\3\2\u00a5!\3\2\2"+
		"\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\b\22\1\2\u00a8\u00a9\7\2\2\3\u00a9"+
		"#\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\b\23\1\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\b\23\1\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\b\23\1\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\6\23\4\2\u00b5%\3\2\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8"+
		"\b\24\1\2\u00b8\u00b9\7\2\2\3\u00b9\'\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb"+
		"\u00bd\b\25\1\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\b\25\1\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\24\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\b\25\1\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\b\25\1\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c9\6\25\5\2\u00c9)\3\2\2\2\u00ca\u00cb\5,\27\2\u00cb\u00cc\b"+
		"\26\1\2\u00cc\u00cd\7\2\2\3\u00cd+\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf"+
		"\u00d0\b\27\1\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\7"+
		"\32\2\2\u00d3\u00d4\b\27\1\2\u00d4-\3\2\2\2\u00d5\u00d6\5\60\31\2\u00d6"+
		"\u00d7\b\30\1\2\u00d7\u00d8\7\2\2\3\u00d8/\3\2\2\2\u00d9\u00da\7\22\2"+
		"\2\u00da\u00dc\b\31\1\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\32\2\2\u00de\u00df\b\31\1\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e3\b\31\1\2"+
		"\u00e3\61\3\2\2\2\u00e4\u00e5\5\64\33\2\u00e5\u00e6\b\32\1\2\u00e6\u00e7"+
		"\7\2\2\3\u00e7\63\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\7\34\2\2\u00ea"+
		"\u00eb\b\33\1\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5"+
		"8\35\2\u00ee\u00ef\b\33\1\2\u00ef\u00f0\5<\37\2\u00f0\u00f1\b\33\1\2\u00f1"+
		"\u00f8\7\7\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00f4\b\33\1\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f7\7\b\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00ff\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\34\2\2\u00fc\u00fe\b\33\1\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0108\t\2\2\2\u0103\u0104\5H%\2\u0104\u0105"+
		"\b\33\1\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\7\23\2\2\u010c\65\3\2\2\2\u010d\u010e\58\35\2\u010e"+
		"\u010f\b\34\1\2\u010f\u0110\7\2\2\3\u0110\67\3\2\2\2\u0111\u0112\7\r\2"+
		"\2\u0112\u0116\7\20\2\2\u0113\u0114\5@!\2\u0114\u0115\b\35\1\2\u0115\u0117"+
		"\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\5D#\2\u0119\u011a\b\35\1\2\u011a9\3\2\2\2\u011b\u011c\5<\37\2\u011c"+
		"\u011d\b\36\1\2\u011d\u011e\7\2\2\3\u011e;\3\2\2\2\u011f\u0120\7\16\2"+
		"\2\u0120\u0124\7\20\2\2\u0121\u0122\5@!\2\u0122\u0123\b\37\1\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\5D#\2\u0127\u0128\b\37\1\2\u0128=\3\2\2\2\u0129\u012a\5@!\2\u012a"+
		"\u012b\b \1\2\u012b\u012c\7\2\2\3\u012c?\3\2\2\2\u012d\u012e\7\32\2\2"+
		"\u012e\u012f\b!\1\2\u012f\u0130\3\2\2\2\u0130\u0131\7\25\2\2\u0131\u0132"+
		"\7\32\2\2\u0132\u0133\b!\1\2\u0133\u0134\3\2\2\2\u0134\u0135\7\25\2\2"+
		"\u0135\u0136\7\32\2\2\u0136\u0137\b!\1\2\u0137A\3\2\2\2\u0138\u0139\5"+
		"D#\2\u0139\u013a\b\"\1\2\u013a\u013b\7\2\2\3\u013bC\3\2\2\2\u013c\u013d"+
		"\7\32\2\2\u013d\u013e\b#\1\2\u013e\u013f\3\2\2\2\u013f\u0140\7\20\2\2"+
		"\u0140\u0141\7\32\2\2\u0141\u0142\b#\1\2\u0142E\3\2\2\2\u0143\u0144\5"+
		"H%\2\u0144\u0145\b$\1\2\u0145\u0146\7\2\2\3\u0146G\3\2\2\2\u0147\u0148"+
		"\7\17\2\2\u0148\u0149\7\21\2\2\u0149\u014a\58\35\2\u014a\u014b\b%\1\2"+
		"\u014b\u014c\5<\37\2\u014c\u014d\b%\1\2\u014d\u014e\7\23\2\2\u014eI\3"+
		"\2\2\2\u014f\u0150\5L\'\2\u0150\u0151\b&\1\2\u0151\u0152\7\2\2\3\u0152"+
		"K\3\2\2\2\u0153\u0154\5\4\3\2\u0154\u0155\b\'\1\2\u0155\u0163\3\2\2\2"+
		"\u0156\u0157\5\b\5\2\u0157\u0158\b\'\1\2\u0158\u0163\3\2\2\2\u0159\u015a"+
		"\5\f\7\2\u015a\u015b\b\'\1\2\u015b\u0163\3\2\2\2\u015c\u015d\5\20\t\2"+
		"\u015d\u015e\b\'\1\2\u015e\u0163\3\2\2\2\u015f\u0160\5T+\2\u0160\u0161"+
		"\b\'\1\2\u0161\u0163\3\2\2\2\u0162\u0153\3\2\2\2\u0162\u0156\3\2\2\2\u0162"+
		"\u0159\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0163M\3\2\2\2"+
		"\u0164\u0165\5P)\2\u0165\u0166\b(\1\2\u0166\u0167\7\2\2\3\u0167O\3\2\2"+
		"\2\u0168\u0169\5\4\3\2\u0169\u016a\b)\1\2\u016a\u0178\3\2\2\2\u016b\u016c"+
		"\5\b\5\2\u016c\u016d\b)\1\2\u016d\u0178\3\2\2\2\u016e\u016f\5\f\7\2\u016f"+
		"\u0170\b)\1\2\u0170\u0178\3\2\2\2\u0171\u0172\5\20\t\2\u0172\u0173\b)"+
		"\1\2\u0173\u0178\3\2\2\2\u0174\u0175\5X-\2\u0175\u0176\b)\1\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0168\3\2\2\2\u0177\u016b\3\2\2\2\u0177\u016e\3\2\2\2\u0177"+
		"\u0171\3\2\2\2\u0177\u0174\3\2\2\2\u0178Q\3\2\2\2\u0179\u017a\5T+\2\u017a"+
		"\u017b\b*\1\2\u017b\u017c\7\2\2\3\u017cS\3\2\2\2\u017d\u017e\5\24\13\2"+
		"\u017e\u017f\b+\1\2\u017f\u018a\3\2\2\2\u0180\u0181\5\34\17\2\u0181\u0182"+
		"\b+\1\2\u0182\u018a\3\2\2\2\u0183\u0184\5$\23\2\u0184\u0185\b+\1\2\u0185"+
		"\u018a\3\2\2\2\u0186\u0187\5,\27\2\u0187\u0188\b+\1\2\u0188\u018a\3\2"+
		"\2\2\u0189\u017d\3\2\2\2\u0189\u0180\3\2\2\2\u0189\u0183\3\2\2\2\u0189"+
		"\u0186\3\2\2\2\u018aU\3\2\2\2\u018b\u018c\5X-\2\u018c\u018d\b,\1\2\u018d"+
		"\u018e\7\2\2\3\u018eW\3\2\2\2\u018f\u0190\5\30\r\2\u0190\u0191\b-\1\2"+
		"\u0191\u019c\3\2\2\2\u0192\u0193\5 \21\2\u0193\u0194\b-\1\2\u0194\u019c"+
		"\3\2\2\2\u0195\u0196\5(\25\2\u0196\u0197\b-\1\2\u0197\u019c\3\2\2\2\u0198"+
		"\u0199\5\60\31\2\u0199\u019a\b-\1\2\u019a\u019c\3\2\2\2\u019b\u018f\3"+
		"\2\2\2\u019b\u0192\3\2\2\2\u019b\u0195\3\2\2\2\u019b\u0198\3\2\2\2\u019c"+
		"Y\3\2\2\2\20h\u0085\u009c\u00bc\u00db\u00f8\u00ff\u0108\u0116\u0124\u0162"+
		"\u0177\u0189\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}