// Order agnostic binary search

public class T2 {

    public static void main(String[] args) {
        int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;

        int result = binarySearch(array, target);

        System.out.println(result);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // find whether array is sorted in ascending or descending order                        // ❤️
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;      // index of middle element

            if (array[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < array[middle]) {
                    end = middle - 1;
                } else if (target > array[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            } else {
                if (target > array[middle]) {
                    end = middle - 1;
                } else if (target < array[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            }
        }

        return -1;
    }
}
