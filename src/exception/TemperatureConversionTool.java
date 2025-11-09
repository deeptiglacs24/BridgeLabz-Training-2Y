package exception;
import java.util.Scanner;

//Custom exception
class InvalidTemperatureException extends Exception {
 public InvalidTemperatureException(String message) {
     super(message);
 }
}

public class TemperatureConversionTool {

 // Conversion method
 public static double convertTemperature(double value, char unit) throws InvalidTemperatureException {
     if (unit == 'C' || unit == 'c') {
         if (value < -273.15) {
             throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
         }
         return (value * 9 / 5) + 32; // C to F
     } else if (unit == 'F' || unit == 'f') {
         if (value < -459.67) {
             throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
         }
         return (value - 32) * 5 / 9; // F to C
     } else {
         throw new InvalidTemperatureException("Invalid temperature unit! Use C or F.");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("=== Temperature Conversion Tool ===");

     try {
         System.out.print("Enter temperature value: ");
         double value = sc.nextDouble();

         System.out.print("Enter unit (C/F): ");
         char unit = sc.next().charAt(0);

         double converted = convertTemperature(value, unit);

         if (unit == 'C' || unit == 'c') {
             System.out.println("Converted Temperature: " + converted + " °F");
         } else {
             System.out.println("Converted Temperature: " + converted + " °C");
         }

     } catch (InvalidTemperatureException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Error: Invalid input format.");
     }

     sc.close();
 }
}

