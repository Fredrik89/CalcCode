
package parser;
import icode.*;import util.*;import java.util.ArrayList;



public abstract class Expr extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Expr clone() throws CloneNotSupportedException {
        Expr node = (Expr)super.clone();
        return node;
    }
    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 13

    public Expr(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Expr(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Expr() {
        this(0);


    }

    // Declared in Parser.ast at line 16


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Expr");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 23


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 27


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 32


public void checkChild(Node n, int i) {
}

    // Declared in Parser.ast at line 35


  public int getNumChild() {
    return 0;
  }

}
