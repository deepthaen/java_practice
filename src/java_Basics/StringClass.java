package java_Basics;

public class StringClass {




    public static void main(String[] args){
        String s= "Deeptha;";
        s= s.concat("Hari");
        System.out.println(s);

        StringBuffer str= new StringBuffer("AJIO");
        str.append("SDET");
        System.out.println(str);
    }
}
