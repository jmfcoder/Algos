package com.test.bit;

public class AddTwoNumbers {
	
	
	/**
	 * Logic Gate used: XOR, AND
	 * 
	 * XOR --> addition without carry
	 * AND --> Shift with AND (for carry to be added)
	 * 
	 * num1 ^ num2  --> is num1 XOR num2 (which is adding num1 with num2 - but no carry)
	 * But we need carry hence to figure out where we need it we use (a & b) but
	 * we always add carry to the left position hence we do SHIFT to left by 1
	 * as (a & b) << 1
	 * 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public static int addSimpleNumbers( int num1,  int num2) {
		return (num1 ^ num2) + ((num1 & num2) << 1);
	}
	
	public static void main(String[] args) {
		System.out.println(addSimpleNumbers(2, 3));
	}

	
	/**
	 * *********  Logic Gate: *************
	 * 
	 * 
	 * NOT 
	 * 		0  --> 1
	 * 		1  --> 0
	 * 
	 * AND
	 * 		1 & 1 = 1, all others are 0
	 * 
	 * OR (Opp of AND)
	 * 		0 OR 0 = 0, all others are 1
	 * 
	 * XOR (only one of them 1 for result=1)
	 * 		0 XOR 0 = 0
	 * 		0 XOR 1 = 1
	 * 		1 XOR 0 = 1
	 * 		1 XOR 1 = 0
	 * 
	 * Bit SHIFTS
	 * 
	 * << Left shift
	 * >> signed right shift
	 * >>> unsigned right shift
	 * 
	 */
	
	
	/**
	 * 
	 * byte 		-->  8
	 * short 	--> 16
	 * int		--> 32    --> 2pow32 = (-2,147,483,648,2,147,483,647)
	 * long		--> 64
	 * 
	 * 
	 * Unsigned can hold a larger positive value, and no negative value. 
	 * Unsigned uses the leading bit as a part of the value
	 * 
	 * signed integers can hold both positive and negative numbers
	 * signed version uses the left-most-bit to identify if the number is positive or negative. 
	 * 
	 * 
	 */
}
