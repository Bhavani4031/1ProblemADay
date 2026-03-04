package com.programs;

public class SumOfDigitsofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2563;
		int output = sumOfDigits(num);
		System.out.println(output);
	}

	public static int sumOfDigits(int num) {
		
		int lastdigit = 0;
		int sum = 0;
		while(num > 0) {
			lastdigit = num % 10;
			sum = sum + lastdigit;
			num = num / 10;
		}
		
		return sum;
	}
}
