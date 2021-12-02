package core_Java.basicCocepts.enums;

public class SwitchEnumClass {


    //write again

    public static void switchenum(Browsers browser){

        switch (browser){

            case CHROME:
                System.out.println("Chrome");
                break;

            case FIREFOX:
                System.out.println("Firefox");
                break;

            case IE:
                System.out.println("IE");
                break;
            default:
                System.out.println("Np brwoser");
                break;
        }

    }

    public static void main(String[] args) {

        switchenum(Browsers.CHROME);
    }



}
