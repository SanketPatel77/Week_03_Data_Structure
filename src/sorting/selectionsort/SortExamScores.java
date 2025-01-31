package sorting.selectionsort;

import java.util.Arrays;

public class SortExamScores {

    // method of selectionsort
    public static void selectionSort(int [] arr){
        // variable that hold minimum position
        int minPos;

        for(int i = 0; i< arr.length-1; i++){
            minPos = i;
            // loop to find minimum
            for(int j = i+1; j< arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
//            swap minimum with ith index
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        // array of exam scores
        int [] examScores = {88,76,60,90,81};
        selectionSort(examScores);
        System.out.println(Arrays.toString(examScores));
    }
}
