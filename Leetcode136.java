public class Leetcode136 {
    public static void main(String[] args) {

    }
    private static int uniqueElement(int[] arr) {
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }
}
