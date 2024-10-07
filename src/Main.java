import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        Pattern p1 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).+$");
        Matcher m1 = p1.matcher(password);
        return m1.matches();
    }

    public static void main(String[] args) {
        String[] passwords = {"C00l_Pass", "SupperPas1", "Cool_pass", "C00l", "Test1234"};
        for (String password : passwords) {
            if (isPasswordValid(password)) {
                System.out.println(password + "- Valid");
            } else {
                System.out.println(password + "- Invalid");
            }
        }
    }
}