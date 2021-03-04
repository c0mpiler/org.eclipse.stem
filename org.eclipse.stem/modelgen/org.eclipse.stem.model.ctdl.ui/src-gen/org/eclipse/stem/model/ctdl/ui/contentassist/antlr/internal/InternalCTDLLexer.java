package org.eclipse.stem.model.ctdl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCTDLLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalCTDLLexer() {;} 
    public InternalCTDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCTDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:11:7: ( '=' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:12:7: ( 'delta' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:12:9: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:13:7: ( ';' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:13:9: ';'
            {
            match(';'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:14:7: ( '+' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:14:9: '+'
            {
            match('+'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:15:7: ( '-' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:15:9: '-'
            {
            match('-'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:16:7: ( '*' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:16:9: '*'
            {
            match('*'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:17:7: ( '/' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:17:9: '/'
            {
            match('/'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:18:7: ( '(' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:18:9: '('
            {
            match('('); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:19:7: ( ')' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:19:9: ')'
            {
            match(')'); 

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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:20:7: ( ',' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2469:14: ( ( 'true' | 'false' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2469:16: ( 'true' | 'false' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2469:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2469:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2469:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:13: ( ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:15: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:15: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? | '.' ( '0' .. '9' )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='.') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:16: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:16: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:28: ( '.' ( '0' .. '9' )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:29: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:33: ( '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:34: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:47: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:51: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:52: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }

            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:64: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:65: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:75: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:86: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2471:87: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


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
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2473:10: ( 'this one has been deactivated' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2473:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2475:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2475:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2475:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2475:11: '^'
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

            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2475:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:
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
            	    break loop11;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2477:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2479:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2479:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2479:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2479:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2481:41: '\\r'
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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2483:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2485:16: ( . )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2485:18: .
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
        // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_BOOLEAN | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=19;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:70: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 12 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:83: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 13 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:95: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:104: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:112: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:124: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:140: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:156: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1:164: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\2\uffff\1\27\4\uffff\1\36\3\uffff\2\27\1\uffff\2\24\1\uffff\2\24\3\uffff\1\27\13\uffff\3\27\3\uffff\5\27\1\61\2\27\1\64\2\uffff\1\61\1\uffff";
    static final String DFA20_eofS =
        "\65\uffff";
    static final String DFA20_minS =
        "\1\0\1\uffff\1\145\4\uffff\1\52\3\uffff\1\150\1\141\1\uffff\1\60\1\101\1\uffff\2\0\3\uffff\1\154\13\uffff\1\165\1\151\1\154\3\uffff\1\164\1\145\2\163\1\141\1\60\1\40\1\145\1\60\2\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\uffff\1\145\4\uffff\1\57\3\uffff\1\162\1\141\1\uffff\1\71\1\172\1\uffff\2\uffff\3\uffff\1\154\13\uffff\1\165\1\151\1\154\3\uffff\1\164\1\145\2\163\1\141\1\172\1\40\1\145\1\172\2\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\2\uffff\1\14\2\uffff\1\16\2\uffff\1\22\1\23\1\1\1\uffff\1\16\1\3\1\4\1\5\1\6\1\20\1\21\1\7\1\10\1\11\1\12\3\uffff\1\14\1\17\1\22\11\uffff\1\13\1\15\1\uffff\1\2";
    static final String DFA20_specialS =
        "\1\2\20\uffff\1\1\1\0\42\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\21\4\24\1\22\1\10\1\11\1\6\1\4\1\12\1\5\1\16\1\7\12\15\1\24\1\3\1\24\1\1\3\24\32\20\3\24\1\17\1\20\1\24\3\20\1\2\1\20\1\14\15\20\1\13\6\20\uff85\24",
            "",
            "\1\26",
            "",
            "",
            "",
            "",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "",
            "\1\43\11\uffff\1\42",
            "\1\44",
            "",
            "\12\45",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\46",
            "\0\46",
            "",
            "",
            "",
            "\1\50",
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
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\62",
            "\1\63",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_BOOLEAN | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_18 = input.LA(1);

                        s = -1;
                        if ( ((LA20_18>='\u0000' && LA20_18<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_17 = input.LA(1);

                        s = -1;
                        if ( ((LA20_17>='\u0000' && LA20_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='=') ) {s = 1;}

                        else if ( (LA20_0=='d') ) {s = 2;}

                        else if ( (LA20_0==';') ) {s = 3;}

                        else if ( (LA20_0=='+') ) {s = 4;}

                        else if ( (LA20_0=='-') ) {s = 5;}

                        else if ( (LA20_0=='*') ) {s = 6;}

                        else if ( (LA20_0=='/') ) {s = 7;}

                        else if ( (LA20_0=='(') ) {s = 8;}

                        else if ( (LA20_0==')') ) {s = 9;}

                        else if ( (LA20_0==',') ) {s = 10;}

                        else if ( (LA20_0=='t') ) {s = 11;}

                        else if ( (LA20_0=='f') ) {s = 12;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 13;}

                        else if ( (LA20_0=='.') ) {s = 14;}

                        else if ( (LA20_0=='^') ) {s = 15;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='c')||LA20_0=='e'||(LA20_0>='g' && LA20_0<='s')||(LA20_0>='u' && LA20_0<='z')) ) {s = 16;}

                        else if ( (LA20_0=='\"') ) {s = 17;}

                        else if ( (LA20_0=='\'') ) {s = 18;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 19;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0==':'||LA20_0=='<'||(LA20_0>='>' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}