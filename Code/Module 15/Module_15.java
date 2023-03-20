import java.util.Arrays;

public class Module_15 {
    public static void main(String args[]) {
        System.out.println("*************** NVM COUNT REGARDLESS OF THE ANSWER FROM THE Practice Question ");
        System.out.println("Q5 How many total passes will execute during the selection sort? ITS 8 NOT 7");
        System.out.println("Q7 How many total passes will execute during the selection sort? ITS 7 NOT 6");

        System.out.println("If you use selection sort if you have 5 elements then 4 prints should be called");
        question4(); // Trace Selection sort
        System.out.println();

        question5();

    }

    private static void question5() {
        System.out.println("Problem 5 Insertion sort, ignore last one in the print thingy");

        Comparable test[] = {27, 14, 23, 28, 19, 12, 20, 10};
        System.out.println(Arrays.toString(test));
        insertionSort(test);
    }

    private static void question4() {
        System.out.println("Problem 4 Selection sort, ignore last one in the print thingy IF USE YOU PASS END");

        Comparable test[] = {27, 32, 14, 24, 19, 18, 11, 10};
        System.out.println(Arrays.toString(test));
        selectionSort(test);


    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void selectionSort(Comparable[] array) {
        System.out.println("******************** Pass Beginning includes INITIAL VERSION");
        for (int index = 0; index < array.length; index++) {
            System.out.println(String.format("Pass Beginning | index %s | %s", index, Arrays.toString(array)));
            Comparable currentMin = array[index];
            int indexOfMin = index;

            for (int j = index + 1; j < array.length; j++) {
                if (array[j].compareTo(currentMin) < 0) {
                    // array[j] smaller than currentMin
                    currentMin = array[j];
                    indexOfMin = j;
                }
            }

            swap(array, index, indexOfMin);
//            System.out.println(String.format("Pass End | %s | %s", index, Arrays.toString(array)));


        }
    }

    /* helper method */
    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void insertionSort(Comparable[] array) {
        System.out.println("******************** Pass Beginning includes INITIAL VERSION");
        for (int index = 1; index < array.length; index++) {
            System.out.println(String.format("Pass Beginning | index %s | %s", index, Arrays.toString(array)));

            Comparable firstUnsorted = array[index];

            int position = index;
            while (position > 0 &&
                    firstUnsorted.compareTo(array[position - 1]) < 0) {

                array[position] = array[position - 1]; // make room (shift)
                position--;
            }
            array[position] = firstUnsorted; // insert
//            System.out.println(String.format("Pass End | %s | %s", index, Arrays.toString(array)));

        }
    }
}

