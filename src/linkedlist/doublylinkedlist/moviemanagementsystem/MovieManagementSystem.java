package linkedlist.doublylinkedlist.moviemanagementsystem;

/**
 * Main class to test the Movie Management System.
 */
public class MovieManagementSystem {
    public static void main(String[] args) {
        // Create the movie list
        MovieList movieList = new MovieList();

        // Add sample movies
        movieList.addAtBeginning(new MovieNode("Inception", "Christopher Nolan", 2010, 9.0));
        movieList.addAtEnd(new MovieNode("The Dark Knight", "Christopher Nolan", 2008, 9.1));
        movieList.addAtEnd(new MovieNode("Interstellar", "Christopher Nolan", 2014, 8.6));
        movieList.addAtPosition(new MovieNode("Tenet", "Christopher Nolan", 2020, 7.8), 2);

        // Display all movies
        movieList.displayForward();

        // Search for movies
        movieList.searchByDirectorOrRating("Christopher Nolan", 8.6);

        // Update a movie's rating
        movieList.updateRating("Interstellar", 9.0);

        // Remove a movie
        movieList.removeByTitle("Tenet");

        // Display movies in reverse order
        movieList.displayReverse();
    }
}
