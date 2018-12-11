%%
%include Jflex.include
%include JflexCup.include
%%
[0-9]+  { return TOKEN(ENTIER,Integer.parseInt(yytext())); }
,       { return TOKEN(COMMA); }
;       { return TOKEN(SEMI); }
\R      { return TOKEN(NL); }
" "     { ; }
[^]     { WARN("Unknown caractere : " + yytext());  }
