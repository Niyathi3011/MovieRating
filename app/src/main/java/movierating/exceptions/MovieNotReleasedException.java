package movierating.exceptions;

public class MovieNotReleasedException extends Exception {
    public MovieNotReleasedException(String movieName) {
        super("Movie is not released yet"+movieName);
    }
}
