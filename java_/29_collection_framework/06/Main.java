
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main {

    public static void main(String[] args) {
        
        // copyonwrite array list - used when doing reading and writing
        // if a thread is reading and at same time - we do modification 
        // so for that a copy is made and modification done on that

        // This dont disturb those threads reading the same list

        List<String> shoppingList = new CopyOnWriteArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("butter");
        shoppingList.add("sauce");
        shoppingList.add("shake");

        System.out.println("Initial shopping list: " + shoppingList);

        for (String item: shoppingList) {
            if (item.equals("shake")) {
                shoppingList.add("straw");
            }
        }

        System.out.println("Update shopping list: " + shoppingList);
        
    }
}