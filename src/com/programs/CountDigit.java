package com.programs;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 135265678;
		System.out.println(countDigit(num));
	}

	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
