package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SchoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TOPENBRACE", "RULE_EQUALS", "RULE_TSEMICOLON", "RULE_TCLOSINGBRACE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'navBarColorHex'", "'textColor'", "'floatingButtonColor'", "'Detail'", "'isStrong'", "'Entity'", "'description'", "'Attribute'", "'isEditable'", "'isMandatory'", "'isVisibleInList'", "'isTitle'", "'dataType'", "'true'", "'false'", "'STRING'", "'BOOLEAN'", "'NUMBER'", "'DATE'"
    };
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


        public InternalSchoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSchool.g"; }



     	private SchoolGrammarAccess grammarAccess;

        public InternalSchoolParser(TokenStream input, SchoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected SchoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalSchool.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalSchool.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalSchool.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalSchool.g:72:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Application' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'navBarColorHex' this_EQUALS_5= RULE_EQUALS ( (lv_navBarColorHex_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'textColor' this_EQUALS_9= RULE_EQUALS ( (lv_textColor_10_0= ruleEString ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'floatingButtonColor' this_EQUALS_13= RULE_EQUALS ( (lv_floatingButtonColor_14_0= ruleEString ) ) this_TSEMICOLON_15= RULE_TSEMICOLON ( (lv_entidad_16_0= ruleEntidad ) )+ ( (lv_detalles_17_0= ruleDetalle ) )* this_TCLOSINGBRACE_18= RULE_TCLOSINGBRACE ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TOPENBRACE_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token this_TSEMICOLON_7=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token this_TSEMICOLON_11=null;
        Token otherlv_12=null;
        Token this_EQUALS_13=null;
        Token this_TSEMICOLON_15=null;
        Token this_TCLOSINGBRACE_18=null;
        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        AntlrDatatypeRuleToken lv_navBarColorHex_6_0 = null;

        AntlrDatatypeRuleToken lv_textColor_10_0 = null;

        AntlrDatatypeRuleToken lv_floatingButtonColor_14_0 = null;

        EObject lv_entidad_16_0 = null;

        EObject lv_detalles_17_0 = null;



        	enterRule();

        try {
            // InternalSchool.g:78:2: ( ( () otherlv_1= 'Application' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'navBarColorHex' this_EQUALS_5= RULE_EQUALS ( (lv_navBarColorHex_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'textColor' this_EQUALS_9= RULE_EQUALS ( (lv_textColor_10_0= ruleEString ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'floatingButtonColor' this_EQUALS_13= RULE_EQUALS ( (lv_floatingButtonColor_14_0= ruleEString ) ) this_TSEMICOLON_15= RULE_TSEMICOLON ( (lv_entidad_16_0= ruleEntidad ) )+ ( (lv_detalles_17_0= ruleDetalle ) )* this_TCLOSINGBRACE_18= RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:79:2: ( () otherlv_1= 'Application' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'navBarColorHex' this_EQUALS_5= RULE_EQUALS ( (lv_navBarColorHex_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'textColor' this_EQUALS_9= RULE_EQUALS ( (lv_textColor_10_0= ruleEString ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'floatingButtonColor' this_EQUALS_13= RULE_EQUALS ( (lv_floatingButtonColor_14_0= ruleEString ) ) this_TSEMICOLON_15= RULE_TSEMICOLON ( (lv_entidad_16_0= ruleEntidad ) )+ ( (lv_detalles_17_0= ruleDetalle ) )* this_TCLOSINGBRACE_18= RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:79:2: ( () otherlv_1= 'Application' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'navBarColorHex' this_EQUALS_5= RULE_EQUALS ( (lv_navBarColorHex_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'textColor' this_EQUALS_9= RULE_EQUALS ( (lv_textColor_10_0= ruleEString ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'floatingButtonColor' this_EQUALS_13= RULE_EQUALS ( (lv_floatingButtonColor_14_0= ruleEString ) ) this_TSEMICOLON_15= RULE_TSEMICOLON ( (lv_entidad_16_0= ruleEntidad ) )+ ( (lv_detalles_17_0= ruleDetalle ) )* this_TCLOSINGBRACE_18= RULE_TCLOSINGBRACE )
            // InternalSchool.g:80:3: () otherlv_1= 'Application' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'navBarColorHex' this_EQUALS_5= RULE_EQUALS ( (lv_navBarColorHex_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'textColor' this_EQUALS_9= RULE_EQUALS ( (lv_textColor_10_0= ruleEString ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'floatingButtonColor' this_EQUALS_13= RULE_EQUALS ( (lv_floatingButtonColor_14_0= ruleEString ) ) this_TSEMICOLON_15= RULE_TSEMICOLON ( (lv_entidad_16_0= ruleEntidad ) )+ ( (lv_detalles_17_0= ruleDetalle ) )* this_TCLOSINGBRACE_18= RULE_TCLOSINGBRACE
            {
            // InternalSchool.g:80:3: ()
            // InternalSchool.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getApplicationKeyword_1());
            		
            // InternalSchool.g:91:3: ( (lv_nombre_2_0= ruleEString ) )
            // InternalSchool.g:92:4: (lv_nombre_2_0= ruleEString )
            {
            // InternalSchool.g:92:4: (lv_nombre_2_0= ruleEString )
            // InternalSchool.g:93:5: lv_nombre_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getNombreEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TOPENBRACE_3=(Token)match(input,RULE_TOPENBRACE,FOLLOW_5); 

            			newLeafNode(this_TOPENBRACE_3, grammarAccess.getRootAccess().getTOPENBRACETerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getNavBarColorHexKeyword_4());
            		
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_5, grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_5());
            		
            // InternalSchool.g:122:3: ( (lv_navBarColorHex_6_0= ruleEString ) )
            // InternalSchool.g:123:4: (lv_navBarColorHex_6_0= ruleEString )
            {
            // InternalSchool.g:123:4: (lv_navBarColorHex_6_0= ruleEString )
            // InternalSchool.g:124:5: lv_navBarColorHex_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getNavBarColorHexEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_navBarColorHex_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"navBarColorHex",
            						lv_navBarColorHex_6_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_7=(Token)match(input,RULE_TSEMICOLON,FOLLOW_8); 

            			newLeafNode(this_TSEMICOLON_7, grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getRootAccess().getTextColorKeyword_8());
            		
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_9, grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_9());
            		
            // InternalSchool.g:153:3: ( (lv_textColor_10_0= ruleEString ) )
            // InternalSchool.g:154:4: (lv_textColor_10_0= ruleEString )
            {
            // InternalSchool.g:154:4: (lv_textColor_10_0= ruleEString )
            // InternalSchool.g:155:5: lv_textColor_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getTextColorEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_textColor_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"textColor",
            						lv_textColor_10_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_11=(Token)match(input,RULE_TSEMICOLON,FOLLOW_9); 

            			newLeafNode(this_TSEMICOLON_11, grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getRootAccess().getFloatingButtonColorKeyword_12());
            		
            this_EQUALS_13=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_13, grammarAccess.getRootAccess().getEQUALSTerminalRuleCall_13());
            		
            // InternalSchool.g:184:3: ( (lv_floatingButtonColor_14_0= ruleEString ) )
            // InternalSchool.g:185:4: (lv_floatingButtonColor_14_0= ruleEString )
            {
            // InternalSchool.g:185:4: (lv_floatingButtonColor_14_0= ruleEString )
            // InternalSchool.g:186:5: lv_floatingButtonColor_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getFloatingButtonColorEStringParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_7);
            lv_floatingButtonColor_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"floatingButtonColor",
            						lv_floatingButtonColor_14_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_15=(Token)match(input,RULE_TSEMICOLON,FOLLOW_10); 

            			newLeafNode(this_TSEMICOLON_15, grammarAccess.getRootAccess().getTSEMICOLONTerminalRuleCall_15());
            		
            // InternalSchool.g:207:3: ( (lv_entidad_16_0= ruleEntidad ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSchool.g:208:4: (lv_entidad_16_0= ruleEntidad )
            	    {
            	    // InternalSchool.g:208:4: (lv_entidad_16_0= ruleEntidad )
            	    // InternalSchool.g:209:5: lv_entidad_16_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getEntidadEntidadParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_entidad_16_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidad",
            	    						lv_entidad_16_0,
            	    						"org.xtext.example.mydsl.School.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalSchool.g:226:3: ( (lv_detalles_17_0= ruleDetalle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchool.g:227:4: (lv_detalles_17_0= ruleDetalle )
            	    {
            	    // InternalSchool.g:227:4: (lv_detalles_17_0= ruleDetalle )
            	    // InternalSchool.g:228:5: lv_detalles_17_0= ruleDetalle
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getDetallesDetalleParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_detalles_17_0=ruleDetalle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"detalles",
            	    						lv_detalles_17_0,
            	    						"org.xtext.example.mydsl.School.Detalle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_TCLOSINGBRACE_18=(Token)match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 

            			newLeafNode(this_TCLOSINGBRACE_18, grammarAccess.getRootAccess().getTCLOSINGBRACETerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleDetalle"
    // InternalSchool.g:253:1: entryRuleDetalle returns [EObject current=null] : iv_ruleDetalle= ruleDetalle EOF ;
    public final EObject entryRuleDetalle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetalle = null;


        try {
            // InternalSchool.g:253:48: (iv_ruleDetalle= ruleDetalle EOF )
            // InternalSchool.g:254:2: iv_ruleDetalle= ruleDetalle EOF
            {
             newCompositeNode(grammarAccess.getDetalleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetalle=ruleDetalle();

            state._fsp--;

             current =iv_ruleDetalle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDetalle"


    // $ANTLR start "ruleDetalle"
    // InternalSchool.g:260:1: ruleDetalle returns [EObject current=null] : ( () otherlv_1= 'Detail' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isStrong' this_EQUALS_5= RULE_EQUALS ( (lv_esFuerte_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (otherlv_8= RULE_ID ) ) this_TCLOSINGBRACE_9= RULE_TCLOSINGBRACE ) ;
    public final EObject ruleDetalle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_TOPENBRACE_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token this_TSEMICOLON_7=null;
        Token otherlv_8=null;
        Token this_TCLOSINGBRACE_9=null;
        AntlrDatatypeRuleToken lv_esFuerte_6_0 = null;



        	enterRule();

        try {
            // InternalSchool.g:266:2: ( ( () otherlv_1= 'Detail' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isStrong' this_EQUALS_5= RULE_EQUALS ( (lv_esFuerte_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (otherlv_8= RULE_ID ) ) this_TCLOSINGBRACE_9= RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:267:2: ( () otherlv_1= 'Detail' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isStrong' this_EQUALS_5= RULE_EQUALS ( (lv_esFuerte_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (otherlv_8= RULE_ID ) ) this_TCLOSINGBRACE_9= RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:267:2: ( () otherlv_1= 'Detail' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isStrong' this_EQUALS_5= RULE_EQUALS ( (lv_esFuerte_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (otherlv_8= RULE_ID ) ) this_TCLOSINGBRACE_9= RULE_TCLOSINGBRACE )
            // InternalSchool.g:268:3: () otherlv_1= 'Detail' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isStrong' this_EQUALS_5= RULE_EQUALS ( (lv_esFuerte_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (otherlv_8= RULE_ID ) ) this_TCLOSINGBRACE_9= RULE_TCLOSINGBRACE
            {
            // InternalSchool.g:268:3: ()
            // InternalSchool.g:269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDetalleAccess().getDetalleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDetalleAccess().getDetailKeyword_1());
            		
            // InternalSchool.g:279:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSchool.g:280:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSchool.g:280:4: (lv_name_2_0= RULE_ID )
            // InternalSchool.g:281:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDetalleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetalleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_TOPENBRACE_3=(Token)match(input,RULE_TOPENBRACE,FOLLOW_14); 

            			newLeafNode(this_TOPENBRACE_3, grammarAccess.getDetalleAccess().getTOPENBRACETerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDetalleAccess().getIsStrongKeyword_4());
            		
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FOLLOW_15); 

            			newLeafNode(this_EQUALS_5, grammarAccess.getDetalleAccess().getEQUALSTerminalRuleCall_5());
            		
            // InternalSchool.g:309:3: ( (lv_esFuerte_6_0= ruleEBoolean ) )
            // InternalSchool.g:310:4: (lv_esFuerte_6_0= ruleEBoolean )
            {
            // InternalSchool.g:310:4: (lv_esFuerte_6_0= ruleEBoolean )
            // InternalSchool.g:311:5: lv_esFuerte_6_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getDetalleAccess().getEsFuerteEBooleanParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_esFuerte_6_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetalleRule());
            					}
            					set(
            						current,
            						"esFuerte",
            						lv_esFuerte_6_0,
            						"org.xtext.example.mydsl.School.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_7=(Token)match(input,RULE_TSEMICOLON,FOLLOW_13); 

            			newLeafNode(this_TSEMICOLON_7, grammarAccess.getDetalleAccess().getTSEMICOLONTerminalRuleCall_7());
            		
            // InternalSchool.g:332:3: ( (otherlv_8= RULE_ID ) )
            // InternalSchool.g:333:4: (otherlv_8= RULE_ID )
            {
            // InternalSchool.g:333:4: (otherlv_8= RULE_ID )
            // InternalSchool.g:334:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetalleRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_8, grammarAccess.getDetalleAccess().getEntidadEntidadCrossReference_8_0());
            				

            }


            }

            this_TCLOSINGBRACE_9=(Token)match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 

            			newLeafNode(this_TCLOSINGBRACE_9, grammarAccess.getDetalleAccess().getTCLOSINGBRACETerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDetalle"


    // $ANTLR start "entryRuleEntidad"
    // InternalSchool.g:353:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalSchool.g:353:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalSchool.g:354:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalSchool.g:360:1: ruleEntidad returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'description' this_EQUALS_5= RULE_EQUALS ( (lv_descripcion_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (lv_atributo_8_0= ruleAtributo ) )+ ( (otherlv_9= RULE_ID ) )* this_TCLOSINGBRACE_10= RULE_TCLOSINGBRACE ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_TOPENBRACE_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token this_TSEMICOLON_7=null;
        Token otherlv_9=null;
        Token this_TCLOSINGBRACE_10=null;
        AntlrDatatypeRuleToken lv_descripcion_6_0 = null;

        EObject lv_atributo_8_0 = null;



        	enterRule();

        try {
            // InternalSchool.g:366:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'description' this_EQUALS_5= RULE_EQUALS ( (lv_descripcion_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (lv_atributo_8_0= ruleAtributo ) )+ ( (otherlv_9= RULE_ID ) )* this_TCLOSINGBRACE_10= RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:367:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'description' this_EQUALS_5= RULE_EQUALS ( (lv_descripcion_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (lv_atributo_8_0= ruleAtributo ) )+ ( (otherlv_9= RULE_ID ) )* this_TCLOSINGBRACE_10= RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:367:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'description' this_EQUALS_5= RULE_EQUALS ( (lv_descripcion_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (lv_atributo_8_0= ruleAtributo ) )+ ( (otherlv_9= RULE_ID ) )* this_TCLOSINGBRACE_10= RULE_TCLOSINGBRACE )
            // InternalSchool.g:368:3: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'description' this_EQUALS_5= RULE_EQUALS ( (lv_descripcion_6_0= ruleEString ) ) this_TSEMICOLON_7= RULE_TSEMICOLON ( (lv_atributo_8_0= ruleAtributo ) )+ ( (otherlv_9= RULE_ID ) )* this_TCLOSINGBRACE_10= RULE_TCLOSINGBRACE
            {
            // InternalSchool.g:368:3: ()
            // InternalSchool.g:369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadAccess().getEntidadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadAccess().getEntityKeyword_1());
            		
            // InternalSchool.g:379:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSchool.g:380:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSchool.g:380:4: (lv_name_2_0= RULE_ID )
            // InternalSchool.g:381:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_TOPENBRACE_3=(Token)match(input,RULE_TOPENBRACE,FOLLOW_17); 

            			newLeafNode(this_TOPENBRACE_3, grammarAccess.getEntidadAccess().getTOPENBRACETerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadAccess().getDescriptionKeyword_4());
            		
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_5, grammarAccess.getEntidadAccess().getEQUALSTerminalRuleCall_5());
            		
            // InternalSchool.g:409:3: ( (lv_descripcion_6_0= ruleEString ) )
            // InternalSchool.g:410:4: (lv_descripcion_6_0= ruleEString )
            {
            // InternalSchool.g:410:4: (lv_descripcion_6_0= ruleEString )
            // InternalSchool.g:411:5: lv_descripcion_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntidadAccess().getDescripcionEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_descripcion_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadRule());
            					}
            					set(
            						current,
            						"descripcion",
            						lv_descripcion_6_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_7=(Token)match(input,RULE_TSEMICOLON,FOLLOW_18); 

            			newLeafNode(this_TSEMICOLON_7, grammarAccess.getEntidadAccess().getTSEMICOLONTerminalRuleCall_7());
            		
            // InternalSchool.g:432:3: ( (lv_atributo_8_0= ruleAtributo ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchool.g:433:4: (lv_atributo_8_0= ruleAtributo )
            	    {
            	    // InternalSchool.g:433:4: (lv_atributo_8_0= ruleAtributo )
            	    // InternalSchool.g:434:5: lv_atributo_8_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getAtributoAtributoParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_atributo_8_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributo",
            	    						lv_atributo_8_0,
            	    						"org.xtext.example.mydsl.School.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalSchool.g:451:3: ( (otherlv_9= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSchool.g:452:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalSchool.g:452:4: (otherlv_9= RULE_ID )
            	    // InternalSchool.g:453:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntidadRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    					newLeafNode(otherlv_9, grammarAccess.getEntidadAccess().getDetallesDetalleCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_TCLOSINGBRACE_10=(Token)match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 

            			newLeafNode(this_TCLOSINGBRACE_10, grammarAccess.getEntidadAccess().getTCLOSINGBRACETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalSchool.g:472:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalSchool.g:472:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalSchool.g:473:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalSchool.g:479:1: ruleAtributo returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isEditable' this_EQUALS_5= RULE_EQUALS ( (lv_esEditable_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'isMandatory' this_EQUALS_9= RULE_EQUALS ( (lv_esRequerido_10_0= ruleEBoolean ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'isVisibleInList' this_EQUALS_13= RULE_EQUALS ( (lv_esVisible_14_0= ruleEBoolean ) ) this_TSEMICOLON_15= RULE_TSEMICOLON otherlv_16= 'isTitle' this_EQUALS_17= RULE_EQUALS ( (lv_esTitulo_18_0= ruleEBoolean ) ) this_TSEMICOLON_19= RULE_TSEMICOLON otherlv_20= 'dataType' this_EQUALS_21= RULE_EQUALS ( (lv_tipo_22_0= ruleTipoDato ) ) this_TSEMICOLON_23= RULE_TSEMICOLON this_TCLOSINGBRACE_24= RULE_TCLOSINGBRACE ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_TOPENBRACE_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token this_TSEMICOLON_7=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token this_TSEMICOLON_11=null;
        Token otherlv_12=null;
        Token this_EQUALS_13=null;
        Token this_TSEMICOLON_15=null;
        Token otherlv_16=null;
        Token this_EQUALS_17=null;
        Token this_TSEMICOLON_19=null;
        Token otherlv_20=null;
        Token this_EQUALS_21=null;
        Token this_TSEMICOLON_23=null;
        Token this_TCLOSINGBRACE_24=null;
        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        AntlrDatatypeRuleToken lv_esEditable_6_0 = null;

        AntlrDatatypeRuleToken lv_esRequerido_10_0 = null;

        AntlrDatatypeRuleToken lv_esVisible_14_0 = null;

        AntlrDatatypeRuleToken lv_esTitulo_18_0 = null;

        Enumerator lv_tipo_22_0 = null;



        	enterRule();

        try {
            // InternalSchool.g:485:2: ( ( () otherlv_1= 'Attribute' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isEditable' this_EQUALS_5= RULE_EQUALS ( (lv_esEditable_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'isMandatory' this_EQUALS_9= RULE_EQUALS ( (lv_esRequerido_10_0= ruleEBoolean ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'isVisibleInList' this_EQUALS_13= RULE_EQUALS ( (lv_esVisible_14_0= ruleEBoolean ) ) this_TSEMICOLON_15= RULE_TSEMICOLON otherlv_16= 'isTitle' this_EQUALS_17= RULE_EQUALS ( (lv_esTitulo_18_0= ruleEBoolean ) ) this_TSEMICOLON_19= RULE_TSEMICOLON otherlv_20= 'dataType' this_EQUALS_21= RULE_EQUALS ( (lv_tipo_22_0= ruleTipoDato ) ) this_TSEMICOLON_23= RULE_TSEMICOLON this_TCLOSINGBRACE_24= RULE_TCLOSINGBRACE ) )
            // InternalSchool.g:486:2: ( () otherlv_1= 'Attribute' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isEditable' this_EQUALS_5= RULE_EQUALS ( (lv_esEditable_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'isMandatory' this_EQUALS_9= RULE_EQUALS ( (lv_esRequerido_10_0= ruleEBoolean ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'isVisibleInList' this_EQUALS_13= RULE_EQUALS ( (lv_esVisible_14_0= ruleEBoolean ) ) this_TSEMICOLON_15= RULE_TSEMICOLON otherlv_16= 'isTitle' this_EQUALS_17= RULE_EQUALS ( (lv_esTitulo_18_0= ruleEBoolean ) ) this_TSEMICOLON_19= RULE_TSEMICOLON otherlv_20= 'dataType' this_EQUALS_21= RULE_EQUALS ( (lv_tipo_22_0= ruleTipoDato ) ) this_TSEMICOLON_23= RULE_TSEMICOLON this_TCLOSINGBRACE_24= RULE_TCLOSINGBRACE )
            {
            // InternalSchool.g:486:2: ( () otherlv_1= 'Attribute' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isEditable' this_EQUALS_5= RULE_EQUALS ( (lv_esEditable_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'isMandatory' this_EQUALS_9= RULE_EQUALS ( (lv_esRequerido_10_0= ruleEBoolean ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'isVisibleInList' this_EQUALS_13= RULE_EQUALS ( (lv_esVisible_14_0= ruleEBoolean ) ) this_TSEMICOLON_15= RULE_TSEMICOLON otherlv_16= 'isTitle' this_EQUALS_17= RULE_EQUALS ( (lv_esTitulo_18_0= ruleEBoolean ) ) this_TSEMICOLON_19= RULE_TSEMICOLON otherlv_20= 'dataType' this_EQUALS_21= RULE_EQUALS ( (lv_tipo_22_0= ruleTipoDato ) ) this_TSEMICOLON_23= RULE_TSEMICOLON this_TCLOSINGBRACE_24= RULE_TCLOSINGBRACE )
            // InternalSchool.g:487:3: () otherlv_1= 'Attribute' ( (lv_nombre_2_0= ruleEString ) ) this_TOPENBRACE_3= RULE_TOPENBRACE otherlv_4= 'isEditable' this_EQUALS_5= RULE_EQUALS ( (lv_esEditable_6_0= ruleEBoolean ) ) this_TSEMICOLON_7= RULE_TSEMICOLON otherlv_8= 'isMandatory' this_EQUALS_9= RULE_EQUALS ( (lv_esRequerido_10_0= ruleEBoolean ) ) this_TSEMICOLON_11= RULE_TSEMICOLON otherlv_12= 'isVisibleInList' this_EQUALS_13= RULE_EQUALS ( (lv_esVisible_14_0= ruleEBoolean ) ) this_TSEMICOLON_15= RULE_TSEMICOLON otherlv_16= 'isTitle' this_EQUALS_17= RULE_EQUALS ( (lv_esTitulo_18_0= ruleEBoolean ) ) this_TSEMICOLON_19= RULE_TSEMICOLON otherlv_20= 'dataType' this_EQUALS_21= RULE_EQUALS ( (lv_tipo_22_0= ruleTipoDato ) ) this_TSEMICOLON_23= RULE_TSEMICOLON this_TCLOSINGBRACE_24= RULE_TCLOSINGBRACE
            {
            // InternalSchool.g:487:3: ()
            // InternalSchool.g:488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtributoAccess().getAtributoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getAttributeKeyword_1());
            		
            // InternalSchool.g:498:3: ( (lv_nombre_2_0= ruleEString ) )
            // InternalSchool.g:499:4: (lv_nombre_2_0= ruleEString )
            {
            // InternalSchool.g:499:4: (lv_nombre_2_0= ruleEString )
            // InternalSchool.g:500:5: lv_nombre_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNombreEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.xtext.example.mydsl.School.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TOPENBRACE_3=(Token)match(input,RULE_TOPENBRACE,FOLLOW_21); 

            			newLeafNode(this_TOPENBRACE_3, grammarAccess.getAtributoAccess().getTOPENBRACETerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getIsEditableKeyword_4());
            		
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FOLLOW_15); 

            			newLeafNode(this_EQUALS_5, grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_5());
            		
            // InternalSchool.g:529:3: ( (lv_esEditable_6_0= ruleEBoolean ) )
            // InternalSchool.g:530:4: (lv_esEditable_6_0= ruleEBoolean )
            {
            // InternalSchool.g:530:4: (lv_esEditable_6_0= ruleEBoolean )
            // InternalSchool.g:531:5: lv_esEditable_6_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getEsEditableEBooleanParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_esEditable_6_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"esEditable",
            						lv_esEditable_6_0,
            						"org.xtext.example.mydsl.School.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_7=(Token)match(input,RULE_TSEMICOLON,FOLLOW_22); 

            			newLeafNode(this_TSEMICOLON_7, grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getIsMandatoryKeyword_8());
            		
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FOLLOW_15); 

            			newLeafNode(this_EQUALS_9, grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_9());
            		
            // InternalSchool.g:560:3: ( (lv_esRequerido_10_0= ruleEBoolean ) )
            // InternalSchool.g:561:4: (lv_esRequerido_10_0= ruleEBoolean )
            {
            // InternalSchool.g:561:4: (lv_esRequerido_10_0= ruleEBoolean )
            // InternalSchool.g:562:5: lv_esRequerido_10_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getEsRequeridoEBooleanParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_esRequerido_10_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"esRequerido",
            						lv_esRequerido_10_0,
            						"org.xtext.example.mydsl.School.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_11=(Token)match(input,RULE_TSEMICOLON,FOLLOW_23); 

            			newLeafNode(this_TSEMICOLON_11, grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_11());
            		
            otherlv_12=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getIsVisibleInListKeyword_12());
            		
            this_EQUALS_13=(Token)match(input,RULE_EQUALS,FOLLOW_15); 

            			newLeafNode(this_EQUALS_13, grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_13());
            		
            // InternalSchool.g:591:3: ( (lv_esVisible_14_0= ruleEBoolean ) )
            // InternalSchool.g:592:4: (lv_esVisible_14_0= ruleEBoolean )
            {
            // InternalSchool.g:592:4: (lv_esVisible_14_0= ruleEBoolean )
            // InternalSchool.g:593:5: lv_esVisible_14_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getEsVisibleEBooleanParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_7);
            lv_esVisible_14_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"esVisible",
            						lv_esVisible_14_0,
            						"org.xtext.example.mydsl.School.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_15=(Token)match(input,RULE_TSEMICOLON,FOLLOW_24); 

            			newLeafNode(this_TSEMICOLON_15, grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_15());
            		
            otherlv_16=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getIsTitleKeyword_16());
            		
            this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_15); 

            			newLeafNode(this_EQUALS_17, grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_17());
            		
            // InternalSchool.g:622:3: ( (lv_esTitulo_18_0= ruleEBoolean ) )
            // InternalSchool.g:623:4: (lv_esTitulo_18_0= ruleEBoolean )
            {
            // InternalSchool.g:623:4: (lv_esTitulo_18_0= ruleEBoolean )
            // InternalSchool.g:624:5: lv_esTitulo_18_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getEsTituloEBooleanParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_7);
            lv_esTitulo_18_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"esTitulo",
            						lv_esTitulo_18_0,
            						"org.xtext.example.mydsl.School.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_19=(Token)match(input,RULE_TSEMICOLON,FOLLOW_25); 

            			newLeafNode(this_TSEMICOLON_19, grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_19());
            		
            otherlv_20=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getAtributoAccess().getDataTypeKeyword_20());
            		
            this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_26); 

            			newLeafNode(this_EQUALS_21, grammarAccess.getAtributoAccess().getEQUALSTerminalRuleCall_21());
            		
            // InternalSchool.g:653:3: ( (lv_tipo_22_0= ruleTipoDato ) )
            // InternalSchool.g:654:4: (lv_tipo_22_0= ruleTipoDato )
            {
            // InternalSchool.g:654:4: (lv_tipo_22_0= ruleTipoDato )
            // InternalSchool.g:655:5: lv_tipo_22_0= ruleTipoDato
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipoTipoDatoEnumRuleCall_22_0());
            				
            pushFollow(FOLLOW_7);
            lv_tipo_22_0=ruleTipoDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_22_0,
            						"org.xtext.example.mydsl.School.TipoDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_TSEMICOLON_23=(Token)match(input,RULE_TSEMICOLON,FOLLOW_16); 

            			newLeafNode(this_TSEMICOLON_23, grammarAccess.getAtributoAccess().getTSEMICOLONTerminalRuleCall_23());
            		
            this_TCLOSINGBRACE_24=(Token)match(input,RULE_TCLOSINGBRACE,FOLLOW_2); 

            			newLeafNode(this_TCLOSINGBRACE_24, grammarAccess.getAtributoAccess().getTCLOSINGBRACETerminalRuleCall_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleEString"
    // InternalSchool.g:684:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSchool.g:684:47: (iv_ruleEString= ruleEString EOF )
            // InternalSchool.g:685:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSchool.g:691:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSchool.g:697:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSchool.g:698:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSchool.g:698:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSchool.g:699:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSchool.g:707:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSchool.g:718:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSchool.g:718:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSchool.g:719:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSchool.g:725:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSchool.g:731:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSchool.g:732:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSchool.g:732:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSchool.g:733:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSchool.g:739:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleTipoDato"
    // InternalSchool.g:748:1: ruleTipoDato returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) ) ;
    public final Enumerator ruleTipoDato() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSchool.g:754:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) ) )
            // InternalSchool.g:755:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) )
            {
            // InternalSchool.g:755:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'DATE' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSchool.g:756:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalSchool.g:756:3: (enumLiteral_0= 'STRING' )
                    // InternalSchool.g:757:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchool.g:764:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalSchool.g:764:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalSchool.g:765:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getBoleanoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoDatoAccess().getBoleanoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSchool.g:772:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalSchool.g:772:3: (enumLiteral_2= 'NUMBER' )
                    // InternalSchool.g:773:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoDatoAccess().getNumeroEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSchool.g:780:3: (enumLiteral_3= 'DATE' )
                    {
                    // InternalSchool.g:780:3: (enumLiteral_3= 'DATE' )
                    // InternalSchool.g:781:4: enumLiteral_3= 'DATE'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDato"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000780000000L});

}