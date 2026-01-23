// Find first and last position of target in sorted array

public class P4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,5,5,5,6};
        int target = 5;

        System.out.println(searchFirstIndex(array, target));
        System.out.println(searchEndIndex(array, target));
    }

    static int searchFirstIndex(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start)/2;
            if (array[middle] < target) {
                start = middle + 1;
            }
            else if (array[middle] > target) {
                end = middle - 1;
            }
            else {
                if (array[middle - 1] == target) {
                    end = middle - 1;
                }
                else {
                    return middle;
                }
            }
        }

        return -1;
    }

    static int searchEndIndex(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = start + (end - start)/2;
            if (array[middle] < target) {
                start = middle + 1;
            }
            else if (array[middle] > target) {
                end = middle - 1;
            }
            else {
                if (array[middle + 1] == target) {
                    start = middle + 1;
                }
                else {
                    return middle;
                }
            }
        }
        return -1;
    }
}
