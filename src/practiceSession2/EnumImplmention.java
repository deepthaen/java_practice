package practiceSession2;

public class EnumImplmention {

    public static void BrowserImple(BrowserLaunch browser){
        switch (browser){
            case FF:
                System.out.println("FF");
                break;
            case CHROME:
                System.out.println("CHROME");
                break;
            default:
                System.out.println("No browser");
        }
    }

    public static void main(String[] args) {
        EnumImplmention.BrowserImple(BrowserLaunch.CHROME);

    }
}
