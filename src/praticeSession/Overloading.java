package praticeSession;


public class Overloading {

    public static void travel(String place){

        System.out.println(place);
    }
    public static void travel(String place, int countPerson){

        System.out.println(place);
        System.out.println(countPerson);
    }

    public  static void travel(String place, int countPerson, String vechicleTypes){

        System.out.println(place);
        System.out.println(countPerson);
        System.out.println(vechicleTypes);

    }

    public static void main(String[] args) {
        travel("Mysore");
        travel("Mysore", 5);
        travel("Mysore", 5, "car");

    }
}
