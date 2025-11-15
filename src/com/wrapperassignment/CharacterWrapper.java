package com.wrapperassignment;
import java.util.*;
public class CharacterWrapper {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		int chr=0,sp=0,d=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				chr++;
			}
			else if(Character.isDigit(ch)) {
				d++;
			}
			else if(!Character.isWhitespace(ch)) {
				sp++;
			}
		}
		System.out.println("Digit:"+d);
		System.out.println("Letter:"+chr);
		System.out.println("Special Char:"+sp);
		sc.close();
	}

}
