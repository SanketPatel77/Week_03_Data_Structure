package sorting.heapsort;

import java.util.Arrays;

public class SortJobApplicationsBySalary {

        // Function to sort an array using Heap Sort
        public static void heapSort(int[] arr) {
            int n = arr.length;

            // Step 1: Build Max Heap (Rearrange the array)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // Step 2: Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Move the current root (max element) to the end
                swap(arr, 0, i);

                // Call heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        // Function to heapify a subtree rooted at index i
        public static void heapify(int[] arr, int n, int i) {
            int largest = i;       // Initialize largest as root
            int left = 2 * i + 1;  // Left child
            int right = 2 * i + 2; // Right child

            // If left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            // If right child is larger than the current largest
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // If the largest is not the root, swap and continue heapifying
            if (largest != i) {
                swap(arr, i, largest);
                heapify(arr, n, largest);
            }
        }

        // Function to swap two elements in an array
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            heapSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
}
