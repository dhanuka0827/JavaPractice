package module1.designPattern;

public class TestDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        DCOAddress address = new DCOAddress("delhi");
        DeepCopyObject obj1 = new DeepCopyObject("neha", "12", address);
        DeepCopyObject obj2 = obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);
        address.setAddress("Noida");
        obj1.setAddress(address);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
