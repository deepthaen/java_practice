package programs;

import java.util.Scanner;

public class SumNumber {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Number ::"+ n);
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum+i;

        }
        System.out.println("Sum of numbers  :: " +sum);

    }
}
