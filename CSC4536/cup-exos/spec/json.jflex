%%
%include Jflex.include
%include JflexCup.include

STRING = (\x22)[^(\x22)]*(\x22)
BLANC = (\x20) | \t | \n | \r | \f
DIGIT = [0-9]+
ANY   = [^]
%%

/*  string = quotation-mark *char quotation-mark
     ws =    Space, ie x20
             Horizontal tab
             Line feed or New line
             Carriage return */

"[" 	{ return TOKEN(BEGIN_ARRAY); }
"]"		{ return TOKEN(END_ARRAY); }

"{" 	{ return TOKEN(BEGIN_OBJECT); }
"}"		{ return TOKEN(END_OBJECT); }

":" 	{ return TOKEN(NAME_SEPARATOR); }
","		{ return TOKEN(VALUE_SEPARATOR); }

{BLANC}	{  } 

"false"	{ return TOKEN(FALSE); }
"null"	{ return TOKEN(NULL); }
"true"	{ return TOKEN(TRUE); }

{DIGIT}  { return TOKEN(ENTIER,Integer.parseInt(yytext())); }
{STRING} { return TOKEN(STRING,yytext()); }

ANY     { WARN("Unknown caractere : " + yytext());}
