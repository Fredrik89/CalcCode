
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;
public class Opt<T extends ASTNode> extends ASTNode<T> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> clone() throws CloneNotSupportedException {
        Opt node = (Opt)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> copy() {
      try {
          Opt node = (Opt)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> fullCopy() {
        Opt res = (Opt)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Opt.ast at line 3
    // Declared in Opt.ast line 0

    public Opt(int i) {
        super(i);
    }

    // Declared in Opt.ast at line 6

    public Opt(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Opt.ast at line 10

    public Opt() {
        this(0);


    }

    // Declared in Opt.ast at line 16


     public Opt(T opt) {
         setChild(opt, 0);
     }

    // Declared in Opt.ast at line 20


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Opt");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Opt.ast at line 27


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Opt.ast at line 31


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Opt.ast at line 36


public void checkChild(Node n, int i) {
  if(i > 0) throw new Error("Optional nodes can only have one child");
  if(!(n instanceof ASTNode)) throw new Error("Node type must be an instance of ASTNode");
}

}
