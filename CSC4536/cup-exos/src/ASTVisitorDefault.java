/** AST Visitor with defaultVisit()= depth-first */
public class ASTVisitorDefault implements ASTVisitor {
   public void defaultVisit(ASTNode n){
       for ( ASTNode f : n.fils)  f.accept(this);
   };
	
   public void visit(AST n)    {defaultVisit(n);}
}
