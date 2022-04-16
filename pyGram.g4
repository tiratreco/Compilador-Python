grammar pyGram;

prog: declaration* function* main;

main: MAIN OPEN CLOSE COLON local BRACKET
;

local   : r_for local
        | r_break local
        | r_while local
        | r_if r_else? local
        | r_print local
        | assigment local
        | function_call SEMI_COLON local
        | r_return local
        |
;

function: DEF TYPE ID OPEN (TYPE ID (COMMA TYPE ID)*)? CLOSE COLON local BRACKET #l_type
        | DEF VOID ID OPEN (TYPE ID (COMMA TYPE ID)*)? CLOSE COLON local BRACKET #l_void
        ;

r_return : RETURN expr? SEMI_COLON
;

function_call returns [type]: ID OPEN (expr (COMMA expr)*)? CLOSE
;

// For each
r_for: FOR ID IN RANGE OPEN (expr COMMA)? expr CLOSE COLON local BRACKET
;

//while
r_while: WHILE expr COLON local BRACKET
;

r_break : BREAK SEMI_COLON
;

// if
r_if: IF expr COLON local BRACKET
;

r_else: ELSE COLON local BRACKET
;

// print
r_print: PRINT (expr (COMMA expr)*)? SEMI_COLON
;

declaration: TYPE ID (ASSIGNMENT expr)? (COMMA ID (ASSIGNMENT expr)?)* SEMI_COLON;

assigment: ID ASSIGNMENT expr SEMI_COLON
;

expr returns [type]
    : expr OR term
    | term
    ;

term: term AND term2
    | term2
    ;

term2   : term2 (GT | LT | LE | GE) term3
        | term3
        ;

term3   : term3 (EQ | NE) term4
        | term4
        ;

term4   : term4 (PLUS | MINUS) term5
        | term5
        ;

term5   : term5 (TIMES | DIVIDES) term6
        | term6
        ;

term6   : (MINUS | NOT) term6
        | factor
        ;

factor  returns [type]
        : OPEN expr CLOSE #l_expr// expr.type
        | ID #l_id//symbol_table
        | INT_VALUE #l_int_value //integer
        | FLOAT_VALUE #l_float_value//float
        | STR_VALUE #l_str_value//string
        | BOOL_VALUE #l_bool_value// boolean
        | r_input #l_input//string
        | function_call #l_function_call//function_call.type
        ;

r_input: INPUT OPEN CLOSE
;

// Símbolo
//Operadores de atribuição
ASSIGNMENT: '=';

//Operadores relacionais
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

EQ: '==';
NE: '!=';

//Operadores aritméticos
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDES: '/';

//Pontuação
COMMA: ',';
COLON: ':';
SEMI_COLON: ';';
OPEN: '(';
CLOSE: ')';
BRACKET: '}';

// P.R.
//Operadores lógicos
OR: 'or';
AND: 'and';
NOT: 'not';

//Comandos
FOR: 'for';
BREAK: 'break';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
IN: 'in';
DEF: 'def';
MAIN: 'main';
RETURN: 'return';

//tipos
VOID: 'void';
TYPE: 'int'
    | 'float'
    | 'string'
    | 'boolean';

//Funções
PRINT: 'print';
INPUT: 'input';
RANGE: 'range';

//ID
ID: [a-zA-Z][a-zA-Z0-9]*;

//Valores
INT_VALUE: [0-9]+;
FLOAT_VALUE: [0-9]+[.][0-9]+;
STR_VALUE: ["]~["]*["];
BOOL_VALUE: 'True' | 'False';

WS: [ \t\r\n] -> skip;