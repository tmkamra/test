package com.leetcode.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum threeSum = new ThreeSum();
		System.out.println(threeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));

	}

	private List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);			
		Set<List<Integer>> setOfIntegerList = new HashSet<List<Integer>>();
		if(nums.length == 0)
			return new ArrayList<List<Integer>>(setOfIntegerList);
		
		for(int i=0; i<nums.length-2;i++)
		{
			int j = i+1;
			int k = nums.length-1;
			
			while (j<k)
			{
				int sum = nums[j] + nums[k];
				
				if(nums[i] == -sum)
					setOfIntegerList.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
				else if(sum<-nums[i])
					j++;
				else if(sum>-nums[i])
					k--;
			}
		}
        return new ArrayList<List<Integer>>(setOfIntegerList);
    }
}


//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//
//The solution set must not contain duplicate triplets.
//
//Example:
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]