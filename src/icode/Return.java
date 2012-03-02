
package icode;
import util.*;import java.util.*;


public class Return extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Return clone() throws CloneNotSupportedException {
        Return node = (Return)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Return copy() {
      try {
          Return node = (Return)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Return fullCopy() {
        Return res = (Return)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 60

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("RETURN");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 7

    public Return() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
