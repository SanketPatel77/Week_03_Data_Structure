package hashmapsandhashfunctions.longestconsecutivesequence;

import java.util.HashSet;

class FindLongestSequence {
    public static int lengthOfSequence(int[] nums) {
        // Using a HashSet for O(1) lookups
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        // Iterate only over numbers in nums
        for (int num : nums) {
            // Start counting sequence only if num-1 is not present
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive elements
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 3, 4, 8, 1, 2, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println("Longest Consecutive Sequence Length: " + FindLongestSequence.lengthOfSequence(nums));
    }
}
