
public class School {

    // motive: to create only single obj of a particular class
    
    private School() {}

    private static School instance;

    public static School getInstance() {

        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

}