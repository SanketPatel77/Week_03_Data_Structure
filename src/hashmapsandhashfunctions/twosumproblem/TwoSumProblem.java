package hashmapsandhashfunctions.twosumproblem;

import java.util.HashMap;

// class to find two sum
class FindTwoSum {
    public static int[] findTwoIndex(int []nums, int n, int target) {
        HashMap<Integer , Integer> prev = new HashMap<>();

        // looping through array
        for (int i = 0; i < n; i++) {
            // checking if the other number is in hashmap or not
            if (prev.getOrDefault(target - nums[i], 0) != 0) {

                return new int[] {prev.get(target - nums[i]), i+1};
            }
            // pushing the ith val in hashmap
            prev.put(nums[i], i+1);

        }
        return new int[] {-1, -1};
    }
}

public class TwoSumProblem {
    public static void main(String[] args) {
        // example array
        int size = 10;
        int []nums = {1, 2, 3, 5, 8, 4, 1, 9, 6, 0};
        // getting the two index from functon
        int [] ans = FindTwoSum.findTwoIndex(nums, size, 3);
        System.out.println(ans[0] +" "+ ans[1]);
    }
}