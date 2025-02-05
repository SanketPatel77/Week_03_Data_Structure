package binarysearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,8,12}; // rotated sorted array
        // call method findRotationPoint and print the answer
        System.out.println("Peak element : "+findPeakElement(arr));
    }

    // method to find rotation point
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1; // taking two pointers

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is a peak element
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }

            // If the left neighbor is greater, search the left half
            if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Otherwise, search the right half
            else {
                left = mid + 1;
            }
        }

        // Left will point to a peak element
        return arr[left];
    }
}
