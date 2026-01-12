
public interface Animal {           // interface

    String color = "yellow";        // this is public, static, final by default   

    void eat();                     // methods in interface - by default public and abstract
    void sleep();

    static void info() {
        System.out.println("This is animal interface");
    }

    default void run() {                    // default methods are not needed to implement
        System.out.println("running");
    }
}