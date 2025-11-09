//package College.main;

import College.student.Student;
import College.faculty.Faculty;
import College.department.Department;
import static java.lang.System.out;

public class Main_10 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Faculty f1 = new Faculty("Dr. Smith", "Mathematics");
        Department d1 = new Department("Computer Science", 120);

        System.out.println("---- College Information ----");
        s1.displayDetails();
        f1.displayDetails();
        d1.display();
    }
}
