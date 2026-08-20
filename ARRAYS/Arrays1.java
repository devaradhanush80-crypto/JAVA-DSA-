/**
 * Demonstrates basic array declaration, initialization, and traversal in Java.
 */
public class Arrays1 {
    public static void main(String[] args) {

        // Array of String literals with predefined values
        String[] names = {"Dhanush", "Anki Reddy", "Bhanu", "Lakshmi Kanth Naidu"};

        // Array declared using 'new' keyword with a fixed size (elements default to null)
        String[] emptyArray = new String[10];

        // Traversing and printing the 'names' array
        System.out.println("Names array:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println("\n");

        // Traversing and printing the 'emptyArray' (will print 'null' for unassigned indices)
        System.out.println("Empty array (uninitialized values):");
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.print(emptyArray[i] + " ");
        }
    }
}
