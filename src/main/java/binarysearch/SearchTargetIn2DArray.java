package binarysearch;

public class SearchTargetIn2DArray {
    public static void main(String[] args) {
        // create 2D sorted array
        int [][] array = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}} ;      
        
        int target = 12; // target element

        boolean result =  searchTarget(array,target); // call method to search target element

        System.out.println(result); // print result true if available else false
    }

    // method to search target in 2d array
    public static boolean searchTarget(int [][] arr, int target){
        boolean isTargetAvailable = false; // variable holds result
        
        int n = arr.length; // length of rows
        int m = arr[0].length; // length of columns
        
        int low = 0, high = (n * m) - 1; // create two pointers low and high
        // base condition of binary search
        while(low <= high){
            int mid = low + (high - low) / 2;  // mid of the array
            int row = mid / m; // find row from mid
            int col = mid % m; // find column from mid
            if(arr[row][col] == target) return true; // if target is available return true
            if(arr[row][col] > target) high = mid - 1; // if target is smaller shift high = mid - 1
            else low = mid + 1; // else shift low mid+1
        }

        return isTargetAvailable; // return answer
    } 
}
