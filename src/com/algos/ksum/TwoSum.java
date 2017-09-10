package com.algos.ksum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * Description:
	 * 		Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 *		You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 *
	 * Given:
	 * 		Array,Number
	 * 		Ex: int[] inputArray,Target number (n)
	 *
	 * Formula:
	 *
	 *
	 *
	 *
	 */
	public static int[] compute(int[] inputArr, int targetNumber) {
		Map<Integer,Integer> pmap = new HashMap<>();
		for (int i = 0; i < inputArr.length; i++) {
			int b = targetNumber - inputArr[i];
			if(pmap.get(b)!=null) {
				return new int[] {pmap.get(b),i+1};
			} else {
				pmap.put(inputArr[i], i+1);
			}
		}
		return null;
	}

	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			map.put(target - numbers[i], i);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				if (map.get(numbers[i]) != i) {
					return new int[]{i + 1, map.get(numbers[i]) + 1};
				}
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		int[] op = compute(new int[] { 10, 11, 22, 33, 44, 66 }, 77);
		System.out.println(" RESULT = "+ Arrays.toString(op));
		int[] op1 = twoSum(new int[] { 10, 11, 22, 33, 44, 66 }, 77);
		System.out.println(" RESULT = "+ Arrays.toString(op1));
	}
}
