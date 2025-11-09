package com.exception;
import java.util.*;
public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			int res=a/b;
			System.out.println("Result :"+res);
		}
		catch (ArithmeticException e) {
			System.out.println("Error Caught here");
		}
		
		finally {
			System.out.print("Always Execute");
		}
	}  

}
