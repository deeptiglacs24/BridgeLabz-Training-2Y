import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int i = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[i++] = i;
            }
        }

        System.out.print("Factors of " + n + ": ");
        for (i = 0; i < i; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
