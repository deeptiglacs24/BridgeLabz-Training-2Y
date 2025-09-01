import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; 
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (m): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("Athlete must complete " + Math.ceil(rounds) + " rounds to cover 5 km.");
        sc.close();
    }
}
