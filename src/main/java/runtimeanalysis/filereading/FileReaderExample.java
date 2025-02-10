package runtimeanalysis.filereading;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader (Character Stream) reads characters one by one.
 * It is suitable for text-based data but slower for large files.
 */
public class FileReaderExample {
    public void readFile(String filePath) {
        long startTime = System.currentTimeMillis(); // variable stores start Time

        try (FileReader reader = new FileReader(filePath)) {
            while (reader.read() != -1) { // Reads character by character
                // No operation (Just reading to measure time)
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();  // variable stores end Time
        System.out.println("Time taken using FileReader: " + (endTime - startTime) + " ms"); // print time taken by Input stream reader
    }
}
