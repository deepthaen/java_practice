package core_Java.oOPS.encapsulation;

public class LoginService {

    /**
     *
     * generate url
     *
     * headers
     *
     * body
     *
     * params
     *
     * ftech response
     *
     *
     *
     */

    public static String generateBody(LoginPojo pojo){
        String body ="{\n" +
                "    \"payload\": {\n" +
                "        \"username\": \""+pojo.getUsername()+"\",\n" +
                "        \"password\": \""+pojo.getPassword()+"\"\n" +
                "    }\n" +
                "}";
        return  body;
    }


    public static LoginPojo setCredentials(String user, String pass){
        LoginPojo pojo = new LoginPojo();
        pojo.setPassword(pass);
        pojo.setUsername(user);
        return pojo;
    }


}
