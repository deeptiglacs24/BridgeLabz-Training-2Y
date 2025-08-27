import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] w = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter w of person " + (i + 1) + " (in kg): ");
            w[i] = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " (in meters): ");
            height[i] = sc.nextDouble();
            bmi[i] = w[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println("\n--- BMI REPORT ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Person", "w", "Height", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15s\n", (i + 1), w[i], height[i], status[i]);
        }

        sc.close();
    }
}
