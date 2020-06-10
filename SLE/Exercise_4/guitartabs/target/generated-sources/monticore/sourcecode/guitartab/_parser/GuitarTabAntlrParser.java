// Generated from /Users/hhk/Documents/GitHub/SLE/Exercise_4/guitartabs/target/generated-sources/monticore/sourcecode/guitartab/_parser/GuitarTabAntlr.g4 by ANTLR 4.7.1

package guitartab._parser;
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
public class GuitarTabAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, LBRACK=8, PIPE=9, 
		RBRACK=10, MINUS=11, Digit=12, Linebreak=13, Name=14, WS=15, SL_COMMENT=16, 
		ML_COMMENT=17;
	public static final int
		RULE_tab_eof = 0, RULE_tab = 1, RULE_comment_eof = 2, RULE_comment = 3, 
		RULE_sixStrings_eof = 4, RULE_sixStrings = 5, RULE_guitarString_eof = 6, 
		RULE_guitarString = 7, RULE_lengthLine_eof = 8, RULE_lengthLine = 9;
	public static final String[] ruleNames = {
		"tab_eof", "tab", "comment_eof", "comment", "sixStrings_eof", "sixStrings", 
		"guitarString_eof", "guitarString", "lengthLine_eof", "lengthLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'e'", "'B'", "'G'", "'D'", "'A'", "'E'", "'L'", "'['", "'|'", "']'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "LBRACK", "PIPE", "RBRACK", 
		"MINUS", "Digit", "Linebreak", "Name", "WS", "SL_COMMENT", "ML_COMMENT"
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
	public String getGrammarFileName() { return "GuitarTabAntlr.g4"; }

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

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Linebreak
	private String convertLinebreak(Token t)  {
	    return t.getText();
	}


	public GuitarTabAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Tab_eofContext extends ParserRuleContext {
		public guitartab._ast.ASTTab ret = null;
		public TabContext tmp;
		public TerminalNode EOF() { return getToken(GuitarTabAntlrParser.EOF, 0); }
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public Tab_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterTab_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitTab_eof(this);
		}
	}

	public final Tab_eofContext tab_eof() throws RecognitionException {
		Tab_eofContext _localctx = new Tab_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tab_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((Tab_eofContext)_localctx).tmp = tab();
			((Tab_eofContext)_localctx).ret =  ((Tab_eofContext)_localctx).tmp.ret;
			setState(22);
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

	public static class TabContext extends ParserRuleContext {
		public guitartab._ast.ASTTab ret = null;
		public CommentContext tmp0;
		public SixStringsContext tmp1;
		public Token tmp2;
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<SixStringsContext> sixStrings() {
			return getRuleContexts(SixStringsContext.class);
		}
		public SixStringsContext sixStrings(int i) {
			return getRuleContext(SixStringsContext.class,i);
		}
		public List<TerminalNode> Linebreak() { return getTokens(GuitarTabAntlrParser.Linebreak); }
		public TerminalNode Linebreak(int i) {
			return getToken(GuitarTabAntlrParser.Linebreak, i);
		}
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tab);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		guitartab._ast.ASTTab _aNode = null;
		_aNode=guitartab._ast.GuitarTabNodeFactory.createASTTab();
		((TabContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LBRACK) | (1L << Linebreak))) != 0)) {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(24);
					((TabContext)_localctx).tmp0 = comment();
					addToIteratedAttributeIfNotNull(_aNode.getCommentList(), _localctx.tmp0.ret);
					}
					break;
				case T__0:
					{
					setState(27);
					((TabContext)_localctx).tmp1 = sixStrings();
					addToIteratedAttributeIfNotNull(_aNode.getSixStringsList(), _localctx.tmp1.ret);
					}
					break;
				case Linebreak:
					{
					{
					setState(30);
					((TabContext)_localctx).tmp2 = match(Linebreak);
					 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((TabContext)_localctx).tmp2));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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

	public static class Comment_eofContext extends ParserRuleContext {
		public guitartab._ast.ASTComment ret = null;
		public CommentContext tmp;
		public TerminalNode EOF() { return getToken(GuitarTabAntlrParser.EOF, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Comment_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterComment_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitComment_eof(this);
		}
	}

	public final Comment_eofContext comment_eof() throws RecognitionException {
		Comment_eofContext _localctx = new Comment_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((Comment_eofContext)_localctx).tmp = comment();
			((Comment_eofContext)_localctx).ret =  ((Comment_eofContext)_localctx).tmp.ret;
			setState(39);
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

	public static class CommentContext extends ParserRuleContext {
		public guitartab._ast.ASTComment ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public TerminalNode LBRACK() { return getToken(GuitarTabAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GuitarTabAntlrParser.RBRACK, 0); }
		public TerminalNode Linebreak() { return getToken(GuitarTabAntlrParser.Linebreak, 0); }
		public List<TerminalNode> Name() { return getTokens(GuitarTabAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(GuitarTabAntlrParser.Name, i);
		}
		public List<TerminalNode> WS() { return getTokens(GuitarTabAntlrParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GuitarTabAntlrParser.WS, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		guitartab._ast.ASTComment _aNode = null;
		_aNode=guitartab._ast.GuitarTabNodeFactory.createASTComment();
		((CommentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LBRACK);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Name || _la==WS) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Name:
					{
					{
					setState(42);
					((CommentContext)_localctx).tmp0 = match(Name);
					 addToIteratedAttributeIfNotNull(_aNode.getNameList(), convertName(((CommentContext)_localctx).tmp0));
					}
					}
					break;
				case WS:
					{
					{
					setState(44);
					((CommentContext)_localctx).tmp1 = match(WS);
					 addToIteratedAttributeIfNotNull(_aNode.getWSList(), convertWS(((CommentContext)_localctx).tmp1));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(RBRACK);
			{
			setState(52);
			((CommentContext)_localctx).tmp2 = match(Linebreak);
			_aNode.setLinebreak(convertLinebreak(((CommentContext)_localctx).tmp2));
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

	public static class SixStrings_eofContext extends ParserRuleContext {
		public guitartab._ast.ASTSixStrings ret = null;
		public SixStringsContext tmp;
		public TerminalNode EOF() { return getToken(GuitarTabAntlrParser.EOF, 0); }
		public SixStringsContext sixStrings() {
			return getRuleContext(SixStringsContext.class,0);
		}
		public SixStrings_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sixStrings_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterSixStrings_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitSixStrings_eof(this);
		}
	}

	public final SixStrings_eofContext sixStrings_eof() throws RecognitionException {
		SixStrings_eofContext _localctx = new SixStrings_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sixStrings_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((SixStrings_eofContext)_localctx).tmp = sixStrings();
			((SixStrings_eofContext)_localctx).ret =  ((SixStrings_eofContext)_localctx).tmp.ret;
			setState(57);
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

	public static class SixStringsContext extends ParserRuleContext {
		public guitartab._ast.ASTSixStrings ret = null;
		public GuitarStringContext tmp0;
		public Token tmp1;
		public GuitarStringContext tmp2;
		public Token tmp3;
		public GuitarStringContext tmp4;
		public Token tmp5;
		public GuitarStringContext tmp6;
		public Token tmp7;
		public GuitarStringContext tmp8;
		public Token tmp9;
		public GuitarStringContext tmp10;
		public Token tmp11;
		public LengthLineContext tmp12;
		public List<GuitarStringContext> guitarString() {
			return getRuleContexts(GuitarStringContext.class);
		}
		public GuitarStringContext guitarString(int i) {
			return getRuleContext(GuitarStringContext.class,i);
		}
		public List<TerminalNode> Linebreak() { return getTokens(GuitarTabAntlrParser.Linebreak); }
		public TerminalNode Linebreak(int i) {
			return getToken(GuitarTabAntlrParser.Linebreak, i);
		}
		public LengthLineContext lengthLine() {
			return getRuleContext(LengthLineContext.class,0);
		}
		public SixStringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sixStrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterSixStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitSixStrings(this);
		}
	}

	public final SixStringsContext sixStrings() throws RecognitionException {
		SixStringsContext _localctx = new SixStringsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sixStrings);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		guitartab._ast.ASTSixStrings _aNode = null;
		_aNode=guitartab._ast.GuitarTabNodeFactory.createASTSixStrings();
		((SixStringsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			((SixStringsContext)_localctx).tmp0 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp0.ret);
			{
			setState(62);
			((SixStringsContext)_localctx).tmp1 = match(Linebreak);
			 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp1));
			}
			setState(65);
			match(T__1);
			setState(66);
			((SixStringsContext)_localctx).tmp2 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp2.ret);
			{
			setState(68);
			((SixStringsContext)_localctx).tmp3 = match(Linebreak);
			 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp3));
			}
			setState(71);
			match(T__2);
			setState(72);
			((SixStringsContext)_localctx).tmp4 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp4.ret);
			{
			setState(74);
			((SixStringsContext)_localctx).tmp5 = match(Linebreak);
			 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp5));
			}
			setState(77);
			match(T__3);
			setState(78);
			((SixStringsContext)_localctx).tmp6 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp6.ret);
			{
			setState(80);
			((SixStringsContext)_localctx).tmp7 = match(Linebreak);
			 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp7));
			}
			setState(83);
			match(T__4);
			setState(84);
			((SixStringsContext)_localctx).tmp8 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp8.ret);
			{
			setState(86);
			((SixStringsContext)_localctx).tmp9 = match(Linebreak);
			 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp9));
			}
			setState(89);
			match(T__5);
			setState(90);
			((SixStringsContext)_localctx).tmp10 = guitarString();
			addToIteratedAttributeIfNotNull(_aNode.getGuitarStringList(), _localctx.tmp10.ret);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(92);
				((SixStringsContext)_localctx).tmp11 = match(Linebreak);
				 addToIteratedAttributeIfNotNull(_aNode.getLinebreakList(), convertLinebreak(((SixStringsContext)_localctx).tmp11));
				}
				setState(95);
				match(T__6);
				setState(96);
				((SixStringsContext)_localctx).tmp12 = lengthLine();
				_aNode.setLengthLine(_localctx.tmp12.ret);
				}
				break;
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

	public static class GuitarString_eofContext extends ParserRuleContext {
		public guitartab._ast.ASTGuitarString ret = null;
		public GuitarStringContext tmp;
		public TerminalNode EOF() { return getToken(GuitarTabAntlrParser.EOF, 0); }
		public GuitarStringContext guitarString() {
			return getRuleContext(GuitarStringContext.class,0);
		}
		public GuitarString_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guitarString_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterGuitarString_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitGuitarString_eof(this);
		}
	}

	public final GuitarString_eofContext guitarString_eof() throws RecognitionException {
		GuitarString_eofContext _localctx = new GuitarString_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_guitarString_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((GuitarString_eofContext)_localctx).tmp = guitarString();
			((GuitarString_eofContext)_localctx).ret =  ((GuitarString_eofContext)_localctx).tmp.ret;
			setState(103);
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

	public static class GuitarStringContext extends ParserRuleContext {
		public guitartab._ast.ASTGuitarString ret = null;
		public Token tmp0;
		public List<TerminalNode> PIPE() { return getTokens(GuitarTabAntlrParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GuitarTabAntlrParser.PIPE, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GuitarTabAntlrParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GuitarTabAntlrParser.MINUS, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GuitarTabAntlrParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GuitarTabAntlrParser.Digit, i);
		}
		public GuitarStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guitarString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterGuitarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitGuitarString(this);
		}
	}

	public final GuitarStringContext guitarString() throws RecognitionException {
		GuitarStringContext _localctx = new GuitarStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_guitarString);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		guitartab._ast.ASTGuitarString _aNode = null;
		_aNode=guitartab._ast.GuitarTabNodeFactory.createASTGuitarString();
		((GuitarStringContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PIPE);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==Digit) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Digit:
					{
					{
					setState(106);
					((GuitarStringContext)_localctx).tmp0 = match(Digit);
					 addToIteratedAttributeIfNotNull(_aNode.getContentList(), convertDigit(((GuitarStringContext)_localctx).tmp0));
					}
					}
					break;
				case MINUS:
					{
					setState(108);
					match(MINUS);
					_aNode.getContentList().add("-");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(PIPE);
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

	public static class LengthLine_eofContext extends ParserRuleContext {
		public guitartab._ast.ASTLengthLine ret = null;
		public LengthLineContext tmp;
		public TerminalNode EOF() { return getToken(GuitarTabAntlrParser.EOF, 0); }
		public LengthLineContext lengthLine() {
			return getRuleContext(LengthLineContext.class,0);
		}
		public LengthLine_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthLine_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterLengthLine_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitLengthLine_eof(this);
		}
	}

	public final LengthLine_eofContext lengthLine_eof() throws RecognitionException {
		LengthLine_eofContext _localctx = new LengthLine_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lengthLine_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((LengthLine_eofContext)_localctx).tmp = lengthLine();
			((LengthLine_eofContext)_localctx).ret =  ((LengthLine_eofContext)_localctx).tmp.ret;
			setState(119);
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

	public static class LengthLineContext extends ParserRuleContext {
		public guitartab._ast.ASTLengthLine ret = null;
		public Token tmp0;
		public List<TerminalNode> PIPE() { return getTokens(GuitarTabAntlrParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GuitarTabAntlrParser.PIPE, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GuitarTabAntlrParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GuitarTabAntlrParser.MINUS, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GuitarTabAntlrParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GuitarTabAntlrParser.Digit, i);
		}
		public LengthLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).enterLengthLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GuitarTabAntlrListener ) ((GuitarTabAntlrListener)listener).exitLengthLine(this);
		}
	}

	public final LengthLineContext lengthLine() throws RecognitionException {
		LengthLineContext _localctx = new LengthLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lengthLine);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		guitartab._ast.ASTLengthLine _aNode = null;
		_aNode=guitartab._ast.GuitarTabNodeFactory.createASTLengthLine();
		((LengthLineContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PIPE);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==Digit) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Digit:
					{
					{
					setState(122);
					((LengthLineContext)_localctx).tmp0 = match(Digit);
					 addToIteratedAttributeIfNotNull(_aNode.getContentList(), convertDigit(((LengthLineContext)_localctx).tmp0));
					}
					}
					break;
				case MINUS:
					{
					setState(124);
					match(MINUS);
					_aNode.getContentList().add("-");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(PIPE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7f\n\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16\13\u0084\13"+
		"\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u0087\2\26\3\2"+
		"\2\2\4$\3\2\2\2\6\'\3\2\2\2\b+\3\2\2\2\n9\3\2\2\2\f=\3\2\2\2\16g\3\2\2"+
		"\2\20k\3\2\2\2\22w\3\2\2\2\24{\3\2\2\2\26\27\5\4\3\2\27\30\b\2\1\2\30"+
		"\31\7\2\2\3\31\3\3\2\2\2\32\33\5\b\5\2\33\34\b\3\1\2\34#\3\2\2\2\35\36"+
		"\5\f\7\2\36\37\b\3\1\2\37#\3\2\2\2 !\7\17\2\2!#\b\3\1\2\"\32\3\2\2\2\""+
		"\35\3\2\2\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2"+
		"\2\2\'(\5\b\5\2()\b\4\1\2)*\7\2\2\3*\7\3\2\2\2+\62\7\n\2\2,-\7\20\2\2"+
		"-\61\b\5\1\2./\7\21\2\2/\61\b\5\1\2\60,\3\2\2\2\60.\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\f"+
		"\2\2\66\67\7\17\2\2\678\b\5\1\28\t\3\2\2\29:\5\f\7\2:;\b\6\1\2;<\7\2\2"+
		"\3<\13\3\2\2\2=>\7\3\2\2>?\5\20\t\2?@\b\7\1\2@A\7\17\2\2AB\b\7\1\2BC\3"+
		"\2\2\2CD\7\4\2\2DE\5\20\t\2EF\b\7\1\2FG\7\17\2\2GH\b\7\1\2HI\3\2\2\2I"+
		"J\7\5\2\2JK\5\20\t\2KL\b\7\1\2LM\7\17\2\2MN\b\7\1\2NO\3\2\2\2OP\7\6\2"+
		"\2PQ\5\20\t\2QR\b\7\1\2RS\7\17\2\2ST\b\7\1\2TU\3\2\2\2UV\7\7\2\2VW\5\20"+
		"\t\2WX\b\7\1\2XY\7\17\2\2YZ\b\7\1\2Z[\3\2\2\2[\\\7\b\2\2\\]\5\20\t\2]"+
		"e\b\7\1\2^_\7\17\2\2_`\b\7\1\2`a\3\2\2\2ab\7\t\2\2bc\5\24\13\2cd\b\7\1"+
		"\2df\3\2\2\2e^\3\2\2\2ef\3\2\2\2f\r\3\2\2\2gh\5\20\t\2hi\b\b\1\2ij\7\2"+
		"\2\3j\17\3\2\2\2kr\7\13\2\2lm\7\16\2\2mq\b\t\1\2no\7\r\2\2oq\b\t\1\2p"+
		"l\3\2\2\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uv\7\13\2\2v\21\3\2\2\2wx\5\24\13\2xy\b\n\1\2yz\7\2\2\3z\23\3\2\2\2{\u0082"+
		"\7\13\2\2|}\7\16\2\2}\u0081\b\13\1\2~\177\7\r\2\2\177\u0081\b\13\1\2\u0080"+
		"|\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\13"+
		"\2\2\u0086\25\3\2\2\2\13\"$\60\62epr\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}