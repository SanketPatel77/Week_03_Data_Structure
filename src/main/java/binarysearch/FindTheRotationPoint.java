package binarysearch;

public class FindTheRotationPoint {
    public static void main(String[] args) {
        int [] arr = {4,5,6,1,2,3}; // rotated sorted array
        // call method findRotationPoint and print the answer
        System.out.println("Rotation point : "+findRotationPoint(arr));
    }

    // method to find rotation point
    public static int findRotationPoint(int [] arr){
        // Binary search
        int left = 0; // start left pointer from 0
        int right = arr.length - 1; // start right pointer from length - 1
        while(left < right){
            int mid = left + (right - left) / 2; // find mid using formula
            if(arr[mid] > arr[right]){
                left = mid + 1; // if value at mid index is greater than value at right index then shirt left pointer to mid+1
            }else{
                right = mid; // else right = mid
            }
        }
        return left; // return the smallest index
    }
}
