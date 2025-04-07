import java.util.Scanner;

class Login {
    private String validUsername = "admin";
    private String validPassword = "1234";

    public void validate(String username, String password) {
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user = scanner.nextLine();
        System.out.print("Enter Password: ");
        String pass = scanner.nextLine();

        Login login = new Login();
        login.validate(user, pass);
    }
}
