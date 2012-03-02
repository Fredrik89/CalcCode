package test;

import icode.Code;

import java.io.File;
import java.io.FileReader;

import org.junit.Test;

import parser.Parser;

public class TestCodeGen extends TestCaseOutput {
	private final static String DATA = "data/";
	private final static String RESULT = "result/";
	private final static String RESULT_EXTENSION = ".res";

	private void assertCorrectOutput(String testName) {
		String fullName = testName;
		genCode(DATA + fullName);
		assertOutput(new File(RESULT + fullName + RESULT_EXTENSION));
	}

	@Test
	public void empty() {
		assertCorrectOutput("empty");
	}

	private static void genCode(String arg) {
		try {
			Code code = new Code();
			Parser parser = new Parser(new FileReader(arg));
			parser.start().genCode(code);
			System.out.println(code);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		genCode(args[0]);
	}
}
