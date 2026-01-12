public class Main {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3};

        Object[] items = {10, "fruit", 24.6};

        int[] arr = new int[5];

        for ( int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        for (Object k: items) {
            System.out.println(k);
        }
    }
}
