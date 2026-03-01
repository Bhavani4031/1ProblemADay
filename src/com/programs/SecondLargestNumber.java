package com.programs;

/*
 * Find Largest/Second Largest Element in an Array
 */

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondLargest(new int[] {10,9,11,11,7}));
	}

	public static int secondLargest(int[] num) {
		
		int largest = 0;
		int secondLargest = 0;
		
		for(int i=0; i<num.length; i++) {
			if(largest < num[i]) {
				secondLargest = largest;
				largest = num[i];
			}
		}
		return secondLargest;
	}
}
