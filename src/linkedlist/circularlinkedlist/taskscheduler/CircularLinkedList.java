package linkedlist.circularlinkedlist.taskscheduler;
// Circular Linked List class to manage tasks
class CircularLinkedList {
    TaskNode head;  // Head node pointing to the first task in the list

    // Add a task at the beginning of the circular linked list
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;  // Circular link to itself when the list is empty
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;  // Traverse to the last task in the list
            }
            temp.next = newTask;  // Link the last task to the new task
            newTask.next = head;  // Make the new task point back to the head, completing the circle
            head = newTask;       // Make the new task the head of the list
        }
    }

    // Add a task at the end of the circular linked list
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;  // Circular link to itself when the list is empty
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;  // Traverse to the last task in the list
            }
            temp.next = newTask;  // Link the last task to the new task
            newTask.next = head;  // Make the new task point back to the head, completing the circle
        }
    }

    // Add a task at a specific position in the circular linked list
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (position == 0) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);  // Special case for adding at the beginning
        } else {
            TaskNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                if (temp.next == head) return;  // Prevent out-of-bound access
                temp = temp.next;
            }
            newTask.next = temp.next;  // Link the new task to the next task
            temp.next = newTask;       // Link the previous task to the new task
        }
    }

    // Remove a task by its Task ID from the circular linked list
    public void removeTaskById(int taskId) {
        if (head == null) return;  // If the list is empty, do nothing

        if (head.taskId == taskId) {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;  // Traverse to the last task in the list
            }
            if (head.next == head) {
                head = null;  // Special case for single node list
            } else {
                temp.next = head.next;  // The last task points to the second task, removing the head
                head = head.next;       // Move the head to the second task
            }
            return;
        }

        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;  // Traverse the list to find the task with the given ID
        }

        if (temp.next != head) {
            temp.next = temp.next.next;  // Skip the task to be removed
        }
    }

    // View the current task and move to the next task in the circular list
    public void viewCurrentTask() {
        if (head != null) {
            TaskNode temp = head;
            do {
                // Print the current task details
                System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                temp = temp.next;  // Move to the next task in the circular list
            } while (temp != head);  // Continue until we loop back to the head
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks in the list starting from the head node
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        do {
            // Print the details of each task in the list
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;  // Move to the next task in the list
        } while (temp != head);  // Continue until we loop back to the head
    }

    // Search for tasks by Priority and display them
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                // Print the task with the matching priority
                System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;  // Move to the next task in the circular list
        } while (temp != head);  // Continue until we loop back to the head

        if (!found) {
            System.out.println("No tasks found with the given priority.");
        }
    }
}
