
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteCounter {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();      // lock for reading
    private final Lock writeLock = lock.writeLock();    // lock for writing

    // both locks work in pair
    // If write lock acquire by any thread - no one can aquire read lock
    // Else all threads can aquire read lock

    public void increment() {
        writeLock.lock();
        try {
            count++;
        } 
        finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } 
        finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%s read: %d\n", Thread.currentThread().getName(), counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.printf("%s incremented\n", Thread.currentThread().getName());
                }
            }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();
    }
}
