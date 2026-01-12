// yield method

public class Toy extends Thread{

    @Override
    public void run() {

        for (int k = 1; k <= 4; k++) {
            System.out.printf("Thread: %s  value: %d\n", Thread.currentThread().getName(), k);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        
        Toy t1 = new Toy();
        Toy t2 = new Toy();

        t1.start();
        t2.start();
    }
}