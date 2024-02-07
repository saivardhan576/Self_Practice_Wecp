import Movie;

package MS1;
public class MovieDAO {

    private Connection;

    public MovieDAO() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a Movie record
    public void createMovie(Movie movie) {
        String sql = "INSERT INTO Movies(movieName, movieFeedback) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, movie.getMovieName());
            statement.setString(2, movie.getMovieFeedback ());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                movie.setMovieID(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Movie getMovieByID(int MovieID) throws RecordNotFoundException {
        String sql = "SELECT * FROM Movies WHERE movieID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, movieID);
            ResultSet = statement.executeQuery();

            if (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieID(resultSet.getInt("movieID"));
                movie.setMovieName(resultSet.getString("movieName"));
                movie.setMovieFeedback(resultSet.getString("movieFeedback"));
                return movie;
            } else {
                throw new RecordNotFoundException("Movie with ID " + movieID + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }