package core_Java.oOPS.polyhorism.subPoly;

public class MultiTenancyTest {


    public static void main(String[] args) {

        //Arrow
        MultiTenancy multi = new Arrow();
        multi.brand();
        multi.product();
        multi.tenantId();
        multi.articleList(null);
        multi.skuId();
        System.out.println("***************");
        //Levis
        multi = new Levis();
        multi.brand();
        multi.product();
        multi.tenantId();
        multi.articleList(null);
        multi.skuId();
        System.out.println("***************");
        //Saphora
        multi = new SAPHORA();
        multi.brand();
        multi.product();
        multi.tenantId();
        multi.articleList(null);
        multi.skuId();
        System.out.println("***************");
        //USPOLO
        multi = new USPolo();
        multi.brand();
        multi.product();
        multi.tenantId();
        multi.skuId();
        multi.brand("jhdsgfsd");

    }
}
