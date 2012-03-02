
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;
public class List<T extends ASTNode> extends ASTNode<T> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public List<T> clone() throws CloneNotSupportedException {
        List node = (List)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public List<T> copy() {
      try {
          List node = (List)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public List<T> fullCopy() {
        List res = (List)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in List.ast at line 3
    // Declared in List.ast line 0

    public List(int i) {
        super(i);
    }

    // Declared in List.ast at line 6

    public List(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in List.ast at line 10

    public List() {
        this(0);


    }

    // Declared in List.ast at line 16


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "List");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in List.ast at line 23


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in List.ast at line 27


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in List.ast at line 32


public void checkChild(Node n, int i) {
  if(!(n instanceof ASTNode)) throw new Error("The node type of child " + i + " must be an instance of ASTNode");
}

    // Declared in List.ast at line 36


     public List<T> add(T node) {
          addChild(node);
          return this;
     }

    // Declared in List.ast at line 41


     public void insertChild(T node, int i) {
          list$touched = true;
          super.insertChild(node, i);
     }

    // Declared in List.ast at line 45

     public void addChild(T node) {
          list$touched = true;
          super.addChild(node);
     }

    // Declared in List.ast at line 49

     public void removeChild(int i) {
          list$touched = true;
          super.removeChild(i);
     }

    // Declared in List.ast at line 53

     public int getNumChild() {
          if(list$touched) {
              for(int i = 0; i < getNumChildNoTransform(); i++)
                  getChild(i);
              list$touched = false;
          }
          return getNumChildNoTransform();
     }

    // Declared in List.ast at line 61

     private boolean list$touched = true;

}
