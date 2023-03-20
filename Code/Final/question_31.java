public class question_31 {
    public static void main(String args[]) {
//        question31();
        question32();
    }

    private static void question31() {
        int[] index = {28, 33, 38, 45, 56, 59, 61, 62, 78};
        System.out.println(binarySearch(index, 62));
    }

    private static void question32() {
        int[] index = {12, 18, 24, 31, 33, 49, 51, 54, 58};
        System.out.println(binarySearch(index, 26));
    }

    public static int binarySearch(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false;
        int first = 0, last = numbers.length - 1;

        while (first <= last && !found) {
            int mid = (first + last) / 2;

            System.out.println(String.format("first = %s, last = %s, mid = %s", first, last, mid));
            if (numbers[mid] == target) {
                targetLocation = mid;
                found = true;
            } else if (numbers[mid] < target) {
                first = mid + 1;
            } else { // numbers[mid] > target
                last = mid - 1;
            }
        }
        return targetLocation;
    }
}
