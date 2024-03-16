package module1.random;

public class OrInSwitch {

    public static void main(String[] args) {


        OrInSwitch.testSwitch(3);
        OrInSwitch.testSwitch(4);
        //OrInSwitch.testSwitch();
        //OrInSwitch.testSwitch(3);

    }

    private static void testSwitch(int id) {
        int count = 0;
        switch (id) {
            case 1:
                System.out.println("one");
                count++;
                break;
            case 2:
                System.out.println("two");
                count++;
                break;
            case 3:
                count=5;
            case 4:
                if(count==5){
                    System.out.println("five");
                }
                count++;
                System.out.println("three four"+ " count : "+count);
                break;
        }
    }
}
