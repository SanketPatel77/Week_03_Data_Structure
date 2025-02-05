package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\filereader\\question.txt"; // path of file
        readAndPrint(filePath); // call method that read file
    }

    // method to read and print file
    public static void readAndPrint(String filePath)  {
        // create FileReader object
        FileReader reader ;
        // try-catch block if any exception occurs
        try {
            // create object of BufferedReader class
            BufferedReader bufferReader = new BufferedReader(new FileReader(filePath));
            String line; // variable that hold line of file
            while((line = bufferReader.readLine()) != null){
                System.out.println(line); // print line to console
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found" + e.getMessage()); // message if file not found exception occurs
        }catch (IOException e){
            System.out.println("Error while reading file "+ e.getMessage()); // message if any exception occurs while reading file

        }
    }
}
