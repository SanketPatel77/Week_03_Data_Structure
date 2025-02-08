package runtimeanalysis.stringperformance;

/**
 * Main class to test the performance of String, StringBuilder, and StringBuffer concatenation.
 */
public class StringConcatenationTest {
    public static void main(String[] args) {
        int count = 1_00_000; // Number of concatenation operations

        System.out.println("Testing string concatenation performance...\n");

        // Test String (Inefficient)
        new StringConcatenation().concatenate(count);

        // Test StringBuilder (Efficient)
        new StringBuilderConcatenation().concatenate(count);

        // Test StringBuffer (Thread-Safe)
        new StringBufferConcatenation().concatenate(count);
    }
}
