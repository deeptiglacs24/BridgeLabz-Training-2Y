import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Principal:");
        int p = sc.nextInt();
        System.out.println("Enter the value of rate:");
        double r = sc.nextDouble();
        System.out.println("Enter time:");
        int t = sc.nextInt();
        double si=(p*r*t)/100.0;
        System.out.println("Simple Interest: " + si);
    }
}