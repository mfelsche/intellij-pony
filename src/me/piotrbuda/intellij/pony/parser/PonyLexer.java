/* The following code was generated by JFlex 1.4.3 on 3/22/16 8:28 AM */

package me.piotrbuda.intellij.pony.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static me.piotrbuda.intellij.pony.psi.PonyTypes.*;
import com.intellij.psi.TokenType;
import static me.piotrbuda.intellij.pony.parser.PonyParserDefinition.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/22/16 8:28 AM from the specification file
 * <tt>/Volumes/Devel/intellij-pony/src/me/piotrbuda/intellij/pony/parser/pony.flex</tt>
 */
public class PonyLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYDOC = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\6\1\2\1\1\1\0\1\2\1\2\16\6\4\0\1\2\1\0"+
    "\1\14\1\0\1\6\1\0\1\50\1\0\1\7\1\11\3\0\1\13"+
    "\1\4\1\0\12\3\1\17\2\0\1\15\1\16\1\26\1\25\32\6"+
    "\1\10\1\0\1\12\1\0\1\5\1\0\1\34\1\42\1\35\1\45"+
    "\1\22\1\24\1\52\1\47\1\23\1\51\1\44\1\40\1\36\1\32"+
    "\1\41\1\31\1\6\1\33\1\21\1\27\1\20\1\37\1\43\1\46"+
    "\1\30\1\6\4\0\41\6\2\0\4\6\4\0\1\6\2\0\1\6"+
    "\7\0\1\6\4\0\1\6\5\0\27\6\1\0\37\6\1\0\u01ca\6"+
    "\4\0\14\6\16\0\5\6\7\0\1\6\1\0\1\6\21\0\160\6"+
    "\5\6\1\0\2\6\2\0\4\6\10\0\1\6\1\0\3\6\1\0"+
    "\1\6\1\0\24\6\1\0\123\6\1\0\213\6\1\0\5\6\2\0"+
    "\236\6\11\0\46\6\2\0\1\6\7\0\47\6\7\0\1\6\1\0"+
    "\55\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0\1\6\10\0"+
    "\33\6\5\0\3\6\15\0\5\6\6\0\1\6\4\0\13\6\5\0"+
    "\53\6\25\6\12\3\4\0\2\6\1\6\143\6\1\0\1\6\10\6"+
    "\1\0\6\6\2\6\2\6\1\0\4\6\2\6\12\3\3\6\2\0"+
    "\1\6\17\0\1\6\1\6\1\6\36\6\33\6\2\0\131\6\13\6"+
    "\1\6\16\0\12\3\41\6\11\6\2\6\4\0\1\6\5\0\26\6"+
    "\4\6\1\6\11\6\1\6\3\6\1\6\5\6\22\0\31\6\3\6"+
    "\104\0\1\6\1\0\13\6\67\0\33\6\1\0\4\6\66\6\3\6"+
    "\1\6\22\6\1\6\7\6\12\6\2\6\2\0\12\3\1\0\7\6"+
    "\1\0\7\6\1\0\3\6\1\0\10\6\2\0\2\6\2\0\26\6"+
    "\1\0\7\6\1\0\1\6\3\0\4\6\2\0\1\6\1\6\7\6"+
    "\2\0\2\6\2\0\3\6\1\6\10\0\1\6\4\0\2\6\1\0"+
    "\3\6\2\6\2\0\12\3\4\6\7\0\1\6\5\0\3\6\1\0"+
    "\6\6\4\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0"+
    "\2\6\1\0\2\6\2\0\1\6\1\0\5\6\4\0\2\6\2\0"+
    "\3\6\3\0\1\6\7\0\4\6\1\0\1\6\7\0\12\3\2\6"+
    "\3\6\1\6\13\0\3\6\1\0\11\6\1\0\3\6\1\0\26\6"+
    "\1\0\7\6\1\0\2\6\1\0\5\6\2\0\1\6\1\6\10\6"+
    "\1\0\3\6\1\0\3\6\2\0\1\6\17\0\2\6\2\6\2\0"+
    "\12\3\1\0\1\6\17\0\3\6\1\0\10\6\2\0\2\6\2\0"+
    "\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0\1\6\1\6"+
    "\7\6\2\0\2\6\2\0\3\6\10\0\2\6\4\0\2\6\1\0"+
    "\3\6\2\6\2\0\12\3\1\0\1\6\20\0\1\6\1\6\1\0"+
    "\6\6\3\0\3\6\1\0\4\6\3\0\2\6\1\0\1\6\1\0"+
    "\2\6\3\0\2\6\3\0\3\6\3\0\14\6\4\0\5\6\3\0"+
    "\3\6\1\0\4\6\2\0\1\6\6\0\1\6\16\0\12\3\11\0"+
    "\1\6\7\0\3\6\1\0\10\6\1\0\3\6\1\0\27\6\1\0"+
    "\12\6\1\0\5\6\3\0\1\6\7\6\1\0\3\6\1\0\4\6"+
    "\7\0\2\6\1\0\2\6\6\0\2\6\2\6\2\0\12\3\22\0"+
    "\2\6\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0"+
    "\5\6\2\0\1\6\1\6\7\6\1\0\3\6\1\0\4\6\7\0"+
    "\2\6\7\0\1\6\1\0\2\6\2\6\2\0\12\3\1\0\2\6"+
    "\17\0\2\6\1\0\10\6\1\0\3\6\1\0\51\6\2\0\1\6"+
    "\7\6\1\0\3\6\1\0\4\6\1\6\10\0\1\6\10\0\2\6"+
    "\2\6\2\0\12\3\12\0\6\6\2\0\2\6\1\0\22\6\3\0"+
    "\30\6\1\0\11\6\1\0\1\6\2\0\7\6\3\0\1\6\4\0"+
    "\6\6\1\0\1\6\1\0\10\6\22\0\2\6\15\0\60\6\1\6"+
    "\2\6\7\6\4\0\10\6\10\6\1\0\12\3\47\0\2\6\1\0"+
    "\1\6\2\0\2\6\1\0\1\6\2\0\1\6\6\0\4\6\1\0"+
    "\7\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0\2\6\1\0"+
    "\4\6\1\6\2\6\6\6\1\0\2\6\1\6\2\0\5\6\1\0"+
    "\1\6\1\0\6\6\2\0\12\3\2\0\4\6\40\0\1\6\27\0"+
    "\2\6\6\0\12\3\13\0\1\6\1\0\1\6\1\0\1\6\4\0"+
    "\2\6\10\6\1\0\44\6\4\0\24\6\1\0\2\6\5\6\13\6"+
    "\1\0\44\6\11\0\1\6\71\0\53\6\24\6\1\6\12\3\6\0"+
    "\6\6\4\6\4\6\3\6\1\6\3\6\2\6\7\6\3\6\4\6"+
    "\15\6\14\6\1\6\1\6\12\3\4\6\2\0\46\6\1\0\1\6"+
    "\5\0\1\6\2\0\53\6\1\0\u014d\6\1\0\4\6\2\0\7\6"+
    "\1\0\1\6\1\0\4\6\2\0\51\6\1\0\4\6\2\0\41\6"+
    "\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\17\6"+
    "\1\0\71\6\1\0\4\6\2\0\103\6\2\0\3\6\40\0\20\6"+
    "\20\0\125\6\14\0\u026c\6\2\0\21\6\1\0\32\6\5\0\113\6"+
    "\3\0\3\6\17\0\15\6\1\0\4\6\3\6\13\0\22\6\3\6"+
    "\13\0\22\6\2\6\14\0\15\6\1\0\3\6\1\0\2\6\14\0"+
    "\64\6\40\6\3\0\1\6\3\0\2\6\1\6\2\0\12\3\41\0"+
    "\3\6\2\0\12\3\6\0\130\6\10\0\51\6\1\6\1\6\5\0"+
    "\106\6\12\0\35\6\3\0\14\6\4\0\14\6\12\0\12\3\36\6"+
    "\2\0\5\6\13\0\54\6\4\0\21\6\7\6\2\6\6\0\12\3"+
    "\46\0\27\6\5\6\4\0\65\6\12\6\1\0\35\6\2\0\1\6"+
    "\12\3\6\0\12\3\15\0\1\6\130\0\5\6\57\6\21\6\7\6"+
    "\4\0\12\3\21\0\11\6\14\0\3\6\36\6\15\6\2\6\12\3"+
    "\54\6\16\6\14\0\44\6\24\6\10\0\12\3\3\0\3\6\12\3"+
    "\44\6\122\0\3\6\1\0\25\6\4\6\1\6\4\6\3\6\2\6"+
    "\11\0\300\6\47\6\25\0\4\6\u0116\6\2\0\6\6\2\0\46\6"+
    "\2\0\6\6\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6"+
    "\1\0\37\6\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6"+
    "\1\0\7\6\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6"+
    "\1\0\7\6\16\0\5\6\32\0\5\6\20\0\2\6\23\0\1\6"+
    "\13\0\5\6\5\0\6\6\1\0\1\6\15\0\1\6\20\0\15\6"+
    "\3\0\33\6\25\0\15\6\4\0\1\6\3\0\14\6\21\0\1\6"+
    "\4\0\1\6\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6"+
    "\5\0\5\6\4\0\1\6\21\0\51\6\u0a77\0\57\6\1\0\57\6"+
    "\1\0\205\6\6\0\4\6\3\6\2\6\14\0\46\6\1\0\1\6"+
    "\5\0\1\6\2\0\70\6\7\0\1\6\17\0\1\6\27\6\11\0"+
    "\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0"+
    "\7\6\1\0\7\6\1\0\7\6\1\0\40\6\57\0\1\6\u01d5\0"+
    "\3\6\31\0\11\6\6\6\1\0\5\6\2\0\5\6\4\0\126\6"+
    "\2\0\2\6\2\0\3\6\1\0\132\6\1\0\4\6\5\0\51\6"+
    "\3\0\136\6\21\0\33\6\65\0\20\6\u0200\0\u19b6\6\112\0\u51cd\6"+
    "\63\0\u048d\6\103\0\56\6\2\0\u010d\6\3\0\20\6\12\3\2\6"+
    "\24\0\57\6\1\6\4\0\12\6\1\0\31\6\7\0\1\6\120\6"+
    "\2\6\45\0\11\6\2\0\147\6\2\0\4\6\1\0\4\6\14\0"+
    "\13\6\115\0\12\6\1\6\3\6\1\6\4\6\1\6\27\6\5\6"+
    "\20\0\1\6\7\0\64\6\14\0\2\6\62\6\21\6\13\0\12\3"+
    "\6\0\22\6\6\6\3\0\1\6\4\0\12\3\34\6\10\6\2\0"+
    "\27\6\15\6\14\0\35\6\3\0\4\6\57\6\16\6\16\0\1\6"+
    "\12\3\46\0\51\6\16\6\11\0\3\6\1\6\10\6\2\6\2\0"+
    "\12\3\6\0\27\6\3\0\1\6\1\6\4\0\60\6\1\6\1\6"+
    "\3\6\2\6\2\6\5\6\2\6\1\6\1\6\1\6\30\0\3\6"+
    "\2\0\13\6\5\6\2\0\3\6\2\6\12\0\6\6\2\0\6\6"+
    "\2\0\6\6\11\0\7\6\1\0\7\6\221\0\43\6\10\6\1\0"+
    "\2\6\2\0\12\3\6\0\u2ba4\6\14\0\27\6\4\0\61\6\u2104\0"+
    "\u016e\6\2\0\152\6\46\0\7\6\14\0\5\6\5\0\1\6\1\6"+
    "\12\6\1\0\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0"+
    "\2\6\1\0\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0"+
    "\15\6\3\0\20\6\20\0\7\6\14\0\2\6\30\0\3\6\31\0"+
    "\1\6\6\0\5\6\1\0\207\6\2\0\1\6\4\0\1\6\13\0"+
    "\12\3\7\0\32\6\4\0\1\6\1\0\32\6\13\0\131\6\3\0"+
    "\6\6\2\0\6\6\2\0\6\6\2\0\3\6\3\0\2\6\3\0"+
    "\2\6\22\0\3\6\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\6\1\1\1\7"+
    "\1\10\1\11\1\12\1\13\1\3\1\14\1\15\4\1"+
    "\1\16\1\17\16\1\1\20\1\2\1\4\1\2\2\0"+
    "\1\21\1\22\5\1\1\23\1\24\1\25\13\1\1\26"+
    "\10\1\1\23\1\1\1\27\4\1\1\30\1\1\1\2"+
    "\1\31\1\21\1\32\1\33\1\1\1\34\3\1\1\35"+
    "\2\1\1\36\1\37\1\1\1\40\1\41\1\1\1\42"+
    "\2\1\1\43\1\44\1\45\10\1\1\46\1\47\1\50"+
    "\3\1\1\51\3\1\1\52\2\1\1\53\2\1\1\54"+
    "\1\1\1\55\15\1\1\56\2\1\1\57\1\60\3\1"+
    "\1\61\4\1\1\62\1\63\3\1\1\64\2\1\1\65"+
    "\1\66\1\67\1\70\3\1\1\71\1\72\4\1\1\73"+
    "\1\74\3\1\1\75\1\76\5\1\1\77\1\1\1\100"+
    "\1\1\1\101\1\1\1\102\10\1\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\126\0\327\0\126"+
    "\0\126\0\126\0\126\0\126\0\u0102\0\u012d\0\126\0\u0158"+
    "\0\u0183\0\u01ae\0\u01d9\0\126\0\126\0\u0204\0\u022f\0\u025a"+
    "\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2"+
    "\0\u03dd\0\u0408\0\u0433\0\126\0\u045e\0\u0489\0\u04b4\0\u04df"+
    "\0\u050a\0\u0535\0\126\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c"+
    "\0\u0637\0\327\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739"+
    "\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\327\0\u0866"+
    "\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993\0\327"+
    "\0\u09be\0\327\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\327\0\u0a95"+
    "\0\u0ac0\0\126\0\u050a\0\u050a\0\327\0\u0aeb\0\327\0\u0b16"+
    "\0\u0b41\0\u0b6c\0\327\0\u0b97\0\u0bc2\0\327\0\327\0\u0bed"+
    "\0\327\0\327\0\u0c18\0\327\0\u0c43\0\u0c6e\0\327\0\327"+
    "\0\327\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0d70\0\u0d9b"+
    "\0\u0dc6\0\327\0\327\0\327\0\u0df1\0\u0e1c\0\u0e47\0\327"+
    "\0\u0e72\0\u0e9d\0\u0ec8\0\u045e\0\u0ef3\0\u0f1e\0\u0f49\0\u0f74"+
    "\0\u0f9f\0\327\0\u0fca\0\327\0\u0ff5\0\u1020\0\u104b\0\u1076"+
    "\0\u10a1\0\u10cc\0\u10f7\0\u1122\0\u114d\0\u1178\0\u11a3\0\u11ce"+
    "\0\u11f9\0\327\0\u1224\0\u124f\0\327\0\327\0\u127a\0\u12a5"+
    "\0\u12d0\0\327\0\u12fb\0\u1326\0\u1351\0\u137c\0\327\0\327"+
    "\0\u13a7\0\u13d2\0\u13fd\0\327\0\u1428\0\u1453\0\327\0\327"+
    "\0\327\0\327\0\u147e\0\u14a9\0\u14d4\0\327\0\327\0\u14ff"+
    "\0\u152a\0\u1555\0\u1580\0\327\0\327\0\u15ab\0\u15d6\0\u1601"+
    "\0\327\0\327\0\u162c\0\u1657\0\u1682\0\u16ad\0\u16d8\0\327"+
    "\0\u1703\0\327\0\u172e\0\327\0\u1759\0\327\0\u1784\0\u17af"+
    "\0\u17da\0\u1805\0\u1830\0\u185b\0\u1886\0\u18b1\0\327";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\2\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\3\1\17\1\20\1\7"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\7\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\7\1\42\1\43\1\7\1\44\2\7"+
    "\1\45\1\4\1\46\11\45\1\47\36\45\54\0\2\4"+
    "\53\0\1\7\1\50\2\7\11\0\5\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\21\7\1\0\2\7\1\51\1\0\12\51\1\52"+
    "\36\51\16\0\1\53\37\0\1\7\1\0\2\7\11\0"+
    "\1\7\1\54\3\7\2\0\3\7\1\55\15\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\3\7\1\56\1\57\4\7\1\60\7\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\1\7\1\61\2\7"+
    "\1\62\2\0\3\7\1\63\12\7\1\64\2\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\1\65\4\7"+
    "\2\0\12\7\1\66\6\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\1\7\1\67\2\7"+
    "\1\70\1\71\12\7\1\72\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\4\7\1\73\14\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\74\2\7\2\0\12\7\1\75\6\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\2\7\1\76\2\7"+
    "\2\0\21\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\1\7\1\77\3\7\2\0\3\7\1\100\2\7"+
    "\1\101\12\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\11\7\1\102\1\103\6\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\5\7\1\104\13\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\5\7\1\105\13\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\2\7\1\106"+
    "\2\7\2\0\5\7\1\107\13\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\4\7\1\110"+
    "\6\7\1\111\5\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\2\7\1\112\2\7\2\0\4\7\1\113"+
    "\5\7\1\114\6\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\3\7\1\115\1\7\2\0\20\7\1\116"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\12\7\1\117\6\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\12\7\1\120\6\7"+
    "\1\0\2\7\1\45\1\0\52\45\1\4\1\46\51\45"+
    "\1\0\12\45\1\121\36\45\3\0\1\122\47\0\1\51"+
    "\1\0\12\51\1\123\37\51\1\0\12\51\1\124\36\51"+
    "\3\0\1\7\1\0\2\7\11\0\2\7\1\125\2\7"+
    "\2\0\21\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\1\126\20\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\16\7\1\127"+
    "\2\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\4\7\1\130\14\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\1\7\1\131\3\7\2\0"+
    "\21\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\3\7\1\132\6\7\1\133\6\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\1\134\20\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\2\7\1\135\2\7\2\0\21\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\5\7\2\0\3\7"+
    "\1\136\15\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\4\7\1\137\14\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\5\7\2\0\2\7"+
    "\1\140\16\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\1\7\1\141\1\7\1\142\1\7"+
    "\1\143\13\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\21\7\1\0\1\7\1\144\3\0"+
    "\1\7\1\0\2\7\11\0\2\7\1\145\2\7\2\0"+
    "\21\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\3\7\1\146\1\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\14\7\1\147"+
    "\4\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\1\150\20\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\4\7\1\151\2\0\1\152\1\7"+
    "\1\153\3\7\1\154\12\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\16\7\1\110\2\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\1\155\20\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\5\7\1\156\13\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\3\7\1\157\3\7\1\160\11\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\1\161\20\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\4\7\1\162\4\7\1\163\7\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\5\7\2\0\1\164"+
    "\20\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\7\7\1\165\11\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\21\7\1\0"+
    "\1\166\1\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\167\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\17\7\1\170\1\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\1\171\20\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\2\7\1\172\1\173\1\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\4\7\1\110\14\7\1\0\2\7\1\45\1\0"+
    "\12\45\1\174\36\45\3\0\1\7\1\0\2\7\11\0"+
    "\3\7\1\175\1\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\12\7\1\176"+
    "\6\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\2\7\1\177\2\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\1\110\20\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\200\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\3\7\1\201\15\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\202\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\3\7\1\203\1\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\3\7\1\204\15\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\7\7\1\205\11\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\1\206"+
    "\4\7\2\0\21\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\2\7\1\207\2\7\2\0\21\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\12\7\1\210\6\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\12\7\1\211\6\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\1\7\1\212"+
    "\3\7\2\0\21\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\1\7\1\213\3\7\2\0\1\214\20\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\2\7\1\215\16\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\6\7\1\216\12\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\13\7\1\217\5\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\2\7\1\220\2\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\5\7\1\221\13\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\20\7\1\222\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\4\7\1\223\14\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\11\7\1\224\7\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\11\7\1\225\7\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\4\7\1\226\14\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\3\7\1\227"+
    "\1\7\2\0\21\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\4\7\1\230\14\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\1\231\20\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\1\232\20\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\3\7\1\233\1\7\2\0"+
    "\21\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\4\7\1\234\14\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\5\7\1\235"+
    "\13\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\10\7\1\236\10\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\4\7\1\237"+
    "\14\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\1\7\1\240\3\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\1\241\4\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\3\7"+
    "\1\242\1\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\3\7\1\243\1\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\20\7\1\244\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\16\7\1\245\2\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\6\7\1\246\12\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\15\7\1\247\3\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\2\7\1\250"+
    "\2\7\2\0\21\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\2\7\1\251\2\7\2\0\21\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\4\7\1\252"+
    "\2\0\21\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\4\7\1\253\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\3\7\1\254\1\7\2\0"+
    "\21\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\1\255\20\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\3\7\1\256\15\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\1\257\20\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\2\7\1\260\2\7\2\0\21\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\7\7\1\261\11\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\3\7\1\262\15\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\11\7\1\263\7\7\1\0\2\7\3\0\1\7\1\0"+
    "\2\7\11\0\5\7\2\0\5\7\1\264\13\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\5\7\2\0"+
    "\1\265\20\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\5\7\1\266\13\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\5\7\2\0\1\267"+
    "\20\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\3\7\1\270\1\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\4\7\1\271"+
    "\14\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\2\7\1\272\2\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\1\273\4\7\2\0\21\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\274\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\6\7\1\275\12\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\5\7"+
    "\2\0\1\7\1\276\17\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\10\7\1\277\10\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\300\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\4\7\1\301\14\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\302\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\2\7\11\0\5\7\2\0\12\7\1\303\6\7"+
    "\1\0\2\7\3\0\1\7\1\0\2\7\11\0\2\7"+
    "\1\304\2\7\2\0\21\7\1\0\2\7\3\0\1\7"+
    "\1\0\1\305\1\7\11\0\5\7\2\0\21\7\1\0"+
    "\2\7\3\0\1\7\1\0\2\7\11\0\4\7\1\306"+
    "\2\0\21\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\3\7\1\307\1\7\2\0\21\7\1\0\2\7"+
    "\3\0\1\7\1\0\2\7\11\0\5\7\2\0\3\7"+
    "\1\310\15\7\1\0\2\7\3\0\1\7\1\0\2\7"+
    "\11\0\5\7\2\0\1\311\20\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\4\7\1\312"+
    "\14\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\3\7\1\313\1\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\5\7\2\0\3\7\1\314"+
    "\15\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\1\7\1\315\3\7\2\0\21\7\1\0\2\7\3\0"+
    "\1\7\1\0\2\7\11\0\3\7\1\316\1\7\2\0"+
    "\21\7\1\0\2\7\3\0\1\7\1\0\2\7\11\0"+
    "\5\7\2\0\6\7\1\317\12\7\1\0\2\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6364];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\1\1\11\2\1\1\11\1\1\5\11\2\1\1\11"+
    "\4\1\2\11\16\1\1\11\3\1\2\0\1\1\1\11"+
    "\46\1\1\11\175\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public PonyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PonyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2248) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 41: 
          { return PONY_BOX;
          }
        case 68: break;
        case 18: 
          { return BEGIN_RAWSEQ;
          }
        case 69: break;
        case 24: 
          { return PONY_DO;
          }
        case 70: break;
        case 55: 
          { return PONY_WHILE;
          }
        case 71: break;
        case 58: 
          { return PONY_REPEAT;
          }
        case 72: break;
        case 15: 
          { return PONY_QUESTION;
          }
        case 73: break;
        case 22: 
          { return PONY_AS;
          }
        case 74: break;
        case 44: 
          { return PONY_TYPE;
          }
        case 75: break;
        case 48: 
          { return PONY_ERROR;
          }
        case 76: break;
        case 53: 
          { return PONY_BREAK;
          }
        case 77: break;
        case 67: 
          { return PONY_COMPILER;
          }
        case 78: break;
        case 10: 
          { return RSQUARE;
          }
        case 79: break;
        case 30: 
          { return PONY_FUN;
          }
        case 80: break;
        case 62: 
          { return PONY_CONSUME;
          }
        case 81: break;
        case 36: 
          { return PONY_NOT;
          }
        case 82: break;
        case 46: 
          { return PONY_WITH;
          }
        case 83: break;
        case 12: 
          { return PONY_EQUALS;
          }
        case 84: break;
        case 33: 
          { return PONY_TRN;
          }
        case 85: break;
        case 29: 
          { return PONY_ISO;
          }
        case 86: break;
        case 66: 
          { return PONY_IDENTITYOF;
          }
        case 87: break;
        case 52: 
          { return PONY_MATCH;
          }
        case 88: break;
        case 7: 
          { return LPAREN_NEW;
          }
        case 89: break;
        case 2: 
          { return ML_COMMENT_CONTENT;
          }
        case 90: break;
        case 20: 
          { return PONY_IF;
          }
        case 91: break;
        case 8: 
          { return LSQUARE_NEW;
          }
        case 92: break;
        case 35: 
          { return PONY_NEW;
          }
        case 93: break;
        case 26: 
          { yybegin(YYDOC); return ML_COMMENT;
          }
        case 94: break;
        case 59: 
          { return PONY_LAMBDA;
          }
        case 95: break;
        case 45: 
          { return PONY_THEN;
          }
        case 96: break;
        case 56: 
          { return PONY_ELSEIF;
          }
        case 97: break;
        case 63: 
          { return PONY_CONTINUE;
          }
        case 98: break;
        case 43: 
          { return PONY_ELSE;
          }
        case 99: break;
        case 6: 
          { return DOTS;
          }
        case 100: break;
        case 13: 
          { return BEGIN_TYPE;
          }
        case 101: break;
        case 5: 
          { return INT;
          }
        case 102: break;
        case 57: 
          { return PONY_RETURN;
          }
        case 103: break;
        case 42: 
          { yybegin(YYINITIAL); return ML_COMMENT;
          }
        case 104: break;
        case 23: 
          { return PONY_BE;
          }
        case 105: break;
        case 27: 
          { return PONY_USE;
          }
        case 106: break;
        case 34: 
          { return PONY_TAG;
          }
        case 107: break;
        case 40: 
          { return PONY_LET;
          }
        case 108: break;
        case 11: 
          { return MINUS_NEW;
          }
        case 109: break;
        case 65: 
          { return PONY_PRIMITIVE;
          }
        case 110: break;
        case 37: 
          { return PONY_REF;
          }
        case 111: break;
        case 31: 
          { return PONY_FOR;
          }
        case 112: break;
        case 1: 
          { return ID;
          }
        case 113: break;
        case 64: 
          { return PONY_INTERFACE;
          }
        case 114: break;
        case 25: 
          { return FLOAT;
          }
        case 115: break;
        case 54: 
          { return PONY_WHERE;
          }
        case 116: break;
        case 19: 
          { return PONY_BINOP_LIT;
          }
        case 117: break;
        case 32: 
          { return PONY_TRY;
          }
        case 118: break;
        case 39: 
          { return PONY_VAL;
          }
        case 119: break;
        case 14: 
          { return PONY_AT;
          }
        case 120: break;
        case 21: 
          { return PONY_IN;
          }
        case 121: break;
        case 38: 
          { return PONY_VAR;
          }
        case 122: break;
        case 17: 
          { return STRING;
          }
        case 123: break;
        case 4: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 124: break;
        case 16: 
          { return PONY_AMPERSAND;
          }
        case 125: break;
        case 9: 
          { return RPAREN;
          }
        case 126: break;
        case 28: 
          { return PONY_END;
          }
        case 127: break;
        case 61: 
          { return PONY_RECOVER;
          }
        case 128: break;
        case 60: 
          { return PONY_OBJECT;
          }
        case 129: break;
        case 49: 
          { return PONY_TRAIT;
          }
        case 130: break;
        case 51: 
          { return PONY_CLASS;
          }
        case 131: break;
        case 3: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 132: break;
        case 47: 
          { return PONY_UNTIL;
          }
        case 133: break;
        case 50: 
          { return PONY_ACTOR;
          }
        case 134: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
