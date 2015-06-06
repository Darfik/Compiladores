
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Mar 23 18:45:00 UYT 2014
//----------------------------------------------------

package com.language.parser;

import com.language.model.expression.Expression;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Mar 23 18:45:00 UYT 2014
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\002\005\000\002\002\005" +
    "\000\002\002\005\000\002\002\005\000\002\002\003\000" +
    "\002\002\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\014\010\007\012\004\013\006\014\011\015" +
    "\005\001\002\000\016\002\ufff9\004\ufff9\005\ufff9\006\ufff9" +
    "\007\ufff9\011\ufff9\001\002\000\016\002\ufffe\004\ufffe\005" +
    "\ufffe\006\ufffe\007\ufffe\011\ufffe\001\002\000\016\002\001" +
    "\004\001\005\001\006\001\007\001\011\001\001\002\000" +
    "\014\010\007\012\004\013\006\014\011\015\005\001\002" +
    "\000\014\002\016\004\012\005\013\006\015\007\014\001" +
    "\002\000\016\002\uffff\004\uffff\005\uffff\006\uffff\007\uffff" +
    "\011\uffff\001\002\000\014\010\007\012\004\013\006\014" +
    "\011\015\005\001\002\000\014\010\007\012\004\013\006" +
    "\014\011\015\005\001\002\000\014\010\007\012\004\013" +
    "\006\014\011\015\005\001\002\000\014\010\007\012\004" +
    "\013\006\014\011\015\005\001\002\000\004\002\000\001" +
    "\002\000\016\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb" +
    "\011\ufffb\001\002\000\016\002\ufffa\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\011\ufffa\001\002\000\016\002\ufffc\004\ufffc" +
    "\005\ufffc\006\015\007\014\011\ufffc\001\002\000\016\002" +
    "\ufffd\004\ufffd\005\ufffd\006\015\007\014\011\ufffd\001\002" +
    "\000\014\004\012\005\013\006\015\007\014\011\024\001" +
    "\002\000\016\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8" +
    "\011\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\004\002\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\002\022\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\002\021\001" +
    "\001\000\004\002\020\001\001\000\004\002\017\001\001" +
    "\000\004\002\016\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= LPAREN expr RPAREN 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
				RESULT = e;
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= ID 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression(i, null);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr DIV expr 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression("/", l, r);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr TIMES expr 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression("*", l, r);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr MINUS expr 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression("-", l, r);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr PLUS expr 
            {
              Expression RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression l = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression r = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression("+", l, r);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= STRING 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression(s);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= DECIMAL 
            {
              Expression RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression(d);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression start_val = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= INTEGRAL 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
				RESULT = new Expression(i);
			
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
