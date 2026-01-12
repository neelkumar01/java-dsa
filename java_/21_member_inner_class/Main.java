
public class Main {

    public static void main(String[] args) {
        
        Car car = new Car("Rolls royce");

        Car.Engine engine = car.new Engine();

        engine.start();
        engine.stop();
    }
}