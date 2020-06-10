// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/calendars/_parser/CalendarsAntlr.g4 by ANTLR 4.7.1

package calendars._parser;
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
public class CalendarsAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MINUS=5, POINT=6, Name=7, WS=8, SL_COMMENT=9, 
		ML_COMMENT=10, Digits=11, Char=12, String=13;
	public static final int
		RULE_nullLiteral_eof = 0, RULE_nullLiteral = 1, RULE_booleanLiteral_eof = 2, 
		RULE_booleanLiteral = 3, RULE_charLiteral_eof = 4, RULE_charLiteral = 5, 
		RULE_stringLiteral_eof = 6, RULE_stringLiteral = 7, RULE_natLiteral_eof = 8, 
		RULE_natLiteral = 9, RULE_signedNatLiteral_eof = 10, RULE_signedNatLiteral = 11, 
		RULE_basicLongLiteral_eof = 12, RULE_basicLongLiteral = 13, RULE_signedBasicLongLiteral_eof = 14, 
		RULE_signedBasicLongLiteral = 15, RULE_basicFloatLiteral_eof = 16, RULE_basicFloatLiteral = 17, 
		RULE_signedBasicFloatLiteral_eof = 18, RULE_signedBasicFloatLiteral = 19, 
		RULE_basicDoubleLiteral_eof = 20, RULE_basicDoubleLiteral = 21, RULE_signedBasicDoubleLiteral_eof = 22, 
		RULE_signedBasicDoubleLiteral = 23, RULE_calendars_eof = 24, RULE_calendars = 25, 
		RULE_literal_eof = 26, RULE_literal = 27, RULE_signedLiteral_eof = 28, 
		RULE_signedLiteral = 29, RULE_numericLiteral_eof = 30, RULE_numericLiteral = 31, 
		RULE_signedNumericLiteral_eof = 32, RULE_signedNumericLiteral = 33, RULE_appointments_eof = 34, 
		RULE_appointments = 35;
	public static final String[] ruleNames = {
		"nullLiteral_eof", "nullLiteral", "booleanLiteral_eof", "booleanLiteral", 
		"charLiteral_eof", "charLiteral", "stringLiteral_eof", "stringLiteral", 
		"natLiteral_eof", "natLiteral", "signedNatLiteral_eof", "signedNatLiteral", 
		"basicLongLiteral_eof", "basicLongLiteral", "signedBasicLongLiteral_eof", 
		"signedBasicLongLiteral", "basicFloatLiteral_eof", "basicFloatLiteral", 
		"signedBasicFloatLiteral_eof", "signedBasicFloatLiteral", "basicDoubleLiteral_eof", 
		"basicDoubleLiteral", "signedBasicDoubleLiteral_eof", "signedBasicDoubleLiteral", 
		"calendars_eof", "calendars", "literal_eof", "literal", "signedLiteral_eof", 
		"signedLiteral", "numericLiteral_eof", "numericLiteral", "signedNumericLiteral_eof", 
		"signedNumericLiteral", "appointments_eof", "appointments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'`s calendar:'", "'-'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MINUS", "POINT", "Name", "WS", "SL_COMMENT", 
		"ML_COMMENT", "Digits", "Char", "String"
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
	public String getGrammarFileName() { return "CalendarsAntlr.g4"; }

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


	public CalendarsAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext tmp;
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public NullLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNullLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNullLiteral_eof(this);
		}
	}

	public final NullLiteral_eofContext nullLiteral_eof() throws RecognitionException {
		NullLiteral_eofContext _localctx = new NullLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((NullLiteral_eofContext)_localctx).tmp = nullLiteral();
			((NullLiteral_eofContext)_localctx).ret =  ((NullLiteral_eofContext)_localctx).tmp.ret;
			setState(74);
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNullLiteral(this);
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
			setState(76);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBooleanLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBooleanLiteral_eof(this);
		}
	}

	public final BooleanLiteral_eofContext booleanLiteral_eof() throws RecognitionException {
		BooleanLiteral_eofContext _localctx = new BooleanLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((BooleanLiteral_eofContext)_localctx).tmp = booleanLiteral();
			((BooleanLiteral_eofContext)_localctx).ret =  ((BooleanLiteral_eofContext)_localctx).tmp.ret;
			setState(80);
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBooleanLiteral(this);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(82);
				match(T__1);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case T__2:
				{
				setState(84);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterCharLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitCharLiteral_eof(this);
		}
	}

	public final CharLiteral_eofContext charLiteral_eof() throws RecognitionException {
		CharLiteral_eofContext _localctx = new CharLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((CharLiteral_eofContext)_localctx).tmp = charLiteral();
			((CharLiteral_eofContext)_localctx).ret =  ((CharLiteral_eofContext)_localctx).tmp.ret;
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

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(CalendarsAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitCharLiteral(this);
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
			setState(92);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterStringLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitStringLiteral_eof(this);
		}
	}

	public final StringLiteral_eofContext stringLiteral_eof() throws RecognitionException {
		StringLiteral_eofContext _localctx = new StringLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((StringLiteral_eofContext)_localctx).tmp = stringLiteral();
			((StringLiteral_eofContext)_localctx).ret =  ((StringLiteral_eofContext)_localctx).tmp.ret;
			setState(97);
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
		public TerminalNode String() { return getToken(CalendarsAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitStringLiteral(this);
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
			setState(99);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public NatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNatLiteral_eof(this);
		}
	}

	public final NatLiteral_eofContext natLiteral_eof() throws RecognitionException {
		NatLiteral_eofContext _localctx = new NatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((NatLiteral_eofContext)_localctx).tmp = natLiteral();
			((NatLiteral_eofContext)_localctx).ret =  ((NatLiteral_eofContext)_localctx).tmp.ret;
			setState(104);
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
		public TerminalNode Digits() { return getToken(CalendarsAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNatLiteral(this);
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
			setState(106);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedNatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedNatLiteral_eof(this);
		}
	}

	public final SignedNatLiteral_eofContext signedNatLiteral_eof() throws RecognitionException {
		SignedNatLiteral_eofContext _localctx = new SignedNatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedNatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((SignedNatLiteral_eofContext)_localctx).tmp = signedNatLiteral();
			((SignedNatLiteral_eofContext)_localctx).ret =  ((SignedNatLiteral_eofContext)_localctx).tmp.ret;
			setState(111);
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
		public TerminalNode Digits() { return getToken(CalendarsAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(CalendarsAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedNatLiteral(this);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(113);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(117);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicLongLiteral_eof(this);
		}
	}

	public final BasicLongLiteral_eofContext basicLongLiteral_eof() throws RecognitionException {
		BasicLongLiteral_eofContext _localctx = new BasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((BasicLongLiteral_eofContext)_localctx).tmp = basicLongLiteral();
			((BasicLongLiteral_eofContext)_localctx).ret =  ((BasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(122);
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
		public TerminalNode Digits() { return getToken(CalendarsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(CalendarsAntlrParser.Name, 0); }
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicLongLiteral(this);
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
			setState(124);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(127);
			((BasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((BasicLongLiteralContext)_localctx).tmp1));
			}
			setState(130);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicLongLiteral_eof(this);
		}
	}

	public final SignedBasicLongLiteral_eofContext signedBasicLongLiteral_eof() throws RecognitionException {
		SignedBasicLongLiteral_eofContext _localctx = new SignedBasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signedBasicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((SignedBasicLongLiteral_eofContext)_localctx).tmp = signedBasicLongLiteral();
			((SignedBasicLongLiteral_eofContext)_localctx).ret =  ((SignedBasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(134);
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
		public TerminalNode Digits() { return getToken(CalendarsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(CalendarsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(CalendarsAntlrParser.MINUS, 0); }
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicLongLiteral(this);
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
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(136);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(140);
			((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(143);
			((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((SignedBasicLongLiteralContext)_localctx).tmp1));
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

	public static class BasicFloatLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public BasicFloatLiteralContext tmp;
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicFloatLiteral_eof(this);
		}
	}

	public final BasicFloatLiteral_eofContext basicFloatLiteral_eof() throws RecognitionException {
		BasicFloatLiteral_eofContext _localctx = new BasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((BasicFloatLiteral_eofContext)_localctx).tmp = basicFloatLiteral();
			((BasicFloatLiteral_eofContext)_localctx).ret =  ((BasicFloatLiteral_eofContext)_localctx).tmp.ret;
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

	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode POINT() { return getToken(CalendarsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(CalendarsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(CalendarsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(CalendarsAntlrParser.Name, 0); }
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicFloatLiteral(this);
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
			setState(152);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(155);
			match(POINT);
			{
			setState(156);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(159);
			((BasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((BasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(162);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicFloatLiteral_eof(this);
		}
	}

	public final SignedBasicFloatLiteral_eofContext signedBasicFloatLiteral_eof() throws RecognitionException {
		SignedBasicFloatLiteral_eofContext _localctx = new SignedBasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedBasicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((SignedBasicFloatLiteral_eofContext)_localctx).tmp = signedBasicFloatLiteral();
			((SignedBasicFloatLiteral_eofContext)_localctx).ret =  ((SignedBasicFloatLiteral_eofContext)_localctx).tmp.ret;
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

	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode POINT() { return getToken(CalendarsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(CalendarsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(CalendarsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(CalendarsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(CalendarsAntlrParser.MINUS, 0); }
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicFloatLiteral(this);
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
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(168);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(172);
			((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(175);
			match(POINT);
			{
			setState(176);
			((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(179);
			((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((SignedBasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(182);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public BasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicDoubleLiteral_eof(this);
		}
	}

	public final BasicDoubleLiteral_eofContext basicDoubleLiteral_eof() throws RecognitionException {
		BasicDoubleLiteral_eofContext _localctx = new BasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((BasicDoubleLiteral_eofContext)_localctx).tmp = basicDoubleLiteral();
			((BasicDoubleLiteral_eofContext)_localctx).ret =  ((BasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(186);
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
		public TerminalNode POINT() { return getToken(CalendarsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(CalendarsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(CalendarsAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitBasicDoubleLiteral(this);
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
			setState(188);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(191);
			match(POINT);
			{
			setState(192);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicDoubleLiteral_eof(this);
		}
	}

	public final SignedBasicDoubleLiteral_eofContext signedBasicDoubleLiteral_eof() throws RecognitionException {
		SignedBasicDoubleLiteral_eofContext _localctx = new SignedBasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedBasicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((SignedBasicDoubleLiteral_eofContext)_localctx).tmp = signedBasicDoubleLiteral();
			((SignedBasicDoubleLiteral_eofContext)_localctx).ret =  ((SignedBasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(197);
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
		public TerminalNode POINT() { return getToken(CalendarsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(CalendarsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(CalendarsAntlrParser.Digits, i);
		}
		public TerminalNode MINUS() { return getToken(CalendarsAntlrParser.MINUS, 0); }
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedBasicDoubleLiteral(this);
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(199);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(203);
			((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(206);
			match(POINT);
			{
			setState(207);
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

	public static class Calendars_eofContext extends ParserRuleContext {
		public calendars._ast.ASTCalendars ret = null;
		public CalendarsContext tmp;
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public CalendarsContext calendars() {
			return getRuleContext(CalendarsContext.class,0);
		}
		public Calendars_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendars_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterCalendars_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitCalendars_eof(this);
		}
	}

	public final Calendars_eofContext calendars_eof() throws RecognitionException {
		Calendars_eofContext _localctx = new Calendars_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_calendars_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((Calendars_eofContext)_localctx).tmp = calendars();
			((Calendars_eofContext)_localctx).ret =  ((Calendars_eofContext)_localctx).tmp.ret;
			setState(212);
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

	public static class CalendarsContext extends ParserRuleContext {
		public calendars._ast.ASTCalendars ret = null;
		public Token tmp0;
		public TerminalNode Name() { return getToken(CalendarsAntlrParser.Name, 0); }
		public CalendarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calendars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterCalendars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitCalendars(this);
		}
	}

	public final CalendarsContext calendars() throws RecognitionException {
		CalendarsContext _localctx = new CalendarsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_calendars);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		calendars._ast.ASTCalendars _aNode = null;
		_aNode=calendars._ast.CalendarsNodeFactory.createASTCalendars();
		((CalendarsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			((CalendarsContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((CalendarsContext)_localctx).tmp0));
			}
			setState(217);
			match(T__3);
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(221);
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
		public NullLiteralContext tmp1;
		public BooleanLiteralContext tmp2;
		public CharLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public NumericLiteralContext tmp5;
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((LiteralContext)_localctx).tmp1 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp1.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((LiteralContext)_localctx).tmp2 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				((LiteralContext)_localctx).tmp3 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				((LiteralContext)_localctx).tmp4 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				((LiteralContext)_localctx).tmp5 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedLiteralContext signedLiteral() {
			return getRuleContext(SignedLiteralContext.class,0);
		}
		public SignedLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedLiteral_eof(this);
		}
	}

	public final SignedLiteral_eofContext signedLiteral_eof() throws RecognitionException {
		SignedLiteral_eofContext _localctx = new SignedLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_signedLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((SignedLiteral_eofContext)_localctx).tmp = signedLiteral();
			((SignedLiteral_eofContext)_localctx).ret =  ((SignedLiteral_eofContext)_localctx).tmp.ret;
			setState(242);
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
		public NullLiteralContext tmp1;
		public BooleanLiteralContext tmp2;
		public CharLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public SignedNumericLiteralContext tmp6;
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedLiteral(this);
		}
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signedLiteral);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((SignedLiteralContext)_localctx).tmp1 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp1.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((SignedLiteralContext)_localctx).tmp2 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				((SignedLiteralContext)_localctx).tmp3 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				((SignedLiteralContext)_localctx).tmp4 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp4.ret;
				}
				break;
			case MINUS:
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				((SignedLiteralContext)_localctx).tmp6 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp6.ret;
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNumericLiteral_eof(this);
		}
	}

	public final NumericLiteral_eofContext numericLiteral_eof() throws RecognitionException {
		NumericLiteral_eofContext _localctx = new NumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((NumericLiteral_eofContext)_localctx).tmp = numericLiteral();
			((NumericLiteral_eofContext)_localctx).ret =  ((NumericLiteral_eofContext)_localctx).tmp.ret;
			setState(263);
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
		public NatLiteralContext tmp7;
		public BasicLongLiteralContext tmp8;
		public BasicFloatLiteralContext tmp9;
		public BasicDoubleLiteralContext tmp10;
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numericLiteral);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((NumericLiteralContext)_localctx).tmp7 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				((NumericLiteralContext)_localctx).tmp8 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				((NumericLiteralContext)_localctx).tmp9 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				((NumericLiteralContext)_localctx).tmp10 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
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
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedNumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedNumericLiteral_eof(this);
		}
	}

	public final SignedNumericLiteral_eofContext signedNumericLiteral_eof() throws RecognitionException {
		SignedNumericLiteral_eofContext _localctx = new SignedNumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_signedNumericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((SignedNumericLiteral_eofContext)_localctx).tmp = signedNumericLiteral();
			((SignedNumericLiteral_eofContext)_localctx).ret =  ((SignedNumericLiteral_eofContext)_localctx).tmp.ret;
			setState(281);
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
		public SignedNatLiteralContext tmp11;
		public SignedBasicLongLiteralContext tmp12;
		public SignedBasicFloatLiteralContext tmp13;
		public SignedBasicDoubleLiteralContext tmp14;
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
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterSignedNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitSignedNumericLiteral(this);
		}
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signedNumericLiteral);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				((SignedNumericLiteralContext)_localctx).tmp11 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				((SignedNumericLiteralContext)_localctx).tmp14 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp14.ret;
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

	public static class Appointments_eofContext extends ParserRuleContext {
		public calendars._ast.ASTAppointments ret = null;
		public AppointmentsContext tmp;
		public TerminalNode EOF() { return getToken(CalendarsAntlrParser.EOF, 0); }
		public AppointmentsContext appointments() {
			return getRuleContext(AppointmentsContext.class,0);
		}
		public Appointments_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointments_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterAppointments_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitAppointments_eof(this);
		}
	}

	public final Appointments_eofContext appointments_eof() throws RecognitionException {
		Appointments_eofContext _localctx = new Appointments_eofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_appointments_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((Appointments_eofContext)_localctx).tmp = appointments();
			((Appointments_eofContext)_localctx).ret =  ((Appointments_eofContext)_localctx).tmp.ret;
			setState(299);
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

	public static class AppointmentsContext extends ParserRuleContext {
		public calendars._ast.ASTAppointments ret;
		public AppointmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appointments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).enterAppointments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarsAntlrListener ) ((CalendarsAntlrListener)listener).exitAppointments(this);
		}
	}

	public final AppointmentsContext appointments() throws RecognitionException {
		AppointmentsContext _localctx = new AppointmentsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_appointments);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5"+
		"\rv\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u008d\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25"+
		"\u00ad\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u00cc\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u00f1\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0106\n\37\3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0118\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u012a\n#\3$\3$\3$\3$\3%\3%\3%\2\2&\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\2\2"+
		"\u0120\2J\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f^\3\2\2"+
		"\2\16a\3\2\2\2\20e\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2\26o\3\2\2\2\30u\3\2"+
		"\2\2\32z\3\2\2\2\34~\3\2\2\2\36\u0086\3\2\2\2 \u008c\3\2\2\2\"\u0096\3"+
		"\2\2\2$\u009a\3\2\2\2&\u00a6\3\2\2\2(\u00ac\3\2\2\2*\u00ba\3\2\2\2,\u00be"+
		"\3\2\2\2.\u00c5\3\2\2\2\60\u00cb\3\2\2\2\62\u00d4\3\2\2\2\64\u00d8\3\2"+
		"\2\2\66\u00dd\3\2\2\28\u00f0\3\2\2\2:\u00f2\3\2\2\2<\u0105\3\2\2\2>\u0107"+
		"\3\2\2\2@\u0117\3\2\2\2B\u0119\3\2\2\2D\u0129\3\2\2\2F\u012b\3\2\2\2H"+
		"\u012f\3\2\2\2JK\5\4\3\2KL\b\2\1\2LM\7\2\2\3M\3\3\2\2\2NO\7\3\2\2O\5\3"+
		"\2\2\2PQ\5\b\5\2QR\b\4\1\2RS\7\2\2\3S\7\3\2\2\2TU\7\4\2\2UY\b\5\1\2VW"+
		"\7\5\2\2WY\b\5\1\2XT\3\2\2\2XV\3\2\2\2Y\t\3\2\2\2Z[\5\f\7\2[\\\b\6\1\2"+
		"\\]\7\2\2\3]\13\3\2\2\2^_\7\16\2\2_`\b\7\1\2`\r\3\2\2\2ab\5\20\t\2bc\b"+
		"\b\1\2cd\7\2\2\3d\17\3\2\2\2ef\7\17\2\2fg\b\t\1\2g\21\3\2\2\2hi\5\24\13"+
		"\2ij\b\n\1\2jk\7\2\2\3k\23\3\2\2\2lm\7\r\2\2mn\b\13\1\2n\25\3\2\2\2op"+
		"\5\30\r\2pq\b\f\1\2qr\7\2\2\3r\27\3\2\2\2st\7\7\2\2tv\b\r\1\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\7\r\2\2xy\b\r\1\2y\31\3\2\2\2z{\5\34\17\2{|\b"+
		"\16\1\2|}\7\2\2\3}\33\3\2\2\2~\177\7\r\2\2\177\u0080\b\17\1\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\t\2\2\u0082\u0083\b\17\1\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\6\17\2\2\u0085\35\3\2\2\2\u0086\u0087\5 \21\2\u0087\u0088"+
		"\b\20\1\2\u0088\u0089\7\2\2\3\u0089\37\3\2\2\2\u008a\u008b\7\7\2\2\u008b"+
		"\u008d\b\21\1\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090\b\21\1\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\t\2\2\u0092\u0093\b\21\1\2\u0093\u0094\3\2\2\2\u0094\u0095\6"+
		"\21\3\2\u0095!\3\2\2\2\u0096\u0097\5$\23\2\u0097\u0098\b\22\1\2\u0098"+
		"\u0099\7\2\2\3\u0099#\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009c\b\23\1\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\7\b\2\2\u009e\u009f\7\r\2\2\u009f\u00a0"+
		"\b\23\1\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\b\23\1\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\6\23\4\2\u00a5%\3\2\2\2\u00a6\u00a7\5"+
		"(\25\2\u00a7\u00a8\b\24\1\2\u00a8\u00a9\7\2\2\3\u00a9\'\3\2\2\2\u00aa"+
		"\u00ab\7\7\2\2\u00ab\u00ad\b\25\1\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\b\25\1\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\b\25"+
		"\1\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\b\25\1\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\6\25\5\2\u00b9)\3\2\2\2\u00ba\u00bb\5,\27\2"+
		"\u00bb\u00bc\b\26\1\2\u00bc\u00bd\7\2\2\3\u00bd+\3\2\2\2\u00be\u00bf\7"+
		"\r\2\2\u00bf\u00c0\b\27\1\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\b\2\2\u00c2"+
		"\u00c3\7\r\2\2\u00c3\u00c4\b\27\1\2\u00c4-\3\2\2\2\u00c5\u00c6\5\60\31"+
		"\2\u00c6\u00c7\b\30\1\2\u00c7\u00c8\7\2\2\3\u00c8/\3\2\2\2\u00c9\u00ca"+
		"\7\7\2\2\u00ca\u00cc\b\31\1\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\b\31\1\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00d3\b\31\1\2"+
		"\u00d3\61\3\2\2\2\u00d4\u00d5\5\64\33\2\u00d5\u00d6\b\32\1\2\u00d6\u00d7"+
		"\7\2\2\3\u00d7\63\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\b\33\1\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\65\3\2\2\2\u00dd\u00de\58\35"+
		"\2\u00de\u00df\b\34\1\2\u00df\u00e0\7\2\2\3\u00e0\67\3\2\2\2\u00e1\u00e2"+
		"\5\4\3\2\u00e2\u00e3\b\35\1\2\u00e3\u00f1\3\2\2\2\u00e4\u00e5\5\b\5\2"+
		"\u00e5\u00e6\b\35\1\2\u00e6\u00f1\3\2\2\2\u00e7\u00e8\5\f\7\2\u00e8\u00e9"+
		"\b\35\1\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\5\20\t\2\u00eb\u00ec\b\35\1"+
		"\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\5@!\2\u00ee\u00ef\b\35\1\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0"+
		"\u00ea\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f19\3\2\2\2\u00f2\u00f3\5<\37\2"+
		"\u00f3\u00f4\b\36\1\2\u00f4\u00f5\7\2\2\3\u00f5;\3\2\2\2\u00f6\u00f7\5"+
		"\4\3\2\u00f7\u00f8\b\37\1\2\u00f8\u0106\3\2\2\2\u00f9\u00fa\5\b\5\2\u00fa"+
		"\u00fb\b\37\1\2\u00fb\u0106\3\2\2\2\u00fc\u00fd\5\f\7\2\u00fd\u00fe\b"+
		"\37\1\2\u00fe\u0106\3\2\2\2\u00ff\u0100\5\20\t\2\u0100\u0101\b\37\1\2"+
		"\u0101\u0106\3\2\2\2\u0102\u0103\5D#\2\u0103\u0104\b\37\1\2\u0104\u0106"+
		"\3\2\2\2\u0105\u00f6\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0105\u0102\3\2\2\2\u0106=\3\2\2\2\u0107\u0108\5@!\2\u0108"+
		"\u0109\b \1\2\u0109\u010a\7\2\2\3\u010a?\3\2\2\2\u010b\u010c\5\24\13\2"+
		"\u010c\u010d\b!\1\2\u010d\u0118\3\2\2\2\u010e\u010f\5\34\17\2\u010f\u0110"+
		"\b!\1\2\u0110\u0118\3\2\2\2\u0111\u0112\5$\23\2\u0112\u0113\b!\1\2\u0113"+
		"\u0118\3\2\2\2\u0114\u0115\5,\27\2\u0115\u0116\b!\1\2\u0116\u0118\3\2"+
		"\2\2\u0117\u010b\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u0111\3\2\2\2\u0117"+
		"\u0114\3\2\2\2\u0118A\3\2\2\2\u0119\u011a\5D#\2\u011a\u011b\b\"\1\2\u011b"+
		"\u011c\7\2\2\3\u011cC\3\2\2\2\u011d\u011e\5\30\r\2\u011e\u011f\b#\1\2"+
		"\u011f\u012a\3\2\2\2\u0120\u0121\5 \21\2\u0121\u0122\b#\1\2\u0122\u012a"+
		"\3\2\2\2\u0123\u0124\5(\25\2\u0124\u0125\b#\1\2\u0125\u012a\3\2\2\2\u0126"+
		"\u0127\5\60\31\2\u0127\u0128\b#\1\2\u0128\u012a\3\2\2\2\u0129\u011d\3"+
		"\2\2\2\u0129\u0120\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a"+
		"E\3\2\2\2\u012b\u012c\5H%\2\u012c\u012d\b$\1\2\u012d\u012e\7\2\2\3\u012e"+
		"G\3\2\2\2\u012f\u0130\3\2\2\2\u0130I\3\2\2\2\13Xu\u008c\u00ac\u00cb\u00f0"+
		"\u0105\u0117\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}