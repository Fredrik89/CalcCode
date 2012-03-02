
package icode;
import util.*;import java.util.*;


public abstract class JmpCond extends Jmp implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public JmpCond clone() throws CloneNotSupportedException {
        JmpCond node = (JmpCond)super.clone();
        return node;
    }
    // Declared in icodeToString.jadd at line 73

    abstract String opString();

    // Declared in icodeToString.jadd at line 75


    public void appendBody(TabbedBuffer buffer) {
        buffer.append(opString());
        buffer.append(getOperand());
        buffer.append(getLabel());
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 39

    public JmpCond() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 39
    public JmpCond(Operand p0, String p1) {
        setChild(p0, 0);
        setLabel(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 1;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 39
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
    // Declared in icode.ast line 39
    public void setLabel(String value) {
        tokenString_Label = value;
    }

    // Declared in icode.ast at line 5

    public String getLabel() {
        return tokenString_Label != null ? tokenString_Label : "";
    }

}
