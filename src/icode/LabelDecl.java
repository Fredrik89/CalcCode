
package icode;
import util.*;import java.util.*;


public class LabelDecl extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public LabelDecl clone() throws CloneNotSupportedException {
        LabelDecl node = (LabelDecl)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public LabelDecl copy() {
      try {
          LabelDecl node = (LabelDecl)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public LabelDecl fullCopy() {
        LabelDecl res = (LabelDecl)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 33

    public void appendBody(TabbedBuffer buffer) {
        buffer.clear();
        buffer.append(getLabel()+":");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 9

    public LabelDecl() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 9
    public LabelDecl(String p0) {
        setLabel(p0);
    }

    // Declared in icode.ast at line 14


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 9
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
