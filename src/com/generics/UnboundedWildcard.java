package com.generics;
import java.util.*;
//Unbounded Wildcard (?): Allows any type and is used when the exact type is unknown.
public class UnboundedWildcard {
	public static void displayName(List<?> listn) {
		for(Object f :listn) {
			System.out.print(f+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> l1=List.of("Fl","f2","f3");
		displayName(l1);
		List<Integer> l2=List.of(1,2,3,4);
		displayName(l2);

	}

}
