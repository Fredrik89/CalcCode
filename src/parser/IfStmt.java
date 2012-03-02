
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;


public class IfStmt extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public IfStmt clone() throws CloneNotSupportedException {
        IfStmt node = (IfStmt)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IfStmt copy() {
      try {
          IfStmt node = (IfStmt)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IfStmt fullCopy() {
        IfStmt res = (IfStmt)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 10

    public IfStmt(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public IfStmt(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public IfStmt() {
        this(0);

        setChild(new List(), 1);
        setChild(new List(), 2);

    }

    // Declared in Parser.ast at line 19


    // Declared in Parser.ast line 10
    public IfStmt(Expr p0, List<Stmt> p1, List<Stmt> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in Parser.ast at line 25


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "IfStmt");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 32


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 36


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 41


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Expr))  throw new Error("Child number 0 of IfStmt has the type " + n.getClass().getName() + " which is not an instance of Expr");
  if(i == 1) {
    if(!(n instanceof List)) throw new Error("Child number 1 of IfStmt has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Stmt)) throw new Error("Child number " + k + " in IfPartList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Stmt");
  }
  if(i == 2) {
    if(!(n instanceof List)) throw new Error("Child number 2 of IfStmt has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Stmt)) throw new Error("Child number " + k + " in ElsePartList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Stmt");
  }
}

    // Declared in Parser.ast at line 55


  public int getNumChild() {
    return 3;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 10
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

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 10
    public void setIfPartList(List<Stmt> list) {
        setChild(list, 1);
    }

    // Declared in Parser.ast at line 6


    public int getNumIfPart() {
        return getIfPartList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Stmt getIfPart(int i) {
        return (Stmt)getIfPartList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addIfPart(Stmt node) {
        List<Stmt> list = (parent == null || state == null) ? getIfPartListNoTransform() : getIfPartList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addIfPartNoTransform(Stmt node) {
        List<Stmt> list = getIfPartListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setIfPart(Stmt node, int i) {
        List<Stmt> list = getIfPartList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Stmt> getIfParts() {
        return getIfPartList();
    }

    // Declared in Parser.ast at line 31

    public List<Stmt> getIfPartsNoTransform() {
        return getIfPartListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getIfPartList() {
        List<Stmt> list = (List<Stmt>)getChild(1);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getIfPartListNoTransform() {
        return (List<Stmt>)getChildNoTransform(1);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 10
    public void setElsePartList(List<Stmt> list) {
        setChild(list, 2);
    }

    // Declared in Parser.ast at line 6


    public int getNumElsePart() {
        return getElsePartList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Stmt getElsePart(int i) {
        return (Stmt)getElsePartList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addElsePart(Stmt node) {
        List<Stmt> list = (parent == null || state == null) ? getElsePartListNoTransform() : getElsePartList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addElsePartNoTransform(Stmt node) {
        List<Stmt> list = getElsePartListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setElsePart(Stmt node, int i) {
        List<Stmt> list = getElsePartList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Stmt> getElseParts() {
        return getElsePartList();
    }

    // Declared in Parser.ast at line 31

    public List<Stmt> getElsePartsNoTransform() {
        return getElsePartListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getElsePartList() {
        List<Stmt> list = (List<Stmt>)getChild(2);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getElsePartListNoTransform() {
        return (List<Stmt>)getChildNoTransform(2);
    }

}
