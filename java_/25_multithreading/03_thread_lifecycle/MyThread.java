
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
    }

    public static void main(String[] args) throws InterruptedException {
        
        MyThread t1 = new MyThread();

        System.out.println(t1.getState());              // NEW

        t1.start();

        System.out.println(t1.getState());              // RUNNABLE - ready to run

        Thread.sleep(200);                              // main thread paused for 200ms

        System.out.println(t1.getState());
    }
}