import Movie;

package MS1;
public class Main {
    public static void main(String[] args) {
        MovieDAO movieDao= new MovieDAO();

        // Create a new Movie record
        Movie Movie1 = new Movie();
        Movie1.setMovieName("PK");
        Movie1.setMovieFeedback("Excellent");
        movieDao.createMovie(Movie1);

        // Retrieve a Movie's record by MovieID
        try {
            Movie retrievedMovie = MovieDAO.getMovieByID(Movie1.getMovieID());
            System.out.println("Retrieved Movie: " + retrievedMovie.getMovieName());
            System.out.println("Movie Feedback: " + retrievedMovie.getMovieFeedback());
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Clean up and close the database connection
        MovieDAO.close();
    }
}
