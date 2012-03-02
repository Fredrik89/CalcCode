
package icode;
import util.*;import java.util.*;



public abstract class Instruction extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Instruction clone() throws CloneNotSupportedException {
        Instruction node = (Instruction)super.clone();
        return node;
    }
    // Declared in icodeToString.jadd at line 16


    String comment = "";

    // Declared in icodeToString.jadd at line 17

    static final int commentTab = 5;

    // Declared in icodeToString.jadd at line 18

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Declared in icodeToString.jadd at line 22

    abstract void appendBody(TabbedBuffer buffer);

    // Declared in icodeToString.jadd at line 23

    public String toString(TabbedBuffer buffer) {
        buffer.tabTo(1);
        appendBody(buffer);
        buffer.tabTo(commentTab);
        if (!comment.equals("")) {
          buffer.append("// ");
          buffer.append(comment);
        }
        return buffer.toString();
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 3

    public Instruction() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
