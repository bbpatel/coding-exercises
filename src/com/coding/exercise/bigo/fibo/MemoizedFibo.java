package com.coding.exercise.bigo.fibo;

public class MemoizedFibo {

	private int[] memoized;

	public int series(int n) {
		if (memoized == null) {
			initCache(n);
		}
		if (n <= 1) {
			return n;
		}
		if (memoized[n] != 0) {
			return memoized[n];
		}
		memoized[n] = series(n - 1) + series(n - 2);
		return memoized[n];
	}

	private void initCache(int n) {
		memoized = new int[n + 1];
		for (int i : memoized) {
			memoized[i] = 0;
		}
	}

	public static void main(String[] args) {
		MemoizedFibo f = new MemoizedFibo();
		System.out.println("This is O(n) as the sub results are cached, we calculate each series value only once and cache it");
		System.out.println(f.series(10));
	}

}
