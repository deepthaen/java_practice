package praticeSession;

public class ConstructorsExample {

    int data;
    String s;
    public ConstructorsExample(){
        System.out.println("Parent Class Constrcotr");
    }
    public ConstructorsExample(String s, int data){
        this.data = data;
        this.s = s;
        System.out.println("parametrized data" +data);
    }
}
