package task2;

import java.util.List;

/**
 * Created by sergey.kliepikov on 4/3/18.
 */
public interface MovieYearFinder {

    void add(Movie movie);
    List<Movie> findByReleaseYear(int releaseYear);
    List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
}
