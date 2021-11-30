package core_Java.oOPS.polyhorism;

public class OverLoading_1 {

    public static void travel(String type){
        System.out.println(type);
    }

    public static void travel(String type,int count){
        System.out.println(type+" "+count);
    }

    public static void travel(String type,int count,String place){
        System.out.println(type+" "+count+" "+place);
    }

    public static void travel(String type,long length){
        System.out.println(type+" "+length);
    }


    public static void main(String[] args) {
        travel("Audi Car");
        travel("Land rover",4);
        travel("Lorry",1000);
        travel("Auydi car",5,"Dubai");

    }
}
