package com.algos.ugly;

public class UglyNumber {

	/**
	 *
	 * Description:
	 * 		Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * 		For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
	 *		Note that 1 is typically treated as an ugly number, and n does not exceed 1690.
	 *
	 * Given:
	 * 		Number (nth number)
	 *
	 *
	 * Formula:
	 *		Simple: loop through 2 to 5 (its ok to include 4) and if MOD of any of them is zero then its ugly number
	 *				Do MOD(or Remainder) with 2 first and see if its remainder is 0, else keep doing it till zero
	 *
	 *
	 *
	 */


	public static boolean getUgly(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i <= 5; i++) {
			while (number % i == 0)
				number = number / i;
		}
		return number == 1;
	}

	public static void main(String[] args) {
		for (int i=1;i<100;i++) {
			System.out.println(i+" = ugly? "+getUgly(i));
		}
	}


}
