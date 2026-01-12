
import java.util.Arrays;

// Search in 2d array

public class P4 {

    public static void main(String[] args) {
        
        int[][] array = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 0}
        };

        int target = 34;

        int[] result = search(array, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] array, int target) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{};
    }
}
