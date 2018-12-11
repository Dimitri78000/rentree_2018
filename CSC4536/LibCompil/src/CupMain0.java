/* main minimal pour CUP+jflex */
// ne fonctionne pas avec option -locations de CUP 
public class CupMain0 {
 @SuppressWarnings("deprecation")
 public static void main(String[] args) throws Exception {
     if (args.length != 0) System.setIn(new java.io.FileInputStream(args[0]));
     new parser( new Yylex(new java.io.InputStreamReader(System.in))).parse();
    }
}
