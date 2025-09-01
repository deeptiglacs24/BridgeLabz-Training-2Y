import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0'; 
        }
        return digits;
    
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true; 
            }
        }
        return false;
    }
    public static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }
    public static void findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }
    public static void findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }
    public static void main(String[] args) {
        int number = 153; 

        System.out.println("Number: " + number);
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);
        int[] digits = getDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong? " + isArmstrong(number, digits));
        findLargestTwo(digits);
        findSmallestTwo(digits);
    }
}

