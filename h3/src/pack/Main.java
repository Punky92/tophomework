package pack;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        newThread thread1 = new newThread(Thread.currentThread().getName(), counter);
        newThread thread2 = new newThread(Thread.currentThread().getName(), counter);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
