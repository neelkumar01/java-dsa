
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class Main_one {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(9);        // thread pool

        for (int i = 1; i <= 10; i++) {

            int val = i;

            executor.submit( () -> {
                System.out.println(factorial(val));
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
