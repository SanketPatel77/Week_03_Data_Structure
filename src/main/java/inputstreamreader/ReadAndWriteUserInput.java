package inputstreamreader;

import java.io.*;
import java.nio.Buffer;

public class ReadAndWriteUserInput {
    public static void main(String[] args) {
        // call method to read from console and write in file
        readAndWrite();
    }

    // method to read from console and write in file
    public static void readAndWrite(){
        try( // try-with-resources
             // create objects
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter writer = new FileWriter("src/main/java/inputstreamreader/input.txt");
        )
        {
            System.out.println("Enter input (enter exit to close)"); // ask user to enter text

            String line; // line object to hold line that user enter
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                writer.write(line+ "\n");// call writer's method to write in file
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found : "+ e.getMessage());
        }catch (IOException e){
            System.out.println("Exception while writing file : "+e.getMessage());
        }
    }
}
