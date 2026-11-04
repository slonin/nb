package complex_tasks.movies_rating;

import java.util.*;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> moviesRatings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        if (rating.getRating().doubleValue() < 1 || rating.getRating().doubleValue() > 10) {
            throw new IllegalArgumentException("Оценка должна быть от 1 до 10");
        }

        if (moviesRatings.containsKey(movie)) {
            List<Rating<T>> m = moviesRatings.get(movie);
            m.add(rating);
        } else {
            moviesRatings.put(movie, new ArrayList<>(List.of(rating)));
        }
    }

    public double getAverageRating(Movie movie) {
        List<Rating<T>> ratings = moviesRatings.get(movie);
        if (ratings == null || ratings.isEmpty()) {
            throw new IllegalArgumentException("Нет оценок для фильма " + movie.getTitle());
        }

        return ratings.stream()
                .mapToDouble(rating -> rating.getRating().doubleValue())
                .average().orElse(0);
    }

    public List<Movie> sortMoviesByAverageRate() {
        return moviesRatings.keySet()
                .stream()
                .sorted(Comparator.comparingDouble(this::getAverageRating))
                .toList();
    }

    public Map<Movie, List<Rating<T>>> getMoviesRatings() {
        return Map.copyOf(moviesRatings);
    }
}
