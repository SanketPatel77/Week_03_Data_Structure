package runtimeanalysis.searching;

import java.util.Arrays;

public class SearchATarget {
    // linear search method, returns time in milliseconds
    public static double linearSearch(int [] arr, int target) {
        long startTime = System.nanoTime(); // Start time in nanoseconds
        for (int n : arr) {
            if (n == target) break; // Break if target is found
        }
        long endTime = System.nanoTime(); // End time in nanoseconds
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    // binary search method, returns time in milliseconds
    public static double binarySearch(int [] arr, int target) {
        long startTime = System.nanoTime(); // Start time in nanoseconds
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) break;
            else if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        long endTime = System.nanoTime(); // End time in nanoseconds
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    public static void main(String[] args) {
        int dataSize = 1_000_000; // Large data size
        int[] arr = new int[dataSize];
        int target = 25;

        // Fill the array with random numbers
        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        // Measure linear search time
        double linearSearchTime = linearSearch(arr, target);

        // Sort array for binary search
        Arrays.sort(arr);

        // Measure binary search time
        double binarySearchTime = binarySearch(arr, target);

        // Print results
        System.out.println("Time taken by linear search: " + linearSearchTime + " ms");
        System.out.println("Time taken by binary search: " + binarySearchTime + " ms");
    }
}
