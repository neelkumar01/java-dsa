
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main_seven {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
                () -> {
                    System.out.println("Task");
                },
                1,
                2,
                TimeUnit.SECONDS
        );

        scheduler.schedule(
                () -> {
                    System.out.println("Tasks done");
                    scheduler.shutdown();
                },
                20,
                TimeUnit.SECONDS
        );
    }
}
