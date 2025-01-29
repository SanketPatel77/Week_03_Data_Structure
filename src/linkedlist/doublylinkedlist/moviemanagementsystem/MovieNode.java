package linkedlist.doublylinkedlist.moviemanagementsystem;

/**
 * Represents a node in the doubly linked list.
 * Each node contains details of a movie, including Title, Director, Year of Release, Rating,
 * and pointers to the next and previous nodes.
 */
public class MovieNode {
    public String title;
    public String director;
    public int yearOfRelease;
    public double rating;
    public MovieNode next; // Pointer to the next node
    public MovieNode prev; // Pointer to the previous node

    // Constructor
    public MovieNode(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
