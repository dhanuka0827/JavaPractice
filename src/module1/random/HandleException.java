package module1.random;

import java.util.List;

public class HandleException {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        for (int retryCount = 0; retryCount < 3; retryCount++) {
            System.out.println("");
            System.out.println("retry count = "+retryCount);

            try {
                if (a == b) {
                    System.out.println("inside if of try");
                    throw new Exception("invalid response from wfmtenantfilterapi call");
                }
                System.out.println("breaking");
                break;
            } catch (Exception ex) {
                if (retryCount == 2) {
                    System.out.println("inside if of  cause count = "+retryCount);
                    try {
                        Thread.sleep(5000);
                        System.out.println("sleeping thread for 5 seconds");
                    } catch (InterruptedException iexception) {
                        System.out.println("inside catch of catch of if");
                    }
                }
                try {
                    Thread.sleep(2000);
                    System.out.println("sleeping thread for 2 seconds");
                } catch (InterruptedException iexception) {
                    System.out.println("inside catch of catch");
                }
            }
        }
        System.out.println("broken from loop");
    }
}
