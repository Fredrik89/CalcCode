
package icode;
import util.*;import java.util.*;


public class JmpT extends JmpCond implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public JmpT clone() throws CloneNotSupportedException {
        JmpT node = (JmpT)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public JmpT copy() {
      try {
          JmpT node = (JmpT)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public JmpT fullCopy() {
        JmpT res = (JmpT)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 92

    String opString() {return "JMPT";}

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 38

    public JmpT() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 38
    public JmpT(Operand p0, String p1) {
        setChild(p0, 0);
        setLabel(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 1;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 36
    public void setOperand(Operand node) {
        setChild(node, 0);
    }

    // Declared in icode.ast at line 5

    public Operand getOperand() {
        return (Operand)getChild(0);
    }

    // Declared in icode.ast at line 9


    public Operand getOperandNoTransform() {
        return (Operand)getChildNoTransform(0);
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 36
    public void setLabel(String value) {
        tokenString_Label = value;
    }

    // Declared in icode.ast at line 5

    public String getLabel() {
        return tokenString_Label != null ? tokenString_Label : "";
    }

}
