
package icode;
import util.*;import java.util.*;


public class IntConst extends Operand implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntConst clone() throws CloneNotSupportedException {
        IntConst node = (IntConst)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntConst copy() {
      try {
          IntConst node = (IntConst)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntConst fullCopy() {
        IntConst res = (IntConst)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 112

    public String toString() {
        return ""+getValue();
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 13

    public IntConst() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 13
    public IntConst(String p0) {
        setValue(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 13
    protected String tokenString_Value;

    // Declared in icode.ast at line 3

    public void setValue(String value) {
        tokenString_Value = value;
    }

    // Declared in icode.ast at line 6

    public String getValue() {
        return tokenString_Value != null ? tokenString_Value : "";
    }

}
