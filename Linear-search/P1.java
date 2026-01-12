// Linear Search

public class P1 {
    public static void main(String[] args) {

        int[] array = {};
        int target = 9;
        int result = linearSearch(array, target);
        System.out.println(result);

    }

    static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        for (int k=0; k<array.length; k++) {
            if (array[k] == target) {
                return k;
            }
        }

        return -1;
    }
}