import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates taking user input into an ArrayList and printing it.
 * Note: ArrayList uses list.get(index) to access elements — 
 * unlike arrays, it does NOT support list[index] syntax.
 */
public class InputArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Taking 5 integer inputs into the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // Printing the ArrayList elements using .get(index)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close(); // Good practice: close the Scanner when done
    }
}
