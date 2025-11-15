package com.wrapperassignment;
import java.util.*;
public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<>();
		Al.add(1);
		Al.add(2);
		Al.add(3);
		Al.add(4);
		Al.add(5);
		int sum=0;
		for(int i=0;i<Al.size();i++) {
			sum=sum+Al.get(i);
		}
		System.out.println("Sum of numbers:"+sum);
	}

}
