package exception;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM class
class ATM {
    private double balance;

    // Constructor to set initial balance
    public ATM(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed! You tried to withdraw ₹" + amount +
                ", but your balance is only ₹" + balance + "."
            );
        } else if (amount <= 0) {
            throw new InsufficientFundsException("Invalid amount! Please enter a positive value.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }
}
