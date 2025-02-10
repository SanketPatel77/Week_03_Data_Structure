package runtimeanalysis.comparedsforsearch;

/**
 * Class to perform linear search in an array.
 * Time Complexity: O(N) - Linear search.
 */
public class ArraySearch {

    // Searches for a target element in an array using linear search.

    public static boolean search(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }
}
