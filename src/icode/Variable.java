
package icode;
import util.*;import java.util.*;


public class Variable extends Address implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Variable clone() throws CloneNotSupportedException {
        Variable node = (Variable)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Variable copy() {
      try {
          Variable node = (Variable)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Variable fullCopy() {
        Variable res = (Variable)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 94


    public String toString() {
        return "var("+getLevels()+","+getNumber()+")";
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 18

    public Variable() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 18
    public Variable(int p0, int p1) {
        setLevels(p0);
        setNumber(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 18
    protected int tokenint_Levels;

    // Declared in icode.ast at line 3

    public void setLevels(int value) {
        tokenint_Levels = value;
    }

    // Declared in icode.ast at line 6

    public int getLevels() {
        return tokenint_Levels;
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 18
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
