package test.function;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	@BeforeClass
	public static void init() {
		System.out.println("class is inited");
	}

	@AfterClass
	public static void end() {

		System.out.println("class is end");
	}

	@Before
	public void setUp() throws Exception {
		// Calculator.
		calculator.clear();
	}

	@After
	public void syso() {
		System.out.println(calculator.getResult());
	}

	@Test
	public void testAdd() {
		calculator.add(1);
		assertEquals(5, calculator.getResult());
		// fail("Not yet implemented");
	}

	@Test
	public void testSubstract() {
		calculator.substract(10);
		assertEquals(8, calculator.getResult());

		// fail("Not yet implemented");
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		// fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}

	@Test(timeout = 1000)
	public void squareRoot() {
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {

		calculator.divide(0);

	}

}
