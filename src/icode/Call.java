
package icode;
import util.*;import java.util.*;


public class Call extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Call clone() throws CloneNotSupportedException {
        Call node = (Call)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Call copy() {
      try {
          Call node = (Call)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Call fullCopy() {
        Call res = (Call)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 42

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("CALL");
        buffer.append(getLabel());
        buffer.append("levels(" + getLevels() + ")");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 4

    public Call() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 4
    public Call(String p0, int p1) {
        setLabel(p0);
        setLevels(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 4
    protected String tokenString_Label;

    // Declared in icode.ast at line 3

    public void setLabel(String value) {
        tokenString_Label = value;
    }

    // Declared in icode.ast at line 6

    public String getLabel() {
        return tokenString_Label != null ? tokenString_Label : "";
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 4
    protected int tokenint_Levels;

    // Declared in icode.ast at line 3

    public void setLevels(int value) {
        tokenint_Levels = value;
    }

    // Declared in icode.ast at line 6

    public int getLevels() {
        return tokenint_Levels;
    }

}
