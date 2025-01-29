package linkedlist.circularlinkedlist.roundrobin;

/**
 * Represents a process in the round-robin scheduler.
 */
class ProcessNode {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; // Initially, remaining time is equal to burst time
        this.priority = priority;
        this.next = null;
    }
}
