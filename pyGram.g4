grammar pyGram;

prog    : prog2;

prog2   : r_for prog2
        | r_if prog2
        | r_while prog2
        | r_print prog2
        | assigment prog2
        |;

prog2_ind : TAB prog2;

// For each
r_for: FOR ID IN RANGE OPEN b_expr COMMA b_expr CLOSE COLON NL prog2_ind
;

// if
r_if: IF b_expr COLON NL prog2_ind
;

//while
r_while: WHILE b_expr COLON NL prog2_ind
;

// print
r_print: PRINT OPEN b_expr CLOSE //???
;

// Atribuição
assigment: assigment2 b_expr NL
;

assigment2: ID COMMA assigment2 b_expr COMMA
            | ID ASSIGNMENT
            ;

b_expr  : b_expr OR b_term
        | b_term
        ;

b_term  : b_term AND b_factor
        | b_factor
        ;

b_factor: NOT b_factor
        | c_expr
        ;

c_expr  : c_expr EQ expr
        | c_expr GT expr
        | c_expr LT expr
        | c_expr GE expr
        | c_expr LE expr
        | expr
        ;

expr: expr PLUS term
    | expr MINUS term
    | term
    ;

term: term TIMES factor
    | term DIVIDES factor
    | term MODULUS factor
    | factor
    ;

factor  : OPEN expr CLOSE
        | ID
        | NUM
        ;

// Símbolo
//Operadores de atribuição
ASSIGNMENT: '=';

//Operadores relacionais
EQ: '==';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

//Operadores aritméticos
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDES: '/';
MODULUS: '%';

//Pontuação
COMMA: ',';
COLON: ':';
OPEN: '(';
CLOSE: ')';

// P.R.
//Operadores lógicos
OR: 'or';
AND: 'and';
NOT: 'not';

//Comandos
FOR: 'for';
IF: 'if';
WHILE: 'while';
IN: 'in';

//Funções
PRINT: 'print';
RANGE: 'range';

//ID
ID: [a-zA-Z][a-zA-Z0-9]*;
//Número
NUM: [0-9]+;

TAB: '    ';

NL: '\n';

WS: [ \t\r] -> skip;