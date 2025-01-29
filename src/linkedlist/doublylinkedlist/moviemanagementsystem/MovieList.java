package  linkedlist.doublylinkedlist.moviemanagementsystem;

/**
 * Represents the doubly linked list for managing movie records.
 * Provides methods for adding, removing, searching, updating, and displaying movies.
 */
public class MovieList {
    private MovieNode head; // Pointer to the first node
    private MovieNode tail; // Pointer to the last node

    // Add a movie at the beginning
    public void addAtBeginning(MovieNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a movie at the end
    public void addAtEnd(MovieNode newNode) {
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add a movie at a specific position (1-based index)
    public void addAtPosition(MovieNode newNode, int position) {
        if (position == 1) {
            addAtBeginning(newNode);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
        } else if (temp == tail) {
            addAtEnd(newNode);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie with title \"" + title + "\" not found.");
        } else {
            if (temp == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (temp == tail) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            System.out.println("Movie \"" + title + "\" removed.");
        }
    }

    // Search for movies by director or rating
    public void searchByDirectorOrRating(String director, double rating) {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Movie Found:");
                System.out.println("Title: " + temp.title);
                System.out.println("Director: " + temp.director);
                System.out.println("Year of Release: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.rating + "\n");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with the given director or rating.");
        }
    }

    // Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie \"" + title + "\".");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    // Display all movies in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;
        System.out.println("Movies in Forward Order:");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = tail;
        System.out.println("Movies in Reverse Order:");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper method to display a movie's details
    private void displayMovie(MovieNode node) {
        System.out.println("Title: " + node.title);
        System.out.println("Director: " + node.director);
        System.out.println("Year of Release: " + node.yearOfRelease);
        System.out.println("Rating: " + node.rating + "\n");
    }
}
