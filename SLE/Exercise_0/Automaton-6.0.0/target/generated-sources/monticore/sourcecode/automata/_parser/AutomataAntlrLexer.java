// Generated from /Users/hhk/Downloads/Automaton-6.0.0/target/generated-sources/monticore/sourcecode/automata/_parser/AutomataAntlr.g4 by ANTLR 4.7.1

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
		T__0=1, T__1=2, T__2=3, T__3=4, LTLT=5, GTGT=6, LCURLY=7, SEMI=8, RCURLY=9, 
		MINUS=10, GT=11, Name=12, WS=13, SL_COMMENT=14, ML_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LTLT", "GTGT", "LCURLY", "SEMI", "RCURLY", 
		"MINUS", "GT", "Name", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'aut'", "'state'", "'initial'", "'final'", "'<<'", "'>>'", "'{'", 
		"';'", "'}'", "'-'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LTLT", "GTGT", "LCURLY", "SEMI", "RCURLY", 
		"MINUS", "GT", "Name", "WS", "SL_COMMENT", "ML_COMMENT"
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
		case 13:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\7\rN\n\r\f\r\16\rQ\13\r\3\16\3\16\3\16\5\16V\n\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20_\n\20\f\20\16\20b\13\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21o\n\21\f\21\16"+
		"\21r\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20!\21\3\2\7\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17"+
		"\17,,\2~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5\'\3\2\2\2\7-\3\2\2\2\t\65\3\2\2\2\13;\3\2\2\2\r>\3\2\2\2\17A\3\2\2"+
		"\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33U\3\2"+
		"\2\2\35W\3\2\2\2\37Z\3\2\2\2!g\3\2\2\2#$\7c\2\2$%\7w\2\2%&\7v\2\2&\4\3"+
		"\2\2\2\'(\7u\2\2()\7v\2\2)*\7c\2\2*+\7v\2\2+,\7g\2\2,\6\3\2\2\2-.\7k\2"+
		"\2./\7p\2\2/\60\7k\2\2\60\61\7v\2\2\61\62\7k\2\2\62\63\7c\2\2\63\64\7"+
		"n\2\2\64\b\3\2\2\2\65\66\7h\2\2\66\67\7k\2\2\678\7p\2\289\7c\2\29:\7n"+
		"\2\2:\n\3\2\2\2;<\7>\2\2<=\7>\2\2=\f\3\2\2\2>?\7@\2\2?@\7@\2\2@\16\3\2"+
		"\2\2AB\7}\2\2B\20\3\2\2\2CD\7=\2\2D\22\3\2\2\2EF\7\177\2\2F\24\3\2\2\2"+
		"GH\7/\2\2H\26\3\2\2\2IJ\7@\2\2J\30\3\2\2\2KO\t\2\2\2LN\t\3\2\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\32\3\2\2\2QO\3\2\2\2RS\7\17\2\2SV\7"+
		"\f\2\2TV\t\4\2\2UR\3\2\2\2UT\3\2\2\2V\34\3\2\2\2WX\t\5\2\2XY\b\17\2\2"+
		"Y\36\3\2\2\2Z[\7\61\2\2[\\\7\61\2\2\\`\3\2\2\2]_\n\4\2\2^]\3\2\2\2_b\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\b\20\3\2de\3\2\2\2ef"+
		"\b\20\4\2f \3\2\2\2gh\7\61\2\2hi\7,\2\2ip\3\2\2\2jk\6\21\2\2ko\7,\2\2"+
		"lo\5\33\16\2mo\n\6\2\2nj\3\2\2\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7,\2\2tu\7\61\2\2uv\3\2\2\2vw\b\21"+
		"\5\2wx\3\2\2\2xy\b\21\4\2y\"\3\2\2\2\b\2OU`np\6\3\17\2\3\20\3\b\2\2\3"+
		"\21\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}