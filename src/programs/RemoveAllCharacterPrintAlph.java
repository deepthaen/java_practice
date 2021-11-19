package programs;

public class RemoveAllCharacterPrintAlph {

    public static void main(String[] args) {
        removeAllChar();

    }

    public static void removeAllChar(){
        String s = "sdfghj1234567@#$%^asdfg";
        System.out.println("String s::" + s);
        String res= s.replaceAll("[^A-Za-z]+", "");
        System.out.println("Print only Alph :: " +res);

    }
}
