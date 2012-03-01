
package icode;
import util.*;import java.util.*;


public class Returned extends Address implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Returned clone() throws CloneNotSupportedException {
        Returned node = (Returned)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Returned copy() {
      try {
          Returned node = (Returned)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Returned fullCopy() {
        Returned res = (Returned)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 109

    public String toString() {
        return "returned";
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 18

    public Returned() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
