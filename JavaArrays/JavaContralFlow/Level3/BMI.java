import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your weight(in kg): ");
        double w=sc.nextDouble();
        System.out.print("Enter Your height(in cm): ");
        double hcm=sc.nextDouble();
        double hm=hcm/100;
        double bmi=w/(hm*hm);
        if(bmi<=18.4){
            System.out.print("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.print("Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.print("Overweight");
        }
        else{
            System.out.print("Obese");
        }

        sc.close();
    }
    
}