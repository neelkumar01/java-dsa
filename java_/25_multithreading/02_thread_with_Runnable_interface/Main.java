
public class Main {

    public static void main(String[] args) {            // main thread
        
        Toy toy = new Toy();
        Thread t1 = new Thread(toy);                    // new thread
        t1.start();

        while (true) { 
            System.out.println(Thread.currentThread().getName());
        }
    }
}

