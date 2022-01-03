package praticeSession.practice_one;

public class OverRdimp implements OverRider{

    @Override
    public void click() {
        System.out.println("clicking");
    }

    @Override
    public void waiting(long time) {
        System.out.println(time);
    }

    @Override
    public String browserLaunch(String browser) {
        System.out.println(browser);
        return browser;
    }

    public static void main(String[] args) {
        OverRider o = new OverRdimp();
        o.click();
        o.waiting(1000);
      String browser=  o.browserLaunch("Browser");
    }
}
