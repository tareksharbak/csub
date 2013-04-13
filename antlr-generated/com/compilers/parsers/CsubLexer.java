// $ANTLR 3.4 C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g 2013-04-14 01:18:34

    package com.compilers.parsers;
    


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CsubLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CsubLexer() {} 
    public CsubLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CsubLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g"; }

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:251:13: ( '=' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:251:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:252:13: ( '+' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:252:15: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:253:13: ( '-' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:253:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:254:13: ( '*' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:254:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:255:13: ( '/' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:255:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "LARGER"
    public final void mLARGER() throws RecognitionException {
        try {
            int _type = LARGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:256:13: ( '>' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:256:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LARGER"

    // $ANTLR start "SMALLER"
    public final void mSMALLER() throws RecognitionException {
        try {
            int _type = SMALLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:257:13: ( '<' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:257:15: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SMALLER"

    // $ANTLR start "OPENPARENT"
    public final void mOPENPARENT() throws RecognitionException {
        try {
            int _type = OPENPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:258:13: ( '(' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:258:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENPARENT"

    // $ANTLR start "CLOSEPARENT"
    public final void mCLOSEPARENT() throws RecognitionException {
        try {
            int _type = CLOSEPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:259:13: ( ')' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:259:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEPARENT"

    // $ANTLR start "OPENCURLY"
    public final void mOPENCURLY() throws RecognitionException {
        try {
            int _type = OPENCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:260:13: ( '{' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:260:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENCURLY"

    // $ANTLR start "CLOSECURLY"
    public final void mCLOSECURLY() throws RecognitionException {
        try {
            int _type = CLOSECURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:261:13: ( '}' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:261:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSECURLY"

    // $ANTLR start "OPENBRACKET"
    public final void mOPENBRACKET() throws RecognitionException {
        try {
            int _type = OPENBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:262:13: ( '[' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:262:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENBRACKET"

    // $ANTLR start "CLOSEBRACKET"
    public final void mCLOSEBRACKET() throws RecognitionException {
        try {
            int _type = CLOSEBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:263:13: ( ']' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:263:15: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEBRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:264:13: ( ';' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:264:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:265:13: ( ',' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:265:15: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:266:13: ( '&' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:266:15: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:267:13: ( '%' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:267:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:268:13: ( '|' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:268:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "EXCLAMATION"
    public final void mEXCLAMATION() throws RecognitionException {
        try {
            int _type = EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:269:13: ( '!' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:269:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLAMATION"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:270:13: ( '?' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:270:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:271:13: ( ':' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:271:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:272:6: ( 'true' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:272:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:273:7: ( 'false' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:273:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:274:6: ( 'void' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:274:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:275:6: ( 'char' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:275:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:276:5: ( 'int' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:276:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:277:7: ( 'float' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:277:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:278:4: ( 'if' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:278:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:279:6: ( 'else' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:279:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:280:4: ( 'do' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:280:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:281:7: ( 'while' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:281:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:282:5: ( 'for' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:282:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:283:7: ( 'break' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:283:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:284:10: ( 'continue' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:284:12: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:285:8: ( 'return' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:285:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:286:7: ( 'const' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:286:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:287:6: ( 'main' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:287:8: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "EQUALITY"
    public final void mEQUALITY() throws RecognitionException {
        try {
            int _type = EQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:288:10: ( EQUAL EQUAL )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:288:12: EQUAL EQUAL
            {
            mEQUAL(); 


            mEQUAL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALITY"

    // $ANTLR start "INCREMENT"
    public final void mINCREMENT() throws RecognitionException {
        try {
            int _type = INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:289:11: ( PLUS PLUS )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:289:13: PLUS PLUS
            {
            mPLUS(); 


            mPLUS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCREMENT"

    // $ANTLR start "DECREMENT"
    public final void mDECREMENT() throws RecognitionException {
        try {
            int _type = DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:290:11: ( MINUS MINUS )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:290:13: MINUS MINUS
            {
            mMINUS(); 


            mMINUS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECREMENT"

    // $ANTLR start "CONJUNCTION"
    public final void mCONJUNCTION() throws RecognitionException {
        try {
            int _type = CONJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:291:13: ( AMPERSAND AMPERSAND )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:291:15: AMPERSAND AMPERSAND
            {
            mAMPERSAND(); 


            mAMPERSAND(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONJUNCTION"

    // $ANTLR start "DISJUNCTION"
    public final void mDISJUNCTION() throws RecognitionException {
        try {
            int _type = DISJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:292:13: ( BAR BAR )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:292:15: BAR BAR
            {
            mBAR(); 


            mBAR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISJUNCTION"

    // $ANTLR start "INCLUDESTART"
    public final void mINCLUDESTART() throws RecognitionException {
        try {
            int _type = INCLUDESTART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:293:14: ( '#include' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:293:16: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDESTART"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:294:9: ( ( SMALLER | '\"' ) ( LETTER | DIGIT )+ ( '.h' )? ( LARGER | '\"' ) )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:294:11: ( SMALLER | '\"' ) ( LETTER | DIGIT )+ ( '.h' )? ( LARGER | '\"' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='<' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:294:26: ( LETTER | DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:294:44: ( '.h' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:294:44: '.h'
                    {
                    match(".h"); 



                    }
                    break;

            }


            if ( input.LA(1)=='\"'||input.LA(1)=='>' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "INTVALUE"
    public final void mINTVALUE() throws RecognitionException {
        try {
            int _type = INTVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:295:10: ( ( DIGIT )+ )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:295:12: ( DIGIT )+
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:295:12: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTVALUE"

    // $ANTLR start "FLOATVALUE"
    public final void mFLOATVALUE() throws RecognitionException {
        try {
            int _type = FLOATVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:296:13: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:296:15: ( DIGIT )+ '.' ( DIGIT )+
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:296:15: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match('.'); 

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:296:26: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATVALUE"

    // $ANTLR start "STRINGVALUE"
    public final void mSTRINGVALUE() throws RecognitionException {
        try {
            int _type = STRINGVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:297:13: ( '\\\"' (~ ( '\"' ) )* '\\\"' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:297:15: '\\\"' (~ ( '\"' ) )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:297:20: (~ ( '\"' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGVALUE"

    // $ANTLR start "CHARVALUE"
    public final void mCHARVALUE() throws RecognitionException {
        try {
            int _type = CHARVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:298:12: ( '\\'' . '\\'' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:298:14: '\\'' . '\\''
            {
            match('\''); 

            matchAny(); 

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARVALUE"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:299:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:299:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:299:16: ( LETTER | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:300:19: ( '/*' ( . )* '*/' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:300:21: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:300:26: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:300:26: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:301:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:301:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:301:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:302:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:302:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 



            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:302:16: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:302:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:303:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:304:16: ( '0' .. '9' )
            // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:8: ( EQUAL | PLUS | MINUS | ASTERISK | SLASH | LARGER | SMALLER | OPENPARENT | CLOSEPARENT | OPENCURLY | CLOSECURLY | OPENBRACKET | CLOSEBRACKET | SEMICOLON | COMMA | AMPERSAND | PERCENT | BAR | EXCLAMATION | QUESTION | COLON | TRUE | FALSE | VOID | CHAR | INT | FLOAT | IF | ELSE | DO | WHILE | FOR | BREAK | CONTINUE | RETURN | CONST | MAIN | EQUALITY | INCREMENT | DECREMENT | CONJUNCTION | DISJUNCTION | INCLUDESTART | INCLUDE | INTVALUE | FLOATVALUE | STRINGVALUE | CHARVALUE | IDENT | MULTILINE_COMMENT | WS | COMMENT )
        int alt11=52;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:10: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 2 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:16: PLUS
                {
                mPLUS(); 


                }
                break;
            case 3 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:21: MINUS
                {
                mMINUS(); 


                }
                break;
            case 4 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:27: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 5 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:36: SLASH
                {
                mSLASH(); 


                }
                break;
            case 6 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:42: LARGER
                {
                mLARGER(); 


                }
                break;
            case 7 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:49: SMALLER
                {
                mSMALLER(); 


                }
                break;
            case 8 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:57: OPENPARENT
                {
                mOPENPARENT(); 


                }
                break;
            case 9 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:68: CLOSEPARENT
                {
                mCLOSEPARENT(); 


                }
                break;
            case 10 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:80: OPENCURLY
                {
                mOPENCURLY(); 


                }
                break;
            case 11 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:90: CLOSECURLY
                {
                mCLOSECURLY(); 


                }
                break;
            case 12 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:101: OPENBRACKET
                {
                mOPENBRACKET(); 


                }
                break;
            case 13 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:113: CLOSEBRACKET
                {
                mCLOSEBRACKET(); 


                }
                break;
            case 14 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:126: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 15 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:136: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 16 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:142: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 17 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:152: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 18 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:160: BAR
                {
                mBAR(); 


                }
                break;
            case 19 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:164: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 20 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:176: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 21 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:185: COLON
                {
                mCOLON(); 


                }
                break;
            case 22 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:191: TRUE
                {
                mTRUE(); 


                }
                break;
            case 23 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:196: FALSE
                {
                mFALSE(); 


                }
                break;
            case 24 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:202: VOID
                {
                mVOID(); 


                }
                break;
            case 25 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:207: CHAR
                {
                mCHAR(); 


                }
                break;
            case 26 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:212: INT
                {
                mINT(); 


                }
                break;
            case 27 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:216: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 28 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:222: IF
                {
                mIF(); 


                }
                break;
            case 29 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:225: ELSE
                {
                mELSE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:230: DO
                {
                mDO(); 


                }
                break;
            case 31 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:233: WHILE
                {
                mWHILE(); 


                }
                break;
            case 32 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:239: FOR
                {
                mFOR(); 


                }
                break;
            case 33 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:243: BREAK
                {
                mBREAK(); 


                }
                break;
            case 34 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:249: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 35 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:258: RETURN
                {
                mRETURN(); 


                }
                break;
            case 36 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:265: CONST
                {
                mCONST(); 


                }
                break;
            case 37 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:271: MAIN
                {
                mMAIN(); 


                }
                break;
            case 38 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:276: EQUALITY
                {
                mEQUALITY(); 


                }
                break;
            case 39 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:285: INCREMENT
                {
                mINCREMENT(); 


                }
                break;
            case 40 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:295: DECREMENT
                {
                mDECREMENT(); 


                }
                break;
            case 41 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:305: CONJUNCTION
                {
                mCONJUNCTION(); 


                }
                break;
            case 42 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:317: DISJUNCTION
                {
                mDISJUNCTION(); 


                }
                break;
            case 43 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:329: INCLUDESTART
                {
                mINCLUDESTART(); 


                }
                break;
            case 44 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:342: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 45 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:350: INTVALUE
                {
                mINTVALUE(); 


                }
                break;
            case 46 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:359: FLOATVALUE
                {
                mFLOATVALUE(); 


                }
                break;
            case 47 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:370: STRINGVALUE
                {
                mSTRINGVALUE(); 


                }
                break;
            case 48 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:382: CHARVALUE
                {
                mCHARVALUE(); 


                }
                break;
            case 49 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:392: IDENT
                {
                mIDENT(); 


                }
                break;
            case 50 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:398: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;
            case 51 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:416: WS
                {
                mWS(); 


                }
                break;
            case 52 :
                // C:\\Users\\Rafael\\Dropbox\\UA\\CO\\Project\\workspace\\csub\\src\\main\\antlr3\\com\\compilers\\parsers\\Csub.g:1:419: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\47\1\51\1\53\1\uffff\1\57\1\uffff\1\60\10\uffff\1\62"+
        "\1\uffff\1\64\3\uffff\13\45\2\uffff\1\107\22\uffff\10\45\1\121\1"+
        "\45\1\123\4\45\4\uffff\3\45\1\136\3\45\1\143\1\uffff\1\45\1\uffff"+
        "\4\45\2\uffff\1\61\1\152\2\45\1\uffff\1\155\1\156\2\45\1\uffff\1"+
        "\161\3\45\1\165\2\uffff\1\166\1\167\2\uffff\1\45\1\171\1\uffff\1"+
        "\172\1\173\1\45\3\uffff\1\45\3\uffff\1\176\1\45\1\uffff\1\u0080"+
        "\1\uffff";
    static final String DFA11_eofS =
        "\u0081\uffff";
    static final String DFA11_minS =
        "\1\11\1\75\1\53\1\55\1\uffff\1\52\1\uffff\1\60\10\uffff\1\46\1\uffff"+
        "\1\174\3\uffff\1\162\1\141\1\157\1\150\1\146\1\154\1\157\1\150\1"+
        "\162\1\145\1\141\1\uffff\1\0\1\56\22\uffff\1\165\1\154\1\157\1\162"+
        "\1\151\1\141\1\156\1\164\1\60\1\163\1\60\1\151\1\145\1\164\1\151"+
        "\1\0\3\uffff\1\145\1\163\1\141\1\60\1\144\1\162\1\163\1\60\1\uffff"+
        "\1\145\1\uffff\1\154\1\141\1\165\1\156\1\0\1\uffff\1\0\1\60\1\145"+
        "\1\164\1\uffff\2\60\1\151\1\164\1\uffff\1\60\1\145\1\153\1\162\1"+
        "\60\1\0\1\uffff\2\60\2\uffff\1\156\1\60\1\uffff\2\60\1\156\3\uffff"+
        "\1\165\3\uffff\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\75\1\53\1\55\1\uffff\1\57\1\uffff\1\172\10\uffff\1\46\1"+
        "\uffff\1\174\3\uffff\1\162\3\157\1\156\1\154\1\157\1\150\1\162\1"+
        "\145\1\141\1\uffff\1\uffff\1\71\22\uffff\1\165\1\154\1\157\1\162"+
        "\1\151\1\141\1\156\1\164\1\172\1\163\1\172\1\151\1\145\1\164\1\151"+
        "\1\uffff\3\uffff\1\145\1\163\1\141\1\172\1\144\1\162\1\164\1\172"+
        "\1\uffff\1\145\1\uffff\1\154\1\141\1\165\1\156\1\uffff\1\uffff\1"+
        "\uffff\1\172\1\145\1\164\1\uffff\2\172\1\151\1\164\1\uffff\1\172"+
        "\1\145\1\153\1\162\1\172\1\uffff\1\uffff\2\172\2\uffff\1\156\1\172"+
        "\1\uffff\2\172\1\156\3\uffff\1\165\3\uffff\1\172\1\145\1\uffff\1"+
        "\172\1\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\uffff\1\21\1\uffff\1\23\1\24\1\25\13\uffff\1\53\2\uffff"+
        "\1\60\1\61\1\63\1\1\1\46\1\2\1\47\1\3\1\50\1\62\1\64\1\5\1\7\1\54"+
        "\1\20\1\51\1\22\1\52\20\uffff\1\57\1\55\1\56\10\uffff\1\34\1\uffff"+
        "\1\36\5\uffff\1\54\4\uffff\1\40\4\uffff\1\32\6\uffff\1\26\2\uffff"+
        "\1\30\1\31\2\uffff\1\35\3\uffff\1\45\1\27\1\33\1\uffff\1\44\1\37"+
        "\1\41\2\uffff\1\43\1\uffff\1\42";
    static final String DFA11_specialS =
        "\42\uffff\1\0\42\uffff\1\2\22\uffff\1\3\1\uffff\1\4\16\uffff\1\1"+
        "\27\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\46\1\uffff\2\46\22\uffff\1\46\1\23\1\42\1\41\1\uffff\1\21"+
            "\1\20\1\44\1\10\1\11\1\4\1\2\1\17\1\3\1\uffff\1\5\12\43\1\25"+
            "\1\16\1\7\1\1\1\6\1\24\1\uffff\32\45\1\14\1\uffff\1\15\1\uffff"+
            "\1\45\1\uffff\1\45\1\36\1\31\1\34\1\33\1\27\2\45\1\32\3\45\1"+
            "\40\4\45\1\37\1\45\1\26\1\45\1\30\1\35\3\45\1\12\1\22\1\13",
            "\1\50",
            "\1\52",
            "\1\54",
            "",
            "\1\55\4\uffff\1\56",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "\1\67\12\uffff\1\70\2\uffff\1\71",
            "\1\72",
            "\1\73\6\uffff\1\74",
            "\1\76\7\uffff\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\60\106\12\105\7\106\32\105\4\106\1\105\1\106\32\105\uff85"+
            "\106",
            "\1\110\1\uffff\12\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\122",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\42\106\1\131\13\106\1\130\1\106\12\105\4\106\1\132\2\106\32"+
            "\105\4\106\1\105\1\106\32\105\uff85\106",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\137",
            "\1\140",
            "\1\142\1\141",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\150\106\1\151\uff97\106",
            "",
            "\0\106",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\153",
            "\1\154",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\157",
            "\1\160",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\42\106\1\131\33\106\1\132\uffc1\106",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\170",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\174",
            "",
            "",
            "",
            "\1\175",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\177",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQUAL | PLUS | MINUS | ASTERISK | SLASH | LARGER | SMALLER | OPENPARENT | CLOSEPARENT | OPENCURLY | CLOSECURLY | OPENBRACKET | CLOSEBRACKET | SEMICOLON | COMMA | AMPERSAND | PERCENT | BAR | EXCLAMATION | QUESTION | COLON | TRUE | FALSE | VOID | CHAR | INT | FLOAT | IF | ELSE | DO | WHILE | FOR | BREAK | CONTINUE | RETURN | CONST | MAIN | EQUALITY | INCREMENT | DECREMENT | CONJUNCTION | DISJUNCTION | INCLUDESTART | INCLUDE | INTVALUE | FLOATVALUE | STRINGVALUE | CHARVALUE | IDENT | MULTILINE_COMMENT | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_34 = input.LA(1);

                        s = -1;
                        if ( ((LA11_34 >= '0' && LA11_34 <= '9')||(LA11_34 >= 'A' && LA11_34 <= 'Z')||LA11_34=='_'||(LA11_34 >= 'a' && LA11_34 <= 'z')) ) {s = 69;}

                        else if ( ((LA11_34 >= '\u0000' && LA11_34 <= '/')||(LA11_34 >= ':' && LA11_34 <= '@')||(LA11_34 >= '[' && LA11_34 <= '^')||LA11_34=='`'||(LA11_34 >= '{' && LA11_34 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA11_105 = input.LA(1);

                        s = -1;
                        if ( (LA11_105=='\"') ) {s = 89;}

                        else if ( (LA11_105=='>') ) {s = 90;}

                        else if ( ((LA11_105 >= '\u0000' && LA11_105 <= '!')||(LA11_105 >= '#' && LA11_105 <= '=')||(LA11_105 >= '?' && LA11_105 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA11_69 = input.LA(1);

                        s = -1;
                        if ( (LA11_69=='.') ) {s = 88;}

                        else if ( (LA11_69=='\"') ) {s = 89;}

                        else if ( ((LA11_69 >= '0' && LA11_69 <= '9')||(LA11_69 >= 'A' && LA11_69 <= 'Z')||LA11_69=='_'||(LA11_69 >= 'a' && LA11_69 <= 'z')) ) {s = 69;}

                        else if ( (LA11_69=='>') ) {s = 90;}

                        else if ( ((LA11_69 >= '\u0000' && LA11_69 <= '!')||(LA11_69 >= '#' && LA11_69 <= '-')||LA11_69=='/'||(LA11_69 >= ':' && LA11_69 <= '=')||(LA11_69 >= '?' && LA11_69 <= '@')||(LA11_69 >= '[' && LA11_69 <= '^')||LA11_69=='`'||(LA11_69 >= '{' && LA11_69 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA11_88 = input.LA(1);

                        s = -1;
                        if ( (LA11_88=='h') ) {s = 105;}

                        else if ( ((LA11_88 >= '\u0000' && LA11_88 <= 'g')||(LA11_88 >= 'i' && LA11_88 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA11_90 = input.LA(1);

                        s = -1;
                        if ( ((LA11_90 >= '\u0000' && LA11_90 <= '\uFFFF')) ) {s = 70;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}