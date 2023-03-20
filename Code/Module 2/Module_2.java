import javax.print.DocFlavor;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;

public class Module_2 {
    public static void main(String args[]) {
//        good_shit();
        test_zone();

//        int[] arrayTest = {1,2,2,3,5,5,5,213};

//        System.out.println(mystery());
//        System.out.println(method3(new int[] {1,2,2,3,5,5,5,213})); // Print number of 5's in array
//        System.out.println(method2(new int[] {1,2,2,3,10,5,5,213})); // Print index 4

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(2);
//        list.add(5);
//        list.add(13);
//        System.out.println(method4(list));
//        System.out.println(Arrays.toString(getArrayWithRandomValues(10, 1, 100)));
//        System.out.println(Arrays.toString(isValueInArray(new int[] {4, 5, 3, 4, 7, 2, 4} , 4)));
//        System.out.println(numberOfSpecficCharInStringArray(new String[]{"heel", "mouse", "EEK", "cat", "yikes"}, 'e'));
//        System.out.println(calculateAverage(new int[]{4, 5, 2, 1, 7, 3, 9}, 4));
//        switchThem(new int[]{1, 2, 3}, new int[]{4, 5, 6});

//        String[] words1 = {"a", "b", "c"};
//        words1 = copyAndExpand(words1);
//        System.out.println(Arrays.toString(words1));
//        // words1 now holds {"a", "b", "c", null, null, null}
//
//        String[] words2 = new String[1];
//        words2[0] = "hi";
//        words2 = copyAndExpand(words2);
//        System.out.println(Arrays.toString(words2));
//        // words2 now holds {"hi", null}


        // Could have looked better, oh well
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        boolean condition = true;
//        System.out.println("Input Strings, if string is empty then it will stop.");
//        while(condition){
//            String input = scanner.nextLine();
//            if(input.equals("")){
//                condition = false;
//            }else{
//                stringArrayList.add(input);
//            }
//        }
//        for(int i = 0; i < stringArrayList.size(); i++){
//            System.out.printf("String: %s Number of Char(s): %s\n",stringArrayList.get(i),stringArrayList.get(i).length());
//        }
    }

    private static void good_shit() {
        List<Integer> testMe = new ArrayList<Integer>();
        List<Integer> testMe2 = new ArrayList<Integer>(100);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(13);

        System.out.println(list); // If it was a array it would return an object reference?

        IntStream.range(0, list.size())
                .mapToObj(index -> String.format("%d -> %s", index, list.get(index)))
                .forEach(System.out::println);

        int value = 0;
        for (Integer i : list) {
            value++;
        }
    }

