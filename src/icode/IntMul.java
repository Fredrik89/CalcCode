
package icode;
import util.*;import java.util.*;


public class IntMul extends IntOpr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntMul clone() throws CloneNotSupportedException {
        IntMul node = (IntMul)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntMul copy() {
      try {
          IntMul node = (IntMul)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IntMul fullCopy() {
        IntMul res = (IntMul)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 83

    String opString() {return "INTMUL";}

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 25

    public IntMul() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 25
    public IntMul(Operand p0, Operand p1, Address p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in icode.ast at line 16


  protected int numChildren() {
    return 3;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 20
    public void setOperand1(Operand node) {
        setChild(node, 0);
    }

    // Declared in icode.ast at line 5

    public Operand getOperand1() {
        return (Operand)getChild(0);
    }

    // Declared in icode.ast at line 9


    public Operand getOperand1NoTransform() {
        return (Operand)getChildNoTransform(0);
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 20
    public void setOperand2(Operand node) {
        setChild(node, 1);
    }

    // Declared in icode.ast at line 5

    public Operand getOperand2() {
        return (Operand)getChild(1);
    }

    // Declared in icode.ast at line 9


    public Operand getOperand2NoTransform() {
        return (Operand)getChildNoTransform(1);
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 20
    public void setAddress(Address node) {
        setChild(node, 2);
    }

    // Declared in icode.ast at line 5

    public Address getAddress() {
        return (Address)getChild(2);
    }

    // Declared in icode.ast at line 9


    public Address getAddressNoTransform() {
        return (Address)getChildNoTransform(2);
    }

}
