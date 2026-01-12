public class Main {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int sum = addAll(arr);

        System.out.println(sum);
    }

    public static int addAll(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }


    // method overloading

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static int sumAllNums(int ...a) {
        int sum = 0;
        for (int i: a) {
            sum += i;
        }
        return sum;
    }
}