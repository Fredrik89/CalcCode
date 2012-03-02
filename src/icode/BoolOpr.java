
package icode;
import util.*;import java.util.*;


public abstract class BoolOpr extends BinOpr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public BoolOpr clone() throws CloneNotSupportedException {
        BoolOpr node = (BoolOpr)super.clone();
        return node;
    }
    // Declared in icode.ast at line 3
    // Declared in icode.ast line 30

    public BoolOpr() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 30
    public BoolOpr(Operand p0, Operand p1, Address p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in icode.ast at line 16


  protected int numChildren() {
    return 3;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 23
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
    // Declared in icode.ast line 23
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
    // Declared in icode.ast line 23
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
