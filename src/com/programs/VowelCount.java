package com.programs;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Ahavani Reddy";
		char[] charArray = input.toLowerCase().toCharArray();
		
		int count = 0;
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i] == 'a' ||  charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
				count++;
			}
		}
		
		System.out.println("Vowels count in input " +input+ " : " +count);
	}

}
