package exception;

public class Main1 {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);  // Initial balance ₹10,000

        try {
            System.out.println("Attempting to withdraw ₹12,000...");
            atm.withdraw(12000);  // Trying to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nAttempting to withdraw ₹5000...");
        try {
            atm.withdraw(5000);  // Valid withdrawal
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
