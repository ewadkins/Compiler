
/**
 *
 * java -jar ../../../../lib/antlr-4.5.3-complete.jar Compiler.g4
 *
 */

grammar Compiler;
import Configuration;


root: element* EOF;

element: statement | block_element;

statement: (basic_statement | flow_statement) ';';
basic_statement: declaration | instantiation | assignment | discarded_statement;
flow_statement: return_statement | break_statement | continue_statement;
block_element: if_statement | else_if_statement | else_statement | for_loop | while_loop | do_while_loop
    | function | block;
block: '{' element* '}';

//native_block: NATIVE '{' .*? '}';
//NATIVE: 'native';

declaration: type variable;
instantiation: type variable '=' expression;
assignment: direct_assign | sum_assign | difference_assign | product_assign | quotient_assign | modulus_assign
    | power_assign | bit_left_assign | bit_right_assign | bit_and_assign | bit_xor_assign | bit_or_assign;
discarded_statement: expression;
return_statement: RETURN expression;
break_statement: BREAK;
continue_statement: CONTINUE;

RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

direct_assign: variable '=' expression;
sum_assign: variable '+=' expression;
difference_assign: variable '-=' expression;
product_assign: variable '*=' expression;
quotient_assign: variable '/=' expression;
modulus_assign: variable '%=' expression;
power_assign: variable '**=' expression;
bit_left_assign: variable '<<=' expression;
bit_right_assign: variable '<<=' expression;
bit_and_assign: variable '&=' expression;
bit_xor_assign: variable '^=' expression;
bit_or_assign: variable '|=' expression;

if_statement: IF '(' expression ')' element;
else_if_statement: ELSE IF '(' expression? ')' element;
else_statement: ELSE element;
IF: 'if';
ELSE: 'else';

for_loop: FOR '(' initialization? ';' condition? ';' update? ')' element;
while_loop: WHILE '(' condition? ')' element;
do_while_loop: DO element WHILE '(' condition? ')' ';';

initialization: basic_statement;
condition: expression;
update: declaration | instantiation | assignment | discarded_statement; // any basic_statement except declaration
FOR: 'for';
WHILE: 'while';
DO: 'do';

function: type variable ('(' ((type variable ',')* type variable)? ')') element;

expression
    : '(' expression ')'
    | number | string | character | bool | array | variable
    | expression postfix_call_subscript
    | prefix_unary expression
    | cast expression
    | expression pow_root expression
    | expression mult_div_mod expression
    | expression add_sub expression
    | expression bitleft_right expression
    | expression less_greater expression
    | expression equal_notequal expression
    | expression bitand expression
    | expression bitxor expression
    | expression bitor expression
    | expression and expression
    | expression or expression;

postfix_call_subscript: '++' | '--' | '(' ((expression ',')* expression)? ')' | '[' expression ']';
prefix_unary: '++' | '--' | '+' | '-' | '!' | '~';
cast: '(' type ')';
pow_root: '**' | '//';
mult_div_mod: '*' | '/' | '%';
add_sub: '+' | '-';
bitleft_right: '<<' | '>>';
less_greater: '<' | '<=' | '>' | '>=';
equal_notequal: '==' | '!=' | '===';
bitand: '&';
bitxor: '^';
bitor: '|';
and: '&&';
or: '||';

type: TYPE '[]'?;
variable: VARIABLE;
number: NUMBER;
string: STRING;
character: CHARACTER;
bool: BOOLEAN;
array: '[' ((expression ',')* expression)? ']';

TYPE: 'char' | 'unsigned char' | 'signed char'
    | 'int' | 'unsigned int' | 'signed int'
    | 'short int' | 'unsigned short int' | 'signed short int'
    | 'long int' | 'unsigned long int' | 'signed long int'
    | 'float' | 'double' | 'long double' | 'wchar_t'
    | 'boolean' | 'void'
    | 'string';
NUMBER: [0-9]+ (',' [0-9]+)* ('.' [0-9]*)?;
STRING: '"' ('\"' | .)*? ~[\\] '"' | '""'; // Matches anything in double quotes. Allows for escaped double quote character.
CHARACTER: '\'' '\\'? . '\'' | '\'\'';
BOOLEAN: 'true' | 'false';

// Must be at the end to allow catching of keywords first
VARIABLE: [_a-zA-Z] [_a-zA-Z0-9]*;

/* Tell Antlr to ignore spaces around tokens. */
WHITESPACE : [ \t\r\n]+ -> skip;
