package com.programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargest(11,9,21);
	}

	public static void findLargest(int a, int b, int c) {
		
		if(a > b && a > c) {
			System.out.println(a+ " is the largest");
		}
		else if(b > a && b > c) {
			System.out.println(b+ " is the largest");	
		}
		else {
			System.out.println(c+ " is the largest");	
		}
	}
}
