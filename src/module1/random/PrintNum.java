package module1.random;

public class PrintNum {
    static final int num = 10;
    static int counter = 0;

    public void printOdd() {
        synchronized (this) {
            while (counter < num) {
                //  System.out.println("Odd Counter : " + counter + " " + Thread.currentThread().getName());
                while (counter % 2 == 0) {
                    try {
                        // System.out.println(Thread.currentThread().getName() + " is waiting.");
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Exception came :" + e);
                    }
                }
                System.out.println(counter + " by " + Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (counter < num) {
                //System.out.println("Even Counter : " + counter + " " + Thread.currentThread().getName());
                while (counter % 2 != 0) {
                    try {
                        // System.out.println(Thread.currentThread().getName() + " is waiting.");
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Exception came :" + e);
                    }
                }
                System.out.println(counter + " by " + Thread.currentThread().getName());
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        PrintNum printer = new PrintNum();
        Thread t1 = new Thread((() -> printer.printEven()), "ET");
        Thread t2 = new Thread((() -> printer.printOdd()), "OT");
        /*Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printEven();
            }
        }, "ET");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printOdd();
            }
        }, "OT");*/

        t1.start();
        t2.start();
    }
}
