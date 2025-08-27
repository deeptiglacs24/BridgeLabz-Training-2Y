import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestI = 0, tallestI = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestI]) {
                youngestI = i;
            }
            if (heights[i] > heights[tallestI]) {
                tallestI = i;
            }
        }

        System.out.println("Youngest friend is: " + names[youngestI]);
        System.out.println("Tallest friend is: " + names[tallestI]);

        sc.close();
    }
}
