
public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String car_model) {
        this.model = car_model;
    }

    class Engine {

        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped");
            }
        }
    }

}