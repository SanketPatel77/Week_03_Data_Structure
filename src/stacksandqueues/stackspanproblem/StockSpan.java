package stacksandqueues.stackspanproblem;

import java.util.Stack;
public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while they have a lower or equal price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, span = i + 1, else span = i - stack.top()
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index onto the stack
            stack.push(i);
        }
        return span;
    }
}