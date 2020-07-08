package com.leetcode.july;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne plusOne = new PlusOne();
		System.out.println(Arrays.toString(plusOne.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
	}
	
	private int[] plusOne(int[] digits) {
		String strDigits = new String();

		for (int digit : digits) 
		{
			strDigits = strDigits.concat(""+digit);
		}
		BigInteger intOfDigits= new BigInteger(strDigits);
		System.out.println(intOfDigits);
		BigInteger intOne = new BigInteger("1");
		intOfDigits = intOfDigits.add(intOne);
		System.out.println(intOfDigits);
		String strResultDigits = String.valueOf(intOfDigits);
		int[] newDigits = new int[strResultDigits.length()];
		for (int i = 0; i < strResultDigits.length(); i++)
		{
			newDigits[i] = strResultDigits.charAt(i) - '0';
		}
        return newDigits;
    }

}


//class Solution {
//
//    // O(N), O(N)
// public int[] plusOne(int[] digits) {
//     int n = digits.length;
//
//     // move along the input array starting from the end
//     for (int idx = n - 1; idx >= 0; --idx) {
//         // set all the nines at the end of array to zeros
//         if (digits[idx] == 9) {
//             digits[idx] = 0;
//         }
//         // here we have the rightmost not-nine
//         else {
//             // increase this rightmost not-nine by 1
//             digits[idx]++;
//             // and the job is done
//             return digits;
//         }
//     }
//     // we're here because all the digits are nines
//     digits = new int[n + 1];
//     digits[0] = 1;
//     return digits;
// } 
//}

