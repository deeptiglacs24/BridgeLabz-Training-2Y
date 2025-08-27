
import java.util.*;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int n = sc.nextInt();
        int m=n;
        int sum=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        
        if (sum>m) {
            System.out.println(n + " is a Abundant Number.");
        } else {
        System.out.println(n + " is NOT Abundant Number.");
        }
        sc.close();
    }
    
}
