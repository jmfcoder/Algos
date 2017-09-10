package com.algos.count;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DigitCount {

	/**
	 *
	 * Description:
	 * 		Count the number of Ks between 0 and N, k can be 0-9
	 *
	 * Given:
	 * 		Numbers (number, k)
	 * 		Ex: 15,1 will generate
	 * 				[1,2,3,4....9,10,11,12,13,14,15], 1
	 * 			Ans: We have [1,10,11,12,13,14,15]
	 * 				Hence we have 8 1's
	 *
	 * Formula:
	 * 		  	a) n % 10 = k (check right most digit with k)
	 * 			b) n = n / 10 (to move left digit to right now)
	 *
	 *
	 */
	public static int compute(int n, int k) {
		if(n<1 || k > 9|| k < 1) {
			return 0;
		}

		int[] numRange = getNumberRange(n);
		int count = 0;
		for(int i=0;i<=numRange.length;i++) {
			int j = i;
			do {
				if(j % 10 == k)
					count ++;

				j /=10;
			} while (j != 0);
		}
		return count;
	}

	private static int[] getNumberRange(int n) {
		//Java8
		int numRange[] = IntStream.rangeClosed(1, n).toArray();

		//Java8
		int[] array = new int[10];
		Arrays.setAll(array, i -> i + 1);

		//older Java
		int[] arrOld = new int[n];
		for(int i =0;i<n;i++) {
			arrOld[i] = i;
		}

		return numRange;
	}

	public static void main(String[] args) {
		System.out.println(compute(12,1));
		System.out.println(compute(15,1));
	}






}
