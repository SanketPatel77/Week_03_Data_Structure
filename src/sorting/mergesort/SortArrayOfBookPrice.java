package sorting.mergesort;

import java.util.Arrays;

public class SortArrayOfBookPrice {
    // Method to sort array
    public static void mergeSort(int[] arr ,int left, int right){
        // check base condition when recursive method stop
        if(left>=right) return;
        // find mid of  array
        int mid = left + (right - left)/2;
        // recursive call to divide left part further
        mergeSort(arr,left,mid);
        // recursive call to divide right part further
        mergeSort(arr,mid+1,right);

        // call merge method to merge all divided part
        merge(arr,left, mid, right);
    }

    // Method to merge all divided part
    public static void merge(int[] arr, int left, int mid, int right){
        // create temp array
        int [] temp = new int[right - left + 1];
        int start = left; // variable initialize with left
        int end = mid+1; // variable initialize with mid+1
        int k = 0; // variable k to hold indexes of temp array

        // copying left and right array to temp array
        while(start <= mid && end <= right){
            if(arr[start] < arr[end]){
                temp[k++] = arr[start++];
            }else{
                temp[k++] = arr[end++];
            }
        }
        // another loop if right array is small so the remaining part of left array should be filled
        while(start <= mid){
            temp[k++] = arr[start++];
        }
        // another loop if left array is small so the remaining part of right array should be filled
        while(end <= right){
            temp[k++] = arr[end++];
        }

        // copying temp array to original array arr
        for(k = 0, start = left; k < temp.length; k++,start++ ){
            arr[start] = temp[k];
        }

    }

    public static void main(String[] args) {
        // array of book price
        int [] bookPrice = {499,299,100,650,250,};
        // print array before sorting
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(bookPrice));
        // call to mergeSort for sort array
        mergeSort(bookPrice, 0,bookPrice.length-1);
        // print array after sorting
        System.out.println("\nAfter sorting");
        System.out.println(Arrays.toString(bookPrice));
    }
}
