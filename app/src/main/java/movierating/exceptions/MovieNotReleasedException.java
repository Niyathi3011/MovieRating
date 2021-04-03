package movierating.exceptions;

public class MovieNotReleasedException extends Exception {
    public MovieNotReleasedException(String movieName) {
        super(movieName + " is not released yet");
    }
}
