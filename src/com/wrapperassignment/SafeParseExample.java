package com.wrapperassignment;

public class SafeParseExample {
		public static int parseInt(String input) {
			try {
				return Integer.parseInt(input);
			}
			catch(NumberFormatException e) {
				return -1;
			}
		}
		public static void main(String[] args) {
			String[] a= {"123", "abc", "45.6", "0"};
			for(int i=0;i<a.length;i++) {
				int res= parseInt(a[i]);
				System.out.println("Input: " + a[i] + " → Parsed: " + res);
			}
		}
}
