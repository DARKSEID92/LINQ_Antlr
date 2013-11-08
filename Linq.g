grammar Linq;

program: initial+;

initial: initialex;

initialex: ifex | forex | switchex | whilex | dowhilex | funciones;



ifex: 'If' '('  condicion ')' inbloque  accion finbloque else;
else	:	
	|'Else'inbloque  accion finbloque else
;

final	:	 ';' ;

inbloque:	'{';

finbloque
	:	'}';

forex: 'For' '(' iniciofor     final limitador   final mov   ')' inbloque accion  finbloque;

whilex: 'While' '(' condicion')' inbloque accion  finbloque;

dowhilex: 'Do' inbloque accion finbloque 'While' '(' condicion')';

switchex:	  'Switch' '(' var ')' inbloque  caseswitch finbloque
	;
caseswitch	:'case' INT ': 'accion break final fimalswitch
	|	'case' INT ': 'accion break final caseswitch

;
fimalswitch
	:	'default' ': 'accion break final ;
break	:	'break';
mov	:	var funcion ;
limitador
	:	var comparacion val | var comparacion var
	
	;

comparacion : '<>' | '<=' | '>='| '=='|'>'|'<'
	;

accion	: 'ok'
	;

funcion	: '++' | '--'
	;
iniciofor	: var '='val
	;
finalex	: 
	;
condicion	: var comparacion val
	|	var comparacion val conjun condicion
	;
val	:	INT
	|	FLOAT
	;
var	:	ID
;
conjun	: '||' | '&&'
	;
	
	
funciones	:	vacia|retorna;
vacia	:	MA void ID inbloque accion finbloque
	|	MA MA void ID inbloque accion finbloque
	;
void	:	'void';
retorna	:	MA TD ID inbloque accion  return finbloque
	|	MA MA TD ID inbloque accion return finbloque
	;
return	:	'return' var final
	|	'return' val final
	;

	
MA	:	'Public'
	|	'Protected'
	|	'Private'
	|	'Final'
	|	'Statict'
	|	'Transfert'
	|	'Volatile'
	|	'Object'
	;
	
TD	:	'Boolean'
	|	'byte'
	|	'double'
	|	'long'
	|	'slust'
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
	
	
	
INT :	'0'..'9'+
    ;
    

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

