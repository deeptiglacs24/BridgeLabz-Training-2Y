package com.exception;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
//import java.io.FileReader;
import java.io.IOException;

public class checkExp {
	public static void fileReaderDisplay(){
		try {
			//FileReader f=new FileReader("/Exception/src/com/exception/hello.txt");
			FileWriter writer = new FileWriter("/Exception/src/com/exception/hello.txt");
			
		}
		catch(IOException e) {    //FileNotFoundException f ----for reader
			System.out.println("Exception Caught");
		}	
		
	}
	public static void main(String[] args) {
		fileReaderDisplay();
		
	}

}
