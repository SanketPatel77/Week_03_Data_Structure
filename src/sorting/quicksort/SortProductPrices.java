package sorting.quicksort;

import java.util.Arrays;

public class SortProductPrices {

    public static void quickSort(int[] price, int low, int high){
        if(low<high){ // base condition
            int pivotIndex = partition(price, low, high);// call partition method to find pivot's index
            quickSort(price,low,pivotIndex -1); // recursive call for left array
            quickSort(price,pivotIndex+1 , high); // recursive call for right array
        }
    }

    public static int partition(int [] price, int low, int high){
        int pivot = price[high]; // taking pivot last element
        int i = low - 1; // variable that helps in swapping
        // finding pivot's index
        for(int j = low; j< high; j++){
            if(price[j] < pivot){
                i++; // increment i by 1;
                swap(price, i, j); // call swap method to swap ith and jth index value
            }
        }
        swap(price, i+1, high); // call swap method
        return i+1; // return pivot's index
    }

    // method to swap 2 numbers
    public static void swap(int [] price, int low, int high){
        int temp = price[low];
        price[low] = price[high];
        price[high] = temp;
    }

    public static void main(String[] args) {
        // array of product prices
        int[] price = {81, 89, 9, 11, 14, 76, 54, 22, 32};
        //print array before sorting
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(price));
        // call quickSort method to sort array
        quickSort(price, 0, price.length-1);
        // print array after sorting
        System.out.println("\nAfer sorting");
        System.out.println(Arrays.toString(price));


    }
}
