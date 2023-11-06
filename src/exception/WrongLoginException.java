package exception;

public class WrongLoginException extends Exception {
    public WrongLoginException(String error) {
        super(error);
    }
}
