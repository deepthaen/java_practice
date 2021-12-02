package core_Java.basicCocepts.basicTopics;

public class EnumImple {

    public static  void DepSele(Department dep){

        switch (dep){
            case CSE:
                System.out.println("cse");
                break;

            case MECH:
                System.out.println("mech");
                break;

            case ECE:
                System.out.println("ece");
                break;

            default:
                System.out.println("no selection");
                break;
        }

    }

    public static void main(String[] args) {
        DepSele(Department.CSE);
    }


}
