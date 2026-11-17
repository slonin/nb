package complex_tasks.movies_rating;

import java.util.Objects;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Movie movie)) return false;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
