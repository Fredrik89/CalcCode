
package icode;
import util.*;import java.util.*;


public class Dealloc extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Dealloc clone() throws CloneNotSupportedException {
        Dealloc node = (Dealloc)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Dealloc copy() {
      try {
          Dealloc node = (Dealloc)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Dealloc fullCopy() {
        Dealloc res = (Dealloc)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 51

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("DEALLOC");
        buffer.append("size(" + getSize() + ")");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 9

    public Dealloc() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 9
    public Dealloc(int p0) {
        setSize(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 9
    protected int tokenint_Size;

    // Declared in icode.ast at line 3

    public void setSize(int value) {
        tokenint_Size = value;
    }

    // Declared in icode.ast at line 6

    public int getSize() {
        return tokenint_Size;
    }

}
