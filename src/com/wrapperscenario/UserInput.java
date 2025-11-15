package com.wrapperscenario;

import java.util.Scanner;

public class UserInput{
    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String userAge = sc.nextLine();

        if (isValidAge(userAge)) {
            System.out.println("Age is valid. You are eligible to sign up!");
        } else {
            System.out.println("Invalid age or you are under 18.");
        }

        sc.close();
    }
}

