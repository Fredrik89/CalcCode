
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class Id extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Id clone() throws CloneNotSupportedException {
        Id node = (Id)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Id copy() {
      try {
          Id node = (Id)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Id fullCopy() {
        Id res = (Id)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 28

    public Id(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Id(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Id() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 28
    public Id(String p0) {
        setID(p0);
    }

    // Declared in Parser.ast at line 21


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Id"+ "\"" + getID() + "\"");
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
}

    // Declared in Parser.ast at line 40


  public int getNumChild() {
    return 0;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 28
    protected String tokenString_ID;

    // Declared in Parser.ast at line 3

    public void setID(String value) {
        tokenString_ID = value;
    }

    // Declared in Parser.ast at line 6

    public String getID() {
        return tokenString_ID != null ? tokenString_ID : "";
    }

}
