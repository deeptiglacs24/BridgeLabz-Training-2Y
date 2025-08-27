import java.util.*;
public class Smallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        boolean issmallest=(n1<n2 && n1<n3);
        System.out.println("Is first number is smallest: "+issmallest);
        
    }
}