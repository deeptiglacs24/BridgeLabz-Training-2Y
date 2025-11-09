package com.bank.util;

import static java.lang.Math.pow;

public class InterestCalculator {

    // Calculate Simple Interest: SI = (P × R × T) / 100
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    // Calculate Compound Interest: CI = P × (pow(1 + R/100, T)) - P
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (pow(1 + rate / 100.0, time)) - principal;
    }
}
