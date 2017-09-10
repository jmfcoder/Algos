package com.algos.factorial;

public class TrailingZeroes {
	
	/**
	 * Description:
	 * 		Compute number of trailing zeroes in a factorial. 
	 * 
	 * Given: 
	 * 		Number (n)
	 * 
	 * Formula:
	 * 		floor(n/5) + floor(n/25) + floor(n/125)
	 * 
	 * 		Ex: For 100 should be 24
	 *
	 */
	public static void main(String[] args) {
		System.out.println(getTrailingZeroes(100));
	}
	
	public static int getTrailingZeroes(int factorial) {
		int count = 0;
		for (int i = 5; factorial/i>=1; i *= 5) {
			count += factorial/i;
		}
		return count;
	}
}
