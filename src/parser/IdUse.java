
package parser;
import icode.*;import util.*;import java.util.ArrayList;import semanticlib.SymbolTable;


public class IdUse extends Expr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdUse clone() throws CloneNotSupportedException {
        IdUse node = (IdUse)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdUse copy() {
      try {
          IdUse node = (IdUse)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public IdUse fullCopy() {
        IdUse res = (IdUse)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in CodeGenerator.jadd at line 40


	public void genCode(Code code, TempFactory tempFactory, int blockLevel, Procedure proc) {
		
	}

    // Declared in NameAnalysis.jadd at line 36

	
	private IdDecl declNode = null;

    // Declared in NameAnalysis.jadd at line 37

	public IdDecl decl() {
		return declNode;
	}

    // Declared in NameAnalysis.jadd at line 40

	void nameAnalysis(SymbolTable<String, IdDecl> table) {
		declNode = table.lookup(getId().getID());
	}

    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 27

    public IdUse(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public IdUse(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public IdUse() {
        this(0);


    }

    // Declared in Parser.ast at line 17


    // Declared in Parser.ast line 27
    public IdUse(Id p0) {
        setChild(p0, 0);
    }

    // Declared in Parser.ast at line 21


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "IdUse");
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
  if(i == 0 && !(n instanceof Id))  throw new Error("Child number 0 of IdUse has the type " + n.getClass().getName() + " which is not an instance of Id");
}

    // Declared in Parser.ast at line 41


  public int getNumChild() {
    return 1;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 27
    public void setId(Id node) {
        setChild(node, 0);
    }

    // Declared in Parser.ast at line 5

    public Id getId() {
        return (Id)getChild(0);
    }

    // Declared in Parser.ast at line 9


    public Id getIdNoTransform() {
        return (Id)getChildNoTransform(0);
    }

}
