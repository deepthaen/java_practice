package programs;

import java.util.Arrays;

public class StringArrayAddMonths {

    public static void main(String[] args){

        stringArray();

    }

    public static void stringArray(){
        String[] months = {"JANUARY","FEB"};
        String[] strArr = new String[11];
        strArr[0]="Jan";
        strArr[1]="Feb";
        strArr[2]="March";
        strArr[3]="April";
        strArr[4]="May";
        strArr[5]="June";
        strArr[6]="July";
        strArr[7]="Aug";
        strArr[8]="Sep";
        strArr[9]="Oct";
        strArr[10]="Nov";
        System.out.println("String array and add Months::"+ Arrays.toString(strArr) );

    }
}
