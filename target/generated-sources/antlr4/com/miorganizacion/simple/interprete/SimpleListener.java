// Generated from Simple.g4 by ANTLR 4.4
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_nombre}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_nombre(@NotNull SimpleParser.Declaracion_de_nombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_nombre}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_nombre(@NotNull SimpleParser.Declaracion_de_nombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_assembly(@NotNull SimpleParser.Declaracion_de_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_assembly(@NotNull SimpleParser.Declaracion_de_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_numero_de_parte}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_numero_de_parte(@NotNull SimpleParser.Declaracion_de_numero_de_parteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_numero_de_parte}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_numero_de_parte(@NotNull SimpleParser.Declaracion_de_numero_de_parteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_revision}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_revision(@NotNull SimpleParser.Declaracion_de_revisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_revision}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_revision(@NotNull SimpleParser.Declaracion_de_revisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_disenador}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_disenador(@NotNull SimpleParser.Declaracion_de_disenadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_disenador}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_disenador(@NotNull SimpleParser.Declaracion_de_disenadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull SimpleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull SimpleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull SimpleParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull SimpleParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_compania}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_compania(@NotNull SimpleParser.Declaracion_de_companiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_compania}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_compania(@NotNull SimpleParser.Declaracion_de_companiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_comentario}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_comentario(@NotNull SimpleParser.Declaracion_de_comentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_comentario}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_comentario(@NotNull SimpleParser.Declaracion_de_comentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_fecha}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_fecha(@NotNull SimpleParser.Declaracion_de_fechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_fecha}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_fecha(@NotNull SimpleParser.Declaracion_de_fechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_dispositivo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_dispositivo(@NotNull SimpleParser.Declaracion_de_dispositivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_dispositivo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_dispositivo(@NotNull SimpleParser.Declaracion_de_dispositivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_asignacion_de_pin}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_asignacion_de_pin(@NotNull SimpleParser.Declaracion_de_asignacion_de_pinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_asignacion_de_pin}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_asignacion_de_pin(@NotNull SimpleParser.Declaracion_de_asignacion_de_pinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaracion_de_location}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_location(@NotNull SimpleParser.Declaracion_de_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaracion_de_location}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_location(@NotNull SimpleParser.Declaracion_de_locationContext ctx);
}