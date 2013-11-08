// $ANTLR 3.5 /home/richard/LINQ_Antlr/Linq.g 2013-11-07 19:06:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LinqParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPONENT", "FLOAT", "ID", "INT", 
		"MA", "TD", "'&&'", "'('", "')'", "'++'", "'--'", "': '", "';'", "'<'", 
		"'<='", "'<>'", "'='", "'=='", "'>'", "'>='", "'Do'", "'Else'", "'For'", 
		"'If'", "'Switch'", "'While'", "'break'", "'case'", "'default'", "'ok'", 
		"'return'", "'void'", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int EXPONENT=4;
	public static final int FLOAT=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int MA=8;
	public static final int TD=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LinqParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LinqParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LinqParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/richard/LINQ_Antlr/Linq.g"; }



	// $ANTLR start "program"
	// /home/richard/LINQ_Antlr/Linq.g:3:1: program : ( initial )+ ;
	public final void program() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:3:8: ( ( initial )+ )
			// /home/richard/LINQ_Antlr/Linq.g:3:10: ( initial )+
			{
			// /home/richard/LINQ_Antlr/Linq.g:3:10: ( initial )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==MA||LA1_0==24||(LA1_0 >= 26 && LA1_0 <= 29)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:3:10: initial
					{
					pushFollow(FOLLOW_initial_in_program9);
					initial();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	}
	// $ANTLR end "program"



	// $ANTLR start "initial"
	// /home/richard/LINQ_Antlr/Linq.g:5:1: initial : initialex ;
	public final void initial() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:5:8: ( initialex )
			// /home/richard/LINQ_Antlr/Linq.g:5:10: initialex
			{
			pushFollow(FOLLOW_initialex_in_initial17);
			initialex();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "initial"



	// $ANTLR start "initialex"
	// /home/richard/LINQ_Antlr/Linq.g:7:1: initialex : ( ifex | forex | switchex | whilex | dowhilex | funciones );
	public final void initialex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:7:10: ( ifex | forex | switchex | whilex | dowhilex | funciones )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt2=1;
				}
				break;
			case 26:
				{
				alt2=2;
				}
				break;
			case 28:
				{
				alt2=3;
				}
				break;
			case 29:
				{
				alt2=4;
				}
				break;
			case 24:
				{
				alt2=5;
				}
				break;
			case MA:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:7:12: ifex
					{
					pushFollow(FOLLOW_ifex_in_initialex24);
					ifex();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:7:19: forex
					{
					pushFollow(FOLLOW_forex_in_initialex28);
					forex();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/richard/LINQ_Antlr/Linq.g:7:27: switchex
					{
					pushFollow(FOLLOW_switchex_in_initialex32);
					switchex();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/richard/LINQ_Antlr/Linq.g:7:38: whilex
					{
					pushFollow(FOLLOW_whilex_in_initialex36);
					whilex();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/richard/LINQ_Antlr/Linq.g:7:47: dowhilex
					{
					pushFollow(FOLLOW_dowhilex_in_initialex40);
					dowhilex();
					state._fsp--;

					}
					break;
				case 6 :
					// /home/richard/LINQ_Antlr/Linq.g:7:58: funciones
					{
					pushFollow(FOLLOW_funciones_in_initialex44);
					funciones();
					state._fsp--;

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
	}
	// $ANTLR end "initialex"



	// $ANTLR start "ifex"
	// /home/richard/LINQ_Antlr/Linq.g:11:1: ifex : 'If' '(' condicion ')' inbloque accion finbloque else ;
	public final void ifex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:11:5: ( 'If' '(' condicion ')' inbloque accion finbloque else )
			// /home/richard/LINQ_Antlr/Linq.g:11:7: 'If' '(' condicion ')' inbloque accion finbloque else
			{
			match(input,27,FOLLOW_27_in_ifex53); 
			match(input,11,FOLLOW_11_in_ifex55); 
			pushFollow(FOLLOW_condicion_in_ifex58);
			condicion();
			state._fsp--;

			match(input,12,FOLLOW_12_in_ifex60); 
			pushFollow(FOLLOW_inbloque_in_ifex62);
			inbloque();
			state._fsp--;

			pushFollow(FOLLOW_accion_in_ifex65);
			accion();
			state._fsp--;

			pushFollow(FOLLOW_finbloque_in_ifex67);
			finbloque();
			state._fsp--;

			pushFollow(FOLLOW_else_in_ifex69);
			else();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifex"



	// $ANTLR start "else"
	// /home/richard/LINQ_Antlr/Linq.g:12:1: else : (| 'Else' inbloque accion finbloque else );
	public final void else() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:12:6: (| 'Else' inbloque accion finbloque else )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==EOF||LA3_0==MA||LA3_0==24||(LA3_0 >= 26 && LA3_0 <= 29)) ) {
				alt3=1;
			}
			else if ( (LA3_0==25) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:13:2: 
					{
					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:13:3: 'Else' inbloque accion finbloque else
					{
					match(input,25,FOLLOW_25_in_else79); 
					pushFollow(FOLLOW_inbloque_in_else80);
					inbloque();
					state._fsp--;

					pushFollow(FOLLOW_accion_in_else83);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_finbloque_in_else85);
					finbloque();
					state._fsp--;

					pushFollow(FOLLOW_else_in_else87);
					else();
					state._fsp--;

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
	}
	// $ANTLR end "else"



	// $ANTLR start "final"
	// /home/richard/LINQ_Antlr/Linq.g:16:1: final : ';' ;
	public final void final() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:16:7: ( ';' )
			// /home/richard/LINQ_Antlr/Linq.g:16:10: ';'
			{
			match(input,16,FOLLOW_16_in_final97); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "final"



	// $ANTLR start "inbloque"
	// /home/richard/LINQ_Antlr/Linq.g:18:1: inbloque : '{' ;
	public final void inbloque() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:18:9: ( '{' )
			// /home/richard/LINQ_Antlr/Linq.g:18:11: '{'
			{
			match(input,36,FOLLOW_36_in_inbloque105); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inbloque"



	// $ANTLR start "finbloque"
	// /home/richard/LINQ_Antlr/Linq.g:20:1: finbloque : '}' ;
	public final void finbloque() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:21:2: ( '}' )
			// /home/richard/LINQ_Antlr/Linq.g:21:4: '}'
			{
			match(input,38,FOLLOW_38_in_finbloque114); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "finbloque"



	// $ANTLR start "forex"
	// /home/richard/LINQ_Antlr/Linq.g:23:1: forex : 'For' '(' iniciofor final limitador final mov ')' inbloque accion finbloque ;
	public final void forex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:23:6: ( 'For' '(' iniciofor final limitador final mov ')' inbloque accion finbloque )
			// /home/richard/LINQ_Antlr/Linq.g:23:8: 'For' '(' iniciofor final limitador final mov ')' inbloque accion finbloque
			{
			match(input,26,FOLLOW_26_in_forex121); 
			match(input,11,FOLLOW_11_in_forex123); 
			pushFollow(FOLLOW_iniciofor_in_forex125);
			iniciofor();
			state._fsp--;

			pushFollow(FOLLOW_final_in_forex131);
			final();
			state._fsp--;

			pushFollow(FOLLOW_limitador_in_forex133);
			limitador();
			state._fsp--;

			pushFollow(FOLLOW_final_in_forex137);
			final();
			state._fsp--;

			pushFollow(FOLLOW_mov_in_forex139);
			mov();
			state._fsp--;

			match(input,12,FOLLOW_12_in_forex143); 
			pushFollow(FOLLOW_inbloque_in_forex145);
			inbloque();
			state._fsp--;

			pushFollow(FOLLOW_accion_in_forex147);
			accion();
			state._fsp--;

			pushFollow(FOLLOW_finbloque_in_forex150);
			finbloque();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forex"



	// $ANTLR start "whilex"
	// /home/richard/LINQ_Antlr/Linq.g:25:1: whilex : 'While' '(' condicion ')' inbloque accion finbloque ;
	public final void whilex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:25:7: ( 'While' '(' condicion ')' inbloque accion finbloque )
			// /home/richard/LINQ_Antlr/Linq.g:25:9: 'While' '(' condicion ')' inbloque accion finbloque
			{
			match(input,29,FOLLOW_29_in_whilex157); 
			match(input,11,FOLLOW_11_in_whilex159); 
			pushFollow(FOLLOW_condicion_in_whilex161);
			condicion();
			state._fsp--;

			match(input,12,FOLLOW_12_in_whilex162); 
			pushFollow(FOLLOW_inbloque_in_whilex164);
			inbloque();
			state._fsp--;

			pushFollow(FOLLOW_accion_in_whilex166);
			accion();
			state._fsp--;

			pushFollow(FOLLOW_finbloque_in_whilex169);
			finbloque();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whilex"



	// $ANTLR start "dowhilex"
	// /home/richard/LINQ_Antlr/Linq.g:27:1: dowhilex : 'Do' inbloque accion finbloque 'While' '(' condicion ')' ;
	public final void dowhilex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:27:9: ( 'Do' inbloque accion finbloque 'While' '(' condicion ')' )
			// /home/richard/LINQ_Antlr/Linq.g:27:11: 'Do' inbloque accion finbloque 'While' '(' condicion ')'
			{
			match(input,24,FOLLOW_24_in_dowhilex176); 
			pushFollow(FOLLOW_inbloque_in_dowhilex178);
			inbloque();
			state._fsp--;

			pushFollow(FOLLOW_accion_in_dowhilex180);
			accion();
			state._fsp--;

			pushFollow(FOLLOW_finbloque_in_dowhilex182);
			finbloque();
			state._fsp--;

			match(input,29,FOLLOW_29_in_dowhilex184); 
			match(input,11,FOLLOW_11_in_dowhilex186); 
			pushFollow(FOLLOW_condicion_in_dowhilex188);
			condicion();
			state._fsp--;

			match(input,12,FOLLOW_12_in_dowhilex189); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dowhilex"



	// $ANTLR start "switchex"
	// /home/richard/LINQ_Antlr/Linq.g:29:1: switchex : 'Switch' '(' var ')' inbloque caseswitch finbloque ;
	public final void switchex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:29:9: ( 'Switch' '(' var ')' inbloque caseswitch finbloque )
			// /home/richard/LINQ_Antlr/Linq.g:29:13: 'Switch' '(' var ')' inbloque caseswitch finbloque
			{
			match(input,28,FOLLOW_28_in_switchex198); 
			match(input,11,FOLLOW_11_in_switchex200); 
			pushFollow(FOLLOW_var_in_switchex202);
			var();
			state._fsp--;

			match(input,12,FOLLOW_12_in_switchex204); 
			pushFollow(FOLLOW_inbloque_in_switchex206);
			inbloque();
			state._fsp--;

			pushFollow(FOLLOW_caseswitch_in_switchex209);
			caseswitch();
			state._fsp--;

			pushFollow(FOLLOW_finbloque_in_switchex211);
			finbloque();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "switchex"



	// $ANTLR start "caseswitch"
	// /home/richard/LINQ_Antlr/Linq.g:31:1: caseswitch : ( 'case' INT ': ' accion break final fimalswitch | 'case' INT ': ' accion break final caseswitch );
	public final void caseswitch() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:31:12: ( 'case' INT ': ' accion break final fimalswitch | 'case' INT ': ' accion break final caseswitch )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==31) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==INT) ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2==15) ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3==33) ) {
							int LA4_4 = input.LA(5);
							if ( (LA4_4==30) ) {
								int LA4_5 = input.LA(6);
								if ( (LA4_5==16) ) {
									int LA4_6 = input.LA(7);
									if ( (LA4_6==32) ) {
										alt4=1;
									}
									else if ( (LA4_6==31) ) {
										alt4=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 4, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 4, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:31:13: 'case' INT ': ' accion break final fimalswitch
					{
					match(input,31,FOLLOW_31_in_caseswitch219); 
					match(input,INT,FOLLOW_INT_in_caseswitch221); 
					match(input,15,FOLLOW_15_in_caseswitch223); 
					pushFollow(FOLLOW_accion_in_caseswitch224);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_break_in_caseswitch226);
					break();
					state._fsp--;

					pushFollow(FOLLOW_final_in_caseswitch228);
					final();
					state._fsp--;

					pushFollow(FOLLOW_fimalswitch_in_caseswitch230);
					fimalswitch();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:32:4: 'case' INT ': ' accion break final caseswitch
					{
					match(input,31,FOLLOW_31_in_caseswitch235); 
					match(input,INT,FOLLOW_INT_in_caseswitch237); 
					match(input,15,FOLLOW_15_in_caseswitch239); 
					pushFollow(FOLLOW_accion_in_caseswitch240);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_break_in_caseswitch242);
					break();
					state._fsp--;

					pushFollow(FOLLOW_final_in_caseswitch244);
					final();
					state._fsp--;

					pushFollow(FOLLOW_caseswitch_in_caseswitch246);
					caseswitch();
					state._fsp--;

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
	}
	// $ANTLR end "caseswitch"



	// $ANTLR start "fimalswitch"
	// /home/richard/LINQ_Antlr/Linq.g:35:1: fimalswitch : 'default' ': ' accion break final ;
	public final void fimalswitch() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:36:2: ( 'default' ': ' accion break final )
			// /home/richard/LINQ_Antlr/Linq.g:36:4: 'default' ': ' accion break final
			{
			match(input,32,FOLLOW_32_in_fimalswitch256); 
			match(input,15,FOLLOW_15_in_fimalswitch258); 
			pushFollow(FOLLOW_accion_in_fimalswitch259);
			accion();
			state._fsp--;

			pushFollow(FOLLOW_break_in_fimalswitch261);
			break();
			state._fsp--;

			pushFollow(FOLLOW_final_in_fimalswitch263);
			final();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fimalswitch"



	// $ANTLR start "break"
	// /home/richard/LINQ_Antlr/Linq.g:37:1: break : 'break' ;
	public final void break() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:37:7: ( 'break' )
			// /home/richard/LINQ_Antlr/Linq.g:37:9: 'break'
			{
			match(input,30,FOLLOW_30_in_break271); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "break"



	// $ANTLR start "mov"
	// /home/richard/LINQ_Antlr/Linq.g:38:1: mov : var funcion ;
	public final void mov() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:38:5: ( var funcion )
			// /home/richard/LINQ_Antlr/Linq.g:38:7: var funcion
			{
			pushFollow(FOLLOW_var_in_mov278);
			var();
			state._fsp--;

			pushFollow(FOLLOW_funcion_in_mov280);
			funcion();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mov"



	// $ANTLR start "limitador"
	// /home/richard/LINQ_Antlr/Linq.g:39:1: limitador : ( var comparacion val | var comparacion var );
	public final void limitador() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:40:2: ( var comparacion val | var comparacion var )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				int LA5_1 = input.LA(2);
				if ( ((LA5_1 >= 17 && LA5_1 <= 19)||(LA5_1 >= 21 && LA5_1 <= 23)) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==FLOAT||LA5_2==INT) ) {
						alt5=1;
					}
					else if ( (LA5_2==ID) ) {
						alt5=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:40:4: var comparacion val
					{
					pushFollow(FOLLOW_var_in_limitador289);
					var();
					state._fsp--;

					pushFollow(FOLLOW_comparacion_in_limitador291);
					comparacion();
					state._fsp--;

					pushFollow(FOLLOW_val_in_limitador293);
					val();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:40:26: var comparacion var
					{
					pushFollow(FOLLOW_var_in_limitador297);
					var();
					state._fsp--;

					pushFollow(FOLLOW_comparacion_in_limitador299);
					comparacion();
					state._fsp--;

					pushFollow(FOLLOW_var_in_limitador301);
					var();
					state._fsp--;

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
	}
	// $ANTLR end "limitador"



	// $ANTLR start "comparacion"
	// /home/richard/LINQ_Antlr/Linq.g:44:1: comparacion : ( '<>' | '<=' | '>=' | '==' | '>' | '<' );
	public final void comparacion() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:44:13: ( '<>' | '<=' | '>=' | '==' | '>' | '<' )
			// /home/richard/LINQ_Antlr/Linq.g:
			{
			if ( (input.LA(1) >= 17 && input.LA(1) <= 19)||(input.LA(1) >= 21 && input.LA(1) <= 23) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "comparacion"



	// $ANTLR start "accion"
	// /home/richard/LINQ_Antlr/Linq.g:47:1: accion : 'ok' ;
	public final void accion() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:47:8: ( 'ok' )
			// /home/richard/LINQ_Antlr/Linq.g:47:10: 'ok'
			{
			match(input,33,FOLLOW_33_in_accion338); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "accion"



	// $ANTLR start "funcion"
	// /home/richard/LINQ_Antlr/Linq.g:50:1: funcion : ( '++' | '--' );
	public final void funcion() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:50:9: ( '++' | '--' )
			// /home/richard/LINQ_Antlr/Linq.g:
			{
			if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "funcion"



	// $ANTLR start "iniciofor"
	// /home/richard/LINQ_Antlr/Linq.g:52:1: iniciofor : var '=' val ;
	public final void iniciofor() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:52:11: ( var '=' val )
			// /home/richard/LINQ_Antlr/Linq.g:52:13: var '=' val
			{
			pushFollow(FOLLOW_var_in_iniciofor361);
			var();
			state._fsp--;

			match(input,20,FOLLOW_20_in_iniciofor363); 
			pushFollow(FOLLOW_val_in_iniciofor364);
			val();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "iniciofor"



	// $ANTLR start "finalex"
	// /home/richard/LINQ_Antlr/Linq.g:54:1: finalex :;
	public final void finalex() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:54:9: ()
			// /home/richard/LINQ_Antlr/Linq.g:55:2: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "finalex"



	// $ANTLR start "condicion"
	// /home/richard/LINQ_Antlr/Linq.g:56:1: condicion : ( var comparacion val | var comparacion val conjun condicion );
	public final void condicion() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:56:11: ( var comparacion val | var comparacion val conjun condicion )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				int LA6_1 = input.LA(2);
				if ( ((LA6_1 >= 17 && LA6_1 <= 19)||(LA6_1 >= 21 && LA6_1 <= 23)) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==FLOAT||LA6_2==INT) ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3==12) ) {
							alt6=1;
						}
						else if ( (LA6_3==10||LA6_3==37) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:56:13: var comparacion val
					{
					pushFollow(FOLLOW_var_in_condicion381);
					var();
					state._fsp--;

					pushFollow(FOLLOW_comparacion_in_condicion383);
					comparacion();
					state._fsp--;

					pushFollow(FOLLOW_val_in_condicion385);
					val();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:57:4: var comparacion val conjun condicion
					{
					pushFollow(FOLLOW_var_in_condicion390);
					var();
					state._fsp--;

					pushFollow(FOLLOW_comparacion_in_condicion392);
					comparacion();
					state._fsp--;

					pushFollow(FOLLOW_val_in_condicion394);
					val();
					state._fsp--;

					pushFollow(FOLLOW_conjun_in_condicion396);
					conjun();
					state._fsp--;

					pushFollow(FOLLOW_condicion_in_condicion398);
					condicion();
					state._fsp--;

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
	}
	// $ANTLR end "condicion"



	// $ANTLR start "val"
	// /home/richard/LINQ_Antlr/Linq.g:59:1: val : ( INT | FLOAT );
	public final void val() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:59:5: ( INT | FLOAT )
			// /home/richard/LINQ_Antlr/Linq.g:
			{
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "val"



	// $ANTLR start "var"
	// /home/richard/LINQ_Antlr/Linq.g:62:1: var : ID ;
	public final void var() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:62:5: ( ID )
			// /home/richard/LINQ_Antlr/Linq.g:62:7: ID
			{
			match(input,ID,FOLLOW_ID_in_var421); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var"



	// $ANTLR start "conjun"
	// /home/richard/LINQ_Antlr/Linq.g:64:1: conjun : ( '||' | '&&' );
	public final void conjun() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:64:8: ( '||' | '&&' )
			// /home/richard/LINQ_Antlr/Linq.g:
			{
			if ( input.LA(1)==10||input.LA(1)==37 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "conjun"



	// $ANTLR start "funciones"
	// /home/richard/LINQ_Antlr/Linq.g:68:1: funciones : ( vacia | retorna );
	public final void funciones() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:68:11: ( vacia | retorna )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MA) ) {
				switch ( input.LA(2) ) {
				case MA:
					{
					int LA7_2 = input.LA(3);
					if ( (LA7_2==TD) ) {
						alt7=2;
					}
					else if ( (LA7_2==35) ) {
						alt7=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case TD:
					{
					alt7=2;
					}
					break;
				case 35:
					{
					alt7=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:68:13: vacia
					{
					pushFollow(FOLLOW_vacia_in_funciones446);
					vacia();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:68:19: retorna
					{
					pushFollow(FOLLOW_retorna_in_funciones448);
					retorna();
					state._fsp--;

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
	}
	// $ANTLR end "funciones"



	// $ANTLR start "vacia"
	// /home/richard/LINQ_Antlr/Linq.g:69:1: vacia : ( MA void ID inbloque accion finbloque | MA MA void ID inbloque accion finbloque );
	public final void vacia() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:69:7: ( MA void ID inbloque accion finbloque | MA MA void ID inbloque accion finbloque )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MA) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==MA) ) {
					alt8=2;
				}
				else if ( (LA8_1==35) ) {
					alt8=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:69:9: MA void ID inbloque accion finbloque
					{
					match(input,MA,FOLLOW_MA_in_vacia455); 
					pushFollow(FOLLOW_void_in_vacia457);
					void();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_vacia459); 
					pushFollow(FOLLOW_inbloque_in_vacia461);
					inbloque();
					state._fsp--;

					pushFollow(FOLLOW_accion_in_vacia463);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_finbloque_in_vacia465);
					finbloque();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:70:4: MA MA void ID inbloque accion finbloque
					{
					match(input,MA,FOLLOW_MA_in_vacia470); 
					match(input,MA,FOLLOW_MA_in_vacia472); 
					pushFollow(FOLLOW_void_in_vacia474);
					void();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_vacia476); 
					pushFollow(FOLLOW_inbloque_in_vacia478);
					inbloque();
					state._fsp--;

					pushFollow(FOLLOW_accion_in_vacia480);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_finbloque_in_vacia482);
					finbloque();
					state._fsp--;

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
	}
	// $ANTLR end "vacia"



	// $ANTLR start "void"
	// /home/richard/LINQ_Antlr/Linq.g:72:1: void : 'void' ;
	public final void void() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:72:6: ( 'void' )
			// /home/richard/LINQ_Antlr/Linq.g:72:8: 'void'
			{
			match(input,35,FOLLOW_35_in_void491); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "void"



	// $ANTLR start "retorna"
	// /home/richard/LINQ_Antlr/Linq.g:73:1: retorna : ( MA TD ID inbloque accion return finbloque | MA MA TD ID inbloque accion return finbloque );
	public final void retorna() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:73:9: ( MA TD ID inbloque accion return finbloque | MA MA TD ID inbloque accion return finbloque )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==MA) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==TD) ) {
					alt9=1;
				}
				else if ( (LA9_1==MA) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:73:11: MA TD ID inbloque accion return finbloque
					{
					match(input,MA,FOLLOW_MA_in_retorna498); 
					match(input,TD,FOLLOW_TD_in_retorna500); 
					match(input,ID,FOLLOW_ID_in_retorna502); 
					pushFollow(FOLLOW_inbloque_in_retorna504);
					inbloque();
					state._fsp--;

					pushFollow(FOLLOW_accion_in_retorna506);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_return_in_retorna509);
					return();
					state._fsp--;

					pushFollow(FOLLOW_finbloque_in_retorna511);
					finbloque();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:74:4: MA MA TD ID inbloque accion return finbloque
					{
					match(input,MA,FOLLOW_MA_in_retorna516); 
					match(input,MA,FOLLOW_MA_in_retorna518); 
					match(input,TD,FOLLOW_TD_in_retorna520); 
					match(input,ID,FOLLOW_ID_in_retorna522); 
					pushFollow(FOLLOW_inbloque_in_retorna524);
					inbloque();
					state._fsp--;

					pushFollow(FOLLOW_accion_in_retorna526);
					accion();
					state._fsp--;

					pushFollow(FOLLOW_return_in_retorna528);
					return();
					state._fsp--;

					pushFollow(FOLLOW_finbloque_in_retorna530);
					finbloque();
					state._fsp--;

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
	}
	// $ANTLR end "retorna"



	// $ANTLR start "return"
	// /home/richard/LINQ_Antlr/Linq.g:76:1: return : ( 'return' var final | 'return' val final );
	public final void return() throws  {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:76:8: ( 'return' var final | 'return' val final )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==34) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==ID) ) {
					alt10=1;
				}
				else if ( (LA10_1==FLOAT||LA10_1==INT) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:76:10: 'return' var final
					{
					match(input,34,FOLLOW_34_in_return539); 
					pushFollow(FOLLOW_var_in_return541);
					var();
					state._fsp--;

					pushFollow(FOLLOW_final_in_return543);
					final();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:77:4: 'return' val final
					{
					match(input,34,FOLLOW_34_in_return548); 
					pushFollow(FOLLOW_val_in_return550);
					val();
					state._fsp--;

					pushFollow(FOLLOW_final_in_return552);
					final();
					state._fsp--;

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
	}
	// $ANTLR end "return"

	// Delegated rules



	public static final BitSet FOLLOW_initial_in_program9 = new BitSet(new long[]{0x000000003D000102L});
	public static final BitSet FOLLOW_initialex_in_initial17 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifex_in_initialex24 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forex_in_initialex28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchex_in_initialex32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilex_in_initialex36 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhilex_in_initialex40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funciones_in_initialex44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_ifex53 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ifex55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_condicion_in_ifex58 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ifex60 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_ifex62 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_ifex65 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_ifex67 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_else_in_ifex69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_else79 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_else80 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_else83 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_else85 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_else_in_else87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_final97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_inbloque105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_finbloque114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_forex121 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_forex123 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_iniciofor_in_forex125 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_forex131 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_limitador_in_forex133 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_forex137 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_mov_in_forex139 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_forex143 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_forex145 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_forex147 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_forex150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_whilex157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_whilex159 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_condicion_in_whilex161 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_whilex162 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_whilex164 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_whilex166 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_whilex169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_dowhilex176 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_dowhilex178 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_dowhilex180 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_dowhilex182 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_dowhilex184 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_dowhilex186 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_condicion_in_dowhilex188 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_dowhilex189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_switchex198 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_switchex200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_var_in_switchex202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_switchex204 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_switchex206 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_caseswitch_in_switchex209 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_switchex211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_caseswitch219 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_caseswitch221 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_caseswitch223 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_caseswitch224 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_break_in_caseswitch226 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_caseswitch228 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_fimalswitch_in_caseswitch230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_caseswitch235 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_caseswitch237 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_caseswitch239 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_caseswitch240 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_break_in_caseswitch242 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_caseswitch244 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_caseswitch_in_caseswitch246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_fimalswitch256 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_fimalswitch258 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_fimalswitch259 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_break_in_fimalswitch261 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_fimalswitch263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_break271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_mov278 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_funcion_in_mov280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_limitador289 = new BitSet(new long[]{0x0000000000EE0000L});
	public static final BitSet FOLLOW_comparacion_in_limitador291 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_val_in_limitador293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_limitador297 = new BitSet(new long[]{0x0000000000EE0000L});
	public static final BitSet FOLLOW_comparacion_in_limitador299 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_var_in_limitador301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_accion338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_iniciofor361 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_iniciofor363 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_val_in_iniciofor364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_condicion381 = new BitSet(new long[]{0x0000000000EE0000L});
	public static final BitSet FOLLOW_comparacion_in_condicion383 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_val_in_condicion385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_condicion390 = new BitSet(new long[]{0x0000000000EE0000L});
	public static final BitSet FOLLOW_comparacion_in_condicion392 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_val_in_condicion394 = new BitSet(new long[]{0x0000002000000400L});
	public static final BitSet FOLLOW_conjun_in_condicion396 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_condicion_in_condicion398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vacia_in_funciones446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_retorna_in_funciones448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MA_in_vacia455 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_void_in_vacia457 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_vacia459 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_vacia461 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_vacia463 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_vacia465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MA_in_vacia470 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_MA_in_vacia472 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_void_in_vacia474 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_vacia476 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_vacia478 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_vacia480 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_vacia482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_void491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MA_in_retorna498 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_TD_in_retorna500 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_retorna502 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_retorna504 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_retorna506 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_return_in_retorna509 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_retorna511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MA_in_retorna516 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_MA_in_retorna518 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_TD_in_retorna520 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_retorna522 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_inbloque_in_retorna524 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_accion_in_retorna526 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_return_in_retorna528 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_finbloque_in_retorna530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_return539 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_var_in_return541 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_return543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_return548 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_val_in_return550 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_final_in_return552 = new BitSet(new long[]{0x0000000000000002L});
}
