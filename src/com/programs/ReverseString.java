package com.programs;

/*
 * Write a function that returns the reversed string version of the string.
 * Do NOT use .reverse()
 * Do NOT use any built-in helper methods that directly reverse the string
 * Solve using basic looping logic
 */

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "coding";
		char[] charArray = input.toCharArray();
		String reversedString = "";
		
		for(int i = charArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + charArray[i];
		}
		
		System.out.println("Input: " +input);

		System.out.println("Output: " +reversedString);
		
	}

}