    private static void test_zone() {
//        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
//        System.out.println(intArray[intArray.length-1]); // last element in array

////        int[] primes = new {2,3,5,7,11}; // WRONG
//        int[] scores = new int[30];
////        int[] scores = int[30]; // WRONG
//        double[] elapsedTimes = {11.47, 12.04, 11.72, 13.88};
//        char grades[] = {'a', 'b', 'c', 'd', 'f'};
////        int primes = {2, 3, 4, 5, 7, 11}; // WRONG
////        char[] grades = new char[]; // WRONG

//        System.out.println(elapsedTimes.length);

//        int[] values = new int[7];
//        System.out.println(values.length);

        // THIS IS COMPILE TIME ERROR
//        int[] nums = {3, 2, 3, 6, 9, 10, 12};
//
//        for (int count = 1; count <= nums.length; count++) {
//            System.out.println(nums[count]);
//        }
        // THIS IS COMPILE TIME ERROR
//        int = "sdfsdf";

        // Run Time Error
//        int[] nums = new int[5];
//        for(int i=0; i<=5; i++) {
//            System.out.println(nums[i]);
//        }

//        char[] letters = {'b', 'y', 'e'};
//
//        for(int i=0; i<letters.length; i++) {
//
//            System.out.print(letters[i] + "-");
//
//        }
        // Result b-y-e-

//        int[] numbers = {4, 6, 8};
//        System.out.print(numbers[0] + "" + numbers[1] + "" + numbers[2] + " ");
//        numbers[1] = numbers[2];
//        System.out.print(numbers[0] + "" + numbers[1] + "" + numbers[2]);
        // 	468 488

//        int[] array = {3, 5, 7};
//        System.out.println(array);
        // [I@5f150435
        // NEED System.out.println(Arrays.toString(array));

//        int[] array = {3, 5, 7};
//        System.out.println(array.toString());
        // [I@1c53fd30

//        int[] array = {3, 5, 7};
//        System.out.println(Arrays.toString(array));

//        int[] numberOfVacationDays = new int[100];
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//        numberOfVacationDays[x] = x; // Changes
//        numberOfVacationDays[x] += y; // Adds
//        System.out.println(Arrays.toString(numberOfVacationDays));
        // adds y days to the number held by employee x

//        int[] values = {1, 2, 3};
//        values[0] = values[1];
//        values[1] = values[0];
//        System.out.println(Arrays.toString(values));
        // 2, 2, 3

        // An array is fixed in size when it is instantiated. In other words, you cannot change the size of an array.
        // True

//        int[] a = {1, 6, 7};
//        int[] b = new int[3];
//        b[0] = 1;
//        b[1] = 6;
//        b[2] = 7;
//        boolean same = (a == b ); // Comparing Reference Values
//        System.out.println(same);
        // False

//        int[] a = {1, 6, 7};
//        int[] b = {1, 6, 7};
//        boolean same = (a == b );
//        System.out.println(same); // Comparing Reference Values
        // False

//        int[] a = {1, 6, 7};
//        int[] b = a;
//        boolean same = (a == b );
//        System.out.println(same);
        // True

//        List<Integer> testMe = new ArrayList<Integer>();
//        List<Integer> testMe2 = new ArrayList<Integer>(100);
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(2);
//        list.add(5);
//        list.add(13);
//        System.out.println(list);
//        IntStream.range(0, list.size())
//                .mapToObj(index -> String.format("%d -> %s", index, list.get(index)))
//                .forEach(System.out::println);
        // 0 is 2, 1 is 5, 2 is 13

//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(4);
//        list.add(7);
//        list.add(9);
//        list.add(1, 3);
//        System.out.println(list);
        // [4, 3, 7, 9]

//        ArrayList<String> words = new ArrayList<>();
//        words.add("apple");
//        words.add("banana");
//        words.size() = 2;
        // WILL NOT COMPILE

//        String m1, q2;
//        m1 = "Java is great!";
//        q2 = m1.toUpperCase();
//        System.out.println(m1);
        // Java is great!

//        String m1, q2;
//        m1 = "Java is great!";
//        q2 = m1.toUpperCase();
//        System.out.println(q2);
        // JAVA IS GREAT!

//        String title = "Java is fun!";
//        int result = title.length();
//        System.out.println(result);
        // 12

//        String title = "Java Programming";
//        int result = title.indexOf('a');
//        System.out.println(result);
        // 1

//        String title = "Java is great.";
//        int result = title.lastIndexOf('a');
//        System.out.println(result);
        // 11

//        String title = "All of us love Java";
//        String stringResult = title.replace('a', 'Q');
//        System.out.println(stringResult);
        //All of us love JQvQ

//        String title = "JavaTextbook";
//        String stringResult = title.substring(5);
//        System.out.println(stringResult);
        // extbook

//        String title = "Java is the best.";
//        String stringResult = title.substring(9, 14);
//        System.out.println(stringResult);
        // he be

        // CHECK OUT
//        String book = "Java";
//        String result = book.substring(1, 2);
//        System.out.println(result);
        // a

//        String book = "Java";
//        String result = book.substring(1, 2);
//        System.out.println(book);
        // java

//        String introduction ="123456789";
//        System.out.println(introduction.substring(8,9));
//        System.out.println(introduction.charAt(8));
//        System.out.println(introduction.substring(7,8)); // CORRECT
//        System.out.println(introduction.charAt(7)); / CORRECT

//        String word = "hello.";
//        word = word.toUpperCase();
//        word.toUpperCase();
//        System.out.println(word.toUpperCase());
//        System.out.println(word);

//        System.out.println("7" + 1 + 2);
        // 712

//        System.out.println(7 + "1" + 2);
        // 712

//        System.out.println(7 + 1 + "2");
        // 82

//        String emails = "";
//        for(String email : emailList) {
//            emails += (email +"," );
//        }
        // THIS IS SLOWER

//        StringBuilder emails = new StringBuilder();
//        for(String email : emailList) {
//            emails.append(email);
//            emails.append(",");
//        }
        // THIS IS FASTER

//        StringBuilder sb = new StringBuilder("pear");
//
//        sb.insert(1, "brownb"); // after p
//        sb.delete(0, 1); // p
//        sb.insert(5, " "); // after b
//        System.out.println(sb);
        //brown bear





    }

