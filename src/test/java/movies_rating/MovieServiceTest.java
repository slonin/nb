package movies_rating;

import complex_tasks.movies_rating.Movie;
import complex_tasks.movies_rating.MovieService;
import complex_tasks.movies_rating.Rating;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    @Test
    void movieService_addRating() {
        MovieService<Integer> ms = new MovieService<>();

        ms.addRating(new Movie("Spider-Man"), new Rating<>(7));
        assertEquals(1, ms.getMoviesRatings().size());
    }

    @Test
    void movieService_addInvalidRating() {
        MovieService<Integer> ms = new MovieService<>();

        assertThrows(IllegalArgumentException.class, () -> ms.addRating(new Movie("Spider-Man"), new Rating<>(11)));
    }

    @Test
    void movieService_getAverageRate() {
        MovieService<Integer> ms = new MovieService<>();

        ms.addRating(new Movie("Spider-Man"), new Rating<>(7));
        ms.addRating(new Movie("Spider-Man"), new Rating<>(3));
        ms.addRating(new Movie("Spider-Man"), new Rating<>(5));
        assertEquals(5, ms.getAverageRating(new Movie("Spider-Man")));
    }

    @Test
    void movieService_getSortedMovies() {
        MovieService<Integer> ms = new MovieService<>();

        ms.addRating(new Movie("Spider-Man"), new Rating<>(7));
        ms.addRating(new Movie("Spider-Man"), new Rating<>(5));
        ms.addRating(new Movie("Titanic"), new Rating<>(3));
        ms.addRating(new Movie("Titanic"), new Rating<>(5));

        List<Movie> sortedMovies = ms.sortMoviesByAverageRate();
        assertEquals(new Movie("Titanic"), sortedMovies.getFirst());
    }

}
