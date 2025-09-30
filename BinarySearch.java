public class BinarySearch {
    public static void main(String[] args) {

    }

    // Note that the initial array should be sorted in ascending order
    private static int binarySearch(int[] arr, int target) {

        if(arr.length == 0) return -1;
        if(arr.length == 1) {
            if(arr[0] == target) {
                return 0;
            }
            return -1;
        }

        int lowIdx = 0, highIdx = arr.length - 1;

        while(lowIdx < highIdx) {

            int middleIdx = lowIdx + (highIdx - lowIdx) / 2; // Used for preventing from overflow
            // int middleIdx = (lowIdx + highIdx) / 2;

            if(arr[middleIdx] == target) return middleIdx;

            else if(arr[middleIdx] < target) {

                lowIdx = middleIdx + 1;

            } else {

                highIdx = middleIdx - 1;

            }

        }

        return -1;

    }
}

