package linearsearch;

public class SearchFirstNegativeNumber {
    public static void main(String[] args) {
        int [] arr = {2,4,5,3,6,78,4,8,-1,2}; // create array of type int

        int result = searchFirstNegative(arr); // call method to find first negative number
        if(result == -1){ // condition if there is no negative number
            System.out.println("No negative words");
            return; // break further execution
        }
        System.out.println("First negative number's index : "+result); // print final result
    }

    // method to find first negative number
    public static int searchFirstNegative(int [] arr){
        // initialize index variable with -1
        int index = -1;
        // iterate array to find negative number
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){ // condition to check number is negative
                return i; // if negative number is found then return its index
            }
        }
        return index; // if there is no negative number then return -1
    }
}
