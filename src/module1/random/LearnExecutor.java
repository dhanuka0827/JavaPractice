package module1.random;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnExecutor {
    static final int num = 10;
    static int counter = 0;

    public void printNum() {
        while (counter < num) {
            synchronized (this) {
                while (counter % 2 != 0) {
                    try {
                       Thread.sleep(1000);
                      //  wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(counter + " by " + Thread.currentThread().getName());
                counter++;
               // notify();
            }
            synchronized (this) {
                while (counter % 2 == 0) {
                    try {
                       Thread.sleep(1000);
                        //wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(counter + " by " + Thread.currentThread().getName());
                counter++;
                //notify();
            }

        }
    }

    public static void main(String[] args) {
        LearnExecutor executor = new LearnExecutor();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for(int i =0;i<2;i++)
            pool.submit(() -> executor.printNum());
    }
}


