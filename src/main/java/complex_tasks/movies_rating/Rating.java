package complex_tasks.movies_rating;

public class Rating<T extends Number> {
    private final T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }
}
