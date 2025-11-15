package com.wrapperscenario;

import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 0, 5}; 
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2, null, 5));
        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) {
            allRatings.add(r);
        }

        allRatings.addAll(newRatings);

        System.out.println("All Ratings: " + allRatings);
        double sum = 0;
        int count = 0;
        for (Integer rating : allRatings) {
            if (Objects.nonNull(rating)) {
                sum += rating;
                count++;
            }
        }

        double average = (count > 0) ? sum / count : 0;
        System.out.println("Average Rating (ignoring nulls): " + average);
    }
}
