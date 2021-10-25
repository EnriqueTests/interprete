grammar Simple;

programa: PROGRAMA CORCHETE_ABIERTO sentencia* CORCHETE_CERRADO;

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
	declaracion_de_asignacion_de_pin 
	//declaracion_de_asignacion_de_variable
;

declaracion_de_nombre: NAME IDENTIFICADOR PUNTO_Y_COMA
					{System.out.println("Declarando el nombre del proyecto");};
declaracion_de_numero_de_parte: PARTNO NUMERO PUNTO_Y_COMA
					{System.out.println("Declarando el numero de parte");};
declaracion_de_fecha: DATE NUMERO BARRA_INVERTIDA NUMERO BARRA_INVERTIDA NUMERO PUNTO_Y_COMA
					{System.out.println("Declarando la fecha de creacion del proyecto");};
declaracion_de_revision: REVISION NUMERO PUNTO_Y_COMA
					{System.out.println("Declarando de numero de revision");};
declaracion_de_disenador: DESIGNER IDENTIFICADOR PUNTO_Y_COMA
					{System.out.println("Declarando el nombre del disenador");};
declaracion_de_compania: COMPANY IDENTIFICADOR* PUNTO_Y_COMA
					{System.out.println("Declarando el nombre de la compania");};
declaracion_de_assembly: ASSEMBLY NONE PUNTO_Y_COMA
					{System.out.println("Declarando el si va a usar ensamblador");};
declaracion_de_location: LOCATION IDENTIFICADOR*? PUNTO_Y_COMA
					{System.out.println("Declarando la locacion");};
declaracion_de_dispositivo: DEVICE G16V8 PUNTO_Y_COMA
					{System.out.println("Declarando el nombre del dispositivo");};
declaracion_de_comentario: INICIO_DE_COMENTARIO IDENTIFICADOR*? | ASTERISCO*? IDENTIFICADOR*? ASTERISCO*? FIN_DE_COMENTARIO
					{System.out.println("Declarando un comentario");};
declaracion_de_asignacion_de_pin: PIN NUMERO ASIGNACION IDENTIFICADOR PUNTO_Y_COMA declaracion_de_comentario?
					{System.out.println("Declarando un pin");};
expresion_numerica returns []
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