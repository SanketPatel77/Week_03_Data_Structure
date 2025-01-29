package linkedlist.doublylinkedlist.librarymanagementsystem;

/**
 * Represents a book in the doubly linked list.
 */
class BookNode {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    BookNode prev, next;

    public BookNode(int bookID, String title, String author, String genre) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true; // By default, the book is available
        this.prev = this.next = null;
    }
}
