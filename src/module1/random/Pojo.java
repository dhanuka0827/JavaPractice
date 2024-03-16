package module1.random;

public class Pojo {

    String name = "Neha";
    String age = "14";

    public Pojo() {
    }
    public Pojo(Pojo pojo){
        this.setName(pojo.getName());
        this.setAge(pojo.getAge());
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public Pojo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   /* public Pojo clone(Pojo pojo) throws CloneNotSupportedException {
        return (Pojo) super.clone();
    }*/
}
