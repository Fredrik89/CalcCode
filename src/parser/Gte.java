
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;


public class Gte extends BinExpr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Gte clone() throws CloneNotSupportedException {
        Gte node = (Gte)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Gte copy() {
      try {
          Gte node = (Gte)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Gte fullCopy() {
        Gte res = (Gte)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 23

    public Gte(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Gte(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Gte() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 23
    public Gte(Expr p0, Expr p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }

    // Declared in Parser.ast at line 22


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Gte");
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
  if(i == 0 && !(n instanceof Expr))  throw new Error("Child number 0 of BinExpr has the type " + n.getClass().getName() + " which is not an instance of Expr");
  if(i == 1 && !(n instanceof Expr))  throw new Error("Child number 1 of BinExpr has the type " + n.getClass().getName() + " which is not an instance of Expr");
}

    // Declared in Parser.ast at line 43


  public int getNumChild() {
    return 2;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 14
    public void setLeft(Expr node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Expr getLeft() {
        return (Expr)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Expr getLeftNoTransform() {
        return (Expr)getChildNoTransform(0);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 14
    public void setRight(Expr node) {
        setChild(node, 1);
    }

    // Declared in Parser.ast at line 5

    public Expr getRight() {
        return (Expr)getChild(1);
    }

    // Declared in Parser.ast at line 9


    public Expr getRightNoTransform() {
        return (Expr)getChildNoTransform(1);
    }

}
