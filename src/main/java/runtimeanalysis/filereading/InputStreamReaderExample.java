package runtimeanalysis.filereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader (Byte Stream) reads bytes and converts them into characters.
 * It is more efficient for reading large files.
 */
public class InputStreamReaderExample {
    public void readFile(String filePath) {
        long startTime = System.currentTimeMillis(); // variable stores startTime

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
            while (reader.read() != -1) { // Reads character by character
                // No operation (Just reading to measure time)
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis(); // variable stores end time
        System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + " ms"); // print time taken by Input stream reader
    }
}
