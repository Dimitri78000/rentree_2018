%%
%include Jflex.include
%include JflexCup.include

ANY   = [^]
BLANC = [ \t\f]
NL    = \R  // == \n | \r | \r\n | [\f\v\u0085\u2028\u2029]
COMMENT1 =  "//" .*
COMMENT2 =  "/*" ( [^*] | "*"+[^*/] )* "*"* "*/"
IGNORE = {BLANC} | {COMMENT1} | {COMMENT2}
DIGIT = [0-9]
%%


{DIGIT}+     { return TOKEN(ENTIER,Integer.parseInt(yytext())); }
"+"	     { return TOKEN(PLUS); }
"("	     { return TOKEN(LP); }
")"	     { return TOKEN(RP); }
{NL}	     { return TOKEN(NL); }
{IGNORE}     {}
{ANY}	     {WARN("Unknown caractere : " + yytext()); return TOKEN(error);}
