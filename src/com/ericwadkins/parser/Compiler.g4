
/**
 *
 * java -jar ../../../../lib/antlr-4.5.3-complete.jar Compiler.g4
 *
 */

grammar Compiler;
import Configuration;


root: element* EOF;

element: basic_element | block_element;

basic_element: (declaration | instantiation | assignment | discarded_statement | return_statement) ';';
block_element: if_statement | else_if_statement | else_statement | function | block | native_block;

block: '{' element* '}';
native_block: NATIVE '{' .*? '}';

NATIVE: 'native';

declaration: type variable;
instantiation: type variable '=' expression;
discarded_statement: expression;

assignment: direct_assign | sum_assign | difference_assign | product_assign | quotient_assign | modulus_assign
    | power_assign | bit_left_assign | bit_right_assign | bit_and_assign | bit_xor_assign | bit_or_assign;

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
else_if_statement: ELSE IF '(' expression ')' element;
else_statement: ELSE element;
IF: 'if';
ELSE: 'else';

for_loop: FOR '(' expression ')' element;
while_loop: WHILE '(' expression ')' element;
FOR: 'for';
WHILE: 'while';

function: type variable ('(' ((type variable ',')* type variable)? ')') element;
return_statement: RETURN expression;
RETURN: 'return';

expression
    : '(' expression ')'
    | number | string | character | array | variable
    | expression postfix_call_subscript
    | prefix_unary expression
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
pow_root: '**' | '//';
mult_div_mod: '*' | '/' | '%';
add_sub: '+' | '-';
bitleft_right: '<<' | '>>';
less_greater: '<' | '<=' | '>' | '>=';
equal_notequal: '==' | '!=';
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
array: '[' ((expression ',')* expression)? ']';

TYPE: 'char' | 'unsigned char' | 'signed char'
    | 'int' | 'unsigned int' | 'signed int'
    | 'short int' | 'unsigned short int' | 'signed short int'
    | 'long int' | 'unsigned long int' | 'signed long int'
    | 'float' | 'double' | 'long double' | 'wchar_t'
    | 'bool' | 'void'
    | 'string';
VARIABLE: [_a-zA-Z] [_a-zA-Z0-9]*;
NUMBER: [0-9]+ (',' [0-9]+)* ('.' [0-9]*)?;
STRING: '"' ('\"' | .)*? ~[\\] '"' | '""'; // Matches anything in double quotes. Allows for escaped double quote character.
CHARACTER: '\'' '\\'? . '\'' | '\'\'';

/* Tell Antlr to ignore spaces around tokens. */
WHITESPACE : [ \t\r\n]+ -> skip;
