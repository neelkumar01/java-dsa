
import java.util.concurrent.atomic.AtomicInteger;


public class Counter {

    private AtomicInteger counter = new AtomicInteger(0);       // when 2 or more threads running, atomic helps in task isolation

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.getCounter());
    }
}