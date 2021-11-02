grammar Simple;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.Arrays;
}

@parser::members {
	Map<Object, Integer> symbolTable = new HashMap<Object, Integer>();
	
	int [] pines = new int [16];
	int [] pines_de_salida = new int [8];
	String [][] operacion_de_pines_de_salida = new String [8][2];
}

programa: 
	PROGRAMA 
	CORCHETE_ABIERTO 
	sentencia* 
	CORCHETE_CERRADO
	;
sentencia:
	declaracion_de_nombre | 
	declaracion_de_numero_de_parte | 
	declaracion_de_fecha | 
	declaracion_de_revision |
	declaracion_de_disenador | 
	declaracion_de_compania |
	declaracion_de_assembly | 
	declaracion_de_location | 
	declaracion_de_dispositivo | 
	declaracion_de_comentario | 
	declaracion_de_pin |
	declaracion_de_variable |
	declaracion_de_constante_0 |
	declaracion_de_constante_1 |
	declaracion_de_constante_2 |
	declaracion_de_constante_3
;
declaracion_de_nombre: 
					NAME 
					IDENTIFICADOR 
					PUNTO_Y_COMA*
					;
declaracion_de_numero_de_parte: 
					PARTNO 
					NUMERO 
					PUNTO_Y_COMA*
					;
declaracion_de_fecha: 
					DATE 
					NUMERO 
					BARRA_INVERTIDA 
					NUMERO 
					BARRA_INVERTIDA 
					NUMERO 
					PUNTO_Y_COMA*
					;
declaracion_de_revision: 
					REVISION 
					NUMERO 
					PUNTO_Y_COMA*
					;
declaracion_de_disenador: 
					DESIGNER 
					IDENTIFICADOR 
					PUNTO_Y_COMA*
					;
declaracion_de_compania: 
					COMPANY 
					IDENTIFICADOR* 
					PUNTO_Y_COMA*
					;
declaracion_de_assembly: 
					ASSEMBLY 
					NONE 
					PUNTO_Y_COMA*
					;
declaracion_de_location: 
					LOCATION 
					IDENTIFICADOR*? 
					PUNTO_Y_COMA*
					;
declaracion_de_dispositivo: 
					DEVICE 
					G16V8 
					PUNTO_Y_COMA*
					;
declaracion_de_comentario: 
					INICIO_DE_COMENTARIO 
					IDENTIFICADOR*? | 
					ASTERISCO*? 
					IDENTIFICADOR*?
					NUMERO*? 
					ASTERISCO*? 
					FIN_DE_COMENTARIO
					;
expresion_string returns [Object value]:
					IDENTIFICADOR {$value = symbolTable.get($IDENTIFICADOR.text);};
expresion_numerica returns [int value]:
					NUMERO {$value = Integer.parseInt($NUMERO.text);};
declaracion_de_pin: 
					PIN 
					expresion_numerica 
					ASIGNACION 
					IDENTIFICADOR 
					PUNTO_Y_COMA*
					{
						int numero = $expresion_numerica.value;
						
						if(numero == 10 || numero == 20) {
							System.out.println(
								"ERROR: El PIN " + 
								numero + 
								" no puede ser usado como entrada o salida"
							);
						}
						else {
							if(numero > 20) {
								System.out.println(
									"ERROR: El PIN " + 
									numero + 
									" no existe"
								);
							} else {
								System.out.println(
									"Usando el PIN " + 
									numero
								);
								
								symbolTable.put(
									$IDENTIFICADOR.text, 
									numero
								);
							}
						}
					};
declaracion_de_variable:
					IDENTIFICADOR
					ASIGNACION
					expresion_string
					PUNTO_Y_COMA*
					{
						String pin_de_salida = String.valueOf(symbolTable.get($IDENTIFICADOR.text));
						
						int numero_de_pin = Integer.parseInt(pin_de_salida);
						int numero_de_pin_correcto = numero_de_pin - 12;
						
						if(numero_de_pin_correcto < 0) {
							System.out.println(
								"ERROR: el PIN " + 
								numero_de_pin + 
								" no puede ser utilizado como salida"
							);
						} else {
							System.out.println(
								"PIN de salida: " + 
								pin_de_salida
							);
						}
					};
declaracion_de_constante_0:
					IDENTIFICADOR
					ASIGNACION
					CONSTANTE_BINARIA_0_MAYUSCULA
					PUNTO_Y_COMA*
					{
						System.out.println(
							"Declarando una asignacion con constante binaria " + 
							$IDENTIFICADOR.text + 
							" = " + 
							$CONSTANTE_BINARIA_0_MAYUSCULA.text
						);
						symbolTable.put(
							$IDENTIFICADOR.text, 
							100
						);
					};
declaracion_de_constante_1:
					IDENTIFICADOR
					ASIGNACION
					CONSTANTE_BINARIA_1_MAYUSCULA
					PUNTO_Y_COMA*
					{
						System.out.println(
							"Declarando una asignacion con constante binaria " + 
							$IDENTIFICADOR.text + 
							" = " + 
							$CONSTANTE_BINARIA_1_MAYUSCULA.text
						);
						symbolTable.put(
							$IDENTIFICADOR.text, 
							101
						);
					};
declaracion_de_constante_2:
					IDENTIFICADOR
					ASIGNACION
					CONSTANTE_BINARIA_2_MINUSCULA
					PUNTO_Y_COMA*
					{
						System.out.println(
							"Declarando una asignacion con constante binaria " + 
							$IDENTIFICADOR.text + 
							" = " + 
							$CONSTANTE_BINARIA_2_MINUSCULA.text
						);
						symbolTable.put(
							$IDENTIFICADOR.text, 
							102
						);
					};
declaracion_de_constante_3:
					IDENTIFICADOR
					ASIGNACION
					CONSTANTE_BINARIA_3_MINUSCULA
					PUNTO_Y_COMA*
					{
						System.out.println(
							"Declarando una asignacion con constante binaria " + 
							$IDENTIFICADOR.text + 
							" = " + 
							$CONSTANTE_BINARIA_3_MINUSCULA.text
						);
						symbolTable.put(
							$IDENTIFICADOR.text, 
							103
						);
					};

PROGRAMA: 'Programa';
NAME: 'Name';
PARTNO: 'PartNo';
DATE: 'Date';
REVISION: 'Revision';
DESIGNER: 'Designer';
COMPANY: 'Company';
ASSEMBLY: 'Assembly';
NONE: 'None';
LOCATION: 'Location';
DEVICE: 'Device';
G16V8: 'g16v8';
PIN: 'PIN';

CONSTANTE_BINARIA_0_MAYUSCULA: '\'B\'0';
CONSTANTE_BINARIA_1_MAYUSCULA: '\'B\'1';
CONSTANTE_BINARIA_2_MINUSCULA: '\'b\'0';
CONSTANTE_BINARIA_3_MINUSCULA: '\'b\'1';

NOT: '!';
OR: '#';
AND: '&';

ASIGNACION: '=';

PARENTESIS_ABIERTO: '(';
PARENTESIS_CERRADO: ')';

CORCHETE_ABIERTO: '{';
CORCHETE_CERRADO: '}';

PUNTO_Y_COMA: ';';

INICIO_DE_COMENTARIO: '/*';
FIN_DE_COMENTARIO: '*/';

ASTERISCO: '*';

BARRA_INVERTIDA: '/';

IDENTIFICADOR: [a-zA-Z_][a-zA-Z0-9_]*;

NUMERO: [0-9]+;

EB: [ \t\n\r]+ -> skip;