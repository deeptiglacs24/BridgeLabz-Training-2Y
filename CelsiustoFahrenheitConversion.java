import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double c = sc.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
