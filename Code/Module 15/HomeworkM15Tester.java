import java.util.Arrays;

public class HomeworkM15Tester {

    public static void main(String[] args) {
        Integer[] sortedNumbers1 = {18, 15, 13, 9, 7, 5, 2};
        Integer[] sortedNumbers2 = {8, 7, 6, 5, 4, 3, 2};
        Integer[] sortedNumbers3 = {7, 7, 6, 5, 4, 3, 3, 2, 2};
        Integer[] sortedNumbers4 = {2, 2, 2, 2, 2, 2};
        Integer[] sortedNumbers5 = {};

        Integer[] unsortedNumbers1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] unsortedNumbers2 = {4, 15, 18, 13, 7, 8, 2};
        Integer[] unsortedNumbers3 = {6, 7, 6, 5, 4, 3, 2};

        String[] sortedWords1 = {"durian", "carrot", "banana", "apple"};
        String[] unsortedWords1 = {"elephant", "gorilla", "hippo", "zebra"};


        System.out.println("Sorted numbers 1 sorted? \ttrue:  " + isSortedDescending(sortedNumbers1));
        System.out.println("Sorted numbers 2 sorted? \ttrue:  " + isSortedDescending(sortedNumbers2));
        System.out.println("Sorted numbers 3 sorted? \ttrue:  " + isSortedDescending(sortedNumbers3));
        System.out.println("Sorted numbers 4 sorted? \ttrue:  " + isSortedDescending(sortedNumbers4));
        System.out.println("Sorted numbers 5 sorted? \ttrue:  " + isSortedDescending(sortedNumbers5));

        System.out.println("Unsorted numbers 1 sorted? \tfalse: " + isSortedDescending(unsortedNumbers1));
        System.out.println("Unsorted numbers 1 sorted? \tfalse: " + isSortedDescending(unsortedNumbers2));
        System.out.println("Unsorted numbers 1 sorted? \tfalse: " + isSortedDescending(unsortedNumbers3));

        System.out.println("Sorted words 1 sorted? \t\ttrue:  " + isSortedDescending(sortedWords1));
        System.out.println("Unsorted words 1 sorted? \tfalse: " + isSortedDescending(unsortedWords1));
    }


    public static boolean isSortedDescending(Comparable[] array) {
        int value;
        for (int i = 0; i < array.length - 1; i++) {
            value = array[i].compareTo(array[i + 1]);
//            System.out.println(value);
            if (value < 0) {
                return false;
            }
        }
        return true;
    }


}
