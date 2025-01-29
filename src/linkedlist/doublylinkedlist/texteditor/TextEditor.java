package linkedlist.doublylinkedlist.texteditor;

public class TextEditor {
    public static void main(String[] args) {
        // Create an instance of TextHistory to manage undo/redo functionality
        TextHistory history = new TextHistory();

        // Adding text states
        history.addState("Hello");
        history.addState("Hello user");
        history.addState("how are you!");

        // Display the current text state
        history.displayCurrentState();

        // Undo the last change
        history.undo();
        history.displayCurrentState();

        // Undo one more time
        history.undo();
        history.displayCurrentState();

        // Redo the last undone change
        history.redo();
        history.displayCurrentState();
    }
}
