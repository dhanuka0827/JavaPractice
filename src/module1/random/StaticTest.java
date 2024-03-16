package module1.random;

public class StaticTest {

    static int i = staticMethod();

    static int staticMethod(){
        System.out.println("Static Method");
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
