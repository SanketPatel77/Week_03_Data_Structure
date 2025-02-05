package inputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        String filePath = "src/main/java/inputstreamreader/someText.txt"; // path of file

        // call convertByteToCharacter method
        convertByteToCharacter(filePath);
    }

    // method to convert byte stream to character stream
    public static void convertByteToCharacter(String filePath){
        // try-catch block to handle exception if occurs
        try {
            FileInputStream fileInputReader = new FileInputStream(filePath); // filReader object
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputReader, StandardCharsets.UTF_8); // inputStreamReader object
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // create buffered reader object

            String line ; // line variable hold one line at time
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line); // print a line from file
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found "+e.getMessage());
        }catch (IOException e){
            System.out.println("Exception while read file " + e.getMessage());
        }
    }
}
