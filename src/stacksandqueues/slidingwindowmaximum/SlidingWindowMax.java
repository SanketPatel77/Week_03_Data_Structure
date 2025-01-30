package stacksandqueues.slidingwindowmaximum;

import java.util.*;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || k <= 0) return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of window
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // Remove elements smaller than arr[i]
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add the current index
            dq.offer(i);

            // Store result when the window is fully formed
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peek()];
            }
        }
        return result;
    }

}
