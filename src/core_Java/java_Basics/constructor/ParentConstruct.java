package core_Java.java_Basics.constructor;

import core_Java.oOPS.extendsExample.ParentClass;

public class ParentConstruct {

    public ParentConstruct(){
        System.out.println("Executive parent cosntructor");
    }


    String driver;
    public ParentConstruct(String driver){
        this.driver = driver;
        System.out.println("driver");
    }
}
