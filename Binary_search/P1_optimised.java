
public class P1_optimised {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6, 10, 14, 23};
        int target = 4;

        int result = search(array, target);

        System.out.println(result);

    }

    static int search(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (target < array[middle]) {
                end = middle - 1;
            } else if (target > array[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return start;                                             // ❤️
    }
}
