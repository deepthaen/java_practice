package praticeSession;

public class EnumImplemetion {

    public static void switchImpl(EnumBrowsers browser){
        switch (browser){
            case CHROME:
                System.out.println("Chrome");
                break;
            case FF:
                System.out.println("FF");
                break;
            case IE:
                System.out.println("IE");
                break;
            case SAFARI:
                System.out.println("safari");
                break;
            default:
                System.out.println("No Browser");
                break;

        }

    }

    public static void main(String[] args) {
        switchImpl(EnumBrowsers.CHROME);
    }
}
