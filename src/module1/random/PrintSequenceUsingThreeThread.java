package module1.random;

public class PrintSequenceUsingThreeThread {
    static int N = 50;
    static int i;

    static boolean first = true;
    static boolean second, third = false;

    private void printFirst() {
        synchronized (this) {
            while (i < N) {
                while (!first) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                while (first) {
                    System.out.println(i + Thread.currentThread().getName());
                    i++;
                    first = false;
                    second = true;
                    notifyAll();
                }
            }
        }
    }

    private void printSecond() {
        synchronized (this) {
            while (i < N) {
                while (!second) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                while (second) {
                    System.out.println(i + Thread.currentThread().getName());
                    i++;
                    second = false;
                    third = true;
                    notifyAll();
                }
            }
        }
    }

    private void printThird() {
        synchronized (this) {
            while (i < N) {
                while (!third) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                while (third) {
                    System.out.println(i + Thread.currentThread().getName());
                    i++;
                    third = false;
                    first = true;
                    notifyAll();
                }
            }
        }
    }


    public static void main(String[] args) {
        i = 1;
        PrintSequenceUsingThreeThread printer = new PrintSequenceUsingThreeThread();
        Thread t1 = new Thread(() -> printer.printFirst(), " Thread 0");
        Thread t2 = new Thread(() -> printer.printSecond(), " Thread 1");
        Thread t3 = new Thread(() -> printer.printThird(), " Thread 2");
        t1.start();
        t2.start();
        t3.start();
    }


}
