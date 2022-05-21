package pack;

public class newThread extends Thread{
    private String name;
    private final Counter counter;

    public newThread(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            System.out.println(Thread.currentThread().getName());
            counter.intCounter();
        }
    }
}
