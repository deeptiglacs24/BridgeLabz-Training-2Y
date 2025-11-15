package com.wrapperassignment;
import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        Integer numObject = Integer.valueOf(num);
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper (Integer object) value: " + numObject);

        scanner.close();
    }
}

