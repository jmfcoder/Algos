package com.algos.util;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtil {


	//int[] primes
	//int[] factors = new int[primes.length];
	//System.arraycopy(primes, 0, factors, 0, primes.length);

	public static int[] getNumberRange(int n) {
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

	/**
	 *
	 * Find minimum
	 *
	 *
	 * @param factors
	 * @return
	 */
	public int minimum1(int[] factors) {
		int min = factors[0];
		for(int f : factors) {
			if(f < min) {
				min = f;
			}
		}
		return min;
	}

	/*public int minimum2(int[] factors) {
        return int min = Math.min(m2, Math.min(m3, m5));
    }*/
}
