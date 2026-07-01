package com.java.ArrayList;

public class MissingNumber {
	public static int missing(int[] nums)
	{
		int n=nums.length;
		int sum=n*(n+1)/2;
		for(int num:nums)
		{
			sum-=num;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int []nums= {0,1,2,5};
		System.out.println(missing(nums));
	}
	

}

