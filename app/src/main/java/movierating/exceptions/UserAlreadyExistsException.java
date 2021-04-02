package movierating.exceptions;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super("User already Exists" + message);
    }
}