    // returns the index of the employee with the most days
    public static int mystery() {
        int a = -1;
        int b = 0;
//        int[] numberOfVacationDays = new int[]{1,2,112,54,5,6,10,8,9,20};
        int[] numberOfVacationDays = {1, 2, 112, 54, 5, 6, 10, 8, 9, 20};

        for (int i = 0; i < numberOfVacationDays.length; i++) {
            if (numberOfVacationDays[i] > a) {
                a = numberOfVacationDays[i];
                b = i;
            }
        }
        return b;
    }

    // count number of 5's in array
    public static int method3(int[] array) {
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                value++;
            }
        }
        return value;
    }

    // Returns index position of value 10 or else -1
    public static int method2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    // counts the number of values in the ArrayList
    public static int method4(ArrayList<Integer> list) {
        int value = 0;
        // FOR EACH
        for (Integer i : list) {
            value++;
        }
        return value;
    }

    public static int[] getArrayWithRandomValues(int arraySize, int lowerBound, int upperBound) {
        Random object = new Random();
//        int value = object.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        int[] createdArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            createdArray[i] = object.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        }
        return createdArray;

    }

    public static boolean[] isValueInArray(int[] givenArray, int givenValue) {
        boolean[] createdArray = new boolean[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            if (givenValue == givenArray[i]) {
                createdArray[i] = true;
            } else {
                createdArray[i] = false;

            }
        }
        return createdArray;
    }

    public static int numberOfSpecficCharInStringArray(String[] stringArray, char character) {
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
            for (int c = 0; c < stringArray[i].length(); c++) {
//                System.out.println(stringArray[i].charAt(c));
                if (character == stringArray[i].charAt(c)) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    public static double calculateAverage(int[] nums, int numElements) {
        int sum = 0;
        for (int i = 0; i < numElements; i++) {
            sum += nums[i];
        }
        return (double) sum / numElements;
    }

    public static void switchThem(int[] first, int[] second) {
        if (first.length == second.length) {

            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(second));

            // python a, b = b, a
            int[] temp = first;
            first = second;
            second = temp;

            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(second));

        } else {
            System.out.println("You broke it");

        }
    }

    public static String[] copyAndExpand(String[] array) {
        String[] createdString = new String[array.length * 2];
//        for (int i = 0; i < array.length; i++) {
//            createdString[i] = array[i];
//        }
//        for (int i = array.length; i < array.length*2; i++) {
//            createdString[i] = null;
//        }

//        for (int i = 0; i < array.length * 2; i++) {
////            System.out.println(Arrays.toString(createdString));
//            try {
//                createdString[i] = array[i];
//            } catch (Exception e) {
//                createdString[i] = null;
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            createdString[i] = array[i];
        }

        return createdString;
    }
}
