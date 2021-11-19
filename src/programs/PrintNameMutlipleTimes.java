package programs;

import java.util.Scanner;

public class PrintNameMutlipleTimes {

    public static void main(String[] args){
        printName();

    }

    public static void printName(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = s.next();
        System.out.println("Print 10 times name");
        for(int i = 1; i<=10; i++){
            System.out.println(name);

        }

    }
}
