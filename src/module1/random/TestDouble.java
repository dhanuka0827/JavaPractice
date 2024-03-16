package module1.random;

public class TestDouble {

    public static void main(String[] args) {
        String str = "1.689534427E9";
        double ds = Double.parseDouble(str);
        System.out.println("ds " +ds);
        int i = (int)ds;
        System.out.println("i "+i);
        String newS = String.format("%.3f", Double.parseDouble(str));

        System.out.println(newS);
    }
}
