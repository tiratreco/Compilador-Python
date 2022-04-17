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
    : expr OR term #or_logic
    | term #e_term
    ;

term returns [type]
    : term AND term2 #and_logic
    | term2 #e_term2
    ;

term2   returns [type]
        : term2 (GT | LT | LE | GE) term3 #comp_logic
        | term3 #e_term3
        ;

term3   returns [type]
        : term3 (EQ | NE) term4 #eq_logic
        | term4 #e_term4
        ;

term4   returns [type]
        : term4 (PLUS | MINUS) term5 #sum_minus
        | term5 #e_term5
        ;

term5   returns [type]
        : term5 (TIMES | DIVIDES) term6 #time_div
        | term6 #e_term6
        ;

term6 returns [type]
        : op=(MINUS | NOT) term6 #minus_not
        | factor #e_factor
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