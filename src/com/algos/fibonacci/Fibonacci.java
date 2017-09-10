package com.algos.fibonacci;

public class Fibonacci {

	/**
	 *
	 * Description:
	 * 		Print fibonacci sequence
	 *
	 * Given:
	 * 		Number (n)
	 *
	 * Formula:
	 *
	 */
	public static int fibo(final int n) {
		if(n <= 1) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			System.out.println(fibo(i));
		}
	}

}
