package module1.designPattern;

public class DeepCopyObject implements Cloneable{
    private String name;
    private String age;
    private DCOAddress address;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setAddress(DCOAddress address) {
        this.address = address;
    }
    public DeepCopyObject(String name, String age, DCOAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeepCopyObject{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public DeepCopyObject clone() throws CloneNotSupportedException{
        return (DeepCopyObject) super.clone();
    }

}
