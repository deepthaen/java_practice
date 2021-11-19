package programs;

import java.util.Scanner;

public class SumTwoNumber {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter first number- ");
        int b= sc.nextInt();

        int sum = a+b;
        System.out.println("sum of two numbers = " + sum);

    }


}
