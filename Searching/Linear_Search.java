/**
 * Demonstrates Linear Search — checks each element sequentially until
 * the target is found or the array ends.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 2};
        int target = 1;

        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    /**
     * Searches for the target sequentially in the array.
     * Returns the index of the first match, or -1 if not found.
     */
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index; // Element found, return its index
            }
        }

        return -1; // Element not found in array
    }
}
