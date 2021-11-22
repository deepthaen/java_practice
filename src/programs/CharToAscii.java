package programs;

import java.util.Scanner;

public class CharToAscii {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        System.out.println("Character :: " +c);

        int asciiValue = c;
        System.out.println("Acii value ::" + asciiValue);

    }
}
