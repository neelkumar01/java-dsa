
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main_five {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable callable1 = () -> {
            System.out.println("Task 1");
            return 1;
        };
        Callable callable2 = () -> {
            System.out.println("Task 2");
            return 2;
        };
        Callable callable3 = () -> {
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
        
        List<Future<Integer>> futures = executorService.invokeAll(list);

        for (Future<Integer> f: futures) {
            System.out.println(f.get());
        }

        executorService.shutdown();

        System.out.println("hello");
    }
}