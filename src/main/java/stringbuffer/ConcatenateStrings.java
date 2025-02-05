package stringbuffer;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String [] stringArray = {"how","are","you","my","friend"};
        //call concatenateString method
        String result = concatenateString(stringArray);
        //print result
        System.out.println(result);
    }

    // method to concatenate all the strings in array
    public static String concatenateString(String [] string){
        // StringBuffer object to append strings from array
        StringBuffer concateString = new StringBuffer();
        //loop to iterate each string in array
        for(String word : string){
            concateString.append(word);// append each word to concatString
        }
        return concateString.toString(); // return the final string
    }
}
