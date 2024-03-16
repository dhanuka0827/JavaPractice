package module1.multithread;


import java.sql.Time;
import java.util.concurrent.*;

public class PoolExample {

    static class Task implements Runnable{

        @Override
        public void run() {
            int a =5, b = 10;
            int sum = a+b;
            System.out.println("Thread No "+ Thread.currentThread().getName());
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        executorService.shutdown();

        for(int i=0; i<100;i++){
            executorService.schedule(new Task(), 0, TimeUnit.SECONDS);
            if(executorService instanceof ThreadPoolExecutor){
                System.out.println("Active Count : "+((ThreadPoolExecutor) executorService).getActiveCount());
            }

        }
    }
}
