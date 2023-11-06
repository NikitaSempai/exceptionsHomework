package exception;

public class WrongLoginException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Wrong login format.";
    }

}
