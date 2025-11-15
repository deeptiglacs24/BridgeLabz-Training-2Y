package com.wrapperassignment;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double doubleObj = 45.67;
        double doubleValue = doubleObj.doubleValue();
        int intValue = (int) doubleValue;

        System.out.println("Wrapper (Double object): " + doubleObj);
        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Primitive int value (after casting): " + intValue);
    }
}
