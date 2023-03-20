import java.util.*;

public class Final_test_zone {
    public static void main(String args[]) {
//        question6();
//        question7();      // its not AD
//        printPositiveAverage(2,4); //
//        printPositiveAverage(1,4); //
//        printPositiveAverage(0,4); // Exception
//        question14();
//        question15();

//        question16();
//        question17();
//        question18();
//        question20();
//        question21();
//        question22(); // WILL CRASH An ArrayIndexOutOfBounds exception is thrown
//        question23(); // WILL CRASH An ArrayIndexOutOfBounds exception is thrown
//        question24();
//        question25(); // cause inf recursion
//        question26();
        // Binary search needs to be order not linear ( sequential )
    }

    private static void question26() {
        System.out.println("Example");
        countdown(10);

        System.out.println();

        System.out.println("Mine");
        countdownRecursive(10);
    }
    public static void countdownRecursive(int n){
        countdownRecursiveHelper(n,n);
    }
    public static void countdownRecursiveHelper(int n, int i) {
        if (i > 0) {
            System.out.println(n);
            countdownRecursiveHelper(n, i-1);
        } else {
            System.out.println("Blastoff!");
        }
    }

    public static void countdown(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(n);
        }
        System.out.println("Blastoff!");
    }

    private static void question25() {
        System.out.println(doSomething(1, 2));

    }

    private static void question24() {
        System.out.println(doSomething(7, 3));
    }

    public static int doSomething(int x, int y) {
        if (x == y) {
            return 0;
        } else {
            return 2 + doSomething(x - 1, y);
        }
    }

    private static void question23() {
        int[] arr = {3, 2, 4, 6, 1, 5, 2, 3, 1};

        System.out.println("Q 23");
        System.out.println(myMethod(arr, -3, -5));
        System.out.println();

    }

    private static void question22() {
        int[] arr = {3, 2, 4, 6, 1, 5, 2, 3, 1};

        System.out.println("Q 22");
        System.out.println(myMethod(arr, -5, -3));
        System.out.println();

    }

    private static void question21() {
        int[] arr = {3, 2, 4, 6, 1, 5, 2, 3, 1};

        System.out.println("Q 21");
        System.out.println(myMethod(arr, 4, 4));
        System.out.println();
    }

    private static void question20() {
        int[] arr = {3, 2, 4, 6, 1, 5, 2, 3, 1};

        System.out.println("Q 20");
        System.out.println(myMethod(arr, 2, 6));
        System.out.println();

    }

    public static int myMethod(int[] array, int x, int y) {
        if (x <= y) {
            return array[x] + myMethod(array, x + 1, y);

        } else {
            return 0;
        }
    }

    private static void question18() {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(1);
        System.out.println(s.pop()); // 1
        s.push(3);
        System.out.println(s.pop()); // 2
        s.push(8);
        System.out.println(s.pop()); // 3
        s.push(7);
        s.push(6);
        s.push(2);
        s.push(5);
        System.out.println(s.peek()); // 6
        System.out.println(s.pop()); // 5
        s.push(s.pop());
        System.out.println(s.pop()); // 6
        System.out.println(s.pop()); // 7
        System.out.println(s.pop()); // 8

    }

    private static void question17() {
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        Queue<Integer> q = new LinkedList<>();

        q.offer(4);
        q.offer(1);
        System.out.println(q.poll()); // 1
        q.offer(2);
        q.offer(3);
        q.offer(5);
        q.offer(8);
        System.out.println(q.poll()); // 2
        System.out.println(q.poll()); // 3
        System.out.println(q.poll()); // 4
        q.offer(6);
        q.offer(7);
        System.out.println(q.poll()); // 5
        q.offer(q.poll());
        System.out.println(q.poll()); // 6
        System.out.println(q.poll()); // 7
        System.out.println(q.poll()); // 8

    }

    private static void question16() {
        LinkedList list = new LinkedList<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(6);
        System.out.println(list.remove()); // 1
        list.add(5);
        System.out.println(list.add(3)); // 2
        list.add(9);
        list.add(8);
        System.out.println(list.remove()); // 3
        System.out.println(list.remove()); // 4
        list.add(1, 7);
        System.out.println(list.remove()); // 5
        System.out.println(list.remove()); // 6
        System.out.println(list.get(2)); // 7
        list.remove();
        System.out.println(list.size()); // 8

        /*
        4
        true
        3
        2
        1
        7
        3
        4
         */
    }

    private static void question15() {
        List stringList = new ArrayList(); // line 1
        stringList.add("apple"); // line 2
        stringList.add("pear"); // line 3
//        String fruit = stringList.get(0); // line 4
//        System.out.println(fruit + " " + stringList.get(1)); // line 5

        // LINE 4 IS THE PROBLEM
    }

    private static void question14() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList.get(37));
    }

    private static void question7() {
        int value = 800;
        try {
            System.out.print("A");

            if (value < 500) {
                throw new Exception("B");
            }

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        System.out.print("D");
    }


    private static void question6() {
        int value = 100;
        try {
            System.out.print("A");

            if (value < 500) {
                throw new Exception("B");
            }

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        System.out.print("D");
    }

    // Question 12
    public static void printPositiveAverage(int x, int y) {
        try {
            if (x > 0 && y > 0) {
                System.out.println((double) (x + y) / 2);
            } else {
                throw new NonPositiveNumberException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}