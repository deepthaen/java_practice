package programs;

public class CharArrayAddAlph {

    public static void main(String[] args){
        charArrayAddAlph();
    }

    public static void charArrayAddAlph(){
        char[] charArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i<charArray.length; i++){
            System.out.println("create char araay and add alphabets ::" +"\n"+charArray[i]);
        }

    }
}
