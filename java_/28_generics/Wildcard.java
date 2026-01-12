
import java.util.ArrayList;
import java.util.List;


public class Wildcard {

    public static void main(String[] args) {
        
    }

    public <T> T method1(ArrayList<T> list) {
        return list.get(1);
    }

    public void print(ArrayList<?> list) {          // wildcard to represent unknown type
        for (Object o: list) {
            System.out.println(o);
        }

        // for returning - generic used

        // for read only purpose - wildcard pattern

    }

    public static double sum(List<? extends Number> numbers) {          // upper bound method
        double res = 0;
        for (Number num : numbers) {
            res += num.doubleValue();
        }

        return res;
    }

    public static void printAll(List<? super Integer> items) {          // lower bound method
        for (Object item: items) {
            System.out.println(item);
        }
    }
}