package core_Java.oOPS.encapsulation;

import java.util.HashMap;

public class Principal {

    /**
     *
     * setter
     * data.setElectric();
     *
     * getter
     * data.getElectric();
     *
     */

    public static void main(String[] args) {
        ECEDep data = new ECEDep();
        data = setData(data);
        HashMap<String, String> header = getData(data);
        System.out.println(header);
    }

    public  static ECEDep setData(ECEDep data){// indirectky reading form excel
        data.setElectric("Electric");
        data.setMicroProccesor("Micro");
        return data;
    }


    public static HashMap<String,String> getData(ECEDep data){
        HashMap<String,String> header = new HashMap<>();
        header.put("electric",data.getElectric());
        header.put("microproce",data.getMicroProccesor());
        return header;
    }
}
