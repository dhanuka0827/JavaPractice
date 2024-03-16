package module1.interview;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            System.out.println("try me");
            //System.exit(0);
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("finally");
        }
    }
}
