import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] arr = new int[rows * cols];
        int i = 0;

        System.out.println("Enter elements of matrix:");
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i++] = matrix[i][j];
            }
        }

        System.out.print("1D array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
