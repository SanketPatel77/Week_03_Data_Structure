package stringbuilder;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    //main method
    public static void main(String[] args) {
        String string = "programming"; // create string with duplicate element

        System.out.println("String with duplicate characters : "+string); // print string with duplicate element

        // call method to remove duplicate and print the result
        System.out.println("String without duplicate characters : "+removeDuplicate(string));
    }

    // method to remove duplicates from a string
    public static String removeDuplicate(String string){
        //Create StringBuilder object;
        StringBuilder newString = new StringBuilder();

        // create HashSet to hold unique element
        HashSet<Character> set = new LinkedHashSet<>();

        for(int i = 0; i < string.length(); i++){
            // condition to check if character is present in set or not
            if(!set.contains(string.charAt(i))){
                newString.append(string.charAt(i)); // append string into newString
            }
            set.add(string.charAt(i)); // if character is unique then add it to set
        }

        // return unique string
        return newString.toString();
    }
}
