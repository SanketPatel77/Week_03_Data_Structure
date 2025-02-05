package stringbuilder;

public class ReverseString {
    // main method (entry point of code)
    public static void main(String[] args) {
        //  create a variable word of type String
        String word = "Programming";

        // print original string
        System.out.println("Original String : "+word);

        // call reverse method
        String result = reverse(word);

        // Print Reversed string
        System.out.println("Reversed String : "+result);
    }

    //method to reverse string
    public static String reverse(String string){
        //Create StringBuilder object;
        StringBuilder newString = new StringBuilder();

        // append string into newString
        newString.append(string);

        // return reversed string
        return newString.reverse().toString();
    }
}
