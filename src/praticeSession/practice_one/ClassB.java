package praticeSession.practice_one;

public class ClassB extends ClassA{
    public ClassB(){
        super();
        System.out.println("Child class construct");

    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        System.out.println("Child class");
    }
}
