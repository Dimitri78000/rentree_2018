LIB = ./lib
SRC = ./src
BIN = ./bin
CUPOPT =  # -locations
PKG =
MAIN = CupMain
MAINDEBUG = CupMainDebug
JARFILE=Run.jar
DST = ${SRC}/${PKG}
ARGS =

JAVA = java
JAVAC = javac -g
JFLEX = $(JAVA) -jar $(LIB)/jflex.jar -d ${DST} -nobak 
CUP   = $(JAVA) -jar $(LIB)/java-cup.jar -destdir ${DST} ${CUPOPT}
LIBRUNTIME=$(LIB)/java-cup-runtime.jar
CP =  $(BIN):$(LIBRUNTIME)
GEN = ${DST}/Yylex.java  ${DST}/parser.java  ${DST}/sym.java ${JARFILE}

usage : 
	@echo -e "USAGE : \n\
 make XX :  XX.flex + XX.cup -> Yylex.java, sym.java, parser.java, *.class \n\
 make run, make rundebug, make compile, \n\
 make runjar, make jar \n\
 make clean "

% :: %.jflex %.cup
	@echo "Analyseur syntaxique : $*.flex + $*.cup ==> ${GEN} $(BIN)/*.class"
	$(JFLEX) $*.jflex
	$(CUP)   $*.cup
	@mkdir -p $(BIN)
	$(JAVAC) -cp $(CP) -d $(BIN)  $(SRC)/*.java
	@echo "run with : java -cp $(CP) CupMain" 

compile :
	@mkdir -p $(BIN)
	$(JAVAC) -cp $(CP) -d $(BIN)  $(SRC)/*.java

run :  compile
	$(JAVA) -cp $(CP)  ${MAIN} ${ARGS}

rundebug :  compile
	$(JAVA) -cp $(CP)  ${MAINDEBUG} ${ARGS}

jar ${JARFILE} : compile
	-/bin/rm -f ${JARFILE}
	-/bin/cp ${LIBRUNTIME} ${JARFILE}
	jar ufe ${JARFILE} ${MAIN} -C ${BIN} .

runjar : ${JARFILE}
	${JAVA} -jar ${JARFILE} ${ARGS}

clean :
	-/bin/rm -fr $(BIN)
	-rm -f ${GEN}
	-rm -f *~ */*~ *.class Yylex.java
