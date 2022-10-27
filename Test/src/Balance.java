public class Balance {
    // write your code here
    private static int left = 0;
    private static int right = 0;

    public static char getSituation() {
        if (left == right) {
            return '=';
        } else if (left > right) {
            return 'L';
        } else {
            return 'R';
        }
    }

    private static void addRight(int n) {
        right += n;
    }

    private static void addLeft(int n) {
        left += n;
    }

}