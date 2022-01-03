package praticeSession.practice_one;

public class EncapImpl {

    public static void main(String[] args) {
        Encap e = new Encap();
        e.setName("Deeptha");
        e.setAge(9);

        String n = e.getName();
        int a = e.getAge();
        System.out.println(n);
        System.out.println(a);
    }
}
