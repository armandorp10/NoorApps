package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchoolLexer extends Lexer {
    public static final int RULE_TCLOSINGBRACE=7;
    public static final int RULE_STRING=9;
    public static final int RULE_TOPENBRACE=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_TSEMICOLON=6;
    public static final int RULE_EQUALS=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSchoolLexer() {;} 
    public InternalSchoolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSchoolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSchool.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:11:7: ( 'Application' )
            // InternalSchool.g:11:9: 'Application'
            {
            match("Application"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:12:7: ( 'navBarColorHex' )
            // InternalSchool.g:12:9: 'navBarColorHex'
            {
            match("navBarColorHex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:13:7: ( 'textColor' )
            // InternalSchool.g:13:9: 'textColor'
            {
            match("textColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:14:7: ( 'floatingButtonColor' )
            // InternalSchool.g:14:9: 'floatingButtonColor'
            {
            match("floatingButtonColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:15:7: ( 'Detail' )
            // InternalSchool.g:15:9: 'Detail'
            {
            match("Detail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:16:7: ( 'isStrong' )
            // InternalSchool.g:16:9: 'isStrong'
            {
            match("isStrong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:17:7: ( 'Entity' )
            // InternalSchool.g:17:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:18:7: ( 'description' )
            // InternalSchool.g:18:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:19:7: ( 'Attribute' )
            // InternalSchool.g:19:9: 'Attribute'
            {
            match("Attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:20:7: ( 'isEditable' )
            // InternalSchool.g:20:9: 'isEditable'
            {
            match("isEditable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:21:7: ( 'isMandatory' )
            // InternalSchool.g:21:9: 'isMandatory'
            {
            match("isMandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:22:7: ( 'isVisibleInList' )
            // InternalSchool.g:22:9: 'isVisibleInList'
            {
            match("isVisibleInList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:23:7: ( 'isTitle' )
            // InternalSchool.g:23:9: 'isTitle'
            {
            match("isTitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:24:7: ( 'dataType' )
            // InternalSchool.g:24:9: 'dataType'
            {
            match("dataType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:25:7: ( 'true' )
            // InternalSchool.g:25:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:26:7: ( 'false' )
            // InternalSchool.g:26:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:27:7: ( 'STRING' )
            // InternalSchool.g:27:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:28:7: ( 'BOOLEAN' )
            // InternalSchool.g:28:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:29:7: ( 'NUMBER' )
            // InternalSchool.g:29:9: 'NUMBER'
            {
            match("NUMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:30:7: ( 'DATE' )
            // InternalSchool.g:30:9: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_TOPENBRACE"
    public final void mRULE_TOPENBRACE() throws RecognitionException {
        try {
            int _type = RULE_TOPENBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:790:17: ( '{' )
            // InternalSchool.g:790:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOPENBRACE"

    // $ANTLR start "RULE_TCLOSINGBRACE"
    public final void mRULE_TCLOSINGBRACE() throws RecognitionException {
        try {
            int _type = RULE_TCLOSINGBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:792:20: ( '}' )
            // InternalSchool.g:792:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TCLOSINGBRACE"

    // $ANTLR start "RULE_TSEMICOLON"
    public final void mRULE_TSEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_TSEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:794:17: ( ';' )
            // InternalSchool.g:794:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TSEMICOLON"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:796:13: ( '=' )
            // InternalSchool.g:796:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:798:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSchool.g:798:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSchool.g:798:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSchool.g:798:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSchool.g:798:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchool.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:800:10: ( ( '0' .. '9' )+ )
            // InternalSchool.g:800:12: ( '0' .. '9' )+
            {
            // InternalSchool.g:800:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchool.g:800:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:802:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSchool.g:802:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSchool.g:802:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSchool.g:802:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSchool.g:802:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSchool.g:802:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSchool.g:802:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSchool.g:802:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSchool.g:802:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSchool.g:802:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSchool.g:802:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:804:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSchool.g:804:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSchool.g:804:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSchool.g:804:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:806:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSchool.g:806:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSchool.g:806:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSchool.g:806:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSchool.g:806:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchool.g:806:41: ( '\\r' )? '\\n'
                    {
                    // InternalSchool.g:806:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSchool.g:806:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:808:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSchool.g:808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSchool.g:808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSchool.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSchool.g:810:16: ( . )
            // InternalSchool.g:810:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSchool.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_TOPENBRACE | RULE_TCLOSINGBRACE | RULE_TSEMICOLON | RULE_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSchool.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalSchool.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalSchool.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalSchool.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalSchool.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalSchool.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalSchool.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalSchool.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalSchool.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalSchool.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalSchool.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalSchool.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalSchool.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalSchool.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalSchool.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalSchool.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalSchool.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalSchool.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalSchool.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalSchool.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalSchool.g:1:130: RULE_TOPENBRACE
                {
                mRULE_TOPENBRACE(); 

                }
                break;
            case 22 :
                // InternalSchool.g:1:146: RULE_TCLOSINGBRACE
                {
                mRULE_TCLOSINGBRACE(); 

                }
                break;
            case 23 :
                // InternalSchool.g:1:165: RULE_TSEMICOLON
                {
                mRULE_TSEMICOLON(); 

                }
                break;
            case 24 :
                // InternalSchool.g:1:181: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 25 :
                // InternalSchool.g:1:193: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalSchool.g:1:201: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalSchool.g:1:210: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalSchool.g:1:222: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalSchool.g:1:238: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalSchool.g:1:254: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalSchool.g:1:262: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\13\32\4\uffff\1\27\2\uffff\3\27\2\uffff\2\32\1\uffff\16\32\11\uffff\30\32\1\136\3\32\1\142\17\32\1\uffff\1\32\1\163\1\32\1\uffff\20\32\1\uffff\1\u0085\5\32\1\u008b\2\32\1\u008e\1\32\1\u0090\5\32\1\uffff\4\32\1\u009a\1\uffff\2\32\1\uffff\1\u009d\1\uffff\5\32\1\u00a3\3\32\1\uffff\1\32\1\u00a8\1\uffff\1\32\1\u00aa\1\32\1\u00ac\1\32\1\uffff\4\32\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32\1\u00b5\3\32\1\u00b9\2\32\1\uffff\1\u00bc\1\32\1\u00be\1\uffff\2\32\1\uffff\1\32\1\uffff\3\32\1\u00c5\2\32\1\uffff\1\32\1\u00c9\1\32\1\uffff\2\32\1\u00cd\1\uffff";
    static final String DFA12_eofS =
        "\u00ce\uffff";
    static final String DFA12_minS =
        "\1\0\1\160\1\141\1\145\1\141\1\101\1\163\1\156\1\141\1\124\1\117\1\125\4\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\160\1\164\1\uffff\1\166\1\170\1\165\1\157\1\154\1\164\1\124\1\105\1\164\1\163\1\164\1\122\1\117\1\115\11\uffff\1\154\1\162\1\102\1\164\1\145\1\141\1\163\1\141\1\105\1\164\1\144\1\141\3\151\1\143\1\141\1\111\1\114\1\102\2\151\1\141\1\103\1\60\1\164\1\145\1\151\1\60\1\162\1\151\1\156\1\163\2\164\1\162\1\124\1\116\2\105\1\143\1\142\1\162\1\157\1\uffff\1\151\1\60\1\154\1\uffff\1\157\1\164\1\144\1\151\1\154\1\171\1\151\1\171\1\107\1\101\1\122\1\141\1\165\1\103\1\154\1\156\1\uffff\1\60\1\156\2\141\1\142\1\145\1\60\2\160\1\60\1\116\1\60\2\164\2\157\1\147\1\uffff\1\147\1\142\1\164\1\154\1\60\1\uffff\1\164\1\145\1\uffff\1\60\1\uffff\1\151\1\145\1\154\1\162\1\102\1\60\1\154\1\157\1\145\1\uffff\1\151\1\60\1\uffff\1\157\1\60\1\157\1\60\1\165\1\uffff\1\145\1\162\1\111\1\157\1\uffff\1\156\1\uffff\1\162\1\uffff\1\164\1\60\1\171\2\156\1\60\1\110\1\164\1\uffff\1\60\1\114\1\60\1\uffff\1\145\1\157\1\uffff\1\151\1\uffff\1\170\1\156\1\163\1\60\1\103\1\164\1\uffff\1\157\1\60\1\154\1\uffff\1\157\1\162\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\141\1\162\1\154\1\145\1\163\1\156\1\145\1\124\1\117\1\125\4\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\164\1\uffff\1\166\1\170\1\165\1\157\1\154\1\164\1\124\1\126\1\164\1\163\1\164\1\122\1\117\1\115\11\uffff\1\154\1\162\1\102\1\164\1\145\1\141\1\163\1\141\1\105\1\164\1\144\1\141\3\151\1\143\1\141\1\111\1\114\1\102\2\151\1\141\1\103\1\172\1\164\1\145\1\151\1\172\1\162\1\151\1\156\1\163\2\164\1\162\1\124\1\116\2\105\1\143\1\142\1\162\1\157\1\uffff\1\151\1\172\1\154\1\uffff\1\157\1\164\1\144\1\151\1\154\1\171\1\151\1\171\1\107\1\101\1\122\1\141\1\165\1\103\1\154\1\156\1\uffff\1\172\1\156\2\141\1\142\1\145\1\172\2\160\1\172\1\116\1\172\2\164\2\157\1\147\1\uffff\1\147\1\142\1\164\1\154\1\172\1\uffff\1\164\1\145\1\uffff\1\172\1\uffff\1\151\1\145\1\154\1\162\1\102\1\172\1\154\1\157\1\145\1\uffff\1\151\1\172\1\uffff\1\157\1\172\1\157\1\172\1\165\1\uffff\1\145\1\162\1\111\1\157\1\uffff\1\156\1\uffff\1\162\1\uffff\1\164\1\172\1\171\2\156\1\172\1\110\1\164\1\uffff\1\172\1\114\1\172\1\uffff\1\145\1\157\1\uffff\1\151\1\uffff\1\170\1\156\1\163\1\172\1\103\1\164\1\uffff\1\157\1\172\1\154\1\uffff\1\157\1\162\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\25\1\26\1\27\1\30\1\uffff\1\31\1\32\3\uffff\1\36\1\37\2\uffff\1\31\16\uffff\1\25\1\26\1\27\1\30\1\32\1\33\1\34\1\35\1\36\54\uffff\1\17\3\uffff\1\24\20\uffff\1\20\21\uffff\1\5\5\uffff\1\7\2\uffff\1\21\1\uffff\1\23\11\uffff\1\15\2\uffff\1\22\5\uffff\1\6\4\uffff\1\16\1\uffff\1\11\1\uffff\1\3\10\uffff\1\12\3\uffff\1\1\2\uffff\1\13\1\uffff\1\10\6\uffff\1\2\3\uffff\1\14\3\uffff\1\4";
    static final String DFA12_specialS =
        "\1\0\22\uffff\1\1\1\2\u00b9\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\7\27\1\25\12\22\1\27\1\16\1\27\1\17\3\27\1\1\1\12\1\21\1\5\1\7\10\21\1\13\4\21\1\11\7\21\3\27\1\20\1\21\1\27\3\21\1\10\1\21\1\4\2\21\1\6\4\21\1\2\5\21\1\3\6\21\1\14\1\27\1\15\uff82\27",
            "\1\30\3\uffff\1\31",
            "\1\33",
            "\1\34\14\uffff\1\35",
            "\1\37\12\uffff\1\36",
            "\1\41\43\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\45\3\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74\7\uffff\1\75\5\uffff\1\73\1\77\1\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u008c",
            "\1\u008d",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u008f",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u00a9",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00ab",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00bd",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_TOPENBRACE | RULE_TCLOSINGBRACE | RULE_TSEMICOLON | RULE_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='n') ) {s = 2;}

                        else if ( (LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='f') ) {s = 4;}

                        else if ( (LA12_0=='D') ) {s = 5;}

                        else if ( (LA12_0=='i') ) {s = 6;}

                        else if ( (LA12_0=='E') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='B') ) {s = 10;}

                        else if ( (LA12_0=='N') ) {s = 11;}

                        else if ( (LA12_0=='{') ) {s = 12;}

                        else if ( (LA12_0=='}') ) {s = 13;}

                        else if ( (LA12_0==';') ) {s = 14;}

                        else if ( (LA12_0=='=') ) {s = 15;}

                        else if ( (LA12_0=='^') ) {s = 16;}

                        else if ( (LA12_0=='C'||(LA12_0>='F' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 17;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}