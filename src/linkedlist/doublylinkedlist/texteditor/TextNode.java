package linkedlist.doublylinkedlist.texteditor;

// Node class representing each text state
class TextNode {
    String text;
    TextNode prev, next;

    public TextNode(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}
