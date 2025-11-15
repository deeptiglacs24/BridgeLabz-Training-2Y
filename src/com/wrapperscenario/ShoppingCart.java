package com.wrapperscenario;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] priceStrings = {"250", "499", "99", "abc", "150"};
        int totalPrice = 0; 

        for (String price : priceStrings) {
            try {
                
                int value = Integer.parseInt(price);
                totalPrice += value;
                System.out.println("Added price: " + value);
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid price found: \"" + price + "\" (skipped)");
            }
        }

        System.out.println("\nTotal Price of Valid Items: " + totalPrice);
    }
}
