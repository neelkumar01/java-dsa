// Binary search code

// Find index of target
// Return -1 if it does not exist

// Assumption : array is sorted in ascending order

public class T1 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int target = 4;
        int result = binarySearch(array, target);

        System.out.println(result);
    }

    public static int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) { 
            int middle = start + (end - start)/2 ;      // index of mid elem

            if (target < array[middle]) {               
                end = middle - 1;
            } else if (target > array[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}

