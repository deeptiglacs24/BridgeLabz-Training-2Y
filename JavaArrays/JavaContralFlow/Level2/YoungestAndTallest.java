import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("The youngest friend is Amar.");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("The tallest friend is Amar.");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }
        sc.close();
    }
}
