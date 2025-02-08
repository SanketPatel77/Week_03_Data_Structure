package runtimeanalysis.sorting;

import java.util.Arrays;

public class SortingLargeData {
    // Main method to compare sorting algorithms
    public static void main(String[] args) {
        int dataSize = 10000; // Define the size of the dataset

        // Initialize the original array with random integers between 0 and 99
        int[] originalArr = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            originalArr[i] = (int) (Math.random() * 100);
        }

        // Call sorting functions with a copy of the original array to ensure each algorithm gets the same data
        callQuickSort(Arrays.copyOf(originalArr, originalArr.length));
        callMergeSort(Arrays.copyOf(originalArr, originalArr.length));
        callBubbleSort(Arrays.copyOf(originalArr, originalArr.length));
    }

    // Method to compute operation time and print time taken by Bubble Sort.
    public static void callBubbleSort(int[] arr) {
        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.currentTimeMillis(); // Start time
        bubbleSort.bubbleSort(arr); // Perform Bubble Sort
        long endTime = System.currentTimeMillis(); // End time

        // Print execution time and whether the array is sorted correctly
        System.out.println("Time taken by Bubble Sort: " + (endTime - startTime) + " ms");
    }

    // Method to compute operation time and print time taken by Merge Sort.
    public static void callMergeSort(int[] arr) {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.currentTimeMillis(); // Start time
        mergeSort.mergeSort(arr, 0, arr.length - 1); // Perform Merge Sort
        long endTime = System.currentTimeMillis(); // End time

        // Print execution time and whether the array is sorted correctly
        System.out.println("Time taken by Merge Sort: " + (endTime - startTime) + " ms");
    }

    // Method to compute operation time and print time taken by Quick Sort.
    public static void callQuickSort(int[] arr) {
        QuickSort quickSort = new QuickSort();
        long startTime = System.currentTimeMillis(); // Start time
        quickSort.quickSort(arr, 0, arr.length - 1); // Perform Quick Sort
        long endTime = System.currentTimeMillis(); // End time

        // Print execution time and whether the array is sorted correctly
        System.out.println("Time taken by Quick Sort: " + (endTime - startTime) + " ms");
    }
}
