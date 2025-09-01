import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2{

    // Method 1: Find count of digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method 2: Store digits of number in an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method 3: Find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method 4: Find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method 5: Check if Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method 6: Frequency of each digit (2D array)
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 10 rows for digits 0-9

        // Initialize digit values in first column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Digits array
        int[] digits = getDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares
        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSq);

        // Harshad number check
        System.out.println("Is Harshad number? " + isHarshad(number, digits));

        // Frequency of digits
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }

        sc.close();
    }
}
