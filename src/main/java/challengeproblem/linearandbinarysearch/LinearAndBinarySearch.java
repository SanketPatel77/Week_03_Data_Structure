package challengeproblem.linearandbinarysearch;

import java.util.Arrays;

public class LinearAndBinarySearch {

    // Method to find the first missing positive integer
    public static int firstMissingPositiveNumber(int[] array) {
        int n = array.length;
        boolean[] present = new boolean[n + 1]; // To track numbers from 1 to n

        // Mark the numbers that are present
        for (int num : array) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Find the first missing positive number
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1; // If all numbers from 1 to n are present, return n + 1
    }

    // Binary Search (requires sorted array)
    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid; // Target found
            else if (arr[mid] > target) end = mid - 1; // Search left half
            else start = mid + 1; // Search right half
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Array declaration
        int[] arr = {1, 4, 2, 56, 34};

        // Finding first missing positive integer
        System.out.println("First missing positive element is: " + firstMissingPositiveNumber(arr));

        // Sorting array before binary search
        Arrays.sort(arr);
        int target = 34;

        // Finding index of target
        int result = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("Result of searching for target " + target + ": " + result);
    }
}
