import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80)
                grade[i] = "Level 4";
            else if (percentage[i] >= 70)
                grade[i] = "Level 3";
            else if (percentage[i] >= 60)
                grade[i] = "Level 2+";
            else if (percentage[i] >= 50)
                grade[i] = "Level 2";
            else if (percentage[i] >= 40)
                grade[i] = "Level 1";
            else
                grade[i] = "Remedial";
        }

        System.out.println("\n--- STUDENT REPORT ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Student", "Physics", "Chemistry", "Maths", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), physics[i], chemistry[i], maths[i], grade[i]);
        }

        sc.close();
    }
}
