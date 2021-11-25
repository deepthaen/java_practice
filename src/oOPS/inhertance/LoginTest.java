package oOPS.inhertance;

public class LoginTest extends LoginPage{
    public static void main(String[] args) {
        String driver = launchBrowser();
        logintoApp(driver);
    }
}
