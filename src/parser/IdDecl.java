
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class IdDecl extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdDecl clone() throws CloneNotSupportedException {
        IdDecl node = (IdDecl)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdDecl copy() {
      try {
          IdDecl node = (IdDecl)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdDecl fullCopy() {
        IdDecl res = (IdDecl)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 6

    public IdDecl(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public IdDecl(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public IdDecl() {
        this(0);

        setChild(new Opt(), 2);

    }

    // Declared in Parser.ast at line 18


    // Declared in Parser.ast line 6
    public IdDecl(Type p0, Id p1, Opt<Expr> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in Parser.ast at line 24


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "IdDecl");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 31


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 35


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 40


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Type))  throw new Error("Child number 0 of IdDecl has the type " + n.getClass().getName() + " which is not an instance of Type");
  if(i == 1 && !(n instanceof Id))  throw new Error("Child number 1 of IdDecl has the type " + n.getClass().getName() + " which is not an instance of Id");
  if(i == 2) {
    if(!(n instanceof Opt)) throw new Error("Child number 2 of IdDecl has the type " + n.getClass().getName() + " which is not an instance of Opt");
    if(((Opt)n).getNumChildNoTransform() != 0 && !(((Opt)n).getChildNoTransform(0) instanceof Expr)) throw new Error("Optional Expr has the type " + ((Opt)n).getChildNoTransform(0).getClass().getName() + " which is not an instance of Expr");
  }
}

    // Declared in Parser.ast at line 49


  public int getNumChild() {
    return 3;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 6
    public void setType(Type node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Type getType() {
        return (Type)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Type getTypeNoTransform() {
        return (Type)getChildNoTransform(0);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 6
    public void setId(Id node) {
        setChild(node, 1);
    }

    // Declared in Parser.ast at line 5

    public Id getId() {
        return (Id)getChild(1);
    }

    // Declared in Parser.ast at line 9


    public Id getIdNoTransform() {
        return (Id)getChildNoTransform(1);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 6
    public void setExprOpt(Opt<Expr> opt) {
        setChild(opt, 2);
    }

    // Declared in Parser.ast at line 6


    public boolean hasExpr() {
        return getExprOpt().getNumChild() != 0;
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Expr getExpr() {
        return (Expr)getExprOpt().getChild(0);
    }

    // Declared in Parser.ast at line 14


    public void setExpr(Expr node) {
        getExprOpt().setChild(node, 0);
    }

    // Declared in Parser.ast at line 17

     @SuppressWarnings({"unchecked", "cast"})  public Opt<Expr> getExprOpt() {
        return (Opt<Expr>)getChild(2);
    }

    // Declared in Parser.ast at line 21


     @SuppressWarnings({"unchecked", "cast"})  public Opt<Expr> getExprOptNoTransform() {
        return (Opt<Expr>)getChildNoTransform(2);
    }

}
