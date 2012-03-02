
package icode;
import util.*;import java.util.*;


public class Result extends Address implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Result clone() throws CloneNotSupportedException {
        Result node = (Result)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Result copy() {
      try {
          Result node = (Result)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Result fullCopy() {
        Result res = (Result)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 106

    public String toString() {
        return "result";
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 20

    public Result() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
