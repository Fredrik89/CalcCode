
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class Numeral extends Expr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Numeral clone() throws CloneNotSupportedException {
        Numeral node = (Numeral)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Numeral copy() {
      try {
          Numeral node = (Numeral)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Numeral fullCopy() {
        Numeral res = (Numeral)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 26

    public Numeral(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Numeral(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Numeral() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 26
    public Numeral(String p0) {
        setNUMERAL(p0);
    }

    // Declared in Parser.ast at line 21


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Numeral"+ "\"" + getNUMERAL() + "\"");
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
    // Declared in Parser.ast line 26
    protected String tokenString_NUMERAL;

    // Declared in Parser.ast at line 3

    public void setNUMERAL(String value) {
        tokenString_NUMERAL = value;
    }

    // Declared in Parser.ast at line 6

    public String getNUMERAL() {
        return tokenString_NUMERAL != null ? tokenString_NUMERAL : "";
    }

}
