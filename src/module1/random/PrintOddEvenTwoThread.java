package module1.random;

public class PrintOddEvenTwoThread {

    static int N = 10;
    static int count;

    public void printOdd() {
        synchronized (this) {
            while (count < N) {

                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (count < N) {

                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        count = 1;
        PrintOddEvenTwoThread printer = new PrintOddEvenTwoThread();

        Thread t1 = new Thread(() -> printer.printEven());
        Thread t2 = new Thread(() -> printer.printOdd());
        t1.start();
        t2.start();
    }

}
