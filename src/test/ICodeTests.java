package test;
import java.io.*;
import org.junit.Test;
import icode.*;
import util.*;

public class ICodeTests extends TestCaseOutput {
    @Test
    public void testGenerateCodeForMethod() {
        Code code = new Code();
        TempFactory factory = new TempFactory();
        code.addInstruction(new LabelDecl("p"));
        Enter enter = new Enter(3, 0);
        enter.setComment("this is a comment");
        code.addInstruction(enter);
        code.addInstruction(new Move(new IntConst("1"), new Variable(0, 1)));
        factory.restartNumbering();
        Temp t1 = factory.create();
        code.addInstruction(new IntMul(new IntConst("2"), new IntConst("3"), t1));
        Temp t2 = factory.create();
        code.addInstruction(new IntAdd(new IntConst("5"), t1.copy(), t2));
        code.addInstruction(new Move(t2.copy(), new Variable(0, 2)));
        factory.restartNumbering();
        Temp t3 = factory.create();
        code.addInstruction(new IntMul(new IntConst("4"), new IntConst("7"), t3));
        code.addInstruction(new Move(t3.copy(), new Variable(0, 3)));
        factory.restartNumbering();
        code.addInstruction(new Return());
        enter.setTemps(factory.getNumberOfTemps());
        System.out.println(code);
        assertOutput(new File("result/program1.res"));
    }

    @Test
    public void testGenerateManyTemps() {
        Code code = new Code();
        TempFactory factory = new TempFactory();
        code.addInstruction(new LabelDecl("p"));
        Enter enter = new Enter(3, 0);
        code.addInstruction(enter);
        code.addInstruction(new JmpT(new Variable(0, 1), "end"));
        code.addInstruction(new JmpF(new Argument(2), "end"));
        code.addInstruction(new Jmp("end"));
        code.addInstruction(new IntAdd(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntSub(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntMul(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntDiv(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntEq(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntNe(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntLt(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntLe(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntGt(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new IntGe(new IntConst("2"), new IntConst("3"), factory
            .create()));
        code.addInstruction(new LabelDecl("end"));
        code.addInstruction(new Call("p2", 1));
        factory.restartNumbering();
        code.addInstruction(new Return());
        enter.setTemps(factory.getNumberOfTemps());
        System.out.println(code);
        assertOutput(new File("result/program2.res"));
    }
}
