
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main_four {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> "hello";      // runnable dont return but callable do

        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());

        executorService.shutdown();

        System.out.println(executorService.isTerminated());
    }
}