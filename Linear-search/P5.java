// Max in 2d array

public class P5 {

    public static void main(String[] args) {
        
        int[][] array = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 0}
        };

        int result = search(array);

        System.out.println(result);
    }

    public static int search(int[][] array) {
        int max = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }
}