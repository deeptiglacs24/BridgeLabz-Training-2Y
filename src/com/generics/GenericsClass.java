package com.generics;

public class GenericsClass <T> {
	private T flightName;
	
	public void flightSet(T flightName) {
		this.flightName=flightName;
	}
	public T flightGet() {
		return flightName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsClass<String> gen1=new GenericsClass<>();
		GenericsClass<Integer> gen2=new GenericsClass<>();
		gen1.flightSet("123");
		System.out.println(gen1.flightGet());
		gen2.flightSet(123);
		System.out.println(gen2.flightGet());
	}

}
