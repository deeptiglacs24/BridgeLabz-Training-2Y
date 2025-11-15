package com.generics;

import java.util.List;

public class GenericWildCard {
	public static void displayName(List<?> clasroom) {
		for(Object c :clasroom) {
			System.out.print(c+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> c1=List.of("ClassA","ClassB","ClassC");
		displayName(c1);
		List<Integer> c2=List.of(1,2,3,4);
		displayName(c2);

	}
}
