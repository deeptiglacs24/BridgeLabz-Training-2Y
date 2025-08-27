import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n: ");
        int n = sc.nextInt();
        int[] r = new int[4]; 
        for (int i=6;i<=9;i++) {
            r[i-6]=n*i;
        }
        for (int i=6;i<=9;i++) {
            System.out.println(n + " * " + i + " = " + r[i - 6]);
        }
    }
}
