
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// hashmaps

public class Main {

    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(12, "ram");
        map.put(20, "neel");
        
        System.out.println(map);

        // get()
        // containsKey()
        // containsValue()

        Set<Integer> keys = map.keySet();

        System.out.println(keys);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println(entries);

        for (Map.Entry<Integer, String> entry: entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



        // hashmap components
        // key
        // value
        // bucket
        // hash function

        
    }
}