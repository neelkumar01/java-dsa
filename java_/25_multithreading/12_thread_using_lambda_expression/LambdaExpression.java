
public class LambdaExpression {

    public static void main(String[] args) throws InterruptedException{
        
        Runnable task = () -> {
            System.out.printf("%s -> running\n", Thread.currentThread().getName());
        };

        Thread t1 = new Thread(task, "Thread 1");

        t1.start();

        t1.join();

        Car car1 = new Car() {                      // anonymous class

            @Override
            public void run() {
                System.out.println("car1 running");
            }
        };

        car1.run();

        Car car2 = () -> {                          // lambda expression
            System.out.println("car2 running");
        };

        car2.run();
    }
}

