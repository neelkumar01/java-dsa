
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList - can change size dynamically unlike fixed arrays 

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();        // default capacity = 10

        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list.get(0));

        System.out.println(list.size());

        // contains()
        // remove()

        list.add(2, 100);

        System.out.println(list);

        list.set(2, 200);

        System.out.println(list);

        ArrayList<String> basket = new ArrayList<>(30);     // set initial capacity to 30 - prevent resource wastage


        // short way to create lists

        List<String> fruits = Arrays.asList("apple", "mango");

        Number[] numbers = {1,2,3};

        List<Number> nums = Arrays.asList(numbers);

        System.out.println(nums);
    }
}