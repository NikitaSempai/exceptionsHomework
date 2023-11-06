import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "Nikita";
        String password = "Password";
        String confirmPassword = "Password";

        try {
        Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Correct login and password.");
        }
    }
}