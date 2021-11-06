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
            
            boolean contador_de_errores;
            int contador_de_pines;
        	int contador_de_pines_de_salida;
        	int contador_salidas = 0;
        	int indice;
            
            int [] pines;
        	int [] pines_de_salida;
			int [] pines_de_entrada;
			
			String [] nombre_de_pines;
			String [] nombre_de_pines_de_entrada;
			String [] nombre_de_pines_de_salida;
        	String [] operacion_de_pines_de_salida;
        	String [] nombre_operacion_de_pines_de_salida;
        	
        	contador_de_errores = parser.contador_de_errores;
        	
        	if(contador_de_errores == false) {
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
            					contador_de_errores = true;
            					break;
            				}
            				if(pines[contador] > 20 || pines[contador] < 1) {
								System.out.println("***ERROR: El PIN " + pines[contador] + " no existe***");
								contador_de_errores = true;
								break;
            				}
            			}
            			
            			if(contador_de_errores == false) {
            				System.out.print("\nPINES usados: ");
            				
                			imprimirArreglo(pines, contador_de_pines);
                			
                			System.out.print("\nNombre de PINES usados: ");
                			
                			nombre_de_pines = new String[contador_de_pines];
                			nombre_de_pines = Arrays.copyOf(parser.nombre_de_pines, contador_de_pines);             			
                			imprimirArreglo(nombre_de_pines, contador_de_pines);
                			
            				pines_de_salida = new int [8];
            				pines_de_salida = Arrays.copyOf(parser.pines_de_salida, 8);
            				
            				System.out.print("\n\nPINES de entrada: ");
            				
            				pines_de_entrada = new int [contador_de_pines];
            				pines_de_entrada = Arrays.copyOf(pines, contador_de_pines);
            				nombre_de_pines_de_entrada = new String [contador_de_pines];
            				nombre_de_pines_de_entrada = Arrays.copyOf(nombre_de_pines, contador_de_pines);
            				
            				for(int contador = 0; contador < 8; contador++) {
            					if(pines_de_salida[contador] > 0) {
            						for(int Contador = 0; Contador < pines_de_entrada.length; Contador++) {
            							if(pines_de_entrada[Contador] == pines_de_salida[contador]) {
            								contador_salidas++;
            								
                    						pines_de_entrada = removeElement(pines_de_entrada, Contador);
                    						nombre_de_pines_de_entrada = removeElement(nombre_de_pines_de_entrada, Contador);
            							}
            						}
            					}
            				}
            				
            				indice = contador_de_pines - contador_salidas;           				
            				imprimirArreglo(pines_de_entrada, indice);
            				
            				System.out.print("\nNombre de PINES de entrada: ");
            				
            				imprimirArreglo(nombre_de_pines_de_entrada, indice);
            				
            				System.out.print("\n\nPINES de salida: ");
            				
            				nombre_de_pines_de_salida = Arrays.copyOf(parser.nombre_de_pines_de_salida, 8);
            				imprimirArreglo(pines_de_salida, 8);
            				
            				System.out.print("\nNombre de PINES de salida: ");
            				
            				imprimirArreglo(nombre_de_pines_de_salida, 8);
            				
            				System.out.print("\n\nOperacion de PINES de salida: ");
            				
            				operacion_de_pines_de_salida = Arrays.copyOf(parser.operacion_de_pines_de_salida, 8);
            				imprimirArreglo(operacion_de_pines_de_salida, 8);
            				
            				System.out.print("\nNombre de operacion de PINES de salida: ");
            				
            				nombre_operacion_de_pines_de_salida = Arrays.copyOf(parser.nombre_operacion_de_pines_de_salida, 8);
            				imprimirArreglo(nombre_operacion_de_pines_de_salida, 8);
            			}
            		}
                }
        	}
        }
    }
    
    public static int [] removeElement(int [] arr, int index){
        int[] arrDestination = new int[arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        return arrDestination;
    }
    
    public static String [] removeElement(String [] arr, int index){
        String [] arrDestination = new String[arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        return arrDestination;
    }
    
    public static void imprimirArreglo(int [] arreglo, int limite) {
    	for(int contador = 0; contador < limite; contador++) {
			System.out.print(arreglo[contador] + ", ");
		}
    }
    
    public static void imprimirArreglo(String [] arreglo, int limite) {
    	for(int contador = 0; contador < limite; contador++) {
			System.out.print(arreglo[contador] + ", ");
		}
    }
}
