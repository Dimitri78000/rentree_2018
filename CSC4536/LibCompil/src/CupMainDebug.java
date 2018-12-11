/* varsion main() avec flag  pour debuging lexicale / syntaxique */
public class  CupMainDebug {
    static boolean DEBUGTOKEN=true; // trace les tokens lus
    static boolean DEBUGPARSE=false; // trace detail de l'analyse LR

    public static void main(String[] args) throws Exception { 
	if (args.length == 0) 	analyse("stdin");
	for(String file : args) { analyse(file); }
    }

    private static void analyse(String file){
	Object axiome=new CupMain(file, DEBUGTOKEN, DEBUGPARSE).axiomeValue;
	System.err.println("Valeur Axiome = "+axiome);
    }

}
