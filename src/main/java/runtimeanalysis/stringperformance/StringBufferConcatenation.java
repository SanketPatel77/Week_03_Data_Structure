package runtimeanalysis.stringperformance;

/**
 * StringBuffer Concatenation (O(N)): Thread-safe but slightly slower due to synchronization.
 */
public class StringBufferConcatenation {
    public void concatenate(int count) {
        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer(); // Thread-safe but slower than StringBuilder
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " ms");
    }
}
