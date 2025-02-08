package runtimeanalysis.stringperformance;

/**
 * StringBuilder Concatenation (O(N)): Highly efficient due to in-place modification.
 */
public class StringBuilderConcatenation {
    public void concatenate(int count) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(); // Efficient for string manipulation
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}
