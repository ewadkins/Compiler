
/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this folder
 * (src/expressivo/parser) and run the following command:
 *
 * java -jar ../../../../lib/antlr-4.5.3-complete.jar Compiler.g4
 *
 * PS3 instructions: you are free to change this grammar.
 */

grammar Compiler;
import Configuration;

/*
 * Nonterminal rules (a.k.a. parser rules) must be lowercase, e.g. "root" and "sum" below.
 *
 * Terminal rules (a.k.a. lexical rules) must be UPPERCASE, e.g. NUMBER below.
 * Terminals can be defined with quoted strings or regular expressions.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special token
 * EOF so that it describes the entire input. Below, "root" is the start rule.
 *
 * For more information, see reading 18 about parser generators, which explains
 * how to use Antlr and has links to reference information.
 */

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

expression: ('(' expression ')' | operand | operation);
operand: number | string | character | array | variable;

// Operations
operation: call;
call: (weak_terms | bit_or) ('(' (((weak_terms | bit_or) ',')* (weak_terms | bit_or))? ')')?;
bit_or: (weak_terms | bit_xor) ('|' (weak_terms | bit_xor))?;
bit_xor: (weak_terms | bit_and) ('^' (weak_terms | bit_and))?;
bit_and: (weak_terms | or) ('&' (weak_terms | or))?;
or: (weak_terms | and) ('||' (weak_terms | and))*;
and: (weak_terms | less_than) ('&&' (weak_terms | less_than))*;
less_than: (weak_terms | greater_than) ('<' (weak_terms | greater_than))?;
greater_than: (weak_terms | less_than_equal) ('>' (weak_terms | less_than_equal))?;
less_than_equal: (weak_terms | greater_than_equal) ('<=' (weak_terms | greater_than_equal))?;
greater_than_equal: (weak_terms | not_equal) ('>=' (weak_terms | not_equal))?;
not_equal: (weak_terms | equal) ('!=' (weak_terms | equal))?;
equal: (weak_terms | bit_right) ('==' (weak_terms | bit_right))?;
bit_right: (weak_terms | bit_left) ('>>' (weak_terms | bit_left))?;
bit_left: (weak_terms | difference) ('<<' (weak_terms | difference))?;
difference: (weak_terms | sum) ('-' (weak_terms | sum))*;
sum: (weak_terms | modulus) ('+' (weak_terms | modulus))*;
modulus: (strong_terms | quotient) ('%' (strong_terms | quotient))?;
quotient: (strong_terms | product) ('/' (strong_terms | product))*;
product: (strong_terms | power) ('*' (strong_terms | power))*;
power: (strong_terms | subscript) ('**' (strong_terms | subscript))?;
subscript: (strong_terms) ('[' (strong_terms) ']')?;

strong_terms: unary_operation | weak_terms;
weak_terms: '(' expression ')' | operand;

unary_operation: increment_postfix | decrement_postfix | increment_prefix | decrement_prefix | negate | not | bit_not;
increment_postfix: weak_terms '++';
decrement_postfix: weak_terms '--';
increment_prefix: '++' weak_terms;
decrement_prefix: '--' weak_terms;
negate: '-' weak_terms;
not: '!' weak_terms;
bit_not: '~' weak_terms;

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
