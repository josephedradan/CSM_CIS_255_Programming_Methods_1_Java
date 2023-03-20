import java.util.ArrayList;
import java.util.List;

public class Module_14 {
    public static void main(String args[]) {
        question6();
        question7();
        question8();
        question9(); //  0 1 2 3 4 5 IS CORRECT ANSWER
        question10();
        question11();
        question12();
//        test12();
        question13();
        question14();
        
        question15(); // n
        question16(); // n, CORRECT ANSWER IS n^2
        question17(); // n
        question18(); // n
        question19(); // n
        question20(); // n
        question21(); // 1
        question22(); // n
        question23(); // log n
        question24(); // n^2
        question25(); // n^3 (none of these is correct)
        question26(); // 1

        question27();
        question28();
    }

    private static void question28() {
        // An O(n) algorithm is referred to as having a _______ run time.
        // Linear
    }

    private static void question27() {
        // An algorithm that is O(1) _______.
        // does not necessarily require only one comparison
    }

    private static void question26() {
    //for(int i=0; i<100; i++) {
    //   System.out.println(n);
    //}
    }

    private static void question25() {
    //for(int i=1; i<=n; i++) {
    //   for(int j=0; j<n; j++) {
    //      for(int k=1; k<n; k++) {
    //         // code here that is independent of n
    //      }
    //   }
    //}
    }

    private static void question24() {
    //for(int i=1; i<=n; i++) {
    //   for(int j=0; j<n; j++) {
    //      for(int k=1; k<10; k++) {
    //         // code here that is independent of n
    //      }
    //   }
    //}
    }

    private static void question23() {
        //int sum=0;
        //
        //for(int counter = 1; counter < n; counter = 2 * counter) {
        //   sum = sum + counter;
        //}

        // Hint: pay careful attention to how the update function of the loop changes how often the loop runs!
        // (What happens if you double the problem size, how does the number of loops change?)
    }

    private static void question22() {
        //int sum=0;
        //
        //for(int counter = n; counter > 0; counter = counter-2) {
        //   sum = sum + counter;
        //}
        // Hint: pay careful attention to how the update function of the loop changes how often the loop runs!
        // (What happens if you double the problem size, how does the number of loops change?)
    }

    private static void question21() {
        //display a value at a specified index in an array of integers
        //
        //For example, display the 3rd element in the array, display the 10th element in the array, etc.
    }

    private static void question20() {
        // display all integers in an array of integers
    }

    private static void question19() {
//        for(int i=0; i<10; i++) {
//            for(int j=0; j<100; j++) {
//                // code that is O(n)
//            }
//        }
    }

    private static void question18() {
//        for(int i=0; i<n; i++) {
//            // code that is independent of n
//        }
//
//        for(j =0; j<n; j++) {
//            // code that is independent of n
//        }
    }

    private static void question17() {
//        // arrayList is type ArrayList
//
//        for(int i=0; i<arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
    }

    private static void question16() {
//        // arrayList is type ArrayList<String> filled with text of numbers that match their index: "0", "1", "2", "3", "4", ...
//
//        int n = arrayList.size();
//
//        for(int i=0; i<n; i++) {
//            String numberString = Integer.toString(i);
//            arrayList.remove(numberString);
//        }
    }

    private static void question15() {
//        // myList is type List
//
//
//        for(int i=1; i<myList.getLength() / 2 ; i++) {
//            System.out.println(myList.getEntry(i));
//        }


    }

    private static void question14() {
        System.out.println("\nQuestion 14");
        Comparable[] test1 = {2, 3, 7, 8, 10};
        Comparable target1 = 3;

        System.out.println(binarySearch(test1, target1));
        System.out.println();

        Comparable[] test2 = {"apple", "avocado", "banana", "pear"};
        Comparable target2 = "banana";

        System.out.println(binarySearch(test2, target2));
        System.out.println();

        Comparable target3 = "plum";

        System.out.println(binarySearch(test2, target3));
        System.out.println();


    }

    private static void question13() {
        System.out.println("\nQuestion 13");

        int[] list1 = {3, 5, 8, 9, 12, 14, 18, 19, 21, 23, 24, 26};
        int target = 16;
        System.out.println(String.format("Output: %s", binarySearchRecursiveQ(list1, target)));
    }

    private static void test12() {
        System.out.println("\nTest 12");

        int[] list1 = {2, 4, 5, 6, 8, 12, 13, 20, 31, 42, 43, 55};
        int target = 4;
        System.out.println(String.format("Output: %s", binarySearchRecursiveQ(list1, target)));
    }

    private static void question12() {
        System.out.println("\nQuestion 12");

        int[] list1 = {3, 5, 8, 9, 12, 14, 18, 19, 21, 23, 24, 26};
        int target = 23;
        System.out.println(String.format("Output: %s", binarySearchRecursiveQ(list1, target)));
    }


