package stacksandqueues.sortstackusingrecursion;
import java.util.Stack;

public class SortStack {

    public void insertStack(Stack<Integer> stack, int currValue){
        // if stack is empty to push current value, or according to condition
        if(stack.isEmpty() || stack.peek() > currValue){
            stack.push(currValue);
        }else{
            int temp = stack.pop(); // if current value is smaller then peep, so pop and compare with next value
            insertStack(stack,currValue);// recursive call
            stack.push(temp);
        }
    }

    // method to sort stack in ascending order
    public void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int currValue = stack.pop(); // popped current value
        sortStack(stack); // recursive call

        // call another recursive method to insert element in ascending order in stack
        insertStack(stack, currValue);
    }
}
