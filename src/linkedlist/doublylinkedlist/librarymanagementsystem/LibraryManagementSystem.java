package linkedlist.doublylinkedlist.librarymanagementsystem;

/**
 * Main class to test the Library Management System.
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBookAtBeginning(101, "The Alchemist", "Paulo Coelho", "Fiction");
        library.addBookAtEnd(102, "1984", "George Orwell", "Dystopian");
        library.addBookAtEnd(103, "To Kill a Mockingbird", "Harper Lee", "Classic");

        // Display books
        System.out.println("Books in Library (Forward Order):");
        library.displayBooksForward();

        // Searching for a book
        library.searchBook("1984");

        // Updating availability status
        library.updateAvailability(102, false);

        // Removing a book
        library.removeBook(101);

        // Display books in reverse order
        System.out.println("Books in Library (Reverse Order):");
        library.displayBooksReverse();

        // Display total books
        System.out.println("Total Books in Library: " + library.getTotalBooks());
    }
}
