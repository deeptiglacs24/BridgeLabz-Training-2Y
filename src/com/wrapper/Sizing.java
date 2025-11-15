package com.wrapper;
import java.util.*;
public class Sizing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double vd=sc.nextDouble();
		double f=vd;  //auto-unboxing
		System.out.println(f);
		
		double v2=vd.doubleValue();//unboxing-->obj.xxxx.Value()
		System.out.println(v2);
	   
	}
	public static void main5(String[] args) {
		Scanner sc=new Scanner(System.in);
		//primitive-->nonprimitive
		float x1=sc.nextFloat();
		Object y1=x1;   //Auto-boxing -->implicit
		System.out.println(y1);
		
		float x2=sc.nextFloat();
		//Integer x=new Integer(val); //boxing -->explicit
		Float y2=Float.valueOf(x2);
		System.out.println(y2);
		
	}
	public static void main4(String[] args) {
		//primitive-->nonprimitive
		int a=10;
		Object v=a;   //Auto-boxing -->implicit
		System.out.println(v);
		
		int x=20;
		//Integer x=new Integer(val); //boxing -->explicit
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		
	}

	public static void main1(String[] args) {
		byte a=10; //widening
		short b=a;//implicit
		System.out.println(b);
		
		short c=20;  //shortening-->type casting
		byte d=(byte)c;//Explicit
		System.out.println(d);

	}
	public static void main2(String[] args) {
		int a1=10; //widening
		long b1=a1;//implicit
		System.out.println(b1);
		
		long c1=20;  //shortening-->type casting
		int d1=(int)c1;//Explicit
		System.out.println(d1);

	}
	public static void main3(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in float:");
		float a2=sc.nextFloat(); //widening
		double b2=a2;//implicit
		System.out.println(b2);
		
		System.out.println("Enter value in Double:");
		double c2=sc.nextDouble();  //shortening-->type casting
		float d2=(float)c2;//Explicit
		System.out.println(d2);

	}

}
