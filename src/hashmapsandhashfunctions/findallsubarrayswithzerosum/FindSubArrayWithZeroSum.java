package hashmapsandhashfunctions.findallsubarrayswithzerosum;

import java.util.HashMap;

class SubArrayWithZeroSum {

    public static int countSubArrays(int[] nums) {
        int count = 0;
        int curSum = 0;

        // HashMap to store prefix sum frequencies
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // Initialize with sum 0 occurring once

        for (int num : nums) {
            curSum += num; // Update prefix sum

            // If curSum was seen before, it means subarrays exist with zero sum
            if (sumMap.containsKey(curSum)) {
                count += sumMap.get(curSum);
            }

            // Store/update sum frequency
            sumMap.put(curSum, sumMap.getOrDefault(curSum, 0) + 1);
        }

        return count;
    }
}

public class FindSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, -1, -4, -5, 9, 8, 2, -2};

        System.out.println("The number of subarrays with zero sum is: " + SubArrayWithZeroSum.countSubArrays(nums));
    }
}
