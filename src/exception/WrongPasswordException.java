package exception;

public class WrongPasswordException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Wrong password format.";
    }
}
