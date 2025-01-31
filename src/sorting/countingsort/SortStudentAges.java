package sorting.countingsort;

import java.util.Arrays;

public class SortStudentAges {

    // countingSort method
    public static void coutingSort(int [] arr){
        // find largest number in array
        int largest = Integer.MIN_VALUE;
        for (int j : arr) {
            largest = Math.max(largest, j);
        }
        // create count array of size largest + 1
        int [] count = new int[largest+1];
        for(int i = 0; i < arr.length ; i++){
            count[arr[i]]++; // count frequencies
        }

        // sorting array
        int j = 0; // variable to traverse original array
        for(int i = 0; i< count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        // array of students age between 10 to 18 years
        int [] studentAge =  {10,12,10,14,13,15,16,11,17,18,14,18};
        // print before sorting
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(studentAge));
        // call countingSort method to sort array
        coutingSort(studentAge);
        // print sorted array
        System.out.println("\nAfter sorting");
        System.out.println(Arrays.toString(studentAge));
    }
}
