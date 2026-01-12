// setDaemon() method

public class Daemon extends Thread{

    @Override
    public void run() {
        while (true) { 
            System.out.println("background task running");
        }
    }

    public static void main(String[] args) {
        
        Daemon thread = new Daemon();

        thread.setDaemon(true);

        thread.start();

        System.out.println("From main thread, msg1: hi");
        System.out.println("From main thread, msg2: hello");
    }
}