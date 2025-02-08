package runtimeanalysis.sorting;

class MergeSort {

    // Recursively sorts the array using Merge Sort algorithm.
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merges two subarrays of arr[].
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of the first subarray
        int n2 = right - mid;     // Size of the second subarray

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        // Merge the temporary arrays back into arr[left...right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy any remaining elements of L[] (if any)
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy any remaining elements of R[] (if any)
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
