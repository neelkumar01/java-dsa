
public class Car extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println("Thread running");

        } catch (InterruptedException e) {
            System.out.println("Thread inerupted: " + e);
        }
    }

    public static void main(String[] args) {        // main thread
        
        Car t1 = new Car();

        t1.start();

        t1.interrupt();
    }
}

