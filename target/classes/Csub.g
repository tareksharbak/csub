grammar Csub;

options {
  language = Java;
}

@lexer::header {
    package com.compilers.parsers;
    
}
 
@parser::header {
    package com.compilers.parsers;
    import java.util.HashMap;
    import com.compilers.AST.*;
}

@members {
    /** Map variable name to Integer object holding value */
    HashMap symbolTable = new HashMap();
    AST ast = new AST();
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

/*
includes rule creates a sub tree with temporary root ASTNode and adds 
all its children (one token for each include) then it returns the root 
of this sub tree upwards (to program rule in this case). In the program 
rule you can access each of the sub rule's sub trees by saying 
$rule.node (e.g. $includes.node) so in this way the tree is built bottom up.
*/
program
    :
//        {ProgramNode programNode = new ProgramNode("programNode");
//        ast.set_root(programNode);}
        includes
        (   signature
        |   function 
        |   declaration // Global variable declaration
        )*
        main
        (declaration | function)*
        {System.out.println(((TokenNode)($includes.node.get_children().get(1))).get_Value());} // NO GLOBAL VAR NEEDED, BOTTOM UP
    ;

/*------------------------------------------------------------------
 * DEPTH 1
 *------------------------------------------------------------------*/
     
includes returns [ASTNode node]
    :
        (INCLUDESTART result+=INCLUDE)*
        {
            ASTNode parent = new ASTNode();
            for (Object token : $result)
            {
                TokenNode child = new TokenNode("INCLUDE", ((Token)token).getText());
                child.set_parent(parent);
                parent.addChild(child);
            }
            $node = parent;
        }
    ;
     
signature   
    :   
        (VOID | type ) IDENT OPENPARENT signatureArguments? CLOSEPARENT SEMICOLON
    ;       

function
    :
        (VOID | type) IDENT OPENPARENT arguments? CLOSEPARENT functionBody
    ;
    
declaration
    :
        (CONST? type ASTERISK? IDENT (EQUAL expression)? 
        (COMMA ASTERISK? IDENT (EQUAL expression)?)* 
        SEMICOLON)
        |
        arrayDeclaration
    ;
    
main
    :
        (VOID | type) MAIN OPENPARENT arguments? CLOSEPARENT functionBody
    ;

/*------------------------------------------------------------------
 * DEPTH 2
 *------------------------------------------------------------------*/

type 
    : 
        INT
    |   FLOAT
    |   CHAR
    ;

signatureArguments
    :
        VOID 
    |   type (COMMA type)*
    ;
    
arguments
    :
        type IDENT (COMMA type IDENT)*
    |   VOID
    ;
      
functionBody
    :
      OPENCURLY statement* CLOSECURLY
    ;
    
arrayDeclaration
    :
        type IDENT 
        (
            (OPENBRACKET INTVALUE CLOSEBRACKET)
            | 
            (
                (OPENBRACKET INTVALUE? CLOSEBRACKET) // 1-dim static array declaration
                (
                    EQUAL
                    (expression
                    |
                    OPENCURLY expression (COMMA expression)* CLOSECURLY) // Array initialization
                )
            )
        )
        SEMICOLON
    ; 

/*------------------------------------------------------------------
 * DEPTH 3
 *------------------------------------------------------------------*/
statement
    :
        SEMICOLON
    |   (INTVALUE | FLOATVALUE | CHARVALUE | TRUE | FALSE | AMPERSAND? IDENT | STRINGVALUE | OPENPARENT) => expression
    |   declaration // Local variable declaration 
    |   assignment
    |   ifControl
    |   forControl
    |   whileControl
    |   doWhileControl
    |   returnStmt
    |   BREAK SEMICOLON
    |   CONTINUE SEMICOLON
    ;

/*------------------------------------------------------------------
 * DEPTH 4
 *------------------------------------------------------------------*/
assignment
    :
        (ASTERISK? // optional dereferencing operator
        IDENT EQUAL expression SEMICOLON)
        |
        arrayAssignment
    ;
    
arrayAssignment
    :
        IDENT OPENBRACKET INTVALUE CLOSEBRACKET EQUAL expression SEMICOLON
    ;
    
ifControl
      :
        IF OPENPARENT expression CLOSEPARENT
        controlBody
        ((ELSE controlBody)=>ELSE controlBody)?
      ;
forControl
      :
        FOR OPENPARENT assignmentExpression SEMICOLON expression SEMICOLON stepExpression CLOSEPARENT
        controlBody
      ;
whileControl
      :
        WHILE OPENPARENT expression CLOSEPARENT
        controlBody
      ;
doWhileControl
      : DO
        controlBody
        WHILE OPENPARENT expression CLOSEPARENT SEMICOLON
      ;
      
returnStmt
      :
        RETURN (expression)? SEMICOLON
      ;
      
/*------------------------------------------------------------------
 * DEPTH 5
 *------------------------------------------------------------------*/
controlBody
      :
        (statement | OPENCURLY statement* CLOSECURLY)
      ;
      
assignmentExpression
      :
        (INT | FLOAT)? IDENT EQUAL expression
      ;
      
stepExpression
      :
        (IDENT (INCREMENT | DECREMENT)
        | IDENT (PLUS | MINUS) (expression)
        )
      ;
      
functionCall
      :
        IDENT OPENPARENT parameter? CLOSEPARENT
      ;
      
parameter
      :
        expression (COMMA expression)*
      ;
      
/*------------------------------------------------------------------
 * EXPRESSIONS
 * SYMBOLS: + - * / % ! ? : = , < > ( ) { } || && ==
 *------------------------------------------------------------------*/

expression : logical (QUESTION logical COLON logical)* ;

logical : relation ( (CONJUNCTION | DISJUNCTION) relation )* ;

relation : add ( (SMALLER | LARGER | EQUALITY) add)* ;

add : mult ((PLUS | MINUS)=>(PLUS | MINUS) mult)* ; 

mult : unary ( (ASTERISK | SLASH | PERCENT) unary)* ;

unary : (PLUS | MINUS | EXCLAMATION)* primary ;

primary 
    :   
        (IDENT OPENPARENT) => functionCall
    |   OPENPARENT expression CLOSEPARENT
    |   INTVALUE 
    |   FLOATVALUE 
    |   CHARVALUE 
    |   STRINGVALUE
    |   TRUE 
    |   FALSE
    |   AMPERSAND? IDENT // referencing operator
    ;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

EQUAL       : '=';
PLUS        : '+';
MINUS       : '-';
ASTERISK    : '*';
SLASH       : '/';
LARGER      : '>';
SMALLER     : '<';
OPENPARENT  : '(';
CLOSEPARENT : ')';
OPENCURLY   : '{';
CLOSECURLY  : '}';
OPENBRACKET : '[';
CLOSEBRACKET: ']';
SEMICOLON   : ';';
COMMA       : ',';
AMPERSAND   : '&';
PERCENT     : '%';
BAR         : '|';
EXCLAMATION : '!';
QUESTION    : '?';
COLON       : ':';
TRUE : 'true';
FALSE : 'false'; 
VOID : 'void';
CHAR : 'char';
INT : 'int';
FLOAT : 'float';
IF : 'if';
ELSE : 'else';
DO : 'do';
WHILE : 'while';
FOR : 'for';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';
CONST : 'const';
MAIN : 'main';
EQUALITY : EQUAL EQUAL;
INCREMENT : PLUS PLUS;
DECREMENT : MINUS MINUS;
CONJUNCTION : AMPERSAND AMPERSAND;
DISJUNCTION : BAR BAR;
INCLUDESTART : '#include';
INCLUDE : (SMALLER |'"') (LETTER | DIGIT)+ '.h'? (LARGER |'"');
INTVALUE : DIGIT+ ;
FLOATVALUE  : DIGIT+ '.' DIGIT+;
STRINGVALUE : '\"' ~('"')* '\"' ;
CHARVALUE  : '\'' . '\'' ;
IDENT : LETTER (LETTER | DIGIT)*;
MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
fragment LETTER : ('a'..'z' | 'A'..'Z' | '_') ;
fragment DIGIT : '0'..'9';