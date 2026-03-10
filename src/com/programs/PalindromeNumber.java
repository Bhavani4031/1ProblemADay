package com.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1213;
		System.out.println(num+ " is palindrome: " +isPalindrome(num));
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int last = 0;
		int rev = 0;
		while(num > 0) {
			last = num % 10;
			rev = (rev * 10) + last;
			num = num / 10;
		}
		
		if(rev == temp) {
			return true;
		}
		else {
			return false;
		}
	}
}
