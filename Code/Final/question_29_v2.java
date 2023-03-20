public class question_29_v2 {
    public static void main(String args[]) {
        // Q 29
        int[] index = {13, 82, 19, 42, 21, 17, 26, 53,39};
//        linearSearchIterative(index, 18);


        // Q 30 // I USED THE WRONG INDEX BUT NOW ITS FIXED
        int[] index2 = {42, 13, 25, 29, 26, 32, 46, 89, 72}; // 0 1 2 3 4
        linearSearchIterative(index2, 26);
        System.out.println();
        linearSearchRecursive(index2, 26);

    }

    public static int linearSearchIterative(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false; // include if we want to stop when we find the target
        // without this variable, we will return the LAST location of the target

        int comparisonCount = 0;

        for (int i = 0; (i < numbers.length && !found); i++) {
            comparisonCount++;
            System.out.println(i);
            if (numbers[i] == target) {
                found = true;
                targetLocation = i;
            }
        }
        System.out.println();
        System.out.println("In linear search iterative, comparison count is \t" + comparisonCount);
        return targetLocation;

    }
    public static int linearSearchRecursive(int[] numbers, int target) {
        comparisonCountLinearRecursive = 0;
        int answer = linearSearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
        System.out.println();
        System.out.println("In linear search recursive, comparison count is \t" + comparisonCountLinearRecursive);
        return answer;
    }

    private static int comparisonCountLinearRecursive = 0;

    private static int linearSearchRecursiveHelper(int[] numbers, int target, int first, int last) {
        System.out.println(comparisonCountLinearRecursive);
        comparisonCountLinearRecursive++;
        if (first > last) { // indices cross over- it's not here
            return -1;
        } else if (target == numbers[first]) { // we found it!
            return first;
        } else { // keep looking
            return linearSearchRecursiveHelper(numbers, target, first + 1, last);

        }
    }
}
