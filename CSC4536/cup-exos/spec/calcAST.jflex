%%
%include Jflex.include
%include JflexCup.include

IGNORE = [ \t\f] |  "#" .* | "\\" .*
DIGIT = [0-9]
IDENT = [:jletter:] [:jletterdigit:]*
%%
{DIGIT}+  { return TOKEN(ENTIER,Integer.parseInt(yytext())); }
"+"       { return TOKEN(PLUS); }
"-"       { return TOKEN(MOINS); }
"*"       { return TOKEN(MULT); }
"/"       { return TOKEN(DIV); }
"%"       { return TOKEN(MOD); }
"("       { return TOKEN(LPAR); }
")"       { return TOKEN(RPAR); }
","       { return TOKEN(COMMA); }
"min"     { return TOKEN(FMIN); }
"max"     { return TOKEN(FMAX); }
"clean"   |
"clear"   { return TOKEN(CLEAN); }
"="       { return TOKEN(AFFECT); }
{IDENT}   { return TOKEN(VAR, yytext()); }
\R        { return TOKEN(NL); }
{IGNORE}  {}
[^]       { WARN("Unknown caractere : " + yytext()); return TOKEN(error); }
