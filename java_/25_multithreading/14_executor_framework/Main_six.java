
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Main_six {

    public static void main(String[] args) {
        
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> { System.out.println("Hello"); },5, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}