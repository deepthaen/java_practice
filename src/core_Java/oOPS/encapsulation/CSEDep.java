package core_Java.oOPS.encapsulation;

public class CSEDep {

    public String currstudent; // initilise a variable
    public String teacher;

    public void setStudent(String futurestudent){ // setting a value of parameter
        this.currstudent = futurestudent;
    }

    public String getStudent(){
        return currstudent;
    }


    public static void main(String[] args) {
        CSEDep c = new CSEDep();
        c.setStudent("Deeptha");

       String s =  c.getStudent();
        System.out.println(s);
    }

}
