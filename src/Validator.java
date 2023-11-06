import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {

    public static void validate(String login, String password, String confirmPassword) {

        try {
            if(!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)) {
                throw  new WrongLoginException();
            }

            if(!Pattern.matches("^[a-zA-Z0-9_]{1,19}$", password)) {
                throw  new WrongPasswordException();
            }

            if(!password.equals(confirmPassword)) {
                throw  new WrongPasswordException();
            }
        } catch (WrongLoginException wrongLoginException) {
            System.out.println(wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println(wrongPasswordException.getMessage());
        } finally {
            System.out.println("Correct format of data !");
        }
    }
}
