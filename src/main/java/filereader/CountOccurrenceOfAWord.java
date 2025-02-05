package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountOccurrenceOfAWord {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\filereader\\question.txt"; // path of the file

        String word = "the"; // word to find occurrence

        int count = countOccurrence(filePath, word); // call to method countOccurrencd

        System.out.println("Count of word \""+word+"\" is : "+count); // print final answer
    }

    // method to count occurrence
    public static int countOccurrence(String filePath, String word){
        // create FileReader object
        FileReader reader;
        int count = 0; // count variable that stores occurrence of a word
        try{
            // BufferedReader class's object
            BufferedReader bufferReader = new BufferedReader(new FileReader(filePath));
            String line ; // variable line of type String
            while((line = bufferReader.readLine())!=null){ // loop to iterate file
                String [] arr  = line.toLowerCase().split("\\s+"); // split by space,newLine and tabs and store into array
                // loop to check occurrence of the word from array
                for(String s : arr){
                    if(s.equals(word)){
                        count++; // if word is present in the array then increment count by 1;
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found "+ e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Error while reading file "+ e.getMessage());
            e.printStackTrace();
        }
        return count;
    }
}
