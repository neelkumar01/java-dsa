
public class Toy {

    // private constructor - when we dont want to allow obj creation for a class

    private Toy() {}

    // with static - we can access methods with class names without obj

    public static void start() {        
        System.out.println("Toy started moving");
    }
}
