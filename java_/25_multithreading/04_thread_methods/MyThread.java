
public class MyThread extends Thread{

    @Override
    public void run() {

        System.out.println("Thread is running");

        for (int k = 0; k <= 5; k++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(k);
        }
    }

    public static void main(String[] args) throws InterruptedException {        // main thread
        
        MyThread t1 = new MyThread();

        t1.start();

        t1.join();                          // main thread waits for t1 to finish and then it will proceed further

        System.out.println("Hello");

        // other methods - setPriority()
    }
}