import java.util.Scanner;
import java.util.Arrays;

/**
 * Demonstrates taking input for a 2D array and printing it row by row.
 */
public class Input2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a 2D array with 3 rows and 2 columns
        int[][] arr = new int[3][2];

        // Taking input for each element
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Printing the 2D array row by row
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close(); // Good practice: close the Scanner when done
    }
}
