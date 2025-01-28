package linkedlist.circularlinkedlist.taskscheduler;
// Driver class to test the functionality of the Task Scheduler
public class TaskScheduler {
    public static void main(String[] args) {
        CircularLinkedList scheduler = new CircularLinkedList();

        // Adding tasks
        scheduler.addTaskAtBeginning(1, "Task 1", 1, "2025-01-31");
        scheduler.addTaskAtEnd(2, "Task 2", 2, "2025-02-10");
        scheduler.addTaskAtPosition(1, 3, "Task 3", 1, "2025-02-05");

        // Displaying tasks
        System.out.println("All tasks in the list:");
        scheduler.displayTasks();

        // Searching for tasks by priority
        System.out.println("\nSearching for tasks with priority 1:");
        scheduler.searchTaskByPriority(1);

        // Viewing the current task and moving to the next task
        System.out.println("\nViewing current task:");
        scheduler.viewCurrentTask();

        // Removing a task by ID
        scheduler.removeTaskById(2);

        // Displaying tasks after removal
        System.out.println("\nAll tasks after removal:");
        scheduler.displayTasks();
    }
}
