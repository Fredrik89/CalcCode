
package icode;
import util.*;import java.util.*;


public class Parameter extends Variable implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Parameter clone() throws CloneNotSupportedException {
        Parameter node = (Parameter)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Parameter copy() {
      try {
          Parameter node = (Parameter)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Parameter fullCopy() {
        Parameter res = (Parameter)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 97

    public String toString() {
        return "par("+getLevels()+","+getNumber()+")";
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 19

    public Parameter() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 19
    public Parameter(int p0, int p1) {
        setLevels(p0);
        setNumber(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 18
    public void setLevels(int value) {
        tokenint_Levels = value;
    }

    // Declared in icode.ast at line 5

    public int getLevels() {
        return tokenint_Levels;
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 18
    public void setNumber(int value) {
        tokenint_Number = value;
    }

    // Declared in icode.ast at line 5

    public int getNumber() {
        return tokenint_Number;
    }

}
