package module3.exceptions.customexceptions;

public class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }

    InvalidPasswordException(Throwable e, String message) {
        super(message, e);
    }
}
