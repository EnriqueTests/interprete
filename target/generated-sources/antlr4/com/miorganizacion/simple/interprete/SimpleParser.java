// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;
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
		ASSEMBLY=8, NONE=9, LOCATION=10, DEVICE=11, G16V8=12, PIN=13, NOT=14, 
		OR=15, AND=16, ASIGNACION=17, PARENTESIS_ABIERTO=18, PARENTESIS_CERRADO=19, 
		CORCHETE_ABIERTO=20, CORCHETE_CERRADO=21, PUNTO_Y_COMA=22, INICIO_DE_COMENTARIO=23, 
		FIN_DE_COMENTARIO=24, ASTERISCO=25, BARRA_INVERTIDA=26, IDENTIFICADOR=27, 
		NUMERO=28, EB=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'Programa'", "'Name'", "'PartNo'", "'Date'", "'Revision'", 
		"'Designer'", "'Company'", "'Assembly'", "'None'", "'Location'", "'Device'", 
		"'g16v8'", "'PIN'", "'!'", "'#'", "'&'", "'='", "'('", "')'", "'{'", "'}'", 
		"';'", "'/*'", "'*/'", "'*'", "'/'", "IDENTIFICADOR", "NUMERO", "EB"
	};
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_declaracion_de_nombre = 2, 
		RULE_declaracion_de_numero_de_parte = 3, RULE_declaracion_de_fecha = 4, 
		RULE_declaracion_de_revision = 5, RULE_declaracion_de_disenador = 6, RULE_declaracion_de_compania = 7, 
		RULE_declaracion_de_assembly = 8, RULE_declaracion_de_location = 9, RULE_declaracion_de_dispositivo = 10, 
		RULE_declaracion_de_comentario = 11, RULE_declaracion_de_asignacion_de_pin = 12;
	public static final String[] ruleNames = {
		"programa", "sentencia", "declaracion_de_nombre", "declaracion_de_numero_de_parte", 
		"declaracion_de_fecha", "declaracion_de_revision", "declaracion_de_disenador", 
		"declaracion_de_compania", "declaracion_de_assembly", "declaracion_de_location", 
		"declaracion_de_dispositivo", "declaracion_de_comentario", "declaracion_de_asignacion_de_pin"
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
			setState(26); match(PROGRAMA);
			setState(27); match(CORCHETE_ABIERTO);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << PARTNO) | (1L << DATE) | (1L << REVISION) | (1L << DESIGNER) | (1L << COMPANY) | (1L << ASSEMBLY) | (1L << LOCATION) | (1L << DEVICE) | (1L << PIN) | (1L << INICIO_DE_COMENTARIO) | (1L << FIN_DE_COMENTARIO) | (1L << ASTERISCO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(28); sentencia();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(CORCHETE_CERRADO);
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
		public Declaracion_de_companiaContext declaracion_de_compania() {
			return getRuleContext(Declaracion_de_companiaContext.class,0);
		}
		public Declaracion_de_nombreContext declaracion_de_nombre() {
			return getRuleContext(Declaracion_de_nombreContext.class,0);
		}
		public Declaracion_de_locationContext declaracion_de_location() {
			return getRuleContext(Declaracion_de_locationContext.class,0);
		}
		public Declaracion_de_disenadorContext declaracion_de_disenador() {
			return getRuleContext(Declaracion_de_disenadorContext.class,0);
		}
		public Declaracion_de_revisionContext declaracion_de_revision() {
			return getRuleContext(Declaracion_de_revisionContext.class,0);
		}
		public Declaracion_de_fechaContext declaracion_de_fecha() {
			return getRuleContext(Declaracion_de_fechaContext.class,0);
		}
		public Declaracion_de_comentarioContext declaracion_de_comentario() {
			return getRuleContext(Declaracion_de_comentarioContext.class,0);
		}
		public Declaracion_de_asignacion_de_pinContext declaracion_de_asignacion_de_pin() {
			return getRuleContext(Declaracion_de_asignacion_de_pinContext.class,0);
		}
		public Declaracion_de_assemblyContext declaracion_de_assembly() {
			return getRuleContext(Declaracion_de_assemblyContext.class,0);
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
			setState(47);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); declaracion_de_nombre();
				}
				break;
			case PARTNO:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); declaracion_de_numero_de_parte();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); declaracion_de_fecha();
				}
				break;
			case REVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(39); declaracion_de_revision();
				}
				break;
			case DESIGNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(40); declaracion_de_disenador();
				}
				break;
			case COMPANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(41); declaracion_de_compania();
				}
				break;
			case ASSEMBLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(42); declaracion_de_assembly();
				}
				break;
			case LOCATION:
				enterOuterAlt(_localctx, 8);
				{
				setState(43); declaracion_de_location();
				}
				break;
			case DEVICE:
				enterOuterAlt(_localctx, 9);
				{
				setState(44); declaracion_de_dispositivo();
				}
				break;
			case INICIO_DE_COMENTARIO:
			case FIN_DE_COMENTARIO:
			case ASTERISCO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(45); declaracion_de_comentario();
				}
				break;
			case PIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(46); declaracion_de_asignacion_de_pin();
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

	public static class Declaracion_de_nombreContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleParser.NAME, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(NAME);
			setState(50); match(IDENTIFICADOR);
			setState(51); match(PUNTO_Y_COMA);
			System.out.println("Declarando el nombre del proyecto");
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
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(PARTNO);
			setState(55); match(NUMERO);
			setState(56); match(PUNTO_Y_COMA);
			System.out.println("Declarando el numero de parte");
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
		public List<TerminalNode> NUMERO() { return getTokens(SimpleParser.NUMERO); }
		public TerminalNode BARRA_INVERTIDA(int i) {
			return getToken(SimpleParser.BARRA_INVERTIDA, i);
		}
		public List<TerminalNode> BARRA_INVERTIDA() { return getTokens(SimpleParser.BARRA_INVERTIDA); }
		public TerminalNode DATE() { return getToken(SimpleParser.DATE, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(DATE);
			setState(60); match(NUMERO);
			setState(61); match(BARRA_INVERTIDA);
			setState(62); match(NUMERO);
			setState(63); match(BARRA_INVERTIDA);
			setState(64); match(NUMERO);
			setState(65); match(PUNTO_Y_COMA);
			System.out.println("Declarando la fecha de creacion del proyecto");
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
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode REVISION() { return getToken(SimpleParser.REVISION, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(REVISION);
			setState(69); match(NUMERO);
			setState(70); match(PUNTO_Y_COMA);
			System.out.println("Declarando de numero de revision");
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
		public TerminalNode DESIGNER() { return getToken(SimpleParser.DESIGNER, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(DESIGNER);
			setState(74); match(IDENTIFICADOR);
			setState(75); match(PUNTO_Y_COMA);
			System.out.println("Declarando el nombre del disenador");
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
		public TerminalNode COMPANY() { return getToken(SimpleParser.COMPANY, 0); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(COMPANY);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR) {
				{
				{
				setState(79); match(IDENTIFICADOR);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(PUNTO_Y_COMA);
			System.out.println("Declarando el nombre de la compania");
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
		public TerminalNode NONE() { return getToken(SimpleParser.NONE, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(ASSEMBLY);
			setState(89); match(NONE);
			setState(90); match(PUNTO_Y_COMA);
			System.out.println("Declarando el si va a usar ensamblador");
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
		public TerminalNode LOCATION() { return getToken(SimpleParser.LOCATION, 0); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(LOCATION);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(94); match(IDENTIFICADOR);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(100); match(PUNTO_Y_COMA);
			System.out.println("Declarando la locacion");
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
		public TerminalNode G16V8() { return getToken(SimpleParser.G16V8, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(DEVICE);
			setState(104); match(G16V8);
			setState(105); match(PUNTO_Y_COMA);
			System.out.println("Declarando el nombre del dispositivo");
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
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SimpleParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SimpleParser.IDENTIFICADOR); }
		public List<TerminalNode> ASTERISCO() { return getTokens(SimpleParser.ASTERISCO); }
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
			setState(135);
			switch (_input.LA(1)) {
			case INICIO_DE_COMENTARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(INICIO_DE_COMENTARIO);
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(109); match(IDENTIFICADOR);
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case FIN_DE_COMENTARIO:
			case ASTERISCO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(115); match(ASTERISCO);
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(121); match(IDENTIFICADOR);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(127); match(ASTERISCO);
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(133); match(FIN_DE_COMENTARIO);
				System.out.println("Declarando un comentario");
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

	public static class Declaracion_de_asignacion_de_pinContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(SimpleParser.PIN, 0); }
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode ASIGNACION() { return getToken(SimpleParser.ASIGNACION, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleParser.PUNTO_Y_COMA, 0); }
		public Declaracion_de_comentarioContext declaracion_de_comentario() {
			return getRuleContext(Declaracion_de_comentarioContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleParser.IDENTIFICADOR, 0); }
		public Declaracion_de_asignacion_de_pinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_asignacion_de_pin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaracion_de_asignacion_de_pin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaracion_de_asignacion_de_pin(this);
		}
	}

	public final Declaracion_de_asignacion_de_pinContext declaracion_de_asignacion_de_pin() throws RecognitionException {
		Declaracion_de_asignacion_de_pinContext _localctx = new Declaracion_de_asignacion_de_pinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracion_de_asignacion_de_pin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(PIN);
			setState(138); match(NUMERO);
			setState(139); match(ASIGNACION);
			setState(140); match(IDENTIFICADOR);
			setState(141); match(PUNTO_Y_COMA);
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(142); declaracion_de_comentario();
				}
				break;
			}
			System.out.println("Declarando un pin");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tS\n\t\f\t\16\tV\13\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13b\n\13\f\13\16\13e\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r\3"+
		"\r\7\rw\n\r\f\r\16\rz\13\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\r\7\r\u0083"+
		"\n\r\f\r\16\r\u0086\13\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0092\n\16\3\16\3\16\3\16\7crx~\u0084\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\2\u009b\2\34\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b8\3"+
		"\2\2\2\n=\3\2\2\2\fF\3\2\2\2\16K\3\2\2\2\20P\3\2\2\2\22Z\3\2\2\2\24_\3"+
		"\2\2\2\26i\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\35\7\3\2\2\35"+
		"!\7\26\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"$\3\2\2\2#!\3\2\2\2$%\7\27\2\2%\3\3\2\2\2&\62\5\6\4\2\'\62\5\b\5\2("+
		"\62\5\n\6\2)\62\5\f\7\2*\62\5\16\b\2+\62\5\20\t\2,\62\5\22\n\2-\62\5\24"+
		"\13\2.\62\5\26\f\2/\62\5\30\r\2\60\62\5\32\16\2\61&\3\2\2\2\61\'\3\2\2"+
		"\2\61(\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2"+
		"\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\4\2\2"+
		"\64\65\7\35\2\2\65\66\7\30\2\2\66\67\b\4\1\2\67\7\3\2\2\289\7\5\2\29:"+
		"\7\36\2\2:;\7\30\2\2;<\b\5\1\2<\t\3\2\2\2=>\7\6\2\2>?\7\36\2\2?@\7\34"+
		"\2\2@A\7\36\2\2AB\7\34\2\2BC\7\36\2\2CD\7\30\2\2DE\b\6\1\2E\13\3\2\2\2"+
		"FG\7\7\2\2GH\7\36\2\2HI\7\30\2\2IJ\b\7\1\2J\r\3\2\2\2KL\7\b\2\2LM\7\35"+
		"\2\2MN\7\30\2\2NO\b\b\1\2O\17\3\2\2\2PT\7\t\2\2QS\7\35\2\2RQ\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\30\2\2XY\b\t\1\2"+
		"Y\21\3\2\2\2Z[\7\n\2\2[\\\7\13\2\2\\]\7\30\2\2]^\b\n\1\2^\23\3\2\2\2_"+
		"c\7\f\2\2`b\7\35\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2"+
		"ec\3\2\2\2fg\7\30\2\2gh\b\13\1\2h\25\3\2\2\2ij\7\r\2\2jk\7\16\2\2kl\7"+
		"\30\2\2lm\b\f\1\2m\27\3\2\2\2nr\7\31\2\2oq\7\35\2\2po\3\2\2\2qt\3\2\2"+
		"\2rs\3\2\2\2rp\3\2\2\2s\u008a\3\2\2\2tr\3\2\2\2uw\7\33\2\2vu\3\2\2\2w"+
		"z\3\2\2\2xy\3\2\2\2xv\3\2\2\2y~\3\2\2\2zx\3\2\2\2{}\7\35\2\2|{\3\2\2\2"+
		"}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\u0084\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0083\7\33\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\32\2\2\u0088\u008a\b\r\1\2\u0089n\3\2\2\2\u0089x\3"+
		"\2\2\2\u008a\31\3\2\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7\36\2\2\u008d"+
		"\u008e\7\23\2\2\u008e\u008f\7\35\2\2\u008f\u0091\7\30\2\2\u0090\u0092"+
		"\5\30\r\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0094\b\16\1\2\u0094\33\3\2\2\2\f!\61Tcrx~\u0084\u0089\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}