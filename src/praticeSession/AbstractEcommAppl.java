package praticeSession;

public abstract class AbstractEcommAppl {

    public void browserlaunch(){
        System.out.println("launch Browser");
    }

    public abstract String loginToApp();

    public abstract int placeOrder(String login);


}
