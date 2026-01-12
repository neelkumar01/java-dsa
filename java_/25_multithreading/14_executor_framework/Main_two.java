
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main_two {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(9);

        for (int i = 0; i < 10; i++) {

            int val = i;

            executor.submit(() -> {                         // This method returns Future<?>
                System.out.println(factorial(val));
            });
        }
        executor.shutdown();
    }

    private static long factorial(int n) {
        
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
