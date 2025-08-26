import java.util.*;
public class FeetAndInch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height in cm:");
        int h=sc.nextInt();
        double inch=(int)h/2.54;
        double feet=(int)inch/12;
        String result=String.format("Your Height in cm is %d while in feet is %.2f and inches is %.2f",h,feet,inch);
        System.out.println(result);
    }
}
