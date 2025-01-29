package linkedlist.circularlinkedlist.roundrobin;

/**
 * Manages the circular linked list of processes and executes them in a round-robin manner.
 */
class ProcessQueue {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private final int timeQuantum;
    private int totalProcesses = 0;

    /**
     * Constructor to initialize the queue with a fixed time quantum.
     */
    public ProcessQueue(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    /**
     * Adds a process to the end of the circular list.
     */
    public void addProcess(int processID, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(processID, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head; // Circular link
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
        totalProcesses++;
    }

    /**
     * Removes a process from the circular queue.
     */
    private void removeProcess(ProcessNode prev, ProcessNode current) {
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = current.next;
        }
        totalProcesses--;
    }

    /**
     * Simulates the round-robin scheduling.
     */
    public void executeProcesses() {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = tail;
        int totalTime = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;

        System.out.println("Executing processes in Round Robin manner (Time Quantum = " + timeQuantum + " ms):");

        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                int executionTime = Math.min(timeQuantum, current.remainingTime);
                totalTime += executionTime;
                current.remainingTime -= executionTime;

                if (current.remainingTime == 0) {
                    int turnaroundTime = totalTime;
                    int waitingTime = turnaroundTime - current.burstTime;
                    totalWaitingTime += waitingTime;
                    totalTurnaroundTime += turnaroundTime;

                    System.out.println("Process " + current.processID + " completed. Turnaround Time: " + turnaroundTime + " ms, Waiting Time: " + waitingTime + " ms");

                    removeProcess(prev, current);
                    current = prev.next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }

        // Display average waiting and turnaround time
        System.out.println("\nAverage Waiting Time: " + (totalWaitingTime / (double) (totalWaitingTime == 0 ? 1 : totalWaitingTime)) + " ms");
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) (totalTurnaroundTime == 0 ? 1 : totalTurnaroundTime)) + " ms");
    }

    /**
     * Displays the list of processes in the circular queue.
     */
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Processes in the Circular Queue:");
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }
}
