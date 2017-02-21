package com.sqa.gy.helpers;

public class QAMath {
	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int square(int num, int pow) {
		int result = (int) Math.pow(num, pow);
		return result;
	}

	public static int subtractNumbers(int num1, int num3) {
		int result = num1 - num3;
		return result;
	}

	private int total;

	public QAMath() {
		this.total = 0;
	}

	public QAMath(int num) {
		this.total = num;
	}

	public int addNumber(int num) {
		this.total = this.total + num;
		return this.total;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int square(int pow) {
		this.total = (int) Math.pow(this.total, pow);
		return this.total;
	}

	public int subNumber(int num) {
		this.total = this.total - num;
		return this.total;
	}
}
