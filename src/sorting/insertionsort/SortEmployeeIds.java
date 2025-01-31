package sorting.insertionsort;

import java.util.Arrays;

public class SortEmployeeIds {
    public static void main(String[] args) {
        // Array of employee IDs to be sorted
        int [] employeeIds = {101, 110, 104, 120, 111, 102, 107, 113};
        int n = employeeIds.length; // Length of the array

        // Implementation of Insertion Sort algorithm
        for(int i = 1; i < n; i++){
            int key = employeeIds[i]; // Store the current element as the key
            int prev = i - 1; // Initialize prev as the previous index
            // Shift elements of the sorted part of the array to the right
            // until the correct position for key is found
            while(prev >= 0 && employeeIds[prev] > key){
                employeeIds[prev+1] = employeeIds[prev]; // Move element one position ahead
                prev--; // Move to the previous element
            }
            employeeIds[prev+1] = key; // Place the key at its correct position
        }

        // Print the sorted array
        System.out.println(Arrays.toString(employeeIds));
    }
}
