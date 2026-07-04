import java.util.List;

public class Main {
    public static void main(String[] args) {
        String password = "Pass2sword!";
        PasswordStrength passwordStrength = new PasswordStrength();
        System.out.println(passwordStrength.percent(password));
        System.out.println(passwordStrength.evaluate(password));
    }
}
