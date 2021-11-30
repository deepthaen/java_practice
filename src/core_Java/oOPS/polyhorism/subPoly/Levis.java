package core_Java.oOPS.polyhorism.subPoly;

import java.util.List;

public class Levis implements MultiTenancy{
    @Override
    public String product() {
        String prod =" Levios Shirts";
        System.out.println(prod);
        return prod;
    }

    @Override
    public String tenantId() {
        String tenant  = "LEVIS";
        System.out.println(tenant);
        return tenant;
    }

    @Override
    public String articleList(List<String> article) {
        String lsit  = "4000001";
        System.out.println(lsit);
        return lsit;
    }

    @Override
    public String brand() {
        String lsit  = "LEVIS KIDS";
        System.out.println(lsit);
        return lsit;
    }

    public String brand(String brands) {
        String lsit  = "LEVIS MEns";
        System.out.println(lsit);
        return lsit;
    }

    @Override
    public void skuId() {
        System.out.println("SKU000001");
    }
}
