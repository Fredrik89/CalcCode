
package parser;
import icode.*;import util.*;import java.util.ArrayList;

// Generated with JastAdd II (http://jastadd.cs.lth.se) version R20090610

public class ASTNode<T extends ASTNode> extends SimpleNode  implements Cloneable, Iterable<T> {
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
    // Declared in SourceLine.jadd at line 3


  protected Token first;

    // Declared in SourceLine.jadd at line 4

  protected Token last;

    // Declared in SourceLine.jadd at line 6

  
  public String startLineCol() {
    return "(Line:" + first.beginLine + " Col:" + first.beginColumn + ")";
  }

    // Declared in SourceLine.jadd at line 9

  public String endLineCol() {
    return "(Line:" + last.endLine + " Col:" + last.endColumn + ")";
  }

    // Declared in ASTNode.ast at line 3
    // Declared in ASTNode.ast line 0

    public ASTNode(int i) {
        super(i);
    }

    // Declared in ASTNode.ast at line 6

    public ASTNode(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in ASTNode.ast at line 10

    public ASTNode() {
        this(0);


    }

    // Declared in ASTNode.ast at line 16


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "ASTNode");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in ASTNode.ast at line 23


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in ASTNode.ast at line 27


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  if(i >= numChildren) numChildren = i+1;
  super.jjtAddChild(n, i);
}

    // Declared in ASTNode.ast at line 33


public void checkChild(Node n, int i) {
}

    // Declared in ASTNode.ast at line 36


   public static final boolean generatedWithCircularEnabled = true;

    // Declared in ASTNode.ast at line 37

   public static final boolean generatedWithCacheCycle = true;

    // Declared in ASTNode.ast at line 38

   public static final boolean generatedWithComponentCheck = false;

    // Declared in ASTNode.ast at line 39

   protected static ASTNode$State state = new ASTNode$State();

    // Declared in ASTNode.ast at line 40

   public final ASTNode$State state() { return state; }

    // Declared in ASTNode.ast at line 41

  @SuppressWarnings("cast") public T getChild(int i) {
    return (T)getChildNoTransform(i);
  }

    // Declared in ASTNode.ast at line 44

  private int childIndex;

    // Declared in ASTNode.ast at line 45

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

    // Declared in ASTNode.ast at line 56


  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }

    // Declared in ASTNode.ast at line 59

  @SuppressWarnings("cast") public final T getChildNoTransform(int i) {
    return (T)children[i];
  }

    // Declared in ASTNode.ast at line 62

  protected int numChildren;

    // Declared in ASTNode.ast at line 63

  protected int numChildren() {
    return numChildren;
  }

    // Declared in ASTNode.ast at line 66

  public int getNumChild() {
    return numChildren();
  }

    // Declared in ASTNode.ast at line 69

  public final int getNumChildNoTransform() {
    return numChildren();
  }

    // Declared in ASTNode.ast at line 72

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

    // Declared in ASTNode.ast at line 84

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

    // Declared in ASTNode.ast at line 99

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

    // Declared in ASTNode.ast at line 110

  public ASTNode getParent() {
    return (ASTNode)parent;
  }

    // Declared in ASTNode.ast at line 113

  public void setParent(ASTNode node) {
    parent = node;
  }

    // Declared in ASTNode.ast at line 122

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
