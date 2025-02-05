package stringbuffer;

public class CompareStringBufferWithStringBuilder {
    public static void main(String[] args) {
        long bufferTime = executionStringBuffer(); // execution time of StringBuffer class

        long builderTime = executionStringBuilder(); // execution time of StringBuilder class

        System.out.println("Time taken by Buffer : "+bufferTime); // print time taken by Buffer class

        System.out.println("Time taken by Builder : "+builderTime); // print time taken by Builder class
    }

    // method to calculate time of execution for StringBuffer class
    public static long executionStringBuffer(){
        StringBuffer string = new StringBuffer();// create object of StringBuffer class

        long startTime = System.nanoTime(); // startTime

        for(int i = 0; i < 1000; i++){ // iterate loop 1000 times
            string.append("hello"); // append string "hello"
        }

        long endTime = System.nanoTime(); // endTime

        return (endTime - startTime); // retun actual time taken by Buffer class to append string 1000 times
    }

    // method to calculate time of execution for StringBuilder class
    public static long executionStringBuilder(){
        StringBuilder string = new StringBuilder(); // create object of StringBuilder class

        long startTime = System.nanoTime(); // startTime

        for(int i = 0; i < 1000; i++){ // iterate loop 1000 times
            string.append("hello"); // append string "hello"
        }

        long endTime = System.nanoTime(); // endTime

        return (endTime - startTime); // return actual time taken by Builder class to append string 1000 times
    }
}
