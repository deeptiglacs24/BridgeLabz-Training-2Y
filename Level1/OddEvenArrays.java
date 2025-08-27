import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error! Not a natural number.");
            return;
        }
        int[] even = new int[n / 2 + 1];
        int[] odd = new int[n / 2 + 1];
        int eI = 0, oI = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[eI++] = i;
            } else {
                odd[oI++] = i;
            }
        }
        System.out.print("Even ns: ");
        for (int i = 0; i < eI; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.print("\nOdd ns: ");
        for (int i = 0; i < oI; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}

