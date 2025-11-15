package com.generics;

public class GenericMethod {
	public static <T> void genericDemo(T details) {
		System.out.println("In method: " + details);
	}
	public static void main(String[] args) {
		GenericMethod.genericDemo("Deepti"); ///call direct by class becoz of static method
		GenericMethod.genericDemo(13);
		GenericMethod.genericDemo(43.89);
		
	}
}
