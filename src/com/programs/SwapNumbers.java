package com.programs;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6; 
		int b = 5;
		System.out.println("Before swapping a: " +a+ " b: " +b);
		//swapNumberWithouttemp(a, b);
		swapNumber(a, b);
	}

	public static void swapNumberWithouttemp(int a, int b) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping a: " +a+ " b: " +b);
	}
	
	public static void swapNumber(int a, int b) {
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a: " +a+ " b: " +b);
	}
}
