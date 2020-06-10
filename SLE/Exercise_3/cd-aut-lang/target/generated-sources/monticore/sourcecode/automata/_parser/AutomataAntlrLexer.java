// Generated from /Users/hhk/Documents/GitHub/SLE/Exercise_3/cd-aut-lang/target/generated-sources/monticore/sourcecode/automata/_parser/AutomataAntlr.g4 by ANTLR 4.7.1

package automata._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutomataAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LTLT=15, GTGT=16, STAR=17, 
		SEMI=18, LCURLY=19, RCURLY=20, MINUS=21, POINT=22, GT=23, Name=24, WS=25, 
		SL_COMMENT=26, ML_COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "LTLT", "GTGT", "STAR", "SEMI", 
		"LCURLY", "RCURLY", "MINUS", "POINT", "GT", "Name", "NEWLINE", "WS", "SL_COMMENT", 
		"ML_COMMENT"
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





	private AutomataAntlrParser _monticore_parser;

	protected AutomataAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(AutomataAntlrParser in) {
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


	public AutomataAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AutomataAntlr.g4"; }

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
		case 25:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
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
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u00a9\n\31\f\31\16\31\u00ac\13"+
		"\31\3\32\3\32\3\32\5\32\u00b1\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\7\34\u00ba\n\34\f\34\16\34\u00bd\13\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u00ca\n\35\f\35\16\35\u00cd\13\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\2\65\33\67\349\35\3\2\7\6\2&&C\\aac|\7\2&&\62;C\\aac|\4"+
		"\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17\17,,\2\u00d9\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5B\3\2\2\2\7J\3\2\2\2"+
		"\tO\3\2\2\2\13U\3\2\2\2\rY\3\2\2\2\17^\3\2\2\2\21c\3\2\2\2\23i\3\2\2\2"+
		"\25p\3\2\2\2\27u\3\2\2\2\31~\3\2\2\2\33\u0084\3\2\2\2\35\u008c\3\2\2\2"+
		"\37\u0092\3\2\2\2!\u0095\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c"+
		"\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b5\3\2\2\29\u00c2"+
		"\3\2\2\2;<\7k\2\2<=\7o\2\2=>\7r\2\2>?\7q\2\2?@\7t\2\2@A\7v\2\2A\4\3\2"+
		"\2\2BC\7d\2\2CD\7q\2\2DE\7q\2\2EF\7n\2\2FG\7g\2\2GH\7c\2\2HI\7p\2\2I\6"+
		"\3\2\2\2JK\7d\2\2KL\7{\2\2LM\7v\2\2MN\7g\2\2N\b\3\2\2\2OP\7u\2\2PQ\7j"+
		"\2\2QR\7q\2\2RS\7t\2\2ST\7v\2\2T\n\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2"+
		"X\f\3\2\2\2YZ\7n\2\2Z[\7q\2\2[\\\7p\2\2\\]\7i\2\2]\16\3\2\2\2^_\7e\2\2"+
		"_`\7j\2\2`a\7c\2\2ab\7t\2\2b\20\3\2\2\2cd\7h\2\2de\7n\2\2ef\7q\2\2fg\7"+
		"c\2\2gh\7v\2\2h\22\3\2\2\2ij\7f\2\2jk\7q\2\2kl\7w\2\2lm\7d\2\2mn\7n\2"+
		"\2no\7g\2\2o\24\3\2\2\2pq\7x\2\2qr\7q\2\2rs\7k\2\2st\7f\2\2t\26\3\2\2"+
		"\2uv\7c\2\2vw\7w\2\2wx\7v\2\2xy\7q\2\2yz\7o\2\2z{\7c\2\2{|\7v\2\2|}\7"+
		"c\2\2}\30\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\32\3\2\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7k\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b\34\3\2\2\2\u008c\u008d\7"+
		"h\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7n\2\2\u0091\36\3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7>\2\2\u0094 "+
		"\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7@\2\2\u0097\"\3\2\2\2\u0098\u0099"+
		"\7,\2\2\u0099$\3\2\2\2\u009a\u009b\7=\2\2\u009b&\3\2\2\2\u009c\u009d\7"+
		"}\2\2\u009d(\3\2\2\2\u009e\u009f\7\177\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7/\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3.\3\2\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5\60\3\2\2\2\u00a6\u00aa\t\2\2\2\u00a7\u00a9\t\3\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\62\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b1"+
		"\7\f\2\2\u00af\u00b1\t\4\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3\u00b4\b\33\2\2\u00b4\66\3\2\2\2"+
		"\u00b5\u00b6\7\61\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba"+
		"\n\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\34"+
		"\3\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\34\4\2\u00c18\3\2\2\2\u00c2\u00c3"+
		"\7\61\2\2\u00c3\u00c4\7,\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c6\6\35\2\2"+
		"\u00c6\u00ca\7,\2\2\u00c7\u00ca\5\63\32\2\u00c8\u00ca\n\6\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\35\5\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\35\4\2\u00d4:\3\2\2"+
		"\2\b\2\u00aa\u00b0\u00bb\u00c9\u00cb\6\3\33\2\3\34\3\b\2\2\3\35\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}