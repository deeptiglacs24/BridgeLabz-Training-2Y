package exception;
import java.util.Scanner;

// Custom exception class
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class LoginSystem {

    // Predefined valid credentials
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    // Method to validate credentials
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(VALID_USERNAME) || !pass.equals(VALID_PASSWORD)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        System.out.println("=== Welcome to the Login System ===");

        // Keep prompting until successful login
        while (!success) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            try {
                validate(username, password);
                System.out.println("✅ Login successful! Welcome, " + username + "!");
                success = true; // exit loop
            } catch (InvalidCredentialsException e) {
                System.out.println("❌ Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
