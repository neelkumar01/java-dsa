// generic methods

public class Bike {

    public static void main(String[] args) {

        Bike obj = new Bike();

        String[] array = {"apple", "mango"};

        obj.printArray(array);
    }

    public <T> void printArray(T[] array) {

        for( T element: array ) {
            System.out.println(element);
        }
    }
}
