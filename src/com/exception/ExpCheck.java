package com.exception;

public class ExpCheck {
	
	static void displayMethod() {
		int a=20;
		int b=0;
		try {
			int res=a/b;
			System.out.println("Result :"+res);
		}
		catch (ArithmeticException e) {
			System.out.println("Error Caught here");
		}
	}
	public static void main(String[] args) {
		displayMethod();

	}

}
