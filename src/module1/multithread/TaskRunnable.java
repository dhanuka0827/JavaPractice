package module1.multithread;

import java.util.concurrent.CountDownLatch;

public class TaskRunnable implements Runnable {

    public String threadName;
    public CountDownLatch latch;
    public int j;

    private int sum;

    public TaskRunnable() {}

    public TaskRunnable(CountDownLatch latch, String threadName, int j) {
        this.latch = latch;
        this.threadName = threadName;
        this.j = j;

    }

    @Override
    public void run() {
        try {
            sum();
        } finally {
            System.out.println("countdown for " + Thread.currentThread().getName());
            latch.countDown();
            System.out.println(latch.getCount());

        }
    }

    private void sum() {
        try {
            sum = 5;
            System.out.println("Sum :" + sum + " Thread" + Thread.currentThread().getName());
            System.out.println("Error will come :" + 5 / 0);

        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
    }

}