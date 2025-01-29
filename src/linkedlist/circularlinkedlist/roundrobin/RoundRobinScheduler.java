package linkedlist.circularlinkedlist.roundrobin;

/**
 * Main class to test the Round Robin Scheduling Algorithm.
 */
public class RoundRobinScheduler {
    public static void main(String[] args) {
        ProcessQueue scheduler = new ProcessQueue(4); // Time quantum set to 4 ms

        // Adding processes
        scheduler.addProcess(1, 8, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 12, 3);
        scheduler.addProcess(4, 6, 2);

        // Display initial queue
        scheduler.displayProcesses();

        // Execute round-robin scheduling
        scheduler.executeProcesses();
    }
}
