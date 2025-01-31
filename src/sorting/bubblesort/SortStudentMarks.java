package sorting.bubblesort;

import java.util.Arrays;

public class SortStudentMarks {
    public static void main(String[] args) {
        //array of student's marks
        int [] studentMarks = {90,88,79,75,82};
        int n = studentMarks.length; // storing length of studentMarks array in variable n;
        for(int i = 0; i < n  ; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(studentMarks[j] > studentMarks[j+1]){
                    // code for swap
                    int temp = studentMarks[j];
                    studentMarks[j] = studentMarks[j+1];
                    studentMarks[j+1] = temp;
                }
            }
        }
        // print sorted array
        System.out.println(Arrays.toString(studentMarks));
    }
}

