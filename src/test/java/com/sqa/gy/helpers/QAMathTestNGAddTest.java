package com.sqa.gy.helpers;

import org.junit.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class QAMathTestNGAddTest {

	@DataProvider
	public Object[][] addData() {
		return new Object[][] { new Object[] { 14, -6, 8 }, new Object[] { -99, -1, -100 },
				new Object[] { -59, 72, 13 } };
	}

	@DataProvider
	public Object[][] expData() {
		return new Object[][] { new Object[] { 7, 2, 49 }, new Object[] { -99, 0, 1 }, new Object[] { -4, 3, -64 } };
	}

	@DataProvider
	public Object[][] subData() {
		return new Object[][] { new Object[] { 14, -6, 20 }, new Object[] { -99, 1, -100 },
				new Object[] { 59, 72, -13 } };
	}

	@Test(dataProvider = "addData")
	public void testAddInst(int num1, int num2, int expected) {
		QAMath test1 = new QAMath(num1);
		test1.addNumber(num2);
		Assert.assertEquals(expected, test1.getTotal());
	}

	@Test(dataProvider = "addData")
	public void testAddSimple(int num1, int num2, int expected) {
		int result = QAMath.addNumbers(num1, num2);
		Assert.assertEquals(expected, result);
	}

	@Test(dataProvider = "expData")
	public void testExpInst(int num1, int num2, int expected) {
		QAMath test1 = new QAMath(num1);
		test1.square(num2);
		Assert.assertEquals(expected, test1.getTotal());
	}

	@Test(dataProvider = "expData")
	public void testExpSimple(int num1, int num2, int expected) {
		int result = QAMath.square(num1, num2);
		Assert.assertEquals(expected, result);
	}

	@Test(dataProvider = "subData")
	public void testSubInst(int num1, int num2, int expected) {
		QAMath test1 = new QAMath(num1);
		test1.subNumber(num2);
		Assert.assertEquals(expected, test1.getTotal());
	}

	@Test(dataProvider = "subData")
	public void testSubSimple(int num1, int num2, int expected) {
		int result = QAMath.subtractNumbers(num1, num2);
		Assert.assertEquals(expected, result);
	}
}
