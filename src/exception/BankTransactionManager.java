package exception;
// Custom exception for account not found
class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankTransactionManager {

    // Step 1: Verify if account exists
    public static void verifyAccount(String accountNumber) throws AccountNotFoundException {
        String validAccount = "ACC123";
        if (!accountNumber.equals(validAccount)) {
            throw new AccountNotFoundException("Account number " + accountNumber + " not found!");
        }
        System.out.println("✅ Account verified: " + accountNumber);
    }

    // Step 2: Process transaction and check for balance
    public static void processTransaction(double balance, double amount)
            throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Transaction amount must be greater than zero!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: ₹" + balance);
        }
        System.out.println("✅ Transaction of ₹" + amount + " processed successfully.");
    }

    // Step 3: Execute the transaction (declares throws Exception)
    public static void executeTransaction(String accountNumber, double balance, double amount)
            throws Exception {
        verifyAccount(accountNumber);
        processTransaction(balance, amount);
    }

    // Step 4: Main method - handles all exceptions
    public static void main(String[] args) {
        System.out.println("=== Bank Transaction Manager ===");

        try {
            // You can change these values to test different scenarios
            String accountNumber = "ACC999"; // Invalid account to trigger AccountNotFoundException
            double balance = 5000;
            double amount = 6000;

            executeTransaction(accountNumber, balance, amount);

        } catch (AccountNotFoundException e) {
            System.out.println("❌ Account Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("❌ Transaction Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unexpected Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
