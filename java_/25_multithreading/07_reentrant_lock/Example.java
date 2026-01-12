
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Example {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();                // acquires lock or wait for other member to unlock before acquiring
        try {
            System.out.println("outer method");
            innerMethod();
        } 
        finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("inner method");
        } 
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        Example example = new Example();
        example.outerMethod();
    }
}

