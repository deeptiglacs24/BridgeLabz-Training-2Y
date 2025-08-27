import java.util.Scanner;

public class LargestSecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int maxd = 10;
        int[] ds = new int[maxd];
        int i = 0;

        while (n != 0) {
            if (i == maxd) break;  
            ds[i++] = n % 10;
            n /= 10;
        }

        int lar = 0, secondlar = 0;
        for (i = 0; i < i; i++) {
            if (ds[i] > lar) {
                secondlar = lar;
                lar = ds[i];
            } else if (ds[i] > secondlar && ds[i] != lar) {
                secondlar = ds[i];
            }
        }

        System.out.println("lar d: " + lar);
        System.out.println("Second largest d: " + secondlar);

        sc.close();
    }
}
