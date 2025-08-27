import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
        for (int num : n) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        if (n[0] > n[n.length - 1]) {
            System.out.println("First element is greater than the last element");
        } 
        else if (n[0] < n[n.length - 1]) {
            System.out.println("First element is less than the last element");
        } 
        else {
            System.out.println("First and last elements are equal");
        }
        sc.close();
    }
}
