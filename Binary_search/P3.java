// Find smallest letter in array of characters greater than target

// array in ascending order

public class P3 {

    public static void main(String[] args) {

        char[] array = {'a', 'b', 'e', 'z'};

        char target = 'c';

        System.out.println(search(array, target));
    }

    static int search(char[] array, char target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = start + (end - start)/2;

            if (array[middle] > target) {
                end = middle - 1;
            }
            else if (array[middle] < target) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }

        return start;
    }
}
