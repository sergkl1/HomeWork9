package task2;

/**
 * Created by sergey.kliepikov on 4/3/18.
 */
public class Movie {

    String name;
    int year;
    Genre genre;

    public Movie(String name, int year, Genre genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}
