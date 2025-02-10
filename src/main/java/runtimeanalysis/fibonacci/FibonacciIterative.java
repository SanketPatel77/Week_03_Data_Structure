package runtimeanalysis.fibonacci;

/**
 * Class to compute Fibonacci numbers using an iterative approach.
 * Time Complexity: O(N) - Linear
 */
public class FibonacciIterative {

   //Computes the nth Fibonacci number iteratively.

    public static int fibonacciIterative(int n) {
        // Base case: If n is 0 or 1, return n itself
        if (n <= 1) {
            return n; // Fib(0) = 0, Fib(1) = 1
        }

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1, sum;

        // Compute Fibonacci numbers iteratively up to nth term
        for (int i = 2; i <= n; i++) {
            sum = a + b; // Next Fibonacci number is sum of previous two
            a = b;       // Shift a to b
            b = sum;     // Shift b to the new sum
        }

        // Return the nth Fibonacci number
        return b;
    }
}
