// Generated from /Users/hhk/Documents/GitHub/SLE/Exercise_3/cd-aut-lang/target/generated-sources/monticore/sourcecode/classdiagrams/_parser/ClassDiagramsAntlr.g4 by ANTLR 4.7.1

package classdiagrams._parser;
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
public class ClassDiagramsAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, HASH=27, LPAREN=28, RPAREN=29, STAR=30, PLUS=31, COMMA=32, 
		MINUS=33, POINT=34, POINTPOINTPOINT=35, SLASH=36, SEMI=37, LCURLY=38, 
		LT=39, RCURLY=40, GT=41, Name=42, WS=43, SL_COMMENT=44, ML_COMMENT=45, 
		Digits=46, Char=47, String=48;
	public static final int
		RULE_nullLiteral_eof = 0, RULE_nullLiteral = 1, RULE_booleanLiteral_eof = 2, 
		RULE_booleanLiteral = 3, RULE_charLiteral_eof = 4, RULE_charLiteral = 5, 
		RULE_stringLiteral_eof = 6, RULE_stringLiteral = 7, RULE_natLiteral_eof = 8, 
		RULE_natLiteral = 9, RULE_signedNatLiteral_eof = 10, RULE_signedNatLiteral = 11, 
		RULE_basicLongLiteral_eof = 12, RULE_basicLongLiteral = 13, RULE_signedBasicLongLiteral_eof = 14, 
		RULE_signedBasicLongLiteral = 15, RULE_basicFloatLiteral_eof = 16, RULE_basicFloatLiteral = 17, 
		RULE_signedBasicFloatLiteral_eof = 18, RULE_signedBasicFloatLiteral = 19, 
		RULE_basicDoubleLiteral_eof = 20, RULE_basicDoubleLiteral = 21, RULE_signedBasicDoubleLiteral_eof = 22, 
		RULE_signedBasicDoubleLiteral = 23, RULE_mCQualifiedName_eof = 24, RULE_mCQualifiedName = 25, 
		RULE_mCImportStatement_eof = 26, RULE_mCImportStatement = 27, RULE_mCPrimitiveType_eof = 28, 
		RULE_mCPrimitiveType = 29, RULE_mCQualifiedType_eof = 30, RULE_mCQualifiedType = 31, 
		RULE_mCReturnType_eof = 32, RULE_mCReturnType = 33, RULE_mCVoidType_eof = 34, 
		RULE_mCVoidType = 35, RULE_mCListType_eof = 36, RULE_mCListType = 37, 
		RULE_mCOptionalType_eof = 38, RULE_mCOptionalType = 39, RULE_mCMapType_eof = 40, 
		RULE_mCMapType = 41, RULE_mCSetType_eof = 42, RULE_mCSetType = 43, RULE_mCBasicTypeArgument_eof = 44, 
		RULE_mCBasicTypeArgument = 45, RULE_mCPrimitiveTypeArgument_eof = 46, 
		RULE_mCPrimitiveTypeArgument = 47, RULE_mCBasicGenericType_eof = 48, RULE_mCBasicGenericType = 49, 
		RULE_mCCustomTypeArgument_eof = 50, RULE_mCCustomTypeArgument = 51, RULE_cDCompilationUnit_eof = 52, 
		RULE_cDCompilationUnit = 53, RULE_cDDefinition_eof = 54, RULE_cDDefinition = 55, 
		RULE_cDClass_eof = 56, RULE_cDClass = 57, RULE_tImplements_eof = 58, RULE_tImplements = 59, 
		RULE_cDInterface_eof = 60, RULE_cDInterface = 61, RULE_cDAttribute_eof = 62, 
		RULE_cDAttribute = 63, RULE_cDConstructor_eof = 64, RULE_cDConstructor = 65, 
		RULE_cDMethod_eof = 66, RULE_cDMethod = 67, RULE_cDParameter_eof = 68, 
		RULE_cDParameter = 69, RULE_modifier_eof = 70, RULE_modifier = 71, RULE_literal_eof = 72, 
		RULE_literal = 73, RULE_signedLiteral_eof = 74, RULE_signedLiteral = 75, 
		RULE_numericLiteral_eof = 76, RULE_numericLiteral = 77, RULE_signedNumericLiteral_eof = 78, 
		RULE_signedNumericLiteral = 79, RULE_type_eof = 80, RULE_type = 81, RULE_typeVar_eof = 82, 
		RULE_typeVar = 83, RULE_field_eof = 84, RULE_field = 85, RULE_method_eof = 86, 
		RULE_method = 87, RULE_mCType_eof = 88, RULE_mCType = 89, RULE_mCObjectType_eof = 90, 
		RULE_mCObjectType = 91, RULE_mCGenericType_eof = 92, RULE_mCGenericType = 93, 
		RULE_mCTypeArgument_eof = 94, RULE_mCTypeArgument = 95, RULE_cDType_eof = 96, 
		RULE_cDType = 97, RULE_cDField_eof = 98, RULE_cDField = 99, RULE_cDMethOrConstr_eof = 100, 
		RULE_cDMethOrConstr = 101;
	public static final String[] ruleNames = {
		"nullLiteral_eof", "nullLiteral", "booleanLiteral_eof", "booleanLiteral", 
		"charLiteral_eof", "charLiteral", "stringLiteral_eof", "stringLiteral", 
		"natLiteral_eof", "natLiteral", "signedNatLiteral_eof", "signedNatLiteral", 
		"basicLongLiteral_eof", "basicLongLiteral", "signedBasicLongLiteral_eof", 
		"signedBasicLongLiteral", "basicFloatLiteral_eof", "basicFloatLiteral", 
		"signedBasicFloatLiteral_eof", "signedBasicFloatLiteral", "basicDoubleLiteral_eof", 
		"basicDoubleLiteral", "signedBasicDoubleLiteral_eof", "signedBasicDoubleLiteral", 
		"mCQualifiedName_eof", "mCQualifiedName", "mCImportStatement_eof", "mCImportStatement", 
		"mCPrimitiveType_eof", "mCPrimitiveType", "mCQualifiedType_eof", "mCQualifiedType", 
		"mCReturnType_eof", "mCReturnType", "mCVoidType_eof", "mCVoidType", "mCListType_eof", 
		"mCListType", "mCOptionalType_eof", "mCOptionalType", "mCMapType_eof", 
		"mCMapType", "mCSetType_eof", "mCSetType", "mCBasicTypeArgument_eof", 
		"mCBasicTypeArgument", "mCPrimitiveTypeArgument_eof", "mCPrimitiveTypeArgument", 
		"mCBasicGenericType_eof", "mCBasicGenericType", "mCCustomTypeArgument_eof", 
		"mCCustomTypeArgument", "cDCompilationUnit_eof", "cDCompilationUnit", 
		"cDDefinition_eof", "cDDefinition", "cDClass_eof", "cDClass", "tImplements_eof", 
		"tImplements", "cDInterface_eof", "cDInterface", "cDAttribute_eof", "cDAttribute", 
		"cDConstructor_eof", "cDConstructor", "cDMethod_eof", "cDMethod", "cDParameter_eof", 
		"cDParameter", "modifier_eof", "modifier", "literal_eof", "literal", "signedLiteral_eof", 
		"signedLiteral", "numericLiteral_eof", "numericLiteral", "signedNumericLiteral_eof", 
		"signedNumericLiteral", "type_eof", "type", "typeVar_eof", "typeVar", 
		"field_eof", "field", "method_eof", "method", "mCType_eof", "mCType", 
		"mCObjectType_eof", "mCObjectType", "mCGenericType_eof", "mCGenericType", 
		"mCTypeArgument_eof", "mCTypeArgument", "cDType_eof", "cDType", "cDField_eof", 
		"cDField", "cDMethOrConstr_eof", "cDMethOrConstr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'import'", "'boolean'", "'byte'", 
		"'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'void'", 
		"'package'", "'classdiagram'", "'class'", "'extends'", "'interface'", 
		"'throws'", "'abstract'", "'final'", "'static'", "'private'", "'protected'", 
		"'public'", "'derived'", "'#'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'...'", "'/'", "';'", "'{'", "'<'", "'}'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "HASH", "LPAREN", "RPAREN", "STAR", "PLUS", "COMMA", 
		"MINUS", "POINT", "POINTPOINTPOINT", "SLASH", "SEMI", "LCURLY", "LT", 
		"RCURLY", "GT", "Name", "WS", "SL_COMMENT", "ML_COMMENT", "Digits", "Char", 
		"String"
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
	public String getGrammarFileName() { return "ClassDiagramsAntlr.g4"; }

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


	public ClassDiagramsAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteral_eofContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public NullLiteralContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public NullLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNullLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNullLiteral_eof(this);
		}
	}

	public final NullLiteral_eofContext nullLiteral_eof() throws RecognitionException {
		NullLiteral_eofContext _localctx = new NullLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((NullLiteral_eofContext)_localctx).tmp = nullLiteral();
			((NullLiteral_eofContext)_localctx).ret =  ((NullLiteral_eofContext)_localctx).tmp.ret;
			setState(206);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNullLiteral(this);
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
			setState(208);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBooleanLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBooleanLiteral_eof(this);
		}
	}

	public final BooleanLiteral_eofContext booleanLiteral_eof() throws RecognitionException {
		BooleanLiteral_eofContext _localctx = new BooleanLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((BooleanLiteral_eofContext)_localctx).tmp = booleanLiteral();
			((BooleanLiteral_eofContext)_localctx).ret =  ((BooleanLiteral_eofContext)_localctx).tmp.ret;
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBooleanLiteral(this);
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
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(214);
				match(T__1);

				_aNode.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case T__2:
				{
				setState(216);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCharLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCharLiteral_eof(this);
		}
	}

	public final CharLiteral_eofContext charLiteral_eof() throws RecognitionException {
		CharLiteral_eofContext _localctx = new CharLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_charLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((CharLiteral_eofContext)_localctx).tmp = charLiteral();
			((CharLiteral_eofContext)_localctx).ret =  ((CharLiteral_eofContext)_localctx).tmp.ret;
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

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(ClassDiagramsAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCharLiteral(this);
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
			setState(224);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterStringLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitStringLiteral_eof(this);
		}
	}

	public final StringLiteral_eofContext stringLiteral_eof() throws RecognitionException {
		StringLiteral_eofContext _localctx = new StringLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((StringLiteral_eofContext)_localctx).tmp = stringLiteral();
			((StringLiteral_eofContext)_localctx).ret =  ((StringLiteral_eofContext)_localctx).tmp.ret;
			setState(229);
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
		public TerminalNode String() { return getToken(ClassDiagramsAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitStringLiteral(this);
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
			setState(231);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public NatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNatLiteral_eof(this);
		}
	}

	public final NatLiteral_eofContext natLiteral_eof() throws RecognitionException {
		NatLiteral_eofContext _localctx = new NatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_natLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((NatLiteral_eofContext)_localctx).tmp = natLiteral();
			((NatLiteral_eofContext)_localctx).ret =  ((NatLiteral_eofContext)_localctx).tmp.ret;
			setState(236);
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
		public TerminalNode Digits() { return getToken(ClassDiagramsAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNatLiteral(this);
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
			setState(238);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedNatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedNatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedNatLiteral_eof(this);
		}
	}

	public final SignedNatLiteral_eofContext signedNatLiteral_eof() throws RecognitionException {
		SignedNatLiteral_eofContext _localctx = new SignedNatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedNatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((SignedNatLiteral_eofContext)_localctx).tmp = signedNatLiteral();
			((SignedNatLiteral_eofContext)_localctx).ret =  ((SignedNatLiteral_eofContext)_localctx).tmp.ret;
			setState(243);
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
		public TerminalNode Digits() { return getToken(ClassDiagramsAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(ClassDiagramsAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedNatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedNatLiteral(this);
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
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(245);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(249);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicLongLiteral_eof(this);
		}
	}

	public final BasicLongLiteral_eofContext basicLongLiteral_eof() throws RecognitionException {
		BasicLongLiteral_eofContext _localctx = new BasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((BasicLongLiteral_eofContext)_localctx).tmp = basicLongLiteral();
			((BasicLongLiteral_eofContext)_localctx).ret =  ((BasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(254);
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
		public TerminalNode Digits() { return getToken(ClassDiagramsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicLongLiteral(this);
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
			setState(256);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(259);
			((BasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((BasicLongLiteralContext)_localctx).tmp1));
			}
			setState(262);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicLongLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicLongLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicLongLiteral_eof(this);
		}
	}

	public final SignedBasicLongLiteral_eofContext signedBasicLongLiteral_eof() throws RecognitionException {
		SignedBasicLongLiteral_eofContext _localctx = new SignedBasicLongLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_signedBasicLongLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((SignedBasicLongLiteral_eofContext)_localctx).tmp = signedBasicLongLiteral();
			((SignedBasicLongLiteral_eofContext)_localctx).ret =  ((SignedBasicLongLiteral_eofContext)_localctx).tmp.ret;
			setState(266);
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
		public TerminalNode Digits() { return getToken(ClassDiagramsAntlrParser.Digits, 0); }
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(ClassDiagramsAntlrParser.MINUS, 0); }
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicLongLiteral(this);
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
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(268);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(272);
			((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(275);
			((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((SignedBasicLongLiteralContext)_localctx).tmp1));
			}
			setState(278);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicFloatLiteral_eof(this);
		}
	}

	public final BasicFloatLiteral_eofContext basicFloatLiteral_eof() throws RecognitionException {
		BasicFloatLiteral_eofContext _localctx = new BasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((BasicFloatLiteral_eofContext)_localctx).tmp = basicFloatLiteral();
			((BasicFloatLiteral_eofContext)_localctx).ret =  ((BasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(282);
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
		public TerminalNode POINT() { return getToken(ClassDiagramsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(ClassDiagramsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(ClassDiagramsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicFloatLiteral(this);
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
			setState(284);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(287);
			match(POINT);
			{
			setState(288);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(291);
			((BasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((BasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(294);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicFloatLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicFloatLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicFloatLiteral_eof(this);
		}
	}

	public final SignedBasicFloatLiteral_eofContext signedBasicFloatLiteral_eof() throws RecognitionException {
		SignedBasicFloatLiteral_eofContext _localctx = new SignedBasicFloatLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedBasicFloatLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((SignedBasicFloatLiteral_eofContext)_localctx).tmp = signedBasicFloatLiteral();
			((SignedBasicFloatLiteral_eofContext)_localctx).ret =  ((SignedBasicFloatLiteral_eofContext)_localctx).tmp.ret;
			setState(298);
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
		public TerminalNode POINT() { return getToken(ClassDiagramsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(ClassDiagramsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(ClassDiagramsAntlrParser.Digits, i);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public TerminalNode MINUS() { return getToken(ClassDiagramsAntlrParser.MINUS, 0); }
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicFloatLiteral(this);
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
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(300);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(304);
			((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(307);
			match(POINT);
			{
			setState(308);
			((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_aNode.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(311);
			((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((SignedBasicFloatLiteralContext)_localctx).tmp2));
			}
			setState(314);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public BasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicDoubleLiteral_eof(this);
		}
	}

	public final BasicDoubleLiteral_eofContext basicDoubleLiteral_eof() throws RecognitionException {
		BasicDoubleLiteral_eofContext _localctx = new BasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((BasicDoubleLiteral_eofContext)_localctx).tmp = basicDoubleLiteral();
			((BasicDoubleLiteral_eofContext)_localctx).ret =  ((BasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(318);
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
		public TerminalNode POINT() { return getToken(ClassDiagramsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(ClassDiagramsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(ClassDiagramsAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitBasicDoubleLiteral(this);
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
			setState(320);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(323);
			match(POINT);
			{
			setState(324);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicDoubleLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicDoubleLiteral_eof(this);
		}
	}

	public final SignedBasicDoubleLiteral_eofContext signedBasicDoubleLiteral_eof() throws RecognitionException {
		SignedBasicDoubleLiteral_eofContext _localctx = new SignedBasicDoubleLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedBasicDoubleLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((SignedBasicDoubleLiteral_eofContext)_localctx).tmp = signedBasicDoubleLiteral();
			((SignedBasicDoubleLiteral_eofContext)_localctx).ret =  ((SignedBasicDoubleLiteral_eofContext)_localctx).tmp.ret;
			setState(329);
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
		public TerminalNode POINT() { return getToken(ClassDiagramsAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(ClassDiagramsAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(ClassDiagramsAntlrParser.Digits, i);
		}
		public TerminalNode MINUS() { return getToken(ClassDiagramsAntlrParser.MINUS, 0); }
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedBasicDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedBasicDoubleLiteral(this);
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
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				{
				setState(331);
				match(MINUS);

				_aNode.setNegative(true);

				}
				}
			}

			{
			setState(335);
			((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_aNode.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(338);
			match(POINT);
			{
			setState(339);
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

	public static class MCQualifiedName_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCQualifiedName ret = null;
		public MCQualifiedNameContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public MCQualifiedName_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedName_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCQualifiedName_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCQualifiedName_eof(this);
		}
	}

	public final MCQualifiedName_eofContext mCQualifiedName_eof() throws RecognitionException {
		MCQualifiedName_eofContext _localctx = new MCQualifiedName_eofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mCQualifiedName_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((MCQualifiedName_eofContext)_localctx).tmp = mCQualifiedName();
			((MCQualifiedName_eofContext)_localctx).ret =  ((MCQualifiedName_eofContext)_localctx).tmp.ret;
			setState(344);
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
		public List<TerminalNode> Name() { return getTokens(ClassDiagramsAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ClassDiagramsAntlrParser.Name, i);
		}
		public List<TerminalNode> POINT() { return getTokens(ClassDiagramsAntlrParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(ClassDiagramsAntlrParser.POINT, i);
		}
		public MCQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCQualifiedName(this);
		}
	}

	public final MCQualifiedNameContext mCQualifiedName() throws RecognitionException {
		MCQualifiedNameContext _localctx = new MCQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mCQualifiedName);
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
			setState(346);
			((MCQualifiedNameContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_aNode.getPartList(), convertName(((MCQualifiedNameContext)_localctx).tmp0));
			}
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					match(POINT);
					{
					setState(350);
					((MCQualifiedNameContext)_localctx).tmp1 = match(Name);
					 addToIteratedAttributeIfNotNull(_aNode.getPartList(), convertName(((MCQualifiedNameContext)_localctx).tmp1));
					}
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCImportStatementContext mCImportStatement() {
			return getRuleContext(MCImportStatementContext.class,0);
		}
		public MCImportStatement_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCImportStatement_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCImportStatement_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCImportStatement_eof(this);
		}
	}

	public final MCImportStatement_eofContext mCImportStatement_eof() throws RecognitionException {
		MCImportStatement_eofContext _localctx = new MCImportStatement_eofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mCImportStatement_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((MCImportStatement_eofContext)_localctx).tmp = mCImportStatement();
			((MCImportStatement_eofContext)_localctx).ret =  ((MCImportStatement_eofContext)_localctx).tmp.ret;
			setState(359);
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
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public MCQualifiedNameContext mCQualifiedName() {
			return getRuleContext(MCQualifiedNameContext.class,0);
		}
		public TerminalNode POINT() { return getToken(ClassDiagramsAntlrParser.POINT, 0); }
		public TerminalNode STAR() { return getToken(ClassDiagramsAntlrParser.STAR, 0); }
		public MCImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCImportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCImportStatement(this);
		}
	}

	public final MCImportStatementContext mCImportStatement() throws RecognitionException {
		MCImportStatementContext _localctx = new MCImportStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mCImportStatement);
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
			setState(361);
			match(T__3);
			setState(362);
			((MCImportStatementContext)_localctx).tmp0 = mCQualifiedName();
			_aNode.setMCQualifiedName(_localctx.tmp0.ret);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(364);
				match(POINT);
				{
				setState(365);
				match(STAR);

				_aNode.setStar(true);

				}
				}
			}

			setState(369);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCPrimitiveTypeContext mCPrimitiveType() {
			return getRuleContext(MCPrimitiveTypeContext.class,0);
		}
		public MCPrimitiveType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCPrimitiveType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCPrimitiveType_eof(this);
		}
	}

	public final MCPrimitiveType_eofContext mCPrimitiveType_eof() throws RecognitionException {
		MCPrimitiveType_eofContext _localctx = new MCPrimitiveType_eofContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mCPrimitiveType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((MCPrimitiveType_eofContext)_localctx).tmp = mCPrimitiveType();
			((MCPrimitiveType_eofContext)_localctx).ret =  ((MCPrimitiveType_eofContext)_localctx).tmp.ret;
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

	public static class MCPrimitiveTypeContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType ret = null;
		public MCPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCPrimitiveType(this);
		}
	}

	public final MCPrimitiveTypeContext mCPrimitiveType() throws RecognitionException {
		MCPrimitiveTypeContext _localctx = new MCPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mCPrimitiveType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCPrimitiveType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCPrimitiveType();
		((MCPrimitiveTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(375);
				match(T__4);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BOOLEAN);

				}
				break;
			case T__5:
				{
				setState(377);
				match(T__5);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.BYTE);

				}
				break;
			case T__6:
				{
				setState(379);
				match(T__6);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.SHORT);

				}
				break;
			case T__7:
				{
				setState(381);
				match(T__7);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.INT);

				}
				break;
			case T__8:
				{
				setState(383);
				match(T__8);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.LONG);

				}
				break;
			case T__9:
				{
				setState(385);
				match(T__9);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.CHAR);

				}
				break;
			case T__10:
				{
				setState(387);
				match(T__10);

				_aNode.setPrimitive(de.monticore.types.mcbasictypes._ast.ASTConstantsMCBasicTypes.FLOAT);

				}
				break;
			case T__11:
				{
				setState(389);
				match(T__11);

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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCQualifiedType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCQualifiedType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCQualifiedType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCQualifiedType_eof(this);
		}
	}

	public final MCQualifiedType_eofContext mCQualifiedType_eof() throws RecognitionException {
		MCQualifiedType_eofContext _localctx = new MCQualifiedType_eofContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mCQualifiedType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((MCQualifiedType_eofContext)_localctx).tmp = mCQualifiedType();
			((MCQualifiedType_eofContext)_localctx).ret =  ((MCQualifiedType_eofContext)_localctx).tmp.ret;
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCQualifiedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCQualifiedType(this);
		}
	}

	public final MCQualifiedTypeContext mCQualifiedType() throws RecognitionException {
		MCQualifiedTypeContext _localctx = new MCQualifiedTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mCQualifiedType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCQualifiedType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCQualifiedType();
		((MCQualifiedTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCReturnTypeContext mCReturnType() {
			return getRuleContext(MCReturnTypeContext.class,0);
		}
		public MCReturnType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCReturnType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCReturnType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCReturnType_eof(this);
		}
	}

	public final MCReturnType_eofContext mCReturnType_eof() throws RecognitionException {
		MCReturnType_eofContext _localctx = new MCReturnType_eofContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mCReturnType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((MCReturnType_eofContext)_localctx).tmp = mCReturnType();
			((MCReturnType_eofContext)_localctx).ret =  ((MCReturnType_eofContext)_localctx).tmp.ret;
			setState(402);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCReturnType(this);
		}
	}

	public final MCReturnTypeContext mCReturnType() throws RecognitionException {
		MCReturnTypeContext _localctx = new MCReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mCReturnType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCReturnType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCReturnType();
		((MCReturnTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				((MCReturnTypeContext)_localctx).tmp0 = mCVoidType();
				_aNode.setMCVoidType(_localctx.tmp0.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				((MCReturnTypeContext)_localctx).tmp1 = mCType();
				_aNode.setMCType(_localctx.tmp1.ret);
				}
				break;
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCVoidTypeContext mCVoidType() {
			return getRuleContext(MCVoidTypeContext.class,0);
		}
		public MCVoidType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCVoidType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCVoidType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCVoidType_eof(this);
		}
	}

	public final MCVoidType_eofContext mCVoidType_eof() throws RecognitionException {
		MCVoidType_eofContext _localctx = new MCVoidType_eofContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mCVoidType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			((MCVoidType_eofContext)_localctx).tmp = mCVoidType();
			((MCVoidType_eofContext)_localctx).ret =  ((MCVoidType_eofContext)_localctx).tmp.ret;
			setState(414);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCVoidType(this);
		}
	}

	public final MCVoidTypeContext mCVoidType() throws RecognitionException {
		MCVoidTypeContext _localctx = new MCVoidTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mCVoidType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcbasictypes._ast.ASTMCVoidType _aNode = null;
		_aNode=de.monticore.types.mcbasictypes._ast.MCBasicTypesNodeFactory.createASTMCVoidType();
		((MCVoidTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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

	public static class MCListType_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCListType ret = null;
		public MCListTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCListTypeContext mCListType() {
			return getRuleContext(MCListTypeContext.class,0);
		}
		public MCListType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCListType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCListType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCListType_eof(this);
		}
	}

	public final MCListType_eofContext mCListType_eof() throws RecognitionException {
		MCListType_eofContext _localctx = new MCListType_eofContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mCListType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			((MCListType_eofContext)_localctx).tmp = mCListType();
			((MCListType_eofContext)_localctx).ret =  ((MCListType_eofContext)_localctx).tmp.ret;
			setState(420);
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

	public static class MCListTypeContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCListType ret = null;
		public Token tmp0;
		public MCTypeArgumentContext tmp1;
		public TerminalNode LT() { return getToken(ClassDiagramsAntlrParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClassDiagramsAntlrParser.GT, 0); }
		public MCTypeArgumentContext mCTypeArgument() {
			return getRuleContext(MCTypeArgumentContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public MCListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCListType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCListType(this);
		}
	}

	public final MCListTypeContext mCListType() throws RecognitionException {
		MCListTypeContext _localctx = new MCListTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mCListType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCListType _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCListType();
		((MCListTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			if (!(next("List"))) throw new FailedPredicateException(this, "next(\"List\")");
			{
			setState(423);
			((MCListTypeContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((MCListTypeContext)_localctx).tmp0));
			}
			setState(426);
			match(LT);
			setState(427);
			((MCListTypeContext)_localctx).tmp1 = mCTypeArgument();
			addToIteratedAttributeIfNotNull(_aNode.getMCTypeArgumentList(), _localctx.tmp1.ret);
			setState(429);
			match(GT);
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

	public static class MCOptionalType_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCOptionalType ret = null;
		public MCOptionalTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCOptionalTypeContext mCOptionalType() {
			return getRuleContext(MCOptionalTypeContext.class,0);
		}
		public MCOptionalType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCOptionalType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCOptionalType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCOptionalType_eof(this);
		}
	}

	public final MCOptionalType_eofContext mCOptionalType_eof() throws RecognitionException {
		MCOptionalType_eofContext _localctx = new MCOptionalType_eofContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mCOptionalType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((MCOptionalType_eofContext)_localctx).tmp = mCOptionalType();
			((MCOptionalType_eofContext)_localctx).ret =  ((MCOptionalType_eofContext)_localctx).tmp.ret;
			setState(433);
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

	public static class MCOptionalTypeContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCOptionalType ret = null;
		public Token tmp0;
		public MCTypeArgumentContext tmp1;
		public TerminalNode LT() { return getToken(ClassDiagramsAntlrParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClassDiagramsAntlrParser.GT, 0); }
		public MCTypeArgumentContext mCTypeArgument() {
			return getRuleContext(MCTypeArgumentContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public MCOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCOptionalType(this);
		}
	}

	public final MCOptionalTypeContext mCOptionalType() throws RecognitionException {
		MCOptionalTypeContext _localctx = new MCOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mCOptionalType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCOptionalType _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCOptionalType();
		((MCOptionalTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			if (!(next("Optional"))) throw new FailedPredicateException(this, "next(\"Optional\")");
			{
			setState(436);
			((MCOptionalTypeContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((MCOptionalTypeContext)_localctx).tmp0));
			}
			setState(439);
			match(LT);
			setState(440);
			((MCOptionalTypeContext)_localctx).tmp1 = mCTypeArgument();
			addToIteratedAttributeIfNotNull(_aNode.getMCTypeArgumentList(), _localctx.tmp1.ret);
			setState(442);
			match(GT);
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

	public static class MCMapType_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCMapType ret = null;
		public MCMapTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCMapTypeContext mCMapType() {
			return getRuleContext(MCMapTypeContext.class,0);
		}
		public MCMapType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCMapType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCMapType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCMapType_eof(this);
		}
	}

	public final MCMapType_eofContext mCMapType_eof() throws RecognitionException {
		MCMapType_eofContext _localctx = new MCMapType_eofContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mCMapType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((MCMapType_eofContext)_localctx).tmp = mCMapType();
			((MCMapType_eofContext)_localctx).ret =  ((MCMapType_eofContext)_localctx).tmp.ret;
			setState(446);
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

	public static class MCMapTypeContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCMapType ret = null;
		public Token tmp0;
		public MCTypeArgumentContext tmp1;
		public MCTypeArgumentContext tmp2;
		public TerminalNode LT() { return getToken(ClassDiagramsAntlrParser.LT, 0); }
		public TerminalNode COMMA() { return getToken(ClassDiagramsAntlrParser.COMMA, 0); }
		public TerminalNode GT() { return getToken(ClassDiagramsAntlrParser.GT, 0); }
		public List<MCTypeArgumentContext> mCTypeArgument() {
			return getRuleContexts(MCTypeArgumentContext.class);
		}
		public MCTypeArgumentContext mCTypeArgument(int i) {
			return getRuleContext(MCTypeArgumentContext.class,i);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public MCMapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCMapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCMapType(this);
		}
	}

	public final MCMapTypeContext mCMapType() throws RecognitionException {
		MCMapTypeContext _localctx = new MCMapTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mCMapType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCMapType _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCMapType();
		((MCMapTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			if (!(next("Map"))) throw new FailedPredicateException(this, "next(\"Map\")");
			{
			setState(449);
			((MCMapTypeContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((MCMapTypeContext)_localctx).tmp0));
			}
			setState(452);
			match(LT);
			setState(453);
			((MCMapTypeContext)_localctx).tmp1 = mCTypeArgument();
			_aNode.setKey(_localctx.tmp1.ret);
			setState(455);
			match(COMMA);
			setState(456);
			((MCMapTypeContext)_localctx).tmp2 = mCTypeArgument();
			_aNode.setValue(_localctx.tmp2.ret);
			setState(458);
			match(GT);
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

	public static class MCSetType_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCSetType ret = null;
		public MCSetTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCSetTypeContext mCSetType() {
			return getRuleContext(MCSetTypeContext.class,0);
		}
		public MCSetType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCSetType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCSetType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCSetType_eof(this);
		}
	}

	public final MCSetType_eofContext mCSetType_eof() throws RecognitionException {
		MCSetType_eofContext _localctx = new MCSetType_eofContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mCSetType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			((MCSetType_eofContext)_localctx).tmp = mCSetType();
			((MCSetType_eofContext)_localctx).ret =  ((MCSetType_eofContext)_localctx).tmp.ret;
			setState(462);
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

	public static class MCSetTypeContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCSetType ret = null;
		public Token tmp0;
		public MCTypeArgumentContext tmp1;
		public TerminalNode LT() { return getToken(ClassDiagramsAntlrParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClassDiagramsAntlrParser.GT, 0); }
		public MCTypeArgumentContext mCTypeArgument() {
			return getRuleContext(MCTypeArgumentContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public MCSetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCSetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCSetType(this);
		}
	}

	public final MCSetTypeContext mCSetType() throws RecognitionException {
		MCSetTypeContext _localctx = new MCSetTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mCSetType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCSetType _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCSetType();
		((MCSetTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			if (!(next("Set"))) throw new FailedPredicateException(this, "next(\"Set\")");
			{
			setState(465);
			((MCSetTypeContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((MCSetTypeContext)_localctx).tmp0));
			}
			setState(468);
			match(LT);
			setState(469);
			((MCSetTypeContext)_localctx).tmp1 = mCTypeArgument();
			addToIteratedAttributeIfNotNull(_aNode.getMCTypeArgumentList(), _localctx.tmp1.ret);
			setState(471);
			match(GT);
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

	public static class MCBasicTypeArgument_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCBasicTypeArgument ret = null;
		public MCBasicTypeArgumentContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCBasicTypeArgumentContext mCBasicTypeArgument() {
			return getRuleContext(MCBasicTypeArgumentContext.class,0);
		}
		public MCBasicTypeArgument_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCBasicTypeArgument_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCBasicTypeArgument_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCBasicTypeArgument_eof(this);
		}
	}

	public final MCBasicTypeArgument_eofContext mCBasicTypeArgument_eof() throws RecognitionException {
		MCBasicTypeArgument_eofContext _localctx = new MCBasicTypeArgument_eofContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mCBasicTypeArgument_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((MCBasicTypeArgument_eofContext)_localctx).tmp = mCBasicTypeArgument();
			((MCBasicTypeArgument_eofContext)_localctx).ret =  ((MCBasicTypeArgument_eofContext)_localctx).tmp.ret;
			setState(475);
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

	public static class MCBasicTypeArgumentContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCBasicTypeArgument ret = null;
		public MCQualifiedTypeContext tmp0;
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCBasicTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCBasicTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCBasicTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCBasicTypeArgument(this);
		}
	}

	public final MCBasicTypeArgumentContext mCBasicTypeArgument() throws RecognitionException {
		MCBasicTypeArgumentContext _localctx = new MCBasicTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mCBasicTypeArgument);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCBasicTypeArgument _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCBasicTypeArgument();
		((MCBasicTypeArgumentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((MCBasicTypeArgumentContext)_localctx).tmp0 = mCQualifiedType();
			_aNode.setMCQualifiedType(_localctx.tmp0.ret);
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

	public static class MCPrimitiveTypeArgument_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCPrimitiveTypeArgument ret = null;
		public MCPrimitiveTypeArgumentContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCPrimitiveTypeArgumentContext mCPrimitiveTypeArgument() {
			return getRuleContext(MCPrimitiveTypeArgumentContext.class,0);
		}
		public MCPrimitiveTypeArgument_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveTypeArgument_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCPrimitiveTypeArgument_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCPrimitiveTypeArgument_eof(this);
		}
	}

	public final MCPrimitiveTypeArgument_eofContext mCPrimitiveTypeArgument_eof() throws RecognitionException {
		MCPrimitiveTypeArgument_eofContext _localctx = new MCPrimitiveTypeArgument_eofContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mCPrimitiveTypeArgument_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			((MCPrimitiveTypeArgument_eofContext)_localctx).tmp = mCPrimitiveTypeArgument();
			((MCPrimitiveTypeArgument_eofContext)_localctx).ret =  ((MCPrimitiveTypeArgument_eofContext)_localctx).tmp.ret;
			setState(482);
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

	public static class MCPrimitiveTypeArgumentContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCPrimitiveTypeArgument ret = null;
		public MCPrimitiveTypeContext tmp0;
		public MCPrimitiveTypeContext mCPrimitiveType() {
			return getRuleContext(MCPrimitiveTypeContext.class,0);
		}
		public MCPrimitiveTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCPrimitiveTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCPrimitiveTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCPrimitiveTypeArgument(this);
		}
	}

	public final MCPrimitiveTypeArgumentContext mCPrimitiveTypeArgument() throws RecognitionException {
		MCPrimitiveTypeArgumentContext _localctx = new MCPrimitiveTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mCPrimitiveTypeArgument);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mccollectiontypes._ast.ASTMCPrimitiveTypeArgument _aNode = null;
		_aNode=de.monticore.types.mccollectiontypes._ast.MCCollectionTypesNodeFactory.createASTMCPrimitiveTypeArgument();
		((MCPrimitiveTypeArgumentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			((MCPrimitiveTypeArgumentContext)_localctx).tmp0 = mCPrimitiveType();
			_aNode.setMCPrimitiveType(_localctx.tmp0.ret);
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

	public static class MCBasicGenericType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcsimplegenerictypes._ast.ASTMCBasicGenericType ret = null;
		public MCBasicGenericTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCBasicGenericTypeContext mCBasicGenericType() {
			return getRuleContext(MCBasicGenericTypeContext.class,0);
		}
		public MCBasicGenericType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCBasicGenericType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCBasicGenericType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCBasicGenericType_eof(this);
		}
	}

	public final MCBasicGenericType_eofContext mCBasicGenericType_eof() throws RecognitionException {
		MCBasicGenericType_eofContext _localctx = new MCBasicGenericType_eofContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mCBasicGenericType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			((MCBasicGenericType_eofContext)_localctx).tmp = mCBasicGenericType();
			((MCBasicGenericType_eofContext)_localctx).ret =  ((MCBasicGenericType_eofContext)_localctx).tmp.ret;
			setState(489);
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

	public static class MCBasicGenericTypeContext extends ParserRuleContext {
		public de.monticore.types.mcsimplegenerictypes._ast.ASTMCBasicGenericType ret = null;
		public Token tmp0;
		public Token tmp1;
		public MCTypeArgumentContext tmp2;
		public MCTypeArgumentContext tmp3;
		public TerminalNode LT() { return getToken(ClassDiagramsAntlrParser.LT, 0); }
		public TerminalNode GT() { return getToken(ClassDiagramsAntlrParser.GT, 0); }
		public List<MCTypeArgumentContext> mCTypeArgument() {
			return getRuleContexts(MCTypeArgumentContext.class);
		}
		public MCTypeArgumentContext mCTypeArgument(int i) {
			return getRuleContext(MCTypeArgumentContext.class,i);
		}
		public List<TerminalNode> Name() { return getTokens(ClassDiagramsAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ClassDiagramsAntlrParser.Name, i);
		}
		public List<TerminalNode> POINT() { return getTokens(ClassDiagramsAntlrParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(ClassDiagramsAntlrParser.POINT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassDiagramsAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassDiagramsAntlrParser.COMMA, i);
		}
		public MCBasicGenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCBasicGenericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCBasicGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCBasicGenericType(this);
		}
	}

	public final MCBasicGenericTypeContext mCBasicGenericType() throws RecognitionException {
		MCBasicGenericTypeContext _localctx = new MCBasicGenericTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mCBasicGenericType);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcsimplegenerictypes._ast.ASTMCBasicGenericType _aNode = null;
		_aNode=de.monticore.types.mcsimplegenerictypes._ast.MCSimpleGenericTypesNodeFactory.createASTMCBasicGenericType();
		((MCBasicGenericTypeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(491);
			((MCBasicGenericTypeContext)_localctx).tmp0 = match(Name);
			 addToIteratedAttributeIfNotNull(_aNode.getNameList(), convertName(((MCBasicGenericTypeContext)_localctx).tmp0));
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT) {
				{
				{
				setState(494);
				match(POINT);
				{
				setState(495);
				((MCBasicGenericTypeContext)_localctx).tmp1 = match(Name);
				 addToIteratedAttributeIfNotNull(_aNode.getNameList(), convertName(((MCBasicGenericTypeContext)_localctx).tmp1));
				}
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(502);
			match(LT);
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(503);
				((MCBasicGenericTypeContext)_localctx).tmp2 = mCTypeArgument();
				addToIteratedAttributeIfNotNull(_aNode.getMCTypeArgumentList(), _localctx.tmp2.ret);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(505);
					match(COMMA);
					setState(506);
					((MCBasicGenericTypeContext)_localctx).tmp3 = mCTypeArgument();
					addToIteratedAttributeIfNotNull(_aNode.getMCTypeArgumentList(), _localctx.tmp3.ret);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(516);
			match(GT);
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

	public static class MCCustomTypeArgument_eofContext extends ParserRuleContext {
		public de.monticore.types.mcsimplegenerictypes._ast.ASTMCCustomTypeArgument ret = null;
		public MCCustomTypeArgumentContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCCustomTypeArgumentContext mCCustomTypeArgument() {
			return getRuleContext(MCCustomTypeArgumentContext.class,0);
		}
		public MCCustomTypeArgument_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCCustomTypeArgument_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCCustomTypeArgument_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCCustomTypeArgument_eof(this);
		}
	}

	public final MCCustomTypeArgument_eofContext mCCustomTypeArgument_eof() throws RecognitionException {
		MCCustomTypeArgument_eofContext _localctx = new MCCustomTypeArgument_eofContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mCCustomTypeArgument_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			((MCCustomTypeArgument_eofContext)_localctx).tmp = mCCustomTypeArgument();
			((MCCustomTypeArgument_eofContext)_localctx).ret =  ((MCCustomTypeArgument_eofContext)_localctx).tmp.ret;
			setState(520);
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

	public static class MCCustomTypeArgumentContext extends ParserRuleContext {
		public de.monticore.types.mcsimplegenerictypes._ast.ASTMCCustomTypeArgument ret = null;
		public MCTypeContext tmp0;
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public MCCustomTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCCustomTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCCustomTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCCustomTypeArgument(this);
		}
	}

	public final MCCustomTypeArgumentContext mCCustomTypeArgument() throws RecognitionException {
		MCCustomTypeArgumentContext _localctx = new MCCustomTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mCCustomTypeArgument);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		de.monticore.types.mcsimplegenerictypes._ast.ASTMCCustomTypeArgument _aNode = null;
		_aNode=de.monticore.types.mcsimplegenerictypes._ast.MCSimpleGenericTypesNodeFactory.createASTMCCustomTypeArgument();
		((MCCustomTypeArgumentContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			((MCCustomTypeArgumentContext)_localctx).tmp0 = mCType();
			_aNode.setMCType(_localctx.tmp0.ret);
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

	public static class CDCompilationUnit_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDCompilationUnit ret = null;
		public CDCompilationUnitContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDCompilationUnitContext cDCompilationUnit() {
			return getRuleContext(CDCompilationUnitContext.class,0);
		}
		public CDCompilationUnit_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDCompilationUnit_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDCompilationUnit_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDCompilationUnit_eof(this);
		}
	}

	public final CDCompilationUnit_eofContext cDCompilationUnit_eof() throws RecognitionException {
		CDCompilationUnit_eofContext _localctx = new CDCompilationUnit_eofContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cDCompilationUnit_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			((CDCompilationUnit_eofContext)_localctx).tmp = cDCompilationUnit();
			((CDCompilationUnit_eofContext)_localctx).ret =  ((CDCompilationUnit_eofContext)_localctx).tmp.ret;
			setState(527);
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

	public static class CDCompilationUnitContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDCompilationUnit ret = null;
		public Token tmp0;
		public Token tmp1;
		public MCImportStatementContext tmp2;
		public CDDefinitionContext tmp3;
		public CDDefinitionContext cDDefinition() {
			return getRuleContext(CDDefinitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public List<MCImportStatementContext> mCImportStatement() {
			return getRuleContexts(MCImportStatementContext.class);
		}
		public MCImportStatementContext mCImportStatement(int i) {
			return getRuleContext(MCImportStatementContext.class,i);
		}
		public List<TerminalNode> Name() { return getTokens(ClassDiagramsAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ClassDiagramsAntlrParser.Name, i);
		}
		public List<TerminalNode> POINT() { return getTokens(ClassDiagramsAntlrParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(ClassDiagramsAntlrParser.POINT, i);
		}
		public CDCompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDCompilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDCompilationUnit(this);
		}
	}

	public final CDCompilationUnitContext cDCompilationUnit() throws RecognitionException {
		CDCompilationUnitContext _localctx = new CDCompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cDCompilationUnit);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDCompilationUnit _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDCompilationUnit();
		((CDCompilationUnitContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(529);
				match(T__13);
				{
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Name:
					{
					setState(530);
					((CDCompilationUnitContext)_localctx).tmp0 = match(Name);
					 addToIteratedAttributeIfNotNull(_aNode.getPackageList(), convertName(((CDCompilationUnitContext)_localctx).tmp0));
					}
					break;
				case T__0:
					{
					{
					setState(532);
					match(T__0);
					_aNode.getPackageList().add("null");
					}
					}
					break;
				case T__1:
					{
					{
					setState(534);
					match(T__1);
					_aNode.getPackageList().add("true");
					}
					}
					break;
				case T__2:
					{
					{
					setState(536);
					match(T__2);
					_aNode.getPackageList().add("false");
					}
					}
					break;
				case T__3:
					{
					{
					setState(538);
					match(T__3);
					_aNode.getPackageList().add("import");
					}
					}
					break;
				case T__4:
					{
					{
					setState(540);
					match(T__4);
					_aNode.getPackageList().add("boolean");
					}
					}
					break;
				case T__5:
					{
					{
					setState(542);
					match(T__5);
					_aNode.getPackageList().add("byte");
					}
					}
					break;
				case T__6:
					{
					{
					setState(544);
					match(T__6);
					_aNode.getPackageList().add("short");
					}
					}
					break;
				case T__7:
					{
					{
					setState(546);
					match(T__7);
					_aNode.getPackageList().add("int");
					}
					}
					break;
				case T__8:
					{
					{
					setState(548);
					match(T__8);
					_aNode.getPackageList().add("long");
					}
					}
					break;
				case T__9:
					{
					{
					setState(550);
					match(T__9);
					_aNode.getPackageList().add("char");
					}
					}
					break;
				case T__10:
					{
					{
					setState(552);
					match(T__10);
					_aNode.getPackageList().add("float");
					}
					}
					break;
				case T__11:
					{
					{
					setState(554);
					match(T__11);
					_aNode.getPackageList().add("double");
					}
					}
					break;
				case T__12:
					{
					{
					setState(556);
					match(T__12);
					_aNode.getPackageList().add("void");
					}
					}
					break;
				case T__13:
					{
					{
					setState(558);
					match(T__13);
					_aNode.getPackageList().add("package");
					}
					}
					break;
				case T__14:
					{
					{
					setState(560);
					match(T__14);
					_aNode.getPackageList().add("classdiagram");
					}
					}
					break;
				case T__15:
					{
					{
					setState(562);
					match(T__15);
					_aNode.getPackageList().add("class");
					}
					}
					break;
				case T__16:
					{
					{
					setState(564);
					match(T__16);
					_aNode.getPackageList().add("extends");
					}
					}
					break;
				case T__17:
					{
					{
					setState(566);
					match(T__17);
					_aNode.getPackageList().add("interface");
					}
					}
					break;
				case T__18:
					{
					{
					setState(568);
					match(T__18);
					_aNode.getPackageList().add("throws");
					}
					}
					break;
				case T__19:
					{
					{
					setState(570);
					match(T__19);
					_aNode.getPackageList().add("abstract");
					}
					}
					break;
				case T__20:
					{
					{
					setState(572);
					match(T__20);
					_aNode.getPackageList().add("final");
					}
					}
					break;
				case T__21:
					{
					{
					setState(574);
					match(T__21);
					_aNode.getPackageList().add("static");
					}
					}
					break;
				case T__22:
					{
					{
					setState(576);
					match(T__22);
					_aNode.getPackageList().add("private");
					}
					}
					break;
				case T__23:
					{
					{
					setState(578);
					match(T__23);
					_aNode.getPackageList().add("protected");
					}
					}
					break;
				case T__24:
					{
					{
					setState(580);
					match(T__24);
					_aNode.getPackageList().add("public");
					}
					}
					break;
				case T__25:
					{
					{
					setState(582);
					match(T__25);
					_aNode.getPackageList().add("derived");
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(586);
					match(POINT);
					setState(641);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Name:
						{
						setState(587);
						((CDCompilationUnitContext)_localctx).tmp1 = match(Name);
						 addToIteratedAttributeIfNotNull(_aNode.getPackageList(), convertName(((CDCompilationUnitContext)_localctx).tmp1));
						}
						break;
					case T__0:
						{
						{
						setState(589);
						match(T__0);
						_aNode.getPackageList().add("null");
						}
						}
						break;
					case T__1:
						{
						{
						setState(591);
						match(T__1);
						_aNode.getPackageList().add("true");
						}
						}
						break;
					case T__2:
						{
						{
						setState(593);
						match(T__2);
						_aNode.getPackageList().add("false");
						}
						}
						break;
					case T__3:
						{
						{
						setState(595);
						match(T__3);
						_aNode.getPackageList().add("import");
						}
						}
						break;
					case T__4:
						{
						{
						setState(597);
						match(T__4);
						_aNode.getPackageList().add("boolean");
						}
						}
						break;
					case T__5:
						{
						{
						setState(599);
						match(T__5);
						_aNode.getPackageList().add("byte");
						}
						}
						break;
					case T__6:
						{
						{
						setState(601);
						match(T__6);
						_aNode.getPackageList().add("short");
						}
						}
						break;
					case T__7:
						{
						{
						setState(603);
						match(T__7);
						_aNode.getPackageList().add("int");
						}
						}
						break;
					case T__8:
						{
						{
						setState(605);
						match(T__8);
						_aNode.getPackageList().add("long");
						}
						}
						break;
					case T__9:
						{
						{
						setState(607);
						match(T__9);
						_aNode.getPackageList().add("char");
						}
						}
						break;
					case T__10:
						{
						{
						setState(609);
						match(T__10);
						_aNode.getPackageList().add("float");
						}
						}
						break;
					case T__11:
						{
						{
						setState(611);
						match(T__11);
						_aNode.getPackageList().add("double");
						}
						}
						break;
					case T__12:
						{
						{
						setState(613);
						match(T__12);
						_aNode.getPackageList().add("void");
						}
						}
						break;
					case T__13:
						{
						{
						setState(615);
						match(T__13);
						_aNode.getPackageList().add("package");
						}
						}
						break;
					case T__14:
						{
						{
						setState(617);
						match(T__14);
						_aNode.getPackageList().add("classdiagram");
						}
						}
						break;
					case T__15:
						{
						{
						setState(619);
						match(T__15);
						_aNode.getPackageList().add("class");
						}
						}
						break;
					case T__16:
						{
						{
						setState(621);
						match(T__16);
						_aNode.getPackageList().add("extends");
						}
						}
						break;
					case T__17:
						{
						{
						setState(623);
						match(T__17);
						_aNode.getPackageList().add("interface");
						}
						}
						break;
					case T__18:
						{
						{
						setState(625);
						match(T__18);
						_aNode.getPackageList().add("throws");
						}
						}
						break;
					case T__19:
						{
						{
						setState(627);
						match(T__19);
						_aNode.getPackageList().add("abstract");
						}
						}
						break;
					case T__20:
						{
						{
						setState(629);
						match(T__20);
						_aNode.getPackageList().add("final");
						}
						}
						break;
					case T__21:
						{
						{
						setState(631);
						match(T__21);
						_aNode.getPackageList().add("static");
						}
						}
						break;
					case T__22:
						{
						{
						setState(633);
						match(T__22);
						_aNode.getPackageList().add("private");
						}
						}
						break;
					case T__23:
						{
						{
						setState(635);
						match(T__23);
						_aNode.getPackageList().add("protected");
						}
						}
						break;
					case T__24:
						{
						{
						setState(637);
						match(T__24);
						_aNode.getPackageList().add("public");
						}
						}
						break;
					case T__25:
						{
						{
						setState(639);
						match(T__25);
						_aNode.getPackageList().add("derived");
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(648);
				match(SEMI);
				}
			}

			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(651);
				((CDCompilationUnitContext)_localctx).tmp2 = mCImportStatement();
				addToIteratedAttributeIfNotNull(_aNode.getMCImportStatementList(), _localctx.tmp2.ret);
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			((CDCompilationUnitContext)_localctx).tmp3 = cDDefinition();
			_aNode.setCDDefinition(_localctx.tmp3.ret);
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

	public static class CDDefinition_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDDefinition ret = null;
		public CDDefinitionContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDDefinitionContext cDDefinition() {
			return getRuleContext(CDDefinitionContext.class,0);
		}
		public CDDefinition_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDDefinition_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDDefinition_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDDefinition_eof(this);
		}
	}

	public final CDDefinition_eofContext cDDefinition_eof() throws RecognitionException {
		CDDefinition_eofContext _localctx = new CDDefinition_eofContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cDDefinition_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			((CDDefinition_eofContext)_localctx).tmp = cDDefinition();
			((CDDefinition_eofContext)_localctx).ret =  ((CDDefinition_eofContext)_localctx).tmp.ret;
			setState(664);
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

	public static class CDDefinitionContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDDefinition ret = null;
		public ModifierContext tmp0;
		public Token tmp1;
		public CDClassContext tmp2;
		public CDInterfaceContext tmp3;
		public TerminalNode LCURLY() { return getToken(ClassDiagramsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ClassDiagramsAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<CDClassContext> cDClass() {
			return getRuleContexts(CDClassContext.class);
		}
		public CDClassContext cDClass(int i) {
			return getRuleContext(CDClassContext.class,i);
		}
		public List<CDInterfaceContext> cDInterface() {
			return getRuleContexts(CDInterfaceContext.class);
		}
		public CDInterfaceContext cDInterface(int i) {
			return getRuleContext(CDInterfaceContext.class,i);
		}
		public CDDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDDefinition(this);
		}
	}

	public final CDDefinitionContext cDDefinition() throws RecognitionException {
		CDDefinitionContext _localctx = new CDDefinitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cDDefinition);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDDefinition _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDDefinition();
		((CDDefinitionContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(666);
				((CDDefinitionContext)_localctx).tmp0 = modifier();
				_aNode.setModifier(_localctx.tmp0.ret);
				}
				break;
			}
			setState(671);
			match(T__14);
			{
			setState(672);
			((CDDefinitionContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((CDDefinitionContext)_localctx).tmp1));
			}
			setState(675);
			match(LCURLY);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << SLASH))) != 0)) {
				{
				setState(682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(676);
					((CDDefinitionContext)_localctx).tmp2 = cDClass();
					addToIteratedAttributeIfNotNull(_aNode.getCDClassList(), _localctx.tmp2.ret);
					}
					break;
				case 2:
					{
					setState(679);
					((CDDefinitionContext)_localctx).tmp3 = cDInterface();
					addToIteratedAttributeIfNotNull(_aNode.getCDInterfaceList(), _localctx.tmp3.ret);
					}
					break;
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
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

	public static class CDClass_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDClass ret = null;
		public CDClassContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDClassContext cDClass() {
			return getRuleContext(CDClassContext.class,0);
		}
		public CDClass_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDClass_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDClass_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDClass_eof(this);
		}
	}

	public final CDClass_eofContext cDClass_eof() throws RecognitionException {
		CDClass_eofContext _localctx = new CDClass_eofContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cDClass_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((CDClass_eofContext)_localctx).tmp = cDClass();
			((CDClass_eofContext)_localctx).ret =  ((CDClass_eofContext)_localctx).tmp.ret;
			setState(691);
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

	public static class CDClassContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDClass ret = null;
		public ModifierContext tmp0;
		public Token tmp1;
		public MCObjectTypeContext tmp2;
		public TImplementsContext tmp3;
		public MCObjectTypeContext tmp4;
		public MCObjectTypeContext tmp5;
		public CDAttributeContext tmp6;
		public CDConstructorContext tmp7;
		public CDMethodContext tmp8;
		public TerminalNode LCURLY() { return getToken(ClassDiagramsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ClassDiagramsAntlrParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<MCObjectTypeContext> mCObjectType() {
			return getRuleContexts(MCObjectTypeContext.class);
		}
		public MCObjectTypeContext mCObjectType(int i) {
			return getRuleContext(MCObjectTypeContext.class,i);
		}
		public TImplementsContext tImplements() {
			return getRuleContext(TImplementsContext.class,0);
		}
		public List<CDAttributeContext> cDAttribute() {
			return getRuleContexts(CDAttributeContext.class);
		}
		public CDAttributeContext cDAttribute(int i) {
			return getRuleContext(CDAttributeContext.class,i);
		}
		public List<CDConstructorContext> cDConstructor() {
			return getRuleContexts(CDConstructorContext.class);
		}
		public CDConstructorContext cDConstructor(int i) {
			return getRuleContext(CDConstructorContext.class,i);
		}
		public List<CDMethodContext> cDMethod() {
			return getRuleContexts(CDMethodContext.class);
		}
		public CDMethodContext cDMethod(int i) {
			return getRuleContext(CDMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassDiagramsAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassDiagramsAntlrParser.COMMA, i);
		}
		public CDClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDClass(this);
		}
	}

	public final CDClassContext cDClass() throws RecognitionException {
		CDClassContext _localctx = new CDClassContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cDClass);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDClass _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDClass();
		((CDClassContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(693);
				((CDClassContext)_localctx).tmp0 = modifier();
				_aNode.setModifier(_localctx.tmp0.ret);
				}
				break;
			}
			setState(698);
			match(T__15);
			{
			setState(699);
			((CDClassContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((CDClassContext)_localctx).tmp1));
			}
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(702);
				match(T__16);
				setState(703);
				((CDClassContext)_localctx).tmp2 = mCObjectType();
				_aNode.setSuperclass(_localctx.tmp2.ret);
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(708);
				((CDClassContext)_localctx).tmp3 = tImplements();
				_aNode.setTImplements(_localctx.tmp3.ret);
				{
				setState(710);
				((CDClassContext)_localctx).tmp4 = mCObjectType();
				addToIteratedAttributeIfNotNull(_aNode.getInterfaceList(), _localctx.tmp4.ret);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(712);
					match(COMMA);
					setState(713);
					((CDClassContext)_localctx).tmp5 = mCObjectType();
					addToIteratedAttributeIfNotNull(_aNode.getInterfaceList(), _localctx.tmp5.ret);
					}
					}
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(723);
				match(LCURLY);
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(733);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(724);
							((CDClassContext)_localctx).tmp6 = cDAttribute();
							addToIteratedAttributeIfNotNull(_aNode.getCDAttributeList(), _localctx.tmp6.ret);
							}
							break;
						case 2:
							{
							setState(727);
							((CDClassContext)_localctx).tmp7 = cDConstructor();
							addToIteratedAttributeIfNotNull(_aNode.getCDConstructorList(), _localctx.tmp7.ret);
							}
							break;
						case 3:
							{
							setState(730);
							((CDClassContext)_localctx).tmp8 = cDMethod();
							addToIteratedAttributeIfNotNull(_aNode.getCDMethodList(), _localctx.tmp8.ret);
							}
							break;
						}
						} 
					}
					setState(737);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(738);
				match(RCURLY);
				}
				break;
			case SEMI:
				{
				setState(739);
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

	public static class TImplements_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTTImplements ret = null;
		public TImplementsContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public TImplementsContext tImplements() {
			return getRuleContext(TImplementsContext.class,0);
		}
		public TImplements_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tImplements_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterTImplements_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitTImplements_eof(this);
		}
	}

	public final TImplements_eofContext tImplements_eof() throws RecognitionException {
		TImplements_eofContext _localctx = new TImplements_eofContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tImplements_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			((TImplements_eofContext)_localctx).tmp = tImplements();
			((TImplements_eofContext)_localctx).ret =  ((TImplements_eofContext)_localctx).tmp.ret;
			setState(744);
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

	public static class TImplementsContext extends ParserRuleContext {
		public classdiagrams._ast.ASTTImplements ret = null;
		public Token tmp0;
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public TImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tImplements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterTImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitTImplements(this);
		}
	}

	public final TImplementsContext tImplements() throws RecognitionException {
		TImplementsContext _localctx = new TImplementsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tImplements);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTTImplements _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTTImplements();
		((TImplementsContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			if (!(_input.LT(1).getText().equals("implements"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"implements\")");
			{
			setState(747);
			((TImplementsContext)_localctx).tmp0 = match(Name);
			_aNode.setName(convertName(((TImplementsContext)_localctx).tmp0));
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

	public static class CDInterface_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDInterface ret = null;
		public CDInterfaceContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDInterfaceContext cDInterface() {
			return getRuleContext(CDInterfaceContext.class,0);
		}
		public CDInterface_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDInterface_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDInterface_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDInterface_eof(this);
		}
	}

	public final CDInterface_eofContext cDInterface_eof() throws RecognitionException {
		CDInterface_eofContext _localctx = new CDInterface_eofContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cDInterface_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			((CDInterface_eofContext)_localctx).tmp = cDInterface();
			((CDInterface_eofContext)_localctx).ret =  ((CDInterface_eofContext)_localctx).tmp.ret;
			setState(752);
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

	public static class CDInterfaceContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDInterface ret = null;
		public ModifierContext tmp0;
		public Token tmp1;
		public MCObjectTypeContext tmp2;
		public MCObjectTypeContext tmp3;
		public CDAttributeContext tmp4;
		public CDMethodContext tmp5;
		public TerminalNode LCURLY() { return getToken(ClassDiagramsAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ClassDiagramsAntlrParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<MCObjectTypeContext> mCObjectType() {
			return getRuleContexts(MCObjectTypeContext.class);
		}
		public MCObjectTypeContext mCObjectType(int i) {
			return getRuleContext(MCObjectTypeContext.class,i);
		}
		public List<CDAttributeContext> cDAttribute() {
			return getRuleContexts(CDAttributeContext.class);
		}
		public CDAttributeContext cDAttribute(int i) {
			return getRuleContext(CDAttributeContext.class,i);
		}
		public List<CDMethodContext> cDMethod() {
			return getRuleContexts(CDMethodContext.class);
		}
		public CDMethodContext cDMethod(int i) {
			return getRuleContext(CDMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassDiagramsAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassDiagramsAntlrParser.COMMA, i);
		}
		public CDInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDInterface(this);
		}
	}

	public final CDInterfaceContext cDInterface() throws RecognitionException {
		CDInterfaceContext _localctx = new CDInterfaceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cDInterface);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDInterface _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDInterface();
		((CDInterfaceContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(754);
				((CDInterfaceContext)_localctx).tmp0 = modifier();
				_aNode.setModifier(_localctx.tmp0.ret);
				}
				break;
			}
			setState(759);
			match(T__17);
			{
			setState(760);
			((CDInterfaceContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((CDInterfaceContext)_localctx).tmp1));
			}
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(763);
				match(T__16);
				{
				setState(764);
				((CDInterfaceContext)_localctx).tmp2 = mCObjectType();
				addToIteratedAttributeIfNotNull(_aNode.getInterfaceList(), _localctx.tmp2.ret);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(766);
					match(COMMA);
					setState(767);
					((CDInterfaceContext)_localctx).tmp3 = mCObjectType();
					addToIteratedAttributeIfNotNull(_aNode.getInterfaceList(), _localctx.tmp3.ret);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(777);
				match(LCURLY);
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(784);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(778);
							((CDInterfaceContext)_localctx).tmp4 = cDAttribute();
							addToIteratedAttributeIfNotNull(_aNode.getCDAttributeList(), _localctx.tmp4.ret);
							}
							break;
						case 2:
							{
							setState(781);
							((CDInterfaceContext)_localctx).tmp5 = cDMethod();
							addToIteratedAttributeIfNotNull(_aNode.getCDMethodList(), _localctx.tmp5.ret);
							}
							break;
						}
						} 
					}
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(789);
				match(RCURLY);
				}
				break;
			case SEMI:
				{
				setState(790);
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

	public static class CDAttribute_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDAttribute ret = null;
		public CDAttributeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDAttributeContext cDAttribute() {
			return getRuleContext(CDAttributeContext.class,0);
		}
		public CDAttribute_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDAttribute_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDAttribute_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDAttribute_eof(this);
		}
	}

	public final CDAttribute_eofContext cDAttribute_eof() throws RecognitionException {
		CDAttribute_eofContext _localctx = new CDAttribute_eofContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cDAttribute_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			((CDAttribute_eofContext)_localctx).tmp = cDAttribute();
			((CDAttribute_eofContext)_localctx).ret =  ((CDAttribute_eofContext)_localctx).tmp.ret;
			setState(795);
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

	public static class CDAttributeContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDAttribute ret = null;
		public ModifierContext tmp0;
		public MCTypeContext tmp1;
		public Token tmp2;
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public CDAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDAttribute(this);
		}
	}

	public final CDAttributeContext cDAttribute() throws RecognitionException {
		CDAttributeContext _localctx = new CDAttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cDAttribute);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDAttribute _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDAttribute();
		((CDAttributeContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(797);
				((CDAttributeContext)_localctx).tmp0 = modifier();
				_aNode.setModifier(_localctx.tmp0.ret);
				}
				break;
			}
			setState(802);
			((CDAttributeContext)_localctx).tmp1 = mCType();
			_aNode.setMCType(_localctx.tmp1.ret);
			{
			setState(804);
			((CDAttributeContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((CDAttributeContext)_localctx).tmp2));
			}
			setState(807);
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

	public static class CDConstructor_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDConstructor ret = null;
		public CDConstructorContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDConstructorContext cDConstructor() {
			return getRuleContext(CDConstructorContext.class,0);
		}
		public CDConstructor_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDConstructor_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDConstructor_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDConstructor_eof(this);
		}
	}

	public final CDConstructor_eofContext cDConstructor_eof() throws RecognitionException {
		CDConstructor_eofContext _localctx = new CDConstructor_eofContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cDConstructor_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			((CDConstructor_eofContext)_localctx).tmp = cDConstructor();
			((CDConstructor_eofContext)_localctx).ret =  ((CDConstructor_eofContext)_localctx).tmp.ret;
			setState(811);
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

	public static class CDConstructorContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDConstructor ret = null;
		public ModifierContext tmp0;
		public Token tmp1;
		public CDParameterContext tmp2;
		public CDParameterContext tmp3;
		public MCQualifiedNameContext tmp4;
		public MCQualifiedNameContext tmp5;
		public TerminalNode LPAREN() { return getToken(ClassDiagramsAntlrParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClassDiagramsAntlrParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public List<CDParameterContext> cDParameter() {
			return getRuleContexts(CDParameterContext.class);
		}
		public CDParameterContext cDParameter(int i) {
			return getRuleContext(CDParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassDiagramsAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassDiagramsAntlrParser.COMMA, i);
		}
		public List<MCQualifiedNameContext> mCQualifiedName() {
			return getRuleContexts(MCQualifiedNameContext.class);
		}
		public MCQualifiedNameContext mCQualifiedName(int i) {
			return getRuleContext(MCQualifiedNameContext.class,i);
		}
		public CDConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDConstructor(this);
		}
	}

	public final CDConstructorContext cDConstructor() throws RecognitionException {
		CDConstructorContext _localctx = new CDConstructorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cDConstructor);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDConstructor _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDConstructor();
		((CDConstructorContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			((CDConstructorContext)_localctx).tmp0 = modifier();
			_aNode.setModifier(_localctx.tmp0.ret);
			{
			setState(815);
			((CDConstructorContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((CDConstructorContext)_localctx).tmp1));
			}
			setState(818);
			match(LPAREN);
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(819);
				((CDConstructorContext)_localctx).tmp2 = cDParameter();
				addToIteratedAttributeIfNotNull(_aNode.getCDParameterList(), _localctx.tmp2.ret);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					((CDConstructorContext)_localctx).tmp3 = cDParameter();
					addToIteratedAttributeIfNotNull(_aNode.getCDParameterList(), _localctx.tmp3.ret);
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(832);
			match(RPAREN);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(833);
				match(T__18);
				{
				setState(834);
				((CDConstructorContext)_localctx).tmp4 = mCQualifiedName();
				addToIteratedAttributeIfNotNull(_aNode.getExceptionList(), _localctx.tmp4.ret);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(836);
					match(COMMA);
					setState(837);
					((CDConstructorContext)_localctx).tmp5 = mCQualifiedName();
					addToIteratedAttributeIfNotNull(_aNode.getExceptionList(), _localctx.tmp5.ret);
					}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(847);
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

	public static class CDMethod_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDMethod ret = null;
		public CDMethodContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDMethodContext cDMethod() {
			return getRuleContext(CDMethodContext.class,0);
		}
		public CDMethod_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDMethod_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDMethod_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDMethod_eof(this);
		}
	}

	public final CDMethod_eofContext cDMethod_eof() throws RecognitionException {
		CDMethod_eofContext _localctx = new CDMethod_eofContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cDMethod_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			((CDMethod_eofContext)_localctx).tmp = cDMethod();
			((CDMethod_eofContext)_localctx).ret =  ((CDMethod_eofContext)_localctx).tmp.ret;
			setState(851);
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

	public static class CDMethodContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDMethod ret = null;
		public ModifierContext tmp0;
		public MCReturnTypeContext tmp1;
		public Token tmp2;
		public CDParameterContext tmp3;
		public CDParameterContext tmp4;
		public MCQualifiedNameContext tmp5;
		public MCQualifiedNameContext tmp6;
		public TerminalNode LPAREN() { return getToken(ClassDiagramsAntlrParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ClassDiagramsAntlrParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ClassDiagramsAntlrParser.SEMI, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MCReturnTypeContext mCReturnType() {
			return getRuleContext(MCReturnTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public List<CDParameterContext> cDParameter() {
			return getRuleContexts(CDParameterContext.class);
		}
		public CDParameterContext cDParameter(int i) {
			return getRuleContext(CDParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ClassDiagramsAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ClassDiagramsAntlrParser.COMMA, i);
		}
		public List<MCQualifiedNameContext> mCQualifiedName() {
			return getRuleContexts(MCQualifiedNameContext.class);
		}
		public MCQualifiedNameContext mCQualifiedName(int i) {
			return getRuleContext(MCQualifiedNameContext.class,i);
		}
		public CDMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDMethod(this);
		}
	}

	public final CDMethodContext cDMethod() throws RecognitionException {
		CDMethodContext _localctx = new CDMethodContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cDMethod);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDMethod _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDMethod();
		((CDMethodContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			((CDMethodContext)_localctx).tmp0 = modifier();
			_aNode.setModifier(_localctx.tmp0.ret);
			setState(855);
			((CDMethodContext)_localctx).tmp1 = mCReturnType();
			_aNode.setMCReturnType(_localctx.tmp1.ret);
			{
			setState(857);
			((CDMethodContext)_localctx).tmp2 = match(Name);
			_aNode.setName(convertName(((CDMethodContext)_localctx).tmp2));
			}
			setState(860);
			match(LPAREN);
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(861);
				((CDMethodContext)_localctx).tmp3 = cDParameter();
				addToIteratedAttributeIfNotNull(_aNode.getCDParameterList(), _localctx.tmp3.ret);
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					((CDMethodContext)_localctx).tmp4 = cDParameter();
					addToIteratedAttributeIfNotNull(_aNode.getCDParameterList(), _localctx.tmp4.ret);
					}
					}
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(874);
			match(RPAREN);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(875);
				match(T__18);
				{
				setState(876);
				((CDMethodContext)_localctx).tmp5 = mCQualifiedName();
				addToIteratedAttributeIfNotNull(_aNode.getExceptionList(), _localctx.tmp5.ret);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					((CDMethodContext)_localctx).tmp6 = mCQualifiedName();
					addToIteratedAttributeIfNotNull(_aNode.getExceptionList(), _localctx.tmp6.ret);
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(889);
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

	public static class CDParameter_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDParameter ret = null;
		public CDParameterContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDParameterContext cDParameter() {
			return getRuleContext(CDParameterContext.class,0);
		}
		public CDParameter_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDParameter_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDParameter_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDParameter_eof(this);
		}
	}

	public final CDParameter_eofContext cDParameter_eof() throws RecognitionException {
		CDParameter_eofContext _localctx = new CDParameter_eofContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cDParameter_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			((CDParameter_eofContext)_localctx).tmp = cDParameter();
			((CDParameter_eofContext)_localctx).ret =  ((CDParameter_eofContext)_localctx).tmp.ret;
			setState(893);
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

	public static class CDParameterContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDParameter ret = null;
		public MCTypeContext tmp0;
		public Token tmp1;
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassDiagramsAntlrParser.Name, 0); }
		public TerminalNode POINTPOINTPOINT() { return getToken(ClassDiagramsAntlrParser.POINTPOINTPOINT, 0); }
		public CDParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDParameter(this);
		}
	}

	public final CDParameterContext cDParameter() throws RecognitionException {
		CDParameterContext _localctx = new CDParameterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cDParameter);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTCDParameter _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTCDParameter();
		((CDParameterContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			((CDParameterContext)_localctx).tmp0 = mCType();
			_aNode.setMCType(_localctx.tmp0.ret);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINTPOINTPOINT) {
				{
				{
				setState(897);
				match(POINTPOINTPOINT);

				_aNode.setEllipsis(true);

				}
				}
			}

			{
			setState(901);
			((CDParameterContext)_localctx).tmp1 = match(Name);
			_aNode.setName(convertName(((CDParameterContext)_localctx).tmp1));
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

	public static class Modifier_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTModifier ret = null;
		public ModifierContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public Modifier_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterModifier_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitModifier_eof(this);
		}
	}

	public final Modifier_eofContext modifier_eof() throws RecognitionException {
		Modifier_eofContext _localctx = new Modifier_eofContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_modifier_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			((Modifier_eofContext)_localctx).tmp = modifier();
			((Modifier_eofContext)_localctx).ret =  ((Modifier_eofContext)_localctx).tmp.ret;
			setState(906);
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

	public static class ModifierContext extends ParserRuleContext {
		public classdiagrams._ast.ASTModifier ret = null;
		public List<TerminalNode> MINUS() { return getTokens(ClassDiagramsAntlrParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ClassDiagramsAntlrParser.MINUS, i);
		}
		public List<TerminalNode> HASH() { return getTokens(ClassDiagramsAntlrParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(ClassDiagramsAntlrParser.HASH, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ClassDiagramsAntlrParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ClassDiagramsAntlrParser.PLUS, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ClassDiagramsAntlrParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ClassDiagramsAntlrParser.SLASH, i);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_modifier);
		// ret is normally returned, a is used to be compatible with rule using the return construct
		classdiagrams._ast.ASTModifier _aNode = null;
		_aNode=classdiagrams._ast.ClassDiagramsNodeFactory.createASTModifier();
		((ModifierContext)_localctx).ret = _aNode;
		_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveASTNode(_aNode);

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(930);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__19:
						{
						{
						setState(908);
						match(T__19);

						_aNode.setAbstract(true);

						}
						}
						break;
					case T__20:
						{
						{
						setState(910);
						match(T__20);

						_aNode.setFinal(true);

						}
						}
						break;
					case T__21:
						{
						{
						setState(912);
						match(T__21);

						_aNode.setStatic(true);

						}
						}
						break;
					case T__22:
						{
						{
						setState(914);
						match(T__22);

						_aNode.setPrivate(true);

						}
						}
						break;
					case MINUS:
						{
						{
						setState(916);
						match(MINUS);

						_aNode.setPrivate(true);

						}
						}
						break;
					case T__23:
						{
						{
						setState(918);
						match(T__23);

						_aNode.setProtected(true);

						}
						}
						break;
					case HASH:
						{
						{
						setState(920);
						match(HASH);

						_aNode.setProtected(true);

						}
						}
						break;
					case T__24:
						{
						{
						setState(922);
						match(T__24);

						_aNode.setPublic(true);

						}
						}
						break;
					case PLUS:
						{
						{
						setState(924);
						match(PLUS);

						_aNode.setPublic(true);

						}
						}
						break;
					case T__25:
						{
						{
						setState(926);
						match(T__25);

						_aNode.setDerived(true);

						}
						}
						break;
					case SLASH:
						{
						{
						setState(928);
						match(SLASH);

						_aNode.setDerived(true);

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitLiteral_eof(this);
		}
	}

	public final Literal_eofContext literal_eof() throws RecognitionException {
		Literal_eofContext _localctx = new Literal_eofContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			((Literal_eofContext)_localctx).tmp = literal();
			((Literal_eofContext)_localctx).ret =  ((Literal_eofContext)_localctx).tmp.ret;
			setState(937);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_literal);
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				((LiteralContext)_localctx).tmp0 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				((LiteralContext)_localctx).tmp1 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				((LiteralContext)_localctx).tmp2 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				((LiteralContext)_localctx).tmp3 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(951);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedLiteralContext signedLiteral() {
			return getRuleContext(SignedLiteralContext.class,0);
		}
		public SignedLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedLiteral_eof(this);
		}
	}

	public final SignedLiteral_eofContext signedLiteral_eof() throws RecognitionException {
		SignedLiteral_eofContext _localctx = new SignedLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_signedLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			((SignedLiteral_eofContext)_localctx).tmp = signedLiteral();
			((SignedLiteral_eofContext)_localctx).ret =  ((SignedLiteral_eofContext)_localctx).tmp.ret;
			setState(958);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedLiteral(this);
		}
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_signedLiteral);
		try {
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				((SignedLiteralContext)_localctx).tmp0 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp0.ret;
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				((SignedLiteralContext)_localctx).tmp1 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp1.ret;
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				((SignedLiteralContext)_localctx).tmp2 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				((SignedLiteralContext)_localctx).tmp3 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case MINUS:
			case Digits:
				enterOuterAlt(_localctx, 5);
				{
				setState(972);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNumericLiteral_eof(this);
		}
	}

	public final NumericLiteral_eofContext numericLiteral_eof() throws RecognitionException {
		NumericLiteral_eofContext _localctx = new NumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_numericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			((NumericLiteral_eofContext)_localctx).tmp = numericLiteral();
			((NumericLiteral_eofContext)_localctx).ret =  ((NumericLiteral_eofContext)_localctx).tmp.ret;
			setState(979);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_numericLiteral);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				((NumericLiteralContext)_localctx).tmp6 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				((NumericLiteralContext)_localctx).tmp7 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				((NumericLiteralContext)_localctx).tmp8 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public SignedNumericLiteral_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedNumericLiteral_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedNumericLiteral_eof(this);
		}
	}

	public final SignedNumericLiteral_eofContext signedNumericLiteral_eof() throws RecognitionException {
		SignedNumericLiteral_eofContext _localctx = new SignedNumericLiteral_eofContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_signedNumericLiteral_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			((SignedNumericLiteral_eofContext)_localctx).tmp = signedNumericLiteral();
			((SignedNumericLiteral_eofContext)_localctx).ret =  ((SignedNumericLiteral_eofContext)_localctx).tmp.ret;
			setState(997);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterSignedNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitSignedNumericLiteral(this);
		}
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_signedNumericLiteral);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				((SignedNumericLiteralContext)_localctx).tmp10 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				((SignedNumericLiteralContext)_localctx).tmp11 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
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

	public static class Type_eofContext extends ParserRuleContext {
		public de.monticore.types.typesymbols._ast.ASTType ret = null;
		public TypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitType_eof(this);
		}
	}

	public final Type_eofContext type_eof() throws RecognitionException {
		Type_eofContext _localctx = new Type_eofContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_type_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			((Type_eofContext)_localctx).tmp = type();
			((Type_eofContext)_localctx).ret =  ((Type_eofContext)_localctx).tmp.ret;
			setState(1015);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public TypeVar_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVar_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterTypeVar_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitTypeVar_eof(this);
		}
	}

	public final TypeVar_eofContext typeVar_eof() throws RecognitionException {
		TypeVar_eofContext _localctx = new TypeVar_eofContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeVar_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			((TypeVar_eofContext)_localctx).tmp = typeVar();
			((TypeVar_eofContext)_localctx).ret =  ((TypeVar_eofContext)_localctx).tmp.ret;
			setState(1021);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterTypeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitTypeVar(this);
		}
	}

	public final TypeVarContext typeVar() throws RecognitionException {
		TypeVarContext _localctx = new TypeVarContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeVar);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterField_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitField_eof(this);
		}
	}

	public final Field_eofContext field_eof() throws RecognitionException {
		Field_eofContext _localctx = new Field_eofContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_field_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			((Field_eofContext)_localctx).tmp = field();
			((Field_eofContext)_localctx).ret =  ((Field_eofContext)_localctx).tmp.ret;
			setState(1027);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_field);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Method_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMethod_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMethod_eof(this);
		}
	}

	public final Method_eofContext method_eof() throws RecognitionException {
		Method_eofContext _localctx = new Method_eofContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_method_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			((Method_eofContext)_localctx).tmp = method();
			((Method_eofContext)_localctx).ret =  ((Method_eofContext)_localctx).tmp.ret;
			setState(1033);
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_method);
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
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCTypeContext mCType() {
			return getRuleContext(MCTypeContext.class,0);
		}
		public MCType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCType_eof(this);
		}
	}

	public final MCType_eofContext mCType_eof() throws RecognitionException {
		MCType_eofContext _localctx = new MCType_eofContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_mCType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			((MCType_eofContext)_localctx).tmp = mCType();
			((MCType_eofContext)_localctx).ret =  ((MCType_eofContext)_localctx).tmp.ret;
			setState(1039);
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
		public MCPrimitiveTypeContext tmp14;
		public MCObjectTypeContext tmp15;
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
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCType(this);
		}
	}

	public final MCTypeContext mCType() throws RecognitionException {
		MCTypeContext _localctx = new MCTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_mCType);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				((MCTypeContext)_localctx).tmp14 = mCPrimitiveType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp14.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				((MCTypeContext)_localctx).tmp15 = mCObjectType();
				((MCTypeContext)_localctx).ret = ((MCTypeContext)_localctx).tmp15.ret;
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

	public static class MCObjectType_eofContext extends ParserRuleContext {
		public de.monticore.types.mcbasictypes._ast.ASTMCObjectType ret = null;
		public MCObjectTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCObjectTypeContext mCObjectType() {
			return getRuleContext(MCObjectTypeContext.class,0);
		}
		public MCObjectType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCObjectType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCObjectType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCObjectType_eof(this);
		}
	}

	public final MCObjectType_eofContext mCObjectType_eof() throws RecognitionException {
		MCObjectType_eofContext _localctx = new MCObjectType_eofContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mCObjectType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			((MCObjectType_eofContext)_localctx).tmp = mCObjectType();
			((MCObjectType_eofContext)_localctx).ret =  ((MCObjectType_eofContext)_localctx).tmp.ret;
			setState(1051);
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
		public MCGenericTypeContext tmp16;
		public MCQualifiedTypeContext tmp17;
		public MCGenericTypeContext mCGenericType() {
			return getRuleContext(MCGenericTypeContext.class,0);
		}
		public MCQualifiedTypeContext mCQualifiedType() {
			return getRuleContext(MCQualifiedTypeContext.class,0);
		}
		public MCObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCObjectType(this);
		}
	}

	public final MCObjectTypeContext mCObjectType() throws RecognitionException {
		MCObjectTypeContext _localctx = new MCObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_mCObjectType);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				((MCObjectTypeContext)_localctx).tmp16 = mCGenericType();
				((MCObjectTypeContext)_localctx).ret = ((MCObjectTypeContext)_localctx).tmp16.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				((MCObjectTypeContext)_localctx).tmp17 = mCQualifiedType();
				((MCObjectTypeContext)_localctx).ret = ((MCObjectTypeContext)_localctx).tmp17.ret;
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

	public static class MCGenericType_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCGenericType ret = null;
		public MCGenericTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCGenericTypeContext mCGenericType() {
			return getRuleContext(MCGenericTypeContext.class,0);
		}
		public MCGenericType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCGenericType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCGenericType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCGenericType_eof(this);
		}
	}

	public final MCGenericType_eofContext mCGenericType_eof() throws RecognitionException {
		MCGenericType_eofContext _localctx = new MCGenericType_eofContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_mCGenericType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			((MCGenericType_eofContext)_localctx).tmp = mCGenericType();
			((MCGenericType_eofContext)_localctx).ret =  ((MCGenericType_eofContext)_localctx).tmp.ret;
			setState(1063);
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

	public static class MCGenericTypeContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCGenericType ret;
		public MCListTypeContext tmp18;
		public MCOptionalTypeContext tmp19;
		public MCMapTypeContext tmp20;
		public MCSetTypeContext tmp21;
		public MCBasicGenericTypeContext tmp22;
		public MCListTypeContext mCListType() {
			return getRuleContext(MCListTypeContext.class,0);
		}
		public MCOptionalTypeContext mCOptionalType() {
			return getRuleContext(MCOptionalTypeContext.class,0);
		}
		public MCMapTypeContext mCMapType() {
			return getRuleContext(MCMapTypeContext.class,0);
		}
		public MCSetTypeContext mCSetType() {
			return getRuleContext(MCSetTypeContext.class,0);
		}
		public MCBasicGenericTypeContext mCBasicGenericType() {
			return getRuleContext(MCBasicGenericTypeContext.class,0);
		}
		public MCGenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCGenericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCGenericType(this);
		}
	}

	public final MCGenericTypeContext mCGenericType() throws RecognitionException {
		MCGenericTypeContext _localctx = new MCGenericTypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_mCGenericType);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				((MCGenericTypeContext)_localctx).tmp18 = mCListType();
				((MCGenericTypeContext)_localctx).ret = ((MCGenericTypeContext)_localctx).tmp18.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				((MCGenericTypeContext)_localctx).tmp19 = mCOptionalType();
				((MCGenericTypeContext)_localctx).ret = ((MCGenericTypeContext)_localctx).tmp19.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				((MCGenericTypeContext)_localctx).tmp20 = mCMapType();
				((MCGenericTypeContext)_localctx).ret = ((MCGenericTypeContext)_localctx).tmp20.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1074);
				((MCGenericTypeContext)_localctx).tmp21 = mCSetType();
				((MCGenericTypeContext)_localctx).ret = ((MCGenericTypeContext)_localctx).tmp21.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1077);
				((MCGenericTypeContext)_localctx).tmp22 = mCBasicGenericType();
				((MCGenericTypeContext)_localctx).ret = ((MCGenericTypeContext)_localctx).tmp22.ret;
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

	public static class MCTypeArgument_eofContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCTypeArgument ret = null;
		public MCTypeArgumentContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public MCTypeArgumentContext mCTypeArgument() {
			return getRuleContext(MCTypeArgumentContext.class,0);
		}
		public MCTypeArgument_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCTypeArgument_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCTypeArgument_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCTypeArgument_eof(this);
		}
	}

	public final MCTypeArgument_eofContext mCTypeArgument_eof() throws RecognitionException {
		MCTypeArgument_eofContext _localctx = new MCTypeArgument_eofContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_mCTypeArgument_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			((MCTypeArgument_eofContext)_localctx).tmp = mCTypeArgument();
			((MCTypeArgument_eofContext)_localctx).ret =  ((MCTypeArgument_eofContext)_localctx).tmp.ret;
			setState(1084);
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

	public static class MCTypeArgumentContext extends ParserRuleContext {
		public de.monticore.types.mccollectiontypes._ast.ASTMCTypeArgument ret;
		public MCBasicTypeArgumentContext tmp23;
		public MCPrimitiveTypeArgumentContext tmp24;
		public MCCustomTypeArgumentContext tmp25;
		public MCBasicTypeArgumentContext mCBasicTypeArgument() {
			return getRuleContext(MCBasicTypeArgumentContext.class,0);
		}
		public MCPrimitiveTypeArgumentContext mCPrimitiveTypeArgument() {
			return getRuleContext(MCPrimitiveTypeArgumentContext.class,0);
		}
		public MCCustomTypeArgumentContext mCCustomTypeArgument() {
			return getRuleContext(MCCustomTypeArgumentContext.class,0);
		}
		public MCTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mCTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterMCTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitMCTypeArgument(this);
		}
	}

	public final MCTypeArgumentContext mCTypeArgument() throws RecognitionException {
		MCTypeArgumentContext _localctx = new MCTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_mCTypeArgument);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				((MCTypeArgumentContext)_localctx).tmp23 = mCBasicTypeArgument();
				((MCTypeArgumentContext)_localctx).ret = ((MCTypeArgumentContext)_localctx).tmp23.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				((MCTypeArgumentContext)_localctx).tmp24 = mCPrimitiveTypeArgument();
				((MCTypeArgumentContext)_localctx).ret = ((MCTypeArgumentContext)_localctx).tmp24.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1092);
				((MCTypeArgumentContext)_localctx).tmp25 = mCCustomTypeArgument();
				((MCTypeArgumentContext)_localctx).ret = ((MCTypeArgumentContext)_localctx).tmp25.ret;
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

	public static class CDType_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDType ret = null;
		public CDTypeContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDTypeContext cDType() {
			return getRuleContext(CDTypeContext.class,0);
		}
		public CDType_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDType_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDType_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDType_eof(this);
		}
	}

	public final CDType_eofContext cDType_eof() throws RecognitionException {
		CDType_eofContext _localctx = new CDType_eofContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_cDType_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			((CDType_eofContext)_localctx).tmp = cDType();
			((CDType_eofContext)_localctx).ret =  ((CDType_eofContext)_localctx).tmp.ret;
			setState(1099);
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

	public static class CDTypeContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDType ret;
		public CDClassContext tmp26;
		public CDInterfaceContext tmp27;
		public CDClassContext cDClass() {
			return getRuleContext(CDClassContext.class,0);
		}
		public CDInterfaceContext cDInterface() {
			return getRuleContext(CDInterfaceContext.class,0);
		}
		public CDTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDType(this);
		}
	}

	public final CDTypeContext cDType() throws RecognitionException {
		CDTypeContext _localctx = new CDTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cDType);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				((CDTypeContext)_localctx).tmp26 = cDClass();
				((CDTypeContext)_localctx).ret = ((CDTypeContext)_localctx).tmp26.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				((CDTypeContext)_localctx).tmp27 = cDInterface();
				((CDTypeContext)_localctx).ret = ((CDTypeContext)_localctx).tmp27.ret;
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

	public static class CDField_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDField ret = null;
		public CDFieldContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDFieldContext cDField() {
			return getRuleContext(CDFieldContext.class,0);
		}
		public CDField_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDField_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDField_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDField_eof(this);
		}
	}

	public final CDField_eofContext cDField_eof() throws RecognitionException {
		CDField_eofContext _localctx = new CDField_eofContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_cDField_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			((CDField_eofContext)_localctx).tmp = cDField();
			((CDField_eofContext)_localctx).ret =  ((CDField_eofContext)_localctx).tmp.ret;
			setState(1111);
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

	public static class CDFieldContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDField ret;
		public CDAttributeContext tmp28;
		public CDParameterContext tmp29;
		public CDAttributeContext cDAttribute() {
			return getRuleContext(CDAttributeContext.class,0);
		}
		public CDParameterContext cDParameter() {
			return getRuleContext(CDParameterContext.class,0);
		}
		public CDFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDField(this);
		}
	}

	public final CDFieldContext cDField() throws RecognitionException {
		CDFieldContext _localctx = new CDFieldContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_cDField);
		try {
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				((CDFieldContext)_localctx).tmp28 = cDAttribute();
				((CDFieldContext)_localctx).ret = ((CDFieldContext)_localctx).tmp28.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				((CDFieldContext)_localctx).tmp29 = cDParameter();
				((CDFieldContext)_localctx).ret = ((CDFieldContext)_localctx).tmp29.ret;
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

	public static class CDMethOrConstr_eofContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDMethOrConstr ret = null;
		public CDMethOrConstrContext tmp;
		public TerminalNode EOF() { return getToken(ClassDiagramsAntlrParser.EOF, 0); }
		public CDMethOrConstrContext cDMethOrConstr() {
			return getRuleContext(CDMethOrConstrContext.class,0);
		}
		public CDMethOrConstr_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDMethOrConstr_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDMethOrConstr_eof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDMethOrConstr_eof(this);
		}
	}

	public final CDMethOrConstr_eofContext cDMethOrConstr_eof() throws RecognitionException {
		CDMethOrConstr_eofContext _localctx = new CDMethOrConstr_eofContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cDMethOrConstr_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			((CDMethOrConstr_eofContext)_localctx).tmp = cDMethOrConstr();
			((CDMethOrConstr_eofContext)_localctx).ret =  ((CDMethOrConstr_eofContext)_localctx).tmp.ret;
			setState(1123);
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

	public static class CDMethOrConstrContext extends ParserRuleContext {
		public classdiagrams._ast.ASTCDMethOrConstr ret;
		public CDConstructorContext tmp30;
		public CDMethodContext tmp31;
		public CDConstructorContext cDConstructor() {
			return getRuleContext(CDConstructorContext.class,0);
		}
		public CDMethodContext cDMethod() {
			return getRuleContext(CDMethodContext.class,0);
		}
		public CDMethOrConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cDMethOrConstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).enterCDMethOrConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassDiagramsAntlrListener ) ((ClassDiagramsAntlrListener)listener).exitCDMethOrConstr(this);
		}
	}

	public final CDMethOrConstrContext cDMethOrConstr() throws RecognitionException {
		CDMethOrConstrContext _localctx = new CDMethOrConstrContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cDMethOrConstr);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				((CDMethOrConstrContext)_localctx).tmp30 = cDConstructor();
				((CDMethOrConstrContext)_localctx).ret = ((CDMethOrConstrContext)_localctx).tmp30.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				((CDMethOrConstrContext)_localctx).tmp31 = cDMethod();
				((CDMethOrConstrContext)_localctx).ret = ((CDMethOrConstrContext)_localctx).tmp31.ret;
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
		case 37:
			return mCListType_sempred((MCListTypeContext)_localctx, predIndex);
		case 39:
			return mCOptionalType_sempred((MCOptionalTypeContext)_localctx, predIndex);
		case 41:
			return mCMapType_sempred((MCMapTypeContext)_localctx, predIndex);
		case 43:
			return mCSetType_sempred((MCSetTypeContext)_localctx, predIndex);
		case 59:
			return tImplements_sempred((TImplementsContext)_localctx, predIndex);
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
	private boolean mCListType_sempred(MCListTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return next("List");
		}
		return true;
	}
	private boolean mCOptionalType_sempred(MCOptionalTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return next("Optional");
		}
		return true;
	}
	private boolean mCMapType_sempred(MCMapTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return next("Map");
		}
		return true;
	}
	private boolean mCSetType_sempred(MCSetTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return next("Set");
		}
		return true;
	}
	private boolean tImplements_sempred(TImplementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return _input.LT(1).getText().equals("implements");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0470\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00dd\n\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\5\r\u00fa\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21"+
		"\u0111\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\5\25\u0131\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0150\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0163\n\33\f\33\16\33\u0166\13\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0172\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u018a\n\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\5#\u019d\n#\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u01f4\n\63\f\63\16\63\u01f7"+
		"\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0200\n\63\f\63\16\63\u0203"+
		"\13\63\5\63\u0205\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u024b\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0284\n\67\7\67\u0286\n\67\f\67\16\67\u0289"+
		"\13\67\3\67\5\67\u028c\n\67\3\67\3\67\3\67\7\67\u0291\n\67\f\67\16\67"+
		"\u0294\13\67\3\67\3\67\3\67\38\38\38\38\39\39\39\59\u02a0\n9\39\39\39"+
		"\39\39\39\39\39\39\39\39\79\u02ad\n9\f9\169\u02b0\139\39\39\3:\3:\3:\3"+
		":\3;\3;\3;\5;\u02bb\n;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02c5\n;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\7;\u02cf\n;\f;\16;\u02d2\13;\5;\u02d4\n;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\7;\u02e0\n;\f;\16;\u02e3\13;\3;\3;\5;\u02e7\n;\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\5?\u02f8\n?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\7?\u0305\n?\f?\16?\u0308\13?\5?\u030a\n?\3?\3?\3?\3?\3?"+
		"\3?\3?\7?\u0313\n?\f?\16?\u0316\13?\3?\3?\5?\u031a\n?\3@\3@\3@\3@\3A\3"+
		"A\3A\5A\u0323\nA\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\7C\u033c\nC\fC\16C\u033f\13C\5C\u0341\nC\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\7C\u034b\nC\fC\16C\u034e\13C\5C\u0350\nC\3C\3C\3D\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0366\nE\fE\16E\u0369\13"+
		"E\5E\u036b\nE\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0375\nE\fE\16E\u0378\13E\5E"+
		"\u037a\nE\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\5G\u0386\nG\3G\3G\3G\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\7I\u03a5\nI\fI\16I\u03a8\13I\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\5K\u03bd\nK\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\5M\u03d2\nM\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u03e4\nO\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u03f6\nQ\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\3U\3U\3V\3V\3V\3V\3W\3W\3X\3"+
		"X\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u041a\n[\3\\\3\\\3\\\3"+
		"\\\3]\3]\3]\3]\3]\3]\5]\u0426\n]\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\5_\u043b\n_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\5a\u044a\na\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\5c\u0456\nc\3d\3d\3d\3d\3"+
		"e\3e\3e\3e\3e\3e\5e\u0462\ne\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\5g\u046e\n"+
		"g\3g\2\2h\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\2\2\u0491\2\u00ce"+
		"\3\2\2\2\4\u00d2\3\2\2\2\6\u00d4\3\2\2\2\b\u00dc\3\2\2\2\n\u00de\3\2\2"+
		"\2\f\u00e2\3\2\2\2\16\u00e5\3\2\2\2\20\u00e9\3\2\2\2\22\u00ec\3\2\2\2"+
		"\24\u00f0\3\2\2\2\26\u00f3\3\2\2\2\30\u00f9\3\2\2\2\32\u00fe\3\2\2\2\34"+
		"\u0102\3\2\2\2\36\u010a\3\2\2\2 \u0110\3\2\2\2\"\u011a\3\2\2\2$\u011e"+
		"\3\2\2\2&\u012a\3\2\2\2(\u0130\3\2\2\2*\u013e\3\2\2\2,\u0142\3\2\2\2."+
		"\u0149\3\2\2\2\60\u014f\3\2\2\2\62\u0158\3\2\2\2\64\u015c\3\2\2\2\66\u0167"+
		"\3\2\2\28\u016b\3\2\2\2:\u0175\3\2\2\2<\u0189\3\2\2\2>\u018b\3\2\2\2@"+
		"\u018f\3\2\2\2B\u0192\3\2\2\2D\u019c\3\2\2\2F\u019e\3\2\2\2H\u01a2\3\2"+
		"\2\2J\u01a4\3\2\2\2L\u01a8\3\2\2\2N\u01b1\3\2\2\2P\u01b5\3\2\2\2R\u01be"+
		"\3\2\2\2T\u01c2\3\2\2\2V\u01ce\3\2\2\2X\u01d2\3\2\2\2Z\u01db\3\2\2\2\\"+
		"\u01df\3\2\2\2^\u01e2\3\2\2\2`\u01e6\3\2\2\2b\u01e9\3\2\2\2d\u01ed\3\2"+
		"\2\2f\u0208\3\2\2\2h\u020c\3\2\2\2j\u020f\3\2\2\2l\u028b\3\2\2\2n\u0298"+
		"\3\2\2\2p\u029f\3\2\2\2r\u02b3\3\2\2\2t\u02ba\3\2\2\2v\u02e8\3\2\2\2x"+
		"\u02ec\3\2\2\2z\u02f0\3\2\2\2|\u02f7\3\2\2\2~\u031b\3\2\2\2\u0080\u0322"+
		"\3\2\2\2\u0082\u032b\3\2\2\2\u0084\u032f\3\2\2\2\u0086\u0353\3\2\2\2\u0088"+
		"\u0357\3\2\2\2\u008a\u037d\3\2\2\2\u008c\u0381\3\2\2\2\u008e\u038a\3\2"+
		"\2\2\u0090\u03a6\3\2\2\2\u0092\u03a9\3\2\2\2\u0094\u03bc\3\2\2\2\u0096"+
		"\u03be\3\2\2\2\u0098\u03d1\3\2\2\2\u009a\u03d3\3\2\2\2\u009c\u03e3\3\2"+
		"\2\2\u009e\u03e5\3\2\2\2\u00a0\u03f5\3\2\2\2\u00a2\u03f7\3\2\2\2\u00a4"+
		"\u03fb\3\2\2\2\u00a6\u03fd\3\2\2\2\u00a8\u0401\3\2\2\2\u00aa\u0403\3\2"+
		"\2\2\u00ac\u0407\3\2\2\2\u00ae\u0409\3\2\2\2\u00b0\u040d\3\2\2\2\u00b2"+
		"\u040f\3\2\2\2\u00b4\u0419\3\2\2\2\u00b6\u041b\3\2\2\2\u00b8\u0425\3\2"+
		"\2\2\u00ba\u0427\3\2\2\2\u00bc\u043a\3\2\2\2\u00be\u043c\3\2\2\2\u00c0"+
		"\u0449\3\2\2\2\u00c2\u044b\3\2\2\2\u00c4\u0455\3\2\2\2\u00c6\u0457\3\2"+
		"\2\2\u00c8\u0461\3\2\2\2\u00ca\u0463\3\2\2\2\u00cc\u046d\3\2\2\2\u00ce"+
		"\u00cf\5\4\3\2\u00cf\u00d0\b\2\1\2\u00d0\u00d1\7\2\2\3\u00d1\3\3\2\2\2"+
		"\u00d2\u00d3\7\3\2\2\u00d3\5\3\2\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\b"+
		"\4\1\2\u00d6\u00d7\7\2\2\3\u00d7\7\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00dd"+
		"\b\5\1\2\u00da\u00db\7\5\2\2\u00db\u00dd\b\5\1\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\t\3\2\2\2\u00de\u00df\5\f\7\2\u00df\u00e0\b\6\1\2"+
		"\u00e0\u00e1\7\2\2\3\u00e1\13\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4"+
		"\b\7\1\2\u00e4\r\3\2\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\b\b\1\2\u00e7"+
		"\u00e8\7\2\2\3\u00e8\17\3\2\2\2\u00e9\u00ea\7\62\2\2\u00ea\u00eb\b\t\1"+
		"\2\u00eb\21\3\2\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\b\n\1\2\u00ee\u00ef"+
		"\7\2\2\3\u00ef\23\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\b\13\1\2\u00f2"+
		"\25\3\2\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\b\f\1\2\u00f5\u00f6\7\2\2"+
		"\3\u00f6\27\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fa\b\r\1\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\60\2\2"+
		"\u00fc\u00fd\b\r\1\2\u00fd\31\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100"+
		"\b\16\1\2\u0100\u0101\7\2\2\3\u0101\33\3\2\2\2\u0102\u0103\7\60\2\2\u0103"+
		"\u0104\b\17\1\2\u0104\u0105\3\2\2\2\u0105\u0106\7,\2\2\u0106\u0107\b\17"+
		"\1\2\u0107\u0108\3\2\2\2\u0108\u0109\6\17\2\2\u0109\35\3\2\2\2\u010a\u010b"+
		"\5 \21\2\u010b\u010c\b\20\1\2\u010c\u010d\7\2\2\3\u010d\37\3\2\2\2\u010e"+
		"\u010f\7#\2\2\u010f\u0111\b\21\1\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\60\2\2\u0113\u0114\b\21\1\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\b\21\1\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\6\21\3\2\u0119!\3\2\2\2\u011a\u011b\5$\23\2\u011b\u011c"+
		"\b\22\1\2\u011c\u011d\7\2\2\3\u011d#\3\2\2\2\u011e\u011f\7\60\2\2\u011f"+
		"\u0120\b\23\1\2\u0120\u0121\3\2\2\2\u0121\u0122\7$\2\2\u0122\u0123\7\60"+
		"\2\2\u0123\u0124\b\23\1\2\u0124\u0125\3\2\2\2\u0125\u0126\7,\2\2\u0126"+
		"\u0127\b\23\1\2\u0127\u0128\3\2\2\2\u0128\u0129\6\23\4\2\u0129%\3\2\2"+
		"\2\u012a\u012b\5(\25\2\u012b\u012c\b\24\1\2\u012c\u012d\7\2\2\3\u012d"+
		"\'\3\2\2\2\u012e\u012f\7#\2\2\u012f\u0131\b\25\1\2\u0130\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\60\2\2\u0133\u0134"+
		"\b\25\1\2\u0134\u0135\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\7\60\2\2"+
		"\u0137\u0138\b\25\1\2\u0138\u0139\3\2\2\2\u0139\u013a\7,\2\2\u013a\u013b"+
		"\b\25\1\2\u013b\u013c\3\2\2\2\u013c\u013d\6\25\5\2\u013d)\3\2\2\2\u013e"+
		"\u013f\5,\27\2\u013f\u0140\b\26\1\2\u0140\u0141\7\2\2\3\u0141+\3\2\2\2"+
		"\u0142\u0143\7\60\2\2\u0143\u0144\b\27\1\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\7$\2\2\u0146\u0147\7\60\2\2\u0147\u0148\b\27\1\2\u0148-\3\2\2\2\u0149"+
		"\u014a\5\60\31\2\u014a\u014b\b\30\1\2\u014b\u014c\7\2\2\3\u014c/\3\2\2"+
		"\2\u014d\u014e\7#\2\2\u014e\u0150\b\31\1\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\60\2\2\u0152\u0153\b\31\1\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0156\7\60\2\2\u0156\u0157"+
		"\b\31\1\2\u0157\61\3\2\2\2\u0158\u0159\5\64\33\2\u0159\u015a\b\32\1\2"+
		"\u015a\u015b\7\2\2\3\u015b\63\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\b"+
		"\33\1\2\u015e\u0164\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\7,\2\2\u0161"+
		"\u0163\b\33\1\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\65\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\58\35\2\u0168\u0169\b\34\1\2\u0169\u016a\7\2\2\3\u016a\67\3\2\2"+
		"\2\u016b\u016c\7\6\2\2\u016c\u016d\5\64\33\2\u016d\u0171\b\35\1\2\u016e"+
		"\u016f\7$\2\2\u016f\u0170\7 \2\2\u0170\u0172\b\35\1\2\u0171\u016e\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\'\2\2\u0174"+
		"9\3\2\2\2\u0175\u0176\5<\37\2\u0176\u0177\b\36\1\2\u0177\u0178\7\2\2\3"+
		"\u0178;\3\2\2\2\u0179\u017a\7\7\2\2\u017a\u018a\b\37\1\2\u017b\u017c\7"+
		"\b\2\2\u017c\u018a\b\37\1\2\u017d\u017e\7\t\2\2\u017e\u018a\b\37\1\2\u017f"+
		"\u0180\7\n\2\2\u0180\u018a\b\37\1\2\u0181\u0182\7\13\2\2\u0182\u018a\b"+
		"\37\1\2\u0183\u0184\7\f\2\2\u0184\u018a\b\37\1\2\u0185\u0186\7\r\2\2\u0186"+
		"\u018a\b\37\1\2\u0187\u0188\7\16\2\2\u0188\u018a\b\37\1\2\u0189\u0179"+
		"\3\2\2\2\u0189\u017b\3\2\2\2\u0189\u017d\3\2\2\2\u0189\u017f\3\2\2\2\u0189"+
		"\u0181\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a=\3\2\2\2\u018b\u018c\5@!\2\u018c\u018d\b \1\2\u018d\u018e\7"+
		"\2\2\3\u018e?\3\2\2\2\u018f\u0190\5\64\33\2\u0190\u0191\b!\1\2\u0191A"+
		"\3\2\2\2\u0192\u0193\5D#\2\u0193\u0194\b\"\1\2\u0194\u0195\7\2\2\3\u0195"+
		"C\3\2\2\2\u0196\u0197\5H%\2\u0197\u0198\b#\1\2\u0198\u019d\3\2\2\2\u0199"+
		"\u019a\5\u00b4[\2\u019a\u019b\b#\1\2\u019b\u019d\3\2\2\2\u019c\u0196\3"+
		"\2\2\2\u019c\u0199\3\2\2\2\u019dE\3\2\2\2\u019e\u019f\5H%\2\u019f\u01a0"+
		"\b$\1\2\u01a0\u01a1\7\2\2\3\u01a1G\3\2\2\2\u01a2\u01a3\7\17\2\2\u01a3"+
		"I\3\2\2\2\u01a4\u01a5\5L\'\2\u01a5\u01a6\b&\1\2\u01a6\u01a7\7\2\2\3\u01a7"+
		"K\3\2\2\2\u01a8\u01a9\6\'\6\2\u01a9\u01aa\7,\2\2\u01aa\u01ab\b\'\1\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\7)\2\2\u01ad\u01ae\5\u00c0a\2\u01ae\u01af\b"+
		"\'\1\2\u01af\u01b0\7+\2\2\u01b0M\3\2\2\2\u01b1\u01b2\5P)\2\u01b2\u01b3"+
		"\b(\1\2\u01b3\u01b4\7\2\2\3\u01b4O\3\2\2\2\u01b5\u01b6\6)\7\2\u01b6\u01b7"+
		"\7,\2\2\u01b7\u01b8\b)\1\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7)\2\2\u01ba"+
		"\u01bb\5\u00c0a\2\u01bb\u01bc\b)\1\2\u01bc\u01bd\7+\2\2\u01bdQ\3\2\2\2"+
		"\u01be\u01bf\5T+\2\u01bf\u01c0\b*\1\2\u01c0\u01c1\7\2\2\3\u01c1S\3\2\2"+
		"\2\u01c2\u01c3\6+\b\2\u01c3\u01c4\7,\2\2\u01c4\u01c5\b+\1\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\7)\2\2\u01c7\u01c8\5\u00c0a\2\u01c8\u01c9\b+\1\2"+
		"\u01c9\u01ca\7\"\2\2\u01ca\u01cb\5\u00c0a\2\u01cb\u01cc\b+\1\2\u01cc\u01cd"+
		"\7+\2\2\u01cdU\3\2\2\2\u01ce\u01cf\5X-\2\u01cf\u01d0\b,\1\2\u01d0\u01d1"+
		"\7\2\2\3\u01d1W\3\2\2\2\u01d2\u01d3\6-\t\2\u01d3\u01d4\7,\2\2\u01d4\u01d5"+
		"\b-\1\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7)\2\2\u01d7\u01d8\5\u00c0a\2"+
		"\u01d8\u01d9\b-\1\2\u01d9\u01da\7+\2\2\u01daY\3\2\2\2\u01db\u01dc\5\\"+
		"/\2\u01dc\u01dd\b.\1\2\u01dd\u01de\7\2\2\3\u01de[\3\2\2\2\u01df\u01e0"+
		"\5@!\2\u01e0\u01e1\b/\1\2\u01e1]\3\2\2\2\u01e2\u01e3\5`\61\2\u01e3\u01e4"+
		"\b\60\1\2\u01e4\u01e5\7\2\2\3\u01e5_\3\2\2\2\u01e6\u01e7\5<\37\2\u01e7"+
		"\u01e8\b\61\1\2\u01e8a\3\2\2\2\u01e9\u01ea\5d\63\2\u01ea\u01eb\b\62\1"+
		"\2\u01eb\u01ec\7\2\2\3\u01ecc\3\2\2\2\u01ed\u01ee\7,\2\2\u01ee\u01ef\b"+
		"\63\1\2\u01ef\u01f5\3\2\2\2\u01f0\u01f1\7$\2\2\u01f1\u01f2\7,\2\2\u01f2"+
		"\u01f4\b\63\1\2\u01f3\u01f0\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3"+
		"\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u0204\7)\2\2\u01f9\u01fa\5\u00c0a\2\u01fa\u0201\b\63\1\2\u01fb\u01fc"+
		"\7\"\2\2\u01fc\u01fd\5\u00c0a\2\u01fd\u01fe\b\63\1\2\u01fe\u0200\3\2\2"+
		"\2\u01ff\u01fb\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u01f9\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7+\2\2\u0207e\3\2\2\2\u0208"+
		"\u0209\5h\65\2\u0209\u020a\b\64\1\2\u020a\u020b\7\2\2\3\u020bg\3\2\2\2"+
		"\u020c\u020d\5\u00b4[\2\u020d\u020e\b\65\1\2\u020ei\3\2\2\2\u020f\u0210"+
		"\5l\67\2\u0210\u0211\b\66\1\2\u0211\u0212\7\2\2\3\u0212k\3\2\2\2\u0213"+
		"\u024a\7\20\2\2\u0214\u0215\7,\2\2\u0215\u024b\b\67\1\2\u0216\u0217\7"+
		"\3\2\2\u0217\u024b\b\67\1\2\u0218\u0219\7\4\2\2\u0219\u024b\b\67\1\2\u021a"+
		"\u021b\7\5\2\2\u021b\u024b\b\67\1\2\u021c\u021d\7\6\2\2\u021d\u024b\b"+
		"\67\1\2\u021e\u021f\7\7\2\2\u021f\u024b\b\67\1\2\u0220\u0221\7\b\2\2\u0221"+
		"\u024b\b\67\1\2\u0222\u0223\7\t\2\2\u0223\u024b\b\67\1\2\u0224\u0225\7"+
		"\n\2\2\u0225\u024b\b\67\1\2\u0226\u0227\7\13\2\2\u0227\u024b\b\67\1\2"+
		"\u0228\u0229\7\f\2\2\u0229\u024b\b\67\1\2\u022a\u022b\7\r\2\2\u022b\u024b"+
		"\b\67\1\2\u022c\u022d\7\16\2\2\u022d\u024b\b\67\1\2\u022e\u022f\7\17\2"+
		"\2\u022f\u024b\b\67\1\2\u0230\u0231\7\20\2\2\u0231\u024b\b\67\1\2\u0232"+
		"\u0233\7\21\2\2\u0233\u024b\b\67\1\2\u0234\u0235\7\22\2\2\u0235\u024b"+
		"\b\67\1\2\u0236\u0237\7\23\2\2\u0237\u024b\b\67\1\2\u0238\u0239\7\24\2"+
		"\2\u0239\u024b\b\67\1\2\u023a\u023b\7\25\2\2\u023b\u024b\b\67\1\2\u023c"+
		"\u023d\7\26\2\2\u023d\u024b\b\67\1\2\u023e\u023f\7\27\2\2\u023f\u024b"+
		"\b\67\1\2\u0240\u0241\7\30\2\2\u0241\u024b\b\67\1\2\u0242\u0243\7\31\2"+
		"\2\u0243\u024b\b\67\1\2\u0244\u0245\7\32\2\2\u0245\u024b\b\67\1\2\u0246"+
		"\u0247\7\33\2\2\u0247\u024b\b\67\1\2\u0248\u0249\7\34\2\2\u0249\u024b"+
		"\b\67\1\2\u024a\u0214\3\2\2\2\u024a\u0216\3\2\2\2\u024a\u0218\3\2\2\2"+
		"\u024a\u021a\3\2\2\2\u024a\u021c\3\2\2\2\u024a\u021e\3\2\2\2\u024a\u0220"+
		"\3\2\2\2\u024a\u0222\3\2\2\2\u024a\u0224\3\2\2\2\u024a\u0226\3\2\2\2\u024a"+
		"\u0228\3\2\2\2\u024a\u022a\3\2\2\2\u024a\u022c\3\2\2\2\u024a\u022e\3\2"+
		"\2\2\u024a\u0230\3\2\2\2\u024a\u0232\3\2\2\2\u024a\u0234\3\2\2\2\u024a"+
		"\u0236\3\2\2\2\u024a\u0238\3\2\2\2\u024a\u023a\3\2\2\2\u024a\u023c\3\2"+
		"\2\2\u024a\u023e\3\2\2\2\u024a\u0240\3\2\2\2\u024a\u0242\3\2\2\2\u024a"+
		"\u0244\3\2\2\2\u024a\u0246\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u0287\3\2"+
		"\2\2\u024c\u0283\7$\2\2\u024d\u024e\7,\2\2\u024e\u0284\b\67\1\2\u024f"+
		"\u0250\7\3\2\2\u0250\u0284\b\67\1\2\u0251\u0252\7\4\2\2\u0252\u0284\b"+
		"\67\1\2\u0253\u0254\7\5\2\2\u0254\u0284\b\67\1\2\u0255\u0256\7\6\2\2\u0256"+
		"\u0284\b\67\1\2\u0257\u0258\7\7\2\2\u0258\u0284\b\67\1\2\u0259\u025a\7"+
		"\b\2\2\u025a\u0284\b\67\1\2\u025b\u025c\7\t\2\2\u025c\u0284\b\67\1\2\u025d"+
		"\u025e\7\n\2\2\u025e\u0284\b\67\1\2\u025f\u0260\7\13\2\2\u0260\u0284\b"+
		"\67\1\2\u0261\u0262\7\f\2\2\u0262\u0284\b\67\1\2\u0263\u0264\7\r\2\2\u0264"+
		"\u0284\b\67\1\2\u0265\u0266\7\16\2\2\u0266\u0284\b\67\1\2\u0267\u0268"+
		"\7\17\2\2\u0268\u0284\b\67\1\2\u0269\u026a\7\20\2\2\u026a\u0284\b\67\1"+
		"\2\u026b\u026c\7\21\2\2\u026c\u0284\b\67\1\2\u026d\u026e\7\22\2\2\u026e"+
		"\u0284\b\67\1\2\u026f\u0270\7\23\2\2\u0270\u0284\b\67\1\2\u0271\u0272"+
		"\7\24\2\2\u0272\u0284\b\67\1\2\u0273\u0274\7\25\2\2\u0274\u0284\b\67\1"+
		"\2\u0275\u0276\7\26\2\2\u0276\u0284\b\67\1\2\u0277\u0278\7\27\2\2\u0278"+
		"\u0284\b\67\1\2\u0279\u027a\7\30\2\2\u027a\u0284\b\67\1\2\u027b\u027c"+
		"\7\31\2\2\u027c\u0284\b\67\1\2\u027d\u027e\7\32\2\2\u027e\u0284\b\67\1"+
		"\2\u027f\u0280\7\33\2\2\u0280\u0284\b\67\1\2\u0281\u0282\7\34\2\2\u0282"+
		"\u0284\b\67\1\2\u0283\u024d\3\2\2\2\u0283\u024f\3\2\2\2\u0283\u0251\3"+
		"\2\2\2\u0283\u0253\3\2\2\2\u0283\u0255\3\2\2\2\u0283\u0257\3\2\2\2\u0283"+
		"\u0259\3\2\2\2\u0283\u025b\3\2\2\2\u0283\u025d\3\2\2\2\u0283\u025f\3\2"+
		"\2\2\u0283\u0261\3\2\2\2\u0283\u0263\3\2\2\2\u0283\u0265\3\2\2\2\u0283"+
		"\u0267\3\2\2\2\u0283\u0269\3\2\2\2\u0283\u026b\3\2\2\2\u0283\u026d\3\2"+
		"\2\2\u0283\u026f\3\2\2\2\u0283\u0271\3\2\2\2\u0283\u0273\3\2\2\2\u0283"+
		"\u0275\3\2\2\2\u0283\u0277\3\2\2\2\u0283\u0279\3\2\2\2\u0283\u027b\3\2"+
		"\2\2\u0283\u027d\3\2\2\2\u0283\u027f\3\2\2\2\u0283\u0281\3\2\2\2\u0284"+
		"\u0286\3\2\2\2\u0285\u024c\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028c\7\'\2\2\u028b\u0213\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0292\3\2"+
		"\2\2\u028d\u028e\58\35\2\u028e\u028f\b\67\1\2\u028f\u0291\3\2\2\2\u0290"+
		"\u028d\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\5p9\2\u0296\u0297"+
		"\b\67\1\2\u0297m\3\2\2\2\u0298\u0299\5p9\2\u0299\u029a\b8\1\2\u029a\u029b"+
		"\7\2\2\3\u029bo\3\2\2\2\u029c\u029d\5\u0090I\2\u029d\u029e\b9\1\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u02a2\7\21\2\2\u02a2\u02a3\7,\2\2\u02a3\u02a4\b9\1\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02ae\7(\2\2\u02a6\u02a7\5t;\2\u02a7\u02a8\b9\1\2"+
		"\u02a8\u02ad\3\2\2\2\u02a9\u02aa\5|?\2\u02aa\u02ab\b9\1\2\u02ab\u02ad"+
		"\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b1\u02b2\7*\2\2\u02b2q\3\2\2\2\u02b3\u02b4\5t;\2\u02b4\u02b5\b"+
		":\1\2\u02b5\u02b6\7\2\2\3\u02b6s\3\2\2\2\u02b7\u02b8\5\u0090I\2\u02b8"+
		"\u02b9\b;\1\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7\22\2\2\u02bd\u02be\7,\2\2\u02be"+
		"\u02bf\b;\1\2\u02bf\u02c4\3\2\2\2\u02c0\u02c1\7\23\2\2\u02c1\u02c2\5\u00b8"+
		"]\2\u02c2\u02c3\b;\1\2\u02c3\u02c5\3\2\2\2\u02c4\u02c0\3\2\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02d3\3\2\2\2\u02c6\u02c7\5x=\2\u02c7\u02c8\b;\1\2\u02c8"+
		"\u02c9\5\u00b8]\2\u02c9\u02d0\b;\1\2\u02ca\u02cb\7\"\2\2\u02cb\u02cc\5"+
		"\u00b8]\2\u02cc\u02cd\b;\1\2\u02cd\u02cf\3\2\2\2\u02ce\u02ca\3\2\2\2\u02cf"+
		"\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d4\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02c6\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02e6\3\2\2\2\u02d5\u02e1\7(\2\2\u02d6\u02d7\5\u0080A\2\u02d7\u02d8\b"+
		";\1\2\u02d8\u02e0\3\2\2\2\u02d9\u02da\5\u0084C\2\u02da\u02db\b;\1\2\u02db"+
		"\u02e0\3\2\2\2\u02dc\u02dd\5\u0088E\2\u02dd\u02de\b;\1\2\u02de\u02e0\3"+
		"\2\2\2\u02df\u02d6\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0"+
		"\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2"+
		"\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\7*\2\2\u02e5\u02e7\7\'\2\2\u02e6"+
		"\u02d5\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7u\3\2\2\2\u02e8\u02e9\5x=\2\u02e9"+
		"\u02ea\b<\1\2\u02ea\u02eb\7\2\2\3\u02ebw\3\2\2\2\u02ec\u02ed\6=\n\2\u02ed"+
		"\u02ee\7,\2\2\u02ee\u02ef\b=\1\2\u02efy\3\2\2\2\u02f0\u02f1\5|?\2\u02f1"+
		"\u02f2\b>\1\2\u02f2\u02f3\7\2\2\3\u02f3{\3\2\2\2\u02f4\u02f5\5\u0090I"+
		"\2\u02f5\u02f6\b?\1\2\u02f6\u02f8\3\2\2\2\u02f7\u02f4\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\24\2\2\u02fa\u02fb\7,\2\2\u02fb"+
		"\u02fc\b?\1\2\u02fc\u0309\3\2\2\2\u02fd\u02fe\7\23\2\2\u02fe\u02ff\5\u00b8"+
		"]\2\u02ff\u0306\b?\1\2\u0300\u0301\7\"\2\2\u0301\u0302\5\u00b8]\2\u0302"+
		"\u0303\b?\1\2\u0303\u0305\3\2\2\2\u0304\u0300\3\2\2\2\u0305\u0308\3\2"+
		"\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030a\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0309\u02fd\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0319\3\2"+
		"\2\2\u030b\u0314\7(\2\2\u030c\u030d\5\u0080A\2\u030d\u030e\b?\1\2\u030e"+
		"\u0313\3\2\2\2\u030f\u0310\5\u0088E\2\u0310\u0311\b?\1\2\u0311\u0313\3"+
		"\2\2\2\u0312\u030c\3\2\2\2\u0312\u030f\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u031a\7*\2\2\u0318\u031a\7\'\2\2\u0319\u030b\3\2\2\2\u0319"+
		"\u0318\3\2\2\2\u031a}\3\2\2\2\u031b\u031c\5\u0080A\2\u031c\u031d\b@\1"+
		"\2\u031d\u031e\7\2\2\3\u031e\177\3\2\2\2\u031f\u0320\5\u0090I\2\u0320"+
		"\u0321\bA\1\2\u0321\u0323\3\2\2\2\u0322\u031f\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324\u0325\5\u00b4[\2\u0325\u0326\bA\1\2\u0326"+
		"\u0327\7,\2\2\u0327\u0328\bA\1\2\u0328\u0329\3\2\2\2\u0329\u032a\7\'\2"+
		"\2\u032a\u0081\3\2\2\2\u032b\u032c\5\u0084C\2\u032c\u032d\bB\1\2\u032d"+
		"\u032e\7\2\2\3\u032e\u0083\3\2\2\2\u032f\u0330\5\u0090I\2\u0330\u0331"+
		"\bC\1\2\u0331\u0332\7,\2\2\u0332\u0333\bC\1\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0340\7\36\2\2\u0335\u0336\5\u008cG\2\u0336\u033d\bC\1\2\u0337\u0338"+
		"\7\"\2\2\u0338\u0339\5\u008cG\2\u0339\u033a\bC\1\2\u033a\u033c\3\2\2\2"+
		"\u033b\u0337\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0335\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u034f\7\37\2\2\u0343\u0344\7"+
		"\25\2\2\u0344\u0345\5\64\33\2\u0345\u034c\bC\1\2\u0346\u0347\7\"\2\2\u0347"+
		"\u0348\5\64\33\2\u0348\u0349\bC\1\2\u0349\u034b\3\2\2\2\u034a\u0346\3"+
		"\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0343\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0351\3\2\2\2\u0351\u0352\7\'\2\2\u0352\u0085\3\2\2\2\u0353"+
		"\u0354\5\u0088E\2\u0354\u0355\bD\1\2\u0355\u0356\7\2\2\3\u0356\u0087\3"+
		"\2\2\2\u0357\u0358\5\u0090I\2\u0358\u0359\bE\1\2\u0359\u035a\5D#\2\u035a"+
		"\u035b\bE\1\2\u035b\u035c\7,\2\2\u035c\u035d\bE\1\2\u035d\u035e\3\2\2"+
		"\2\u035e\u036a\7\36\2\2\u035f\u0360\5\u008cG\2\u0360\u0367\bE\1\2\u0361"+
		"\u0362\7\"\2\2\u0362\u0363\5\u008cG\2\u0363\u0364\bE\1\2\u0364\u0366\3"+
		"\2\2\2\u0365\u0361\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u035f\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0379\7\37\2\2\u036d"+
		"\u036e\7\25\2\2\u036e\u036f\5\64\33\2\u036f\u0376\bE\1\2\u0370\u0371\7"+
		"\"\2\2\u0371\u0372\5\64\33\2\u0372\u0373\bE\1\2\u0373\u0375\3\2\2\2\u0374"+
		"\u0370\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u036d\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\7\'\2\2\u037c\u0089\3\2"+
		"\2\2\u037d\u037e\5\u008cG\2\u037e\u037f\bF\1\2\u037f\u0380\7\2\2\3\u0380"+
		"\u008b\3\2\2\2\u0381\u0382\5\u00b4[\2\u0382\u0385\bG\1\2\u0383\u0384\7"+
		"%\2\2\u0384\u0386\bG\1\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0388\7,\2\2\u0388\u0389\bG\1\2\u0389\u008d\3\2\2"+
		"\2\u038a\u038b\5\u0090I\2\u038b\u038c\bH\1\2\u038c\u038d\7\2\2\3\u038d"+
		"\u008f\3\2\2\2\u038e\u038f\7\26\2\2\u038f\u03a5\bI\1\2\u0390\u0391\7\27"+
		"\2\2\u0391\u03a5\bI\1\2\u0392\u0393\7\30\2\2\u0393\u03a5\bI\1\2\u0394"+
		"\u0395\7\31\2\2\u0395\u03a5\bI\1\2\u0396\u0397\7#\2\2\u0397\u03a5\bI\1"+
		"\2\u0398\u0399\7\32\2\2\u0399\u03a5\bI\1\2\u039a\u039b\7\35\2\2\u039b"+
		"\u03a5\bI\1\2\u039c\u039d\7\33\2\2\u039d\u03a5\bI\1\2\u039e\u039f\7!\2"+
		"\2\u039f\u03a5\bI\1\2\u03a0\u03a1\7\34\2\2\u03a1\u03a5\bI\1\2\u03a2\u03a3"+
		"\7&\2\2\u03a3\u03a5\bI\1\2\u03a4\u038e\3\2\2\2\u03a4\u0390\3\2\2\2\u03a4"+
		"\u0392\3\2\2\2\u03a4\u0394\3\2\2\2\u03a4\u0396\3\2\2\2\u03a4\u0398\3\2"+
		"\2\2\u03a4\u039a\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4\u039e\3\2\2\2\u03a4"+
		"\u03a0\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u0091\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9"+
		"\u03aa\5\u0094K\2\u03aa\u03ab\bJ\1\2\u03ab\u03ac\7\2\2\3\u03ac\u0093\3"+
		"\2\2\2\u03ad\u03ae\5\4\3\2\u03ae\u03af\bK\1\2\u03af\u03bd\3\2\2\2\u03b0"+
		"\u03b1\5\b\5\2\u03b1\u03b2\bK\1\2\u03b2\u03bd\3\2\2\2\u03b3\u03b4\5\f"+
		"\7\2\u03b4\u03b5\bK\1\2\u03b5\u03bd\3\2\2\2\u03b6\u03b7\5\20\t\2\u03b7"+
		"\u03b8\bK\1\2\u03b8\u03bd\3\2\2\2\u03b9\u03ba\5\u009cO\2\u03ba\u03bb\b"+
		"K\1\2\u03bb\u03bd\3\2\2\2\u03bc\u03ad\3\2\2\2\u03bc\u03b0\3\2\2\2\u03bc"+
		"\u03b3\3\2\2\2\u03bc\u03b6\3\2\2\2\u03bc\u03b9\3\2\2\2\u03bd\u0095\3\2"+
		"\2\2\u03be\u03bf\5\u0098M\2\u03bf\u03c0\bL\1\2\u03c0\u03c1\7\2\2\3\u03c1"+
		"\u0097\3\2\2\2\u03c2\u03c3\5\4\3\2\u03c3\u03c4\bM\1\2\u03c4\u03d2\3\2"+
		"\2\2\u03c5\u03c6\5\b\5\2\u03c6\u03c7\bM\1\2\u03c7\u03d2\3\2\2\2\u03c8"+
		"\u03c9\5\f\7\2\u03c9\u03ca\bM\1\2\u03ca\u03d2\3\2\2\2\u03cb\u03cc\5\20"+
		"\t\2\u03cc\u03cd\bM\1\2\u03cd\u03d2\3\2\2\2\u03ce\u03cf\5\u00a0Q\2\u03cf"+
		"\u03d0\bM\1\2\u03d0\u03d2\3\2\2\2\u03d1\u03c2\3\2\2\2\u03d1\u03c5\3\2"+
		"\2\2\u03d1\u03c8\3\2\2\2\u03d1\u03cb\3\2\2\2\u03d1\u03ce\3\2\2\2\u03d2"+
		"\u0099\3\2\2\2\u03d3\u03d4\5\u009cO\2\u03d4\u03d5\bN\1\2\u03d5\u03d6\7"+
		"\2\2\3\u03d6\u009b\3\2\2\2\u03d7\u03d8\5\24\13\2\u03d8\u03d9\bO\1\2\u03d9"+
		"\u03e4\3\2\2\2\u03da\u03db\5\34\17\2\u03db\u03dc\bO\1\2\u03dc\u03e4\3"+
		"\2\2\2\u03dd\u03de\5$\23\2\u03de\u03df\bO\1\2\u03df\u03e4\3\2\2\2\u03e0"+
		"\u03e1\5,\27\2\u03e1\u03e2\bO\1\2\u03e2\u03e4\3\2\2\2\u03e3\u03d7\3\2"+
		"\2\2\u03e3\u03da\3\2\2\2\u03e3\u03dd\3\2\2\2\u03e3\u03e0\3\2\2\2\u03e4"+
		"\u009d\3\2\2\2\u03e5\u03e6\5\u00a0Q\2\u03e6\u03e7\bP\1\2\u03e7\u03e8\7"+
		"\2\2\3\u03e8\u009f\3\2\2\2\u03e9\u03ea\5\30\r\2\u03ea\u03eb\bQ\1\2\u03eb"+
		"\u03f6\3\2\2\2\u03ec\u03ed\5 \21\2\u03ed\u03ee\bQ\1\2\u03ee\u03f6\3\2"+
		"\2\2\u03ef\u03f0\5(\25\2\u03f0\u03f1\bQ\1\2\u03f1\u03f6\3\2\2\2\u03f2"+
		"\u03f3\5\60\31\2\u03f3\u03f4\bQ\1\2\u03f4\u03f6\3\2\2\2\u03f5\u03e9\3"+
		"\2\2\2\u03f5\u03ec\3\2\2\2\u03f5\u03ef\3\2\2\2\u03f5\u03f2\3\2\2\2\u03f6"+
		"\u00a1\3\2\2\2\u03f7\u03f8\5\u00a4S\2\u03f8\u03f9\bR\1\2\u03f9\u03fa\7"+
		"\2\2\3\u03fa\u00a3\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u00a5\3\2\2\2\u03fd"+
		"\u03fe\5\u00a8U\2\u03fe\u03ff\bT\1\2\u03ff\u0400\7\2\2\3\u0400\u00a7\3"+
		"\2\2\2\u0401\u0402\3\2\2\2\u0402\u00a9\3\2\2\2\u0403\u0404\5\u00acW\2"+
		"\u0404\u0405\bV\1\2\u0405\u0406\7\2\2\3\u0406\u00ab\3\2\2\2\u0407\u0408"+
		"\3\2\2\2\u0408\u00ad\3\2\2\2\u0409\u040a\5\u00b0Y\2\u040a\u040b\bX\1\2"+
		"\u040b\u040c\7\2\2\3\u040c\u00af\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u00b1"+
		"\3\2\2\2\u040f\u0410\5\u00b4[\2\u0410\u0411\bZ\1\2\u0411\u0412\7\2\2\3"+
		"\u0412\u00b3\3\2\2\2\u0413\u0414\5<\37\2\u0414\u0415\b[\1\2\u0415\u041a"+
		"\3\2\2\2\u0416\u0417\5\u00b8]\2\u0417\u0418\b[\1\2\u0418\u041a\3\2\2\2"+
		"\u0419\u0413\3\2\2\2\u0419\u0416\3\2\2\2\u041a\u00b5\3\2\2\2\u041b\u041c"+
		"\5\u00b8]\2\u041c\u041d\b\\\1\2\u041d\u041e\7\2\2\3\u041e\u00b7\3\2\2"+
		"\2\u041f\u0420\5\u00bc_\2\u0420\u0421\b]\1\2\u0421\u0426\3\2\2\2\u0422"+
		"\u0423\5@!\2\u0423\u0424\b]\1\2\u0424\u0426\3\2\2\2\u0425\u041f\3\2\2"+
		"\2\u0425\u0422\3\2\2\2\u0426\u00b9\3\2\2\2\u0427\u0428\5\u00bc_\2\u0428"+
		"\u0429\b^\1\2\u0429\u042a\7\2\2\3\u042a\u00bb\3\2\2\2\u042b\u042c\5L\'"+
		"\2\u042c\u042d\b_\1\2\u042d\u043b\3\2\2\2\u042e\u042f\5P)\2\u042f\u0430"+
		"\b_\1\2\u0430\u043b\3\2\2\2\u0431\u0432\5T+\2\u0432\u0433\b_\1\2\u0433"+
		"\u043b\3\2\2\2\u0434\u0435\5X-\2\u0435\u0436\b_\1\2\u0436\u043b\3\2\2"+
		"\2\u0437\u0438\5d\63\2\u0438\u0439\b_\1\2\u0439\u043b\3\2\2\2\u043a\u042b"+
		"\3\2\2\2\u043a\u042e\3\2\2\2\u043a\u0431\3\2\2\2\u043a\u0434\3\2\2\2\u043a"+
		"\u0437\3\2\2\2\u043b\u00bd\3\2\2\2\u043c\u043d\5\u00c0a\2\u043d\u043e"+
		"\b`\1\2\u043e\u043f\7\2\2\3\u043f\u00bf\3\2\2\2\u0440\u0441\5\\/\2\u0441"+
		"\u0442\ba\1\2\u0442\u044a\3\2\2\2\u0443\u0444\5`\61\2\u0444\u0445\ba\1"+
		"\2\u0445\u044a\3\2\2\2\u0446\u0447\5h\65\2\u0447\u0448\ba\1\2\u0448\u044a"+
		"\3\2\2\2\u0449\u0440\3\2\2\2\u0449\u0443\3\2\2\2\u0449\u0446\3\2\2\2\u044a"+
		"\u00c1\3\2\2\2\u044b\u044c\5\u00c4c\2\u044c\u044d\bb\1\2\u044d\u044e\7"+
		"\2\2\3\u044e\u00c3\3\2\2\2\u044f\u0450\5t;\2\u0450\u0451\bc\1\2\u0451"+
		"\u0456\3\2\2\2\u0452\u0453\5|?\2\u0453\u0454\bc\1\2\u0454\u0456\3\2\2"+
		"\2\u0455\u044f\3\2\2\2\u0455\u0452\3\2\2\2\u0456\u00c5\3\2\2\2\u0457\u0458"+
		"\5\u00c8e\2\u0458\u0459\bd\1\2\u0459\u045a\7\2\2\3\u045a\u00c7\3\2\2\2"+
		"\u045b\u045c\5\u0080A\2\u045c\u045d\be\1\2\u045d\u0462\3\2\2\2\u045e\u045f"+
		"\5\u008cG\2\u045f\u0460\be\1\2\u0460\u0462\3\2\2\2\u0461\u045b\3\2\2\2"+
		"\u0461\u045e\3\2\2\2\u0462\u00c9\3\2\2\2\u0463\u0464\5\u00ccg\2\u0464"+
		"\u0465\bf\1\2\u0465\u0466\7\2\2\3\u0466\u00cb\3\2\2\2\u0467\u0468\5\u0084"+
		"C\2\u0468\u0469\bg\1\2\u0469\u046e\3\2\2\2\u046a\u046b\5\u0088E\2\u046b"+
		"\u046c\bg\1\2\u046c\u046e\3\2\2\2\u046d\u0467\3\2\2\2\u046d\u046a\3\2"+
		"\2\2\u046e\u00cd\3\2\2\2:\u00dc\u00f9\u0110\u0130\u014f\u0164\u0171\u0189"+
		"\u019c\u01f5\u0201\u0204\u024a\u0283\u0287\u028b\u0292\u029f\u02ac\u02ae"+
		"\u02ba\u02c4\u02d0\u02d3\u02df\u02e1\u02e6\u02f7\u0306\u0309\u0312\u0314"+
		"\u0319\u0322\u033d\u0340\u034c\u034f\u0367\u036a\u0376\u0379\u0385\u03a4"+
		"\u03a6\u03bc\u03d1\u03e3\u03f5\u0419\u0425\u043a\u0449\u0455\u0461\u046d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}