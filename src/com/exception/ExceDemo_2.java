package com.exception;
import java.util.*;
public class ExceDemo_2 {
	public static void voteCheck(int age ) {
		if(age<18) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Eligible");
		}
		
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Age:");
    	int a=sc.nextInt();
        try {
        	voteCheck(a);
        }
        catch(ArithmeticException e) {
        	System.out.println("Arithmetic Exception Caught"+e);
        }
        finally {
        	System.out.println("Continue Execute");
        }
    	

        
    }
}
