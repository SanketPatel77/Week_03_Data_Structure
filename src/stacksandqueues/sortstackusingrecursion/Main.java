package stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(6);
        stack.push(10);
        stack.push(3);
        stack.push(2);

        // create object of SortStack class
        SortStack obj = new SortStack();

        obj.sortStack(stack);

        // print stack in sorted order
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
