package com.wrapperscenario;
import java.util.*;

class SensorDataLogger {

    private ArrayList<Double> readings = new ArrayList<>();

    public void logData(double value) {
        readings.add(value);
        System.out.println("Logged (primitive): " + value);
    }

    public void logData(Double value) {
        readings.add(value);
        System.out.println("Logged (wrapper): " + value);
    }

    public void readData() {
        System.out.println("Reading stored sensor values:");
        for (Double d : readings) {
            double primitiveValue = d;
            System.out.println("Stored Double = " + d + ", primitive = " + primitiveValue);
        }
    }

    public static void main(String[] args) {
        SensorDataLogger logger = new SensorDataLogger();
        logger.logData(25.5);
        logger.logData(new Double(30.2));
        logger.readData();
    }
}
