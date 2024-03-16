package module1.random;

public class Strange implements Runnable{

    public String strange ="";

    public void set(int a){
        strange = a+"";
    }

    public void print(){
        System.out.println("Strange:"+strange);
    }

    public void run(){
        try {
            Thread.sleep(5000);
            set(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
