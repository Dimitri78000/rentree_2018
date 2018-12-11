import java.util.HashMap;
/* Table de Symbole rudimentaire */
public class SymbolTable { 
    private HashMap<String, Integer> table;

    SymbolTable() { table =  new HashMap<String, Integer>();  }

    Integer get(String name){
        Integer val = table.get(name);
        if (val==null) { /* name absenr !?! */ }
        return val;	
    }
    void put(String name, Integer val ) { table.put(name, val); }
    void clean(String name)             { table.remove(name); }
    void clean()                        { table.clear(); }
}