    private static void question11() {
        System.out.println("\nQuestion 11");

        int[] list1 = {14, 15, 18, 21, 24, 36, 38, 42};
        int target = -17;
        System.out.println(String.format("Output: %s", linearSearchIterativeImprovedForSorted(list1, target)));

    }

    private static void question10() {
        System.out.println("\nQuestion 10");

        int[] list1 = {14, 15, 18, 21, 24, 36, 38, 42};
        int target = 29;
        System.out.println(String.format("Output: %s", linearSearchIterativeImprovedForSorted(list1, target)));
    }

    private static void question9() {
        System.out.println("\nQuestion 9");

        int[] list1 = {14, 15, 18, 21, 24, 36, 38, 42};
        int target = 36;
        System.out.println(String.format("Output: %s", linearSearchIterativeImprovedForSorted(list1, target)));
    }


    private static void question8() {
        System.out.println("\nQuestion 8");

        int[] list1 = {22, 14, 18, 21, 29, 17, 16, 15};
        int target = -55;
        System.out.println(String.format("Output: %s", linearSearchIterative(list1, target)));
    }

    private static void question7() {
        System.out.println("\nQuestion 7");

        int[] list1 = {22, 14, 18, 21, 29, 17, 16, 15};
        int target = 88;
        System.out.println(String.format("Output: %s", linearSearchIterative(list1, target)));
    }

    private static void question6() {
        System.out.println("\nQuestion 6");

        int[] list1 = {22, 14, 18, 21, 29, 17, 16, 15};
        int target = 17;

        System.out.println(String.format("Output: %s", linearSearchIterative(list1, target)));
    }

    // LOOK AT SEARCHES FOR THE ORIGINALS
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    // finds the first location of a target
    public static int linearSearchIterative(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false; // include if we want to stop when we find the target
        // without this variable, we will return the LAST location of the target

        int comparisonCount = 0;

        for (int i = 0; (i < numbers.length && !found); i++) {
            comparisonCount++;
            if (numbers[i] == target) {
                found = true;
                targetLocation = i;
            }
        }
        System.out.println("In linear search iterative, comparison count is \t" + comparisonCount);
        return targetLocation;

    }

    public static int linearSearchRecursive(int[] numbers, int target) {
        comparisonCountLinearRecursive = 0;
        int answer = linearSearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
        System.out.println("In linear search recursive, comparison count is \t" + comparisonCountLinearRecursive);
        return answer;
    }

    private static int comparisonCountLinearRecursive = 0;

    private static int linearSearchRecursiveHelper(int[] numbers, int target, int first, int last) {
        comparisonCountLinearRecursive++;
        if (first > last) { // indices cross over- it's not here
            return -1;
        } else if (target == numbers[first]) { // we found it!
            return first;
        } else { // keep looking
            return linearSearchRecursiveHelper(numbers, target, first + 1, last);

        }
    }

    public static int linearSearchIterativeImprovedForSorted(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false;
        boolean gonePastTarget = false;
        int comparisonCount = 0;

        for (int i = 0; (i < numbers.length && !found && !gonePastTarget); i++) {
            comparisonCount++;
            if (numbers[i] == target) {
                found = true;
                targetLocation = i;
            } else if (numbers[i] > target) {
                gonePastTarget = true;
            }
        }
        System.out.println("In linear search optimized for sorting, count is \t" + comparisonCount);
        return targetLocation;
    }

    public static int binarySearchIterative(int[] numbers, int target) {
        int targetLocation = -1;
        boolean found = false;
        int first = 0;
        int last = numbers.length - 1;
        int comparisonCount = 0;

        while (first <= last && !found) {
            comparisonCount++;
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
        System.out.println("In binary search iterative, comparison count is \t" + comparisonCount);
        return targetLocation;
    }

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
    //////////////////////////////////////////////////////////// Q12 and Q13

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
    //////////////////////////////////////////////////////////// Question 14

    private static int comparisonCountBinaryRecursive = 0;

    public static int binarySearch(Comparable[] objects, Comparable target) {
        comparisonCountBinaryRecursive = 0;
        int answer = binarySearchHelper(objects, target, 0, objects.length - 1);
        System.out.println("In binary search (That is recursive), comparison count is \t" + comparisonCountBinaryRecursive);
        return answer;
    }

    private static int binarySearchHelper(Comparable[] objects, Comparable target, int first, int last) {
        int mid = ((last - first) / 2) + first;
        System.out.println(String.format("first = %s, last = %s, mid = %s", first, last, mid));
        comparisonCountBinaryRecursive++;
        if (first > last) {
            return -1; // indices cross over
        } else if (target.equals(objects[mid])) {
            return mid; // we found it!
        } else if (target.compareTo(objects[mid]) < 0) {
            return binarySearchHelper(objects, target, first, mid - 1);
            // keep looking in left half
        } else { // target > numbers[mid]
            return binarySearchHelper(objects, target, mid + 1, last);
            // keep looking in right half
        }
    }
}
