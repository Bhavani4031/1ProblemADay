package com.programs;

import java.util.LinkedList;
import java.util.List;

public class FirstNonRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = firstNonRepeatingNumber(new int[] {1,2,3,2,4,2,8,1});
		System.out.println(result);
		
        int[] arr1 = {9, 4, 9, 6, 7, 4};
        int result1 = nonRepetingNumber(arr1);
        System.out.println("The first non-repeating element in arr1 is: " + result1); // Output: 6

	}

	public static int firstNonRepeatingNumber(int[] nums) {
		
		int count = 0;
		List<Integer> repeatedNumbers = new LinkedList<Integer>();
		List<Integer> nonRepeatingNum = new LinkedList<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(!repeatedNumbers.contains(nums[i])) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i] == nums[j]) {
						count++;
					}
				}
				if(count > 0) {
					repeatedNumbers.add(nums[i]);
				}
				else {
					nonRepeatingNum.add(nums[i]);
				}
				count = 0;
			}			
		}			
		return nonRepeatingNum.get(0);
	}
	
	public static int nonRepetingNumber(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			boolean isRepeating  = false;
			for(int j=0; j<nums.length; j++) {
				if(i!=j && nums[i] == nums[j]) {
					isRepeating  = true;
					break;
				}
			}
			if(!isRepeating ) {
                return nums[i];
			}
		}
		return -1;
	}
}
