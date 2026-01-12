
public class Toy implements Runnable{

    @Override
    public void run() {
        while (true) { 
            System.out.println(Thread.currentThread().getName());
        }
    }
}

