
package icode;
import util.*;import java.util.*;



public class Jmp extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Jmp clone() throws CloneNotSupportedException {
        Jmp node = (Jmp)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Jmp copy() {
      try {
          Jmp node = (Jmp)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Jmp fullCopy() {
        Jmp res = (Jmp)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 69

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("JMP");
        buffer.append(getLabel());
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 38

    public Jmp() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 38
    public Jmp(String p0) {
        setLabel(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 38
    protected String tokenString_Label;

    // Declared in icode.ast at line 3

    public void setLabel(String value) {
        tokenString_Label = value;
    }

    // Declared in icode.ast at line 6

    public String getLabel() {
        return tokenString_Label != null ? tokenString_Label : "";
    }

}
