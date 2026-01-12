
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount {

    private int balance = 1000;
    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount) {

        System.out.printf("%s attempting to withdraw amount: %d\n", Thread.currentThread().getName(), amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.printf("%s proceeding with withdrawl\n", Thread.currentThread().getName());
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.printf("%s completed withdrawl. Remaining balance: %d\n\n", Thread.currentThread().getName(), balance);
                    }
                    catch (Exception e) {
                        Thread.currentThread().interrupt();         // good practice
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else {
                    System.out.printf("%s has insufficient balance\n", Thread.currentThread().getName());
                }
            }
            else {
                System.out.printf("%s could not acquire the lock\n", Thread.currentThread().getName());
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

