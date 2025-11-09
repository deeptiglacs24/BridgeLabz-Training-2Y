package exception;

import java.util.Random;

//Custom exception for out of stock
class OutOfStockException extends Exception {
 public OutOfStockException(String message) {
     super(message);
 }
}

//Custom exception for payment failure
class PaymentFailedException extends Exception {
 public PaymentFailedException(String message) {
     super(message);
 }
}

public class OnlineOrderProcessing {

 // Method to place an order
 public static void placeOrder() throws OutOfStockException, PaymentFailedException {
     Random random = new Random();
     int outcome = random.nextInt(3); // 0, 1, or 2

     if (outcome == 0) {
         throw new OutOfStockException("The product is currently out of stock!");
     } else if (outcome == 1) {
         throw new PaymentFailedException("Payment processing failed. Please try again!");
     } else {
         System.out.println("✅ Order placed successfully! Thank you for shopping with us.");
     }
 }

 // Main method
 public static void main(String[] args) {
     System.out.println("=== Online Order Processing System ===");

     try {
         placeOrder();
     } catch (OutOfStockException e) {
         System.out.println("❌ Error: " + e.getMessage());
     } catch (PaymentFailedException e) {
         System.out.println("❌ Error: " + e.getMessage());
     } finally {
         System.out.println("Thank you for visiting our store!");
     }
 }
}
