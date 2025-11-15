package com.generics;

public class Car <T> {
	private T carName;
	public void carSet(T carName) {
		this.carName=carName;
	}
	public T carGet() {
		return carName;
	}

	public static void main(String[] args) {
		Car<String> c1=new Car<>();
		Car<Integer> c2=new Car<>();
		c1.carSet("Ferrari");
		System.out.println(c1.carGet());
		c2.carSet(234);
		System.out.println(c2.carGet());

		

	}

}
