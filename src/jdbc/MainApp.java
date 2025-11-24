package jdbc;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO sdao = new StudentDAO();
        ResultDAO rdao = new ResultDAO();

        while (true) {
            System.out.println("\n=== Student Result Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Result");
            System.out.println("5. View Result");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    sdao.addStudent(new Student(sid, name, course));
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    sdao.viewStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    sdao.deleteStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int rid = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    rdao.addResult(new Result(rid, marks, grade));
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    rdao.viewResult(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

