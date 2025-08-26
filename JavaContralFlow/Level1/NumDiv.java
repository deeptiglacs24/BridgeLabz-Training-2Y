import java.util.*;
public class NumDiv{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("Is the number "+num +"divisible by 5?");
            System.out.print("Yes");
        }
        else{
            System.out.println("Is the number "+num +"divisible by 5?");
            System.out.print("No");
        }
    }
}