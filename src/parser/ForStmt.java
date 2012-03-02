
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;


public class ForStmt extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public ForStmt clone() throws CloneNotSupportedException {
        ForStmt node = (ForStmt)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ForStmt copy() {
      try {
          ForStmt node = (ForStmt)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ForStmt fullCopy() {
        ForStmt res = (ForStmt)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 11

    public ForStmt(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public ForStmt(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public ForStmt() {
        this(0);

        setChild(new List(), 2);

    }

    // Declared in Parser.ast at line 18


    // Declared in Parser.ast line 11
    public ForStmt(Stmt p0, Expr p1, List<Stmt> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in Parser.ast at line 24


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "ForStmt");
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
  if(i == 0 && !(n instanceof Stmt))  throw new Error("Child number 0 of ForStmt has the type " + n.getClass().getName() + " which is not an instance of Stmt");
  if(i == 1 && !(n instanceof Expr))  throw new Error("Child number 1 of ForStmt has the type " + n.getClass().getName() + " which is not an instance of Expr");
  if(i == 2) {
    if(!(n instanceof List)) throw new Error("Child number 2 of ForStmt has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Stmt)) throw new Error("Child number " + k + " in BodyList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Stmt");
  }
}

    // Declared in Parser.ast at line 50


  public int getNumChild() {
    return 3;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 11
    public void setInit(Stmt node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Stmt getInit() {
        return (Stmt)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Stmt getInitNoTransform() {
        return (Stmt)getChildNoTransform(0);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 11
    public void setCheck(Expr node) {
        setChild(node, 1);
    }

    // Declared in Parser.ast at line 5

    public Expr getCheck() {
        return (Expr)getChild(1);
    }

    // Declared in Parser.ast at line 9


    public Expr getCheckNoTransform() {
        return (Expr)getChildNoTransform(1);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 11
    public void setBodyList(List<Stmt> list) {
        setChild(list, 2);
    }

    // Declared in Parser.ast at line 6


    public int getNumBody() {
        return getBodyList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Stmt getBody(int i) {
        return (Stmt)getBodyList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addBody(Stmt node) {
        List<Stmt> list = (parent == null || state == null) ? getBodyListNoTransform() : getBodyList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addBodyNoTransform(Stmt node) {
        List<Stmt> list = getBodyListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setBody(Stmt node, int i) {
        List<Stmt> list = getBodyList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Stmt> getBodys() {
        return getBodyList();
    }

    // Declared in Parser.ast at line 31

    public List<Stmt> getBodysNoTransform() {
        return getBodyListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getBodyList() {
        List<Stmt> list = (List<Stmt>)getChild(2);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getBodyListNoTransform() {
        return (List<Stmt>)getChildNoTransform(2);
    }

}
