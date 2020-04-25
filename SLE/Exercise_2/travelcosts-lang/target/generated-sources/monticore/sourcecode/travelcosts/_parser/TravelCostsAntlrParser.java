// Generated from /Users/hhk/Documents/GitHub/Code/SLE/Exercise_2/travelcosts-lang/target/generated-sources/monticore/sourcecode/travelcosts/_parser/TravelCostsAntlr.g4 by ANTLR 4.7.1

package travelcosts._parser;
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
public class TravelCostsAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, RPAREN=20, COLON=21, LCURLY=22, MINUS=23, RCURLY=24, 
		POINT=25, Name=26, WS=27, SL_COMMENT=28, ML_COMMENT=29, Digits=30, Char=31, 
		String=32;
	public static final int
		RULE_nullLiteral_eof = 0, RULE_nullLiteral = 1, RULE_booleanLiteral_eof = 2, 
		RULE_booleanLiteral = 3, RULE_charLiteral_eof = 4, RULE_charLiteral = 5, 
		RULE_stringLiteral_eof = 6, RULE_stringLiteral = 7, RULE_natLiteral_eof = 8, 
		RULE_natLiteral = 9, RULE_signedNatLiteral_eof = 10, RULE_signedNatLiteral = 11, 
		RULE_basicLongLiteral_eof = 12, RULE_basicLongLiteral = 13, RULE_signedBasicLongLiteral_eof = 14, 
		RULE_signedBasicLongLiteral = 15, RULE_basicFloatLiteral_eof = 16, RULE_basicFloatLiteral = 17, 
		RULE_signedBasicFloatLiteral_eof = 18, RULE_signedBasicFloatLiteral = 19, 
		RULE_basicDoubleLiteral_eof = 20, RULE_basicDoubleLiteral = 21, RULE_signedBasicDoubleLiteral_eof = 22, 
		RULE_signedBasicDoubleLiteral = 23, RULE_travelExpenseReport_eof = 24, 
		RULE_travelExpenseReport = 25, RULE_travelNumber_eof = 26, RULE_travelNumber = 27, 
		RULE_arrival_eof = 28, RULE_arrival = 29, RULE_workDay_eof = 30, RULE_workDay = 31, 
		RULE_allWorkDays_eof = 32, RULE_allWorkDays = 33, RULE_departure_eof = 34, 
		RULE_departure = 35, RULE_costItems_eof = 36, RULE_costItems = 37, RULE_costItem_eof = 38, 
		RULE_costItem = 39, RULE_hotelCost_eof = 40, RULE_hotelCost = 41, RULE_transportCost_eof = 42, 
		RULE_transportCost = 43, RULE_extraCost_eof = 44, RULE_extraCost = 45, 
		RULE_description_eof = 46, RULE_description = 47, RULE_iSODate_eof = 48, 
		RULE_iSODate = 49, RULE_time_eof = 50, RULE_time = 51, RULE_duration_eof = 52, 
		RULE_duration = 53, RULE_travelMeans = 54, RULE_literal_eof = 55, RULE_literal = 56, 
		RULE_signedLiteral_eof = 57, RULE_signedLiteral = 58, RULE_numericLiteral_eof = 59, 
		RULE_numericLiteral = 60, RULE_signedNumericLiteral_eof = 61, RULE_signedNumericLiteral = 62, 
		RULE_cost_eof = 63, RULE_cost = 64;
	public static final String[] ruleNames = {
		"nullLiteral_eof", "nullLiteral", "booleanLiteral_eof", "booleanLiteral", 
		"charLiteral_eof", "charLiteral", "stringLiteral_eof", "stringLiteral", 
		"natLiteral_eof", "natLiteral", "signedNatLiteral_eof", "signedNatLiteral", 
		"basicLongLiteral_eof", "basicLongLiteral", "signedBasicLongLiteral_eof", 
		"signedBasicLongLiteral", "basicFloatLiteral_eof", "basicFloatLiteral", 
		"signedBasicFloatLiteral_eof", "signedBasicFloatLiteral", "basicDoubleLiteral_eof", 
		"basicDoubleLiteral", "signedBasicDoubleLiteral_eof", "signedBasicDoubleLiteral", 
		"travelExpenseReport_eof", "travelExpenseReport", "travelNumber_eof", 
		"travelNumber", "arrival_eof", "arrival", "workDay_eof", "workDay", "allWorkDays_eof", 
		"allWorkDays", "departure_eof", "departure", "costItems_eof", "costItems", 
		"costItem_eof", "costItem", "hotelCost_eof", "hotelCost", "transportCost_eof", 
		"transportCost", "extraCost_eof", "extraCost", "description_eof", "description", 
		"iSODate_eof", "iSODate", "time_eof", "time", "duration_eof", "duration", 
		"travelMeans", "literal_eof", "literal", "signedLiteral_eof", "signedLiteral", 
		"numericLiteral_eof", "numericLiteral", "signedNumericLiteral_eof", "signedNumericLiteral", 
		"cost_eof", "cost"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'Dienstreise'", "'Reisenummer'", 
		"'Anreise'", "'Arbeitstag'", "'Arbeitstage'", "'Abreise'", "'Kosten'", 
		"'\u20AC'", "'$'", "'Hotel'", "'Fahrt'", "'Nebenkosten'", "'Zug'", "'Flug'", 
		"'\u00D6PNV'", "'Taxi'", "')'", "':'", "'{'", "'-'", "'}'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "RPAREN", "COLON", "LCURLY", 
		"MINUS", "RCURLY", "POINT", "Name", "WS", "SL_COMMENT", "ML_COMMENT", 
		"Digits", "Char", "String"
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
	public String getGrammarFileName() { return "TravelCostsAntlr.g4"; }

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


	public TravelCostsAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public NullLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNullLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNullLiteral_eof(this);
		}
	}

	public final NullLiteral_eofContext nullLiteral_eof() throws RecognitionException {
		NullLiteral_eofContext _localctx = new NullLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((NullLiteral_eofContext)_localctx).tmp = nullLiteral();
			((NullLiteral_eofContext)_localctx).ret =  ((NullLiteral_eofContext)_localctx).tmp.ret;
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

	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNullLiteral(this);
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
			setState(134);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBooleanLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBooleanLiteral_eof(this);
		}
	}

	public final BooleanLiteral_eofContext booleanLiteral_eof() throws RecognitionException {
		BooleanLiteral_eofContext _localctx = new BooleanLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((BooleanLiteral_eofContext)_localctx).tmp = booleanLiteral();
			((BooleanLiteral_eofContext)_localctx).ret =  ((BooleanLiteral_eofContext)_localctx).tmp.ret;
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBooleanLiteral(this);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(140);
				match(T__1);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case T__2:
				{
				setState(142);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCharLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCharLiteral_eof(this);
		}
	}

	public final CharLiteral_eofContext charLiteral_eof() throws RecognitionException {
		CharLiteral_eofContext _localctx = new CharLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((CharLiteral_eofContext)_localctx).tmp = charLiteral();
			((CharLiteral_eofContext)_localctx).ret =  ((CharLiteral_eofContext)_localctx).tmp.ret;
			setState(148);
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
		public TerminalNode Char() { return getToken(TravelCostsAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCharLiteral(this);
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
			setState(150);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterStringLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitStringLiteral_eof(this);
		}
	}

	public final StringLiteral_eofContext stringLiteral_eof() throws RecognitionException {
		StringLiteral_eofContext _localctx = new StringLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((StringLiteral_eofContext)_localctx).tmp = stringLiteral();
			((StringLiteral_eofContext)_localctx).ret =  ((StringLiteral_eofContext)_localctx).tmp.ret;
			setState(155);
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
		public TerminalNode String() { return getToken(TravelCostsAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitStringLiteral(this);
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
			setState(157);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public NatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNatLiteral_eof(this);
		}
	}

	public final NatLiteral_eofContext natLiteral_eof() throws RecognitionException {
		NatLiteral_eofContext _localctx = new NatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((NatLiteral_eofContext)_localctx).tmp = natLiteral();
			((NatLiteral_eofContext)_localctx).ret =  ((NatLiteral_eofContext)_localctx).tmp.ret;
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

	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(TravelCostsAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNatLiteral(this);
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
			setState(164);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedNatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedNatLiteral_eof(this);
		}
	}

	public final SignedNatLiteral_eofContext signedNatLiteral_eof() throws RecognitionException {
		SignedNatLiteral_eofContext _localctx = new SignedNatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedNatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((SignedNatLiteral_eofContext)_localctx).tmp = signedNatLiteral();
			((SignedNatLiteral_eofContext)_localctx).ret =  ((SignedNatLiteral_eofContext)_localctx).tmp.ret;
			setState(169);
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
		public TerminalNode Digits() { return getToken(TravelCostsAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedNatLiteral(this);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(171);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(175);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicLongLiteral_eof(this);
		}
	}

	public final BasicLongLiteral_eofContext basicLongLiteral_eof() throws RecognitionException {
		BasicLongLiteral_eofContext _localctx = new BasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((BasicLongLiteral_eofContext)_localctx).tmp = basicLongLiteral();
			((BasicLongLiteral_eofContext)_localctx).ret =  ((BasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(180);
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
		public TerminalNode Digits() { return getToken(TravelCostsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicLongLiteral(this);
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
			setState(182);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(185);
			((BasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((BasicLongLiteralContext)_localctx).tmp1));
			}
			setState(188);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicLongLiteral_eof(this);
		}
	}

	public final SignedBasicLongLiteral_eofContext signedBasicLongLiteral_eof() throws RecognitionException {
		SignedBasicLongLiteral_eofContext _localctx = new SignedBasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signedBasicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((SignedBasicLongLiteral_eofContext)_localctx).tmp = signedBasicLongLiteral();
			((SignedBasicLongLiteral_eofContext)_localctx).ret =  ((SignedBasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(192);
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
		public TerminalNode Digits() { return getToken(TravelCostsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicLongLiteral(this);
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
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(194);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(198);
			((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(201);
			((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((SignedBasicLongLiteralContext)_localctx).tmp1));
			}
			setState(204);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicFloatLiteral_eof(this);
		}
	}

	public final BasicFloatLiteral_eofContext basicFloatLiteral_eof() throws RecognitionException {
		BasicFloatLiteral_eofContext _localctx = new BasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((BasicFloatLiteral_eofContext)_localctx).tmp = basicFloatLiteral();
			((BasicFloatLiteral_eofContext)_localctx).ret =  ((BasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(208);
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
		public TerminalNode POINT() { return getToken(TravelCostsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(TravelCostsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(TravelCostsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicFloatLiteral(this);
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
			setState(210);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(213);
			match(POINT);
			{
			setState(214);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(217);
			((BasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((BasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(220);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicFloatLiteral_eof(this);
		}
	}

	public final SignedBasicFloatLiteral_eofContext signedBasicFloatLiteral_eof() throws RecognitionException {
		SignedBasicFloatLiteral_eofContext _localctx = new SignedBasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedBasicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((SignedBasicFloatLiteral_eofContext)_localctx).tmp = signedBasicFloatLiteral();
			((SignedBasicFloatLiteral_eofContext)_localctx).ret =  ((SignedBasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(224);
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
		public TerminalNode POINT() { return getToken(TravelCostsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(TravelCostsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(TravelCostsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicFloatLiteral(this);
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
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(226);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(230);
			((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(233);
			match(POINT);
			{
			setState(234);
			((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(237);
			((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((SignedBasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(240);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public BasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicDoubleLiteral_eof(this);
		}
	}

	public final BasicDoubleLiteral_eofContext basicDoubleLiteral_eof() throws RecognitionException {
		BasicDoubleLiteral_eofContext _localctx = new BasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((BasicDoubleLiteral_eofContext)_localctx).tmp = basicDoubleLiteral();
			((BasicDoubleLiteral_eofContext)_localctx).ret =  ((BasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(244);
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
		public TerminalNode POINT() { return getToken(TravelCostsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(TravelCostsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(TravelCostsAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitBasicDoubleLiteral(this);
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
			setState(246);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(249);
			match(POINT);
			{
			setState(250);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicDoubleLiteral_eof(this);
		}
	}

	public final SignedBasicDoubleLiteral_eofContext signedBasicDoubleLiteral_eof() throws RecognitionException {
		SignedBasicDoubleLiteral_eofContext _localctx = new SignedBasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedBasicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			((SignedBasicDoubleLiteral_eofContext)_localctx).tmp = signedBasicDoubleLiteral();
			((SignedBasicDoubleLiteral_eofContext)_localctx).ret =  ((SignedBasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(255);
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
		public TerminalNode POINT() { return getToken(TravelCostsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(TravelCostsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(TravelCostsAntlrParser.Digits, i);
		}
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedBasicDoubleLiteral(this);
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(257);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(261);
			((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(264);
			match(POINT);
			{
			setState(265);
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

	public static class TravelExpenseReport_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTTravelExpenseReport ret = null;
		public TravelExpenseReportContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public TravelExpenseReportContext travelExpenseReport() {
			return getRuleContext(TravelExpenseReportContext.class,0);
		}
		public TravelExpenseReport_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelExpenseReport_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTravelExpenseReport_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTravelExpenseReport_eof(this);
		}
	}

	public final TravelExpenseReport_eofContext travelExpenseReport_eof() throws RecognitionException {
		TravelExpenseReport_eofContext _localctx = new TravelExpenseReport_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_travelExpenseReport_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((TravelExpenseReport_eofContext)_localctx).tmp = travelExpenseReport();
			((TravelExpenseReport_eofContext)_localctx).ret =  ((TravelExpenseReport_eofContext)_localctx).tmp.ret;
			setState(270);
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

	public static class TravelExpenseReportContext extends ParserRuleContext {
		public travelcosts._ast.ASTTravelExpenseReport ret = null;
		public Token tmp0;
		public TravelNumberContext tmp1;
		public ArrivalContext tmp2;
		public AllWorkDaysContext tmp3;
		public WorkDayContext tmp4;
		public DepartureContext tmp5;
		public CostItemsContext tmp6;
		public TerminalNode LCURLY() { return getToken(TravelCostsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TravelCostsAntlrParser.RCURLY, 0); }
		public ArrivalContext arrival() {
			return getRuleContext(ArrivalContext.class,0);
		}
		public DepartureContext departure() {
			return getRuleContext(DepartureContext.class,0);
		}
		public CostItemsContext costItems() {
			return getRuleContext(CostItemsContext.class,0);
		}
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public AllWorkDaysContext allWorkDays() {
			return getRuleContext(AllWorkDaysContext.class,0);
		}
		public TravelNumberContext travelNumber() {
			return getRuleContext(TravelNumberContext.class,0);
		}
		public List<WorkDayContext> workDay() {
			return getRuleContexts(WorkDayContext.class);
		}
		public WorkDayContext workDay(int i) {
			return getRuleContext(WorkDayContext.class,i);
		}
		public TravelExpenseReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelExpenseReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTravelExpenseReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTravelExpenseReport(this);
		}
	}

	public final TravelExpenseReportContext travelExpenseReport() throws RecognitionException {
		TravelExpenseReportContext _localctx = new TravelExpenseReportContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_travelExpenseReport);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTTravelExpenseReport _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTravelExpenseReport();
		((TravelExpenseReportContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__3);
			{
			setState(273);
			((TravelExpenseReportContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((TravelExpenseReportContext)_localctx).tmp0));
			}
			setState(276);
			match(LCURLY);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(277);
				((TravelExpenseReportContext)_localctx).tmp1 = travelNumber();
				_aNode.setTravelNumber(_localctx.tmp1.ret);
				}
			}

			setState(282);
			((TravelExpenseReportContext)_localctx).tmp2 = arrival();
			_aNode.setArrival(_localctx.tmp2.ret);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(284);
				((TravelExpenseReportContext)_localctx).tmp3 = allWorkDays();
				_aNode.setAllWorkDays(_localctx.tmp3.ret);
				}
				break;
			case T__6:
				{
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					((TravelExpenseReportContext)_localctx).tmp4 = workDay();
					addToIteratedAttributeIfNotNull(_aNode.getWorkDayList(), _localctx.tmp4.ret);
					}
					}
					setState(292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			((TravelExpenseReportContext)_localctx).tmp5 = departure();
			_aNode.setDeparture(_localctx.tmp5.ret);
			setState(298);
			((TravelExpenseReportContext)_localctx).tmp6 = costItems();
			_aNode.setCostItems(_localctx.tmp6.ret);
			setState(300);
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

	public static class TravelNumber_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTTravelNumber ret = null;
		public TravelNumberContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public TravelNumberContext travelNumber() {
			return getRuleContext(TravelNumberContext.class,0);
		}
		public TravelNumber_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelNumber_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTravelNumber_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTravelNumber_eof(this);
		}
	}

	public final TravelNumber_eofContext travelNumber_eof() throws RecognitionException {
		TravelNumber_eofContext _localctx = new TravelNumber_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_travelNumber_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((TravelNumber_eofContext)_localctx).tmp = travelNumber();
			((TravelNumber_eofContext)_localctx).ret =  ((TravelNumber_eofContext)_localctx).tmp.ret;
			setState(304);
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

	public static class TravelNumberContext extends ParserRuleContext {
		public travelcosts._ast.ASTTravelNumber ret = null;
		public NatLiteralContext tmp0;
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public TravelNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTravelNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTravelNumber(this);
		}
	}

	public final TravelNumberContext travelNumber() throws RecognitionException {
		TravelNumberContext _localctx = new TravelNumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_travelNumber);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTTravelNumber _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTravelNumber();
		((TravelNumberContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__4);
			setState(307);
			((TravelNumberContext)_localctx).tmp0 = natLiteral();
			_aNode.setTravelNo(_localctx.tmp0.ret);
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

	public static class Arrival_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTArrival ret = null;
		public ArrivalContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public ArrivalContext arrival() {
			return getRuleContext(ArrivalContext.class,0);
		}
		public Arrival_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrival_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterArrival_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitArrival_eof(this);
		}
	}

	public final Arrival_eofContext arrival_eof() throws RecognitionException {
		Arrival_eofContext _localctx = new Arrival_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrival_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((Arrival_eofContext)_localctx).tmp = arrival();
			((Arrival_eofContext)_localctx).ret =  ((Arrival_eofContext)_localctx).tmp.ret;
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

	public static class ArrivalContext extends ParserRuleContext {
		public travelcosts._ast.ASTArrival ret = null;
		public DurationContext tmp0;
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public ArrivalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrival; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterArrival(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitArrival(this);
		}
	}

	public final ArrivalContext arrival() throws RecognitionException {
		ArrivalContext _localctx = new ArrivalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrival);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTArrival _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTArrival();
		((ArrivalContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__5);
			setState(315);
			((ArrivalContext)_localctx).tmp0 = duration();
			_aNode.setDuration(_localctx.tmp0.ret);
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

	public static class WorkDay_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTWorkDay ret = null;
		public WorkDayContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public WorkDayContext workDay() {
			return getRuleContext(WorkDayContext.class,0);
		}
		public WorkDay_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workDay_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterWorkDay_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitWorkDay_eof(this);
		}
	}

	public final WorkDay_eofContext workDay_eof() throws RecognitionException {
		WorkDay_eofContext _localctx = new WorkDay_eofContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_workDay_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((WorkDay_eofContext)_localctx).tmp = workDay();
			((WorkDay_eofContext)_localctx).ret =  ((WorkDay_eofContext)_localctx).tmp.ret;
			setState(320);
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

	public static class WorkDayContext extends ParserRuleContext {
		public travelcosts._ast.ASTWorkDay ret = null;
		public DurationContext tmp0;
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public WorkDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterWorkDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitWorkDay(this);
		}
	}

	public final WorkDayContext workDay() throws RecognitionException {
		WorkDayContext _localctx = new WorkDayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_workDay);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTWorkDay _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTWorkDay();
		((WorkDayContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__6);
			setState(323);
			((WorkDayContext)_localctx).tmp0 = duration();
			_aNode.setDuration(_localctx.tmp0.ret);
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

	public static class AllWorkDays_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTAllWorkDays ret = null;
		public AllWorkDaysContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public AllWorkDaysContext allWorkDays() {
			return getRuleContext(AllWorkDaysContext.class,0);
		}
		public AllWorkDays_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allWorkDays_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterAllWorkDays_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitAllWorkDays_eof(this);
		}
	}

	public final AllWorkDays_eofContext allWorkDays_eof() throws RecognitionException {
		AllWorkDays_eofContext _localctx = new AllWorkDays_eofContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_allWorkDays_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((AllWorkDays_eofContext)_localctx).tmp = allWorkDays();
			((AllWorkDays_eofContext)_localctx).ret =  ((AllWorkDays_eofContext)_localctx).tmp.ret;
			setState(328);
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

	public static class AllWorkDaysContext extends ParserRuleContext {
		public travelcosts._ast.ASTAllWorkDays ret = null;
		public TimeContext tmp0;
		public TimeContext tmp1;
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public AllWorkDaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allWorkDays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterAllWorkDays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitAllWorkDays(this);
		}
	}

	public final AllWorkDaysContext allWorkDays() throws RecognitionException {
		AllWorkDaysContext _localctx = new AllWorkDaysContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_allWorkDays);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTAllWorkDays _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTAllWorkDays();
		((AllWorkDaysContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__7);
			setState(331);
			((AllWorkDaysContext)_localctx).tmp0 = time();
			_aNode.setBeginTime(_localctx.tmp0.ret);
			setState(333);
			match(MINUS);
			setState(334);
			((AllWorkDaysContext)_localctx).tmp1 = time();
			_aNode.setEndTime(_localctx.tmp1.ret);
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

	public static class Departure_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTDeparture ret = null;
		public DepartureContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public DepartureContext departure() {
			return getRuleContext(DepartureContext.class,0);
		}
		public Departure_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDeparture_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDeparture_eof(this);
		}
	}

	public final Departure_eofContext departure_eof() throws RecognitionException {
		Departure_eofContext _localctx = new Departure_eofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_departure_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((Departure_eofContext)_localctx).tmp = departure();
			((Departure_eofContext)_localctx).ret =  ((Departure_eofContext)_localctx).tmp.ret;
			setState(339);
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

	public static class DepartureContext extends ParserRuleContext {
		public travelcosts._ast.ASTDeparture ret = null;
		public DurationContext tmp0;
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public DepartureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDeparture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDeparture(this);
		}
	}

	public final DepartureContext departure() throws RecognitionException {
		DepartureContext _localctx = new DepartureContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_departure);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTDeparture _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDeparture();
		((DepartureContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__8);
			setState(342);
			((DepartureContext)_localctx).tmp0 = duration();
			_aNode.setDuration(_localctx.tmp0.ret);
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

	public static class CostItems_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTCostItems ret = null;
		public CostItemsContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public CostItemsContext costItems() {
			return getRuleContext(CostItemsContext.class,0);
		}
		public CostItems_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costItems_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCostItems_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCostItems_eof(this);
		}
	}

	public final CostItems_eofContext costItems_eof() throws RecognitionException {
		CostItems_eofContext _localctx = new CostItems_eofContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_costItems_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((CostItems_eofContext)_localctx).tmp = costItems();
			((CostItems_eofContext)_localctx).ret =  ((CostItems_eofContext)_localctx).tmp.ret;
			setState(347);
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

	public static class CostItemsContext extends ParserRuleContext {
		public travelcosts._ast.ASTCostItems ret = null;
		public CostItemContext tmp0;
		public TerminalNode LCURLY() { return getToken(TravelCostsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TravelCostsAntlrParser.RCURLY, 0); }
		public List<CostItemContext> costItem() {
			return getRuleContexts(CostItemContext.class);
		}
		public CostItemContext costItem(int i) {
			return getRuleContext(CostItemContext.class,i);
		}
		public CostItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCostItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCostItems(this);
		}
	}

	public final CostItemsContext costItems() throws RecognitionException {
		CostItemsContext _localctx = new CostItemsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_costItems);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTCostItems _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTCostItems();
		((CostItemsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__9);
			setState(350);
			match(LCURLY);
			setState(354); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				((CostItemsContext)_localctx).tmp0 = costItem();
				addToIteratedAttributeIfNotNull(_aNode.getCostItemList(), _localctx.tmp0.ret);
				}
				}
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digits );
			setState(358);
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

	public static class CostItem_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTCostItem ret = null;
		public CostItemContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public CostItemContext costItem() {
			return getRuleContext(CostItemContext.class,0);
		}
		public CostItem_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costItem_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCostItem_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCostItem_eof(this);
		}
	}

	public final CostItem_eofContext costItem_eof() throws RecognitionException {
		CostItem_eofContext _localctx = new CostItem_eofContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_costItem_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((CostItem_eofContext)_localctx).tmp = costItem();
			((CostItem_eofContext)_localctx).ret =  ((CostItem_eofContext)_localctx).tmp.ret;
			setState(362);
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

	public static class CostItemContext extends ParserRuleContext {
		public travelcosts._ast.ASTCostItem ret = null;
		public NatLiteralContext tmp0;
		public NumericLiteralContext tmp1;
		public CostContext tmp2;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(TravelCostsAntlrParser.RPAREN, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public CostItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCostItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCostItem(this);
		}
	}

	public final CostItemContext costItem() throws RecognitionException {
		CostItemContext _localctx = new CostItemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_costItem);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTCostItem _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTCostItem();
		((CostItemContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(364);
				((CostItemContext)_localctx).tmp0 = natLiteral();
				_aNode.setId(_localctx.tmp0.ret);
				setState(366);
				match(RPAREN);
				}
				break;
			}
			setState(370);
			((CostItemContext)_localctx).tmp1 = numericLiteral();
			_aNode.setAmount(_localctx.tmp1.ret);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(372);
				match(T__10);

				_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.EURO);

				}
				break;
			case T__11:
				{
				setState(374);
				match(T__11);

				_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.DOLLAR);

				}
				break;
			case MINUS:
				{
				setState(376);
				match(MINUS);

				_aNode.setCurrency(travelcosts._ast.ASTConstantsTravelCosts.ELSE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			((CostItemContext)_localctx).tmp2 = cost();
			_aNode.setCost(_localctx.tmp2.ret);
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

	public static class HotelCost_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTHotelCost ret = null;
		public HotelCostContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public HotelCostContext hotelCost() {
			return getRuleContext(HotelCostContext.class,0);
		}
		public HotelCost_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hotelCost_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterHotelCost_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitHotelCost_eof(this);
		}
	}

	public final HotelCost_eofContext hotelCost_eof() throws RecognitionException {
		HotelCost_eofContext _localctx = new HotelCost_eofContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hotelCost_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((HotelCost_eofContext)_localctx).tmp = hotelCost();
			((HotelCost_eofContext)_localctx).ret =  ((HotelCost_eofContext)_localctx).tmp.ret;
			setState(385);
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

	public static class HotelCostContext extends ParserRuleContext {
		public travelcosts._ast.ASTHotelCost ret = null;
		public HotelCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hotelCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterHotelCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitHotelCost(this);
		}
	}

	public final HotelCostContext hotelCost() throws RecognitionException {
		HotelCostContext _localctx = new HotelCostContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hotelCost);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTHotelCost _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTHotelCost();
		((HotelCostContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__12);
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

	public static class TransportCost_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTTransportCost ret = null;
		public TransportCostContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public TransportCostContext transportCost() {
			return getRuleContext(TransportCostContext.class,0);
		}
		public TransportCost_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transportCost_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTransportCost_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTransportCost_eof(this);
		}
	}

	public final TransportCost_eofContext transportCost_eof() throws RecognitionException {
		TransportCost_eofContext _localctx = new TransportCost_eofContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_transportCost_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((TransportCost_eofContext)_localctx).tmp = transportCost();
			((TransportCost_eofContext)_localctx).ret =  ((TransportCost_eofContext)_localctx).tmp.ret;
			setState(391);
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

	public static class TransportCostContext extends ParserRuleContext {
		public travelcosts._ast.ASTTransportCost ret = null;
		public TravelMeansContext tmp0;
		public DescriptionContext tmp1;
		public TravelMeansContext travelMeans() {
			return getRuleContext(TravelMeansContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TransportCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transportCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTransportCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTransportCost(this);
		}
	}

	public final TransportCostContext transportCost() throws RecognitionException {
		TransportCostContext _localctx = new TransportCostContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_transportCost);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTTransportCost _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTransportCost();
		((TransportCostContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__13);
			setState(394);
			((TransportCostContext)_localctx).tmp0 = travelMeans();
			_aNode.setTravelMeans(_localctx.tmp0.ret);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name || _la==String) {
				{
				setState(396);
				((TransportCostContext)_localctx).tmp1 = description();
				_aNode.setDescription(_localctx.tmp1.ret);
				}
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

	public static class ExtraCost_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTExtraCost ret = null;
		public ExtraCostContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public ExtraCostContext extraCost() {
			return getRuleContext(ExtraCostContext.class,0);
		}
		public ExtraCost_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraCost_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterExtraCost_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitExtraCost_eof(this);
		}
	}

	public final ExtraCost_eofContext extraCost_eof() throws RecognitionException {
		ExtraCost_eofContext _localctx = new ExtraCost_eofContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_extraCost_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((ExtraCost_eofContext)_localctx).tmp = extraCost();
			((ExtraCost_eofContext)_localctx).ret =  ((ExtraCost_eofContext)_localctx).tmp.ret;
			setState(403);
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

	public static class ExtraCostContext extends ParserRuleContext {
		public travelcosts._ast.ASTExtraCost ret = null;
		public DescriptionContext tmp0;
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ExtraCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterExtraCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitExtraCost(this);
		}
	}

	public final ExtraCostContext extraCost() throws RecognitionException {
		ExtraCostContext _localctx = new ExtraCostContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_extraCost);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTExtraCost _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTExtraCost();
		((ExtraCostContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__14);
			setState(406);
			((ExtraCostContext)_localctx).tmp0 = description();
			_aNode.setDescription(_localctx.tmp0.ret);
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

	public static class Description_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTDescription ret = null;
		public DescriptionContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Description_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDescription_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDescription_eof(this);
		}
	}

	public final Description_eofContext description_eof() throws RecognitionException {
		Description_eofContext _localctx = new Description_eofContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_description_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			((Description_eofContext)_localctx).tmp = description();
			((Description_eofContext)_localctx).ret =  ((Description_eofContext)_localctx).tmp.ret;
			setState(411);
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

	public static class DescriptionContext extends ParserRuleContext {
		public travelcosts._ast.ASTDescription ret = null;
		public Token tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Name() { return getToken(TravelCostsAntlrParser.Name, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_description);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTDescription _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDescription();
		((DescriptionContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				{
				setState(413);
				((DescriptionContext)_localctx).tmp0 = match(Name);
				_aNode.setShort(convertName(((DescriptionContext)_localctx).tmp0));
				}
				}
				break;
			case String:
				{
				setState(415);
				((DescriptionContext)_localctx).tmp1 = stringLiteral();
				_aNode.setLong(_localctx.tmp1.ret);
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

	public static class ISODate_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTISODate ret = null;
		public ISODateContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public ISODateContext iSODate() {
			return getRuleContext(ISODateContext.class,0);
		}
		public ISODate_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iSODate_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterISODate_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitISODate_eof(this);
		}
	}

	public final ISODate_eofContext iSODate_eof() throws RecognitionException {
		ISODate_eofContext _localctx = new ISODate_eofContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_iSODate_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			((ISODate_eofContext)_localctx).tmp = iSODate();
			((ISODate_eofContext)_localctx).ret =  ((ISODate_eofContext)_localctx).tmp.ret;
			setState(422);
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

	public static class ISODateContext extends ParserRuleContext {
		public travelcosts._ast.ASTISODate ret = null;
		public NatLiteralContext tmp0;
		public NatLiteralContext tmp1;
		public NatLiteralContext tmp2;
		public List<TerminalNode> MINUS() { return getTokens(TravelCostsAntlrParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TravelCostsAntlrParser.MINUS, i);
		}
		public List<NatLiteralContext> natLiteral() {
			return getRuleContexts(NatLiteralContext.class);
		}
		public NatLiteralContext natLiteral(int i) {
			return getRuleContext(NatLiteralContext.class,i);
		}
		public ISODateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iSODate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterISODate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitISODate(this);
		}
	}

	public final ISODateContext iSODate() throws RecognitionException {
		ISODateContext _localctx = new ISODateContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_iSODate);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTISODate _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTISODate();
		((ISODateContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(424);
				((ISODateContext)_localctx).tmp0 = natLiteral();
				_aNode.setYear(_localctx.tmp0.ret);
				setState(426);
				match(MINUS);
				}
				break;
			}
			setState(430);
			((ISODateContext)_localctx).tmp1 = natLiteral();
			_aNode.setMonth(_localctx.tmp1.ret);
			setState(432);
			match(MINUS);
			setState(433);
			((ISODateContext)_localctx).tmp2 = natLiteral();
			_aNode.setDay(_localctx.tmp2.ret);
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
		public travelcosts._ast.ASTTime ret = null;
		public TimeContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Time_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTime_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTime_eof(this);
		}
	}

	public final Time_eofContext time_eof() throws RecognitionException {
		Time_eofContext _localctx = new Time_eofContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_time_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			((Time_eofContext)_localctx).tmp = time();
			((Time_eofContext)_localctx).ret =  ((Time_eofContext)_localctx).tmp.ret;
			setState(438);
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
		public travelcosts._ast.ASTTime ret = null;
		public NatLiteralContext tmp0;
		public NatLiteralContext tmp1;
		public NatLiteralContext tmp2;
		public List<NatLiteralContext> natLiteral() {
			return getRuleContexts(NatLiteralContext.class);
		}
		public NatLiteralContext natLiteral(int i) {
			return getRuleContext(NatLiteralContext.class,i);
		}
		public TerminalNode COLON() { return getToken(TravelCostsAntlrParser.COLON, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_time);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTTime _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTTime();
		((TimeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(440);
				((TimeContext)_localctx).tmp0 = natLiteral();
				_aNode.setLeadingZero(_localctx.tmp0.ret);
				}
				break;
			}
			setState(445);
			((TimeContext)_localctx).tmp1 = natLiteral();
			_aNode.setHours(_localctx.tmp1.ret);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(447);
				match(COLON);
				setState(448);
				((TimeContext)_localctx).tmp2 = natLiteral();
				_aNode.setMinutes(_localctx.tmp2.ret);
				}
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

	public static class Duration_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTDuration ret = null;
		public DurationContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public Duration_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDuration_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDuration_eof(this);
		}
	}

	public final Duration_eofContext duration_eof() throws RecognitionException {
		Duration_eofContext _localctx = new Duration_eofContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_duration_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((Duration_eofContext)_localctx).tmp = duration();
			((Duration_eofContext)_localctx).ret =  ((Duration_eofContext)_localctx).tmp.ret;
			setState(455);
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

	public static class DurationContext extends ParserRuleContext {
		public travelcosts._ast.ASTDuration ret = null;
		public ISODateContext tmp0;
		public TimeContext tmp1;
		public ISODateContext tmp2;
		public TimeContext tmp3;
		public List<ISODateContext> iSODate() {
			return getRuleContexts(ISODateContext.class);
		}
		public ISODateContext iSODate(int i) {
			return getRuleContext(ISODateContext.class,i);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(TravelCostsAntlrParser.MINUS, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitDuration(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_duration);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		travelcosts._ast.ASTDuration _aNode = null;
		_aNode=travelcosts._ast.TravelCostsNodeFactory.createASTDuration();
		((DurationContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((DurationContext)_localctx).tmp0 = iSODate();
			_aNode.setStartDate(_localctx.tmp0.ret);
			setState(459);
			((DurationContext)_localctx).tmp1 = time();
			_aNode.setStartTime(_localctx.tmp1.ret);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(461);
				match(MINUS);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(462);
					((DurationContext)_localctx).tmp2 = iSODate();
					_aNode.setEndDate(_localctx.tmp2.ret);
					}
					break;
				}
				setState(467);
				((DurationContext)_localctx).tmp3 = time();
				_aNode.setEndTime(_localctx.tmp3.ret);
				}
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

	public static class TravelMeansContext extends ParserRuleContext {
		public travelcosts._ast.ASTTravelMeans ret = null;
		public TravelMeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travelMeans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterTravelMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitTravelMeans(this);
		}
	}

	public final TravelMeansContext travelMeans() throws RecognitionException {
		TravelMeansContext _localctx = new TravelMeansContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_travelMeans);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T__15);
				((TravelMeansContext)_localctx).ret =  travelcosts._ast.ASTTravelMeans.TRAIN;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(T__16);
				((TravelMeansContext)_localctx).ret =  travelcosts._ast.ASTTravelMeans.PLANE;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(T__17);
				((TravelMeansContext)_localctx).ret =  travelcosts._ast.ASTTravelMeans.PUBLICTRANSPORT;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				match(T__18);
				((TravelMeansContext)_localctx).ret =  travelcosts._ast.ASTTravelMeans.CAB;
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

	public static class Literal_eofContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret = null;
		public LiteralContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(484);
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
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				((LiteralContext)_localctx).tmp0 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				((LiteralContext)_localctx).tmp1 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				((LiteralContext)_localctx).tmp2 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				((LiteralContext)_localctx).tmp3 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedLiteralContext signedLiteral() {
			return getRuleContext(SignedLiteralContext.class,0);
		}
		public SignedLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedLiteral_eof(this);
		}
	}

	public final SignedLiteral_eofContext signedLiteral_eof() throws RecognitionException {
		SignedLiteral_eofContext _localctx = new SignedLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signedLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			((SignedLiteral_eofContext)_localctx).tmp = signedLiteral();
			((SignedLiteral_eofContext)_localctx).ret =  ((SignedLiteral_eofContext)_localctx).tmp.ret;
			setState(505);
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
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedLiteral(this);
		}
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_signedLiteral);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				((SignedLiteralContext)_localctx).tmp0 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				((SignedLiteralContext)_localctx).tmp1 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				((SignedLiteralContext)_localctx).tmp2 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				((SignedLiteralContext)_localctx).tmp3 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case MINUS:
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNumericLiteral_eof(this);
		}
	}

	public final NumericLiteral_eofContext numericLiteral_eof() throws RecognitionException {
		NumericLiteral_eofContext _localctx = new NumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_numericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			((NumericLiteral_eofContext)_localctx).tmp = numericLiteral();
			((NumericLiteral_eofContext)_localctx).ret =  ((NumericLiteral_eofContext)_localctx).tmp.ret;
			setState(526);
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
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_numericLiteral);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				((NumericLiteralContext)_localctx).tmp6 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				((NumericLiteralContext)_localctx).tmp7 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				((NumericLiteralContext)_localctx).tmp8 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
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
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedNumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedNumericLiteral_eof(this);
		}
	}

	public final SignedNumericLiteral_eofContext signedNumericLiteral_eof() throws RecognitionException {
		SignedNumericLiteral_eofContext _localctx = new SignedNumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_signedNumericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			((SignedNumericLiteral_eofContext)_localctx).tmp = signedNumericLiteral();
			((SignedNumericLiteral_eofContext)_localctx).ret =  ((SignedNumericLiteral_eofContext)_localctx).tmp.ret;
			setState(544);
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
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterSignedNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitSignedNumericLiteral(this);
		}
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_signedNumericLiteral);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				((SignedNumericLiteralContext)_localctx).tmp10 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				((SignedNumericLiteralContext)_localctx).tmp11 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
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

	public static class Cost_eofContext extends ParserRuleContext {
		public travelcosts._ast.ASTCost ret = null;
		public CostContext tmp;
		public TerminalNode EOF() { return getToken(TravelCostsAntlrParser.EOF, 0); }
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Cost_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCost_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCost_eof(this);
		}
	}

	public final Cost_eofContext cost_eof() throws RecognitionException {
		Cost_eofContext _localctx = new Cost_eofContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cost_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((Cost_eofContext)_localctx).tmp = cost();
			((Cost_eofContext)_localctx).ret =  ((Cost_eofContext)_localctx).tmp.ret;
			setState(562);
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

	public static class CostContext extends ParserRuleContext {
		public travelcosts._ast.ASTCost ret;
		public HotelCostContext tmp14;
		public TransportCostContext tmp15;
		public ExtraCostContext tmp16;
		public HotelCostContext hotelCost() {
			return getRuleContext(HotelCostContext.class,0);
		}
		public TransportCostContext transportCost() {
			return getRuleContext(TransportCostContext.class,0);
		}
		public ExtraCostContext extraCost() {
			return getRuleContext(ExtraCostContext.class,0);
		}
		public CostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).enterCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TravelCostsAntlrListener ) ((TravelCostsAntlrListener)listener).exitCost(this);
		}
	}

	public final CostContext cost() throws RecognitionException {
		CostContext _localctx = new CostContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cost);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				((CostContext)_localctx).tmp14 = hotelCost();
				((CostContext)_localctx).ret = ((CostContext)_localctx).tmp14.ret;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				((CostContext)_localctx).tmp15 = transportCost();
				((CostContext)_localctx).ret = ((CostContext)_localctx).tmp15.ret;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				((CostContext)_localctx).tmp16 = extraCost();
				((CostContext)_localctx).ret = ((CostContext)_localctx).tmp16.ret;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0242\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\5\r\u00b0\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00c7\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u00e7\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u0106\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u011b\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u0125\n\33\r"+
		"\33\16\33\u0126\5\33\u0129\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\6\'\u0165\n\'\r\'\16"+
		"\'\u0166\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0173\n)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u017d\n)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\5-\u0192\n-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01a5\n\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\5\63\u01af\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\5\65\u01be\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01c6"+
		"\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u01d4\n\67\3\67\3\67\3\67\5\67\u01d9\n\67\38\38\38\38\38\38\38\38\58"+
		"\u01e3\n8\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:"+
		"\u01f8\n:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<"+
		"\u020d\n<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u021f\n>"+
		"\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0231\n@\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0240\nB\3B\2\2C\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\2\2\2\u0226\2\u0084\3\2\2\2\4\u0088\3\2\2\2\6\u008a"+
		"\3\2\2\2\b\u0092\3\2\2\2\n\u0094\3\2\2\2\f\u0098\3\2\2\2\16\u009b\3\2"+
		"\2\2\20\u009f\3\2\2\2\22\u00a2\3\2\2\2\24\u00a6\3\2\2\2\26\u00a9\3\2\2"+
		"\2\30\u00af\3\2\2\2\32\u00b4\3\2\2\2\34\u00b8\3\2\2\2\36\u00c0\3\2\2\2"+
		" \u00c6\3\2\2\2\"\u00d0\3\2\2\2$\u00d4\3\2\2\2&\u00e0\3\2\2\2(\u00e6\3"+
		"\2\2\2*\u00f4\3\2\2\2,\u00f8\3\2\2\2.\u00ff\3\2\2\2\60\u0105\3\2\2\2\62"+
		"\u010e\3\2\2\2\64\u0112\3\2\2\2\66\u0130\3\2\2\28\u0134\3\2\2\2:\u0138"+
		"\3\2\2\2<\u013c\3\2\2\2>\u0140\3\2\2\2@\u0144\3\2\2\2B\u0148\3\2\2\2D"+
		"\u014c\3\2\2\2F\u0153\3\2\2\2H\u0157\3\2\2\2J\u015b\3\2\2\2L\u015f\3\2"+
		"\2\2N\u016a\3\2\2\2P\u0172\3\2\2\2R\u0181\3\2\2\2T\u0185\3\2\2\2V\u0187"+
		"\3\2\2\2X\u018b\3\2\2\2Z\u0193\3\2\2\2\\\u0197\3\2\2\2^\u019b\3\2\2\2"+
		"`\u01a4\3\2\2\2b\u01a6\3\2\2\2d\u01ae\3\2\2\2f\u01b6\3\2\2\2h\u01bd\3"+
		"\2\2\2j\u01c7\3\2\2\2l\u01cb\3\2\2\2n\u01e2\3\2\2\2p\u01e4\3\2\2\2r\u01f7"+
		"\3\2\2\2t\u01f9\3\2\2\2v\u020c\3\2\2\2x\u020e\3\2\2\2z\u021e\3\2\2\2|"+
		"\u0220\3\2\2\2~\u0230\3\2\2\2\u0080\u0232\3\2\2\2\u0082\u023f\3\2\2\2"+
		"\u0084\u0085\5\4\3\2\u0085\u0086\b\2\1\2\u0086\u0087\7\2\2\3\u0087\3\3"+
		"\2\2\2\u0088\u0089\7\3\2\2\u0089\5\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c"+
		"\b\4\1\2\u008c\u008d\7\2\2\3\u008d\7\3\2\2\2\u008e\u008f\7\4\2\2\u008f"+
		"\u0093\b\5\1\2\u0090\u0091\7\5\2\2\u0091\u0093\b\5\1\2\u0092\u008e\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\t\3\2\2\2\u0094\u0095\5\f\7\2\u0095\u0096"+
		"\b\6\1\2\u0096\u0097\7\2\2\3\u0097\13\3\2\2\2\u0098\u0099\7!\2\2\u0099"+
		"\u009a\b\7\1\2\u009a\r\3\2\2\2\u009b\u009c\5\20\t\2\u009c\u009d\b\b\1"+
		"\2\u009d\u009e\7\2\2\3\u009e\17\3\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1"+
		"\b\t\1\2\u00a1\21\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\b\n\1\2\u00a4"+
		"\u00a5\7\2\2\3\u00a5\23\3\2\2\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\b\13\1"+
		"\2\u00a8\25\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\b\f\1\2\u00ab\u00ac"+
		"\7\2\2\3\u00ac\27\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b0\b\r\1\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7 "+
		"\2\2\u00b2\u00b3\b\r\1\2\u00b3\31\3\2\2\2\u00b4\u00b5\5\34\17\2\u00b5"+
		"\u00b6\b\16\1\2\u00b6\u00b7\7\2\2\3\u00b7\33\3\2\2\2\u00b8\u00b9\7 \2"+
		"\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc"+
		"\u00bd\b\17\1\2\u00bd\u00be\3\2\2\2\u00be\u00bf\6\17\2\2\u00bf\35\3\2"+
		"\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\b\20\1\2\u00c2\u00c3\7\2\2\3\u00c3"+
		"\37\3\2\2\2\u00c4\u00c5\7\31\2\2\u00c5\u00c7\b\21\1\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7 \2\2\u00c9"+
		"\u00ca\b\21\1\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\b"+
		"\21\1\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\6\21\3\2\u00cf!\3\2\2\2\u00d0"+
		"\u00d1\5$\23\2\u00d1\u00d2\b\22\1\2\u00d2\u00d3\7\2\2\3\u00d3#\3\2\2\2"+
		"\u00d4\u00d5\7 \2\2\u00d5\u00d6\b\23\1\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\7\33\2\2\u00d8\u00d9\7 \2\2\u00d9\u00da\b\23\1\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\7\34\2\2\u00dc\u00dd\b\23\1\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\6\23\4\2\u00df%\3\2\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\b\24\1\2\u00e2"+
		"\u00e3\7\2\2\3\u00e3\'\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5\u00e7\b\25\1"+
		"\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\7 \2\2\u00e9\u00ea\b\25\1\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\33\2\2"+
		"\u00ec\u00ed\7 \2\2\u00ed\u00ee\b\25\1\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\7\34\2\2\u00f0\u00f1\b\25\1\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\6\25\5"+
		"\2\u00f3)\3\2\2\2\u00f4\u00f5\5,\27\2\u00f5\u00f6\b\26\1\2\u00f6\u00f7"+
		"\7\2\2\3\u00f7+\3\2\2\2\u00f8\u00f9\7 \2\2\u00f9\u00fa\b\27\1\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\b\27"+
		"\1\2\u00fe-\3\2\2\2\u00ff\u0100\5\60\31\2\u0100\u0101\b\30\1\2\u0101\u0102"+
		"\7\2\2\3\u0102/\3\2\2\2\u0103\u0104\7\31\2\2\u0104\u0106\b\31\1\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7 "+
		"\2\2\u0108\u0109\b\31\1\2\u0109\u010a\3\2\2\2\u010a\u010b\7\33\2\2\u010b"+
		"\u010c\7 \2\2\u010c\u010d\b\31\1\2\u010d\61\3\2\2\2\u010e\u010f\5\64\33"+
		"\2\u010f\u0110\b\32\1\2\u0110\u0111\7\2\2\3\u0111\63\3\2\2\2\u0112\u0113"+
		"\7\6\2\2\u0113\u0114\7\34\2\2\u0114\u0115\b\33\1\2\u0115\u0116\3\2\2\2"+
		"\u0116\u011a\7\30\2\2\u0117\u0118\58\35\2\u0118\u0119\b\33\1\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\5<\37\2\u011d\u0128\b\33\1\2\u011e\u011f\5D#\2\u011f\u0120\b\33"+
		"\1\2\u0120\u0129\3\2\2\2\u0121\u0122\5@!\2\u0122\u0123\b\33\1\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5H%\2\u012b\u012c\b\33"+
		"\1\2\u012c\u012d\5L\'\2\u012d\u012e\b\33\1\2\u012e\u012f\7\32\2\2\u012f"+
		"\65\3\2\2\2\u0130\u0131\58\35\2\u0131\u0132\b\34\1\2\u0132\u0133\7\2\2"+
		"\3\u0133\67\3\2\2\2\u0134\u0135\7\7\2\2\u0135\u0136\5\24\13\2\u0136\u0137"+
		"\b\35\1\2\u01379\3\2\2\2\u0138\u0139\5<\37\2\u0139\u013a\b\36\1\2\u013a"+
		"\u013b\7\2\2\3\u013b;\3\2\2\2\u013c\u013d\7\b\2\2\u013d\u013e\5l\67\2"+
		"\u013e\u013f\b\37\1\2\u013f=\3\2\2\2\u0140\u0141\5@!\2\u0141\u0142\b "+
		"\1\2\u0142\u0143\7\2\2\3\u0143?\3\2\2\2\u0144\u0145\7\t\2\2\u0145\u0146"+
		"\5l\67\2\u0146\u0147\b!\1\2\u0147A\3\2\2\2\u0148\u0149\5D#\2\u0149\u014a"+
		"\b\"\1\2\u014a\u014b\7\2\2\3\u014bC\3\2\2\2\u014c\u014d\7\n\2\2\u014d"+
		"\u014e\5h\65\2\u014e\u014f\b#\1\2\u014f\u0150\7\31\2\2\u0150\u0151\5h"+
		"\65\2\u0151\u0152\b#\1\2\u0152E\3\2\2\2\u0153\u0154\5H%\2\u0154\u0155"+
		"\b$\1\2\u0155\u0156\7\2\2\3\u0156G\3\2\2\2\u0157\u0158\7\13\2\2\u0158"+
		"\u0159\5l\67\2\u0159\u015a\b%\1\2\u015aI\3\2\2\2\u015b\u015c\5L\'\2\u015c"+
		"\u015d\b&\1\2\u015d\u015e\7\2\2\3\u015eK\3\2\2\2\u015f\u0160\7\f\2\2\u0160"+
		"\u0164\7\30\2\2\u0161\u0162\5P)\2\u0162\u0163\b\'\1\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0161\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\32\2\2\u0169M\3\2\2\2"+
		"\u016a\u016b\5P)\2\u016b\u016c\b(\1\2\u016c\u016d\7\2\2\3\u016dO\3\2\2"+
		"\2\u016e\u016f\5\24\13\2\u016f\u0170\b)\1\2\u0170\u0171\7\26\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\5z>\2\u0175\u017c\b)\1\2\u0176\u0177\7\r\2\2\u0177\u017d"+
		"\b)\1\2\u0178\u0179\7\16\2\2\u0179\u017d\b)\1\2\u017a\u017b\7\31\2\2\u017b"+
		"\u017d\b)\1\2\u017c\u0176\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\5\u0082B\2\u017f\u0180\b)\1\2\u0180"+
		"Q\3\2\2\2\u0181\u0182\5T+\2\u0182\u0183\b*\1\2\u0183\u0184\7\2\2\3\u0184"+
		"S\3\2\2\2\u0185\u0186\7\17\2\2\u0186U\3\2\2\2\u0187\u0188\5X-\2\u0188"+
		"\u0189\b,\1\2\u0189\u018a\7\2\2\3\u018aW\3\2\2\2\u018b\u018c\7\20\2\2"+
		"\u018c\u018d\5n8\2\u018d\u0191\b-\1\2\u018e\u018f\5`\61\2\u018f\u0190"+
		"\b-\1\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"Y\3\2\2\2\u0193\u0194\5\\/\2\u0194\u0195\b.\1\2\u0195\u0196\7\2\2\3\u0196"+
		"[\3\2\2\2\u0197\u0198\7\21\2\2\u0198\u0199\5`\61\2\u0199\u019a\b/\1\2"+
		"\u019a]\3\2\2\2\u019b\u019c\5`\61\2\u019c\u019d\b\60\1\2\u019d\u019e\7"+
		"\2\2\3\u019e_\3\2\2\2\u019f\u01a0\7\34\2\2\u01a0\u01a5\b\61\1\2\u01a1"+
		"\u01a2\5\20\t\2\u01a2\u01a3\b\61\1\2\u01a3\u01a5\3\2\2\2\u01a4\u019f\3"+
		"\2\2\2\u01a4\u01a1\3\2\2\2\u01a5a\3\2\2\2\u01a6\u01a7\5d\63\2\u01a7\u01a8"+
		"\b\62\1\2\u01a8\u01a9\7\2\2\3\u01a9c\3\2\2\2\u01aa\u01ab\5\24\13\2\u01ab"+
		"\u01ac\b\63\1\2\u01ac\u01ad\7\31\2\2\u01ad\u01af\3\2\2\2\u01ae\u01aa\3"+
		"\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5\24\13\2\u01b1"+
		"\u01b2\b\63\1\2\u01b2\u01b3\7\31\2\2\u01b3\u01b4\5\24\13\2\u01b4\u01b5"+
		"\b\63\1\2\u01b5e\3\2\2\2\u01b6\u01b7\5h\65\2\u01b7\u01b8\b\64\1\2\u01b8"+
		"\u01b9\7\2\2\3\u01b9g\3\2\2\2\u01ba\u01bb\5\24\13\2\u01bb\u01bc\b\65\1"+
		"\2\u01bc\u01be\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\5\24\13\2\u01c0\u01c5\b\65\1\2\u01c1\u01c2\7\27\2"+
		"\2\u01c2\u01c3\5\24\13\2\u01c3\u01c4\b\65\1\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6i\3\2\2\2\u01c7\u01c8\5l\67\2"+
		"\u01c8\u01c9\b\66\1\2\u01c9\u01ca\7\2\2\3\u01cak\3\2\2\2\u01cb\u01cc\5"+
		"d\63\2\u01cc\u01cd\b\67\1\2\u01cd\u01ce\5h\65\2\u01ce\u01d8\b\67\1\2\u01cf"+
		"\u01d3\7\31\2\2\u01d0\u01d1\5d\63\2\u01d1\u01d2\b\67\1\2\u01d2\u01d4\3"+
		"\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\5h\65\2\u01d6\u01d7\b\67\1\2\u01d7\u01d9\3\2\2\2\u01d8\u01cf\3"+
		"\2\2\2\u01d8\u01d9\3\2\2\2\u01d9m\3\2\2\2\u01da\u01db\7\22\2\2\u01db\u01e3"+
		"\b8\1\2\u01dc\u01dd\7\23\2\2\u01dd\u01e3\b8\1\2\u01de\u01df\7\24\2\2\u01df"+
		"\u01e3\b8\1\2\u01e0\u01e1\7\25\2\2\u01e1\u01e3\b8\1\2\u01e2\u01da\3\2"+
		"\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"o\3\2\2\2\u01e4\u01e5\5r:\2\u01e5\u01e6\b9\1\2\u01e6\u01e7\7\2\2\3\u01e7"+
		"q\3\2\2\2\u01e8\u01e9\5\4\3\2\u01e9\u01ea\b:\1\2\u01ea\u01f8\3\2\2\2\u01eb"+
		"\u01ec\5\b\5\2\u01ec\u01ed\b:\1\2\u01ed\u01f8\3\2\2\2\u01ee\u01ef\5\f"+
		"\7\2\u01ef\u01f0\b:\1\2\u01f0\u01f8\3\2\2\2\u01f1\u01f2\5\20\t\2\u01f2"+
		"\u01f3\b:\1\2\u01f3\u01f8\3\2\2\2\u01f4\u01f5\5z>\2\u01f5\u01f6\b:\1\2"+
		"\u01f6\u01f8\3\2\2\2\u01f7\u01e8\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01ee"+
		"\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8s\3\2\2\2\u01f9"+
		"\u01fa\5v<\2\u01fa\u01fb\b;\1\2\u01fb\u01fc\7\2\2\3\u01fcu\3\2\2\2\u01fd"+
		"\u01fe\5\4\3\2\u01fe\u01ff\b<\1\2\u01ff\u020d\3\2\2\2\u0200\u0201\5\b"+
		"\5\2\u0201\u0202\b<\1\2\u0202\u020d\3\2\2\2\u0203\u0204\5\f\7\2\u0204"+
		"\u0205\b<\1\2\u0205\u020d\3\2\2\2\u0206\u0207\5\20\t\2\u0207\u0208\b<"+
		"\1\2\u0208\u020d\3\2\2\2\u0209\u020a\5~@\2\u020a\u020b\b<\1\2\u020b\u020d"+
		"\3\2\2\2\u020c\u01fd\3\2\2\2\u020c\u0200\3\2\2\2\u020c\u0203\3\2\2\2\u020c"+
		"\u0206\3\2\2\2\u020c\u0209\3\2\2\2\u020dw\3\2\2\2\u020e\u020f\5z>\2\u020f"+
		"\u0210\b=\1\2\u0210\u0211\7\2\2\3\u0211y\3\2\2\2\u0212\u0213\5\24\13\2"+
		"\u0213\u0214\b>\1\2\u0214\u021f\3\2\2\2\u0215\u0216\5\34\17\2\u0216\u0217"+
		"\b>\1\2\u0217\u021f\3\2\2\2\u0218\u0219\5$\23\2\u0219\u021a\b>\1\2\u021a"+
		"\u021f\3\2\2\2\u021b\u021c\5,\27\2\u021c\u021d\b>\1\2\u021d\u021f\3\2"+
		"\2\2\u021e\u0212\3\2\2\2\u021e\u0215\3\2\2\2\u021e\u0218\3\2\2\2\u021e"+
		"\u021b\3\2\2\2\u021f{\3\2\2\2\u0220\u0221\5~@\2\u0221\u0222\b?\1\2\u0222"+
		"\u0223\7\2\2\3\u0223}\3\2\2\2\u0224\u0225\5\30\r\2\u0225\u0226\b@\1\2"+
		"\u0226\u0231\3\2\2\2\u0227\u0228\5 \21\2\u0228\u0229\b@\1\2\u0229\u0231"+
		"\3\2\2\2\u022a\u022b\5(\25\2\u022b\u022c\b@\1\2\u022c\u0231\3\2\2\2\u022d"+
		"\u022e\5\60\31\2\u022e\u022f\b@\1\2\u022f\u0231\3\2\2\2\u0230\u0224\3"+
		"\2\2\2\u0230\u0227\3\2\2\2\u0230\u022a\3\2\2\2\u0230\u022d\3\2\2\2\u0231"+
		"\177\3\2\2\2\u0232\u0233\5\u0082B\2\u0233\u0234\bA\1\2\u0234\u0235\7\2"+
		"\2\3\u0235\u0081\3\2\2\2\u0236\u0237\5T+\2\u0237\u0238\bB\1\2\u0238\u0240"+
		"\3\2\2\2\u0239\u023a\5X-\2\u023a\u023b\bB\1\2\u023b\u0240\3\2\2\2\u023c"+
		"\u023d\5\\/\2\u023d\u023e\bB\1\2\u023e\u0240\3\2\2\2\u023f\u0236\3\2\2"+
		"\2\u023f\u0239\3\2\2\2\u023f\u023c\3\2\2\2\u0240\u0083\3\2\2\2\32\u0092"+
		"\u00af\u00c6\u00e6\u0105\u011a\u0126\u0128\u0166\u0172\u017c\u0191\u01a4"+
		"\u01ae\u01bd\u01c5\u01d3\u01d8\u01e2\u01f7\u020c\u021e\u0230\u023f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}