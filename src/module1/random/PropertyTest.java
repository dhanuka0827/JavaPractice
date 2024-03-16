package module1.random;

public class PropertyTest {

    public static void main(String[] args) {
        Integer messageCount = null;
        messageCount = messageCount == null ? 0 : Integer.valueOf(messageCount) + Integer.parseInt("1");
        System.out.println(messageCount);
    }

}
