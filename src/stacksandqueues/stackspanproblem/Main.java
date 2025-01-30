package stacksandqueues.stackspanproblem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = StockSpan.calculateSpan(prices);

        // Output the spans
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
