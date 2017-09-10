package com.algos.ugly;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class UglyNumberII {

	/**
	 *
	 * Description:
	 * 		Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * 		For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
	 *		Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
	 *
	 *		Write a program to find the n-th ugly number.
	 *
	 * Given:
	 * 		Number (nth number)
	 *
	 *
	 * Formula:
	 * 		Use Datastructure of MinHeap(Binary heap with min as root)  - In java use PriorityQueue
	 * 		When you do 'offer'/push it will push (but head will always be least)
	 *
	 *
	 *
	 */
	public static int nthUglyNumber(int n) {
		PriorityQueue<Long> q = new PriorityQueue<Long>();

		q.offer(1l);
		long current = 0;
		while(n-- > 0) {
			while(q.peek() == current){
				q.poll();
			}
			current = q.poll();
			q.offer(current*2);
			q.offer(current*3);
			q.offer(current*5);
		}
		return (int)current;
	}

	/**
	 * O(n log n) solution
	 *
	 * @param n
	 * @return
	 */
	public static int simpleNthUglyNumber(int n) {
		List<Integer> result = new ArrayList<>();
		result.add(1);

		int i2 = 0, i3 = 0, i5 = 0;
		while (result.size() < n) {
			int m2 = result.get(i2) * 2;
			int m3 = result.get(i3) * 3;
			int m5 = result.get(i5) * 5;

			int min = Math.min(m2, Math.min(m3, m5));
			result.add(min);

			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return result.get(result.size()-1);
	}

	public static void main(String[] args) {
		for (int i=9;i<1700;i++) {
			System.out.println(i+" = ugly? "+nthUglyNumber(i));
		}
		for (int i=1;i<1700;i++) {
			System.out.println(i+" = ugly? "+simpleNthUglyNumber(i));
		}
	}


}
