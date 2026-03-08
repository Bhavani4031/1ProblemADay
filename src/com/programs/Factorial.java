package com.programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialUsingRecursion(7));
		System.out.println(factorialUsingLoop(7));
	}

	public static int factorialUsingRecursion(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * factorialUsingRecursion(n-1);
	}
	
	public static int factorialUsingLoop(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
}
