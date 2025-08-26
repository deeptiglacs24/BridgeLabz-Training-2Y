import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54);

        System.out.println("Area in sq cm: " + area_cm);
        System.out.println("Area in sq in: " + area_in);
    }
}
