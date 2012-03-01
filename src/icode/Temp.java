
package icode;
import util.*;import java.util.*;


public class Temp extends Address implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Temp clone() throws CloneNotSupportedException {
        Temp node = (Temp)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Temp copy() {
      try {
          Temp node = (Temp)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Temp fullCopy() {
        Temp res = (Temp)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 103

    public String toString() {
        return "#"+getNumber();
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 13

    public Temp() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 13
    public Temp(int p0) {
        setNumber(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 13
    protected int tokenint_Number;

    // Declared in icode.ast at line 3

    public void setNumber(int value) {
        tokenint_Number = value;
    }

    // Declared in icode.ast at line 6

    public int getNumber() {
        return tokenint_Number;
    }

}
