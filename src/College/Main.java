package College;
import College.student.Student;
import College.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Faculty f = new Faculty("Dr. Smith", "Mathematics");
        s.displayDetails();
        f.displayDetails();
    }
}

