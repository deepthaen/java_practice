package praticeSession;

public class AbstractAndroidAppl extends AbstractEcommAppl {
    @Override
    public String loginToApp() {
        String UN = "Deeptha";
        System.out.println("Login to FlipKart");
        return UN;
    }

    @Override
    public int placeOrder(String login) {
        int s = 7477457;
        System.out.println("place order "+s);
        return s;
    }

    public static void main(String[] args) {
        AbstractEcommAppl a = new AbstractAndroidAppl();
        a.browserlaunch();
        String f = a.loginToApp();
        a.placeOrder(f);

    }



}
