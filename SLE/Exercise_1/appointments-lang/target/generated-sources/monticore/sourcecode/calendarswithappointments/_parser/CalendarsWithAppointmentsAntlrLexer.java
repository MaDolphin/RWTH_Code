// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/calendarswithappointments/_parser/CalendarsWithAppointmentsAntlr.g4 by ANTLR 4.7.1

package calendarswithappointments._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalendarsWithAppointmentsAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, COLON=15, LCURLY=16, 
		MINUS=17, RCURLY=18, POINT=19, SLASH=20, Name=21, WS=22, SL_COMMENT=23, 
		ML_COMMENT=24, Digits=25, Char=26, String=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "COLON", "LCURLY", "MINUS", 
		"RCURLY", "POINT", "SLASH", "Name", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", 
		"Digits", "Digit", "Char", "SingleCharacter", "String", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"HexDigit", "OctalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'appointment'", "'participants:'", 
		"', '", "'once'", "'daily'", "'weekly'", "'monthly'", "'start'", "'end'", 
		"'break'", "'`s calendar:'", "':'", "'{'", "'-'", "'}'", "'.'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COLON", "LCURLY", "MINUS", "RCURLY", "POINT", "SLASH", 
		"Name", "WS", "SL_COMMENT", "ML_COMMENT", "Digits", "Char", "String"
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





	private CalendarsWithAppointmentsAntlrParser _monticore_parser;

	protected CalendarsWithAppointmentsAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(CalendarsWithAppointmentsAntlrParser in) {
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


	public CalendarsWithAppointmentsAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalendarsWithAppointmentsAntlr.g4"; }

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
		case 22:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
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
		case 24:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00c2\n\26"+
		"\f\26\16\26\u00c5\13\26\3\27\3\27\3\27\5\27\u00ca\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00d3\n\31\f\31\16\31\u00d6\13\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00e3\n\32\f\32\16"+
		"\32\u00e6\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00f0\n\33"+
		"\r\33\16\33\u00f1\3\34\3\34\3\35\3\35\3\35\5\35\u00f9\n\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\5\37\u0102\n\37\3\37\3\37\3\37\3 \6 \u0108\n "+
		"\r \16 \u0109\3!\3!\5!\u010e\n!\3\"\3\"\3\"\3\"\5\"\u0114\n\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0121\n#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\31\63\32\65\33\67"+
		"\29\34;\2=\35?\2A\2C\2E\2G\2I\2K\2M\2\3\2\13\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17\17,,\3\2))\4\2$$^^\n"+
		"\2$$))^^ddhhppttvv\5\2\62;CHch\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"9\3\2\2\2\2=\3\2\2\2\3O\3\2\2\2\5T\3\2\2\2\7Y\3\2\2\2\t_\3\2\2\2\13k\3"+
		"\2\2\2\ry\3\2\2\2\17|\3\2\2\2\21\u0081\3\2\2\2\23\u0087\3\2\2\2\25\u008e"+
		"\3\2\2\2\27\u0096\3\2\2\2\31\u009c\3\2\2\2\33\u00a0\3\2\2\2\35\u00a6\3"+
		"\2\2\2\37\u00b3\3\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'"+
		"\u00bb\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2"+
		"\2\2\61\u00ce\3\2\2\2\63\u00db\3\2\2\2\65\u00ef\3\2\2\2\67\u00f3\3\2\2"+
		"\29\u00f5\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2?\u0107\3\2\2\2A\u010d"+
		"\3\2\2\2C\u0113\3\2\2\2E\u0120\3\2\2\2G\u0122\3\2\2\2I\u0129\3\2\2\2K"+
		"\u012b\3\2\2\2M\u012d\3\2\2\2OP\7p\2\2PQ\7w\2\2QR\7n\2\2RS\7n\2\2S\4\3"+
		"\2\2\2TU\7v\2\2UV\7t\2\2VW\7w\2\2WX\7g\2\2X\6\3\2\2\2YZ\7h\2\2Z[\7c\2"+
		"\2[\\\7n\2\2\\]\7u\2\2]^\7g\2\2^\b\3\2\2\2_`\7c\2\2`a\7r\2\2ab\7r\2\2"+
		"bc\7q\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2fg\7o\2\2gh\7g\2\2hi\7p\2\2ij\7v\2"+
		"\2j\n\3\2\2\2kl\7r\2\2lm\7c\2\2mn\7t\2\2no\7v\2\2op\7k\2\2pq\7e\2\2qr"+
		"\7k\2\2rs\7r\2\2st\7c\2\2tu\7p\2\2uv\7v\2\2vw\7u\2\2wx\7<\2\2x\f\3\2\2"+
		"\2yz\7.\2\2z{\7\"\2\2{\16\3\2\2\2|}\7q\2\2}~\7p\2\2~\177\7e\2\2\177\u0080"+
		"\7g\2\2\u0080\20\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7n\2\2\u0085\u0086\7{\2\2\u0086\22\3\2\2\2\u0087\u0088"+
		"\7y\2\2\u0088\u0089\7g\2\2\u0089\u008a\7g\2\2\u008a\u008b\7m\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7{\2\2\u008d\24\3\2\2\2\u008e\u008f\7o\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7j\2\2"+
		"\u0093\u0094\7n\2\2\u0094\u0095\7{\2\2\u0095\26\3\2\2\2\u0096\u0097\7"+
		"u\2\2\u0097\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7v\2\2\u009b\30\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7f\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7m\2\2\u00a5\34\3\2\2\2\u00a6\u00a7"+
		"\7b\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7f\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4 \3\2\2\2\u00b5\u00b6"+
		"\7}\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8$\3\2\2\2\u00b9\u00ba"+
		"\7\177\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7\61\2\2\u00be*\3\2\2\2\u00bf\u00c3\t\2\2\2\u00c0\u00c2\t\3\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4,\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00ca"+
		"\7\f\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		".\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\u00cd\b\30\2\2\u00cd\60\3\2\2\2\u00ce"+
		"\u00cf\7\61\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\n"+
		"\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\b\31"+
		"\3\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\31\4\2\u00da\62\3\2\2\2\u00db\u00dc"+
		"\7\61\2\2\u00dc\u00dd\7,\2\2\u00dd\u00e4\3\2\2\2\u00de\u00df\6\32\2\2"+
		"\u00df\u00e3\7,\2\2\u00e0\u00e3\5-\27\2\u00e1\u00e3\n\6\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b\32\5\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\32\4\2\u00ed\64\3\2"+
		"\2\2\u00ee\u00f0\5\67\34\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\4\62;"+
		"\2\u00f48\3\2\2\2\u00f5\u00f8\7)\2\2\u00f6\u00f9\5;\36\2\u00f7\u00f9\5"+
		"C\"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\7)\2\2\u00fb\u00fc\b\35\6\2\u00fc:\3\2\2\2\u00fd\u00fe\n\7\2\2"+
		"\u00fe<\3\2\2\2\u00ff\u0101\7$\2\2\u0100\u0102\5? \2\u0101\u0100\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7$\2\2\u0104\u0105"+
		"\b\37\7\2\u0105>\3\2\2\2\u0106\u0108\5A!\2\u0107\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a@\3\2\2\2\u010b"+
		"\u010e\n\b\2\2\u010c\u010e\5C\"\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010eB\3\2\2\2\u010f\u0110\7^\2\2\u0110\u0114\t\t\2\2\u0111\u0114"+
		"\5E#\2\u0112\u0114\5G$\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114D\3\2\2\2\u0115\u0116\7^\2\2\u0116\u0121\5M\'\2\u0117"+
		"\u0118\7^\2\2\u0118\u0119\5M\'\2\u0119\u011a\5M\'\2\u011a\u0121\3\2\2"+
		"\2\u011b\u011c\7^\2\2\u011c\u011d\5I%\2\u011d\u011e\5M\'\2\u011e\u011f"+
		"\5M\'\2\u011f\u0121\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0117\3\2\2\2\u0120"+
		"\u011b\3\2\2\2\u0121F\3\2\2\2\u0122\u0123\7^\2\2\u0123\u0124\7w\2\2\u0124"+
		"\u0125\5K&\2\u0125\u0126\5K&\2\u0126\u0127\5K&\2\u0127\u0128\5K&\2\u0128"+
		"H\3\2\2\2\u0129\u012a\4\62\65\2\u012aJ\3\2\2\2\u012b\u012c\t\n\2\2\u012c"+
		"L\3\2\2\2\u012d\u012e\4\629\2\u012eN\3\2\2\2\17\2\u00c3\u00c9\u00d4\u00e2"+
		"\u00e4\u00f1\u00f8\u0101\u0109\u010d\u0113\u0120\b\3\30\2\3\31\3\b\2\2"+
		"\3\32\4\3\35\5\3\37\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}