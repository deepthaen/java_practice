package core_Java.oOPS.encapsulation;

public class CollecgeImplem {

    public static void main(String[] args) {
        College c = new College();
        c.setAge(20);
        c.getName("Deep");
        c.getRollNo(345);

        String s = c.getName();
        int i = c.getAge();
        int r = c.getRollNo();

        System.out.println("name" + s);
        System.out.println("age" + i);
        System.out.println("roll no" + r);




    }
}
