
import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();       // it is now type safe!

        list.add("abc");
        list.add("xyz");

        String s1 = list.get(0);
        String s2 = list.get(1);

        System.out.println(s1);
        System.out.println(s2);


        Box<Integer> box = new Box<>();                         // box is now type safe
        box.setValue(24);
        int i = box.getValue();
        System.out.println(i);


        Pair<String, Integer> pair = new Pair<>("Age", 18);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        // Naming convetions for generics
        // T: type
        // E: element
        // K: key
        // V: value
        // N: number


        
    }
}