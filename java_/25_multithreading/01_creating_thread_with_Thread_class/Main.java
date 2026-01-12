// This will run 2 threads parallely

public class Main {

    public static void main(String[] args) {            // main thread
        
        Printer machine = new Printer();
        machine.start();                                // new thread

        while (true) { 
            System.out.println(Thread.currentThread().getName());
        }
    }
}
