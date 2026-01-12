
// thread pool - collection of pre-initialised  threads

public class ThreadPool {

    public static void main(String[] args) {
        
        Thread[] threads = new Thread[10];       // thread pool

        for (int i = 1; i <= 10; i++) {

            int val = i;

            threads[i-1] = new Thread( () -> {
                System.out.println(factorial(val));
            });

            threads[i-1].start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Computation ends");
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

