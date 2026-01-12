
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        
        Node node1 = new Node();        // singly linkedlist from scratch
        Node node2 = new Node();

        node1.value = 24;
        node1.next = node2;

        node2.value = 36;
        node2.next = null;


        LinkedList<Integer> list = new LinkedList<>();          // pre built doubly linkedlist in java

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(2));
    }
}

class Node {

    public int value;
    public Node next;
}