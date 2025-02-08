package runtimeanalysis.stringperformance;

/**
 * String Concatenation (O(N²)): Extremely slow for large data due to immutable behavior.
 */
public class StringConcatenation {
    public void concatenate(int count) {
        long startTime = System.currentTimeMillis();

        String str = ""; // Strings are immutable
        for (int i = 0; i < count; i++) {
            str += "a"; // Creates a new object every time (O(N²) complexity)
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using String: " + (endTime - startTime) + " ms");
    }
}
