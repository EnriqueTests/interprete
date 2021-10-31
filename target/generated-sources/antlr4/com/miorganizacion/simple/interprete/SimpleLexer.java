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
		ASSEMBLY=8, NONE=9, LOCATION=10, DEVICE=11, G16V8=12, PIN=13, CONSTANTE_BINARIA_0_MAYUSCULA=14, 
		CONSTANTE_BINARIA_1_MAYUSCULA=15, CONSTANTE_BINARIA_2_MINUSCULA=16, CONSTANTE_BINARIA_3_MINUSCULA=17, 
		NOT=18, OR=19, AND=20, ASIGNACION=21, PARENTESIS_ABIERTO=22, PARENTESIS_CERRADO=23, 
		CORCHETE_ABIERTO=24, CORCHETE_CERRADO=25, PUNTO_Y_COMA=26, INICIO_DE_COMENTARIO=27, 
		FIN_DE_COMENTARIO=28, ASTERISCO=29, BARRA_INVERTIDA=30, IDENTIFICADOR=31, 
		NUMERO=32, EB=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"PROGRAMA", "NAME", "PARTNO", "DATE", "REVISION", "DESIGNER", "COMPANY", 
		"ASSEMBLY", "NONE", "LOCATION", "DEVICE", "G16V8", "PIN", "CONSTANTE_BINARIA_0_MAYUSCULA", 
		"CONSTANTE_BINARIA_1_MAYUSCULA", "CONSTANTE_BINARIA_2_MINUSCULA", "CONSTANTE_BINARIA_3_MINUSCULA", 
		"NOT", "OR", "AND", "ASIGNACION", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"CORCHETE_ABIERTO", "CORCHETE_CERRADO", "PUNTO_Y_COMA", "INICIO_DE_COMENTARIO", 
		"FIN_DE_COMENTARIO", "ASTERISCO", "BARRA_INVERTIDA", "IDENTIFICADOR", 
		"NUMERO", "EB"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \7 \u00d4\n \f \16 \u00d7\13 \3!\6!\u00da\n!\r!\16!\u00db\3\""+
		"\6\"\u00df\n\"\r\"\16\"\u00e0\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\6\5\2C\\aac|"+
		"\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00e6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5N\3\2\2\2\7S\3\2\2\2\tZ\3\2\2"+
		"\2\13_\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21y\3\2\2\2\23\u0082\3\2\2\2\25"+
		"\u0087\3\2\2\2\27\u0090\3\2\2\2\31\u0097\3\2\2\2\33\u009d\3\2\2\2\35\u00a1"+
		"\3\2\2\2\37\u00a6\3\2\2\2!\u00ab\3\2\2\2#\u00b0\3\2\2\2%\u00b5\3\2\2\2"+
		"\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3\2\2\2-\u00bd\3\2\2\2/\u00bf\3"+
		"\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2"+
		"\2\29\u00ca\3\2\2\2;\u00cd\3\2\2\2=\u00cf\3\2\2\2?\u00d1\3\2\2\2A\u00d9"+
		"\3\2\2\2C\u00de\3\2\2\2EF\7R\2\2FG\7t\2\2GH\7q\2\2HI\7i\2\2IJ\7t\2\2J"+
		"K\7c\2\2KL\7o\2\2LM\7c\2\2M\4\3\2\2\2NO\7P\2\2OP\7c\2\2PQ\7o\2\2QR\7g"+
		"\2\2R\6\3\2\2\2ST\7R\2\2TU\7c\2\2UV\7t\2\2VW\7v\2\2WX\7P\2\2XY\7q\2\2"+
		"Y\b\3\2\2\2Z[\7F\2\2[\\\7c\2\2\\]\7v\2\2]^\7g\2\2^\n\3\2\2\2_`\7T\2\2"+
		"`a\7g\2\2ab\7x\2\2bc\7k\2\2cd\7u\2\2de\7k\2\2ef\7q\2\2fg\7p\2\2g\f\3\2"+
		"\2\2hi\7F\2\2ij\7g\2\2jk\7u\2\2kl\7k\2\2lm\7i\2\2mn\7p\2\2no\7g\2\2op"+
		"\7t\2\2p\16\3\2\2\2qr\7E\2\2rs\7q\2\2st\7o\2\2tu\7r\2\2uv\7c\2\2vw\7p"+
		"\2\2wx\7{\2\2x\20\3\2\2\2yz\7C\2\2z{\7u\2\2{|\7u\2\2|}\7g\2\2}~\7o\2\2"+
		"~\177\7d\2\2\177\u0080\7n\2\2\u0080\u0081\7{\2\2\u0081\22\3\2\2\2\u0082"+
		"\u0083\7P\2\2\u0083\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085\u0086\7g\2\2"+
		"\u0086\24\3\2\2\2\u0087\u0088\7N\2\2\u0088\u0089\7q\2\2\u0089\u008a\7"+
		"e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7p\2\2\u008f\26\3\2\2\2\u0090\u0091\7F\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7x\2\2\u0093\u0094\7k\2\2\u0094\u0095\7e\2\2\u0095"+
		"\u0096\7g\2\2\u0096\30\3\2\2\2\u0097\u0098\7i\2\2\u0098\u0099\7\63\2\2"+
		"\u0099\u009a\78\2\2\u009a\u009b\7x\2\2\u009b\u009c\7:\2\2\u009c\32\3\2"+
		"\2\2\u009d\u009e\7R\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7P\2\2\u00a0\34"+
		"\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\7D\2\2\u00a3\u00a4\7)\2\2\u00a4"+
		"\u00a5\7\62\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7D\2\2"+
		"\u00a8\u00a9\7)\2\2\u00a9\u00aa\7\63\2\2\u00aa \3\2\2\2\u00ab\u00ac\7"+
		")\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7)\2\2\u00ae\u00af\7\62\2\2\u00af"+
		"\"\3\2\2\2\u00b0\u00b1\7)\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7)\2\2\u00b3"+
		"\u00b4\7\63\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6&\3\2\2\2\u00b7"+
		"\u00b8\7%\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba*\3\2\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc,\3\2\2\2\u00bd\u00be\7*\2\2\u00be.\3\2\2\2\u00bf\u00c0\7"+
		"+\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7}\2\2\u00c2\62\3\2\2\2\u00c3\u00c4"+
		"\7\177\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6\66\3\2\2\2\u00c7"+
		"\u00c8\7\61\2\2\u00c8\u00c9\7,\2\2\u00c98\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb"+
		"\u00cc\7\61\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce<\3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0>\3\2\2\2\u00d1\u00d5\t\2\2\2\u00d2\u00d4\t\3\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6@\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\t\4\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dcB\3\2\2\2\u00dd\u00df\t\5\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\b\"\2\2\u00e3D\3\2\2\2\6\2\u00d5\u00db\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}