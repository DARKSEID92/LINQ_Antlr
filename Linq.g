grammar Linq;
program	:	initial+
	;

initial	:	expr final
	|	MA expr final
	|	QUERY_EXP final
	;

final	:	 ';'
	;

expr	:	TD decl
	|	decl
	;

decl	:	ID  '=' val
	|	ID  '=' val signo
	|	ID  signo
	|	ID
	;
signo	:	',' decl 
	;
val	:	INT
	|	FLOAT
	;
    
BOOLEAN	
	:	'true'
	|	'false'
	;
	
MA	
	:	'Public'
	|	'Protected'
	|	'Private'
	|	'Final'
	|	'Statict'
	|	'Transfert'
	|	'Volatile'
	|	'Object'
	;
	
TD	
	:	'byte'
	|	'Boolean'
	|	'double'
	|	'int'
	|	'float'
	|	'long'
	|	'slust'
	;

QUERY_EXP 
	:	'var' QUERY_ID '=' QUERY
	;

QUERY_ID
	:	ID
	;

QUERY	
	:	FROM_CLAUSE+ JOIN_CLAUSE* WHERE_CLAUSE* GROUP_BY_CLAUSE* ORDER_BY_CLAUSE* SELECT_CLAUSE
	;

FROM_CLAUSE
	:	'From' QUERY_ID 'in' DATA_ORIGIN
	;

DATA_ORIGIN
	:	//Aqui entran las listas que se van a consultar, recuerdo que hay listas de objetos
	;

JOIN_CLAUSE
	:	'Join'  QUERY_ID DATA_ORIGIN 'on' QUERY_ID'.'ATTRIBUTE 'equals' QUERY_ID'.'ATTRIBUTE 
	;

ATTRIBUTE
	:	//Atributos de objetos ej. objeto.atrubuto
	;

WHERE_CLAUSE
	:	'Where'  QUERY_ID  WHERE_CONDITION  
	;

WHERE_CONDITION
	:	LOGIC_CONDITION ( WHERE_LOGIC_OPERATOR LOGIC_CONDITION )+
	;

WHERE_LOGIC_OPERATOR
	:	'&&'
	|	'||'
	;

LOGIC_CONDITION
	:	E ( LOGIC_OPERATOR E )+ 
	;
	
LOGIC_OPERATOR
	:	'>'
	|	'<'
	|	'>='
	|	'<='
	|	'=='
	|	'!='
	;

E
	: 	( ID (AP ID)+ )* 
	;

AP	
	:	'+'
	|	'-'
	|	'*'
	|	'/'
	;

GROUP_BY_CLAUSE
	:	//Solo aplica para listas de objetos mirar a ver si se puede validar
	;

ORDER_BY_CLAUSE
	:	//Solo aplica para listas de objetos mirar a ver si se puede validar
	;

SELECT_CLAUSE
	:
	;


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
    ;

INT 
	:	'0'..'9'+
   	;

FLOAT
   	:   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|   '.' ('0'..'9')+ EXPONENT?
    	|   ('0'..'9')+ EXPONENT
    	;

STRING
    	:  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    	;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
