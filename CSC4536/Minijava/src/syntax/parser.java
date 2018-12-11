
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package syntax;

import AST.*;
import main.OPER;
import main.TYPE;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\003\000\002\002\004\000\002\003" +
    "\023\000\002\006\013\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\005\000\002\007\005\000" +
    "\002\007\005\000\002\007\005\000\002\007\005\000\002" +
    "\007\005\000\002\004\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\004\022\005\001\002\000\004\002\062\001" +
    "\002\000\004\036\007\001\002\000\004\002\001\001\002" +
    "\000\004\006\ufff4\001\002\000\004\006\011\001\002\000" +
    "\004\024\012\001\002\000\004\025\013\001\002\000\004" +
    "\026\014\001\002\000\004\023\015\001\002\000\004\010" +
    "\016\001\002\000\004\027\017\001\002\000\004\012\020" +
    "\001\002\000\004\013\021\001\002\000\004\036\022\001" +
    "\002\000\004\011\ufff3\001\002\000\004\011\024\001\002" +
    "\000\004\006\025\001\002\000\004\030\026\001\002\000" +
    "\004\004\032\001\002\000\004\007\030\001\002\000\004" +
    "\007\031\001\002\000\004\002\uffff\001\002\000\004\031" +
    "\033\001\002\000\004\004\034\001\002\000\004\032\035" +
    "\001\002\000\004\010\036\001\002\000\012\010\040\033" +
    "\043\034\037\035\041\001\002\000\016\011\ufffc\014\ufffc" +
    "\015\ufffc\016\ufffc\017\ufffc\020\ufffc\001\002\000\012\010" +
    "\040\033\043\034\037\035\041\001\002\000\016\011\ufffb" +
    "\014\ufffb\015\ufffb\016\ufffb\017\ufffb\020\ufffb\001\002\000" +
    "\016\011\047\014\045\015\046\016\051\017\050\020\044" +
    "\001\002\000\016\011\ufffd\014\ufffd\015\ufffd\016\ufffd\017" +
    "\ufffd\020\ufffd\001\002\000\012\010\040\033\043\034\037" +
    "\035\041\001\002\000\012\010\040\033\043\034\037\035" +
    "\041\001\002\000\012\010\040\033\043\034\037\035\041" +
    "\001\002\000\004\005\054\001\002\000\012\010\040\033" +
    "\043\034\037\035\041\001\002\000\012\010\040\033\043" +
    "\034\037\035\041\001\002\000\016\011\ufff8\014\ufff8\015" +
    "\ufff8\016\ufff8\017\ufff8\020\ufff8\001\002\000\016\011\ufff6" +
    "\014\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6\001\002\000" +
    "\004\007\ufffe\001\002\000\016\011\ufff9\014\ufff9\015\ufff9" +
    "\016\ufff9\017\ufff9\020\ufff9\001\002\000\016\011\ufffa\014" +
    "\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\001\002\000\016" +
    "\011\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7\001" +
    "\002\000\016\011\061\014\045\015\046\016\051\017\050" +
    "\020\044\001\002\000\016\011\ufff5\014\ufff5\015\ufff5\016" +
    "\ufff5\017\ufff5\020\ufff5\001\002\000\004\002\000\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\004\004\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\026\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\041\001\001\000\002\001\001" +
    "\000\004\007\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\056\001\001\000\004" +
    "\007\055\001\001\000\004\007\054\001\001\000\002\001" +
    "\001\000\004\007\052\001\001\000\004\007\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // axiome ::= klassMain 
            {
              Raxiome RESULT =null;
		Location axleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location axright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		RklassMain a = (RklassMain)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Raxiome(a, new Lklass());
                             RESULT.addPos(axleft,axright);
			     System.out.println("Hello World!"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("axiome",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= axiome EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xright;
		Raxiome start_val = (Raxiome)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // klassMain ::= CLASS idKlass LC PUBLIC STATIC VOID MAIN LP STRING LB RB idVar RP LC inst RC RC 
            {
              RklassMain RESULT =null;
		Location aaxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).xleft;
		Location aaxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).xright;
		Object aa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-16)).value;
		Location idxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-15)).xleft;
		Location idxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-15)).xright;
		RidKlass id = (RidKlass)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-15)).value;
		Location argxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).xleft;
		Location argxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).xright;
		RidVar arg = (RidVar)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		Location ixleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location ixright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pinst i = (Pinst)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location zzxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location zzxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Object zz = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new RklassMain(id, arg, i);
			     RESULT.addPos(aaxleft,zzxright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("klassMain",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // inst ::= SYSTEM DOT OUT DOT PRINTLN LP expr RP SEP 
            {
              Pinst RESULT =null;
		Location aaxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).xleft;
		Location aaxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).xright;
		Object aa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location zzxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location zzxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Object zz = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new RIprint(e);
			     RESULT.addPos(aaxleft,zzxright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inst",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= LIT_INT 
            {
              Pexpr RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REint(n); RESULT.addPos(nxleft,nxright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= TRUE 
            {
              Pexpr RESULT =null;
		Location bxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location bxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REbool(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= FALSE 
            {
              Pexpr RESULT =null;
		Location bxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location bxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REbool(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr PLUS expr 
            {
              Pexpr RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e1 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Pexpr e2 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REopBin(e1, main.OPER.PLUS, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr MINUS expr 
            {
              Pexpr RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e1 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Pexpr e2 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REopBin(e1, main.OPER.MINUS, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr TIMES expr 
            {
              Pexpr RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e1 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Pexpr e2 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REopBin(e1, main.OPER.TIMES, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr AND expr 
            {
              Pexpr RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e1 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Pexpr e2 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REopBin(e1, main.OPER.AND, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr LESS expr 
            {
              Pexpr RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).xright;
		Pexpr e1 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		Pexpr e2 = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new REopBin(e1, main.OPER.LESS, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= LP expr RP 
            {
              Pexpr RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).xright;
		Pexpr e = (Pexpr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e;	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // idKlass ::= IDENTIFIER 
            {
              RidKlass RESULT =null;
		Location idxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location idxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new RidKlass(id);
			     RESULT.addPos(idxleft,idxright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idKlass",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // idVar ::= IDENTIFIER 
            {
              RidVar RESULT =null;
		Location idxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xleft;
		Location idxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$parser$stack.peek()).xright;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new RidVar(id);  
			     RESULT.addPos(idxleft,idxright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("idVar",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}