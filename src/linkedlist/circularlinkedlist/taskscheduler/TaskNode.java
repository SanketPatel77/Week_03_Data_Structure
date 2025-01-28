package linkedlist.circularlinkedlist.taskscheduler;

// Node class representing each task in the circular linked list
class TaskNode {
    int taskId;        // Unique identifier for the task
    String taskName;   // Name of the task
    int priority;      // Priority of the task
    String dueDate;    // Due date of the task
    TaskNode next;     // Pointer to the next node in the list (circular)

    // Constructor to initialize the task node with given task details
    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
