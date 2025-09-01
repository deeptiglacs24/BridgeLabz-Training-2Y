import java.util.*;
public class NaturalSum{
    public static int nsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n:");
        int n=sc.nextInt();
        System.out.print("Sum of n natural numbers:"+ nsum(n));
    }
}