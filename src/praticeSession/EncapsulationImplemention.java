package praticeSession;

public class EncapsulationImplemention {

    public static void main(String[] args) {
        EncapsulationExample c = new EncapsulationExample();
       c.setName("Deep");
        c.setAge(20);
       c.setCollege("ewetw");
       c.setCity("bang");

       String n = c.getName();
       int i = c.getAge();
       String co = c.getCollege();
       String ci = c.getCity();

        System.out.println(n);
        System.out.println(i);
        System.out.println(co);
        System.out.println(ci);




    }
}
