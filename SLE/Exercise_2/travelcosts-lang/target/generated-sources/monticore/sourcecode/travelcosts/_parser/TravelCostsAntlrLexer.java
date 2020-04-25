// Generated from /Users/hhk/Documents/GitHub/Code/SLE/Exercise_2/travelcosts-lang/target/generated-sources/monticore/sourcecode/travelcosts/_parser/TravelCostsAntlr.g4 by ANTLR 4.7.1

package travelcosts._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TravelCostsAntlrLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "RPAREN", "COLON", "LCURLY", "MINUS", "RCURLY", "POINT", 
		"Name", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "Digits", "Digit", 
		"Char", "SingleCharacter", "String", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "HexDigit", 
		"OctalDigit"
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





	private TravelCostsAntlrParser _monticore_parser;

	protected TravelCostsAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(TravelCostsAntlrParser in) {
	  this._monticore_parser = in;
	}

	protected void storeComment(){
	  if (getCompiler() != null) {
	    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
	    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
	    _comment.set_SourcePositionStart(startPos);
	    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
	    getCompiler().addComment(_comment);
	  }
	}


	public TravelCostsAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TravelCostsAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			_channel=HIDDEN;


			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			storeComment();


			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			storeComment();


			break;
		}
	}
	private void Char_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return ML_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ML_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(2) != '/';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u015a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\7\33\u00ed\n\33\f\33\16\33\u00f0\13\33\3\34"+
		"\3\34\3\34\5\34\u00f5\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00fe"+
		"\n\36\f\36\16\36\u0101\13\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u010e\n\37\f\37\16\37\u0111\13\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \6 \u011b\n \r \16 \u011c\3!\3!\3\"\3\"\3\"\5\"\u0124"+
		"\n\"\3\"\3\"\3\"\3#\3#\3$\3$\5$\u012d\n$\3$\3$\3$\3%\6%\u0133\n%\r%\16"+
		"%\u0134\3&\3&\5&\u0139\n&\3\'\3\'\3\'\3\'\5\'\u013f\n\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u014c\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3"+
		",\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\29"+
		"\35;\36=\37? A\2C!E\2G\"I\2K\2M\2O\2Q\2S\2U\2W\2\3\2\13\6\2&&C\\aac|\7"+
		"\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17\17,,\3\2)"+
		")\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\2\u015d\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2"+
		"\2\2\2G\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13u\3\2\2"+
		"\2\r\u0081\3\2\2\2\17\u0089\3\2\2\2\21\u0094\3\2\2\2\23\u00a0\3\2\2\2"+
		"\25\u00a8\3\2\2\2\27\u00af\3\2\2\2\31\u00b1\3\2\2\2\33\u00b3\3\2\2\2\35"+
		"\u00b9\3\2\2\2\37\u00bf\3\2\2\2!\u00cb\3\2\2\2#\u00cf\3\2\2\2%\u00d4\3"+
		"\2\2\2\'\u00d9\3\2\2\2)\u00de\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2/\u00e4"+
		"\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00f4\3"+
		"\2\2\29\u00f6\3\2\2\2;\u00f9\3\2\2\2=\u0106\3\2\2\2?\u011a\3\2\2\2A\u011e"+
		"\3\2\2\2C\u0120\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0138\3\2\2\2M\u013e\3\2\2\2O\u014b\3\2\2\2Q\u014d\3\2\2\2S\u0154\3\2"+
		"\2\2U\u0156\3\2\2\2W\u0158\3\2\2\2YZ\7p\2\2Z[\7w\2\2[\\\7n\2\2\\]\7n\2"+
		"\2]\4\3\2\2\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ab\7g\2\2b\6\3\2\2\2cd\7h\2\2"+
		"de\7c\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h\b\3\2\2\2ij\7F\2\2jk\7k\2\2kl\7"+
		"g\2\2lm\7p\2\2mn\7u\2\2no\7v\2\2op\7t\2\2pq\7g\2\2qr\7k\2\2rs\7u\2\2s"+
		"t\7g\2\2t\n\3\2\2\2uv\7T\2\2vw\7g\2\2wx\7k\2\2xy\7u\2\2yz\7g\2\2z{\7p"+
		"\2\2{|\7w\2\2|}\7o\2\2}~\7o\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\f\3"+
		"\2\2\2\u0081\u0082\7C\2\2\u0082\u0083\7p\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7k\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2"+
		"\u0088\16\3\2\2\2\u0089\u008a\7C\2\2\u008a\u008b\7t\2\2\u008b\u008c\7"+
		"d\2\2\u008c\u008d\7g\2\2\u008d\u008e\7k\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7c\2\2\u0092\u0093\7i\2\2\u0093"+
		"\20\3\2\2\2\u0094\u0095\7C\2\2\u0095\u0096\7t\2\2\u0096\u0097\7d\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7k\2\2\u0099\u009a\7v\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009c\7v\2\2\u009c\u009d\7c\2\2\u009d\u009e\7i\2\2\u009e\u009f"+
		"\7g\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7C\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7M\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\26\3\2\2\2\u00af\u00b0\7\u20ae\2\2\u00b0\30\3\2\2\2\u00b1\u00b2"+
		"\7&\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7J\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\34\3\2\2\2\u00b9\u00ba"+
		"\7H\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7d\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7m\2\2"+
		"\u00c5\u00c6\7q\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7p\2\2\u00ca \3\2\2\2\u00cb\u00cc\7\\\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7i\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7H\2\2\u00d0\u00d1"+
		"\7n\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7i\2\2\u00d3$\3\2\2\2\u00d4\u00d5"+
		"\7\u00d8\2\2\u00d5\u00d6\7R\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7X\2\2"+
		"\u00d8&\3\2\2\2\u00d9\u00da\7V\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7z\2"+
		"\2\u00dc\u00dd\7k\2\2\u00dd(\3\2\2\2\u00de\u00df\7+\2\2\u00df*\3\2\2\2"+
		"\u00e0\u00e1\7<\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3.\3\2\2\2\u00e4"+
		"\u00e5\7/\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\7\177\2\2\u00e7\62\3\2\2\2"+
		"\u00e8\u00e9\7\60\2\2\u00e9\64\3\2\2\2\u00ea\u00ee\t\2\2\2\u00eb\u00ed"+
		"\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\66\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\17\2"+
		"\2\u00f2\u00f5\7\f\2\2\u00f3\u00f5\t\4\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f58\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\b\35\2\2\u00f8"+
		":\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00ff\3\2\2"+
		"\2\u00fc\u00fe\n\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\b\36\3\2\u0103\u0104\3\2\2\2\u0104\u0105\b\36\4\2\u0105<\3\2\2"+
		"\2\u0106\u0107\7\61\2\2\u0107\u0108\7,\2\2\u0108\u010f\3\2\2\2\u0109\u010a"+
		"\6\37\2\2\u010a\u010e\7,\2\2\u010b\u010e\5\67\34\2\u010c\u010e\n\6\2\2"+
		"\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7\61\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\b\37\5\2\u0116\u0117\3\2\2\2\u0117\u0118\b\37\4\2\u0118"+
		">\3\2\2\2\u0119\u011b\5A!\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d@\3\2\2\2\u011e\u011f\4\62;\2"+
		"\u011fB\3\2\2\2\u0120\u0123\7)\2\2\u0121\u0124\5E#\2\u0122\u0124\5M\'"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\7)\2\2\u0126\u0127\b\"\6\2\u0127D\3\2\2\2\u0128\u0129\n\7\2\2\u0129F"+
		"\3\2\2\2\u012a\u012c\7$\2\2\u012b\u012d\5I%\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7$\2\2\u012f\u0130\b$\7"+
		"\2\u0130H\3\2\2\2\u0131\u0133\5K&\2\u0132\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135J\3\2\2\2\u0136\u0139"+
		"\n\b\2\2\u0137\u0139\5M\'\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"L\3\2\2\2\u013a\u013b\7^\2\2\u013b\u013f\t\t\2\2\u013c\u013f\5O(\2\u013d"+
		"\u013f\5Q)\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2"+
		"\2\u013fN\3\2\2\2\u0140\u0141\7^\2\2\u0141\u014c\5W,\2\u0142\u0143\7^"+
		"\2\2\u0143\u0144\5W,\2\u0144\u0145\5W,\2\u0145\u014c\3\2\2\2\u0146\u0147"+
		"\7^\2\2\u0147\u0148\5S*\2\u0148\u0149\5W,\2\u0149\u014a\5W,\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0142\3\2\2\2\u014b\u0146\3\2\2\2\u014c"+
		"P\3\2\2\2\u014d\u014e\7^\2\2\u014e\u014f\7w\2\2\u014f\u0150\5U+\2\u0150"+
		"\u0151\5U+\2\u0151\u0152\5U+\2\u0152\u0153\5U+\2\u0153R\3\2\2\2\u0154"+
		"\u0155\4\62\65\2\u0155T\3\2\2\2\u0156\u0157\t\n\2\2\u0157V\3\2\2\2\u0158"+
		"\u0159\4\629\2\u0159X\3\2\2\2\17\2\u00ee\u00f4\u00ff\u010d\u010f\u011c"+
		"\u0123\u012c\u0134\u0138\u013e\u014b\b\3\35\2\3\36\3\b\2\2\3\37\4\3\""+
		"\5\3$\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}