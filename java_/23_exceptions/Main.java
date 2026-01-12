
public class Main {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
