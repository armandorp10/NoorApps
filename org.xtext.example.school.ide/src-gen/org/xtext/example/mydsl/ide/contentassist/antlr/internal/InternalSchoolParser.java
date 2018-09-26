package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SchoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchoolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TOPENBRACE", "RULE_EQUALS", "RULE_TSEMICOLON", "RULE_TCLOSINGBRACE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'STRING'", "'BOOLEAN'", "'NUMBER'", "'DATE'", "'Application'", "'navBarColorHex'", "'textColor'", "'floatingButtonColor'", "'Detail'", "'isStrong'", "'Entity'", "'description'", "'Attribute'", "'isEditable'", "'isMandatory'", "'isVisibleInList'", "'isTitle'", "'dataType'"
    };
    public static final int RULE_TCLOSINGBRACE=9;
    public static final int RULE_STRING=4;
    public static final int RULE_TOPENBRACE=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_TSEMICOLON=8;
    public static final int RULE_EQUALS=7;
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
    public static final int RULE_ID=5;
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


        public InternalSchoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSchool.g"; }


    	private SchoolGrammarAccess grammarAccess;

    	public void setGrammarAccess(SchoolGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoot"
    // InternalSchool.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalSchool.g:54:1: ( ruleRoot EOF )
            // InternalSchool.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalSchool.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalSchool.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalSchool.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalSchool.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalSchool.g:69:3: ( rule__Root__Group__0 )
            // InternalSchool.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleDetalle"
    // InternalSchool.g:78:1: entryRuleDetalle : ruleDetalle EOF ;
    public final void entryRuleDetalle() throws RecognitionException {
        try {
            // InternalSchool.g:79:1: ( ruleDetalle EOF )
            // InternalSchool.g:80:1: ruleDetalle EOF
            {
             before(grammarAccess.getDetalleRule()); 
            pushFollow(FOLLOW_1);
            ruleDetalle();

            state._fsp--;

             after(grammarAccess.getDetalleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDetalle"


    // $ANTLR start "ruleDetalle"
    // InternalSchool.g:87:1: ruleDetalle : ( ( rule__Detalle__Group__0 ) ) ;
    public final void ruleDetalle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:91:2: ( ( ( rule__Detalle__Group__0 ) ) )
            // InternalSchool.g:92:2: ( ( rule__Detalle__Group__0 ) )
            {
            // InternalSchool.g:92:2: ( ( rule__Detalle__Group__0 ) )
            // InternalSchool.g:93:3: ( rule__Detalle__Group__0 )
            {
             before(grammarAccess.getDetalleAccess().getGroup()); 
            // InternalSchool.g:94:3: ( rule__Detalle__Group__0 )
            // InternalSchool.g:94:4: rule__Detalle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Detalle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetalleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDetalle"


    // $ANTLR start "entryRuleEntidad"
    // InternalSchool.g:103:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalSchool.g:104:1: ( ruleEntidad EOF )
            // InternalSchool.g:105:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalSchool.g:112:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:116:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalSchool.g:117:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalSchool.g:117:2: ( ( rule__Entidad__Group__0 ) )
            // InternalSchool.g:118:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalSchool.g:119:3: ( rule__Entidad__Group__0 )
            // InternalSchool.g:119:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalSchool.g:128:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalSchool.g:129:1: ( ruleAtributo EOF )
            // InternalSchool.g:130:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalSchool.g:137:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:141:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalSchool.g:142:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalSchool.g:142:2: ( ( rule__Atributo__Group__0 ) )
            // InternalSchool.g:143:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalSchool.g:144:3: ( rule__Atributo__Group__0 )
            // InternalSchool.g:144:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleEString"
    // InternalSchool.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSchool.g:154:1: ( ruleEString EOF )
            // InternalSchool.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSchool.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSchool.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSchool.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalSchool.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSchool.g:169:3: ( rule__EString__Alternatives )
            // InternalSchool.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSchool.g:178:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSchool.g:179:1: ( ruleEBoolean EOF )
            // InternalSchool.g:180:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSchool.g:187:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:191:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSchool.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSchool.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSchool.g:193:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSchool.g:194:3: ( rule__EBoolean__Alternatives )
            // InternalSchool.g:194:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleTipoDato"
    // InternalSchool.g:203:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:207:1: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalSchool.g:208:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalSchool.g:208:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalSchool.g:209:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalSchool.g:210:3: ( rule__TipoDato__Alternatives )
            // InternalSchool.g:210:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSchool.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSchool.g:223:2: ( RULE_STRING )
                    {
                    // InternalSchool.g:223:2: ( RULE_STRING )
                    // InternalSchool.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchool.g:229:2: ( RULE_ID )
                    {
                    // InternalSchool.g:229:2: ( RULE_ID )
                    // InternalSchool.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalSchool.g:239:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:243:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSchool.g:244:2: ( 'true' )
                    {
                    // InternalSchool.g:244:2: ( 'true' )
                    // InternalSchool.g:245:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchool.g:250:2: ( 'false' )
                    {
                    // InternalSchool.g:250:2: ( 'false' )
                    // InternalSchool.g:251:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalSchool.g:260:1: rule__TipoDato__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:264:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSchool.g:265:2: ( ( 'STRING' ) )
                    {
                    // InternalSchool.g:265:2: ( ( 'STRING' ) )
                    // InternalSchool.g:266:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_0()); 
                    // InternalSchool.g:267:3: ( 'STRING' )
                    // InternalSchool.g:267:4: 'STRING'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchool.g:271:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSchool.g:271:2: ( ( 'BOOLEAN' ) )
                    // InternalSchool.g:272:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getBoleanoEnumLiteralDeclaration_1()); 
                    // InternalSchool.g:273:3: ( 'BOOLEAN' )
                    // InternalSchool.g:273:4: 'BOOLEAN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getBoleanoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSchool.g:277:2: ( ( 'NUMBER' ) )
                    {
                    // InternalSchool.g:277:2: ( ( 'NUMBER' ) )
                    // InternalSchool.g:278:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_2()); 
                    // InternalSchool.g:279:3: ( 'NUMBER' )
                    // InternalSchool.g:279:4: 'NUMBER'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSchool.g:283:2: ( ( 'DATE' ) )
                    {
                    // InternalSchool.g:283:2: ( ( 'DATE' ) )
                    // InternalSchool.g:284:3: ( 'DATE' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3()); 
                    // InternalSchool.g:285:3: ( 'DATE' )
                    // InternalSchool.g:285:4: 'DATE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalSchool.g:293:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:297:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalSchool.g:298:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalSchool.g:305:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:309:1: ( ( () ) )
            // InternalSchool.g:310:1: ( () )
            {
            // InternalSchool.g:310:1: ( () )
            // InternalSchool.g:311:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // InternalSchool.g:312:2: ()
            // InternalSchool.g:312:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalSchool.g:320:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:324:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalSchool.g:325:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalSchool.g:332:1: rule__Root__Group__1__Impl : ( 'Application' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:336:1: ( ( 'Application' ) )
            // InternalSchool.g:337:1: ( 'Application' )
            {
            // InternalSchool.g:337:1: ( 'Application' )
            // InternalSchool.g:338:2: 'Application'
            {
             before(grammarAccess.getRootAccess().getApplicationKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getApplicationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalSchool.g:347:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:351:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalSchool.g:352:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalSchool.g:359:1: rule__Root__Group__2__Impl : ( ( rule__Root__NombreAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:363:1: ( ( ( rule__Root__NombreAssignment_2 ) ) )
            // InternalSchool.g:364:1: ( ( rule__Root__NombreAssignment_2 ) )
            {
            // InternalSchool.g:364:1: ( ( rule__Root__NombreAssignment_2 ) )
            // InternalSchool.g:365:2: ( rule__Root__NombreAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getNombreAssignment_2()); 
            // InternalSchool.g:366:2: ( rule__Root__NombreAssignment_2 )
            // InternalSchool.g:366:3: rule__Root__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalSchool.g:374:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:378:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalSchool.g:379:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalSchool.g:386:1: rule__Root__Group__3__Impl : ( RULE_TOPENBRACE ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:390:1: ( ( RULE_TOPENBRACE ) )
            // InternalSchool.g:391:1: ( RULE_TOPENBRACE )
            {
            // InternalSchool.g:391:1: ( RULE_TOPENBRACE )
            // InternalSchool.g:392:2: RULE_TOPENBRACE
            {
             before(grammarAccess.getRootAccess().getTOPENBRACETerminalRuleCall_3()); 
            match(input,RULE_TOPENBRACE,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTOPENBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalSchool.g:401:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:405:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalSchool.g:406:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalSchool.g:413:1: rule__Root__Group__4__Impl : ( 'navBarColorHex' ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:417:1: ( ( 'navBarColorHex' ) )
            // InternalSchool.g:418:1: ( 'navBarColorHex' )
            {
            // InternalSchool.g:418:1: ( 'navBarColorHex' )
            // InternalSchool.g:419:2: 'navBarColorHex'
            {
             before(grammarAccess.getRootAccess().getNavBarColorHexKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getNavBarColorHexKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalSchool.g:428:1: rule__Root__Group__5 : rule__Root__Group__5__Impl rule__Root__Group__6 ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:432:1: ( rule__Root__Group__5__Impl rule__Root__Group__6 )
            // InternalSchool.g:433:2: rule__Root__Group__5__Impl rule__Root__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalSchool.g:440:1: rule__Root__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:444:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:445:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:445:1: ( RULE_EQUALS )
            // InternalSchool.g:446:2: RULE_EQUALS
            {
             before(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Root__Group__6"
    // InternalSchool.g:455:1: rule__Root__Group__6 : rule__Root__Group__6__Impl rule__Root__Group__7 ;
    public final void rule__Root__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:459:1: ( rule__Root__Group__6__Impl rule__Root__Group__7 )
            // InternalSchool.g:460:2: rule__Root__Group__6__Impl rule__Root__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6"


    // $ANTLR start "rule__Root__Group__6__Impl"
    // InternalSchool.g:467:1: rule__Root__Group__6__Impl : ( ( rule__Root__NavBarColorHexAssignment_6 ) ) ;
    public final void rule__Root__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:471:1: ( ( ( rule__Root__NavBarColorHexAssignment_6 ) ) )
            // InternalSchool.g:472:1: ( ( rule__Root__NavBarColorHexAssignment_6 ) )
            {
            // InternalSchool.g:472:1: ( ( rule__Root__NavBarColorHexAssignment_6 ) )
            // InternalSchool.g:473:2: ( rule__Root__NavBarColorHexAssignment_6 )
            {
             before(grammarAccess.getRootAccess().getNavBarColorHexAssignment_6()); 
            // InternalSchool.g:474:2: ( rule__Root__NavBarColorHexAssignment_6 )
            // InternalSchool.g:474:3: rule__Root__NavBarColorHexAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Root__NavBarColorHexAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNavBarColorHexAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__6__Impl"


    // $ANTLR start "rule__Root__Group__7"
    // InternalSchool.g:482:1: rule__Root__Group__7 : rule__Root__Group__7__Impl rule__Root__Group__8 ;
    public final void rule__Root__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:486:1: ( rule__Root__Group__7__Impl rule__Root__Group__8 )
            // InternalSchool.g:487:2: rule__Root__Group__7__Impl rule__Root__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Root__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__7"


    // $ANTLR start "rule__Root__Group__7__Impl"
    // InternalSchool.g:494:1: rule__Root__Group__7__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Root__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:498:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:499:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:499:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:500:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__7__Impl"


    // $ANTLR start "rule__Root__Group__8"
    // InternalSchool.g:509:1: rule__Root__Group__8 : rule__Root__Group__8__Impl rule__Root__Group__9 ;
    public final void rule__Root__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:513:1: ( rule__Root__Group__8__Impl rule__Root__Group__9 )
            // InternalSchool.g:514:2: rule__Root__Group__8__Impl rule__Root__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__8"


    // $ANTLR start "rule__Root__Group__8__Impl"
    // InternalSchool.g:521:1: rule__Root__Group__8__Impl : ( 'textColor' ) ;
    public final void rule__Root__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:525:1: ( ( 'textColor' ) )
            // InternalSchool.g:526:1: ( 'textColor' )
            {
            // InternalSchool.g:526:1: ( 'textColor' )
            // InternalSchool.g:527:2: 'textColor'
            {
             before(grammarAccess.getRootAccess().getTextColorKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTextColorKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__8__Impl"


    // $ANTLR start "rule__Root__Group__9"
    // InternalSchool.g:536:1: rule__Root__Group__9 : rule__Root__Group__9__Impl rule__Root__Group__10 ;
    public final void rule__Root__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:540:1: ( rule__Root__Group__9__Impl rule__Root__Group__10 )
            // InternalSchool.g:541:2: rule__Root__Group__9__Impl rule__Root__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__9"


    // $ANTLR start "rule__Root__Group__9__Impl"
    // InternalSchool.g:548:1: rule__Root__Group__9__Impl : ( RULE_EQUALS ) ;
    public final void rule__Root__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:552:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:553:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:553:1: ( RULE_EQUALS )
            // InternalSchool.g:554:2: RULE_EQUALS
            {
             before(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_9()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__9__Impl"


    // $ANTLR start "rule__Root__Group__10"
    // InternalSchool.g:563:1: rule__Root__Group__10 : rule__Root__Group__10__Impl rule__Root__Group__11 ;
    public final void rule__Root__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:567:1: ( rule__Root__Group__10__Impl rule__Root__Group__11 )
            // InternalSchool.g:568:2: rule__Root__Group__10__Impl rule__Root__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__10"


    // $ANTLR start "rule__Root__Group__10__Impl"
    // InternalSchool.g:575:1: rule__Root__Group__10__Impl : ( ( rule__Root__TextColorAssignment_10 ) ) ;
    public final void rule__Root__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:579:1: ( ( ( rule__Root__TextColorAssignment_10 ) ) )
            // InternalSchool.g:580:1: ( ( rule__Root__TextColorAssignment_10 ) )
            {
            // InternalSchool.g:580:1: ( ( rule__Root__TextColorAssignment_10 ) )
            // InternalSchool.g:581:2: ( rule__Root__TextColorAssignment_10 )
            {
             before(grammarAccess.getRootAccess().getTextColorAssignment_10()); 
            // InternalSchool.g:582:2: ( rule__Root__TextColorAssignment_10 )
            // InternalSchool.g:582:3: rule__Root__TextColorAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Root__TextColorAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getTextColorAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__10__Impl"


    // $ANTLR start "rule__Root__Group__11"
    // InternalSchool.g:590:1: rule__Root__Group__11 : rule__Root__Group__11__Impl rule__Root__Group__12 ;
    public final void rule__Root__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:594:1: ( rule__Root__Group__11__Impl rule__Root__Group__12 )
            // InternalSchool.g:595:2: rule__Root__Group__11__Impl rule__Root__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Root__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__11"


    // $ANTLR start "rule__Root__Group__11__Impl"
    // InternalSchool.g:602:1: rule__Root__Group__11__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Root__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:606:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:607:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:607:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:608:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_11()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__11__Impl"


    // $ANTLR start "rule__Root__Group__12"
    // InternalSchool.g:617:1: rule__Root__Group__12 : rule__Root__Group__12__Impl rule__Root__Group__13 ;
    public final void rule__Root__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:621:1: ( rule__Root__Group__12__Impl rule__Root__Group__13 )
            // InternalSchool.g:622:2: rule__Root__Group__12__Impl rule__Root__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__12"


    // $ANTLR start "rule__Root__Group__12__Impl"
    // InternalSchool.g:629:1: rule__Root__Group__12__Impl : ( 'floatingButtonColor' ) ;
    public final void rule__Root__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:633:1: ( ( 'floatingButtonColor' ) )
            // InternalSchool.g:634:1: ( 'floatingButtonColor' )
            {
            // InternalSchool.g:634:1: ( 'floatingButtonColor' )
            // InternalSchool.g:635:2: 'floatingButtonColor'
            {
             before(grammarAccess.getRootAccess().getFloatingButtonColorKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getFloatingButtonColorKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__12__Impl"


    // $ANTLR start "rule__Root__Group__13"
    // InternalSchool.g:644:1: rule__Root__Group__13 : rule__Root__Group__13__Impl rule__Root__Group__14 ;
    public final void rule__Root__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:648:1: ( rule__Root__Group__13__Impl rule__Root__Group__14 )
            // InternalSchool.g:649:2: rule__Root__Group__13__Impl rule__Root__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__13"


    // $ANTLR start "rule__Root__Group__13__Impl"
    // InternalSchool.g:656:1: rule__Root__Group__13__Impl : ( RULE_EQUALS ) ;
    public final void rule__Root__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:660:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:661:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:661:1: ( RULE_EQUALS )
            // InternalSchool.g:662:2: RULE_EQUALS
            {
             before(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_13()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__13__Impl"


    // $ANTLR start "rule__Root__Group__14"
    // InternalSchool.g:671:1: rule__Root__Group__14 : rule__Root__Group__14__Impl rule__Root__Group__15 ;
    public final void rule__Root__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:675:1: ( rule__Root__Group__14__Impl rule__Root__Group__15 )
            // InternalSchool.g:676:2: rule__Root__Group__14__Impl rule__Root__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__14"


    // $ANTLR start "rule__Root__Group__14__Impl"
    // InternalSchool.g:683:1: rule__Root__Group__14__Impl : ( ( rule__Root__FloatingButtonColorAssignment_14 ) ) ;
    public final void rule__Root__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:687:1: ( ( ( rule__Root__FloatingButtonColorAssignment_14 ) ) )
            // InternalSchool.g:688:1: ( ( rule__Root__FloatingButtonColorAssignment_14 ) )
            {
            // InternalSchool.g:688:1: ( ( rule__Root__FloatingButtonColorAssignment_14 ) )
            // InternalSchool.g:689:2: ( rule__Root__FloatingButtonColorAssignment_14 )
            {
             before(grammarAccess.getRootAccess().getFloatingButtonColorAssignment_14()); 
            // InternalSchool.g:690:2: ( rule__Root__FloatingButtonColorAssignment_14 )
            // InternalSchool.g:690:3: rule__Root__FloatingButtonColorAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Root__FloatingButtonColorAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getFloatingButtonColorAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__14__Impl"


    // $ANTLR start "rule__Root__Group__15"
    // InternalSchool.g:698:1: rule__Root__Group__15 : rule__Root__Group__15__Impl rule__Root__Group__16 ;
    public final void rule__Root__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:702:1: ( rule__Root__Group__15__Impl rule__Root__Group__16 )
            // InternalSchool.g:703:2: rule__Root__Group__15__Impl rule__Root__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__Root__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__15"


    // $ANTLR start "rule__Root__Group__15__Impl"
    // InternalSchool.g:710:1: rule__Root__Group__15__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Root__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:714:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:715:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:715:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:716:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_15()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__15__Impl"


    // $ANTLR start "rule__Root__Group__16"
    // InternalSchool.g:725:1: rule__Root__Group__16 : rule__Root__Group__16__Impl rule__Root__Group__17 ;
    public final void rule__Root__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:729:1: ( rule__Root__Group__16__Impl rule__Root__Group__17 )
            // InternalSchool.g:730:2: rule__Root__Group__16__Impl rule__Root__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Root__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__16"


    // $ANTLR start "rule__Root__Group__16__Impl"
    // InternalSchool.g:737:1: rule__Root__Group__16__Impl : ( ( ( rule__Root__EntidadAssignment_16 ) ) ( ( rule__Root__EntidadAssignment_16 )* ) ) ;
    public final void rule__Root__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:741:1: ( ( ( ( rule__Root__EntidadAssignment_16 ) ) ( ( rule__Root__EntidadAssignment_16 )* ) ) )
            // InternalSchool.g:742:1: ( ( ( rule__Root__EntidadAssignment_16 ) ) ( ( rule__Root__EntidadAssignment_16 )* ) )
            {
            // InternalSchool.g:742:1: ( ( ( rule__Root__EntidadAssignment_16 ) ) ( ( rule__Root__EntidadAssignment_16 )* ) )
            // InternalSchool.g:743:2: ( ( rule__Root__EntidadAssignment_16 ) ) ( ( rule__Root__EntidadAssignment_16 )* )
            {
            // InternalSchool.g:743:2: ( ( rule__Root__EntidadAssignment_16 ) )
            // InternalSchool.g:744:3: ( rule__Root__EntidadAssignment_16 )
            {
             before(grammarAccess.getRootAccess().getEntidadAssignment_16()); 
            // InternalSchool.g:745:3: ( rule__Root__EntidadAssignment_16 )
            // InternalSchool.g:745:4: rule__Root__EntidadAssignment_16
            {
            pushFollow(FOLLOW_13);
            rule__Root__EntidadAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getEntidadAssignment_16()); 

            }

            // InternalSchool.g:748:2: ( ( rule__Root__EntidadAssignment_16 )* )
            // InternalSchool.g:749:3: ( rule__Root__EntidadAssignment_16 )*
            {
             before(grammarAccess.getRootAccess().getEntidadAssignment_16()); 
            // InternalSchool.g:750:3: ( rule__Root__EntidadAssignment_16 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSchool.g:750:4: rule__Root__EntidadAssignment_16
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Root__EntidadAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getEntidadAssignment_16()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__16__Impl"


    // $ANTLR start "rule__Root__Group__17"
    // InternalSchool.g:759:1: rule__Root__Group__17 : rule__Root__Group__17__Impl rule__Root__Group__18 ;
    public final void rule__Root__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:763:1: ( rule__Root__Group__17__Impl rule__Root__Group__18 )
            // InternalSchool.g:764:2: rule__Root__Group__17__Impl rule__Root__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Root__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__17"


    // $ANTLR start "rule__Root__Group__17__Impl"
    // InternalSchool.g:771:1: rule__Root__Group__17__Impl : ( ( rule__Root__DetallesAssignment_17 )* ) ;
    public final void rule__Root__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:775:1: ( ( ( rule__Root__DetallesAssignment_17 )* ) )
            // InternalSchool.g:776:1: ( ( rule__Root__DetallesAssignment_17 )* )
            {
            // InternalSchool.g:776:1: ( ( rule__Root__DetallesAssignment_17 )* )
            // InternalSchool.g:777:2: ( rule__Root__DetallesAssignment_17 )*
            {
             before(grammarAccess.getRootAccess().getDetallesAssignment_17()); 
            // InternalSchool.g:778:2: ( rule__Root__DetallesAssignment_17 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchool.g:778:3: rule__Root__DetallesAssignment_17
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Root__DetallesAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getDetallesAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__17__Impl"


    // $ANTLR start "rule__Root__Group__18"
    // InternalSchool.g:786:1: rule__Root__Group__18 : rule__Root__Group__18__Impl ;
    public final void rule__Root__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:790:1: ( rule__Root__Group__18__Impl )
            // InternalSchool.g:791:2: rule__Root__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__18"


    // $ANTLR start "rule__Root__Group__18__Impl"
    // InternalSchool.g:797:1: rule__Root__Group__18__Impl : ( RULE_TCLOSINGBRACE ) ;
    public final void rule__Root__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:801:1: ( ( RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:802:1: ( RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:802:1: ( RULE_TCLOSINGBRACE )
            // InternalSchool.g:803:2: RULE_TCLOSINGBRACE
            {
             before(grammarAccess.getRootAccess().getTCLOSINGBRACETerminalRuleCall_18()); 
            match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getTCLOSINGBRACETerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__18__Impl"


    // $ANTLR start "rule__Detalle__Group__0"
    // InternalSchool.g:813:1: rule__Detalle__Group__0 : rule__Detalle__Group__0__Impl rule__Detalle__Group__1 ;
    public final void rule__Detalle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:817:1: ( rule__Detalle__Group__0__Impl rule__Detalle__Group__1 )
            // InternalSchool.g:818:2: rule__Detalle__Group__0__Impl rule__Detalle__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Detalle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__0"


    // $ANTLR start "rule__Detalle__Group__0__Impl"
    // InternalSchool.g:825:1: rule__Detalle__Group__0__Impl : ( () ) ;
    public final void rule__Detalle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:829:1: ( ( () ) )
            // InternalSchool.g:830:1: ( () )
            {
            // InternalSchool.g:830:1: ( () )
            // InternalSchool.g:831:2: ()
            {
             before(grammarAccess.getDetalleAccess().getDetalleAction_0()); 
            // InternalSchool.g:832:2: ()
            // InternalSchool.g:832:3: 
            {
            }

             after(grammarAccess.getDetalleAccess().getDetalleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__0__Impl"


    // $ANTLR start "rule__Detalle__Group__1"
    // InternalSchool.g:840:1: rule__Detalle__Group__1 : rule__Detalle__Group__1__Impl rule__Detalle__Group__2 ;
    public final void rule__Detalle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:844:1: ( rule__Detalle__Group__1__Impl rule__Detalle__Group__2 )
            // InternalSchool.g:845:2: rule__Detalle__Group__1__Impl rule__Detalle__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Detalle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__1"


    // $ANTLR start "rule__Detalle__Group__1__Impl"
    // InternalSchool.g:852:1: rule__Detalle__Group__1__Impl : ( 'Detail' ) ;
    public final void rule__Detalle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:856:1: ( ( 'Detail' ) )
            // InternalSchool.g:857:1: ( 'Detail' )
            {
            // InternalSchool.g:857:1: ( 'Detail' )
            // InternalSchool.g:858:2: 'Detail'
            {
             before(grammarAccess.getDetalleAccess().getDetailKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getDetailKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__1__Impl"


    // $ANTLR start "rule__Detalle__Group__2"
    // InternalSchool.g:867:1: rule__Detalle__Group__2 : rule__Detalle__Group__2__Impl rule__Detalle__Group__3 ;
    public final void rule__Detalle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:871:1: ( rule__Detalle__Group__2__Impl rule__Detalle__Group__3 )
            // InternalSchool.g:872:2: rule__Detalle__Group__2__Impl rule__Detalle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Detalle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__2"


    // $ANTLR start "rule__Detalle__Group__2__Impl"
    // InternalSchool.g:879:1: rule__Detalle__Group__2__Impl : ( ( rule__Detalle__NameAssignment_2 ) ) ;
    public final void rule__Detalle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:883:1: ( ( ( rule__Detalle__NameAssignment_2 ) ) )
            // InternalSchool.g:884:1: ( ( rule__Detalle__NameAssignment_2 ) )
            {
            // InternalSchool.g:884:1: ( ( rule__Detalle__NameAssignment_2 ) )
            // InternalSchool.g:885:2: ( rule__Detalle__NameAssignment_2 )
            {
             before(grammarAccess.getDetalleAccess().getNameAssignment_2()); 
            // InternalSchool.g:886:2: ( rule__Detalle__NameAssignment_2 )
            // InternalSchool.g:886:3: rule__Detalle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Detalle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDetalleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__2__Impl"


    // $ANTLR start "rule__Detalle__Group__3"
    // InternalSchool.g:894:1: rule__Detalle__Group__3 : rule__Detalle__Group__3__Impl rule__Detalle__Group__4 ;
    public final void rule__Detalle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:898:1: ( rule__Detalle__Group__3__Impl rule__Detalle__Group__4 )
            // InternalSchool.g:899:2: rule__Detalle__Group__3__Impl rule__Detalle__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Detalle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__3"


    // $ANTLR start "rule__Detalle__Group__3__Impl"
    // InternalSchool.g:906:1: rule__Detalle__Group__3__Impl : ( RULE_TOPENBRACE ) ;
    public final void rule__Detalle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:910:1: ( ( RULE_TOPENBRACE ) )
            // InternalSchool.g:911:1: ( RULE_TOPENBRACE )
            {
            // InternalSchool.g:911:1: ( RULE_TOPENBRACE )
            // InternalSchool.g:912:2: RULE_TOPENBRACE
            {
             before(grammarAccess.getDetalleAccess().getTOPENBRACETerminalRuleCall_3()); 
            match(input,RULE_TOPENBRACE,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getTOPENBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__3__Impl"


    // $ANTLR start "rule__Detalle__Group__4"
    // InternalSchool.g:921:1: rule__Detalle__Group__4 : rule__Detalle__Group__4__Impl rule__Detalle__Group__5 ;
    public final void rule__Detalle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:925:1: ( rule__Detalle__Group__4__Impl rule__Detalle__Group__5 )
            // InternalSchool.g:926:2: rule__Detalle__Group__4__Impl rule__Detalle__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Detalle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__4"


    // $ANTLR start "rule__Detalle__Group__4__Impl"
    // InternalSchool.g:933:1: rule__Detalle__Group__4__Impl : ( 'isStrong' ) ;
    public final void rule__Detalle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:937:1: ( ( 'isStrong' ) )
            // InternalSchool.g:938:1: ( 'isStrong' )
            {
            // InternalSchool.g:938:1: ( 'isStrong' )
            // InternalSchool.g:939:2: 'isStrong'
            {
             before(grammarAccess.getDetalleAccess().getIsStrongKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getIsStrongKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__4__Impl"


    // $ANTLR start "rule__Detalle__Group__5"
    // InternalSchool.g:948:1: rule__Detalle__Group__5 : rule__Detalle__Group__5__Impl rule__Detalle__Group__6 ;
    public final void rule__Detalle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:952:1: ( rule__Detalle__Group__5__Impl rule__Detalle__Group__6 )
            // InternalSchool.g:953:2: rule__Detalle__Group__5__Impl rule__Detalle__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Detalle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__5"


    // $ANTLR start "rule__Detalle__Group__5__Impl"
    // InternalSchool.g:960:1: rule__Detalle__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Detalle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:964:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:965:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:965:1: ( RULE_EQUALS )
            // InternalSchool.g:966:2: RULE_EQUALS
            {
             before(grammarAccess.getDetalleAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__5__Impl"


    // $ANTLR start "rule__Detalle__Group__6"
    // InternalSchool.g:975:1: rule__Detalle__Group__6 : rule__Detalle__Group__6__Impl rule__Detalle__Group__7 ;
    public final void rule__Detalle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:979:1: ( rule__Detalle__Group__6__Impl rule__Detalle__Group__7 )
            // InternalSchool.g:980:2: rule__Detalle__Group__6__Impl rule__Detalle__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Detalle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__6"


    // $ANTLR start "rule__Detalle__Group__6__Impl"
    // InternalSchool.g:987:1: rule__Detalle__Group__6__Impl : ( ( rule__Detalle__EsFuerteAssignment_6 ) ) ;
    public final void rule__Detalle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:991:1: ( ( ( rule__Detalle__EsFuerteAssignment_6 ) ) )
            // InternalSchool.g:992:1: ( ( rule__Detalle__EsFuerteAssignment_6 ) )
            {
            // InternalSchool.g:992:1: ( ( rule__Detalle__EsFuerteAssignment_6 ) )
            // InternalSchool.g:993:2: ( rule__Detalle__EsFuerteAssignment_6 )
            {
             before(grammarAccess.getDetalleAccess().getEsFuerteAssignment_6()); 
            // InternalSchool.g:994:2: ( rule__Detalle__EsFuerteAssignment_6 )
            // InternalSchool.g:994:3: rule__Detalle__EsFuerteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Detalle__EsFuerteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDetalleAccess().getEsFuerteAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__6__Impl"


    // $ANTLR start "rule__Detalle__Group__7"
    // InternalSchool.g:1002:1: rule__Detalle__Group__7 : rule__Detalle__Group__7__Impl rule__Detalle__Group__8 ;
    public final void rule__Detalle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1006:1: ( rule__Detalle__Group__7__Impl rule__Detalle__Group__8 )
            // InternalSchool.g:1007:2: rule__Detalle__Group__7__Impl rule__Detalle__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Detalle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__7"


    // $ANTLR start "rule__Detalle__Group__7__Impl"
    // InternalSchool.g:1014:1: rule__Detalle__Group__7__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Detalle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1018:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1019:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1019:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1020:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getDetalleAccess().getTSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getTSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__7__Impl"


    // $ANTLR start "rule__Detalle__Group__8"
    // InternalSchool.g:1029:1: rule__Detalle__Group__8 : rule__Detalle__Group__8__Impl rule__Detalle__Group__9 ;
    public final void rule__Detalle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1033:1: ( rule__Detalle__Group__8__Impl rule__Detalle__Group__9 )
            // InternalSchool.g:1034:2: rule__Detalle__Group__8__Impl rule__Detalle__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Detalle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Detalle__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__8"


    // $ANTLR start "rule__Detalle__Group__8__Impl"
    // InternalSchool.g:1041:1: rule__Detalle__Group__8__Impl : ( ( rule__Detalle__EntidadAssignment_8 ) ) ;
    public final void rule__Detalle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1045:1: ( ( ( rule__Detalle__EntidadAssignment_8 ) ) )
            // InternalSchool.g:1046:1: ( ( rule__Detalle__EntidadAssignment_8 ) )
            {
            // InternalSchool.g:1046:1: ( ( rule__Detalle__EntidadAssignment_8 ) )
            // InternalSchool.g:1047:2: ( rule__Detalle__EntidadAssignment_8 )
            {
             before(grammarAccess.getDetalleAccess().getEntidadAssignment_8()); 
            // InternalSchool.g:1048:2: ( rule__Detalle__EntidadAssignment_8 )
            // InternalSchool.g:1048:3: rule__Detalle__EntidadAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Detalle__EntidadAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDetalleAccess().getEntidadAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__8__Impl"


    // $ANTLR start "rule__Detalle__Group__9"
    // InternalSchool.g:1056:1: rule__Detalle__Group__9 : rule__Detalle__Group__9__Impl ;
    public final void rule__Detalle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1060:1: ( rule__Detalle__Group__9__Impl )
            // InternalSchool.g:1061:2: rule__Detalle__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Detalle__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__9"


    // $ANTLR start "rule__Detalle__Group__9__Impl"
    // InternalSchool.g:1067:1: rule__Detalle__Group__9__Impl : ( RULE_TCLOSINGBRACE ) ;
    public final void rule__Detalle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1071:1: ( ( RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:1072:1: ( RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:1072:1: ( RULE_TCLOSINGBRACE )
            // InternalSchool.g:1073:2: RULE_TCLOSINGBRACE
            {
             before(grammarAccess.getDetalleAccess().getTCLOSINGBRACETerminalRuleCall_9()); 
            match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getTCLOSINGBRACETerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__Group__9__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalSchool.g:1083:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1087:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalSchool.g:1088:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalSchool.g:1095:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1099:1: ( ( () ) )
            // InternalSchool.g:1100:1: ( () )
            {
            // InternalSchool.g:1100:1: ( () )
            // InternalSchool.g:1101:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalSchool.g:1102:2: ()
            // InternalSchool.g:1102:3: 
            {
            }

             after(grammarAccess.getEntidadAccess().getEntidadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalSchool.g:1110:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1114:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalSchool.g:1115:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalSchool.g:1122:1: rule__Entidad__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1126:1: ( ( 'Entity' ) )
            // InternalSchool.g:1127:1: ( 'Entity' )
            {
            // InternalSchool.g:1127:1: ( 'Entity' )
            // InternalSchool.g:1128:2: 'Entity'
            {
             before(grammarAccess.getEntidadAccess().getEntityKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalSchool.g:1137:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1141:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalSchool.g:1142:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalSchool.g:1149:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1153:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalSchool.g:1154:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalSchool.g:1154:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalSchool.g:1155:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalSchool.g:1156:2: ( rule__Entidad__NameAssignment_2 )
            // InternalSchool.g:1156:3: rule__Entidad__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalSchool.g:1164:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1168:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalSchool.g:1169:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalSchool.g:1176:1: rule__Entidad__Group__3__Impl : ( RULE_TOPENBRACE ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1180:1: ( ( RULE_TOPENBRACE ) )
            // InternalSchool.g:1181:1: ( RULE_TOPENBRACE )
            {
            // InternalSchool.g:1181:1: ( RULE_TOPENBRACE )
            // InternalSchool.g:1182:2: RULE_TOPENBRACE
            {
             before(grammarAccess.getEntidadAccess().getTOPENBRACETerminalRuleCall_3()); 
            match(input,RULE_TOPENBRACE,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getTOPENBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalSchool.g:1191:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1195:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalSchool.g:1196:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalSchool.g:1203:1: rule__Entidad__Group__4__Impl : ( 'description' ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1207:1: ( ( 'description' ) )
            // InternalSchool.g:1208:1: ( 'description' )
            {
            // InternalSchool.g:1208:1: ( 'description' )
            // InternalSchool.g:1209:2: 'description'
            {
             before(grammarAccess.getEntidadAccess().getDescriptionKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getDescriptionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalSchool.g:1218:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl rule__Entidad__Group__6 ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1222:1: ( rule__Entidad__Group__5__Impl rule__Entidad__Group__6 )
            // InternalSchool.g:1223:2: rule__Entidad__Group__5__Impl rule__Entidad__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalSchool.g:1230:1: rule__Entidad__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1234:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1235:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1235:1: ( RULE_EQUALS )
            // InternalSchool.g:1236:2: RULE_EQUALS
            {
             before(grammarAccess.getEntidadAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group__6"
    // InternalSchool.g:1245:1: rule__Entidad__Group__6 : rule__Entidad__Group__6__Impl rule__Entidad__Group__7 ;
    public final void rule__Entidad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1249:1: ( rule__Entidad__Group__6__Impl rule__Entidad__Group__7 )
            // InternalSchool.g:1250:2: rule__Entidad__Group__6__Impl rule__Entidad__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__6"


    // $ANTLR start "rule__Entidad__Group__6__Impl"
    // InternalSchool.g:1257:1: rule__Entidad__Group__6__Impl : ( ( rule__Entidad__DescripcionAssignment_6 ) ) ;
    public final void rule__Entidad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1261:1: ( ( ( rule__Entidad__DescripcionAssignment_6 ) ) )
            // InternalSchool.g:1262:1: ( ( rule__Entidad__DescripcionAssignment_6 ) )
            {
            // InternalSchool.g:1262:1: ( ( rule__Entidad__DescripcionAssignment_6 ) )
            // InternalSchool.g:1263:2: ( rule__Entidad__DescripcionAssignment_6 )
            {
             before(grammarAccess.getEntidadAccess().getDescripcionAssignment_6()); 
            // InternalSchool.g:1264:2: ( rule__Entidad__DescripcionAssignment_6 )
            // InternalSchool.g:1264:3: rule__Entidad__DescripcionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__DescripcionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getDescripcionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__6__Impl"


    // $ANTLR start "rule__Entidad__Group__7"
    // InternalSchool.g:1272:1: rule__Entidad__Group__7 : rule__Entidad__Group__7__Impl rule__Entidad__Group__8 ;
    public final void rule__Entidad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1276:1: ( rule__Entidad__Group__7__Impl rule__Entidad__Group__8 )
            // InternalSchool.g:1277:2: rule__Entidad__Group__7__Impl rule__Entidad__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Entidad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__7"


    // $ANTLR start "rule__Entidad__Group__7__Impl"
    // InternalSchool.g:1284:1: rule__Entidad__Group__7__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Entidad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1288:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1289:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1289:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1290:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getEntidadAccess().getTSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getTSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__7__Impl"


    // $ANTLR start "rule__Entidad__Group__8"
    // InternalSchool.g:1299:1: rule__Entidad__Group__8 : rule__Entidad__Group__8__Impl rule__Entidad__Group__9 ;
    public final void rule__Entidad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1303:1: ( rule__Entidad__Group__8__Impl rule__Entidad__Group__9 )
            // InternalSchool.g:1304:2: rule__Entidad__Group__8__Impl rule__Entidad__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Entidad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__8"


    // $ANTLR start "rule__Entidad__Group__8__Impl"
    // InternalSchool.g:1311:1: rule__Entidad__Group__8__Impl : ( ( ( rule__Entidad__AtributoAssignment_8 ) ) ( ( rule__Entidad__AtributoAssignment_8 )* ) ) ;
    public final void rule__Entidad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1315:1: ( ( ( ( rule__Entidad__AtributoAssignment_8 ) ) ( ( rule__Entidad__AtributoAssignment_8 )* ) ) )
            // InternalSchool.g:1316:1: ( ( ( rule__Entidad__AtributoAssignment_8 ) ) ( ( rule__Entidad__AtributoAssignment_8 )* ) )
            {
            // InternalSchool.g:1316:1: ( ( ( rule__Entidad__AtributoAssignment_8 ) ) ( ( rule__Entidad__AtributoAssignment_8 )* ) )
            // InternalSchool.g:1317:2: ( ( rule__Entidad__AtributoAssignment_8 ) ) ( ( rule__Entidad__AtributoAssignment_8 )* )
            {
            // InternalSchool.g:1317:2: ( ( rule__Entidad__AtributoAssignment_8 ) )
            // InternalSchool.g:1318:3: ( rule__Entidad__AtributoAssignment_8 )
            {
             before(grammarAccess.getEntidadAccess().getAtributoAssignment_8()); 
            // InternalSchool.g:1319:3: ( rule__Entidad__AtributoAssignment_8 )
            // InternalSchool.g:1319:4: rule__Entidad__AtributoAssignment_8
            {
            pushFollow(FOLLOW_23);
            rule__Entidad__AtributoAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAtributoAssignment_8()); 

            }

            // InternalSchool.g:1322:2: ( ( rule__Entidad__AtributoAssignment_8 )* )
            // InternalSchool.g:1323:3: ( rule__Entidad__AtributoAssignment_8 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributoAssignment_8()); 
            // InternalSchool.g:1324:3: ( rule__Entidad__AtributoAssignment_8 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchool.g:1324:4: rule__Entidad__AtributoAssignment_8
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Entidad__AtributoAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getAtributoAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__8__Impl"


    // $ANTLR start "rule__Entidad__Group__9"
    // InternalSchool.g:1333:1: rule__Entidad__Group__9 : rule__Entidad__Group__9__Impl rule__Entidad__Group__10 ;
    public final void rule__Entidad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1337:1: ( rule__Entidad__Group__9__Impl rule__Entidad__Group__10 )
            // InternalSchool.g:1338:2: rule__Entidad__Group__9__Impl rule__Entidad__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Entidad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__9"


    // $ANTLR start "rule__Entidad__Group__9__Impl"
    // InternalSchool.g:1345:1: rule__Entidad__Group__9__Impl : ( ( rule__Entidad__DetallesAssignment_9 )* ) ;
    public final void rule__Entidad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1349:1: ( ( ( rule__Entidad__DetallesAssignment_9 )* ) )
            // InternalSchool.g:1350:1: ( ( rule__Entidad__DetallesAssignment_9 )* )
            {
            // InternalSchool.g:1350:1: ( ( rule__Entidad__DetallesAssignment_9 )* )
            // InternalSchool.g:1351:2: ( rule__Entidad__DetallesAssignment_9 )*
            {
             before(grammarAccess.getEntidadAccess().getDetallesAssignment_9()); 
            // InternalSchool.g:1352:2: ( rule__Entidad__DetallesAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSchool.g:1352:3: rule__Entidad__DetallesAssignment_9
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Entidad__DetallesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getDetallesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__9__Impl"


    // $ANTLR start "rule__Entidad__Group__10"
    // InternalSchool.g:1360:1: rule__Entidad__Group__10 : rule__Entidad__Group__10__Impl ;
    public final void rule__Entidad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1364:1: ( rule__Entidad__Group__10__Impl )
            // InternalSchool.g:1365:2: rule__Entidad__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__10"


    // $ANTLR start "rule__Entidad__Group__10__Impl"
    // InternalSchool.g:1371:1: rule__Entidad__Group__10__Impl : ( RULE_TCLOSINGBRACE ) ;
    public final void rule__Entidad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1375:1: ( ( RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:1376:1: ( RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:1376:1: ( RULE_TCLOSINGBRACE )
            // InternalSchool.g:1377:2: RULE_TCLOSINGBRACE
            {
             before(grammarAccess.getEntidadAccess().getTCLOSINGBRACETerminalRuleCall_10()); 
            match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getTCLOSINGBRACETerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__10__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalSchool.g:1387:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1391:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalSchool.g:1392:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalSchool.g:1399:1: rule__Atributo__Group__0__Impl : ( () ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1403:1: ( ( () ) )
            // InternalSchool.g:1404:1: ( () )
            {
            // InternalSchool.g:1404:1: ( () )
            // InternalSchool.g:1405:2: ()
            {
             before(grammarAccess.getAtributoAccess().getAtributoAction_0()); 
            // InternalSchool.g:1406:2: ()
            // InternalSchool.g:1406:3: 
            {
            }

             after(grammarAccess.getAtributoAccess().getAtributoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalSchool.g:1414:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1418:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalSchool.g:1419:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalSchool.g:1426:1: rule__Atributo__Group__1__Impl : ( 'Attribute' ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1430:1: ( ( 'Attribute' ) )
            // InternalSchool.g:1431:1: ( 'Attribute' )
            {
            // InternalSchool.g:1431:1: ( 'Attribute' )
            // InternalSchool.g:1432:2: 'Attribute'
            {
             before(grammarAccess.getAtributoAccess().getAttributeKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getAttributeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // InternalSchool.g:1441:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1445:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalSchool.g:1446:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Atributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // InternalSchool.g:1453:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NombreAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1457:1: ( ( ( rule__Atributo__NombreAssignment_2 ) ) )
            // InternalSchool.g:1458:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            {
            // InternalSchool.g:1458:1: ( ( rule__Atributo__NombreAssignment_2 ) )
            // InternalSchool.g:1459:2: ( rule__Atributo__NombreAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 
            // InternalSchool.g:1460:2: ( rule__Atributo__NombreAssignment_2 )
            // InternalSchool.g:1460:3: rule__Atributo__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__3"
    // InternalSchool.g:1468:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl rule__Atributo__Group__4 ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1472:1: ( rule__Atributo__Group__3__Impl rule__Atributo__Group__4 )
            // InternalSchool.g:1473:2: rule__Atributo__Group__3__Impl rule__Atributo__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Atributo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3"


    // $ANTLR start "rule__Atributo__Group__3__Impl"
    // InternalSchool.g:1480:1: rule__Atributo__Group__3__Impl : ( RULE_TOPENBRACE ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1484:1: ( ( RULE_TOPENBRACE ) )
            // InternalSchool.g:1485:1: ( RULE_TOPENBRACE )
            {
            // InternalSchool.g:1485:1: ( RULE_TOPENBRACE )
            // InternalSchool.g:1486:2: RULE_TOPENBRACE
            {
             before(grammarAccess.getAtributoAccess().getTOPENBRACETerminalRuleCall_3()); 
            match(input,RULE_TOPENBRACE,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTOPENBRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3__Impl"


    // $ANTLR start "rule__Atributo__Group__4"
    // InternalSchool.g:1495:1: rule__Atributo__Group__4 : rule__Atributo__Group__4__Impl rule__Atributo__Group__5 ;
    public final void rule__Atributo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1499:1: ( rule__Atributo__Group__4__Impl rule__Atributo__Group__5 )
            // InternalSchool.g:1500:2: rule__Atributo__Group__4__Impl rule__Atributo__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Atributo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__4"


    // $ANTLR start "rule__Atributo__Group__4__Impl"
    // InternalSchool.g:1507:1: rule__Atributo__Group__4__Impl : ( 'isEditable' ) ;
    public final void rule__Atributo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1511:1: ( ( 'isEditable' ) )
            // InternalSchool.g:1512:1: ( 'isEditable' )
            {
            // InternalSchool.g:1512:1: ( 'isEditable' )
            // InternalSchool.g:1513:2: 'isEditable'
            {
             before(grammarAccess.getAtributoAccess().getIsEditableKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIsEditableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__4__Impl"


    // $ANTLR start "rule__Atributo__Group__5"
    // InternalSchool.g:1522:1: rule__Atributo__Group__5 : rule__Atributo__Group__5__Impl rule__Atributo__Group__6 ;
    public final void rule__Atributo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1526:1: ( rule__Atributo__Group__5__Impl rule__Atributo__Group__6 )
            // InternalSchool.g:1527:2: rule__Atributo__Group__5__Impl rule__Atributo__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Atributo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__5"


    // $ANTLR start "rule__Atributo__Group__5__Impl"
    // InternalSchool.g:1534:1: rule__Atributo__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Atributo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1538:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1539:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1539:1: ( RULE_EQUALS )
            // InternalSchool.g:1540:2: RULE_EQUALS
            {
             before(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__5__Impl"


    // $ANTLR start "rule__Atributo__Group__6"
    // InternalSchool.g:1549:1: rule__Atributo__Group__6 : rule__Atributo__Group__6__Impl rule__Atributo__Group__7 ;
    public final void rule__Atributo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1553:1: ( rule__Atributo__Group__6__Impl rule__Atributo__Group__7 )
            // InternalSchool.g:1554:2: rule__Atributo__Group__6__Impl rule__Atributo__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__6"


    // $ANTLR start "rule__Atributo__Group__6__Impl"
    // InternalSchool.g:1561:1: rule__Atributo__Group__6__Impl : ( ( rule__Atributo__EsEditableAssignment_6 ) ) ;
    public final void rule__Atributo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1565:1: ( ( ( rule__Atributo__EsEditableAssignment_6 ) ) )
            // InternalSchool.g:1566:1: ( ( rule__Atributo__EsEditableAssignment_6 ) )
            {
            // InternalSchool.g:1566:1: ( ( rule__Atributo__EsEditableAssignment_6 ) )
            // InternalSchool.g:1567:2: ( rule__Atributo__EsEditableAssignment_6 )
            {
             before(grammarAccess.getAtributoAccess().getEsEditableAssignment_6()); 
            // InternalSchool.g:1568:2: ( rule__Atributo__EsEditableAssignment_6 )
            // InternalSchool.g:1568:3: rule__Atributo__EsEditableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__EsEditableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getEsEditableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__6__Impl"


    // $ANTLR start "rule__Atributo__Group__7"
    // InternalSchool.g:1576:1: rule__Atributo__Group__7 : rule__Atributo__Group__7__Impl rule__Atributo__Group__8 ;
    public final void rule__Atributo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1580:1: ( rule__Atributo__Group__7__Impl rule__Atributo__Group__8 )
            // InternalSchool.g:1581:2: rule__Atributo__Group__7__Impl rule__Atributo__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Atributo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__7"


    // $ANTLR start "rule__Atributo__Group__7__Impl"
    // InternalSchool.g:1588:1: rule__Atributo__Group__7__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Atributo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1592:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1593:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1593:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1594:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__7__Impl"


    // $ANTLR start "rule__Atributo__Group__8"
    // InternalSchool.g:1603:1: rule__Atributo__Group__8 : rule__Atributo__Group__8__Impl rule__Atributo__Group__9 ;
    public final void rule__Atributo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1607:1: ( rule__Atributo__Group__8__Impl rule__Atributo__Group__9 )
            // InternalSchool.g:1608:2: rule__Atributo__Group__8__Impl rule__Atributo__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Atributo__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__8"


    // $ANTLR start "rule__Atributo__Group__8__Impl"
    // InternalSchool.g:1615:1: rule__Atributo__Group__8__Impl : ( 'isMandatory' ) ;
    public final void rule__Atributo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1619:1: ( ( 'isMandatory' ) )
            // InternalSchool.g:1620:1: ( 'isMandatory' )
            {
            // InternalSchool.g:1620:1: ( 'isMandatory' )
            // InternalSchool.g:1621:2: 'isMandatory'
            {
             before(grammarAccess.getAtributoAccess().getIsMandatoryKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIsMandatoryKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__8__Impl"


    // $ANTLR start "rule__Atributo__Group__9"
    // InternalSchool.g:1630:1: rule__Atributo__Group__9 : rule__Atributo__Group__9__Impl rule__Atributo__Group__10 ;
    public final void rule__Atributo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1634:1: ( rule__Atributo__Group__9__Impl rule__Atributo__Group__10 )
            // InternalSchool.g:1635:2: rule__Atributo__Group__9__Impl rule__Atributo__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Atributo__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__9"


    // $ANTLR start "rule__Atributo__Group__9__Impl"
    // InternalSchool.g:1642:1: rule__Atributo__Group__9__Impl : ( RULE_EQUALS ) ;
    public final void rule__Atributo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1646:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1647:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1647:1: ( RULE_EQUALS )
            // InternalSchool.g:1648:2: RULE_EQUALS
            {
             before(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_9()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__9__Impl"


    // $ANTLR start "rule__Atributo__Group__10"
    // InternalSchool.g:1657:1: rule__Atributo__Group__10 : rule__Atributo__Group__10__Impl rule__Atributo__Group__11 ;
    public final void rule__Atributo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1661:1: ( rule__Atributo__Group__10__Impl rule__Atributo__Group__11 )
            // InternalSchool.g:1662:2: rule__Atributo__Group__10__Impl rule__Atributo__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__10"


    // $ANTLR start "rule__Atributo__Group__10__Impl"
    // InternalSchool.g:1669:1: rule__Atributo__Group__10__Impl : ( ( rule__Atributo__EsRequeridoAssignment_10 ) ) ;
    public final void rule__Atributo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1673:1: ( ( ( rule__Atributo__EsRequeridoAssignment_10 ) ) )
            // InternalSchool.g:1674:1: ( ( rule__Atributo__EsRequeridoAssignment_10 ) )
            {
            // InternalSchool.g:1674:1: ( ( rule__Atributo__EsRequeridoAssignment_10 ) )
            // InternalSchool.g:1675:2: ( rule__Atributo__EsRequeridoAssignment_10 )
            {
             before(grammarAccess.getAtributoAccess().getEsRequeridoAssignment_10()); 
            // InternalSchool.g:1676:2: ( rule__Atributo__EsRequeridoAssignment_10 )
            // InternalSchool.g:1676:3: rule__Atributo__EsRequeridoAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__EsRequeridoAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getEsRequeridoAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__10__Impl"


    // $ANTLR start "rule__Atributo__Group__11"
    // InternalSchool.g:1684:1: rule__Atributo__Group__11 : rule__Atributo__Group__11__Impl rule__Atributo__Group__12 ;
    public final void rule__Atributo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1688:1: ( rule__Atributo__Group__11__Impl rule__Atributo__Group__12 )
            // InternalSchool.g:1689:2: rule__Atributo__Group__11__Impl rule__Atributo__Group__12
            {
            pushFollow(FOLLOW_27);
            rule__Atributo__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__11"


    // $ANTLR start "rule__Atributo__Group__11__Impl"
    // InternalSchool.g:1696:1: rule__Atributo__Group__11__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Atributo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1700:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1701:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1701:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1702:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_11()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__11__Impl"


    // $ANTLR start "rule__Atributo__Group__12"
    // InternalSchool.g:1711:1: rule__Atributo__Group__12 : rule__Atributo__Group__12__Impl rule__Atributo__Group__13 ;
    public final void rule__Atributo__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1715:1: ( rule__Atributo__Group__12__Impl rule__Atributo__Group__13 )
            // InternalSchool.g:1716:2: rule__Atributo__Group__12__Impl rule__Atributo__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Atributo__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__12"


    // $ANTLR start "rule__Atributo__Group__12__Impl"
    // InternalSchool.g:1723:1: rule__Atributo__Group__12__Impl : ( 'isVisibleInList' ) ;
    public final void rule__Atributo__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1727:1: ( ( 'isVisibleInList' ) )
            // InternalSchool.g:1728:1: ( 'isVisibleInList' )
            {
            // InternalSchool.g:1728:1: ( 'isVisibleInList' )
            // InternalSchool.g:1729:2: 'isVisibleInList'
            {
             before(grammarAccess.getAtributoAccess().getIsVisibleInListKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIsVisibleInListKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__12__Impl"


    // $ANTLR start "rule__Atributo__Group__13"
    // InternalSchool.g:1738:1: rule__Atributo__Group__13 : rule__Atributo__Group__13__Impl rule__Atributo__Group__14 ;
    public final void rule__Atributo__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1742:1: ( rule__Atributo__Group__13__Impl rule__Atributo__Group__14 )
            // InternalSchool.g:1743:2: rule__Atributo__Group__13__Impl rule__Atributo__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Atributo__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__13"


    // $ANTLR start "rule__Atributo__Group__13__Impl"
    // InternalSchool.g:1750:1: rule__Atributo__Group__13__Impl : ( RULE_EQUALS ) ;
    public final void rule__Atributo__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1754:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1755:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1755:1: ( RULE_EQUALS )
            // InternalSchool.g:1756:2: RULE_EQUALS
            {
             before(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_13()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__13__Impl"


    // $ANTLR start "rule__Atributo__Group__14"
    // InternalSchool.g:1765:1: rule__Atributo__Group__14 : rule__Atributo__Group__14__Impl rule__Atributo__Group__15 ;
    public final void rule__Atributo__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1769:1: ( rule__Atributo__Group__14__Impl rule__Atributo__Group__15 )
            // InternalSchool.g:1770:2: rule__Atributo__Group__14__Impl rule__Atributo__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__14"


    // $ANTLR start "rule__Atributo__Group__14__Impl"
    // InternalSchool.g:1777:1: rule__Atributo__Group__14__Impl : ( ( rule__Atributo__EsVisibleAssignment_14 ) ) ;
    public final void rule__Atributo__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1781:1: ( ( ( rule__Atributo__EsVisibleAssignment_14 ) ) )
            // InternalSchool.g:1782:1: ( ( rule__Atributo__EsVisibleAssignment_14 ) )
            {
            // InternalSchool.g:1782:1: ( ( rule__Atributo__EsVisibleAssignment_14 ) )
            // InternalSchool.g:1783:2: ( rule__Atributo__EsVisibleAssignment_14 )
            {
             before(grammarAccess.getAtributoAccess().getEsVisibleAssignment_14()); 
            // InternalSchool.g:1784:2: ( rule__Atributo__EsVisibleAssignment_14 )
            // InternalSchool.g:1784:3: rule__Atributo__EsVisibleAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__EsVisibleAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getEsVisibleAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__14__Impl"


    // $ANTLR start "rule__Atributo__Group__15"
    // InternalSchool.g:1792:1: rule__Atributo__Group__15 : rule__Atributo__Group__15__Impl rule__Atributo__Group__16 ;
    public final void rule__Atributo__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1796:1: ( rule__Atributo__Group__15__Impl rule__Atributo__Group__16 )
            // InternalSchool.g:1797:2: rule__Atributo__Group__15__Impl rule__Atributo__Group__16
            {
            pushFollow(FOLLOW_28);
            rule__Atributo__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__15"


    // $ANTLR start "rule__Atributo__Group__15__Impl"
    // InternalSchool.g:1804:1: rule__Atributo__Group__15__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Atributo__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1808:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1809:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1809:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1810:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_15()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__15__Impl"


    // $ANTLR start "rule__Atributo__Group__16"
    // InternalSchool.g:1819:1: rule__Atributo__Group__16 : rule__Atributo__Group__16__Impl rule__Atributo__Group__17 ;
    public final void rule__Atributo__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1823:1: ( rule__Atributo__Group__16__Impl rule__Atributo__Group__17 )
            // InternalSchool.g:1824:2: rule__Atributo__Group__16__Impl rule__Atributo__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__Atributo__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__16"


    // $ANTLR start "rule__Atributo__Group__16__Impl"
    // InternalSchool.g:1831:1: rule__Atributo__Group__16__Impl : ( 'isTitle' ) ;
    public final void rule__Atributo__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1835:1: ( ( 'isTitle' ) )
            // InternalSchool.g:1836:1: ( 'isTitle' )
            {
            // InternalSchool.g:1836:1: ( 'isTitle' )
            // InternalSchool.g:1837:2: 'isTitle'
            {
             before(grammarAccess.getAtributoAccess().getIsTitleKeyword_16()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIsTitleKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__16__Impl"


    // $ANTLR start "rule__Atributo__Group__17"
    // InternalSchool.g:1846:1: rule__Atributo__Group__17 : rule__Atributo__Group__17__Impl rule__Atributo__Group__18 ;
    public final void rule__Atributo__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1850:1: ( rule__Atributo__Group__17__Impl rule__Atributo__Group__18 )
            // InternalSchool.g:1851:2: rule__Atributo__Group__17__Impl rule__Atributo__Group__18
            {
            pushFollow(FOLLOW_18);
            rule__Atributo__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__17"


    // $ANTLR start "rule__Atributo__Group__17__Impl"
    // InternalSchool.g:1858:1: rule__Atributo__Group__17__Impl : ( RULE_EQUALS ) ;
    public final void rule__Atributo__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1862:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1863:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1863:1: ( RULE_EQUALS )
            // InternalSchool.g:1864:2: RULE_EQUALS
            {
             before(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_17()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__17__Impl"


    // $ANTLR start "rule__Atributo__Group__18"
    // InternalSchool.g:1873:1: rule__Atributo__Group__18 : rule__Atributo__Group__18__Impl rule__Atributo__Group__19 ;
    public final void rule__Atributo__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1877:1: ( rule__Atributo__Group__18__Impl rule__Atributo__Group__19 )
            // InternalSchool.g:1878:2: rule__Atributo__Group__18__Impl rule__Atributo__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__18"


    // $ANTLR start "rule__Atributo__Group__18__Impl"
    // InternalSchool.g:1885:1: rule__Atributo__Group__18__Impl : ( ( rule__Atributo__EsTituloAssignment_18 ) ) ;
    public final void rule__Atributo__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1889:1: ( ( ( rule__Atributo__EsTituloAssignment_18 ) ) )
            // InternalSchool.g:1890:1: ( ( rule__Atributo__EsTituloAssignment_18 ) )
            {
            // InternalSchool.g:1890:1: ( ( rule__Atributo__EsTituloAssignment_18 ) )
            // InternalSchool.g:1891:2: ( rule__Atributo__EsTituloAssignment_18 )
            {
             before(grammarAccess.getAtributoAccess().getEsTituloAssignment_18()); 
            // InternalSchool.g:1892:2: ( rule__Atributo__EsTituloAssignment_18 )
            // InternalSchool.g:1892:3: rule__Atributo__EsTituloAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__EsTituloAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getEsTituloAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__18__Impl"


    // $ANTLR start "rule__Atributo__Group__19"
    // InternalSchool.g:1900:1: rule__Atributo__Group__19 : rule__Atributo__Group__19__Impl rule__Atributo__Group__20 ;
    public final void rule__Atributo__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1904:1: ( rule__Atributo__Group__19__Impl rule__Atributo__Group__20 )
            // InternalSchool.g:1905:2: rule__Atributo__Group__19__Impl rule__Atributo__Group__20
            {
            pushFollow(FOLLOW_29);
            rule__Atributo__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__19"


    // $ANTLR start "rule__Atributo__Group__19__Impl"
    // InternalSchool.g:1912:1: rule__Atributo__Group__19__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Atributo__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1916:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:1917:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:1917:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:1918:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_19()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__19__Impl"


    // $ANTLR start "rule__Atributo__Group__20"
    // InternalSchool.g:1927:1: rule__Atributo__Group__20 : rule__Atributo__Group__20__Impl rule__Atributo__Group__21 ;
    public final void rule__Atributo__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1931:1: ( rule__Atributo__Group__20__Impl rule__Atributo__Group__21 )
            // InternalSchool.g:1932:2: rule__Atributo__Group__20__Impl rule__Atributo__Group__21
            {
            pushFollow(FOLLOW_7);
            rule__Atributo__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__20"


    // $ANTLR start "rule__Atributo__Group__20__Impl"
    // InternalSchool.g:1939:1: rule__Atributo__Group__20__Impl : ( 'dataType' ) ;
    public final void rule__Atributo__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1943:1: ( ( 'dataType' ) )
            // InternalSchool.g:1944:1: ( 'dataType' )
            {
            // InternalSchool.g:1944:1: ( 'dataType' )
            // InternalSchool.g:1945:2: 'dataType'
            {
             before(grammarAccess.getAtributoAccess().getDataTypeKeyword_20()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getDataTypeKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__20__Impl"


    // $ANTLR start "rule__Atributo__Group__21"
    // InternalSchool.g:1954:1: rule__Atributo__Group__21 : rule__Atributo__Group__21__Impl rule__Atributo__Group__22 ;
    public final void rule__Atributo__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1958:1: ( rule__Atributo__Group__21__Impl rule__Atributo__Group__22 )
            // InternalSchool.g:1959:2: rule__Atributo__Group__21__Impl rule__Atributo__Group__22
            {
            pushFollow(FOLLOW_30);
            rule__Atributo__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__21"


    // $ANTLR start "rule__Atributo__Group__21__Impl"
    // InternalSchool.g:1966:1: rule__Atributo__Group__21__Impl : ( RULE_EQUALS ) ;
    public final void rule__Atributo__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1970:1: ( ( RULE_EQUALS ) )
            // InternalSchool.g:1971:1: ( RULE_EQUALS )
            {
            // InternalSchool.g:1971:1: ( RULE_EQUALS )
            // InternalSchool.g:1972:2: RULE_EQUALS
            {
             before(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_21()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__21__Impl"


    // $ANTLR start "rule__Atributo__Group__22"
    // InternalSchool.g:1981:1: rule__Atributo__Group__22 : rule__Atributo__Group__22__Impl rule__Atributo__Group__23 ;
    public final void rule__Atributo__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1985:1: ( rule__Atributo__Group__22__Impl rule__Atributo__Group__23 )
            // InternalSchool.g:1986:2: rule__Atributo__Group__22__Impl rule__Atributo__Group__23
            {
            pushFollow(FOLLOW_8);
            rule__Atributo__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__22"


    // $ANTLR start "rule__Atributo__Group__22__Impl"
    // InternalSchool.g:1993:1: rule__Atributo__Group__22__Impl : ( ( rule__Atributo__TipoAssignment_22 ) ) ;
    public final void rule__Atributo__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:1997:1: ( ( ( rule__Atributo__TipoAssignment_22 ) ) )
            // InternalSchool.g:1998:1: ( ( rule__Atributo__TipoAssignment_22 ) )
            {
            // InternalSchool.g:1998:1: ( ( rule__Atributo__TipoAssignment_22 ) )
            // InternalSchool.g:1999:2: ( rule__Atributo__TipoAssignment_22 )
            {
             before(grammarAccess.getAtributoAccess().getTipoAssignment_22()); 
            // InternalSchool.g:2000:2: ( rule__Atributo__TipoAssignment_22 )
            // InternalSchool.g:2000:3: rule__Atributo__TipoAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipoAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipoAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__22__Impl"


    // $ANTLR start "rule__Atributo__Group__23"
    // InternalSchool.g:2008:1: rule__Atributo__Group__23 : rule__Atributo__Group__23__Impl rule__Atributo__Group__24 ;
    public final void rule__Atributo__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2012:1: ( rule__Atributo__Group__23__Impl rule__Atributo__Group__24 )
            // InternalSchool.g:2013:2: rule__Atributo__Group__23__Impl rule__Atributo__Group__24
            {
            pushFollow(FOLLOW_19);
            rule__Atributo__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__23"


    // $ANTLR start "rule__Atributo__Group__23__Impl"
    // InternalSchool.g:2020:1: rule__Atributo__Group__23__Impl : ( RULE_TSEMICOLON ) ;
    public final void rule__Atributo__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2024:1: ( ( RULE_TSEMICOLON ) )
            // InternalSchool.g:2025:1: ( RULE_TSEMICOLON )
            {
            // InternalSchool.g:2025:1: ( RULE_TSEMICOLON )
            // InternalSchool.g:2026:2: RULE_TSEMICOLON
            {
             before(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_23()); 
            match(input,RULE_TSEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__23__Impl"


    // $ANTLR start "rule__Atributo__Group__24"
    // InternalSchool.g:2035:1: rule__Atributo__Group__24 : rule__Atributo__Group__24__Impl ;
    public final void rule__Atributo__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2039:1: ( rule__Atributo__Group__24__Impl )
            // InternalSchool.g:2040:2: rule__Atributo__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__24"


    // $ANTLR start "rule__Atributo__Group__24__Impl"
    // InternalSchool.g:2046:1: rule__Atributo__Group__24__Impl : ( RULE_TCLOSINGBRACE ) ;
    public final void rule__Atributo__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2050:1: ( ( RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:2051:1: ( RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:2051:1: ( RULE_TCLOSINGBRACE )
            // InternalSchool.g:2052:2: RULE_TCLOSINGBRACE
            {
             before(grammarAccess.getAtributoAccess().getTCLOSINGBRACETerminalRuleCall_24()); 
            match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getTCLOSINGBRACETerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__24__Impl"


    // $ANTLR start "rule__Root__NombreAssignment_2"
    // InternalSchool.g:2062:1: rule__Root__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Root__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2066:1: ( ( ruleEString ) )
            // InternalSchool.g:2067:2: ( ruleEString )
            {
            // InternalSchool.g:2067:2: ( ruleEString )
            // InternalSchool.g:2068:3: ruleEString
            {
             before(grammarAccess.getRootAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getNombreEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NombreAssignment_2"


    // $ANTLR start "rule__Root__NavBarColorHexAssignment_6"
    // InternalSchool.g:2077:1: rule__Root__NavBarColorHexAssignment_6 : ( ruleEString ) ;
    public final void rule__Root__NavBarColorHexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2081:1: ( ( ruleEString ) )
            // InternalSchool.g:2082:2: ( ruleEString )
            {
            // InternalSchool.g:2082:2: ( ruleEString )
            // InternalSchool.g:2083:3: ruleEString
            {
             before(grammarAccess.getRootAccess().getNavBarColorHexEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getNavBarColorHexEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__NavBarColorHexAssignment_6"


    // $ANTLR start "rule__Root__TextColorAssignment_10"
    // InternalSchool.g:2092:1: rule__Root__TextColorAssignment_10 : ( ruleEString ) ;
    public final void rule__Root__TextColorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2096:1: ( ( ruleEString ) )
            // InternalSchool.g:2097:2: ( ruleEString )
            {
            // InternalSchool.g:2097:2: ( ruleEString )
            // InternalSchool.g:2098:3: ruleEString
            {
             before(grammarAccess.getRootAccess().getTextColorEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTextColorEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__TextColorAssignment_10"


    // $ANTLR start "rule__Root__FloatingButtonColorAssignment_14"
    // InternalSchool.g:2107:1: rule__Root__FloatingButtonColorAssignment_14 : ( ruleEString ) ;
    public final void rule__Root__FloatingButtonColorAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2111:1: ( ( ruleEString ) )
            // InternalSchool.g:2112:2: ( ruleEString )
            {
            // InternalSchool.g:2112:2: ( ruleEString )
            // InternalSchool.g:2113:3: ruleEString
            {
             before(grammarAccess.getRootAccess().getFloatingButtonColorEStringParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getFloatingButtonColorEStringParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__FloatingButtonColorAssignment_14"


    // $ANTLR start "rule__Root__EntidadAssignment_16"
    // InternalSchool.g:2122:1: rule__Root__EntidadAssignment_16 : ( ruleEntidad ) ;
    public final void rule__Root__EntidadAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2126:1: ( ( ruleEntidad ) )
            // InternalSchool.g:2127:2: ( ruleEntidad )
            {
            // InternalSchool.g:2127:2: ( ruleEntidad )
            // InternalSchool.g:2128:3: ruleEntidad
            {
             before(grammarAccess.getRootAccess().getEntidadEntidadParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getRootAccess().getEntidadEntidadParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__EntidadAssignment_16"


    // $ANTLR start "rule__Root__DetallesAssignment_17"
    // InternalSchool.g:2137:1: rule__Root__DetallesAssignment_17 : ( ruleDetalle ) ;
    public final void rule__Root__DetallesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2141:1: ( ( ruleDetalle ) )
            // InternalSchool.g:2142:2: ( ruleDetalle )
            {
            // InternalSchool.g:2142:2: ( ruleDetalle )
            // InternalSchool.g:2143:3: ruleDetalle
            {
             before(grammarAccess.getRootAccess().getDetallesDetalleParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleDetalle();

            state._fsp--;

             after(grammarAccess.getRootAccess().getDetallesDetalleParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__DetallesAssignment_17"


    // $ANTLR start "rule__Detalle__NameAssignment_2"
    // InternalSchool.g:2152:1: rule__Detalle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Detalle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2156:1: ( ( RULE_ID ) )
            // InternalSchool.g:2157:2: ( RULE_ID )
            {
            // InternalSchool.g:2157:2: ( RULE_ID )
            // InternalSchool.g:2158:3: RULE_ID
            {
             before(grammarAccess.getDetalleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__NameAssignment_2"


    // $ANTLR start "rule__Detalle__EsFuerteAssignment_6"
    // InternalSchool.g:2167:1: rule__Detalle__EsFuerteAssignment_6 : ( ruleEBoolean ) ;
    public final void rule__Detalle__EsFuerteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2171:1: ( ( ruleEBoolean ) )
            // InternalSchool.g:2172:2: ( ruleEBoolean )
            {
            // InternalSchool.g:2172:2: ( ruleEBoolean )
            // InternalSchool.g:2173:3: ruleEBoolean
            {
             before(grammarAccess.getDetalleAccess().getEsFuerteEBooleanParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getDetalleAccess().getEsFuerteEBooleanParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__EsFuerteAssignment_6"


    // $ANTLR start "rule__Detalle__EntidadAssignment_8"
    // InternalSchool.g:2182:1: rule__Detalle__EntidadAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Detalle__EntidadAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2186:1: ( ( ( RULE_ID ) ) )
            // InternalSchool.g:2187:2: ( ( RULE_ID ) )
            {
            // InternalSchool.g:2187:2: ( ( RULE_ID ) )
            // InternalSchool.g:2188:3: ( RULE_ID )
            {
             before(grammarAccess.getDetalleAccess().getEntidadEntidadCrossReference_8_0()); 
            // InternalSchool.g:2189:3: ( RULE_ID )
            // InternalSchool.g:2190:4: RULE_ID
            {
             before(grammarAccess.getDetalleAccess().getEntidadEntidadIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDetalleAccess().getEntidadEntidadIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getDetalleAccess().getEntidadEntidadCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Detalle__EntidadAssignment_8"


    // $ANTLR start "rule__Entidad__NameAssignment_2"
    // InternalSchool.g:2201:1: rule__Entidad__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2205:1: ( ( RULE_ID ) )
            // InternalSchool.g:2206:2: ( RULE_ID )
            {
            // InternalSchool.g:2206:2: ( RULE_ID )
            // InternalSchool.g:2207:3: RULE_ID
            {
             before(grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_2"


    // $ANTLR start "rule__Entidad__DescripcionAssignment_6"
    // InternalSchool.g:2216:1: rule__Entidad__DescripcionAssignment_6 : ( ruleEString ) ;
    public final void rule__Entidad__DescripcionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2220:1: ( ( ruleEString ) )
            // InternalSchool.g:2221:2: ( ruleEString )
            {
            // InternalSchool.g:2221:2: ( ruleEString )
            // InternalSchool.g:2222:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getDescripcionEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getDescripcionEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__DescripcionAssignment_6"


    // $ANTLR start "rule__Entidad__AtributoAssignment_8"
    // InternalSchool.g:2231:1: rule__Entidad__AtributoAssignment_8 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributoAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2235:1: ( ( ruleAtributo ) )
            // InternalSchool.g:2236:2: ( ruleAtributo )
            {
            // InternalSchool.g:2236:2: ( ruleAtributo )
            // InternalSchool.g:2237:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributoAtributoParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributoAtributoParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributoAssignment_8"


    // $ANTLR start "rule__Entidad__DetallesAssignment_9"
    // InternalSchool.g:2246:1: rule__Entidad__DetallesAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Entidad__DetallesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2250:1: ( ( ( RULE_ID ) ) )
            // InternalSchool.g:2251:2: ( ( RULE_ID ) )
            {
            // InternalSchool.g:2251:2: ( ( RULE_ID ) )
            // InternalSchool.g:2252:3: ( RULE_ID )
            {
             before(grammarAccess.getEntidadAccess().getDetallesDetalleCrossReference_9_0()); 
            // InternalSchool.g:2253:3: ( RULE_ID )
            // InternalSchool.g:2254:4: RULE_ID
            {
             before(grammarAccess.getEntidadAccess().getDetallesDetalleIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getDetallesDetalleIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getEntidadAccess().getDetallesDetalleCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__DetallesAssignment_9"


    // $ANTLR start "rule__Atributo__NombreAssignment_2"
    // InternalSchool.g:2265:1: rule__Atributo__NombreAssignment_2 : ( ruleEString ) ;
    public final void rule__Atributo__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2269:1: ( ( ruleEString ) )
            // InternalSchool.g:2270:2: ( ruleEString )
            {
            // InternalSchool.g:2270:2: ( ruleEString )
            // InternalSchool.g:2271:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNombreEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNombreEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NombreAssignment_2"


    // $ANTLR start "rule__Atributo__EsEditableAssignment_6"
    // InternalSchool.g:2280:1: rule__Atributo__EsEditableAssignment_6 : ( ruleEBoolean ) ;
    public final void rule__Atributo__EsEditableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2284:1: ( ( ruleEBoolean ) )
            // InternalSchool.g:2285:2: ( ruleEBoolean )
            {
            // InternalSchool.g:2285:2: ( ruleEBoolean )
            // InternalSchool.g:2286:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getEsEditableEBooleanParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getEsEditableEBooleanParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__EsEditableAssignment_6"


    // $ANTLR start "rule__Atributo__EsRequeridoAssignment_10"
    // InternalSchool.g:2295:1: rule__Atributo__EsRequeridoAssignment_10 : ( ruleEBoolean ) ;
    public final void rule__Atributo__EsRequeridoAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2299:1: ( ( ruleEBoolean ) )
            // InternalSchool.g:2300:2: ( ruleEBoolean )
            {
            // InternalSchool.g:2300:2: ( ruleEBoolean )
            // InternalSchool.g:2301:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getEsRequeridoEBooleanParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getEsRequeridoEBooleanParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__EsRequeridoAssignment_10"


    // $ANTLR start "rule__Atributo__EsVisibleAssignment_14"
    // InternalSchool.g:2310:1: rule__Atributo__EsVisibleAssignment_14 : ( ruleEBoolean ) ;
    public final void rule__Atributo__EsVisibleAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2314:1: ( ( ruleEBoolean ) )
            // InternalSchool.g:2315:2: ( ruleEBoolean )
            {
            // InternalSchool.g:2315:2: ( ruleEBoolean )
            // InternalSchool.g:2316:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getEsVisibleEBooleanParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getEsVisibleEBooleanParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__EsVisibleAssignment_14"


    // $ANTLR start "rule__Atributo__EsTituloAssignment_18"
    // InternalSchool.g:2325:1: rule__Atributo__EsTituloAssignment_18 : ( ruleEBoolean ) ;
    public final void rule__Atributo__EsTituloAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2329:1: ( ( ruleEBoolean ) )
            // InternalSchool.g:2330:2: ( ruleEBoolean )
            {
            // InternalSchool.g:2330:2: ( ruleEBoolean )
            // InternalSchool.g:2331:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getEsTituloEBooleanParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getEsTituloEBooleanParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__EsTituloAssignment_18"


    // $ANTLR start "rule__Atributo__TipoAssignment_22"
    // InternalSchool.g:2340:1: rule__Atributo__TipoAssignment_22 : ( ruleTipoDato ) ;
    public final void rule__Atributo__TipoAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchool.g:2344:1: ( ( ruleTipoDato ) )
            // InternalSchool.g:2345:2: ( ruleTipoDato )
            {
            // InternalSchool.g:2345:2: ( ruleTipoDato )
            // InternalSchool.g:2346:3: ruleTipoDato
            {
             before(grammarAccess.getAtributoAccess().getTipoTipoDatoEnumRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipoTipoDatoEnumRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipoAssignment_22"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000001E0000L});

}