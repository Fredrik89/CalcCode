
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class FuncCall extends Expr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public FuncCall clone() throws CloneNotSupportedException {
        FuncCall node = (FuncCall)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public FuncCall copy() {
      try {
          FuncCall node = (FuncCall)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public FuncCall fullCopy() {
        FuncCall res = (FuncCall)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 15

    public FuncCall(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public FuncCall(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public FuncCall() {
        this(0);

        setChild(new List(), 1);

    }

    // Declared in Parser.ast at line 18


    // Declared in Parser.ast line 15
    public FuncCall(Id p0, List<Expr> p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }

    // Declared in Parser.ast at line 23


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "FuncCall");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 30


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 34


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 39


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Id))  throw new Error("Child number 0 of FuncCall has the type " + n.getClass().getName() + " which is not an instance of Id");
  if(i == 1) {
    if(!(n instanceof List)) throw new Error("Child number 1 of FuncCall has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Expr)) throw new Error("Child number " + k + " in ArgList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Expr");
  }
}

    // Declared in Parser.ast at line 48


  public int getNumChild() {
    return 2;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 15
    public void setId(Id node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Id getId() {
        return (Id)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Id getIdNoTransform() {
        return (Id)getChildNoTransform(0);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 15
    public void setArgList(List<Expr> list) {
        setChild(list, 1);
    }

    // Declared in Parser.ast at line 6


    public int getNumArg() {
        return getArgList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Expr getArg(int i) {
        return (Expr)getArgList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addArg(Expr node) {
        List<Expr> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addArgNoTransform(Expr node) {
        List<Expr> list = getArgListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setArg(Expr node, int i) {
        List<Expr> list = getArgList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Expr> getArgs() {
        return getArgList();
    }

    // Declared in Parser.ast at line 31

    public List<Expr> getArgsNoTransform() {
        return getArgListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Expr> getArgList() {
        List<Expr> list = (List<Expr>)getChild(1);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Expr> getArgListNoTransform() {
        return (List<Expr>)getChildNoTransform(1);
    }

}
