
package icode;
import util.*;import java.util.*;


public abstract class Address extends Operand implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Address clone() throws CloneNotSupportedException {
        Address node = (Address)super.clone();
        return node;
    }
    // Declared in icode.ast at line 3
    // Declared in icode.ast line 12

    public Address() {
        super();


    }

    // Declared in icode.ast at line 9


  protected int numChildren() {
    return 0;
  }

}
