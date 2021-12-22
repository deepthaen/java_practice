package praticeSession;


public class EncapsulationExample {

    private String name;
    private int age;
    private String college;
    private String city;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college){
        this.college = college;
    }
    public String getCollege(){
        return college;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }


    }

