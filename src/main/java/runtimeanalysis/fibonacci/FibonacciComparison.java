package runtimeanalysis.fibonacci;

public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 30; // Define Fibonacci index to compute

        // Measure time for Recursive approach
        long startRecursive = System.currentTimeMillis();
        int resultRecursive = FibonacciRecursive.fibonacciRecursive(n);
        long endRecursive = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci (" + n + "): " + resultRecursive);
        System.out.println("Time taken by Recursive: " + (endRecursive - startRecursive) + " ms");

        // Measure time for Iterative approach
        long startIterative = System.currentTimeMillis();
        int resultIterative = FibonacciIterative.fibonacciIterative(n);
        long endIterative = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci (" + n + "): " + resultIterative);
        System.out.println("Time taken by Iterative: " + (endIterative - startIterative) + " ms");
    }
}
