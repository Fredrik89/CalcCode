
package icode;
import util.*;import java.util.*;


public class Alloc extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Alloc clone() throws CloneNotSupportedException {
        Alloc node = (Alloc)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Alloc copy() {
      try {
          Alloc node = (Alloc)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Alloc fullCopy() {
        Alloc res = (Alloc)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 47

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("ALLOC");
        buffer.append("size(" + getSize() + ")");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 7

    public Alloc() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 7
    public Alloc(int p0) {
        setSize(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 7
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
