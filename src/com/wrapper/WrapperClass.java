package com.wrapper;

import java.util.*;
public class WrapperClass {

	public static void main(String[] args) {
		//System.out.println("Hii");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//using Constructor (in old)
//		Integer b=new Integer(12);
//		Integer s=new Integer("13");
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println();
		
		//usage of utility methods to create Wrapper Object  obj.valueOf(v);
//		Integer i3= Integer.valueOf(10);    //primitive--->non primitive(ValueOf(Val))
//		Integer i4=Integer.valueOf("20");
//		Double id= Double.valueOf(d);
//		System.out.println(i3);
//		System.out.println(i4);
//		System.out.println("In Object Formate:"+id);
		
		//nonprimitive--->primitive
		//obj.xxxxValue()
//		int d=i3.intValue(); 
//		System.out.println(d);
		
		
		//xxxx.parseInt(strinnumform)convert String to Corresponding primitive type.
//		int i1=Integer.parseInt("10");
//		System.out.println(i1);
		double i2=Double.parseDouble(s);
		System.out.println(i2);
		
		
	}
	

}
