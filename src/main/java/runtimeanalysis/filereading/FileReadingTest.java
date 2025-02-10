package runtimeanalysis.filereading;

/**
 * Main class to test FileReader vs InputStreamReader for large file reading efficiency.
 */
public class FileReadingTest {
    public static void main(String[] args) {
        String filePath = "src/main/java/runtimeanalysis/filereading/SampleTextFile.txt"; // Replace with an actual 500MB file path

        System.out.println("Testing file reading performance...\n");

        // Test FileReader (Character Stream)
        new FileReaderExample().readFile(filePath);

        // Test InputStreamReader (Byte Stream)
        new InputStreamReaderExample().readFile(filePath);
    }
}
