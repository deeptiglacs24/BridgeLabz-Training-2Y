import java.util.*;
public class AreaOfaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cirle:");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("Area of a Circle is : " + a);
    }
}