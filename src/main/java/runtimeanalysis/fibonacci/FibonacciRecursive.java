package runtimeanalysis.fibonacci;

/**
 * Class to compute Fibonacci numbers using recursion.
 * Time Complexity: O(2ⁿ) - Exponential
 */
public class FibonacciRecursive {

   // Computes the nth Fibonacci number recursively.

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n; // Base case: Fib(0) = 0, Fib(1) = 1
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive call
    }
}
