package com.solutions;

public class UglyNumberII {

	public static void main(String[] args) {
		UglyNumberII uglyNumberII = new UglyNumberII();
		System.out.println(uglyNumberII.nthUglyNumber(10));
	}
	
	private int nthUglyNumber(int n) {
		if(n==0)
			return 0;
		int[] dp = new int[n];
		dp[0] = 1;
		
		int two = 0, three = 0, five = 0, index=1;
		while(index<n)
		{
			int mul2 = dp[two] *2;
			int mul3 = dp[three] *3;
			int mul5 = dp[five] *5;

			int min = Math.min(mul2, Math.min(mul3, mul5));
			dp[index] = min;
			index++;
			if(min == mul2)
				two++;
			if(min == mul3)
				three++;
			if(min == mul5)
				five++;
		}
        return dp[n-1];
    }
}

  