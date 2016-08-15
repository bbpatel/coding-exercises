package com.java8.features.defaultmethod;

interface Formula {
	default double sqrt(double number) {
		return Math.sqrt(number);
	}

	int multiply(int x, int y);

	public static void main(String args[]) {
		Formula formula = new Formula() {

			@Override
			public int multiply(int x, int y) {
				return x * y;
			}

		};
		int x = 10;
		int y = 4;
		System.out.println(String.format("Mul of %s with %s is %s", x, y, formula.multiply(x, y)));
		double a = 64;
		System.out.println(String.format("sqrt of  %s is %s", a, formula.sqrt(a)));
	}
}
