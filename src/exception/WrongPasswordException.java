package exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String error) {
        super(error);
    }
}
