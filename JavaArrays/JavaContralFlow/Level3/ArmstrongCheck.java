
import java.util.*;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();
        int m=number;
        int temp=number;
        int nd=0;
        while(temp!=0){
            nd++;
            temp=temp/10;
        }
        int sum=0;
        temp=number;
        while(temp!=0){
            int d=temp%10;
            sum+=Math.pow(d,nd);
            temp=temp/10;
        }
        if (sum==m) {
            System.out.println(number + " is a Armstrong Number.");
        } else {
        System.out.println(number + " is NOT Armstrong Number.");
        }
        sc.close();
    }
    
}
