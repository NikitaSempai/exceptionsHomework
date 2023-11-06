import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {

    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)) {
            throw new WrongLoginException("Wrong login format.");
        }

        if(!Pattern.matches("^[a-zA-Z0-9_]{1,19}$", password)) {
            throw new WrongPasswordException("Wrong password format.");
        }

        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords are not equal.");
        }
    }
}
