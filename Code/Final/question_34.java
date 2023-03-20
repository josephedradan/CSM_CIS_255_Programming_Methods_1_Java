import java.util.Arrays;

public class question_34 {
    public static void main(String args[]) {
        Comparable index[] = {7, 4, 9, 2, 5};

        insertionSort(index);
    }
    public static void insertionSort(Comparable[] array) {
        System.out.println("******************** Pass Beginning includes INITIAL VERSION");
        for (int index = 1; index < array.length; index++) {
//            System.out.println(String.format("Pass Beginning | index %s | %s", index, Arrays.toString(array)));
//            System.out.println(String.format("index %s | %s", index, Arrays.toString(array)));
            System.out.println(String.format("%s",Arrays.toString(array)));

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
        System.out.println(String.format("%s",Arrays.toString(array)));

    }

}
