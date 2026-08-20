/**
 * Demonstrates Binary Search using recursion.
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) due to recursive call stack
 */
public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 66, 77, 88};
        int target = 45;

        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }

    /**
     * Recursively searches for the target element within arr[s..e].
     * Returns the index if found, otherwise -1.
     */
    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; // Base case: element not found
        }

        int mid = (s + e) / 2;

        if (target == arr[mid]) {
            return mid; // Element found
        } else if (target < arr[mid]) {
            return search(arr, target, s, mid - 1); // Search left half
        } else {
            return search(arr, target, mid + 1, e); // Search right half
        }
    }
}
