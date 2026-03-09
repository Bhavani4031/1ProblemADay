package com.programs;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,6,9,3,4};
		System.out.println(SumOfArrayElements(arr));
	}

	public static int SumOfArrayElements(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}
