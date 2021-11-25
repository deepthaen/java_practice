package oOPS.inhertance;

public class LoginPage extends BrowserPage{

    public static void logintoApp(String driver){

        //driver.fin
       String login =  driver.concat("findelement").concat("click on login");
        System.out.println(login);
    }
}
