
package parser;
import icode.*;import util.*;import java.util.ArrayList;

public class ASTNode$State extends java.lang.Object {
    // Declared in ASTNode at line 2

  public boolean IN_CIRCLE = false;

    // Declared in ASTNode at line 3

  public int CIRCLE_INDEX = 1;

    // Declared in ASTNode at line 4

  public boolean CHANGE = false;

    // Declared in ASTNode at line 5

  public boolean LAST_CYCLE = false;

    // Declared in ASTNode at line 6

  public boolean RESET_CYCLE = false;

    // Declared in ASTNode at line 7

  static public class CircularValue {
    Object value;
    int visited = -1;
  }

    // Declared in ASTNode at line 11

  static class IdentityHashSet extends java.util.AbstractSet implements java.util.Set {
    public IdentityHashSet(int initialCapacity) {
      map = new java.util.IdentityHashMap(initialCapacity);
    }
    private java.util.IdentityHashMap map;
    private static final Object PRESENT = new Object();
    public java.util.Iterator iterator() { return map.keySet().iterator(); }
    public int size() { return map.size(); }
    public boolean isEmpty() { return map.isEmpty(); }
    public boolean contains(Object o) { return map.containsKey(o); }
    public boolean add(Object o) { return map.put(o, PRESENT)==null; }
    public boolean remove(Object o) { return map.remove(o)==PRESENT; }
    public void clear() { map.clear(); }
  }

    // Declared in ASTNode.ast at line 116

    public void reset() {
        IN_CIRCLE = false;
        CIRCLE_INDEX = 1;
        CHANGE = false;
        LAST_CYCLE = false;
    }


}
