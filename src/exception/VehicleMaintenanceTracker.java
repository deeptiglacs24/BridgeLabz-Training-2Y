package exception;

import java.time.LocalDate;

//Custom Exceptions
class ServiceOverdueException extends Exception {
 public ServiceOverdueException(String message) {
     super(message);
 }
}

class InvalidMileageException extends Exception {
 public InvalidMileageException(String message) {
     super(message);
 }
}

//Vehicle class
class Vehicle {
 private String vehicleName;
 private LocalDate serviceDate;
 private int mileage;

 public Vehicle(String vehicleName, LocalDate serviceDate, int mileage) {
     this.vehicleName = vehicleName;
     this.serviceDate = serviceDate;
     this.mileage = mileage;
 }

 // Method to check vehicle maintenance
 public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
     if (mileage < 0) {
         throw new InvalidMileageException("Mileage cannot be negative for " + vehicleName + "!");
     }

     if (serviceDate.isBefore(LocalDate.now())) {
         throw new ServiceOverdueException("Service overdue for " + vehicleName + "! Last service date: " + serviceDate);
     }

     System.out.println("✅ " + vehicleName + " is in good condition. No service required.");
 }
}

//Main class
public class VehicleMaintenanceTracker {
 public static void main(String[] args) {
     System.out.println("=== Vehicle Maintenance Tracker ===");

     // Creating some vehicle objects
     Vehicle v1 = new Vehicle("Car A", LocalDate.of(2024, 5, 10), 15000);  // Overdue
     Vehicle v2 = new Vehicle("Bike B", LocalDate.of(2026, 3, 15), -500);  // Invalid mileage
     Vehicle v3 = new Vehicle("Car C", LocalDate.of(2026, 7, 10), 12000);  // Valid

     // Check maintenance for each vehicle
     try {
         v1.checkMaintenance();
     } catch (Exception e) {
         System.out.println("❌ " + e.getMessage());
     }

     try {
         v2.checkMaintenance();
     } catch (Exception e) {
         System.out.println("❌ " + e.getMessage());
     }

     try {
         v3.checkMaintenance();
     } catch (Exception e) {
         System.out.println("❌ " + e.getMessage());
     }
 }
}

