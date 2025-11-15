package com.generics;


//Upper Bounded (extends): Restricts to a specific type or its subclasses.
public class GenericsUpperBound <T extends Float>{   
	private T studentName;
	public  void setName(T studentName) {
		this.studentName=studentName;
	}
	public  T getName() {
		return studentName;
	}
	

	public static void main(String[] args) {
		
		GenericsUpperBound<Float> s=new GenericsUpperBound<>();
//		s.setName("Deepti");
//		System.out.println(s.getName());//cannot pass becoz of <T extends Number>
		s.setName(123.8F);
		System.out.println(s.getName());   
	}

}
