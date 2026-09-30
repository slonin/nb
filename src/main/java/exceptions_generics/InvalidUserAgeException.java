package exceptions_generics;

public class InvalidUserAgeException extends Exception {
    public InvalidUserAgeException(String message) {
        super(message);
    }
}
