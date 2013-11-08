// $ANTLR 3.5 /home/richard/LINQ_Antlr/Linq.g 2013-11-07 19:06:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LinqLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LinqLexer() {} 
	public LinqLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LinqLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/richard/LINQ_Antlr/Linq.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:2:7: ( '&&' )
			// /home/richard/LINQ_Antlr/Linq.g:2:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:3:7: ( '(' )
			// /home/richard/LINQ_Antlr/Linq.g:3:9: '('
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:4:7: ( ')' )
			// /home/richard/LINQ_Antlr/Linq.g:4:9: ')'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:5:7: ( '++' )
			// /home/richard/LINQ_Antlr/Linq.g:5:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:6:7: ( '--' )
			// /home/richard/LINQ_Antlr/Linq.g:6:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:7:7: ( ': ' )
			// /home/richard/LINQ_Antlr/Linq.g:7:9: ': '
			{
			match(": "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:8:7: ( ';' )
			// /home/richard/LINQ_Antlr/Linq.g:8:9: ';'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:9:7: ( '<' )
			// /home/richard/LINQ_Antlr/Linq.g:9:9: '<'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:10:7: ( '<=' )
			// /home/richard/LINQ_Antlr/Linq.g:10:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:11:7: ( '<>' )
			// /home/richard/LINQ_Antlr/Linq.g:11:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:12:7: ( '=' )
			// /home/richard/LINQ_Antlr/Linq.g:12:9: '='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:13:7: ( '==' )
			// /home/richard/LINQ_Antlr/Linq.g:13:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:14:7: ( '>' )
			// /home/richard/LINQ_Antlr/Linq.g:14:9: '>'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:15:7: ( '>=' )
			// /home/richard/LINQ_Antlr/Linq.g:15:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:16:7: ( 'Do' )
			// /home/richard/LINQ_Antlr/Linq.g:16:9: 'Do'
			{
			match("Do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:17:7: ( 'Else' )
			// /home/richard/LINQ_Antlr/Linq.g:17:9: 'Else'
			{
			match("Else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:18:7: ( 'For' )
			// /home/richard/LINQ_Antlr/Linq.g:18:9: 'For'
			{
			match("For"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:19:7: ( 'If' )
			// /home/richard/LINQ_Antlr/Linq.g:19:9: 'If'
			{
			match("If"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:20:7: ( 'Switch' )
			// /home/richard/LINQ_Antlr/Linq.g:20:9: 'Switch'
			{
			match("Switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:21:7: ( 'While' )
			// /home/richard/LINQ_Antlr/Linq.g:21:9: 'While'
			{
			match("While"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:22:7: ( 'break' )
			// /home/richard/LINQ_Antlr/Linq.g:22:9: 'break'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:23:7: ( 'case' )
			// /home/richard/LINQ_Antlr/Linq.g:23:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:24:7: ( 'default' )
			// /home/richard/LINQ_Antlr/Linq.g:24:9: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:25:7: ( 'ok' )
			// /home/richard/LINQ_Antlr/Linq.g:25:9: 'ok'
			{
			match("ok"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:26:7: ( 'return' )
			// /home/richard/LINQ_Antlr/Linq.g:26:9: 'return'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:27:7: ( 'void' )
			// /home/richard/LINQ_Antlr/Linq.g:27:9: 'void'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:28:7: ( '{' )
			// /home/richard/LINQ_Antlr/Linq.g:28:9: '{'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:29:7: ( '||' )
			// /home/richard/LINQ_Antlr/Linq.g:29:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:30:7: ( '}' )
			// /home/richard/LINQ_Antlr/Linq.g:30:9: '}'
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
	// $ANTLR end "T__38"

	// $ANTLR start "MA"
	public final void mMA() throws RecognitionException {
		try {
			int _type = MA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:81:4: ( 'Public' | 'Protected' | 'Private' | 'Final' | 'Statict' | 'Transfert' | 'Volatile' | 'Object' )
			int alt1=8;
			switch ( input.LA(1) ) {
			case 'P':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='u') ) {
					alt1=1;
				}
				else if ( (LA1_1=='r') ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8=='o') ) {
						alt1=2;
					}
					else if ( (LA1_8=='i') ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
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
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'F':
				{
				alt1=4;
				}
				break;
			case 'S':
				{
				alt1=5;
				}
				break;
			case 'T':
				{
				alt1=6;
				}
				break;
			case 'V':
				{
				alt1=7;
				}
				break;
			case 'O':
				{
				alt1=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:81:6: 'Public'
					{
					match("Public"); 

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:82:4: 'Protected'
					{
					match("Protected"); 

					}
					break;
				case 3 :
					// /home/richard/LINQ_Antlr/Linq.g:83:4: 'Private'
					{
					match("Private"); 

					}
					break;
				case 4 :
					// /home/richard/LINQ_Antlr/Linq.g:84:4: 'Final'
					{
					match("Final"); 

					}
					break;
				case 5 :
					// /home/richard/LINQ_Antlr/Linq.g:85:4: 'Statict'
					{
					match("Statict"); 

					}
					break;
				case 6 :
					// /home/richard/LINQ_Antlr/Linq.g:86:4: 'Transfert'
					{
					match("Transfert"); 

					}
					break;
				case 7 :
					// /home/richard/LINQ_Antlr/Linq.g:87:4: 'Volatile'
					{
					match("Volatile"); 

					}
					break;
				case 8 :
					// /home/richard/LINQ_Antlr/Linq.g:88:4: 'Object'
					{
					match("Object"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MA"

	// $ANTLR start "TD"
	public final void mTD() throws RecognitionException {
		try {
			int _type = TD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:91:4: ( 'Boolean' | 'byte' | 'double' | 'long' | 'slust' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 'B':
				{
				alt2=1;
				}
				break;
			case 'b':
				{
				alt2=2;
				}
				break;
			case 'd':
				{
				alt2=3;
				}
				break;
			case 'l':
				{
				alt2=4;
				}
				break;
			case 's':
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:91:6: 'Boolean'
					{
					match("Boolean"); 

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:92:4: 'byte'
					{
					match("byte"); 

					}
					break;
				case 3 :
					// /home/richard/LINQ_Antlr/Linq.g:93:4: 'double'
					{
					match("double"); 

					}
					break;
				case 4 :
					// /home/richard/LINQ_Antlr/Linq.g:94:4: 'long'
					{
					match("long"); 

					}
					break;
				case 5 :
					// /home/richard/LINQ_Antlr/Linq.g:95:4: 'slust'
					{
					match("slust"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TD"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:98:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/richard/LINQ_Antlr/Linq.g:98:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/richard/LINQ_Antlr/Linq.g:98:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:
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
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/richard/LINQ_Antlr/Linq.g:103:5: ( ( '0' .. '9' )+ )
			// /home/richard/LINQ_Antlr/Linq.g:103:7: ( '0' .. '9' )+
			{
			// /home/richard/LINQ_Antlr/Linq.g:103:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:
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
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

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
			// /home/richard/LINQ_Antlr/Linq.g:108:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:108:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /home/richard/LINQ_Antlr/Linq.g:108:9: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:
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
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// /home/richard/LINQ_Antlr/Linq.g:108:25: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:
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
							break loop6;
						}
					}

					// /home/richard/LINQ_Antlr/Linq.g:108:37: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:108:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/richard/LINQ_Antlr/Linq.g:109:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /home/richard/LINQ_Antlr/Linq.g:109:13: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// /home/richard/LINQ_Antlr/Linq.g:109:25: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:109:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/richard/LINQ_Antlr/Linq.g:110:9: ( '0' .. '9' )+ EXPONENT
					{
					// /home/richard/LINQ_Antlr/Linq.g:110:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /home/richard/LINQ_Antlr/Linq.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /home/richard/LINQ_Antlr/Linq.g:115:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /home/richard/LINQ_Antlr/Linq.g:115:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/richard/LINQ_Antlr/Linq.g:115:22: ( '+' | '-' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='+'||LA12_0=='-') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/richard/LINQ_Antlr/Linq.g:115:33: ( '0' .. '9' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/richard/LINQ_Antlr/Linq.g:
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/richard/LINQ_Antlr/Linq.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | MA | TD | ID | INT | FLOAT )
		int alt14=34;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /home/richard/LINQ_Antlr/Linq.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// /home/richard/LINQ_Antlr/Linq.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// /home/richard/LINQ_Antlr/Linq.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// /home/richard/LINQ_Antlr/Linq.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// /home/richard/LINQ_Antlr/Linq.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// /home/richard/LINQ_Antlr/Linq.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// /home/richard/LINQ_Antlr/Linq.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// /home/richard/LINQ_Antlr/Linq.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// /home/richard/LINQ_Antlr/Linq.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// /home/richard/LINQ_Antlr/Linq.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// /home/richard/LINQ_Antlr/Linq.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// /home/richard/LINQ_Antlr/Linq.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// /home/richard/LINQ_Antlr/Linq.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// /home/richard/LINQ_Antlr/Linq.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// /home/richard/LINQ_Antlr/Linq.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// /home/richard/LINQ_Antlr/Linq.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// /home/richard/LINQ_Antlr/Linq.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// /home/richard/LINQ_Antlr/Linq.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// /home/richard/LINQ_Antlr/Linq.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// /home/richard/LINQ_Antlr/Linq.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// /home/richard/LINQ_Antlr/Linq.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// /home/richard/LINQ_Antlr/Linq.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// /home/richard/LINQ_Antlr/Linq.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// /home/richard/LINQ_Antlr/Linq.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// /home/richard/LINQ_Antlr/Linq.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// /home/richard/LINQ_Antlr/Linq.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// /home/richard/LINQ_Antlr/Linq.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// /home/richard/LINQ_Antlr/Linq.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// /home/richard/LINQ_Antlr/Linq.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// /home/richard/LINQ_Antlr/Linq.g:1:184: MA
				{
				mMA(); 

				}
				break;
			case 31 :
				// /home/richard/LINQ_Antlr/Linq.g:1:187: TD
				{
				mTD(); 

				}
				break;
			case 32 :
				// /home/richard/LINQ_Antlr/Linq.g:1:190: ID
				{
				mID(); 

				}
				break;
			case 33 :
				// /home/richard/LINQ_Antlr/Linq.g:1:193: INT
				{
				mINT(); 

				}
				break;
			case 34 :
				// /home/richard/LINQ_Antlr/Linq.g:1:197: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
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

	protected class DFA11 extends DFA {

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
		@Override
		public String getDescription() {
			return "107:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA14_eotS =
		"\10\uffff\1\46\1\50\1\52\14\41\3\uffff\7\41\1\uffff\1\103\10\uffff\1\104"+
		"\3\41\1\110\10\41\1\121\12\41\2\uffff\1\41\1\136\1\41\1\uffff\10\41\1"+
		"\uffff\13\41\1\163\1\uffff\5\41\1\171\1\172\3\41\1\176\7\41\1\171\1\41"+
		"\1\uffff\1\u0087\2\41\1\u008a\1\u008b\2\uffff\3\41\1\uffff\7\41\1\171"+
		"\1\uffff\1\u0096\1\41\2\uffff\1\41\1\171\1\u0099\1\u0087\4\41\1\u0087"+
		"\1\41\1\uffff\1\u0087\1\u009f\1\uffff\1\41\1\u0087\2\41\1\171\1\uffff"+
		"\2\41\3\u0087";
	static final String DFA14_eofS =
		"\u00a5\uffff";
	static final String DFA14_minS =
		"\1\46\7\uffff\3\75\1\157\1\154\1\151\1\146\1\164\1\150\1\162\1\141\1\145"+
		"\1\153\1\145\1\157\3\uffff\2\162\1\157\1\142\2\157\1\154\1\uffff\1\56"+
		"\10\uffff\1\60\1\163\1\162\1\156\1\60\1\151\1\141\1\151\1\145\1\164\1"+
		"\163\1\146\1\165\1\60\1\164\1\151\1\142\1\151\1\141\1\154\1\152\1\157"+
		"\1\156\1\165\2\uffff\1\145\1\60\1\141\1\uffff\2\164\1\154\1\141\2\145"+
		"\1\141\1\142\1\uffff\1\165\1\144\1\154\1\164\1\166\1\156\1\141\1\145\1"+
		"\154\1\147\1\163\1\60\1\uffff\1\154\1\143\1\151\1\145\1\153\2\60\1\165"+
		"\1\154\1\162\1\60\1\151\1\145\1\141\1\163\1\164\1\143\1\145\1\60\1\164"+
		"\1\uffff\1\60\1\150\1\143\2\60\2\uffff\1\154\1\145\1\156\1\uffff\2\143"+
		"\1\164\1\146\1\151\1\164\1\141\1\60\1\uffff\1\60\1\164\2\uffff\1\164\3"+
		"\60\1\164\2\145\1\154\1\60\1\156\1\uffff\2\60\1\uffff\1\145\1\60\1\162"+
		"\1\145\1\60\1\uffff\1\144\1\164\3\60";
	static final String DFA14_maxS =
		"\1\175\7\uffff\1\76\2\75\1\157\1\154\1\157\1\146\1\167\1\150\1\171\1\141"+
		"\1\157\1\153\1\145\1\157\3\uffff\1\165\1\162\1\157\1\142\2\157\1\154\1"+
		"\uffff\1\145\10\uffff\1\172\1\163\1\162\1\156\1\172\1\151\1\141\1\151"+
		"\1\145\1\164\1\163\1\146\1\165\1\172\1\164\1\151\1\142\1\157\1\141\1\154"+
		"\1\152\1\157\1\156\1\165\2\uffff\1\145\1\172\1\141\1\uffff\2\164\1\154"+
		"\1\141\2\145\1\141\1\142\1\uffff\1\165\1\144\1\154\1\164\1\166\1\156\1"+
		"\141\1\145\1\154\1\147\1\163\1\172\1\uffff\1\154\1\143\1\151\1\145\1\153"+
		"\2\172\1\165\1\154\1\162\1\172\1\151\1\145\1\141\1\163\1\164\1\143\1\145"+
		"\1\172\1\164\1\uffff\1\172\1\150\1\143\2\172\2\uffff\1\154\1\145\1\156"+
		"\1\uffff\2\143\1\164\1\146\1\151\1\164\1\141\1\172\1\uffff\1\172\1\164"+
		"\2\uffff\1\164\3\172\1\164\2\145\1\154\1\172\1\156\1\uffff\2\172\1\uffff"+
		"\1\145\1\172\1\162\1\145\1\172\1\uffff\1\144\1\164\3\172";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\17\uffff\1\33\1\34\1\35\7\uffff\1"+
		"\40\1\uffff\1\42\1\11\1\12\1\10\1\14\1\13\1\16\1\15\30\uffff\1\41\1\17"+
		"\3\uffff\1\22\10\uffff\1\30\14\uffff\1\21\24\uffff\1\20\5\uffff\1\37\1"+
		"\26\3\uffff\1\32\10\uffff\1\36\2\uffff\1\24\1\25\12\uffff\1\23\2\uffff"+
		"\1\31\5\uffff\1\27\5\uffff";
	static final String DFA14_specialS =
		"\u00a5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\uffff\1\5\1\43\1\uffff\12\42\1\6\1"+
			"\7\1\10\1\11\1\12\2\uffff\1\41\1\36\1\41\1\13\1\14\1\15\2\41\1\16\5\41"+
			"\1\35\1\32\2\41\1\17\1\33\1\41\1\34\1\20\3\41\4\uffff\1\41\1\uffff\1"+
			"\41\1\21\1\22\1\23\7\41\1\37\2\41\1\24\2\41\1\25\1\40\2\41\1\26\4\41"+
			"\1\27\1\30\1\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\1\45",
			"\1\47",
			"\1\51",
			"\1\53",
			"\1\54",
			"\1\56\5\uffff\1\55",
			"\1\57",
			"\1\61\2\uffff\1\60",
			"\1\62",
			"\1\63\6\uffff\1\64",
			"\1\65",
			"\1\66\11\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"",
			"\1\74\2\uffff\1\73",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\1\43\1\uffff\12\42\13\uffff\1\43\37\uffff\1\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\105",
			"\1\106",
			"\1\107",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\126\5\uffff\1\125",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\1\135",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\137",
			"",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
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
			"\1\162",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\173",
			"\1\174",
			"\1\175",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0086",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0088",
			"\1\u0089",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0097",
			"",
			"",
			"\1\u0098",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u009e",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u00a0",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u00a1",
			"\1\u00a2",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | MA | TD | ID | INT | FLOAT );";
		}
	}

}
