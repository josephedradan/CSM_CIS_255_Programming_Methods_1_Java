import java.util.Arrays;

public class question_33 {
    public static void main(String args[]) {
        Comparable index[] = {9, 3, 8, 1, 6};

        selectionSort(index);


    }
    public static void selectionSort(Comparable[] array) {
        System.out.println("******************** Pass Beginning includes INITIAL VERSION");
        for (int index = 0; index < array.length; index++) {
//            System.out.println(String.format("Pass Beginning | index %s | %s", index, Arrays.toString(array)));
//            System.out.println(String.format("Index %s | %s",index, Arrays.toString(array)));
            System.out.println(String.format("%s", Arrays.toString(array)));

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
//        System.out.println(String.format("%s",Arrays.toString(array)));
    }

    /* helper method */
    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
