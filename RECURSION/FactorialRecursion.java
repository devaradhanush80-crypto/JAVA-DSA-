/**
 * Demonstrates finding the factorial of a number using recursion.
 * Time Complexity: O(n)
 * Space Complexity: O(n) — recursive call stack depth
 */
public class FactorialRecursion {

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }

    /**
     * Returns the factorial of n (n!).
     * Base case: 0! = 1
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}
