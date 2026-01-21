// Ceiling of a number

// ceiling - smallest element in array >= target

// Assumption: given a sorted array (ascending)

public class P1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6, 10, 14, 23};
        int target = 4;

        int result = search(array, target);

        System.out.println(result);

    }

    static int search(int[] array, int target) {

        // Finding direct number first if it exists (using binary search) 👇

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

        // Finding ciel when direct number dont exist 👇

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
