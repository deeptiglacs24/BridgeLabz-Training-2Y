
import com.university.department.cse.Course;
import com.bank.util.InterestCalculator;
import static java.lang.Math.pow;
import com.company.hr.Employee;
import com.company.payroll.Payroll;
import library.books.Book;
import library.members.Member;
import library.transactions.Transactions;

import College.faculty.Faculty;
import College.student.Student;

public class MainApp {
    public static void main(String[] args) {
    	Student s = new Student("Alice", 101);
        Faculty f = new Faculty("Dr. Smith", "Mathematics");
        s.displayDetails();
        f.displayDetails();
    	
        Course c = new Course();
        c.printCourseDetails();
        
        
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        System.out.println("Added: " + book1);

        // Register a new member
        Member member1 = new Member("John Doe", 101);
        System.out.println("Registered: " + member1);

        // Issue the book to the member
        Transactions transaction1 = new Transactions(book1, member1);
        transaction1.issueBook();

        // Optionally: Return the book
        transaction1.returnBook();
        
        
        Employee emp = new Employee(1, "Alice", "IT", 60000);
        Payroll payroll = new Payroll();

        System.out.println("Employee Details:");
        System.out.println(emp);

        double updatedSalary = payroll.calculateBonus(emp);
        System.out.println("Salary after 10% bonus: " + updatedSalary);
        
        //q7
        double principal = 10000;
        double rate = 5;
        double time = 3; // years

        double simpleInterest = InterestCalculator.calculateSimpleInterest(principal, rate, time);
        double compoundInterest = InterestCalculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest (using static import pow()): " + compoundInterest);
        
    }
}

