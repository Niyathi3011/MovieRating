package movierating.exceptions;

public class MovieReleasedException extends Exception {
    public MovieReleasedException(String message) {
        super("Movie Already Released" + message);
    }
}
