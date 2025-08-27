import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yr = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                double s = sc.nextDouble();
                System.out.print("Enter yr of service of employee " + (i + 1) + ": ");
                double y = sc.nextDouble();

                if (s > 0 && y >= 0) {
                    salary[i] = s;
                    yr[i] = y;
                    break;
                } else {
                    System.out.println("Invalid input! Please re-enter.");
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yr[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal old salary payout: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary payout: " + totalNewSalary);

        sc.close();
    }
}
