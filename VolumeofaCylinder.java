
import java.util.*;
public class VolumeofaCylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a Cylinder:");
        double r = sc.nextDouble();
        System.out.println("Enter height of a Cylinder:");
        double h = sc.nextDouble();
        double v = 3.14*r*r*h;
        System.out.println("Volume of a Cylinder is : " + v);
    }
}