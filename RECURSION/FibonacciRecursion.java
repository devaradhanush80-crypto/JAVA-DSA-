/**
 * Demonstrates finding the nth Fibonacci number using recursion.
 * Time Complexity: O(2^n) — exponential, due to repeated subproblem calls
 * Space Complexity: O(n) — recursive call stack depth
 */
public class FibonacciRecursion {

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println(result);
    }

    /**
     * Returns the nth Fibonacci number.
     * Base case: fib(0) = 0, fib(1) = 1
     */
    static int fibonacci(int n) {
        if (n < 2) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}
