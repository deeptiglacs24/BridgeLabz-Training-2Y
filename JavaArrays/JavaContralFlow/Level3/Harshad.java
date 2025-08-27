
import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int n = sc.nextInt();
        int m=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if (m%sum==0) {
            System.out.println(m + " is a Harshad Number.");
        } else {
        System.out.println(m+ " is NOT a Harshad Number.");
        }
        sc.close();
    }
    
}
