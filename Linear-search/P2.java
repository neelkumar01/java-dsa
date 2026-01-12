// Search in string

public class P2 {
    public static void main(String[] args) {
        
        // char search

        String name = "neel";
        boolean bool = search(name, 'n');
        System.out.println(bool);
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch: str.toCharArray()) {                      // ❤️
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
