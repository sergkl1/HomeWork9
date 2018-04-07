package task2;

import java.util.*;

/**
 * Created by sergey.kliepikov on 4/7/18.
 */
public class MapMovieYearFinder implements MovieYearFinder {

    private final SortedMap<String, Movie> tMap = new TreeMap<>();


    @Override
    public void add(Movie movie) {
        tMap.put(movie.getName(), movie);
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        List<Movie> result = new ArrayList<>();
        Set<Map.Entry<String, Movie>> movies = tMap.entrySet();
        for (Map.Entry<String, Movie> movie : movies) {
            if (movie.getValue().getYear() == releaseYear) {
                result.add(movie.getValue());
            }
        }

        return result;
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        List<Movie> result = new ArrayList<>();
        Set<Map.Entry<String, Movie>> movies = tMap.entrySet();
        for (Map.Entry<String, Movie> movie : movies) {
            if (movie.getValue().getYear() >= minReleaseYear && movie.getValue().getYear() <= maxReleaseYear) {
                result.add(movie.getValue());
            }
        }

        return result;
    }
}
