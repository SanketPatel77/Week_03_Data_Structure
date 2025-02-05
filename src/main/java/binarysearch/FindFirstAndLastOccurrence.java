package binarysearch;

public class FindFirstAndLastOccurrence {

    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3,4,5,5,5,5,6,8,12,12,12}; // array with duplicate element

        int target = 5; // target element

        int[] result = findFirstAndLast(arr, target);  // result array with first and last occurrence
        System.out.println("First Occurrence: " + result[0]); // first occurrence
        System.out.println("Last Occurrence: " + result[1]); //last occurrence
    }

    // method to find first and last occurrence
    public static int[] findFirstAndLast(int [] arr, int target){
        // return array of first and last occurrence
        return new int[] {findOccurrence(arr,target,true),findOccurrence(arr,target,false)};
    }

    // method to find index of number
    public static int findOccurrence(int [] arr, int target, boolean first){
        int left = 0, right = arr.length - 1; // two pointer to traverse array
        int result = -1; // result variable if no occurrence then return -1;
        // binary search
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                result = mid; // Store the index
                if (first) right = mid - 1; // Move left for first occurrence
                else left = mid + 1; // move right for last occurrence
            }else if(arr[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return result;
    }
}
