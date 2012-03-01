
package icode;
import util.*;import java.util.*;
public class Opt<T extends ASTNode> extends ASTNode<T> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> clone() throws CloneNotSupportedException {
        Opt node = (Opt)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> copy() {
      try {
          Opt node = (Opt)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Opt<T> fullCopy() {
        Opt res = (Opt)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Opt.ast at line 3
    // Declared in Opt.ast line 0

    public Opt() {
        super();


    }

    // Declared in Opt.ast at line 9


     public Opt(T opt) {
         setChild(opt, 0);
     }

}
