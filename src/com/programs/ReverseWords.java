package com.programs;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//String input = "Hello World";
		String input = "I love coding";
		
		String[] stringArray = input.split(" ");
		String reversedWord = "";
		
		for(int i = stringArray.length -1; i >= 0; i--) {
			reversedWord = reversedWord + " " + stringArray[i];
		}
		
		System.out.println("Output:" +reversedWord);
	}

}
