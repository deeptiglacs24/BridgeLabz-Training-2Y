import java.util.*;

class BankAccount {
    int accountNo;
    String accountHolder;
    double balance;
    
    BankAccount(int accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("After depositing " + amount + ":");
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("After withdrawing " + amount + ":");
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " failed. Insufficient balance!");
        }
    }
    void displayDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account details:");
        System.out.print("Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Account Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accNo, holder, balance);

        account.displayDetails();
        System.out.print("\nDeposit Amount: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);
        System.out.print("\nWithdraw Amount: ");
        double withdrawAmt1 = sc.nextDouble();
        account.withdraw(withdrawAmt1);
        System.out.print("\nWithdraw Amount: ");
        double withdrawAmt2 = sc.nextDouble();
        account.withdraw(withdrawAmt2);

        System.out.println("Final Balance: " + account.balance);
        sc.close();
    }
}
