import java.util.*;

public class NumOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();
        int temp=number;
        int nd=0;
        while(temp!=0){
            nd++;
            temp=temp/10;
        }
        System.out.println("Number of Digits: "+nd);
        sc.close();
    }
    
}