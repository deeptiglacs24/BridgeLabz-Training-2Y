package com.wrapperscenario;
import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] employeeAges = {25, 32, 45, 29, 52, 38, 41};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : employeeAges) {
            ageList.add(age);  
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}
