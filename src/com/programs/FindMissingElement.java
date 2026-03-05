package com.programs;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] {1,2,3,5};
		System.out.println(findMissingElement(nums));
	}
	
	public static int findMissingElement(int[] nums) {
		
		int actualResult = 0;
		int n = nums[nums.length-1];
		
		int expectedRes = (n * (n + 1)) / 2;
		
		for(int i=0; i<nums.length; i++) {
			actualResult += nums[i];
		}
		
		return expectedRes - actualResult;
	}

}
