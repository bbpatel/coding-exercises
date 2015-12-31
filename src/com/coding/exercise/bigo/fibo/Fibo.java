package com.coding.exercise.bigo.fibo;

public class Fibo {

	public int series(int n) {
		if (n <= 1) {
			return n;
		}
		return series(n - 1) + series(n - 2);
	}

	public static void main(String[] args) {
		Fibo f = new Fibo();
		System.out.println("This is O(2^n)");
		System.out.println("Series(10)" + f.series(10));
	}
}
