// polymorphism - allow methods to do different things based on obj acting on

public class Main {

    public static void main(String[] args) {

        // compile time polymorphism - method overloading
        
        add(1, 2);
        add(10, 20, 30);


        // runtime polymorphism - method overriding

        Animal cat = new Cat();
        cat.sayHello();

        Animal dog = new Dog();
        dog.sayHello();
        
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}