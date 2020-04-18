// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/calendars/_parser/CalendarsAntlr.g4 by ANTLR 4.7.1

package calendars._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalendarsAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MINUS=5, POINT=6, Name=7, WS=8, SL_COMMENT=9, 
		ML_COMMENT=10, Digits=11, Char=12, String=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "MINUS", "POINT", "Name", "NEWLINE", "WS", 
		"SL_COMMENT", "ML_COMMENT", "Digits", "Digit", "Char", "SingleCharacter", 
		"String", "StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "ZeroToThree", "HexDigit", "OctalDigit"
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





	private CalendarsAntlrParser _monticore_parser;

	protected CalendarsAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(CalendarsAntlrParser in) {
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


	public CalendarsAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalendarsAntlr.g4"; }

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
		case 8:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\6\r\u0085\n\r\r\r\16\r\u0086\3\16\3\16\3\17\3\17\3\17\5\17\u008e"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u0097\n\21\3\21\3\21\3\21"+
		"\3\22\6\22\u009d\n\22\r\22\16\22\u009e\3\23\3\23\5\23\u00a3\n\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00a9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00b6\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23"+
		"\n\25\13\27\f\31\r\33\2\35\16\37\2!\17#\2%\2\'\2)\2+\2-\2/\2\61\2\3\2"+
		"\13\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2"+
		"\f\f\17\17,,\3\2))\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\2\u00c7\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35"+
		"\3\2\2\2\2!\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13P"+
		"\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27"+
		"p\3\2\2\2\31\u0084\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u0092"+
		"\3\2\2\2!\u0094\3\2\2\2#\u009c\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3\2\2\2"+
		")\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2"+
		"\3\2\2\2\63\64\7p\2\2\64\65\7w\2\2\65\66\7n\2\2\66\67\7n\2\2\67\4\3\2"+
		"\2\289\7v\2\29:\7t\2\2:;\7w\2\2;<\7g\2\2<\6\3\2\2\2=>\7h\2\2>?\7c\2\2"+
		"?@\7n\2\2@A\7u\2\2AB\7g\2\2B\b\3\2\2\2CD\7b\2\2DE\7u\2\2EF\7\"\2\2FG\7"+
		"e\2\2GH\7c\2\2HI\7n\2\2IJ\7g\2\2JK\7p\2\2KL\7f\2\2LM\7c\2\2MN\7t\2\2N"+
		"O\7<\2\2O\n\3\2\2\2PQ\7/\2\2Q\f\3\2\2\2RS\7\60\2\2S\16\3\2\2\2TX\t\2\2"+
		"\2UW\t\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\20\3\2\2\2ZX\3\2"+
		"\2\2[\\\7\17\2\2\\_\7\f\2\2]_\t\4\2\2^[\3\2\2\2^]\3\2\2\2_\22\3\2\2\2"+
		"`a\t\5\2\2ab\b\n\2\2b\24\3\2\2\2cd\7\61\2\2de\7\61\2\2ei\3\2\2\2fh\n\4"+
		"\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\b\13"+
		"\3\2mn\3\2\2\2no\b\13\4\2o\26\3\2\2\2pq\7\61\2\2qr\7,\2\2ry\3\2\2\2st"+
		"\6\f\2\2tx\7,\2\2ux\5\21\t\2vx\n\6\2\2ws\3\2\2\2wu\3\2\2\2wv\3\2\2\2x"+
		"{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2"+
		"~\177\3\2\2\2\177\u0080\b\f\5\2\u0080\u0081\3\2\2\2\u0081\u0082\b\f\4"+
		"\2\u0082\30\3\2\2\2\u0083\u0085\5\33\16\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\32\3\2\2\2\u0088"+
		"\u0089\4\62;\2\u0089\34\3\2\2\2\u008a\u008d\7)\2\2\u008b\u008e\5\37\20"+
		"\2\u008c\u008e\5\'\24\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7)\2\2\u0090\u0091\b\17\6\2\u0091\36\3\2\2"+
		"\2\u0092\u0093\n\7\2\2\u0093 \3\2\2\2\u0094\u0096\7$\2\2\u0095\u0097\5"+
		"#\22\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7$\2\2\u0099\u009a\b\21\7\2\u009a\"\3\2\2\2\u009b\u009d\5%\23\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f$\3\2\2\2\u00a0\u00a3\n\b\2\2\u00a1\u00a3\5\'\24\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7^\2\2\u00a5"+
		"\u00a9\t\t\2\2\u00a6\u00a9\5)\25\2\u00a7\u00a9\5+\26\2\u00a8\u00a4\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9(\3\2\2\2\u00aa\u00ab"+
		"\7^\2\2\u00ab\u00b6\5\61\31\2\u00ac\u00ad\7^\2\2\u00ad\u00ae\5\61\31\2"+
		"\u00ae\u00af\5\61\31\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\7^\2\2\u00b1\u00b2"+
		"\5-\27\2\u00b2\u00b3\5\61\31\2\u00b3\u00b4\5\61\31\2\u00b4\u00b6\3\2\2"+
		"\2\u00b5\u00aa\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6*"+
		"\3\2\2\2\u00b7\u00b8\7^\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\5/\30\2\u00ba"+
		"\u00bb\5/\30\2\u00bb\u00bc\5/\30\2\u00bc\u00bd\5/\30\2\u00bd,\3\2\2\2"+
		"\u00be\u00bf\4\62\65\2\u00bf.\3\2\2\2\u00c0\u00c1\t\n\2\2\u00c1\60\3\2"+
		"\2\2\u00c2\u00c3\4\629\2\u00c3\62\3\2\2\2\17\2X^iwy\u0086\u008d\u0096"+
		"\u009e\u00a2\u00a8\u00b5\b\3\n\2\3\13\3\b\2\2\3\f\4\3\17\5\3\21\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}