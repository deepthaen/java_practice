package practiceSession2;


public class EncapsulationImplemention {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Deeptha");
        e.setAge(20);
        String n = e.getName();
        int a = e.getAge();

        System.out.println("Name ::" + n);
        System.out.println("Age ::" +a);
    }
}
