// $ANTLR 3.4 C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g 2013-04-16 22:03:20

    package com.compilers.parsers;
    import java.util.HashMap;
    import com.compilers.AST.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CsubParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPERSAND", "ASTERISK", "BAR", "BREAK", "CHAR", "CHARVALUE", "CLOSEBRACKET", "CLOSECURLY", "CLOSEPARENT", "COLON", "COMMA", "COMMENT", "CONJUNCTION", "CONST", "CONTINUE", "DECREMENT", "DIGIT", "DISJUNCTION", "DO", "ELSE", "EQUAL", "EQUALITY", "EXCLAMATION", "FALSE", "FLOAT", "FLOATVALUE", "FOR", "IDENT", "IF", "INCLUDE", "INCLUDESTART", "INCREMENT", "INT", "INTVALUE", "LARGER", "LETTER", "MAIN", "MINUS", "MULTILINE_COMMENT", "OPENBRACKET", "OPENCURLY", "OPENPARENT", "PERCENT", "PLUS", "QUESTION", "RETURN", "SEMICOLON", "SLASH", "SMALLER", "STRINGVALUE", "TRUE", "VOID", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int ASTERISK=5;
    public static final int BAR=6;
    public static final int BREAK=7;
    public static final int CHAR=8;
    public static final int CHARVALUE=9;
    public static final int CLOSEBRACKET=10;
    public static final int CLOSECURLY=11;
    public static final int CLOSEPARENT=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int COMMENT=15;
    public static final int CONJUNCTION=16;
    public static final int CONST=17;
    public static final int CONTINUE=18;
    public static final int DECREMENT=19;
    public static final int DIGIT=20;
    public static final int DISJUNCTION=21;
    public static final int DO=22;
    public static final int ELSE=23;
    public static final int EQUAL=24;
    public static final int EQUALITY=25;
    public static final int EXCLAMATION=26;
    public static final int FALSE=27;
    public static final int FLOAT=28;
    public static final int FLOATVALUE=29;
    public static final int FOR=30;
    public static final int IDENT=31;
    public static final int IF=32;
    public static final int INCLUDE=33;
    public static final int INCLUDESTART=34;
    public static final int INCREMENT=35;
    public static final int INT=36;
    public static final int INTVALUE=37;
    public static final int LARGER=38;
    public static final int LETTER=39;
    public static final int MAIN=40;
    public static final int MINUS=41;
    public static final int MULTILINE_COMMENT=42;
    public static final int OPENBRACKET=43;
    public static final int OPENCURLY=44;
    public static final int OPENPARENT=45;
    public static final int PERCENT=46;
    public static final int PLUS=47;
    public static final int QUESTION=48;
    public static final int RETURN=49;
    public static final int SEMICOLON=50;
    public static final int SLASH=51;
    public static final int SMALLER=52;
    public static final int STRINGVALUE=53;
    public static final int TRUE=54;
    public static final int VOID=55;
    public static final int WHILE=56;
    public static final int WS=57;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CsubParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CsubParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CsubParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g"; }


        /** Map variable name to Integer object holding value */
        HashMap symbolTable = new HashMap();
        AST ast = new AST();



    // $ANTLR start "program"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:28:1: program : includes ( signature | function | declaration )* main ( declaration | function )* ;
    public final void program() throws RecognitionException {
        ArrayList<TokenNode> includes1 =null;


        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:29:5: ( includes ( signature | function | declaration )* main ( declaration | function )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:32:9: includes ( signature | function | declaration )* main ( declaration | function )*
            {
            pushFollow(FOLLOW_includes_in_program66);
            includes1=includes();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:33:9: ( signature | function | declaration )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case VOID:
                    {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==IDENT) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==OPENPARENT) ) {
                            switch ( input.LA(4) ) {
                            case VOID:
                                {
                                int LA1_8 = input.LA(5);

                                if ( (LA1_8==CLOSEPARENT) ) {
                                    int LA1_10 = input.LA(6);

                                    if ( (LA1_10==SEMICOLON) ) {
                                        alt1=1;
                                    }
                                    else if ( (LA1_10==OPENCURLY) ) {
                                        alt1=2;
                                    }


                                }


                                }
                                break;
                            case CHAR:
                            case FLOAT:
                            case INT:
                                {
                                int LA1_9 = input.LA(5);

                                if ( (LA1_9==CLOSEPARENT||LA1_9==COMMA) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_9==IDENT) ) {
                                    alt1=2;
                                }


                                }
                                break;
                            case CLOSEPARENT:
                                {
                                int LA1_10 = input.LA(5);

                                if ( (LA1_10==SEMICOLON) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_10==OPENCURLY) ) {
                                    alt1=2;
                                }


                                }
                                break;

                            }

                        }


                    }


                    }
                    break;
                case CHAR:
                case FLOAT:
                case INT:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==IDENT) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==OPENPARENT) ) {
                            switch ( input.LA(4) ) {
                            case VOID:
                                {
                                int LA1_8 = input.LA(5);

                                if ( (LA1_8==CLOSEPARENT) ) {
                                    int LA1_10 = input.LA(6);

                                    if ( (LA1_10==SEMICOLON) ) {
                                        alt1=1;
                                    }
                                    else if ( (LA1_10==OPENCURLY) ) {
                                        alt1=2;
                                    }


                                }


                                }
                                break;
                            case CHAR:
                            case FLOAT:
                            case INT:
                                {
                                int LA1_9 = input.LA(5);

                                if ( (LA1_9==CLOSEPARENT||LA1_9==COMMA) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_9==IDENT) ) {
                                    alt1=2;
                                }


                                }
                                break;
                            case CLOSEPARENT:
                                {
                                int LA1_10 = input.LA(5);

                                if ( (LA1_10==SEMICOLON) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_10==OPENCURLY) ) {
                                    alt1=2;
                                }


                                }
                                break;

                            }

                        }
                        else if ( (LA1_6==COMMA||LA1_6==EQUAL||LA1_6==OPENBRACKET||LA1_6==SEMICOLON) ) {
                            alt1=3;
                        }


                    }
                    else if ( (LA1_2==ASTERISK) ) {
                        alt1=3;
                    }


                    }
                    break;
                case CONST:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:33:13: signature
            	    {
            	    pushFollow(FOLLOW_signature_in_program80);
            	    signature();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:34:13: function
            	    {
            	    pushFollow(FOLLOW_function_in_program94);
            	    function();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:35:13: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program109);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_main_in_program131);
            main();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:38:9: ( declaration | function )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case CONST:
                    {
                    alt2=1;
                    }
                    break;
                case CHAR:
                case FLOAT:
                case INT:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==ASTERISK) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==IDENT) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==OPENPARENT) ) {
                            alt2=2;
                        }
                        else if ( (LA2_5==COMMA||LA2_5==EQUAL||LA2_5==OPENBRACKET||LA2_5==SEMICOLON) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case VOID:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:38:10: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program142);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:38:24: function
            	    {
            	    pushFollow(FOLLOW_function_in_program146);
            	    function();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                    ast.set_root(new ProgramNode(includes1));
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "includes"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:49:1: includes returns [ArrayList<TokenNode> result] : ( INCLUDESTART incs+= INCLUDE )* ;
    public final ArrayList<TokenNode> includes() throws RecognitionException {
        ArrayList<TokenNode> result = null;


        Token incs=null;
        List list_incs=null;

        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:50:5: ( ( INCLUDESTART incs+= INCLUDE )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:51:9: ( INCLUDESTART incs+= INCLUDE )*
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:51:9: ( INCLUDESTART incs+= INCLUDE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==INCLUDESTART) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:51:10: INCLUDESTART incs+= INCLUDE
            	    {
            	    match(input,INCLUDESTART,FOLLOW_INCLUDESTART_in_includes197); if (state.failed) return result;

            	    incs=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_includes201); if (state.failed) return result;
            	    if (list_incs==null) list_incs=new ArrayList();
            	    list_incs.add(incs);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                        result = new ArrayList<TokenNode>();
                        for (Object token : list_incs)
                        {
                            TokenNode tokenNode = new TokenNode("INCLUDE", ((Token)token).getText());
                            result.add(tokenNode);
            //                child.set_parent(parent);
            //                parent.addChild(child);
                        }
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "includes"



    // $ANTLR start "signature"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:64:1: signature : ( VOID | type ) IDENT OPENPARENT ( signatureArguments )? CLOSEPARENT SEMICOLON ;
    public final void signature() throws RecognitionException {
        Token VOID2=null;
        CsubParser.type_return type3 =null;


        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:65:5: ( ( VOID | type ) IDENT OPENPARENT ( signatureArguments )? CLOSEPARENT SEMICOLON )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:9: ( VOID | type ) IDENT OPENPARENT ( signatureArguments )? CLOSEPARENT SEMICOLON
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:9: ( VOID | type )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VOID) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHAR||LA4_0==FLOAT||LA4_0==INT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:10: VOID
                    {
                    VOID2=(Token)match(input,VOID,FOLLOW_VOID_in_signature250); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:17: type
                    {
                    pushFollow(FOLLOW_type_in_signature254);
                    type3=type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_signature258); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_signature260); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:41: ( signatureArguments )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CHAR||LA5_0==FLOAT||LA5_0==INT||LA5_0==VOID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:66:41: signatureArguments
                    {
                    pushFollow(FOLLOW_signatureArguments_in_signature262);
                    signatureArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_signature265); if (state.failed) return ;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_signature267); if (state.failed) return ;

            if ( state.backtracking==0 ) {System.out.println((VOID2!=null?VOID2.getText():null));
                    System.out.println((type3!=null?input.toString(type3.start,type3.stop):null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "signature"



    // $ANTLR start "function"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:71:1: function : ( VOID | type ) IDENT OPENPARENT ( arguments )? CLOSEPARENT functionBody ;
    public final void function() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:72:5: ( ( VOID | type ) IDENT OPENPARENT ( arguments )? CLOSEPARENT functionBody )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:9: ( VOID | type ) IDENT OPENPARENT ( arguments )? CLOSEPARENT functionBody
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:9: ( VOID | type )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VOID) ) {
                alt6=1;
            }
            else if ( (LA6_0==CHAR||LA6_0==FLOAT||LA6_0==INT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:10: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_function310); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:17: type
                    {
                    pushFollow(FOLLOW_type_in_function314);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_function317); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_function319); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:40: ( arguments )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==INT||LA7_0==VOID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:73:40: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function321);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_function324); if (state.failed) return ;

            pushFollow(FOLLOW_functionBody_in_function326);
            functionBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function"



    // $ANTLR start "declaration"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:76:1: declaration : ( ( ( CONST )? type ( ASTERISK )? IDENT ( EQUAL expression )? ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )* SEMICOLON ) | arrayDeclaration );
    public final void declaration() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:77:5: ( ( ( CONST )? type ( ASTERISK )? IDENT ( EQUAL expression )? ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )* SEMICOLON ) | arrayDeclaration )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CONST) ) {
                alt14=1;
            }
            else if ( (LA14_0==CHAR||LA14_0==FLOAT||LA14_0==INT) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==ASTERISK) ) {
                    alt14=1;
                }
                else if ( (LA14_2==IDENT) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==COMMA||LA14_3==EQUAL||LA14_3==SEMICOLON) ) {
                        alt14=1;
                    }
                    else if ( (LA14_3==OPENBRACKET) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:9: ( ( CONST )? type ( ASTERISK )? IDENT ( EQUAL expression )? ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )* SEMICOLON )
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:9: ( ( CONST )? type ( ASTERISK )? IDENT ( EQUAL expression )? ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )* SEMICOLON )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:10: ( CONST )? type ( ASTERISK )? IDENT ( EQUAL expression )? ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )* SEMICOLON
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:10: ( CONST )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==CONST) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:10: CONST
                            {
                            match(input,CONST,FOLLOW_CONST_in_declaration356); if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_in_declaration359);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:22: ( ASTERISK )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ASTERISK) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:22: ASTERISK
                            {
                            match(input,ASTERISK,FOLLOW_ASTERISK_in_declaration361); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENT,FOLLOW_IDENT_in_declaration364); if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:38: ( EQUAL expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EQUAL) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:78:39: EQUAL expression
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_declaration367); if (state.failed) return ;

                            pushFollow(FOLLOW_expression_in_declaration369);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:9: ( COMMA ( ASTERISK )? IDENT ( EQUAL expression )? )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:10: COMMA ( ASTERISK )? IDENT ( EQUAL expression )?
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_declaration383); if (state.failed) return ;

                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:16: ( ASTERISK )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==ASTERISK) ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:16: ASTERISK
                    	            {
                    	            match(input,ASTERISK,FOLLOW_ASTERISK_in_declaration385); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    match(input,IDENT,FOLLOW_IDENT_in_declaration388); if (state.failed) return ;

                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:32: ( EQUAL expression )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==EQUAL) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:79:33: EQUAL expression
                    	            {
                    	            match(input,EQUAL,FOLLOW_EQUAL_in_declaration391); if (state.failed) return ;

                    	            pushFollow(FOLLOW_expression_in_declaration393);
                    	            expression();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration408); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:82:9: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_declaration429);
                    arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "main"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:85:1: main : ( VOID | type ) MAIN OPENPARENT ( arguments )? CLOSEPARENT functionBody ;
    public final void main() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:86:5: ( ( VOID | type ) MAIN OPENPARENT ( arguments )? CLOSEPARENT functionBody )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:9: ( VOID | type ) MAIN OPENPARENT ( arguments )? CLOSEPARENT functionBody
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:9: ( VOID | type )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==VOID) ) {
                alt15=1;
            }
            else if ( (LA15_0==CHAR||LA15_0==FLOAT||LA15_0==INT) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:10: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_main459); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:17: type
                    {
                    pushFollow(FOLLOW_type_in_main463);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,MAIN,FOLLOW_MAIN_in_main466); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_main468); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:39: ( arguments )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CHAR||LA16_0==FLOAT||LA16_0==INT||LA16_0==VOID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:87:39: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_main470);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_main473); if (state.failed) return ;

            pushFollow(FOLLOW_functionBody_in_main475);
            functionBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "main"


    public static class type_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "type"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:94:1: type : ( INT | FLOAT | CHAR );
    public final CsubParser.type_return type() throws RecognitionException {
        CsubParser.type_return retval = new CsubParser.type_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:95:5: ( INT | FLOAT | CHAR )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            {
            if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"



    // $ANTLR start "signatureArguments"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:101:1: signatureArguments : ( VOID | type ( COMMA type )* );
    public final void signatureArguments() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:102:5: ( VOID | type ( COMMA type )* )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==VOID) ) {
                alt18=1;
            }
            else if ( (LA18_0==CHAR||LA18_0==FLOAT||LA18_0==INT) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:103:9: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_signatureArguments549); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:104:9: type ( COMMA type )*
                    {
                    pushFollow(FOLLOW_type_in_signatureArguments560);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:104:14: ( COMMA type )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:104:15: COMMA type
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_signatureArguments563); if (state.failed) return ;

                    	    pushFollow(FOLLOW_type_in_signatureArguments565);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "signatureArguments"



    // $ANTLR start "arguments"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:107:1: arguments : ( type IDENT ( COMMA type IDENT )* | VOID );
    public final void arguments() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:108:5: ( type IDENT ( COMMA type IDENT )* | VOID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CHAR||LA20_0==FLOAT||LA20_0==INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==VOID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:109:9: type IDENT ( COMMA type IDENT )*
                    {
                    pushFollow(FOLLOW_type_in_arguments596);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_arguments598); if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:109:20: ( COMMA type IDENT )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:109:21: COMMA type IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments601); if (state.failed) return ;

                    	    pushFollow(FOLLOW_type_in_arguments603);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,IDENT,FOLLOW_IDENT_in_arguments605); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:110:9: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_arguments617); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arguments"



    // $ANTLR start "functionBody"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:113:1: functionBody : OPENCURLY ( statement )* CLOSECURLY ;
    public final void functionBody() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:114:5: ( OPENCURLY ( statement )* CLOSECURLY )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:115:7: OPENCURLY ( statement )* CLOSECURLY
            {
            match(input,OPENCURLY,FOLLOW_OPENCURLY_in_functionBody646); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:115:17: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= AMPERSAND && LA21_0 <= ASTERISK)||(LA21_0 >= BREAK && LA21_0 <= CHARVALUE)||(LA21_0 >= CONST && LA21_0 <= CONTINUE)||LA21_0==DO||(LA21_0 >= EXCLAMATION && LA21_0 <= IF)||(LA21_0 >= INT && LA21_0 <= INTVALUE)||LA21_0==MINUS||LA21_0==OPENPARENT||LA21_0==PLUS||(LA21_0 >= RETURN && LA21_0 <= SEMICOLON)||(LA21_0 >= STRINGVALUE && LA21_0 <= TRUE)||LA21_0==WHILE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:115:17: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody648);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,CLOSECURLY,FOLLOW_CLOSECURLY_in_functionBody651); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionBody"



    // $ANTLR start "arrayDeclaration"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:118:1: arrayDeclaration : type IDENT ( ( OPENBRACKET INTVALUE CLOSEBRACKET ) | ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) ) ) SEMICOLON ;
    public final void arrayDeclaration() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:119:5: ( type IDENT ( ( OPENBRACKET INTVALUE CLOSEBRACKET ) | ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) ) ) SEMICOLON )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:120:9: type IDENT ( ( OPENBRACKET INTVALUE CLOSEBRACKET ) | ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) ) ) SEMICOLON
            {
            pushFollow(FOLLOW_type_in_arrayDeclaration680);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENT,FOLLOW_IDENT_in_arrayDeclaration682); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:121:9: ( ( OPENBRACKET INTVALUE CLOSEBRACKET ) | ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OPENBRACKET) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==INTVALUE) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==CLOSEBRACKET) ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4==EQUAL) ) {
                            alt25=2;
                        }
                        else if ( (LA25_4==SEMICOLON) ) {
                            alt25=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA25_1==CLOSEBRACKET) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:122:13: ( OPENBRACKET INTVALUE CLOSEBRACKET )
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:122:13: ( OPENBRACKET INTVALUE CLOSEBRACKET )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:122:14: OPENBRACKET INTVALUE CLOSEBRACKET
                    {
                    match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_arrayDeclaration708); if (state.failed) return ;

                    match(input,INTVALUE,FOLLOW_INTVALUE_in_arrayDeclaration710); if (state.failed) return ;

                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_arrayDeclaration712); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:124:13: ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) )
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:124:13: ( ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) ) )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:125:17: ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET ) ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) )
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:125:17: ( OPENBRACKET ( INTVALUE )? CLOSEBRACKET )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:125:18: OPENBRACKET ( INTVALUE )? CLOSEBRACKET
                    {
                    match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_arrayDeclaration761); if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:125:30: ( INTVALUE )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==INTVALUE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:125:30: INTVALUE
                            {
                            match(input,INTVALUE,FOLLOW_INTVALUE_in_arrayDeclaration763); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_arrayDeclaration766); if (state.failed) return ;

                    }


                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:126:17: ( EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY ) )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:127:21: EQUAL ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_arrayDeclaration808); if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:128:21: ( expression | OPENCURLY expression ( COMMA expression )* CLOSECURLY )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==AMPERSAND||LA24_0==CHARVALUE||(LA24_0 >= EXCLAMATION && LA24_0 <= FALSE)||LA24_0==FLOATVALUE||LA24_0==IDENT||LA24_0==INTVALUE||LA24_0==MINUS||LA24_0==OPENPARENT||LA24_0==PLUS||(LA24_0 >= STRINGVALUE && LA24_0 <= TRUE)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==OPENCURLY) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:128:22: expression
                            {
                            pushFollow(FOLLOW_expression_in_arrayDeclaration831);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:130:21: OPENCURLY expression ( COMMA expression )* CLOSECURLY
                            {
                            match(input,OPENCURLY,FOLLOW_OPENCURLY_in_arrayDeclaration875); if (state.failed) return ;

                            pushFollow(FOLLOW_expression_in_arrayDeclaration877);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:130:42: ( COMMA expression )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:130:43: COMMA expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_arrayDeclaration880); if (state.failed) return ;

                            	    pushFollow(FOLLOW_expression_in_arrayDeclaration882);
                            	    expression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            match(input,CLOSECURLY,FOLLOW_CLOSECURLY_in_arrayDeclaration886); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayDeclaration940); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arrayDeclaration"



    // $ANTLR start "statement"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:140:1: statement : ( SEMICOLON | ( INTVALUE | FLOATVALUE | CHARVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT | STRINGVALUE | OPENPARENT )=> expression | declaration | assignment | ifControl | forControl | whileControl | doWhileControl | returnStmt | BREAK SEMICOLON | CONTINUE SEMICOLON );
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:141:5: ( SEMICOLON | ( INTVALUE | FLOATVALUE | CHARVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT | STRINGVALUE | OPENPARENT )=> expression | declaration | assignment | ifControl | forControl | whileControl | doWhileControl | returnStmt | BREAK SEMICOLON | CONTINUE SEMICOLON )
            int alt26=11;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SEMICOLON) ) {
                alt26=1;
            }
            else if ( (LA26_0==EXCLAMATION||LA26_0==MINUS||LA26_0==PLUS) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==IDENT) ) {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==OPENPARENT) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==EQUAL||LA26_3==OPENBRACKET) ) {
                    alt26=4;
                }
                else if ( (LA26_3==ASTERISK) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==MINUS||LA26_3==PLUS) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==EQUALITY||LA26_3==LARGER||LA26_3==SMALLER) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CONJUNCTION||LA26_3==DISJUNCTION) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==QUESTION) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CLOSECURLY) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==SEMICOLON) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==EXCLAMATION) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==IDENT) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==INTVALUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==FLOATVALUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CHARVALUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==STRINGVALUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==TRUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==FALSE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==AMPERSAND) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CONST) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CHAR||LA26_3==FLOAT||LA26_3==INT) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==PERCENT||LA26_3==SLASH) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==IF) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==FOR) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==WHILE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==DO) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==RETURN) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==BREAK) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==CONTINUE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==ELSE) && (synpred1_Csub())) {
                    alt26=2;
                }
                else if ( (LA26_3==EOF) && (synpred1_Csub())) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA26_0==OPENPARENT) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==INTVALUE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==FLOATVALUE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==CHARVALUE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==STRINGVALUE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==TRUE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==FALSE) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==AMPERSAND) && (synpred1_Csub())) {
                alt26=2;
            }
            else if ( (LA26_0==CHAR||LA26_0==CONST||LA26_0==FLOAT||LA26_0==INT) ) {
                alt26=3;
            }
            else if ( (LA26_0==ASTERISK) ) {
                alt26=4;
            }
            else if ( (LA26_0==IF) ) {
                alt26=5;
            }
            else if ( (LA26_0==FOR) ) {
                alt26=6;
            }
            else if ( (LA26_0==WHILE) ) {
                alt26=7;
            }
            else if ( (LA26_0==DO) ) {
                alt26=8;
            }
            else if ( (LA26_0==RETURN) ) {
                alt26=9;
            }
            else if ( (LA26_0==BREAK) ) {
                alt26=10;
            }
            else if ( (LA26_0==CONTINUE) ) {
                alt26=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:142:9: SEMICOLON
                    {
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement968); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:9: ( INTVALUE | FLOATVALUE | CHARVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT | STRINGVALUE | OPENPARENT )=> expression
                    {
                    pushFollow(FOLLOW_expression_in_statement1015);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:144:9: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1025);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:145:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1036);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:146:9: ifControl
                    {
                    pushFollow(FOLLOW_ifControl_in_statement1046);
                    ifControl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:147:9: forControl
                    {
                    pushFollow(FOLLOW_forControl_in_statement1056);
                    forControl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:148:9: whileControl
                    {
                    pushFollow(FOLLOW_whileControl_in_statement1066);
                    whileControl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:149:9: doWhileControl
                    {
                    pushFollow(FOLLOW_doWhileControl_in_statement1076);
                    doWhileControl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:150:9: returnStmt
                    {
                    pushFollow(FOLLOW_returnStmt_in_statement1086);
                    returnStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:151:9: BREAK SEMICOLON
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement1096); if (state.failed) return ;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement1098); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:152:9: CONTINUE SEMICOLON
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1108); if (state.failed) return ;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement1110); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:158:1: assignment : ( ( ( ASTERISK )? IDENT EQUAL expression SEMICOLON ) | arrayAssignment );
    public final void assignment() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:159:5: ( ( ( ASTERISK )? IDENT EQUAL expression SEMICOLON ) | arrayAssignment )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASTERISK) ) {
                alt28=1;
            }
            else if ( (LA28_0==IDENT) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EQUAL) ) {
                    alt28=1;
                }
                else if ( (LA28_2==OPENBRACKET) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:160:9: ( ( ASTERISK )? IDENT EQUAL expression SEMICOLON )
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:160:9: ( ( ASTERISK )? IDENT EQUAL expression SEMICOLON )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:160:10: ( ASTERISK )? IDENT EQUAL expression SEMICOLON
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:160:10: ( ASTERISK )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ASTERISK) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:160:10: ASTERISK
                            {
                            match(input,ASTERISK,FOLLOW_ASTERISK_in_assignment1138); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENT,FOLLOW_IDENT_in_assignment1150); if (state.failed) return ;

                    match(input,EQUAL,FOLLOW_EQUAL_in_assignment1152); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1154);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment1156); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:163:9: arrayAssignment
                    {
                    pushFollow(FOLLOW_arrayAssignment_in_assignment1177);
                    arrayAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "arrayAssignment"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:166:1: arrayAssignment : IDENT OPENBRACKET INTVALUE CLOSEBRACKET EQUAL expression SEMICOLON ;
    public final void arrayAssignment() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:167:5: ( IDENT OPENBRACKET INTVALUE CLOSEBRACKET EQUAL expression SEMICOLON )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:168:9: IDENT OPENBRACKET INTVALUE CLOSEBRACKET EQUAL expression SEMICOLON
            {
            match(input,IDENT,FOLLOW_IDENT_in_arrayAssignment1206); if (state.failed) return ;

            match(input,OPENBRACKET,FOLLOW_OPENBRACKET_in_arrayAssignment1208); if (state.failed) return ;

            match(input,INTVALUE,FOLLOW_INTVALUE_in_arrayAssignment1210); if (state.failed) return ;

            match(input,CLOSEBRACKET,FOLLOW_CLOSEBRACKET_in_arrayAssignment1212); if (state.failed) return ;

            match(input,EQUAL,FOLLOW_EQUAL_in_arrayAssignment1214); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_arrayAssignment1216);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayAssignment1218); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arrayAssignment"



    // $ANTLR start "ifControl"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:171:1: ifControl : IF OPENPARENT expression CLOSEPARENT controlBody ( ( ELSE controlBody )=> ELSE controlBody )? ;
    public final void ifControl() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:172:7: ( IF OPENPARENT expression CLOSEPARENT controlBody ( ( ELSE controlBody )=> ELSE controlBody )? )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:173:9: IF OPENPARENT expression CLOSEPARENT controlBody ( ( ELSE controlBody )=> ELSE controlBody )?
            {
            match(input,IF,FOLLOW_IF_in_ifControl1249); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_ifControl1251); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_ifControl1253);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_ifControl1255); if (state.failed) return ;

            pushFollow(FOLLOW_controlBody_in_ifControl1265);
            controlBody();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:175:9: ( ( ELSE controlBody )=> ELSE controlBody )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELSE) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred2_Csub()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:175:10: ( ELSE controlBody )=> ELSE controlBody
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifControl1282); if (state.failed) return ;

                    pushFollow(FOLLOW_controlBody_in_ifControl1284);
                    controlBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifControl"



    // $ANTLR start "forControl"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:177:1: forControl : FOR OPENPARENT assignmentExpression SEMICOLON expression SEMICOLON stepExpression CLOSEPARENT controlBody ;
    public final void forControl() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:178:7: ( FOR OPENPARENT assignmentExpression SEMICOLON expression SEMICOLON stepExpression CLOSEPARENT controlBody )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:179:9: FOR OPENPARENT assignmentExpression SEMICOLON expression SEMICOLON stepExpression CLOSEPARENT controlBody
            {
            match(input,FOR,FOLLOW_FOR_in_forControl1314); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_forControl1316); if (state.failed) return ;

            pushFollow(FOLLOW_assignmentExpression_in_forControl1318);
            assignmentExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forControl1320); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_forControl1322);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forControl1324); if (state.failed) return ;

            pushFollow(FOLLOW_stepExpression_in_forControl1326);
            stepExpression();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_forControl1328); if (state.failed) return ;

            pushFollow(FOLLOW_controlBody_in_forControl1338);
            controlBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "forControl"



    // $ANTLR start "whileControl"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:182:1: whileControl : WHILE OPENPARENT expression CLOSEPARENT controlBody ;
    public final void whileControl() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:183:7: ( WHILE OPENPARENT expression CLOSEPARENT controlBody )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:184:9: WHILE OPENPARENT expression CLOSEPARENT controlBody
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileControl1366); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_whileControl1368); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_whileControl1370);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_whileControl1372); if (state.failed) return ;

            pushFollow(FOLLOW_controlBody_in_whileControl1382);
            controlBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileControl"



    // $ANTLR start "doWhileControl"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:187:1: doWhileControl : DO controlBody WHILE OPENPARENT expression CLOSEPARENT SEMICOLON ;
    public final void doWhileControl() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:188:7: ( DO controlBody WHILE OPENPARENT expression CLOSEPARENT SEMICOLON )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:188:9: DO controlBody WHILE OPENPARENT expression CLOSEPARENT SEMICOLON
            {
            match(input,DO,FOLLOW_DO_in_doWhileControl1402); if (state.failed) return ;

            pushFollow(FOLLOW_controlBody_in_doWhileControl1412);
            controlBody();

            state._fsp--;
            if (state.failed) return ;

            match(input,WHILE,FOLLOW_WHILE_in_doWhileControl1422); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_doWhileControl1424); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_doWhileControl1426);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_doWhileControl1428); if (state.failed) return ;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_doWhileControl1430); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "doWhileControl"



    // $ANTLR start "returnStmt"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:193:1: returnStmt : RETURN ( expression )? SEMICOLON ;
    public final void returnStmt() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:194:7: ( RETURN ( expression )? SEMICOLON )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:195:9: RETURN ( expression )? SEMICOLON
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnStmt1465); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:195:16: ( expression )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AMPERSAND||LA30_0==CHARVALUE||(LA30_0 >= EXCLAMATION && LA30_0 <= FALSE)||LA30_0==FLOATVALUE||LA30_0==IDENT||LA30_0==INTVALUE||LA30_0==MINUS||LA30_0==OPENPARENT||LA30_0==PLUS||(LA30_0 >= STRINGVALUE && LA30_0 <= TRUE)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:195:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStmt1468);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnStmt1472); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "returnStmt"



    // $ANTLR start "controlBody"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:201:1: controlBody : ( statement | OPENCURLY ( statement )* CLOSECURLY ) ;
    public final void controlBody() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:202:7: ( ( statement | OPENCURLY ( statement )* CLOSECURLY ) )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:9: ( statement | OPENCURLY ( statement )* CLOSECURLY )
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:9: ( statement | OPENCURLY ( statement )* CLOSECURLY )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= AMPERSAND && LA32_0 <= ASTERISK)||(LA32_0 >= BREAK && LA32_0 <= CHARVALUE)||(LA32_0 >= CONST && LA32_0 <= CONTINUE)||LA32_0==DO||(LA32_0 >= EXCLAMATION && LA32_0 <= IF)||(LA32_0 >= INT && LA32_0 <= INTVALUE)||LA32_0==MINUS||LA32_0==OPENPARENT||LA32_0==PLUS||(LA32_0 >= RETURN && LA32_0 <= SEMICOLON)||(LA32_0 >= STRINGVALUE && LA32_0 <= TRUE)||LA32_0==WHILE) ) {
                alt32=1;
            }
            else if ( (LA32_0==OPENCURLY) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:10: statement
                    {
                    pushFollow(FOLLOW_statement_in_controlBody1510);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:22: OPENCURLY ( statement )* CLOSECURLY
                    {
                    match(input,OPENCURLY,FOLLOW_OPENCURLY_in_controlBody1514); if (state.failed) return ;

                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:32: ( statement )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0 >= AMPERSAND && LA31_0 <= ASTERISK)||(LA31_0 >= BREAK && LA31_0 <= CHARVALUE)||(LA31_0 >= CONST && LA31_0 <= CONTINUE)||LA31_0==DO||(LA31_0 >= EXCLAMATION && LA31_0 <= IF)||(LA31_0 >= INT && LA31_0 <= INTVALUE)||LA31_0==MINUS||LA31_0==OPENPARENT||LA31_0==PLUS||(LA31_0 >= RETURN && LA31_0 <= SEMICOLON)||(LA31_0 >= STRINGVALUE && LA31_0 <= TRUE)||LA31_0==WHILE) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:203:32: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_controlBody1516);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    match(input,CLOSECURLY,FOLLOW_CLOSECURLY_in_controlBody1519); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "controlBody"



    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:206:1: assignmentExpression : ( INT | FLOAT )? IDENT EQUAL expression ;
    public final void assignmentExpression() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:207:7: ( ( INT | FLOAT )? IDENT EQUAL expression )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:208:9: ( INT | FLOAT )? IDENT EQUAL expression
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:208:9: ( INT | FLOAT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FLOAT||LA33_0==INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
                    {
                    if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_assignmentExpression1564); if (state.failed) return ;

            match(input,EQUAL,FOLLOW_EQUAL_in_assignmentExpression1566); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_assignmentExpression1568);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignmentExpression"



    // $ANTLR start "stepExpression"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:211:1: stepExpression : ( IDENT ( INCREMENT | DECREMENT ) | IDENT ( PLUS | MINUS ) ( expression ) ) ;
    public final void stepExpression() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:212:7: ( ( IDENT ( INCREMENT | DECREMENT ) | IDENT ( PLUS | MINUS ) ( expression ) ) )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:213:9: ( IDENT ( INCREMENT | DECREMENT ) | IDENT ( PLUS | MINUS ) ( expression ) )
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:213:9: ( IDENT ( INCREMENT | DECREMENT ) | IDENT ( PLUS | MINUS ) ( expression ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==IDENT) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==DECREMENT||LA34_1==INCREMENT) ) {
                    alt34=1;
                }
                else if ( (LA34_1==MINUS||LA34_1==PLUS) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:213:10: IDENT ( INCREMENT | DECREMENT )
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_stepExpression1604); if (state.failed) return ;

                    if ( input.LA(1)==DECREMENT||input.LA(1)==INCREMENT ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:214:11: IDENT ( PLUS | MINUS ) ( expression )
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_stepExpression1624); if (state.failed) return ;

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:214:32: ( expression )
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:214:33: expression
                    {
                    pushFollow(FOLLOW_expression_in_stepExpression1635);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stepExpression"



    // $ANTLR start "functionCall"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:218:1: functionCall : IDENT OPENPARENT ( parameter )? CLOSEPARENT ;
    public final void functionCall() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:219:7: ( IDENT OPENPARENT ( parameter )? CLOSEPARENT )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:220:9: IDENT OPENPARENT ( parameter )? CLOSEPARENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_functionCall1681); if (state.failed) return ;

            match(input,OPENPARENT,FOLLOW_OPENPARENT_in_functionCall1683); if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:220:26: ( parameter )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==AMPERSAND||LA35_0==CHARVALUE||(LA35_0 >= EXCLAMATION && LA35_0 <= FALSE)||LA35_0==FLOATVALUE||LA35_0==IDENT||LA35_0==INTVALUE||LA35_0==MINUS||LA35_0==OPENPARENT||LA35_0==PLUS||(LA35_0 >= STRINGVALUE && LA35_0 <= TRUE)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:220:26: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_functionCall1685);
                    parameter();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_functionCall1688); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "parameter"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:223:1: parameter : expression ( COMMA expression )* ;
    public final void parameter() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:224:7: ( expression ( COMMA expression )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:225:9: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_parameter1723);
            expression();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:225:20: ( COMMA expression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:225:21: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameter1726); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_parameter1728);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameter"



    // $ANTLR start "expression"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:233:1: expression : logical ( QUESTION logical COLON logical )* ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:233:12: ( logical ( QUESTION logical COLON logical )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:233:14: logical ( QUESTION logical COLON logical )*
            {
            pushFollow(FOLLOW_logical_in_expression1754);
            logical();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:233:22: ( QUESTION logical COLON logical )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==QUESTION) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:233:23: QUESTION logical COLON logical
            	    {
            	    match(input,QUESTION,FOLLOW_QUESTION_in_expression1757); if (state.failed) return ;

            	    pushFollow(FOLLOW_logical_in_expression1759);
            	    logical();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,COLON,FOLLOW_COLON_in_expression1761); if (state.failed) return ;

            	    pushFollow(FOLLOW_logical_in_expression1763);
            	    logical();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logical"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:235:1: logical : relation ( ( CONJUNCTION | DISJUNCTION ) relation )* ;
    public final void logical() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:235:9: ( relation ( ( CONJUNCTION | DISJUNCTION ) relation )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:235:11: relation ( ( CONJUNCTION | DISJUNCTION ) relation )*
            {
            pushFollow(FOLLOW_relation_in_logical1774);
            relation();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:235:20: ( ( CONJUNCTION | DISJUNCTION ) relation )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==CONJUNCTION||LA38_0==DISJUNCTION) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:235:22: ( CONJUNCTION | DISJUNCTION ) relation
            	    {
            	    if ( input.LA(1)==CONJUNCTION||input.LA(1)==DISJUNCTION ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relation_in_logical1786);
            	    relation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "logical"



    // $ANTLR start "relation"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:237:1: relation : add ( ( SMALLER | LARGER | EQUALITY ) add )* ;
    public final void relation() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:237:10: ( add ( ( SMALLER | LARGER | EQUALITY ) add )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:237:12: add ( ( SMALLER | LARGER | EQUALITY ) add )*
            {
            pushFollow(FOLLOW_add_in_relation1798);
            add();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:237:16: ( ( SMALLER | LARGER | EQUALITY ) add )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==EQUALITY||LA39_0==LARGER||LA39_0==SMALLER) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:237:18: ( SMALLER | LARGER | EQUALITY ) add
            	    {
            	    if ( input.LA(1)==EQUALITY||input.LA(1)==LARGER||input.LA(1)==SMALLER ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation1814);
            	    add();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relation"



    // $ANTLR start "add"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:1: add : mult ( ( PLUS | MINUS )=> ( PLUS | MINUS ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:5: ( mult ( ( PLUS | MINUS )=> ( PLUS | MINUS ) mult )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:7: mult ( ( PLUS | MINUS )=> ( PLUS | MINUS ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add1825);
            mult();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:12: ( ( PLUS | MINUS )=> ( PLUS | MINUS ) mult )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==MINUS||LA40_0==PLUS) ) {
                    int LA40_7 = input.LA(2);

                    if ( (synpred3_Csub()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:13: ( PLUS | MINUS )=> ( PLUS | MINUS ) mult
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add1844);
            	    mult();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "add"



    // $ANTLR start "mult"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:241:1: mult : unary ( ( ASTERISK | SLASH | PERCENT ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:241:6: ( unary ( ( ASTERISK | SLASH | PERCENT ) unary )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:241:8: unary ( ( ASTERISK | SLASH | PERCENT ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult1856);
            unary();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:241:14: ( ( ASTERISK | SLASH | PERCENT ) unary )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ASTERISK) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==IDENT) ) {
                        int LA41_4 = input.LA(3);

                        if ( (LA41_4==EOF||(LA41_4 >= AMPERSAND && LA41_4 <= ASTERISK)||(LA41_4 >= BREAK && LA41_4 <= CHARVALUE)||(LA41_4 >= CLOSECURLY && LA41_4 <= COMMA)||(LA41_4 >= CONJUNCTION && LA41_4 <= CONTINUE)||(LA41_4 >= DISJUNCTION && LA41_4 <= ELSE)||(LA41_4 >= EQUALITY && LA41_4 <= IF)||(LA41_4 >= INT && LA41_4 <= LARGER)||LA41_4==MINUS||(LA41_4 >= OPENPARENT && LA41_4 <= TRUE)||LA41_4==WHILE) ) {
                            alt41=1;
                        }


                    }
                    else if ( (LA41_2==AMPERSAND||LA41_2==CHARVALUE||(LA41_2 >= EXCLAMATION && LA41_2 <= FALSE)||LA41_2==FLOATVALUE||LA41_2==INTVALUE||LA41_2==MINUS||LA41_2==OPENPARENT||LA41_2==PLUS||(LA41_2 >= STRINGVALUE && LA41_2 <= TRUE)) ) {
                        alt41=1;
                    }


                }
                else if ( (LA41_0==PERCENT||LA41_0==SLASH) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:241:16: ( ASTERISK | SLASH | PERCENT ) unary
            	    {
            	    if ( input.LA(1)==ASTERISK||input.LA(1)==PERCENT||input.LA(1)==SLASH ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult1872);
            	    unary();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mult"



    // $ANTLR start "unary"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:243:1: unary : ( PLUS | MINUS | EXCLAMATION )* primary ;
    public final void unary() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:243:7: ( ( PLUS | MINUS | EXCLAMATION )* primary )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:243:9: ( PLUS | MINUS | EXCLAMATION )* primary
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:243:9: ( PLUS | MINUS | EXCLAMATION )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==EXCLAMATION||LA42_0==MINUS||LA42_0==PLUS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( input.LA(1)==EXCLAMATION||input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            pushFollow(FOLLOW_primary_in_unary1896);
            primary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unary"



    // $ANTLR start "primary"
    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:245:1: primary : ( ( IDENT OPENPARENT )=> functionCall | OPENPARENT expression CLOSEPARENT | INTVALUE | FLOATVALUE | CHARVALUE | STRINGVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT );
    public final void primary() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:246:5: ( ( IDENT OPENPARENT )=> functionCall | OPENPARENT expression CLOSEPARENT | INTVALUE | FLOATVALUE | CHARVALUE | STRINGVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT )
            int alt44=9;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred4_Csub()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }
                }
                break;
            case OPENPARENT:
                {
                alt44=2;
                }
                break;
            case INTVALUE:
                {
                alt44=3;
                }
                break;
            case FLOATVALUE:
                {
                alt44=4;
                }
                break;
            case CHARVALUE:
                {
                alt44=5;
                }
                break;
            case STRINGVALUE:
                {
                alt44=6;
                }
                break;
            case TRUE:
                {
                alt44=7;
                }
                break;
            case FALSE:
                {
                alt44=8;
                }
                break;
            case AMPERSAND:
                {
                alt44=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:247:9: ( IDENT OPENPARENT )=> functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primary1929);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:248:9: OPENPARENT expression CLOSEPARENT
                    {
                    match(input,OPENPARENT,FOLLOW_OPENPARENT_in_primary1939); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_primary1941);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSEPARENT,FOLLOW_CLOSEPARENT_in_primary1943); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:249:9: INTVALUE
                    {
                    match(input,INTVALUE,FOLLOW_INTVALUE_in_primary1953); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:250:9: FLOATVALUE
                    {
                    match(input,FLOATVALUE,FOLLOW_FLOATVALUE_in_primary1964); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:251:9: CHARVALUE
                    {
                    match(input,CHARVALUE,FOLLOW_CHARVALUE_in_primary1975); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:252:9: STRINGVALUE
                    {
                    match(input,STRINGVALUE,FOLLOW_STRINGVALUE_in_primary1986); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:253:9: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_primary1996); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:254:9: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_primary2007); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:255:9: ( AMPERSAND )? IDENT
                    {
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:255:9: ( AMPERSAND )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==AMPERSAND) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:255:9: AMPERSAND
                            {
                            match(input,AMPERSAND,FOLLOW_AMPERSAND_in_primary2017); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENT,FOLLOW_IDENT_in_primary2020); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primary"

    // $ANTLR start synpred1_Csub
    public final void synpred1_Csub_fragment() throws RecognitionException {
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:9: ( INTVALUE | FLOATVALUE | CHARVALUE | TRUE | FALSE | ( AMPERSAND )? IDENT | STRINGVALUE | OPENPARENT )
        int alt46=8;
        switch ( input.LA(1) ) {
        case INTVALUE:
            {
            alt46=1;
            }
            break;
        case FLOATVALUE:
            {
            alt46=2;
            }
            break;
        case CHARVALUE:
            {
            alt46=3;
            }
            break;
        case TRUE:
            {
            alt46=4;
            }
            break;
        case FALSE:
            {
            alt46=5;
            }
            break;
        case AMPERSAND:
        case IDENT:
            {
            alt46=6;
            }
            break;
        case STRINGVALUE:
            {
            alt46=7;
            }
            break;
        case OPENPARENT:
            {
            alt46=8;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 46, 0, input);

            throw nvae;

        }

        switch (alt46) {
            case 1 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:10: INTVALUE
                {
                match(input,INTVALUE,FOLLOW_INTVALUE_in_synpred1_Csub979); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:21: FLOATVALUE
                {
                match(input,FLOATVALUE,FOLLOW_FLOATVALUE_in_synpred1_Csub983); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:34: CHARVALUE
                {
                match(input,CHARVALUE,FOLLOW_CHARVALUE_in_synpred1_Csub987); if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:46: TRUE
                {
                match(input,TRUE,FOLLOW_TRUE_in_synpred1_Csub991); if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:53: FALSE
                {
                match(input,FALSE,FOLLOW_FALSE_in_synpred1_Csub995); if (state.failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:61: ( AMPERSAND )? IDENT
                {
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:61: ( AMPERSAND )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AMPERSAND) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:61: AMPERSAND
                        {
                        match(input,AMPERSAND,FOLLOW_AMPERSAND_in_synpred1_Csub999); if (state.failed) return ;

                        }
                        break;

                }


                match(input,IDENT,FOLLOW_IDENT_in_synpred1_Csub1002); if (state.failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:80: STRINGVALUE
                {
                match(input,STRINGVALUE,FOLLOW_STRINGVALUE_in_synpred1_Csub1006); if (state.failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:143:94: OPENPARENT
                {
                match(input,OPENPARENT,FOLLOW_OPENPARENT_in_synpred1_Csub1010); if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred1_Csub

    // $ANTLR start synpred2_Csub
    public final void synpred2_Csub_fragment() throws RecognitionException {
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:175:10: ( ELSE controlBody )
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:175:11: ELSE controlBody
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred2_Csub1277); if (state.failed) return ;

        pushFollow(FOLLOW_controlBody_in_synpred2_Csub1279);
        controlBody();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Csub

    // $ANTLR start synpred3_Csub
    public final void synpred3_Csub_fragment() throws RecognitionException {
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:239:13: ( PLUS | MINUS )
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
        {
        if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred3_Csub

    // $ANTLR start synpred4_Csub
    public final void synpred4_Csub_fragment() throws RecognitionException {
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:247:9: ( IDENT OPENPARENT )
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:247:10: IDENT OPENPARENT
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred4_Csub1922); if (state.failed) return ;

        match(input,OPENPARENT,FOLLOW_OPENPARENT_in_synpred4_Csub1924); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Csub

    // Delegated rules

    public final boolean synpred2_Csub() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Csub_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Csub() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Csub_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Csub() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Csub_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Csub() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Csub_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_includes_in_program66 = new BitSet(new long[]{0x0080001010020100L});
    public static final BitSet FOLLOW_signature_in_program80 = new BitSet(new long[]{0x0080001010020100L});
    public static final BitSet FOLLOW_function_in_program94 = new BitSet(new long[]{0x0080001010020100L});
    public static final BitSet FOLLOW_declaration_in_program109 = new BitSet(new long[]{0x0080001010020100L});
    public static final BitSet FOLLOW_main_in_program131 = new BitSet(new long[]{0x0080001010020102L});
    public static final BitSet FOLLOW_declaration_in_program142 = new BitSet(new long[]{0x0080001010020102L});
    public static final BitSet FOLLOW_function_in_program146 = new BitSet(new long[]{0x0080001010020102L});
    public static final BitSet FOLLOW_INCLUDESTART_in_includes197 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INCLUDE_in_includes201 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_VOID_in_signature250 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_type_in_signature254 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_signature258 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_signature260 = new BitSet(new long[]{0x0080001010001100L});
    public static final BitSet FOLLOW_signatureArguments_in_signature262 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_signature265 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_signature267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_function310 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_type_in_function314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_function317 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_function319 = new BitSet(new long[]{0x0080001010001100L});
    public static final BitSet FOLLOW_arguments_in_function321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_function324 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionBody_in_function326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_declaration356 = new BitSet(new long[]{0x0000001010000100L});
    public static final BitSet FOLLOW_type_in_declaration359 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ASTERISK_in_declaration361 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_declaration364 = new BitSet(new long[]{0x0004000001004000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration367 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_declaration369 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_COMMA_in_declaration383 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ASTERISK_in_declaration385 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_declaration388 = new BitSet(new long[]{0x0004000001004000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration391 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_declaration393 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declaration408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_declaration429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_main459 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_type_in_main463 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_MAIN_in_main466 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_main468 = new BitSet(new long[]{0x0080001010001100L});
    public static final BitSet FOLLOW_arguments_in_main470 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_main473 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionBody_in_main475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_signatureArguments549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_signatureArguments560 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_signatureArguments563 = new BitSet(new long[]{0x0000001010000100L});
    public static final BitSet FOLLOW_type_in_signatureArguments565 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_type_in_arguments596 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_arguments598 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_arguments601 = new BitSet(new long[]{0x0000001010000100L});
    public static final BitSet FOLLOW_type_in_arguments603 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_arguments605 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_VOID_in_arguments617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENCURLY_in_functionBody646 = new BitSet(new long[]{0x0166A231FC460BB0L});
    public static final BitSet FOLLOW_statement_in_functionBody648 = new BitSet(new long[]{0x0166A231FC460BB0L});
    public static final BitSet FOLLOW_CLOSECURLY_in_functionBody651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_arrayDeclaration680 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_arrayDeclaration682 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_OPENBRACKET_in_arrayDeclaration708 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTVALUE_in_arrayDeclaration710 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_arrayDeclaration712 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_OPENBRACKET_in_arrayDeclaration761 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_INTVALUE_in_arrayDeclaration763 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_arrayDeclaration766 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUAL_in_arrayDeclaration808 = new BitSet(new long[]{0x0060B220AC000210L});
    public static final BitSet FOLLOW_expression_in_arrayDeclaration831 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_OPENCURLY_in_arrayDeclaration875 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_arrayDeclaration877 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_COMMA_in_arrayDeclaration880 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_arrayDeclaration882 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_CLOSECURLY_in_arrayDeclaration886 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayDeclaration940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifControl_in_statement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControl_in_statement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileControl_in_statement1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileControl_in_statement1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStmt_in_statement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1096 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1108 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statement1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_assignment1138 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_assignment1150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUAL_in_assignment1152 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_assignment1154 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assignment1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAssignment_in_assignment1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_arrayAssignment1206 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_OPENBRACKET_in_arrayAssignment1208 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTVALUE_in_arrayAssignment1210 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CLOSEBRACKET_in_arrayAssignment1212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUAL_in_arrayAssignment1214 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_arrayAssignment1216 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayAssignment1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifControl1249 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_ifControl1251 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_ifControl1253 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_ifControl1255 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_ifControl1265 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_ifControl1282 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_ifControl1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forControl1314 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_forControl1316 = new BitSet(new long[]{0x0000001090000000L});
    public static final BitSet FOLLOW_assignmentExpression_in_forControl1318 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forControl1320 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_forControl1322 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forControl1324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stepExpression_in_forControl1326 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_forControl1328 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_forControl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileControl1366 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_whileControl1368 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_whileControl1370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_whileControl1372 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_whileControl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doWhileControl1402 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_doWhileControl1412 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_WHILE_in_doWhileControl1422 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_doWhileControl1424 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_doWhileControl1426 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_doWhileControl1428 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_doWhileControl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStmt1465 = new BitSet(new long[]{0x0064A220AC000210L});
    public static final BitSet FOLLOW_expression_in_returnStmt1468 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnStmt1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_controlBody1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENCURLY_in_controlBody1514 = new BitSet(new long[]{0x0166A231FC460BB0L});
    public static final BitSet FOLLOW_statement_in_controlBody1516 = new BitSet(new long[]{0x0166A231FC460BB0L});
    public static final BitSet FOLLOW_CLOSECURLY_in_controlBody1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignmentExpression1564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUAL_in_assignmentExpression1566 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_assignmentExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stepExpression1604 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_set_in_stepExpression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stepExpression1624 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_set_in_stepExpression1626 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_stepExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionCall1681 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_functionCall1683 = new BitSet(new long[]{0x0060A220AC001210L});
    public static final BitSet FOLLOW_parameter_in_functionCall1685 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_functionCall1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter1723 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_parameter1726 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_parameter1728 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_logical_in_expression1754 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expression1757 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_logical_in_expression1759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_expression1761 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_logical_in_expression1763 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_relation_in_logical1774 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_set_in_logical1778 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_relation_in_logical1786 = new BitSet(new long[]{0x0000000000210002L});
    public static final BitSet FOLLOW_add_in_relation1798 = new BitSet(new long[]{0x0010004002000002L});
    public static final BitSet FOLLOW_set_in_relation1802 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_add_in_relation1814 = new BitSet(new long[]{0x0010004002000002L});
    public static final BitSet FOLLOW_mult_in_add1825 = new BitSet(new long[]{0x0000820000000002L});
    public static final BitSet FOLLOW_set_in_add1836 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_mult_in_add1844 = new BitSet(new long[]{0x0000820000000002L});
    public static final BitSet FOLLOW_unary_in_mult1856 = new BitSet(new long[]{0x0008400000000022L});
    public static final BitSet FOLLOW_set_in_mult1860 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_unary_in_mult1872 = new BitSet(new long[]{0x0008400000000022L});
    public static final BitSet FOLLOW_primary_in_unary1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPARENT_in_primary1939 = new BitSet(new long[]{0x0060A220AC000210L});
    public static final BitSet FOLLOW_expression_in_primary1941 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CLOSEPARENT_in_primary1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTVALUE_in_primary1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATVALUE_in_primary1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARVALUE_in_primary1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGVALUE_in_primary1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_primary1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_primary2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_primary2017 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_primary2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTVALUE_in_synpred1_Csub979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATVALUE_in_synpred1_Csub983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARVALUE_in_synpred1_Csub987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_synpred1_Csub991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_synpred1_Csub995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_synpred1_Csub999 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENT_in_synpred1_Csub1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGVALUE_in_synpred1_Csub1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPARENT_in_synpred1_Csub1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred2_Csub1277 = new BitSet(new long[]{0x0166B231FC4603B0L});
    public static final BitSet FOLLOW_controlBody_in_synpred2_Csub1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred4_Csub1922 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OPENPARENT_in_synpred4_Csub1924 = new BitSet(new long[]{0x0000000000000002L});

}