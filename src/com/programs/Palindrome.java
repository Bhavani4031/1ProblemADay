package com.programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "madam";
		PalindromeCheck("madam");
	}

	public static void PalindromeCheck(String input) {
		
		char[] charArray = input.toCharArray();
		String reversedString = "";
		for(int i = charArray.length - 1; i >= 0; i --) {
			reversedString = reversedString + charArray[i];
		}
		
		if(input.equals(reversedString)) {
			System.out.println(input+ " is a Palindrome");
		}
		else {
			System.out.println(input+ " is not a Palindrome");	
		}
	}
}
