import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.gy.helpers.*;

/**
 *   File Name: QAMathTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 28, 2017
 *
 */

/**
 * QAMathTest
 *
 * @author Yakovenko, Galina
 */
@RunWith(value = Parameterized.class)
public class QAMathTest {

	@Parameters
	public static Collection<Object[]> getData() {
		return Arrays.asList(new Object[][] { { -198, 200, 2 }, // add
				{ 14, -6, 8 }, // add
				{ -2, 3, 1 } }); // add
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	public int expected;

	public int num1;

	public int num2;

	public QAMathTest(int num1, int num2, int expected) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\tBefore Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\tAfter Test");
	}

	/**
	 * Test method for {@link com.sqa.gy.helpers.QAMath#addNumber(int)}.
	 */
	@Test
	public void testAddNumber() {
		int expected = this.expected;
		System.out.println(this.num1 + " + " + this.num2 + " = " + this.expected);
		QAMath test1 = new QAMath(this.num1);
		test1.addNumber(this.num2);
		Assert.assertEquals(expected, test1.getTotal());
	}

	/**
	 * Test method for {@link com.sqa.gy.helpers.QAMath#addNumbers(int, int)}.
	 */
	@Test
	public void testAddNumbers() {
		int expected = this.expected;
		int result = QAMath.addNumbers(this.num1, this.num2);
		Assert.assertEquals(expected, result);
	}

	// square(int pow)
	/**
	 * Test method for
	 * {@link com.sqa.gy.helpers.QAMath#subtractNumbers(int, int)}.
	 */
	@Test
	@Ignore
	public void testSquare() {
		int expected = 64;
		QAMath test3 = new QAMath(4);
		test3.square(3);
		Assert.assertEquals(expected, test3.getTotal());
	}

	/**
	 * Test method for {@link com.sqa.gy.helpers.QAMath#square(int, int)}.
	 */
	@Test
	@Ignore
	public void testSquareIntInt() {
		int expected = 8;
		int result = QAMath.square(2, 3);
		Assert.assertEquals(expected, result);
	}

	/**
	 * Test method for {@link com.sqa.gy.helpers.QAMath#subNumber(int)}.
	 */
	@Test
	@Ignore
	public void testSubNumber() {
		int expected = 82;
		QAMath test2 = new QAMath(2);
		test2.subNumber(-80);
		Assert.assertEquals(expected, test2.getTotal());
	}

	/**
	 * Test method for
	 * {@link com.sqa.gy.helpers.QAMath#subtractNumbers(int, int)}.
	 */
	@Test
	@Ignore
	public void testSubtractNumbers() {
		int expected = 92;
		int result = QAMath.subtractNumbers(197, 105);
		Assert.assertEquals(expected, result);
	}

}
