
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// comparator

class MyComparatorClass implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {        
        // if this method returns -ve value -> n1 comes first then n2 comes
        return n1 - n2;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(3);
        numbers.add(10);

        numbers.sort(new NumberComparator());

        System.out.println(numbers);

        
        List<String> fruits = Arrays.asList("banana", "apple", "coconout");

        fruits.sort(new MyComparatorClass());

        System.out.println(fruits);



        List<Integer> marks = new ArrayList<>();

        marks.add(20);
        marks.add(5);
        marks.add(50);
        marks.add(35);

        marks.sort( (a, b) -> a - b);   // ascending order
        System.out.println(marks);
    }
}