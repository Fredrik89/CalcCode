
package parser;
import icode.*;import util.*;import java.util.ArrayList;


public class Procedure extends Stmt implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
    public void flushCollectionCache() {
        super.flushCollectionCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public Procedure clone() throws CloneNotSupportedException {
        Procedure node = (Procedure)super.clone();
        return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Procedure copy() {
      try {
          Procedure node = (Procedure)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public Procedure fullCopy() {
        Procedure res = (Procedure)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in CodeGenerator.jadd at line 8

	public void genCode(Code code, TempFactory tempFactory, int blockLevel){
		int tmps = 0;
		int numOfVars = 0;
		numOfVars = countVars(blockLevel);
		code.addInstruction(new LabelDecl(getId().getID()));
		code.addInstruction(new Enter(numOfVars, tmps));
		code.addInstruction(new Return());
	}

    // Declared in CountVars.jadd at line 2

	public int countVars(int blockLevel){
		int numOfVars = 0;
		for(Stmt stmt : getStmtList()){
			if(stmt instanceof IdDecl){
				IdDecl tmpStmt = (IdDecl) stmt;
				stmt = tmpStmt;
				stmt.getId().setVarNum(numOfVars);
				stmt.getId().setBlockLevel(blockLevel);
				numOfVars++;
			} 
		}
		return numOfVars;
	}

    // Declared in Parser.ast at line 3
    // Declared in Parser.ast line 5

    public Procedure(int i) {
        super(i);
    }

    // Declared in Parser.ast at line 6

    public Procedure(Parser p, int i) {
        this(i);
        parser = p;
    }

    // Declared in Parser.ast at line 10

    public Procedure() {
        this(0);

        setChild(new List(), 1);
        setChild(new List(), 2);

    }

    // Declared in Parser.ast at line 19


    // Declared in Parser.ast line 5
    public Procedure(Id p0, List<Param> p1, List<Stmt> p2) {
        setChild(p0, 0);
        setChild(p1, 1);
        setChild(p2, 2);
    }

    // Declared in Parser.ast at line 25


    public void dumpTree(String indent, java.io.PrintStream pStream) {
        pStream.println(indent + "Procedure");
        String childIndent = indent + "  ";
        for(int i = 0; i < getNumChild(); i++)
            getChild(i).dumpTree(childIndent, pStream);
    }

    // Declared in Parser.ast at line 32


    public Object jjtAccept(ParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    // Declared in Parser.ast at line 36


public void jjtAddChild(Node n, int i) {
  checkChild(n, i);
  super.jjtAddChild(n, i);
}

    // Declared in Parser.ast at line 41


public void checkChild(Node n, int i) {
  if(i == 0 && !(n instanceof Id))  throw new Error("Child number 0 of Procedure has the type " + n.getClass().getName() + " which is not an instance of Id");
  if(i == 1) {
    if(!(n instanceof List)) throw new Error("Child number 1 of Procedure has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Param)) throw new Error("Child number " + k + " in ParamList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Param");
  }
  if(i == 2) {
    if(!(n instanceof List)) throw new Error("Child number 2 of Procedure has the type " + n.getClass().getName() + " which is not an instance of List");
    for(int k = 0; k < ((List)n).getNumChildNoTransform(); k++)
      if(!(((List)n).getChildNoTransform(k) instanceof Stmt)) throw new Error("Child number " + k + " in StmtList has the type " + ((List)n).getChildNoTransform(k).getClass().getName() + " which is not an instance of Stmt");
  }
}

    // Declared in Parser.ast at line 55


  public int getNumChild() {
    return 3;
  }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 5
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

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 5
    public void setParamList(List<Param> list) {
        setChild(list, 1);
    }

    // Declared in Parser.ast at line 6


    public int getNumParam() {
        return getParamList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Param getParam(int i) {
        return (Param)getParamList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addParam(Param node) {
        List<Param> list = (parent == null || state == null) ? getParamListNoTransform() : getParamList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addParamNoTransform(Param node) {
        List<Param> list = getParamListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setParam(Param node, int i) {
        List<Param> list = getParamList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Param> getParams() {
        return getParamList();
    }

    // Declared in Parser.ast at line 31

    public List<Param> getParamsNoTransform() {
        return getParamListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Param> getParamList() {
        List<Param> list = (List<Param>)getChild(1);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Param> getParamListNoTransform() {
        return (List<Param>)getChildNoTransform(1);
    }

    // Declared in Parser.ast at line 2
    // Declared in Parser.ast line 5
    public void setStmtList(List<Stmt> list) {
        setChild(list, 2);
    }

    // Declared in Parser.ast at line 6


    public int getNumStmt() {
        return getStmtList().getNumChild();
    }

    // Declared in Parser.ast at line 10


     @SuppressWarnings({"unchecked", "cast"})  public Stmt getStmt(int i) {
        return (Stmt)getStmtList().getChild(i);
    }

    // Declared in Parser.ast at line 14


    public void addStmt(Stmt node) {
        List<Stmt> list = (parent == null || state == null) ? getStmtListNoTransform() : getStmtList();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 19


    public void addStmtNoTransform(Stmt node) {
        List<Stmt> list = getStmtListNoTransform();
        list.addChild(node);
    }

    // Declared in Parser.ast at line 24


    public void setStmt(Stmt node, int i) {
        List<Stmt> list = getStmtList();
        list.setChild(node, i);
    }

    // Declared in Parser.ast at line 28

    public List<Stmt> getStmts() {
        return getStmtList();
    }

    // Declared in Parser.ast at line 31

    public List<Stmt> getStmtsNoTransform() {
        return getStmtListNoTransform();
    }

    // Declared in Parser.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getStmtList() {
        List<Stmt> list = (List<Stmt>)getChild(2);
        list.getNumChild();
        return list;
    }

    // Declared in Parser.ast at line 41


     @SuppressWarnings({"unchecked", "cast"})  public List<Stmt> getStmtListNoTransform() {
        return (List<Stmt>)getChildNoTransform(2);
    }

}
