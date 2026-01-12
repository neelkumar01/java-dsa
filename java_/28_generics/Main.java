
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        int[] basket = new int[4];

        ArrayList list = new ArrayList();

        list.add("obj1");
        list.add(24);
        list.add(3.14);

        Object o1 = list.get(0);

        System.out.println(o1);

        String o2 = (String) list.get(0);   
        System.out.println(o2);

        String num = (String) list.get(1);          // dont give error - no type safety with array list
    }
}