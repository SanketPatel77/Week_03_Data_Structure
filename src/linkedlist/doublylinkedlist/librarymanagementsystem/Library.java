package linkedlist.doublylinkedlist.librarymanagementsystem;

/**
 * Manages the doubly linked list of books and provides library functionalities.
 */
class Library {
    private BookNode head, tail;
    private int bookCount = 0;


    // Adds a new book to the beginning of the list.
    public void addBookAtBeginning(int bookID, String title, String author, String genre) {
        BookNode newBook = new BookNode(bookID, title, author, genre);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }


     //Adds a new book to the end of the list.

    public void addBookAtEnd(int bookID, String title, String author, String genre) {
        BookNode newBook = new BookNode(bookID, title, author, genre);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }


    //Removes a book from the library using Book ID.

    public void removeBook(int bookID) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                bookCount--;
                System.out.println("Book ID " + bookID + " removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID " + bookID + " not found.");
    }


     //Searches for a book by Title or Author.

    public void searchBook(String query) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
                System.out.println("Book Found: " + temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }


     //Updates the availability status of a book.

    public void updateAvailability(int bookID, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                System.out.println("Book ID " + bookID + " availability updated to " + (status ? "Available" : "Checked Out"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID " + bookID + " not found.");
    }


     //Displays all books in forward order.

    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookID + " - " + temp.title + " by " + temp.author + " (" + temp.genre + ") - " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.next;
        }
    }


     //Displays all books in reverse order.

    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookID + " - " + temp.title + " by " + temp.author + " (" + temp.genre + ") - " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.prev;
        }
    }


     //Returns the total number of books in the library.
    public int getTotalBooks() {
        return bookCount;
    }
}
