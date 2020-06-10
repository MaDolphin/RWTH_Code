// Generated from /Users/hhk/Documents/GitHub/SLE/Exercise_3/cd-aut-lang/target/generated-sources/monticore/sourcecode/automata/_parser/AutomataAntlr.g4 by ANTLR 4.7.1

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LTLT=15, GTGT=16, STAR=17, 
		SEMI=18, LCURLY=19, RCURLY=20, MINUS=21, POINT=22, GT=23, Name=24, WS=25, 
		SL_COMMENT=26, ML_COMMENT=27;
	public static final int
		RULE_mCQualifiedName_eof = 0, RULE_mCQualifiedName = 1, RULE_mCImportStatement_eof = 2, 
		RULE_mCImportStatement = 3, RULE_mCPrimitiveType_eof = 4, RULE_mCPrimitiveType = 5, 
		RULE_mCQualifiedType_eof = 6, RULE_mCQualifiedType = 7, RULE_mCReturnType_eof = 8, 
		RULE_mCReturnType = 9, RULE_mCVoidType_eof = 10, RULE_mCVoidType = 11, 
		RULE_automaton_eof = 12, RULE_automaton = 13, RULE_state_eof = 14, RULE_state = 15, 
		RULE_transition_eof = 16, RULE_transition = 17, RULE_type_eof = 18, RULE_type = 19, 
		RULE_typeVar_eof = 20, RULE_typeVar = 21, RULE_field_eof = 22, RULE_field = 23, 
		RULE_method_eof = 24, RULE_method = 25, RULE_mCType_eof = 26, RULE_mCType = 27, 
		RULE_mCObjectType_eof = 28, RULE_mCObjectType = 29;
	public static final String[] ruleNames = {
		"mCQualifiedName_eof", "mCQualifiedName", "mCImportStatement_eof", "mCImportStatement", 
		"mCPrimitiveType_eof", "mCPrimitiveType", "mCQualifiedType_eof", "mCQualifiedType", 
		"mCReturnType_eof", "mCReturnType", "mCVoidType_eof", "mCVoidType", "automaton_eof", 
		"automaton", "state_eof", "state", "transition_eof", "transition", "type_eof", 
		"type", "typeVar_eof", "typeVar", "field_eof", "field", "method_eof", 
		"method", "mCType_eof", "mCType", "mCObjectType_eof", "mCObjectType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", 
		"'char'", "'float'", "'double'", "'void'", "'automata'", "'state'", "'initial'", 
		"'final'", "'<<'", "'>>'", "'*'", "';'", "'{'", "'}'", "'-'", "'.'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LTLT", "GTGT", "STAR", "SEMI", "LCURLY", "RCURLY", 
		"MINUS", "POINT", "GT", "Name", "WS", "SL_COMMENT", "ML_COMMENT"
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
	public static class MCQualifiedName_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName ret = null;
		public MCQualifiedNameContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public MCQualifiedName_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedName_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCQualifiedName_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCQualifiedName_eof(this);
		}
	}

	public final MCQualifiedName_eofContext mCQualifiedName_eof() throws RecognitionException {
		MCQualifiedName_eofContext _localctx = new MCQualifiedName_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mCQualifiedName_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((MCQualifiedName_eofContext)_localctx).tmp = mCQualifiedName();
			((MCQualifiedName_eofContext)_localctx).ret =  ((MCQualifiedName_eofContext)_localctx).tmp.ret;
			setState(62);
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

	public static class MCQualifiedNameContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName ret = null;
		public Token tmp0;
		public Token tmp1;
		public List<TerminalNode> Name() { return getTokens(AutomataAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(AutomataAntlrParser.Name, i);
		}
		public List<TerminalNode> POINT() { return getTokens(AutomataAntlrParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(AutomataAntlrParser.POINT, i);
		}
		public MCQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCQualifiedName(this);
		}
	}

	public final MCQualifiedNameContext mCQualifiedName() throws RecognitionException {
		MCQualifiedNameContext _localctx = new MCQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mCQualifiedName);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCQualifiedName();
		((MCQualifiedNameContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(64);
			((MCQualifiedNameContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_aNode.getPartList(), convertName(((MCQualifiedNameContext)_localctx).tmp0));
			}
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(POINT);
					{
					setState(68);
					((MCQualifiedNameContext)_localctx).tmp1 = match(Name);
					 addToIteratedAttributeIfNotNull(_aNode.getPartList(), convertName(((MCQualifiedNameContext)_localctx).tmp1));
					}
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class MCImportStatement_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCImportStatement ret = null;
		public MCImportStatementContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCImportStatementContext mCImportStatement() {
			return getRuleContext(MCImportStatementContext.class,0);
		}
		public MCImportStatement_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCImportStatement_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCImportStatement_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCImportStatement_eof(this);
		}
	}

	public final MCImportStatement_eofContext mCImportStatement_eof() throws RecognitionException {
		MCImportStatement_eofContext _localctx = new MCImportStatement_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mCImportStatement_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((MCImportStatement_eofContext)_localctx).tmp = mCImportStatement();
			((MCImportStatement_eofContext)_localctx).ret =  ((MCImportStatement_eofContext)_localctx).tmp.ret;
			setState(77);
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

	public static class MCImportStatementContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCImportStatement ret = null;
		public MCQualifiedNameContext tmp0;
		public TerminalNode SEMI() { return getToken(AutomataAntlrParser.SEMI, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public TerminalNode POINT() { return getToken(AutomataAntlrParser.POINT, 0); }
		public TerminalNode STAR() { return getToken(AutomataAntlrParser.STAR, 0); }
		public MCImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCImportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCImportStatement(this);
		}
	}

	public final MCImportStatementContext mCImportStatement() throws RecognitionException {
		MCImportStatementContext _localctx = new MCImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mCImportStatement);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCImportStatement _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCImportStatement();
		((MCImportStatementContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			((MCImportStatementContext)_localctx).tmp0 = mCQualifiedName();
			_aNode.setMCQualifiedName(_localctx.tmp0.ret);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(82);
				match(POINT);
				{
				setState(83);
				match(STAR);

				_aNode.setStar(true);

				}
				}
			}

			setState(87);
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

	public static class MCPrimitiveType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType ret = null;
		public MCPrimitiveTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCPrimitiveTypeContext mCPrimitiveType() {
			return getRuleContext(MCPrimitiveTypeContext.class,0);
		}
		public MCPrimitiveType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCPrimitiveType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCPrimitiveType_eof(this);
		}
	}

	public final MCPrimitiveType_eofContext mCPrimitiveType_eof() throws RecognitionException {
		MCPrimitiveType_eofContext _localctx = new MCPrimitiveType_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mCPrimitiveType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((MCPrimitiveType_eofContext)_localctx).tmp = mCPrimitiveType();
			((MCPrimitiveType_eofContext)_localctx).ret =  ((MCPrimitiveType_eofContext)_localctx).tmp.ret;
			setState(91);
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

	public static class MCPrimitiveTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType ret = null;
		public MCPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCPrimitiveType(this);
		}
	}

	public final MCPrimitiveTypeContext mCPrimitiveType() throws RecognitionException {
		MCPrimitiveTypeContext _localctx = new MCPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mCPrimitiveType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCPrimitiveType();
		((MCPrimitiveTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(93);
				match(T__1);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BOOLEAN);

				}
				break;
			case T__2:
				{
				setState(95);
				match(T__2);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BYTE);

				}
				break;
			case T__3:
				{
				setState(97);
				match(T__3);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.SHORT);

				}
				break;
			case T__4:
				{
				setState(99);
				match(T__4);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.INT);

				}
				break;
			case T__5:
				{
				setState(101);
				match(T__5);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.LONG);

				}
				break;
			case T__6:
				{
				setState(103);
				match(T__6);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.CHAR);

				}
				break;
			case T__7:
				{
				setState(105);
				match(T__7);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.FLOAT);

				}
				break;
			case T__8:
				{
				setState(107);
				match(T__8);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.DOUBLE);

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

	public static class MCQualifiedType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType ret = null;
		public MCQualifiedTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCQualifiedType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCQualifiedType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCQualifiedType_eof(this);
		}
	}

	public final MCQualifiedType_eofContext mCQualifiedType_eof() throws RecognitionException {
		MCQualifiedType_eofContext _localctx = new MCQualifiedType_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mCQualifiedType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((MCQualifiedType_eofContext)_localctx).tmp = mCQualifiedType();
			((MCQualifiedType_eofContext)_localctx).ret =  ((MCQualifiedType_eofContext)_localctx).tmp.ret;
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

	public static class MCQualifiedTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType ret = null;
		public MCQualifiedNameContext tmp0;
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public MCQualifiedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCQualifiedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCQualifiedType(this);
		}
	}

	public final MCQualifiedTypeContext mCQualifiedType() throws RecognitionException {
		MCQualifiedTypeContext _localctx = new MCQualifiedTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mCQualifiedType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCQualifiedType();
		((MCQualifiedTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((MCQualifiedTypeContext)_localctx).tmp0 = mCQualifiedName();
			_aNode.setMCQualifiedName(_localctx.tmp0.ret);
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

	public static class MCReturnType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCReturnType ret = null;
		public MCReturnTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCReturnTypeContext mCReturnType() {
			return getRuleContext(MCReturnTypeContext.class,0);
		}
		public MCReturnType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCReturnType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCReturnType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCReturnType_eof(this);
		}
	}

	public final MCReturnType_eofContext mCReturnType_eof() throws RecognitionException {
		MCReturnType_eofContext _localctx = new MCReturnType_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mCReturnType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((MCReturnType_eofContext)_localctx).tmp = mCReturnType();
			((MCReturnType_eofContext)_localctx).ret =  ((MCReturnType_eofContext)_localctx).tmp.ret;
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

	public static class MCReturnTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCReturnType ret = null;
		public MCVoidTypeContext tmp0;
		public MCTypeContext tmp1;
		public MCVoidTypeContext mCVoidType() {
			return getRuleContext(MCVoidTypeContext.class,0);
		}
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public MCReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCReturnType(this);
		}
	}

	public final MCReturnTypeContext mCReturnType() throws RecognitionException {
		MCReturnTypeContext _localctx = new MCReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mCReturnType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCReturnType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCReturnType();
		((MCReturnTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((MCReturnTypeContext)_localctx).tmp0 = mCVoidType();
				_aNode.setMCVoidType(_localctx.tmp0.ret);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((MCReturnTypeContext)_localctx).tmp1 = mCType();
				_aNode.setMCType(_localctx.tmp1.ret);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MCVoidType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCVoidType ret = null;
		public MCVoidTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCVoidTypeContext mCVoidType() {
			return getRuleContext(MCVoidTypeContext.class,0);
		}
		public MCVoidType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCVoidType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCVoidType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCVoidType_eof(this);
		}
	}

	public final MCVoidType_eofContext mCVoidType_eof() throws RecognitionException {
		MCVoidType_eofContext _localctx = new MCVoidType_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mCVoidType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((MCVoidType_eofContext)_localctx).tmp = mCVoidType();
			((MCVoidType_eofContext)_localctx).ret =  ((MCVoidType_eofContext)_localctx).tmp.ret;
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

	public static class MCVoidTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCVoidType ret = null;
		public MCVoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCVoidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCVoidType(this);
		}
	}

	public final MCVoidTypeContext mCVoidType() throws RecognitionException {
		MCVoidTypeContext _localctx = new MCVoidTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mCVoidType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCVoidType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCVoidType();
		((MCVoidTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
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
		enterRule(_localctx, 24, RULE_automaton_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Automaton_eofContext)_localctx).tmp = automaton();
			((Automaton_eofContext)_localctx).ret =  ((Automaton_eofContext)_localctx).tmp.ret;
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

	public static class AutomatonContext extends ParserRuleContext {
		public automata._ast.ASTAutomaton ret = null;
		public MCImportStatementContext tmp0;
		public Token tmp1;
		public StateContext tmp2;
		public TransitionContext tmp3;
		public TerminalNode LCURLY() { return getToken(AutomataAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutomataAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(AutomataAntlrParser.Name, 0); }
		public List<MCImportStatementContext> mCImportStatement() {
			return getRuleContexts(MCImportStatementContext.class);
		}
		public MCImportStatementContext mCImportStatement(int i) {
			return getRuleContext(MCImportStatementContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_automaton);
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(140);
				((AutomatonContext)_localctx).tmp0 = mCImportStatement();
				addToIteratedAttributeIfNotNull(_aNode.getMCImportStatementList(), _localctx.tmp0.ret);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__10);
			{
			setState(149);
			((AutomatonContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((AutomatonContext)_localctx).tmp1));
			}
			setState(152);
			match(LCURLY);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==Name) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(153);
					((AutomatonContext)_localctx).tmp2 = state();
					addToIteratedAttributeIfNotNull(_aNode.getStateList(), _localctx.tmp2.ret);
					}
					break;
				case Name:
					{
					setState(156);
					((AutomatonContext)_localctx).tmp3 = transition();
					addToIteratedAttributeIfNotNull(_aNode.getTransitionList(), _localctx.tmp3.ret);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
		enterRule(_localctx, 28, RULE_state_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((State_eofContext)_localctx).tmp = state();
			((State_eofContext)_localctx).ret =  ((State_eofContext)_localctx).tmp.ret;
			setState(168);
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
		public TerminalNode SEMI() { return getToken(AutomataAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(AutomataAntlrParser.Name, 0); }
		public List<TerminalNode> LTLT() { return getTokens(AutomataAntlrParser.LTLT); }
		public TerminalNode LTLT(int i) {
			return getToken(AutomataAntlrParser.LTLT, i);
		}
		public List<TerminalNode> GTGT() { return getTokens(AutomataAntlrParser.GTGT); }
		public TerminalNode GTGT(int i) {
			return getToken(AutomataAntlrParser.GTGT, i);
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
		enterRule(_localctx, 30, RULE_state);
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
			setState(170);
			match(T__11);
			{
			setState(171);
			((StateContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((StateContext)_localctx).tmp0));
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LTLT) {
				{
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					{
					setState(174);
					match(LTLT);
					{
					setState(175);
					match(T__12);

					_aNode.setInitial(true);

					}
					setState(178);
					match(GTGT);
					}
					}
					break;
				case 2:
					{
					{
					setState(179);
					match(LTLT);
					{
					setState(180);
					match(T__13);

					_aNode.setFinal(true);

					}
					setState(183);
					match(GTGT);
					}
					}
					break;
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
		enterRule(_localctx, 32, RULE_transition_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Transition_eofContext)_localctx).tmp = transition();
			((Transition_eofContext)_localctx).ret =  ((Transition_eofContext)_localctx).tmp.ret;
			setState(193);
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
		enterRule(_localctx, 34, RULE_transition);
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
			setState(195);
			((TransitionContext)_localctx).tmp0 = match(Name);
			_aNode.setFrom(convertName(((TransitionContext)_localctx).tmp0));
			}
			setState(198);
			match(MINUS);
			{
			setState(199);
			((TransitionContext)_localctx).tmp1 = match(Name);
			_aNode.setInput(convertName(((TransitionContext)_localctx).tmp1));
			}
			setState(202);
			match(GT);
			{
			setState(203);
			((TransitionContext)_localctx).tmp2 = match(Name);
			_aNode.setTo(convertName(((TransitionContext)_localctx).tmp2));
			}
			setState(206);
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

	public static class Type_eofContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTType ret = null;
		public TypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitType_eof(this);
		}
	}

	public final Type_eofContext type_eof() throws RecognitionException {
		Type_eofContext _localctx = new Type_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((Type_eofContext)_localctx).tmp = type();
			((Type_eofContext)_localctx).ret =  ((Type_eofContext)_localctx).tmp.ret;
			setState(210);
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

	public static class TypeContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTType ret;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
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

	public static class TypeVar_eofContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTTypeVar ret = null;
		public TypeVarContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public TypeVar_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVar_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterTypeVar_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitTypeVar_eof(this);
		}
	}

	public final TypeVar_eofContext typeVar_eof() throws RecognitionException {
		TypeVar_eofContext _localctx = new TypeVar_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeVar_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((TypeVar_eofContext)_localctx).tmp = typeVar();
			((TypeVar_eofContext)_localctx).ret =  ((TypeVar_eofContext)_localctx).tmp.ret;
			setState(216);
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

	public static class TypeVarContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTTypeVar ret;
		public TypeVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterTypeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitTypeVar(this);
		}
	}

	public final TypeVarContext typeVar() throws RecognitionException {
		TypeVarContext _localctx = new TypeVarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeVar);
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

	public static class Field_eofContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTField ret = null;
		public FieldContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterField_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitField_eof(this);
		}
	}

	public final Field_eofContext field_eof() throws RecognitionException {
		Field_eofContext _localctx = new Field_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Field_eofContext)_localctx).tmp = field();
			((Field_eofContext)_localctx).ret =  ((Field_eofContext)_localctx).tmp.ret;
			setState(222);
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

	public static class FieldContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTField ret;
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_field);
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

	public static class Method_eofContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTMethod ret = null;
		public MethodContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Method_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMethod_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMethod_eof(this);
		}
	}

	public final Method_eofContext method_eof() throws RecognitionException {
		Method_eofContext _localctx = new Method_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_method_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((Method_eofContext)_localctx).tmp = method();
			((Method_eofContext)_localctx).ret =  ((Method_eofContext)_localctx).tmp.ret;
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

	public static class MethodContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTMethod ret;
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_method);
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

	public static class MCType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCType ret = null;
		public MCTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public MCType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCType_eof(this);
		}
	}

	public final MCType_eofContext mCType_eof() throws RecognitionException {
		MCType_eofContext _localctx = new MCType_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mCType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((MCType_eofContext)_localctx).tmp = mCType();
			((MCType_eofContext)_localctx).ret =  ((MCType_eofContext)_localctx).tmp.ret;
			setState(234);
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

	public static class MCTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCType ret;
		public MCPrimitiveTypeContext tmp3;
		public MCObjectTypeContext tmp4;
		public MCPrimitiveTypeContext mCPrimitiveType() {
			return getRuleContext(MCPrimitiveTypeContext.class,0);
		}
		public MCObjectTypeContext mCObjectType() {
			return getRuleContext(MCObjectTypeContext.class,0);
		}
		public MCTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCType(this);
		}
	}

	public final MCTypeContext mCType() throws RecognitionException {
		MCTypeContext _localctx = new MCTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mCType);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((MCTypeContext)_localctx).tmp3 = mCPrimitiveType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp3.ret;
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((MCTypeContext)_localctx).tmp4 = mCObjectType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp4.ret;
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

	public static class MCObjectType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCObjectType ret = null;
		public MCObjectTypeContext tmp;
		public TerminalNode EOF() { return getToken(AutomataAntlrParser.EOF, 0); }
		public MCObjectTypeContext mCObjectType() {
			return getRuleContext(MCObjectTypeContext.class,0);
		}
		public MCObjectType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCObjectType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCObjectType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCObjectType_eof(this);
		}
	}

	public final MCObjectType_eofContext mCObjectType_eof() throws RecognitionException {
		MCObjectType_eofContext _localctx = new MCObjectType_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mCObjectType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((MCObjectType_eofContext)_localctx).tmp = mCObjectType();
			((MCObjectType_eofContext)_localctx).ret =  ((MCObjectType_eofContext)_localctx).tmp.ret;
			setState(246);
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

	public static class MCObjectTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCObjectType ret;
		public MCQualifiedTypeContext tmp5;
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).enterMCObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomataAntlrListener ) ((AutomataAntlrListener)listener).exitMCObjectType(this);
		}
	}

	public final MCObjectTypeContext mCObjectType() throws RecognitionException {
		MCObjectTypeContext _localctx = new MCObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mCObjectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((MCObjectTypeContext)_localctx).tmp5 = mCQualifiedType();
			((MCObjectTypeContext)_localctx).ret = ((MCObjectTypeContext)_localctx).tmp5.ret;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0083\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00bb\n\21\f\21\16\21\u00be\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f5\n\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u00ef\2>\3\2\2\2\4B\3\2\2\2\6"+
		"M\3\2\2\2\bQ\3\2\2\2\n[\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20u\3\2\2\2\22"+
		"x\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0088\3\2\2\2\32\u008a"+
		"\3\2\2\2\34\u0093\3\2\2\2\36\u00a8\3\2\2\2 \u00ac\3\2\2\2\"\u00c1\3\2"+
		"\2\2$\u00c5\3\2\2\2&\u00d2\3\2\2\2(\u00d6\3\2\2\2*\u00d8\3\2\2\2,\u00dc"+
		"\3\2\2\2.\u00de\3\2\2\2\60\u00e2\3\2\2\2\62\u00e4\3\2\2\2\64\u00e8\3\2"+
		"\2\2\66\u00ea\3\2\2\28\u00f4\3\2\2\2:\u00f6\3\2\2\2<\u00fa\3\2\2\2>?\5"+
		"\4\3\2?@\b\2\1\2@A\7\2\2\3A\3\3\2\2\2BC\7\32\2\2CD\b\3\1\2DJ\3\2\2\2E"+
		"F\7\30\2\2FG\7\32\2\2GI\b\3\1\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2"+
		"\2K\5\3\2\2\2LJ\3\2\2\2MN\5\b\5\2NO\b\4\1\2OP\7\2\2\3P\7\3\2\2\2QR\7\3"+
		"\2\2RS\5\4\3\2SW\b\5\1\2TU\7\30\2\2UV\7\23\2\2VX\b\5\1\2WT\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\7\24\2\2Z\t\3\2\2\2[\\\5\f\7\2\\]\b\6\1\2]^\7\2\2\3"+
		"^\13\3\2\2\2_`\7\4\2\2`p\b\7\1\2ab\7\5\2\2bp\b\7\1\2cd\7\6\2\2dp\b\7\1"+
		"\2ef\7\7\2\2fp\b\7\1\2gh\7\b\2\2hp\b\7\1\2ij\7\t\2\2jp\b\7\1\2kl\7\n\2"+
		"\2lp\b\7\1\2mn\7\13\2\2np\b\7\1\2o_\3\2\2\2oa\3\2\2\2oc\3\2\2\2oe\3\2"+
		"\2\2og\3\2\2\2oi\3\2\2\2ok\3\2\2\2om\3\2\2\2p\r\3\2\2\2qr\5\20\t\2rs\b"+
		"\b\1\2st\7\2\2\3t\17\3\2\2\2uv\5\4\3\2vw\b\t\1\2w\21\3\2\2\2xy\5\24\13"+
		"\2yz\b\n\1\2z{\7\2\2\3{\23\3\2\2\2|}\5\30\r\2}~\b\13\1\2~\u0083\3\2\2"+
		"\2\177\u0080\58\35\2\u0080\u0081\b\13\1\2\u0081\u0083\3\2\2\2\u0082|\3"+
		"\2\2\2\u0082\177\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086"+
		"\b\f\1\2\u0086\u0087\7\2\2\3\u0087\27\3\2\2\2\u0088\u0089\7\f\2\2\u0089"+
		"\31\3\2\2\2\u008a\u008b\5\34\17\2\u008b\u008c\b\16\1\2\u008c\u008d\7\2"+
		"\2\3\u008d\33\3\2\2\2\u008e\u008f\5\b\5\2\u008f\u0090\b\17\1\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\r"+
		"\2\2\u0097\u0098\7\32\2\2\u0098\u0099\b\17\1\2\u0099\u009a\3\2\2\2\u009a"+
		"\u00a3\7\25\2\2\u009b\u009c\5 \21\2\u009c\u009d\b\17\1\2\u009d\u00a2\3"+
		"\2\2\2\u009e\u009f\5$\23\2\u009f\u00a0\b\17\1\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\26\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\b\20"+
		"\1\2\u00aa\u00ab\7\2\2\3\u00ab\37\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae"+
		"\7\32\2\2\u00ae\u00af\b\21\1\2\u00af\u00bc\3\2\2\2\u00b0\u00b1\7\21\2"+
		"\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\b\21\1\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00bb\7\22\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8"+
		"\b\21\1\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\22\2\2\u00ba\u00b0\3\2\2\2"+
		"\u00ba\u00b5\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\24\2\2"+
		"\u00c0!\3\2\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\b\22\1\2\u00c3\u00c4\7"+
		"\2\2\3\u00c4#\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\b\23\1\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb\b"+
		"\23\1\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00ce\7\32\2\2"+
		"\u00ce\u00cf\b\23\1\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\24\2\2\u00d1%"+
		"\3\2\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\b\24\1\2\u00d4\u00d5\7\2\2\3"+
		"\u00d5\'\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00d9\5,\27"+
		"\2\u00d9\u00da\b\26\1\2\u00da\u00db\7\2\2\3\u00db+\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd-\3\2\2\2\u00de\u00df\5\60\31\2\u00df\u00e0\b\30\1\2\u00e0"+
		"\u00e1\7\2\2\3\u00e1/\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\61\3\2\2\2\u00e4"+
		"\u00e5\5\64\33\2\u00e5\u00e6\b\32\1\2\u00e6\u00e7\7\2\2\3\u00e7\63\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\65\3\2\2\2\u00ea\u00eb\58\35\2\u00eb\u00ec"+
		"\b\34\1\2\u00ec\u00ed\7\2\2\3\u00ed\67\3\2\2\2\u00ee\u00ef\5\f\7\2\u00ef"+
		"\u00f0\b\35\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2\5<\37\2\u00f2\u00f3\b"+
		"\35\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"9\3\2\2\2\u00f6\u00f7\5<\37\2\u00f7\u00f8\b\36\1\2\u00f8\u00f9\7\2\2\3"+
		"\u00f9;\3\2\2\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\b\37\1\2\u00fc=\3\2\2"+
		"\2\fJWo\u0082\u0093\u00a1\u00a3\u00ba\u00bc\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}