package core_Java.oOPS.encapsulation;

public class LoginTest {

    /**
     * Login pojo // username and password
     *
     * Login service // u r genrateing body with pojo data
     *
     *
     * Login test
     */



    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        LoginPojo loginPojo = loginService.setCredentials("deeptha","1234");

        String body =  loginService.generateBody(loginPojo);
        System.out.println(body);
    }
}
