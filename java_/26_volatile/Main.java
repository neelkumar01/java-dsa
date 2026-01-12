
class sharedObj {

    private volatile boolean flag = false;              // volatile dont allow thread to cache variable and thread reads directly from main memory

    public void setFlagTrue() {                         // for writer
        flag = true;
        System.out.println("Writer made flag true");
    }

    public void printIfFlagTrue() {                     // for reader
        while (!flag) {                                 // every thread, here reader stores the flag = false in its cache even if main memory is changed
            // do nothing
        }
        System.out.println("Flag is true");
    }
}

public class Main {

    public static void main(String[] args) {
        
        sharedObj obj = new sharedObj();

        Thread writer = new Thread( () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
        });

        Thread reader = new Thread( () -> {
            obj.printIfFlagTrue();
        });

        writer.start();
        reader.start();


    }
}