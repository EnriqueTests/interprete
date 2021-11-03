package com.miorganizacion.simple.interprete;

import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "smp";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            SimpleLexer lexer = new SimpleLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SimpleParser parser = new SimpleParser(tokens);
            SimpleParser.ProgramaContext tree = parser.programa();
            SimpleCustomVisitor visitor = new SimpleCustomVisitor();
            visitor.visit(tree);
            
            System.out.println("FINISH: " + file);
            
            int contador_de_errores;
            int contador_de_pines;
        	int contador_de_pines_de_salida;
            
            int [] pines;
        	int [] pines_de_salida;
        	String [] operacion_de_pines_de_salida;
        	
        	contador_de_errores = parser.contador_de_errores;
        	
        	if(contador_de_errores == 0) {
        		contador_de_pines = parser.contador_de_pines;
        		
        		if(contador_de_pines == 0) {
                	System.out.println("\n***ERROR: no estas utilizando ningun PIN***\n");
                } else {
            		contador_de_pines_de_salida = parser.contador_de_pines_de_salida;
            		
            		if(contador_de_pines_de_salida == 0) {
            			System.out.println("\n***No estas utilizando ningun PIN de salida***\n");
            		} else {
            			pines = new int [contador_de_pines];
            			
            			pines = Arrays.copyOf(parser.pines, contador_de_pines);
            			
            			for(int contador = 0; contador < contador_de_pines; contador++) {
            				if(pines[contador] == 10 || pines[contador] == 20) {
            					System.out.println("***ERROR: El PIN " + pines[contador] + " no puede ser usado como entrada o salida***");
            					contador_de_errores++;
            					break;
            				}
            				if(pines[contador] > 20 || pines[contador] < 1) {
								System.out.println("***ERROR: El PIN " + pines[contador] + " no existe***");
								contador_de_errores++;
								break;
            				}
            			}
            			
            			if(contador_de_errores == 0) {
            				System.out.println("PINES usados: ");
                			
                			for(int contador = 0; contador < contador_de_pines; contador++) {
                				System.out.print(pines[contador] + " ");
                			}
                			
            				pines_de_salida = new int [contador_de_pines_de_salida];
            				
            				for(int contador = 0; contador < contador_de_pines_de_salida; contador++) {
            				}
            			}
            		}
                }
        	}
        }
    }
}
