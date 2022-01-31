package practiceSession2;

public class OverloadingExe {

    public static void travel(String vechicle, int person){
        System.out.println("Car and 4");

    }

    public void travel(String vehicle, int person, String place){
        System.out.println("car and 4 and mysore");
    }

    public void travel(String vechicle, int person, int km){
        System.out.println("car and 4 and 200KM");
    }

}
