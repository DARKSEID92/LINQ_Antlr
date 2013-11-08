grammar Linq;
program	:	initial+
	;

initial	:	expr final
	|	MA expr final
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
	|	QUERY_VAR
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

QUERY_VAR 
	:	'var' ID '=' QUERY
	;

QUERY	
	:	FROM_CLAUSE JOIN_CLAUSE WHERE_CLAUSE GROUP_BY_CLAUSE ORDER_BY_CLAUSE SELECT_CLAUSE
	;

FROM_CLAUSE
	:	FROM_CLAUSE
	|	FROM
	;

FROM	
	:	'From' ID 'in'  DATA_ORIGIN
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
    
