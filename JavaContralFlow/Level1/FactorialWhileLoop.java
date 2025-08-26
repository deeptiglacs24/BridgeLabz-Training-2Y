import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("fact is not defined for negative numbers.");
        } 
        else {
            long fact = 1; 
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("The fact of " + n + " is " + fact);
        }
        sc.close();
    }
}
