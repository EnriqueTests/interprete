// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Arrays;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'Programa'", "'Name'", "'PartNo'", "'Date'", "'Revision'", 
		"'Designer'", "'Company'", "'Assembly'", "'None'", "'Location'", "'Device'", 
		"'g16v8'", "'PIN'", "''B'0'", "''B'1'", "''b'0'", "''b'1'", "'!'", "'#'", 
		"'&'", "'='", "'('", "')'", "'{'", "'}'", "';'", "'/*'", "'*/'", "'*'", 
		"'/'", "IDENTIFICADOR", "NUMERO", "EB"
	};
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_declaracion_de_nombre = 2, 
		RULE_declaracion_de_numero_de_parte = 3, RULE_declaracion_de_fecha = 4, 
		RULE_declaracion_de_revision = 5, RULE_declaracion_de_disenador = 6, RULE_declaracion_de_compania = 7, 
		RULE_declaracion_de_assembly = 8, RULE_declaracion_de_location = 9, RULE_declaracion_de_dispositivo = 10, 
		RULE_declaracion_de_comentario = 11, RULE_expresion_string = 12, RULE_expresion_numerica = 13, 
		RULE_declaracion_de_pin = 14, RULE_declaracion_de_variable = 15, RULE_declaracion_de_constante_0 = 16, 
		RULE_declaracion_de_constante_1 = 17, RULE_declaracion_de_constante_2 = 18, 
		RULE_declaracion_de_constante_3 = 19;
	public static final String[] ruleNames = {
		"programa", "sentencia", "declaracion_de_nombre", "declaracion_de_numero_de_parte", 
		"declaracion_de_fecha", "declaracion_de_revision", "declaracion_de_disenador", 
		"declaracion_de_compania", "declaracion_de_assembly", "declaracion_de_location", 
		"declaracion_de_dispositivo", "declaracion_de_comentario", "expresion_string", 
		"expresion_numerica", "declaracion_de_pin", "declaracion_de_variable", 
		"declaracion_de_constante_0", "declaracion_de_constante_1", "declaracion_de_constante_2", 
		"declaracion_de_constante_3"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<Object, Integer> symbolTable = new HashMap<Object, Integer>();
		
		int contador_de_pines;
		int contador_de_pines_de_salida;
		boolean contador_de_errores = false;
		
		int [] pines = new int [16];
		int [] pines_de_salida = new int [8];
		
		String [] nombre_de_pines = new String [16];
		String [] nombre_de_pines_de_salida = new String [8];
		String [] operacion_de_pines_de_salida = new String [8];
		String [] nombre_operacion_de_pines_de_salida = new String [8];

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode PROGRAMA() { return getToken(SimpleParser.PROGRAMA, 0); }
		public TerminalNode CORCHETE_CERRADO() { return getToken(SimpleParser.CORCHETE_CERRADO, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode CORCHETE_ABIERTO() { return getToken(SimpleParser.CORCHETE_ABIERTO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(PROGRAMA);
			setState(41); match(CORCHETE_ABIERTO);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << PARTNO) | (1L << DATE) | (1L << REVISION) | (1L << DESIGNER) | (1L << COMPANY) | (1L << ASSEMBLY) | (1L << LOCATION) | (1L << DEVICE) | (1L << PIN) | (1L << INICIO_DE_COMENTARIO) | (1L << FIN_DE_COMENTARIO) | (1L << ASTERISCO) | (1L << IDENTIFICADOR) | (1L << NUMERO))) != 0)) {
				{
				{
				setState(42); sentencia();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48); match(CORCHETE_CERRADO);
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

	public static class SentenciaContext extends ParserRuleContext {
		public Declaracion_de_numero_de_parteContext declaracion_de_numero_de_parte() {
			return getRuleContext(Declaracion_de_numero_de_parteContext.class,0);
		}
		public Declaracion_de_locationContext declaracion_de_location() {
			return getRuleContext(Declaracion_de_locationContext.class,0);
		}
		public Declaracion_de_disenadorContext declaracion_de_disenador() {
			return getRuleContext(Declaracion_de_disenadorContext.class,0);
		}
		public Declaracion_de_constante_2Context declaracion_de_constante_2() {
			return getRuleContext(Declaracion_de_constante_2Context.class,0);
		}
		public Declaracion_de_revisionContext declaracion_de_revision() {
			return getRuleContext(Declaracion_de_revisionContext.class,0);
		}
		public Declaracion_de_constante_0Context declaracion_de_constante_0() {
			return getRuleContext(Declaracion_de_constante_0Context.class,0);
		}
		public Declaracion_de_fechaContext declaracion_de_fecha() {
			return getRuleContext(Declaracion_de_fechaContext.class,0);
		}
		public Declaracion_de_assemblyContext declaracion_de_assembly() {
			return getRuleContext(Declaracion_de_assemblyContext.class,0);
		}
		public Declaracion_de_constante_1Context declaracion_de_constante_1() {
			return getRuleContext(Declaracion_de_constante_1Context.class,0);
		}
		public Declaracion_de_companiaContext declaracion_de_compania() {
			return getRuleContext(Declaracion_de_companiaContext.class,0);
		}
		public Declaracion_de_variableContext declaracion_de_variable() {
			return getRuleContext(Declaracion_de_variableContext.class,0);
		}
		public Declaracion_de_nombreContext declaracion_de_nombre() {
			return getRuleContext(Declaracion_de_nombreContext.class,0);
		}
		public Declaracion_de_pinContext declaracion_de_pin() {
			return getRuleContext(Declaracion_de_pinContext.class,0);
		}
		public Declaracion_de_comentarioContext declaracion_de_comentario() {
			return getRuleContext(Declaracion_de_comentarioContext.class,0);
		}
		public Declaracion_de_constante_3Context declaracion_de_constante_3() {
			return getRuleContext(Declaracion_de_constante_3Context.class,0);
		}
		public Declaracion_de_dispositivoContext declaracion_de_dispositivo() {
			return getRuleContext(Declaracion_de_dispositivoContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); declaracion_de_nombre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); declaracion_de_numero_de_parte();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); declaracion_de_fecha();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); declaracion_de_revision();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54); declaracion_de_disenador();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55); declaracion_de_compania();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56); declaracion_de_assembly();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57); declaracion_de_location();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58); declaracion_de_dispositivo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59); declaracion_de_comentario();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60); declaracion_de_pin();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61); declaracion_de_variable();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62); declaracion_de_constante_0();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(63); declaracion_de_constante_1();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(64); declaracion_de_constante_2();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(65); declaracion_de_constante_3();
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

	public static class Declaracion_de_nombreContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode NAME() { return getToken(SimpleParser.NAME, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_nombre(this);
		}
	}

	public final Declaracion_de_nombreContext declaracion_de_nombre() throws RecognitionException {
		Declaracion_de_nombreContext _localctx = new Declaracion_de_nombreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion_de_nombre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(NAME);
			setState(69); match(IDENTIFICADOR);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(70); match(PUNTO_Y_COMA);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_numero_de_parteContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode PARTNO() { return getToken(SimpleParser.PARTNO, 0); }
		public Declaracion_de_numero_de_parteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_numero_de_parte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_numero_de_parte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_numero_de_parte(this);
		}
	}

	public final Declaracion_de_numero_de_parteContext declaracion_de_numero_de_parte() throws RecognitionException {
		Declaracion_de_numero_de_parteContext _localctx = new Declaracion_de_numero_de_parteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_de_numero_de_parte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(PARTNO);
			setState(77); match(NUMERO);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(78); match(PUNTO_Y_COMA);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_fechaContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public TerminalNode BARRA_INVERTIDA(int i) {
			return getToken(SimpleParser.BARRA_INVERTIDA, i);
		}
		public List<TerminalNode> BARRA_INVERTIDA() { return getTokens(SimpleParser.BARRA_INVERTIDA); }
		public TerminalNode DATE() { return getToken(SimpleParser.DATE, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleParser.NUMERO, i);
		}
		public Declaracion_de_fechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_fecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_fecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_fecha(this);
		}
	}

	public final Declaracion_de_fechaContext declaracion_de_fecha() throws RecognitionException {
		Declaracion_de_fechaContext _localctx = new Declaracion_de_fechaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion_de_fecha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(DATE);
			setState(85); match(NUMERO);
			setState(86); match(BARRA_INVERTIDA);
			setState(87); match(NUMERO);
			setState(88); match(BARRA_INVERTIDA);
			setState(89); match(NUMERO);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(90); match(PUNTO_Y_COMA);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_revisionContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode REVISION() { return getToken(SimpleParser.REVISION, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public Declaracion_de_revisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_revision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_revision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_revision(this);
		}
	}

	public final Declaracion_de_revisionContext declaracion_de_revision() throws RecognitionException {
		Declaracion_de_revisionContext _localctx = new Declaracion_de_revisionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_de_revision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(REVISION);
			setState(97); match(NUMERO);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(98); match(PUNTO_Y_COMA);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_disenadorContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode DESIGNER() { return getToken(SimpleParser.DESIGNER, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_disenadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_disenador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_disenador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_disenador(this);
		}
	}

	public final Declaracion_de_disenadorContext declaracion_de_disenador() throws RecognitionException {
		Declaracion_de_disenadorContext _localctx = new Declaracion_de_disenadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_de_disenador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(DESIGNER);
			setState(105); match(IDENTIFICADOR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(106); match(PUNTO_Y_COMA);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_companiaContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode COMPANY() { return getToken(SimpleParser.COMPANY, 0); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SimpleParser.IDENTIFICADOR); }
		public Declaracion_de_companiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_compania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_compania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_compania(this);
		}
	}

	public final Declaracion_de_companiaContext declaracion_de_compania() throws RecognitionException {
		Declaracion_de_companiaContext _localctx = new Declaracion_de_companiaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_de_compania);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(COMPANY);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113); match(IDENTIFICADOR);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(119); match(PUNTO_Y_COMA);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_assemblyContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode NONE() { return getToken(SimpleParser.NONE, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode ASSEMBLY() { return getToken(SimpleParser.ASSEMBLY, 0); }
		public Declaracion_de_assemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_assembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_assembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_assembly(this);
		}
	}

	public final Declaracion_de_assemblyContext declaracion_de_assembly() throws RecognitionException {
		Declaracion_de_assemblyContext _localctx = new Declaracion_de_assemblyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_de_assembly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(ASSEMBLY);
			setState(126); match(NONE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(127); match(PUNTO_Y_COMA);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_locationContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode LOCATION() { return getToken(SimpleParser.LOCATION, 0); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SimpleParser.IDENTIFICADOR); }
		public Declaracion_de_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_location(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_location(this);
		}
	}

	public final Declaracion_de_locationContext declaracion_de_location() throws RecognitionException {
		Declaracion_de_locationContext _localctx = new Declaracion_de_locationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion_de_location);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(LOCATION);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(134); match(IDENTIFICADOR);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(140); match(PUNTO_Y_COMA);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_dispositivoContext extends ParserRuleContext {
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode G16V8() { return getToken(SimpleParser.G16V8, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode DEVICE() { return getToken(SimpleParser.DEVICE, 0); }
		public Declaracion_de_dispositivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_dispositivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_dispositivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_dispositivo(this);
		}
	}

	public final Declaracion_de_dispositivoContext declaracion_de_dispositivo() throws RecognitionException {
		Declaracion_de_dispositivoContext _localctx = new Declaracion_de_dispositivoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracion_de_dispositivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(DEVICE);
			setState(147); match(G16V8);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(148); match(PUNTO_Y_COMA);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Declaracion_de_comentarioContext extends ParserRuleContext {
		public TerminalNode INICIO_DE_COMENTARIO() { return getToken(SimpleParser.INICIO_DE_COMENTARIO, 0); }
		public TerminalNode FIN_DE_COMENTARIO() { return getToken(SimpleParser.FIN_DE_COMENTARIO, 0); }
		public TerminalNode ASTERISCO(int i) {
			return getToken(SimpleParser.ASTERISCO, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SimpleParser.IDENTIFICADOR); }
		public List<TerminalNode> ASTERISCO() { return getTokens(SimpleParser.ASTERISCO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleParser.NUMERO, i);
		}
		public Declaracion_de_comentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_comentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_comentario(this);
		}
	}

	public final Declaracion_de_comentarioContext declaracion_de_comentario() throws RecognitionException {
		Declaracion_de_comentarioContext _localctx = new Declaracion_de_comentarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracion_de_comentario);
		try {
			int _alt;
			setState(186);
			switch (_input.LA(1)) {
			case INICIO_DE_COMENTARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(INICIO_DE_COMENTARIO);
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(155); match(IDENTIFICADOR);
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case FIN_DE_COMENTARIO:
			case ASTERISCO:
			case IDENTIFICADOR:
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(161); match(ASTERISCO);
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(167); match(IDENTIFICADOR);
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173); match(NUMERO);
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(179); match(ASTERISCO);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(185); match(FIN_DE_COMENTARIO);
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

	public static class Expresion_stringContext extends ParserRuleContext {
		public Object value;
		public Token IDENTIFICADOR;
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Expresion_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpresion_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpresion_string(this);
		}
	}

	public final Expresion_stringContext expresion_string() throws RecognitionException {
		Expresion_stringContext _localctx = new Expresion_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); ((Expresion_stringContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			((Expresion_stringContext)_localctx).value =  symbolTable.get((((Expresion_stringContext)_localctx).IDENTIFICADOR!=null?((Expresion_stringContext)_localctx).IDENTIFICADOR.getText():null));
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

	public static class Expresion_numericaContext extends ParserRuleContext {
		public int value;
		public Token NUMERO;
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public Expresion_numericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_numerica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpresion_numerica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpresion_numerica(this);
		}
	}

	public final Expresion_numericaContext expresion_numerica() throws RecognitionException {
		Expresion_numericaContext _localctx = new Expresion_numericaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_numerica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); ((Expresion_numericaContext)_localctx).NUMERO = match(NUMERO);
			((Expresion_numericaContext)_localctx).value =  Integer.parseInt((((Expresion_numericaContext)_localctx).NUMERO!=null?((Expresion_numericaContext)_localctx).NUMERO.getText():null));
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

	public static class Declaracion_de_pinContext extends ParserRuleContext {
		public Expresion_numericaContext expresion_numerica;
		public Token IDENTIFICADOR;
		public TerminalNode PIN() { return getToken(SimpleParser.PIN, 0); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public Expresion_numericaContext expresion_numerica() {
			return getRuleContext(Expresion_numericaContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_pinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_pin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_pin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_pin(this);
		}
	}

	public final Declaracion_de_pinContext declaracion_de_pin() throws RecognitionException {
		Declaracion_de_pinContext _localctx = new Declaracion_de_pinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracion_de_pin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(PIN);
			setState(195); ((Declaracion_de_pinContext)_localctx).expresion_numerica = expresion_numerica();
			setState(196); match(ASIGNACION);
			setState(197); ((Declaracion_de_pinContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(198); match(PUNTO_Y_COMA);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines < 16) {
										int numero_de_pin = ((Declaracion_de_pinContext)_localctx).expresion_numerica.value;
										String identificador = (((Declaracion_de_pinContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_pinContext)_localctx).IDENTIFICADOR.getText():null);
										
										symbolTable.put(identificador, numero_de_pin);
										
										pines[contador_de_pines] = numero_de_pin;
										nombre_de_pines[contador_de_pines] = identificador;
										
										contador_de_pines++;
									} else {
										System.out.println("***ERROR: solo puedes usar 16 PINES***");
										contador_de_errores = true;
									}
								
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

	public static class Declaracion_de_variableContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Expresion_stringContext expresion_string;
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Expresion_stringContext expresion_string() {
			return getRuleContext(Expresion_stringContext.class,0);
		}
		public Declaracion_de_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_variable(this);
		}
	}

	public final Declaracion_de_variableContext declaracion_de_variable() throws RecognitionException {
		Declaracion_de_variableContext _localctx = new Declaracion_de_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracion_de_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); ((Declaracion_de_variableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(207); match(ASIGNACION);
			setState(208); ((Declaracion_de_variableContext)_localctx).expresion_string = expresion_string();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(209); match(PUNTO_Y_COMA);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines_de_salida > 7) {
										System.out.println("***ERROR: solo puedes usar 8 PINES de salida***");
										
										contador_de_errores = true;
									} else {
										String identificador = (((Declaracion_de_variableContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_variableContext)_localctx).IDENTIFICADOR.getText():null);
										String pin_de_salida = String.valueOf(symbolTable.get(identificador));
										
										int numero_de_pin = Integer.parseInt(pin_de_salida);
										int indice = numero_de_pin - 12;
										
										if(indice > 7 || indice < 0) {
											System.out.println("***ERROR: los PINES de salida son del 12 al 19***");
										
											contador_de_errores = true;
										} else {
											pines_de_salida[indice] = numero_de_pin;
											
											contador_de_pines_de_salida++;
											
											nombre_de_pines_de_salida[indice] = identificador;
											operacion_de_pines_de_salida[indice] = String.valueOf(((Declaracion_de_variableContext)_localctx).expresion_string.value);
											nombre_operacion_de_pines_de_salida[indice] = (((Declaracion_de_variableContext)_localctx).expresion_string!=null?_input.getText(((Declaracion_de_variableContext)_localctx).expresion_string.start,((Declaracion_de_variableContext)_localctx).expresion_string.stop):null);
										}
									}
								
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

	public static class Declaracion_de_constante_0Context extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token CONSTANTE_BINARIA_0_MAYUSCULA;
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public TerminalNode CONSTANTE_BINARIA_0_MAYUSCULA() { return getToken(SimpleParser.CONSTANTE_BINARIA_0_MAYUSCULA, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_constante_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_constante_0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_constante_0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_constante_0(this);
		}
	}

	public final Declaracion_de_constante_0Context declaracion_de_constante_0() throws RecognitionException {
		Declaracion_de_constante_0Context _localctx = new Declaracion_de_constante_0Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracion_de_constante_0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); ((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(218); match(ASIGNACION);
			setState(219); ((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA = match(CONSTANTE_BINARIA_0_MAYUSCULA);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(220); match(PUNTO_Y_COMA);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines_de_salida > 7) {
										System.out.println("***ERROR: solo puedes usar 8 PINES de salida***");
										
										contador_de_errores = true;
									} else {
										String identificador = (((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR.getText():null);
										String pin_de_salida = String.valueOf(symbolTable.get(identificador));
										
										int numero_de_pin = Integer.parseInt(pin_de_salida);
										int indice = numero_de_pin - 12;
										
										if(indice > 7 || indice < 0) {
											System.out.println("***ERROR: los PINES de salida son del 12 al 19***");
										
											contador_de_errores = true;
										} else {
											pines_de_salida[indice] = numero_de_pin;
											
											contador_de_pines_de_salida++;
											
											nombre_de_pines_de_salida[indice] = identificador;
											operacion_de_pines_de_salida[indice] = String.valueOf(0);
											nombre_operacion_de_pines_de_salida[indice] = (((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA!=null?((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA.getText():null);
										}
									}
								
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

	public static class Declaracion_de_constante_1Context extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token CONSTANTE_BINARIA_1_MAYUSCULA;
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public TerminalNode CONSTANTE_BINARIA_1_MAYUSCULA() { return getToken(SimpleParser.CONSTANTE_BINARIA_1_MAYUSCULA, 0); }
		public Declaracion_de_constante_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_constante_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_constante_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_constante_1(this);
		}
	}

	public final Declaracion_de_constante_1Context declaracion_de_constante_1() throws RecognitionException {
		Declaracion_de_constante_1Context _localctx = new Declaracion_de_constante_1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaracion_de_constante_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); ((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(229); match(ASIGNACION);
			setState(230); ((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA = match(CONSTANTE_BINARIA_1_MAYUSCULA);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(231); match(PUNTO_Y_COMA);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines_de_salida > 7) {
										System.out.println("***ERROR: solo puedes usar 8 PINES de salida***");
										
										contador_de_errores = true;
									} else {
										String identificador = (((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR.getText():null);
										String pin_de_salida = String.valueOf(symbolTable.get(identificador));
										
										int numero_de_pin = Integer.parseInt(pin_de_salida);
										int indice = numero_de_pin - 12;
										
										if(indice > 7 || indice < 0) {
											System.out.println("***ERROR: los PINES de salida son del 12 al 19***");
										
											contador_de_errores = true;
										} else {
											pines_de_salida[indice] = numero_de_pin;
											
											contador_de_pines_de_salida++;
											
											nombre_de_pines_de_salida[indice] = identificador;
											operacion_de_pines_de_salida[indice] = String.valueOf(-1);
											nombre_operacion_de_pines_de_salida[indice] = (((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA!=null?((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA.getText():null);
										}
									}
								
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

	public static class Declaracion_de_constante_2Context extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token CONSTANTE_BINARIA_2_MINUSCULA;
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public TerminalNode CONSTANTE_BINARIA_2_MINUSCULA() { return getToken(SimpleParser.CONSTANTE_BINARIA_2_MINUSCULA, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_constante_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_constante_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_constante_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_constante_2(this);
		}
	}

	public final Declaracion_de_constante_2Context declaracion_de_constante_2() throws RecognitionException {
		Declaracion_de_constante_2Context _localctx = new Declaracion_de_constante_2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracion_de_constante_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); ((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(240); match(ASIGNACION);
			setState(241); ((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA = match(CONSTANTE_BINARIA_2_MINUSCULA);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(242); match(PUNTO_Y_COMA);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines_de_salida > 7) {
										System.out.println("***ERROR: solo puedes usar 8 PINES de salida***");
										
										contador_de_errores = true;
									} else {
										String identificador = (((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR.getText():null);
										String pin_de_salida = String.valueOf(symbolTable.get(identificador));
										
										int numero_de_pin = Integer.parseInt(pin_de_salida);
										int indice = numero_de_pin - 12;
										
										if(indice > 7 || indice < 0) {
											System.out.println("***ERROR: los PINES de salida son del 12 al 19***");
										
											contador_de_errores = true;
										} else {
											pines_de_salida[indice] = numero_de_pin;
											
											contador_de_pines_de_salida++;
											
											nombre_de_pines_de_salida[indice] = identificador;
											operacion_de_pines_de_salida[indice] = String.valueOf(0);
											nombre_operacion_de_pines_de_salida[indice] = (((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA!=null?((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA.getText():null);
										}
									}
								
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

	public static class Declaracion_de_constante_3Context extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token CONSTANTE_BINARIA_3_MINUSCULA;
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(SimpleParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public TerminalNode CONSTANTE_BINARIA_3_MINUSCULA() { return getToken(SimpleParser.CONSTANTE_BINARIA_3_MINUSCULA, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(SimpleParser.PUNTO_Y_COMA); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_constante_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_constante_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_constante_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_constante_3(this);
		}
	}

	public final Declaracion_de_constante_3Context declaracion_de_constante_3() throws RecognitionException {
		Declaracion_de_constante_3Context _localctx = new Declaracion_de_constante_3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracion_de_constante_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); ((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(251); match(ASIGNACION);
			setState(252); ((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA = match(CONSTANTE_BINARIA_3_MINUSCULA);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(253); match(PUNTO_Y_COMA);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									if(contador_de_pines_de_salida > 7) {
										System.out.println("***ERROR: solo puedes usar 8 PINES de salida***");
										
										contador_de_errores = true;
									} else {
										String identificador = (((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR.getText():null);
										String pin_de_salida = String.valueOf(symbolTable.get(identificador));
										
										int numero_de_pin = Integer.parseInt(pin_de_salida);
										int indice = numero_de_pin - 12;
										
										if(indice > 7 || indice < 0) {
											System.out.println("***ERROR: los PINES de salida son del 12 al 19***");
										
											contador_de_errores = true;
										} else {
											pines_de_salida[indice] = numero_de_pin;
											
											contador_de_pines_de_salida++;
											
											nombre_de_pines_de_salida[indice] = identificador;
											operacion_de_pines_de_salida[indice] = String.valueOf(-1);
											nombre_operacion_de_pines_de_salida[indice] = (((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA!=null?((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA.getText():null);
										}
									}
								
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3E\n\3\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\5\7\5R\n\5\f\5"+
		"\16\5U\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3"+
		"\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\t"+
		"\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\7"+
		"\n\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\7\13\u008a\n\13\f\13\16\13"+
		"\u008d\13\13\3\13\7\13\u0090\n\13\f\13\16\13\u0093\13\13\3\f\3\f\3\f\7"+
		"\f\u0098\n\f\f\f\16\f\u009b\13\f\3\r\3\r\7\r\u009f\n\r\f\r\16\r\u00a2"+
		"\13\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\r\7\r\u00ab\n\r\f\r\16\r"+
		"\u00ae\13\r\3\r\7\r\u00b1\n\r\f\r\16\r\u00b4\13\r\3\r\7\r\u00b7\n\r\f"+
		"\r\16\r\u00ba\13\r\3\r\5\r\u00bd\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u0101\n\25\f\25\16\25\u0104\13\25\3\25\3\25"+
		"\3\25\b\u008b\u00a0\u00a6\u00ac\u00b2\u00b8\2\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\2\u011a\2*\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\b"+
		"N\3\2\2\2\nV\3\2\2\2\fb\3\2\2\2\16j\3\2\2\2\20r\3\2\2\2\22\177\3\2\2\2"+
		"\24\u0087\3\2\2\2\26\u0094\3\2\2\2\30\u00bc\3\2\2\2\32\u00be\3\2\2\2\34"+
		"\u00c1\3\2\2\2\36\u00c4\3\2\2\2 \u00d0\3\2\2\2\"\u00db\3\2\2\2$\u00e6"+
		"\3\2\2\2&\u00f1\3\2\2\2(\u00fc\3\2\2\2*+\7\3\2\2+/\7\32\2\2,.\5\4\3\2"+
		"-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2"+
		"\62\63\7\33\2\2\63\3\3\2\2\2\64E\5\6\4\2\65E\5\b\5\2\66E\5\n\6\2\67E\5"+
		"\f\7\28E\5\16\b\29E\5\20\t\2:E\5\22\n\2;E\5\24\13\2<E\5\26\f\2=E\5\30"+
		"\r\2>E\5\36\20\2?E\5 \21\2@E\5\"\22\2AE\5$\23\2BE\5&\24\2CE\5(\25\2D\64"+
		"\3\2\2\2D\65\3\2\2\2D\66\3\2\2\2D\67\3\2\2\2D8\3\2\2\2D9\3\2\2\2D:\3\2"+
		"\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2"+
		"\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\4\2\2GK\7!\2\2HJ\7\34\2\2IH\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MK\3\2\2\2NO\7\5\2\2OS"+
		"\7\"\2\2PR\7\34\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3\2\2\2"+
		"US\3\2\2\2VW\7\6\2\2WX\7\"\2\2XY\7 \2\2YZ\7\"\2\2Z[\7 \2\2[_\7\"\2\2\\"+
		"^\7\34\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2"+
		"\2\2bc\7\7\2\2cg\7\"\2\2df\7\34\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\7\b\2\2ko\7!\2\2ln\7\34\2\2ml\3\2\2\2nq"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2p\17\3\2\2\2qo\3\2\2\2rv\7\t\2\2su\7!\2\2"+
		"ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2\2\2y{\7\34\2"+
		"\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\n\2\2\u0080\u0084\7\13\2\2\u0081\u0083\7\34\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\7\f\2\2\u0088\u008a\7!\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\34\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\25\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\r\2\2\u0095\u0099"+
		"\7\16\2\2\u0096\u0098\7\34\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u00a0\7\35\2\2\u009d\u009f\7!\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00bd\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\37\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\7!\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7\"\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b8\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\37\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\36\2\2\u00bc\u009c\3\2\2\2\u00bc"+
		"\u00a6\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bf\7!\2\2\u00bf\u00c0\b\16\1"+
		"\2\u00c0\33\3\2\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3\b\17\1\2\u00c3\35"+
		"\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\7\27\2"+
		"\2\u00c7\u00cb\7!\2\2\u00c8\u00ca\7\34\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\b\20\1\2\u00cf\37\3\2\2\2\u00d0\u00d1\7!\2"+
		"\2\u00d1\u00d2\7\27\2\2\u00d2\u00d6\5\32\16\2\u00d3\u00d5\7\34\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\b\21\1\2\u00da"+
		"!\3\2\2\2\u00db\u00dc\7!\2\2\u00dc\u00dd\7\27\2\2\u00dd\u00e1\7\20\2\2"+
		"\u00de\u00e0\7\34\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\b\22\1\2\u00e5#\3\2\2\2\u00e6\u00e7\7!\2\2\u00e7\u00e8\7\27\2\2"+
		"\u00e8\u00ec\7\21\2\2\u00e9\u00eb\7\34\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\b\23\1\2\u00f0%\3\2\2\2\u00f1\u00f2\7!\2\2"+
		"\u00f2\u00f3\7\27\2\2\u00f3\u00f7\7\22\2\2\u00f4\u00f6\7\34\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\24\1\2\u00fb"+
		"\'\3\2\2\2\u00fc\u00fd\7!\2\2\u00fd\u00fe\7\27\2\2\u00fe\u0102\7\23\2"+
		"\2\u00ff\u0101\7\34\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\b\25\1\2\u0106)\3\2\2\2\33/DKS_gov|\u0084\u008b\u0091"+
		"\u0099\u00a0\u00a6\u00ac\u00b2\u00b8\u00bc\u00cb\u00d6\u00e1\u00ec\u00f7"+
		"\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}