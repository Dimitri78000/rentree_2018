%%
%include Jflex.include
%include JflexCup.include
BLANC = [ \t\f\n\r]
IGNORE = {BLANC}

NUMBER = -?(0|[1-9][0-9]*)(\.[0-9]+)?([eE][-+]?[0-9]+)?
CHAR = [^\\\"]*|\\[\"\\\/bfnrt]|u([0-9a-fA-F]){4}
STRING = \"CHAR*\"

BEGIN_ARRAY = \[
END_ARRAY = \]
BEGIN_OBJECT = \{
END_OBJECT = \}
DECIMAL = \.
NAME_SEP = :
VALUE_SEP = ,
FALSE = false
TRUE = true
NULL = null
ZERO = 0


%%
{FALSE}			{return TOKEN(FALSE); }
{TRUE}			{return TOKEN(TRUE); }
{NULL}			{return TOKEN(NULL); }
{ZERO}			{return TOKEN(ZERO); }
{BEGIN_ARRAY}	{return TOKEN(BEGIN_ARRAY); }	
{END_ARRAY}		{return TOKEN(END_ARRAY); }
{BEGIN_OBJECT}	{return TOKEN(BEGIN_OBJECT); }
{END_OBJECT}	{return TOKEN(END_OBJECT); }
{DECIMAL}		{return TOKEN(DECIMAL); }
{NAME_SEP}		{return TOKEN(NAME_SEP); }
{VALUE_SEP}		{return TOKEN(VALUE_SEP); }

{NUMBER}		{ return TOKEN(NUMBER); }
\" 		  		{ return TOKEN(QUOTATION_MARK); }
{STRING}  		{ return TOKEN(STRING); }
{IGNORE}     	{}
[^]	     		{ WARN("Unknown caractere : " + yytext()); return TOKEN(error);}