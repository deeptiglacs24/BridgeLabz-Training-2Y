import java.util.Scanner;

public class LargestNCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first n: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second n: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third n: ");
        int n3 = sc.nextInt();

        boolean isFirstLargest = (n1 >= n2) && (n1 >= n3);
        boolean isSecondLargest = (n2 >= n1) && (n2 >= n3);
        boolean isThirdLargest = (n3 >= n1) && (n3 >= n2);
        
        System.out.println("Is the first n the largest? " + isFirstLargest);
        System.out.println("Is the second n the largest? " + isSecondLargest);
        System.out.println("Is the third n the largest? " + isThirdLargest);
        sc.close();
    }
}

