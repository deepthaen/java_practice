package praticeSession;

import core_Java.singleTOne.SingleToneWebdriver;

public class SingletoneExample {


   private  static SingletoneExample driver = null;

  private SingletoneExample(){
      System.out.println("Singletone constructor");
  }
  public static SingletoneExample getInstance(){
      if(driver == null){
         driver = new SingletoneExample();
      }
      return driver;
  }



}
