import java.util.*;
public class FeeDistributionOut {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your course fee: ");
        int fee=sc.nextInt();
        System.out.println("Enter your fee discount:");
        int dp=sc.nextInt();
        int dis_amt=(fee*dp)/100;
        int dis_fee=fee-dis_amt;
        System.out.println("The discounted amount is INR "+ dis_amt +" and final discounted fee is INR " + dis_fee);
    }
}
