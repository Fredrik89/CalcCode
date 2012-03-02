
package icode;
import util.*;import java.util.*;


public class Enter extends Instruction implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Enter clone() throws CloneNotSupportedException {
        Enter node = (Enter)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Enter copy() {
      try {
          Enter node = (Enter)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Enter fullCopy() {
        Enter res = (Enter)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 55

    public void appendBody(TabbedBuffer buffer) {
        buffer.append("ENTER");
        buffer.append("vars(" + getVars() + ")");
        buffer.append("temps(" + getTemps() + ")");
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 6

    public Enter() {
        super();


    }

    // Declared in icode.ast at line 10


    // Declared in icode.ast line 6
    public Enter(int p0, int p1) {
        setVars(p0);
        setTemps(p1);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 0;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 6
    protected int tokenint_Vars;

    // Declared in icode.ast at line 3

    public void setVars(int value) {
        tokenint_Vars = value;
    }

    // Declared in icode.ast at line 6

    public int getVars() {
        return tokenint_Vars;
    }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 6
    protected int tokenint_Temps;

    // Declared in icode.ast at line 3

    public void setTemps(int value) {
        tokenint_Temps = value;
    }

    // Declared in icode.ast at line 6

    public int getTemps() {
        return tokenint_Temps;
    }

}
