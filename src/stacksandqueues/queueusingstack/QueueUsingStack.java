package stacksandqueues.queueusingstack;

import java.util.Stack;

// class behave like queue, made with stack
public class QueueUsingStack {

    // create 2 stack to implement queue
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // enqueue method in which value is inserted in 1 stack
    public void enqueue(int data){
        stack1.push(data);
    }

    // dequeue method to extract value  in same order as inserted
    public void dequeue(){
        // using loop whole value of stack1 is pushed to stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        // pop data from stack2
        System.out.println("Removed : "+stack2.pop());
    }
}
