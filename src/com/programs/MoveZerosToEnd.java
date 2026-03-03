package com.programs;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] num = {0,1,0,8,9,7};
		int[] output = moveZerosToEnd(num);
		System.out.println(Arrays.toString(output));
	}
	
	public static int[] moveZerosToEnd(int[] num) {
		int temp = 0;
		//for(int i=0; i<num.length-1; i++) {
		//		if(num[i] == 0) {
		//			temp = num[i];
		//			num[i] = num[i+1];
		//			num[i+1] = temp;					
		//		}		
		//}
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] == 0) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;					
				}
			}				
		}
		return num;
	}
}
