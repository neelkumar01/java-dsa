
public class Computer {

    private String brand;
    private String model;

    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    static class USB {
        private String type;

        public USB(String usb_type) {
            this.type = usb_type;
        }
        
    }

    class OperatingSystem {                 // inner class

        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Model: " + model + ", OS: " + osName);
        }
    }
}