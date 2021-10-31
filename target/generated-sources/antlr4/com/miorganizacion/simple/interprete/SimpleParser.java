// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;

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


		Map<String, Object> symbolTable = new HashMap<String, Object>();
		Map<Object, String> symbolTableNumero = new HashMap<Object, String>();

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

									System.out.println(
										"Declarando el nombre del proyecto"
									);
								
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
			setState(78); match(PARTNO);
			setState(79); match(NUMERO);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(80); match(PUNTO_Y_COMA);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando el numero de parte"
									);
								
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
			setState(88); match(DATE);
			setState(89); match(NUMERO);
			setState(90); match(BARRA_INVERTIDA);
			setState(91); match(NUMERO);
			setState(92); match(BARRA_INVERTIDA);
			setState(93); match(NUMERO);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(94); match(PUNTO_Y_COMA);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando la fecha de creacion del proyecto"
									);
								
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
			setState(102); match(REVISION);
			setState(103); match(NUMERO);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(104); match(PUNTO_Y_COMA);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando de numero de revision"
									);
								
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
			setState(112); match(DESIGNER);
			setState(113); match(IDENTIFICADOR);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(114); match(PUNTO_Y_COMA);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando el nombre del disenador"
									);
								
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
			setState(122); match(COMPANY);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); match(IDENTIFICADOR);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(129); match(PUNTO_Y_COMA);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando el nombre de la compania"
									);
								
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
			setState(137); match(ASSEMBLY);
			setState(138); match(NONE);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(139); match(PUNTO_Y_COMA);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando el si va a usar ensamblador"
									);
								
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
			setState(147); match(LOCATION);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(148); match(IDENTIFICADOR);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(154); match(PUNTO_Y_COMA);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando la locacion"
									);
								
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
			setState(162); match(DEVICE);
			setState(163); match(G16V8);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(164); match(PUNTO_Y_COMA);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando el nombre del dispositivo"
									);
								
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
			setState(205);
			switch (_input.LA(1)) {
			case INICIO_DE_COMENTARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(INICIO_DE_COMENTARIO);
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173); match(IDENTIFICADOR);
						}
						} 
					}
					setState(178);
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
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(185); match(IDENTIFICADOR);
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(191); match(NUMERO);
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(197); match(ASTERISCO);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(203); match(FIN_DE_COMENTARIO);

										System.out.println(
											"Declarando un comentario"
										);
									
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
			setState(207); ((Expresion_stringContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
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
		public Object value;
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
			setState(210); ((Expresion_numericaContext)_localctx).NUMERO = match(NUMERO);
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
			setState(213); match(PIN);
			setState(214); ((Declaracion_de_pinContext)_localctx).expresion_numerica = expresion_numerica();
			setState(215); match(ASIGNACION);
			setState(216); ((Declaracion_de_pinContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(217); match(PUNTO_Y_COMA);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando un PIN " + 
										((Declaracion_de_pinContext)_localctx).expresion_numerica.value + 
										" = " + 
										(((Declaracion_de_pinContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_pinContext)_localctx).IDENTIFICADOR.getText():null)
									);
									symbolTable.put(
										(((Declaracion_de_pinContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_pinContext)_localctx).IDENTIFICADOR.getText():null), 
										((Declaracion_de_pinContext)_localctx).expresion_numerica.value
									);
									symbolTableNumero.put(
										((Declaracion_de_pinContext)_localctx).expresion_numerica.value, 
										(((Declaracion_de_pinContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_pinContext)_localctx).IDENTIFICADOR.getText():null)
									);
								
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
			setState(225); ((Declaracion_de_variableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(226); match(ASIGNACION);
			setState(227); ((Declaracion_de_variableContext)_localctx).expresion_string = expresion_string();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(228); match(PUNTO_Y_COMA);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando una asignacion " + 
										(((Declaracion_de_variableContext)_localctx).IDENTIFICADOR!=null?((Declaracion_de_variableContext)_localctx).IDENTIFICADOR.getText():null) + 
										" = " + 
										symbolTableNumero.get(((Declaracion_de_variableContext)_localctx).expresion_string.value)
									);
								
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
			setState(236); ((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(237); match(ASIGNACION);
			setState(238); ((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA = match(CONSTANTE_BINARIA_0_MAYUSCULA);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(239); match(PUNTO_Y_COMA);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando una asignacion con constante binaria " + 
										(((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR.getText():null) + 
										" = " + 
										(((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA!=null?((Declaracion_de_constante_0Context)_localctx).CONSTANTE_BINARIA_0_MAYUSCULA.getText():null)
									);
									symbolTable.put(
										(((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_0Context)_localctx).IDENTIFICADOR.getText():null), 
										100
									);
								
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
			setState(247); ((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(248); match(ASIGNACION);
			setState(249); ((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA = match(CONSTANTE_BINARIA_1_MAYUSCULA);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(250); match(PUNTO_Y_COMA);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando una asignacion con constante binaria " + 
										(((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR.getText():null) + 
										" = " + 
										(((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA!=null?((Declaracion_de_constante_1Context)_localctx).CONSTANTE_BINARIA_1_MAYUSCULA.getText():null)
									);
									symbolTable.put(
										(((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_1Context)_localctx).IDENTIFICADOR.getText():null), 
										101
									);
								
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
			setState(258); ((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(259); match(ASIGNACION);
			setState(260); ((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA = match(CONSTANTE_BINARIA_2_MINUSCULA);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(261); match(PUNTO_Y_COMA);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando una asignacion con constante binaria " + 
										(((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR.getText():null) + 
										" = " + 
										(((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA!=null?((Declaracion_de_constante_2Context)_localctx).CONSTANTE_BINARIA_2_MINUSCULA.getText():null)
									);
									symbolTable.put(
										(((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_2Context)_localctx).IDENTIFICADOR.getText():null), 
										102
									);
								
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
			setState(269); ((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(270); match(ASIGNACION);
			setState(271); ((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA = match(CONSTANTE_BINARIA_3_MINUSCULA);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO_Y_COMA) {
				{
				{
				setState(272); match(PUNTO_Y_COMA);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

									System.out.println(
										"Declarando una asignacion con constante binaria " + 
										(((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR.getText():null) + 
										" = " + 
										(((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA!=null?((Declaracion_de_constante_3Context)_localctx).CONSTANTE_BINARIA_3_MINUSCULA.getText():null)
									);
									symbolTable.put(
										(((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR!=null?((Declaracion_de_constante_3Context)_localctx).IDENTIFICADOR.getText():null), 
										103
									);
								
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3E\n\3\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3\5\7\5"+
		"T\n\5\f\5\16\5W\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6"+
		"\16\6e\13\6\3\6\3\6\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082"+
		"\13\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u008f"+
		"\n\n\f\n\16\n\u0092\13\n\3\n\3\n\3\13\3\13\7\13\u0098\n\13\f\13\16\13"+
		"\u009b\13\13\3\13\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\3\f"+
		"\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\f\3\f\3\r\3\r\7\r\u00b1\n"+
		"\r\f\r\16\r\u00b4\13\r\3\r\7\r\u00b7\n\r\f\r\16\r\u00ba\13\r\3\r\7\r\u00bd"+
		"\n\r\f\r\16\r\u00c0\13\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\7\r"+
		"\u00c9\n\r\f\r\16\r\u00cc\13\r\3\r\3\r\5\r\u00d0\n\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00e8\n\21\f\21\16\21\u00eb"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00f3\n\22\f\22\16\22\u00f6"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00fe\n\23\f\23\16\23\u0101"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0114\n\25\f\25\16\25\u0117"+
		"\13\25\3\25\3\25\3\25\b\u0099\u00b2\u00b8\u00be\u00c4\u00ca\2\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u012d\2*\3\2\2\2\4D\3\2\2"+
		"\2\6F\3\2\2\2\bP\3\2\2\2\nZ\3\2\2\2\fh\3\2\2\2\16r\3\2\2\2\20|\3\2\2\2"+
		"\22\u008b\3\2\2\2\24\u0095\3\2\2\2\26\u00a4\3\2\2\2\30\u00cf\3\2\2\2\32"+
		"\u00d1\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2\2\2 \u00e3\3\2\2\2\"\u00ee"+
		"\3\2\2\2$\u00f9\3\2\2\2&\u0104\3\2\2\2(\u010f\3\2\2\2*+\7\3\2\2+/\7\32"+
		"\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2"+
		"\2\61/\3\2\2\2\62\63\7\33\2\2\63\3\3\2\2\2\64E\5\6\4\2\65E\5\b\5\2\66"+
		"E\5\n\6\2\67E\5\f\7\28E\5\16\b\29E\5\20\t\2:E\5\22\n\2;E\5\24\13\2<E\5"+
		"\26\f\2=E\5\30\r\2>E\5\36\20\2?E\5 \21\2@E\5\"\22\2AE\5$\23\2BE\5&\24"+
		"\2CE\5(\25\2D\64\3\2\2\2D\65\3\2\2\2D\66\3\2\2\2D\67\3\2\2\2D8\3\2\2\2"+
		"D9\3\2\2\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2"+
		"D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\4\2\2GK\7!\2\2"+
		"HJ\7\34\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NO\b\4\1\2O\7\3\2\2\2PQ\7\5\2\2QU\7\"\2\2RT\7\34\2\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\b\5\1\2Y\t\3\2\2\2Z[\7"+
		"\6\2\2[\\\7\"\2\2\\]\7 \2\2]^\7\"\2\2^_\7 \2\2_c\7\"\2\2`b\7\34\2\2a`"+
		"\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\6\1\2g"+
		"\13\3\2\2\2hi\7\7\2\2im\7\"\2\2jl\7\34\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\7\1\2q\r\3\2\2\2rs\7\b\2\2sw\7!\2"+
		"\2tv\7\34\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2"+
		"\2\2z{\b\b\1\2{\17\3\2\2\2|\u0080\7\t\2\2}\177\7!\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0085\7\34\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\b\t\1\2\u008a\21\3\2\2\2\u008b\u008c\7\n\2"+
		"\2\u008c\u0090\7\13\2\2\u008d\u008f\7\34\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\b\n\1\2\u0094\23\3\2\2\2\u0095\u0099"+
		"\7\f\2\2\u0096\u0098\7!\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009e\7\34\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\b\13\1\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a9"+
		"\7\16\2\2\u00a6\u00a8\7\34\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\b\f\1\2\u00ad\27\3\2\2\2\u00ae\u00b2\7\35\2\2\u00af"+
		"\u00b1\7!\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00d0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b7\7\37\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bd\7!\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c3\7\"\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c9\7\37\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\36\2\2\u00ce\u00d0\b\r\1\2\u00cf\u00ae\3\2\2\2\u00cf\u00b8\3"+
		"\2\2\2\u00d0\31\3\2\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\b\16\1\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\b\17\1\2\u00d6\35\3\2\2\2"+
		"\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da\7\27\2\2\u00da"+
		"\u00de\7!\2\2\u00db\u00dd\7\34\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\b\20\1\2\u00e2\37\3\2\2\2\u00e3\u00e4\7!\2"+
		"\2\u00e4\u00e5\7\27\2\2\u00e5\u00e9\5\32\16\2\u00e6\u00e8\7\34\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\21\1\2\u00ed"+
		"!\3\2\2\2\u00ee\u00ef\7!\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f4\7\20\2\2"+
		"\u00f1\u00f3\7\34\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\b\22\1\2\u00f8#\3\2\2\2\u00f9\u00fa\7!\2\2\u00fa\u00fb\7\27\2\2"+
		"\u00fb\u00ff\7\21\2\2\u00fc\u00fe\7\34\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0103\b\23\1\2\u0103%\3\2\2\2\u0104\u0105\7!\2\2"+
		"\u0105\u0106\7\27\2\2\u0106\u010a\7\22\2\2\u0107\u0109\7\34\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b\24\1\2\u010e"+
		"\'\3\2\2\2\u010f\u0110\7!\2\2\u0110\u0111\7\27\2\2\u0111\u0115\7\23\2"+
		"\2\u0112\u0114\7\34\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u0119\b\25\1\2\u0119)\3\2\2\2\33/DKUcmw\u0080\u0086\u0090\u0099"+
		"\u009f\u00a9\u00b2\u00b8\u00be\u00c4\u00ca\u00cf\u00de\u00e9\u00f4\u00ff"+
		"\u010a\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}