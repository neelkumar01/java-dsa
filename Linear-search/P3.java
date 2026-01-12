// Find min num in array

public class P3 {

    public static void main(String[] args) {
        int[] array = {1,2,3,-4,4,5,0};
        System.out.println(search(array));
    }

    public static int search(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
