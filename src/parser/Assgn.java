
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class Assgn extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Assgn clone() throws CloneNotSupportedException {
        Assgn node = (Assgn)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Assgn copy() {
      try {
          Assgn node = (Assgn)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Assgn fullCopy() {
        Assgn res = (Assgn)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 8

    public Assgn(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Assgn(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Assgn() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 8
    public Assgn(IdUse p0, Expr p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }

    // Declared in Parser.ast at line 22


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Assgn");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 29


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 33


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 38


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof IdUse))  throw new Error("Child number 0 of Assgn has the type " + n.getClass().getName() + " which is not an instance of IdUse");
  if(i == 1 && !(n instanceof Expr))  throw new Error("Child number 1 of Assgn has the type " + n.getClass().getName() + " which is not an instance of Expr");
}

    // Declared in Parser.ast at line 43


  public int getNumChild() {
    return 2;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 8
    public void setIdUse(IdUse node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public IdUse getIdUse() {
        return (IdUse)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public IdUse getIdUseNoTransform() {
        return (IdUse)getChildNoTransform(0);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 8
    public void setExpr(Expr node) {
        setChild(node, 1);
    }

    // Declared in Parser.ast at line 5

    public Expr getExpr() {
        return (Expr)getChild(1);
    }

    // Declared in Parser.ast at line 9


    public Expr getExprNoTransform() {
        return (Expr)getChildNoTransform(1);
    }

}
