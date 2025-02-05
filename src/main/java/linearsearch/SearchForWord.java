package linearsearch;

public class SearchForWord {

    public static void main(String[] args) {
        String[] sentences = {
                "Java is a popular programming language.",
                "Python and Java are widely used in software development.",
                "Machine learning is an exciting field.",
                "I love solving problems using Java."
        }; // create sentences array of type String

        String word = "java"; // word to search in array

        String result = searchForWord(sentences, word); // call method to searchForWord
        System.out.println("Sentence that contains the word : "+result); // print final result
    }

    // method to find searchForWord
    public static String searchForWord(String [] arr, String word){
        // for-each loop to iterate array
        for (String s : arr) {
            if(s.toLowerCase().contains(word.toLowerCase())){ // check condition  sentence contains word or not
                return s; // if yes return sentence
            }
        }
        return "Not found"; // if no sentence contains that word then return "not found"
    }
}
