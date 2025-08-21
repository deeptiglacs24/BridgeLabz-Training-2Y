import java.util.*;
public class KmToMilesOutput {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double km=input.nextDouble();
        double m=km*0.621;
        String result=String.format("The total miles %.2f is mile for the given %.2f km",m,km);
        System.out.println(result);
    }
}