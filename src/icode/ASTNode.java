
package icode;
import util.*;import java.util.*;

// Generated with JastAdd II (http://jastadd.cs.lth.se) version R20090610

public class ASTNode<T extends ASTNode> implements Cloneable, Iterable<T> {
    public void flushCache() {
    }
    public void flushCollectionCache() {
    }
     @SuppressWarnings({"unchecked", "cast"})  public ASTNode<T> clone() throws CloneNotSupportedException {
        ASTNode node = (ASTNode)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ASTNode<T> copy() {
      try {
          ASTNode node = (ASTNode)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ASTNode<T> fullCopy() {
        ASTNode res = (ASTNode)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in ASTNode.ast at line 3
    // Declared in ASTNode.ast line 0

    public ASTNode() {
        super();


    }

    // Declared in ASTNode.ast at line 9


   public static final boolean generatedWithCircularEnabled = true;

    // Declared in ASTNode.ast at line 10

   public static final boolean generatedWithCacheCycle = true;

    // Declared in ASTNode.ast at line 11

   public static final boolean generatedWithComponentCheck = false;

    // Declared in ASTNode.ast at line 12

   protected static ASTNode$State state = new ASTNode$State();

    // Declared in ASTNode.ast at line 13

   public final ASTNode$State state() { return state; }

    // Declared in ASTNode.ast at line 14

  @SuppressWarnings("cast") public T getChild(int i) {
    return (T)getChildNoTransform(i);
  }

    // Declared in ASTNode.ast at line 17

  private int childIndex;

    // Declared in ASTNode.ast at line 18

  public int getIndexOfChild(ASTNode node) {
    if(node != null && node.childIndex < getNumChildNoTransform() && node == getChildNoTransform(node.childIndex))
      return node.childIndex;
    for(int i = 0; i < getNumChildNoTransform(); i++)
      if(getChildNoTransform(i) == node) {
        node.childIndex = i;
        return i;
      }
    return -1;
  }

    // Declared in ASTNode.ast at line 29


  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }

    // Declared in ASTNode.ast at line 32

  @SuppressWarnings("cast") public final T getChildNoTransform(int i) {
    return (T)children[i];
  }

    // Declared in ASTNode.ast at line 35

  protected int numChildren;

    // Declared in ASTNode.ast at line 36

  protected int numChildren() {
    return numChildren;
  }

    // Declared in ASTNode.ast at line 39

  public int getNumChild() {
    return numChildren();
  }

    // Declared in ASTNode.ast at line 42

  public final int getNumChildNoTransform() {
    return numChildren();
  }

    // Declared in ASTNode.ast at line 45

  public void setChild(T node, int i) {
    if(children == null) {
      children = new ASTNode[i + 1];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if(i >= numChildren) numChildren = i+1;
    if(node != null) { node.setParent(this); node.childIndex = i; }
  }

    // Declared in ASTNode.ast at line 57

  public void insertChild(T node, int i) {
    if(children == null) {
      children = new ASTNode[i + 1];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if(i < children.length)
        System.arraycopy(children, i, c, i+1, children.length-i);
      children = c;
    }
    numChildren++;
    if(node != null) { node.setParent(this); node.childIndex = i; }
  }

    // Declared in ASTNode.ast at line 72

  public void removeChild(int i) {
    if(children != null) {
      ASTNode child = (ASTNode)children[i];
      if(child != null) {
        child.setParent(null);
        child.childIndex = -1;
      }
      System.arraycopy(children, i+1, children, i, children.length-i-1);
      numChildren--;
    }
  }

    // Declared in ASTNode.ast at line 83

  public ASTNode getParent() {
    return (ASTNode)parent;
  }

    // Declared in ASTNode.ast at line 86

  public void setParent(ASTNode node) {
    parent = node;
  }

    // Declared in ASTNode.ast at line 89

  protected ASTNode parent;

    // Declared in ASTNode.ast at line 90

  protected ASTNode[] children;

    // Declared in ASTNode.ast at line 97

    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private int counter = 0;
            public boolean hasNext() {
                return counter < getNumChild();
            }
            @SuppressWarnings("unchecked") public T next() {
                if(hasNext())
                    return (T)getChild(counter++);
                else
                    return null;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

}
