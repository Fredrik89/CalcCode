
package icode;
import util.*;import java.util.*;



public abstract class Operand extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Operand clone() throws CloneNotSupportedException {
        Operand node = (Operand)super.clone();
        return node;
    }
    // Declared in icode.ast at line 3
    // Declared in icode.ast line 12

    public Operand() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
