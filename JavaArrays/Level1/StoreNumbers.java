import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[10];
        double total = 0.0;
        int i = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0 || i == 10) {
                break;
            }
            n[i] = num;
            i++;
        }
        System.out.println("n entered:");
        for (int i = 0; i < i; i++) {
            System.out.print(n[i] + " ");
            total += n[i];
        }
        System.out.println("\nSum of number = " + total);
        sc.close();
    }
}
