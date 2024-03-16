package module1.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(new TaskRunnable(latch,"123", 5));
        service.submit(new TaskRunnable(latch,"456", 10));

        System.out.println(latch.getCount());
        latch.await();
        System.out.println(latch.getCount());
        System.out.println("Execution finished, shutting down executor");
        service.shutdown();

    }
}
