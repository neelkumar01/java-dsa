
enum Day {
    Monday, Tuesday             // enums - they are already tyype safe
}

public class Test {

    public static void main(String[] args) {
        
        Day d1 = Day.Monday;
        Day d2 = Day.Tuesday;

        System.out.println(d1);
        System.out.println(d2);
    }
}