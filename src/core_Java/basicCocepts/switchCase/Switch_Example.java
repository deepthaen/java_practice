package core_Java.basicCocepts.switchCase;

public class Switch_Example {

    public static void useSwitch(int exp){

        switch (exp){
            case 1:
                System.out.println("case 1");
                break;

            case 2:
                System.out.println("case 2");
                break;

            default:
                System.out.println("case 3");
                break;
        }

    }


    public static void main(String[] args) {
        //use switch case and print
        useSwitch(2);
        launchBrowser("chrome");
    }

    public static void launchBrowser(String browser){

        switch (browser){
            case "chrome":

                System.out.println("launch chrome browser");
                break;

            case "Firefox":

                System.out.println("Launch firefox browser");
                break;

            case "IE":
                System.out.println("Launch IE browser");
                break;

            default:
                System.out.println("No browser launched");
                break;

        }
    }
}
