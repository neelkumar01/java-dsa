
import java.util.Vector;

// Vector - implements list interface

public class Main {

    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>(12, 3);      // initial capacity = 12 and increment = 3 when capacity is full

        System.out.println(vector.capacity());

        
    }
}