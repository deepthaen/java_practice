package praticeSession.practice_one;

public class EnumImple {

    public void enumBrowser(EnumBrowser browser){
        switch (browser){
            case CHROME:
                System.out.println("Chrome Browser");
                break;
            case FF:
                System.out.println("Firfox browser");
                break;
            default:
                System.out.println("no browser");
                break;
        }
    }

    public static void main(String[] args) {
        EnumImple e = new EnumImple();
        e.enumBrowser(EnumBrowser.CHROME);
    }
}
