// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SimpleParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_nombre(SimpleParser.Declaracion_de_nombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_numero_de_parte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_numero_de_parte(SimpleParser.Declaracion_de_numero_de_parteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_fecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_fecha(SimpleParser.Declaracion_de_fechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_revision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_revision(SimpleParser.Declaracion_de_revisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_diseno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_diseno(SimpleParser.Declaracion_de_disenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_compania}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_compania(SimpleParser.Declaracion_de_companiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_assembly(SimpleParser.Declaracion_de_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_location(SimpleParser.Declaracion_de_locationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_dispositivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_dispositivo(SimpleParser.Declaracion_de_dispositivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_comentario(SimpleParser.Declaracion_de_comentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaracion_de_asignacion_de_pin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_de_asignacion_de_pin(SimpleParser.Declaracion_de_asignacion_de_pinContext ctx);
}