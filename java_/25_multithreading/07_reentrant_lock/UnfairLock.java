
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class UnfairLock {

    private final Lock unfairLock = new ReentrantLock(false);       // unfair lock, replace 'false' with 'true' makes it fair lock

    // fair lock - runs thread first scheduled by os

    public void accessResource() {

        unfairLock.lock();
        try {
            System.out.printf("%s acquired the lock\n", Thread.currentThread().getName());
            Thread.sleep(500);
        } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            unfairLock.unlock();
            System.out.printf("%s released the lock\n", Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        
        UnfairLock mylock = new UnfairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                mylock.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}