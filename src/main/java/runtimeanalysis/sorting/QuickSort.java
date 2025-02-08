package runtimeanalysis.sorting;

class QuickSort {

    // Sorts the array using the Quick Sort algorithm.
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot index after partitioning
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array by placing the pivot element in the correct position.
     * Elements smaller than the pivot are moved to the left,
     * and elements greater than the pivot are moved to the right.
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for the smaller element

        // Loop through the array and place smaller elements before the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    //Swaps two elements in the array.
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
