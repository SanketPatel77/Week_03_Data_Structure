package linkedlist.doublylinkedlist.texteditor;

class TextHistory {
    private TextNode head, tail, current;
    private final int MAX_HISTORY = 10;
    private int size = 0;

    // Add a new state to the history
    public void addState(String text) {
        TextNode newNode = new TextNode(text);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        if (head == null) head = newNode;
        tail = newNode;

        size++;
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Undo not possible.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Redo not possible.");
        }
    }

    // Display the current state of text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}
