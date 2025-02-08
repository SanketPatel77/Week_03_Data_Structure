package runtimeanalysis.sorting;

class BubbleSort {

    // Sorts the array using the Bubble Sort algorithm.
    public void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Swaps two elements in the array.
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
