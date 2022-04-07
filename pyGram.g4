grammar pyGram;

prog    : global main;

global  : declaration global
        | function global
        |
        ;

main: MAIN OPEN CLOSE COLON local BRACKET
;

local   : r_for loop BRACKET local
        | r_while loop BRACKET  local
        | r_if local BRACKET r_else local BRACKET local
        | r_if local BRACKET local
        | r_print local
        | r_input local
        | assigment local
        | function_call SEMI_COLON
        |
;

loop: r_for loop BRACKET loop
    | r_while loop BRACKET  loop
    | r_if loop BRACKET r_else loop BRACKET loop
    | r_if loop BRACKET loop
    | r_break loop
    | r_print loop
    | r_input loop
    | assigment loop
    | function_call SEMI_COLON
    |
    ;

local_f : r_for loop BRACKET local_f
        | r_while loop BRACKET  local_f
        | r_if local_f BRACKET r_else local_f BRACKET local_f
        | r_if local_f BRACKET local_f
        | r_print local_f
        | r_input local_f
        | assigment local_f
        | function_call SEMI_COLON
        | r_return local_f
        |
;

loop_f  : r_for loop_f BRACKET loop_f
        | r_while loop_f BRACKET  loop_f
        | r_if loop_f BRACKET r_else loop_f BRACKET loop_f
        | r_if loop_f BRACKET loop_f
        | r_break loop_f
        | r_print loop_f
        | r_input loop_f
        | assigment loop_f
        | function_call SEMI_COLON
        | r_return local_f
        |
        ;


function: DEF TYPE ID OPEN params CLOSE COLON local_f BRACKET
        | DEF VOID ID OPEN params CLOSE COLON local BRACKET
        ;

r_return : RETURN expr SEMI_COLON;

function_call: ID OPEN expr CLOSE
            ;

params  : TYPE ID params2
        |
        ;

params2 : COMMA TYPE ID params2
        |
        ;

// For each
r_for   : FOR ID IN RANGE OPEN expr COMMA expr CLOSE COLON
        | FOR ID IN RANGE OPEN expr CLOSE COLON
;

//while
r_while: WHILE expr COLON
;

r_break : BREAK SEMI_COLON;

// if
r_if: IF expr COLON
;

r_else  : ELSE COLON
        ;

// print
r_print : PRINT expr r_print2 SEMI_COLON
        ;

r_print2: COMMA expr
        |
        ;

declaration : TYPE ID ASSIGNMENT expr declaration2 SEMI_COLON
            | TYPE ID declaration2 SEMI_COLON
            ;

declaration2 : COMMA ID ASSIGNMENT expr declaration2
                | COMMA ID declaration2
                |
                ;

assigment   : ID ASSIGNMENT expr SEMI_COLON
            ;

expr: expr OR term
    | term
    ;

term: term AND term2
    | term2
    ;

term2   : term2 GT term3
        | term2 LT term3
        | term2 GE term3
        | term2 LE term3
        | term3
        ;

term3   : term3 EQ term4
        | term3 NE term4
        | term4
        ;

term4   : term4 PLUS term5
        | term4 MINUS term5
        | term5
        ;

term5   : term5 TIMES term6
        | term5 DIVIDES term6
        | term6
        ;
term6   : MINUS term6
        | term7
        ;

term7   : NOT factor
        | factor
        ;

factor  : OPEN expr CLOSE
        | ID
        | NUM
        | FLOAT_VALUE
        | STR_VALUE
        | BOOL_VALUE
        | r_input
        | function_call
        ;

r_input: INPUT OPEN CLOSE;

teste: STR_VALUE;

// Símbolo
//Operadores de atribuição
ASSIGNMENT: '=';

//Operadores relacionais
EQ: '==';
NE: '!=';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

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
TYPE: 'int'| 'boolean'|'string'|'float';
VOID: 'void';
//INT: 'int';
//FLOAT: 'float';
//STRING: 'string';
//BOOLEAN: 'boolean';

//Funções
PRINT: 'print';
INPUT: 'input';
RANGE: 'range';

//ID
ID: [a-zA-Z][a-zA-Z0-9]*;

//Valores
NUM: [0-9]+;
FLOAT_VALUE: [0-9]+[.][0-9]+;
STR_VALUE: ["]~["]*["];
BOOL_VALUE: 'True' | 'False';

WS: [ \t\r\n] -> skip;