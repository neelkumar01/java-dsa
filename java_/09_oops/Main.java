public class Main {

    public static void main(String[] args) {
        
        Car car = new Car();

        car.brand = "rolls royce";
        car.color = "royal black";
        car.model = "phantom";
        car.speed = 300;
        

        car.accelerate(20);

        System.out.println(car.speed);


        Cat cat = new Cat();
        cat.age = 5;
        cat.name = "kitty";
        cat.breed = "royal";
    }
}