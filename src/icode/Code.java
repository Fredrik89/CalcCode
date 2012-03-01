
package icode;
import util.*;import java.util.*;

public class Code extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Code clone() throws CloneNotSupportedException {
        Code node = (Code)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Code copy() {
      try {
          Code node = (Code)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Code fullCopy() {
        Code res = (Code)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in icodeToString.jadd at line 4

    private final static int[] tabs = new int[]{8, 16, 32, 48, 64};

    // Declared in icodeToString.jadd at line 5

    public String toString() {
        StringBuilder builder = new StringBuilder();
        TabbedBuffer lineBuffer = new TabbedBuffer(tabs);
        for (int i=0; i<getNumInstruction(); i++) {
            lineBuffer.clear();
            builder.append(getInstruction(i).toString(lineBuffer));
            builder.append('\n');
        }
        return builder.toString();
    }

    // Declared in icode.ast at line 3
    // Declared in icode.ast line 1

    public Code() {
        super();

        setChild(new List(), 0);

    }

    // Declared in icode.ast at line 11


    // Declared in icode.ast line 1
    public Code(List<Instruction> p0) {
        setChild(p0, 0);
    }

    // Declared in icode.ast at line 15


  protected int numChildren() {
    return 1;
  }

    // Declared in icode.ast at line 2
    // Declared in icode.ast line 1
    public void setInstructionList(List<Instruction> list) {
        setChild(list, 0);
    }

    // Declared in icode.ast at line 6


    public int getNumInstruction() {
        return getInstructionList().getNumChild();
    }

    // Declared in icode.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Instruction getInstruction(int i) {
        return (Instruction)getInstructionList().getChild(i);
    }

    // Declared in icode.ast at line 14


    public void addInstruction(Instruction node) {
        List<Instruction> list = (parent == null || state == null) ? getInstructionListNoTransform() : getInstructionList();
        list.addChild(node);
    }

    // Declared in icode.ast at line 19


    public void addInstructionNoTransform(Instruction node) {
        List<Instruction> list = getInstructionListNoTransform();
        list.addChild(node);
    }

    // Declared in icode.ast at line 24


    public void setInstruction(Instruction node, int i) {
        List<Instruction> list = getInstructionList();
        list.setChild(node, i);
    }

    // Declared in icode.ast at line 28

    public List<Instruction> getInstructions() {
        return getInstructionList();
    }

    // Declared in icode.ast at line 31

    public List<Instruction> getInstructionsNoTransform() {
        return getInstructionListNoTransform();
    }

    // Declared in icode.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Instruction> getInstructionList() {
        List<Instruction> list = (List<Instruction>)getChild(0);
        list.getNumChild();
        return list;
    }

    // Declared in icode.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Instruction> getInstructionListNoTransform() {
        return (List<Instruction>)getChildNoTransform(0);
    }

}
