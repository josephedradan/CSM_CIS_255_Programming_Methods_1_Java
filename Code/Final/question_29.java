public class question_29 {
    public static void main(String args[]) {

        int[] index = {3, 7, 12, 15, 18, 19, 24, 32};

        int target1 = 24;
        int target2 = 3;
        int target3 = 20;
        int target4 = 4;

        System.out.println("Target = 24");
        binarySearchRecursiveQ(index, target1);
        System.out.println();
        System.out.println("Target = 3");
        binarySearchRecursiveQ(index, target2);
        System.out.println();
        System.out.println("Target = 20");
        binarySearchRecursiveQ(index, target3);
        System.out.println();
        System.out.println("Target = 4");
        binarySearchRecursiveQ(index, target4);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Target = 24");
        binarySearchRecursive(index, target1);
        System.out.println();
        System.out.println("Target = 3");
        binarySearchRecursive(index, target2);
        System.out.println();
        System.out.println("Target = 20");
        binarySearchRecursive(index, target3);
        System.out.println();
        System.out.println("Target = 4");
        binarySearchRecursive(index, target4);

    }


    //////////////////////////////////////////////////////////////////////////////// Q12 and Q13


    // DONT USE THIS ONE EVEN THOUGH SHE GAVE IT, IT WONT WORK FOR TEH CORRECT ANSWER
    @Deprecated
    public static int binarySearchIterativeQ(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false;
        int first = 0;
        int last = numbers.length - 1;

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

    private static int comparisonCountBinaryRecursiveOriginalQ = 0;

    public static int binarySearchRecursiveQ(int[] numbers, int target) {
        comparisonCountBinaryRecursiveOriginalQ = 0;
        int answer = binarySearchRecursiveHelperQ(numbers, target, 0, numbers.length - 1);
        System.out.println("In binary search recursive, comparison count is \t" + comparisonCountBinaryRecursiveOriginalQ);
        return answer;
    }

    private static int binarySearchRecursiveHelperQ(int[] numbers, int target, int first, int last) {
        int mid = ((last - first) / 2) + first;
        comparisonCountBinaryRecursiveOriginalQ++;
        System.out.println(String.format("first = %s, last = %s, mid = %s", first, last, mid));

        if (first > last) {
            return -1; // indices cross over
        } else if (target == numbers[mid]) {
            return mid; // we found it!
        } else if (target < numbers[mid]) {
            return binarySearchRecursiveHelperQ(numbers, target, first, mid - 1);
        } else { // target > numbers[mid]
            return binarySearchRecursiveHelperQ(numbers, target, mid + 1, last);
        }
    }


    //////////////////////////////////////////////////////////////////////////////// Standard


    public static int binarySearchRecursive(int[] numbers, int target) {
        comparisonCountBinaryRecursiveOriginal = 0;
        int answer = binarySearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
        System.out.println("In binary search recursive, comparison count is \t" + comparisonCountBinaryRecursiveOriginal);
        return answer;
    }

    private static int comparisonCountBinaryRecursiveOriginal = 0;

    private static int binarySearchRecursiveHelper(int[] numbers, int target, int first, int last) {
        int mid = ((last - first) / 2) + first;
        comparisonCountBinaryRecursiveOriginal++;
        System.out.println(String.format("first = %s, last = %s, mid = %s", first, last, mid));

        if (first > last) {
            return -1; // indices cross over
        } else if (target == numbers[mid]) {
            return mid; // we found it!
        } else if (target < numbers[mid]) {
            return binarySearchRecursiveHelper(numbers, target, first, mid - 1);
            // keep looking in left half
        } else { // target > numbers[mid]
            return binarySearchRecursiveHelper(numbers, target, mid + 1, last);
            // keep looking in right half
        }
    }
}
