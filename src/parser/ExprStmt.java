
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class ExprStmt extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public ExprStmt clone() throws CloneNotSupportedException {
        ExprStmt node = (ExprStmt)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ExprStmt copy() {
      try {
          ExprStmt node = (ExprStmt)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ExprStmt fullCopy() {
        ExprStmt res = (ExprStmt)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 9

    public ExprStmt(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public ExprStmt(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public ExprStmt() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 9
    public ExprStmt(Expr p0) {
        setChild(p0, 0);
    }

    // Declared in Parser.ast at line 21


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "ExprStmt");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 28


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 32


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 37


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Expr))  throw new Error("Child number 0 of ExprStmt has the type " + n.getClass().getName() + " which is not an instance of Expr");
}

    // Declared in Parser.ast at line 41


  public int getNumChild() {
    return 1;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 9
    public void setExpr(Expr node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Expr getExpr() {
        return (Expr)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Expr getExprNoTransform() {
        return (Expr)getChildNoTransform(0);
    }

}
