/*
Creating thread using class

• Create class that extends thread
• Override run() method and put your code in it
• Initiate thread using start() method
*/

public class Printer extends Thread{

    @Override
    public void run() {
        while (true) { 
            System.out.println(Thread.currentThread().getName());
        }
    }

}

