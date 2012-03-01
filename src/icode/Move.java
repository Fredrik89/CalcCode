
package icode;
import util.*;import java.util.*;


public class Move extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Move clone() throws CloneNotSupportedException {
        Move node = (Move)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Move copy() {
      try {
          Move node = (Move)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Move fullCopy() {
        Move res = (Move)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 37

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("MOV");
        buffer.append(getOperand());
        buffer.append(getAddress());
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 3

    public Move() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 3
    public Move(Operand p0, Address p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 2;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 3
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
    // Declared in icode.ast line 3
    public void setAddress(Address node) {
        setChild(node, 1);
    }

    // Declared in icode.ast at line 5

    public Address getAddress() {
        return (Address)getChild(1);
    }

    // Declared in icode.ast at line 9


    public Address getAddressNoTransform() {
        return (Address)getChildNoTransform(1);
    }

}
