
import java.util.Stack;

// stack - LIFO last in first out

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();       // stack extends vector

        stack.push(1);
        stack.push(24);
        stack.push(10);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());

        // in stack indexing starts from top and from 1 not 0

        // arraylist, linkedlist - no thread safety
        
        // vector, stack - thread safe
    }
}