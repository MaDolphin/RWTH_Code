// Generated from /Users/hhk/Documents/GitHub/SLE/Exercise_4/guitartabs/target/generated-sources/monticore/sourcecode/guitartab/_parser/GuitarTabAntlr.g4 by ANTLR 4.7.1

package guitartab._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GuitarTabAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, LBRACK=8, PIPE=9, 
		RBRACK=10, MINUS=11, Digit=12, Linebreak=13, Name=14, WS=15, SL_COMMENT=16, 
		ML_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "LBRACK", "PIPE", 
		"RBRACK", "MINUS", "Digit", "Linebreak", "Name", "NEWLINE", "WS", "SL_COMMENT", 
		"ML_COMMENT"
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





	private GuitarTabAntlrParser _monticore_parser;

	protected GuitarTabAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(GuitarTabAntlrParser in) {
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


	public GuitarTabAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GuitarTabAntlr.g4"; }

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
		case 15:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17D\n\17"+
		"\f\17\16\17G\13\17\3\20\3\20\3\20\5\20L\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22U\n\22\f\22\16\22X\13\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23e\n\23\f\23\16\23h\13\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\2!\21#\22%\23\3\2\7\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17\17,,\2t\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2"+
		"\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3"+
		"\2\2\2\21\65\3\2\2\2\23\67\3\2\2\2\259\3\2\2\2\27;\3\2\2\2\31=\3\2\2\2"+
		"\33?\3\2\2\2\35A\3\2\2\2\37K\3\2\2\2!M\3\2\2\2#P\3\2\2\2%]\3\2\2\2\'("+
		"\7g\2\2(\4\3\2\2\2)*\7D\2\2*\6\3\2\2\2+,\7I\2\2,\b\3\2\2\2-.\7F\2\2.\n"+
		"\3\2\2\2/\60\7C\2\2\60\f\3\2\2\2\61\62\7G\2\2\62\16\3\2\2\2\63\64\7N\2"+
		"\2\64\20\3\2\2\2\65\66\7]\2\2\66\22\3\2\2\2\678\7~\2\28\24\3\2\2\29:\7"+
		"_\2\2:\26\3\2\2\2;<\7/\2\2<\30\3\2\2\2=>\4\62;\2>\32\3\2\2\2?@\5\37\20"+
		"\2@\34\3\2\2\2AE\t\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\36\3\2\2\2GE\3\2\2\2HI\7\17\2\2IL\7\f\2\2JL\t\4\2\2KH\3\2\2\2KJ"+
		"\3\2\2\2L \3\2\2\2MN\t\5\2\2NO\b\21\2\2O\"\3\2\2\2PQ\7\61\2\2QR\7\61\2"+
		"\2RV\3\2\2\2SU\n\4\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XV\3\2\2\2YZ\b\22\3\2Z[\3\2\2\2[\\\b\22\4\2\\$\3\2\2\2]^\7\61\2\2^_"+
		"\7,\2\2_f\3\2\2\2`a\6\23\2\2ae\7,\2\2be\5\37\20\2ce\n\6\2\2d`\3\2\2\2"+
		"db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\7,\2\2jk\7\61\2\2kl\3\2\2\2lm\b\23\5\2mn\3\2\2\2no\b\23\4\2o&\3\2\2"+
		"\2\b\2EKVdf\6\3\21\2\3\22\3\b\2\2\3\23\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}