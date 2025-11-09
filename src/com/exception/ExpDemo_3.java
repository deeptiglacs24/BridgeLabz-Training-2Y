package com.exception;

public class ExpDemo_3 {
	public static void resultDisplay() throws ArithmeticException {
		int a=10;
		int b=0;
		int  res=a/b;
		
	}
	public static void main(String[] args) {
		try{
			resultDisplay();
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught");		
		}
		finally {
        	System.out.println("Continue Execute");
        }

	}

}
