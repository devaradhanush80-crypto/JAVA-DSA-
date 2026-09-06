import java.util.Scanner;

/**
 * Demonstrates taking user input to fill a 1D array and printing it.
 */
public class InputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        // Taking input for each element of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Good practice: close the Scanner when done
    }
}
