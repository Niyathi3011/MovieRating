package movierating.exceptions;

public class MovieReleasedException extends Exception {
    public MovieReleasedException(String userName) {
        super("Movie Already Released" + userName);
    }
}
