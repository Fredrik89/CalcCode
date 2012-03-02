
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;

public class Start extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Start clone() throws CloneNotSupportedException {
        Start node = (Start)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Start copy() {
      try {
          Start node = (Start)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Start fullCopy() {
        Start res = (Start)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in CodeGenerator.jadd at line 5

	public Object genCode(Code code, TempFactory tempFactory, int blockLevel, Procedure proc) {
		getProcedure().genCode(code, tempFactory, blockLevel);
		return null;
	}

    // Declared in NameAnalysis.jadd at line 7

	
	public void nameAnalysis() {
		SymbolTable<String, IdDecl> table = new SymbolTable<String, IdDecl>();
		nameAnalysis(table);
	}

    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 1

    public Start(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Start(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Start() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 1
    public Start(Procedure p0) {
        setChild(p0, 0);
    }

    // Declared in Parser.ast at line 21


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Start");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 28


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 32


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 37


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Procedure))  throw new Error("Child number 0 of Start has the type " + n.getClass().getName() + " which is not an instance of Procedure");
}

    // Declared in Parser.ast at line 41


  public int getNumChild() {
    return 1;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 1
    public void setProcedure(Procedure node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Procedure getProcedure() {
        return (Procedure)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Procedure getProcedureNoTransform() {
        return (Procedure)getChildNoTransform(0);
    }

}
