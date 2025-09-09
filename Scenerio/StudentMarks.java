
import java.util.*;
class Student{
    String name;
    int rollNo;
    int marks[]=new int[3];

    Student(String name,int rollNo ,int marks[]){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    int getMarks(){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i < marks.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Total Marks: " + getMarks());
        System.out.println("--------------------------------");
    }

    
}
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume extra newline

        Student students[] = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();

            System.out.print("Marks in 3 subjects: ");
            int marks[] = new int[3];
            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline

            students[i] = new Student(name, rollNo, marks);
        }

        // Display all student details
        System.out.println("\nStudent Details:");
        System.out.println("--------------------------------");
        for (Student s : students) {
            s.displayDetails();
        }
        sc.close();
    }
}
