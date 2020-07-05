package com.solutions;

public class HammingDistance {

	public static void main(String[] args) {
		HammingDistance hammingDistance = new HammingDistance();
		System.out.println(hammingDistance.hammingDistance(1, 4));
	}

	private int hammingDistance(int x, int y) {
		int count  = 0;
		int xor = x^y;
		for(int i=0; i<32; i++)
		{
			// right shift each bit till 32 
			// and & each bit at the end with 1 to check the bit at xor is 1
			if(((xor>>i)&1) == 1)
				count++;
		}
        return count;
    }
}


//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//Given two integers x and y, calculate the Hamming distance.
//
//Note:
//0 ≤ x, y < 231.
//
//Example:
//
//Input: x = 1, y = 4
//
//Output: 2
//
//Explanation:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//The above arrows point to positions where the corresponding bits are different.