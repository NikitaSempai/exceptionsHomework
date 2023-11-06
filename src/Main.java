public class Main {
    public static void main(String[] args) {
        String login = "Nikita";
        String password = "Password";
        String confirmPassword = "Password";

        Validator.validate(login, password, confirmPassword);
    }
}