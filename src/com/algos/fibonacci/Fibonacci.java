package com.algos.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		printFib(100);
	}
	
	public static void printFib(final int n) {
        for (int i = 1; i <= n; i++)
            System.out.println(fibo(i));
	}
	
	public static int fibo(final int n) {
		if(n <= 1) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
}
