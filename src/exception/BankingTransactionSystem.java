package exception;

import java.util.Random;

//Custom Exceptions
class NegativeAmountException extends Exception {
 public NegativeAmountException(String message) {
     super(message);
 }
}

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class NetworkFailureException extends Exception {
 public NetworkFailureException(String message) {
     super(message);
 }
}

//Transaction class
class Transaction {
 private double balance;

 public Transaction(double balance) {
     this.balance = balance;
 }

 // Method to process a transaction
 public void processTransaction(double amount)
         throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

     Random random = new Random();
     int outcome = random.nextInt(3); // 0, 1, or 2 for simulation

     if (amount < 0) {
         throw new NegativeAmountException("Transaction failed: Negative amount not allowed!");
     } else if (amount > balance) {
         throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
     } else if (outcome == 2) {
         throw new NetworkFailureException("Transaction failed: Network connectivity issue!");
     } else {
         balance -= amount;
         System.out.println("✅ Transaction successful! Remaining balance: ₹" + balance);
     }
 }
}

//Main class
public class BankingTransactionSystem {
 public static void main(String[] args) {
     Transaction t = new Transaction(5000.0);

     System.out.println("=== Banking Transaction System ===");

     try {
         t.processTransaction(2000); // Try with a valid or random value
     } catch (NegativeAmountException e) {
         System.out.println("❌ " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("❌ " + e.getMessage());
     } catch (NetworkFailureException e) {
         System.out.println("❌ " + e.getMessage());
     } finally {
         System.out.println("Transaction attempt completed.");
     }
 }
}

