// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, NAME=2, PARTNO=3, DATE=4, REVISION=5, DESIGNER=6, COMPANY=7, 
		ASSEMBLY=8, NONE=9, LOCATION=10, DEVICE=11, G16V8=12, PIN=13, NOT=14, 
		OR=15, AND=16, ASIGNACION=17, PARENTESIS_ABIERTO=18, PARENTESIS_CERRADO=19, 
		CORCHETE_ABIERTO=20, CORCHETE_CERRADO=21, PUNTO_Y_COMA=22, INICIO_DE_COMENTARIO=23, 
		FIN_DE_COMENTARIO=24, ASTERISCO=25, BARRA_INVERTIDA=26, IDENTIFICADOR=27, 
		NUMERO=28, EB=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"PROGRAMA", "NAME", "PARTNO", "DATE", "REVISION", "DESIGNER", "COMPANY", 
		"ASSEMBLY", "NONE", "LOCATION", "DEVICE", "G16V8", "PIN", "NOT", "OR", 
		"AND", "ASIGNACION", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "CORCHETE_ABIERTO", 
		"CORCHETE_CERRADO", "PUNTO_Y_COMA", "INICIO_DE_COMENTARIO", "FIN_DE_COMENTARIO", 
		"ASTERISCO", "BARRA_INVERTIDA", "IDENTIFICADOR", "NUMERO", "EB"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\7\34\u00b8\n\34\f\34\16\34\u00bb\13\34\3"+
		"\35\6\35\u00be\n\35\r\35\16\35\u00bf\3\36\6\36\u00c3\n\36\r\36\16\36\u00c4"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tR\3\2\2\2\13W\3\2"+
		"\2\2\r`\3\2\2\2\17i\3\2\2\2\21q\3\2\2\2\23z\3\2\2\2\25\177\3\2\2\2\27"+
		"\u0088\3\2\2\2\31\u008f\3\2\2\2\33\u0095\3\2\2\2\35\u0099\3\2\2\2\37\u009b"+
		"\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2"+
		")\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ae"+
		"\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00bd\3\2"+
		"\2\2;\u00c2\3\2\2\2=>\7R\2\2>?\7t\2\2?@\7q\2\2@A\7i\2\2AB\7t\2\2BC\7c"+
		"\2\2CD\7o\2\2DE\7c\2\2E\4\3\2\2\2FG\7P\2\2GH\7c\2\2HI\7o\2\2IJ\7g\2\2"+
		"J\6\3\2\2\2KL\7R\2\2LM\7c\2\2MN\7t\2\2NO\7v\2\2OP\7P\2\2PQ\7q\2\2Q\b\3"+
		"\2\2\2RS\7F\2\2ST\7c\2\2TU\7v\2\2UV\7g\2\2V\n\3\2\2\2WX\7T\2\2XY\7g\2"+
		"\2YZ\7x\2\2Z[\7k\2\2[\\\7u\2\2\\]\7k\2\2]^\7q\2\2^_\7p\2\2_\f\3\2\2\2"+
		"`a\7F\2\2ab\7g\2\2bc\7u\2\2cd\7k\2\2de\7i\2\2ef\7p\2\2fg\7g\2\2gh\7t\2"+
		"\2h\16\3\2\2\2ij\7E\2\2jk\7q\2\2kl\7o\2\2lm\7r\2\2mn\7c\2\2no\7p\2\2o"+
		"p\7{\2\2p\20\3\2\2\2qr\7C\2\2rs\7u\2\2st\7u\2\2tu\7g\2\2uv\7o\2\2vw\7"+
		"d\2\2wx\7n\2\2xy\7{\2\2y\22\3\2\2\2z{\7P\2\2{|\7q\2\2|}\7p\2\2}~\7g\2"+
		"\2~\24\3\2\2\2\177\u0080\7N\2\2\u0080\u0081\7q\2\2\u0081\u0082\7e\2\2"+
		"\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7p\2\2\u0087\26\3\2\2\2\u0088\u0089\7F\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7x\2\2\u008b\u008c\7k\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7g\2\2\u008e\30\3\2\2\2\u008f\u0090\7i\2\2\u0090\u0091\7\63\2\2"+
		"\u0091\u0092\78\2\2\u0092\u0093\7x\2\2\u0093\u0094\7:\2\2\u0094\32\3\2"+
		"\2\2\u0095\u0096\7R\2\2\u0096\u0097\7K\2\2\u0097\u0098\7P\2\2\u0098\34"+
		"\3\2\2\2\u0099\u009a\7#\2\2\u009a\36\3\2\2\2\u009b\u009c\7%\2\2\u009c"+
		" \3\2\2\2\u009d\u009e\7(\2\2\u009e\"\3\2\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"$\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4("+
		"\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8"+
		",\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\u00ad\7,\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7\61\2\2"+
		"\u00b0\62\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7\61"+
		"\2\2\u00b4\66\3\2\2\2\u00b5\u00b9\t\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0:\3"+
		"\2\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\36"+
		"\2\2\u00c7<\3\2\2\2\6\2\u00b9\u00bf\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}