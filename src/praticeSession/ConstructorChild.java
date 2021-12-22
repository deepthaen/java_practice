package praticeSession;

public class ConstructorChild extends ConstructorsExample{

public ConstructorChild(){
    super();
    System.out.println("child class constrcuotr");
}


    public static void main(String[] args) {

       ConstructorChild c = new ConstructorChild();
        ConstructorsExample d = new ConstructorsExample( "driver", 5);


    }
}
