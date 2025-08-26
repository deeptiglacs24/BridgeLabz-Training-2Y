import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the f number: ");
        double f = sc.nextDouble();
        System.out.print("Enter the s number: ");
        double s = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (f + s));
                break;
            case "-":
                System.out.println("Result: " + (f - s));
                break;
            case "*":
                System.out.println("Result: " + (f * s));
                break;
            case "/":
                if (s != 0) {
                    System.out.println("Result: " + (f / s));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
        }

        sc.close();
    }
}
