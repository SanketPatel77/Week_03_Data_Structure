package stacksandqueues.queueusingstack;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        // call enqueue method to insert data
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // call dequeue method to remove data
        queue.dequeue();
        queue.dequeue();
    }
}
