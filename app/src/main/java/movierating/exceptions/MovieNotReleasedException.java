package movierating.exceptions;

public class MovieNotReleasedException extends Exception {
    public MovieNotReleasedException() {
        super("Movie is not released yet");
    }
}
