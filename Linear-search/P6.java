// Find total numbers with even number of digits

public class P6 {
    public static void main(String[] args) {
        
        int[] nums = {12, 345, 2, 6, 7896};

        int result = search(nums);

        System.out.println(result);

    }

    static int search(int[] array) {
        int count = 0;
        for (int num : array) {
            if ((num + "").length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
