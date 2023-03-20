import java.util.*;

public class Module_12 {
    public static void main(String[] args) {
//        test_code();
//        question4(); // COMPILE ERROR
//        question5(); // WORK
//        question6(); // COMPILE ERROR
//        question7(); // RUNTIME CANT CAST STRING TO INT
//        question8(); // RUNTIME ERROR OUT OF BOUND
//        question9(); // WRONG: CAN HAVE DUPLICATES // CORRECT: A List object cannot contain duplicates. CANNOT!!!!!!!!!!!!!!!!!!!!
//        question10(); // LIST IS ZERO INDEXED
//        question11(); // QUEUE FIFO
//        question12(); // Stack LIFO
//        question13(); // Stack peek
//        question14(); // Stack popping out Exception in thread "main" java.util.EmptyStackException
        // Stack is last in first out
//        question16();
//        question18();
        question20();

        reverseStackOrder();
    }

    private static void reverseStackOrder() {
    }

    private static void question20() {

        Stack<Integer> s = new Stack<>();

        s.push(23);
        s.push(9);
        System.out.println(s.pop());    // p1
        s.push(14);
        s.push(3);
        s.push(17);
        s.push(8);
        System.out.println(s.pop());     // p2
        System.out.println(s.peek());    // p3

        System.out.println(s.toString());
        System.out.println(Arrays.toString(s.toArray()));

        /*

        9
        8
        17
        [23, 14, 3, 17]
        [23, 14, 3, 17]
         */
    }

    private static void question18() {
        PriorityQueue<Integer> q = new PriorityQueue();

        q.offer(4);
        q.offer(2);
        q.offer(7);
        System.out.println(q.poll());  // d1
        q.offer(1);
        q.offer(3);
        System.out.println(q.poll());   // d2
        System.out.println(q.poll());   // d3
        q.offer(5);
        q.offer(8);

        System.out.println(q.toString());

//        q.enqueue(4);
//        q.enqueue(2);
//        q.enqueue(7);
//        System.out.println(q.dequeue());  // d1
//        q.enqueue(1);
//        q.enqueue(3);
//        System.out.println(q.dequeue());   // d2
//        System.out.println(q.dequeue());   // d3
//        q.enqueue(5);
//        q.enqueue(8);

        /*

        2
        1
        3
        [4, 7, 5, 8]

         */
    }


    private static void question16() {
        List<Integer> aList = new LinkedList<>();
        aList.add(4);
        aList.add(7);
        aList.add(12);
        System.out.println(aList.remove(2));  // r1
        aList.add(5);
        aList.add(8);
        aList.add(18);
        System.out.println(aList.get(0)); // r2
        System.out.println(aList.remove(4));   // r3
        System.out.println(aList.toString());
        aList.add(1, 3);
        System.out.println(aList.toString());
        System.out.println(aList.remove(3));
        System.out.println(aList.remove(2));   // r4
        System.out.println(aList.remove(1));   // r5

        System.out.println(aList.toString());

        /*


        12 r1
        4 r2
        18 r3
        [4, 7, 5, 8]
        [4, 3, 7, 5, 8]
        5
        7 r4
        3 r5
        [4, 8]


         */
    }

    private static void question13() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
    }

    private static void question14() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        // Exception in thread "main" java.util.EmptyStackException
    }

    private static void question12() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();

        /*
        [1, 2, 3]
        [1, 2]
        [1]
         */

    }

    private static void question11() {
        PriorityQueue<String> bob = new PriorityQueue<>();

        bob.offer("FIRST");
        bob.offer("SECOND");
        bob.offer("THIRD");
        System.out.println(bob.peek()); // WILL SHOW FIRST IN QUEUE
        bob.poll(); // WILL REMOVE FISRT IN QUEUE
        System.out.println(bob.peek()); // WILL SHOW FIRST IN QUEUE

    }

    private static void question10() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("ZERO");
        wordList.add("ONE");
        wordList.add("TWO");
        wordList.add("THERE");
        System.out.println(wordList.get(1)); // IS 0 INDEXED
    }

    private static void question9() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("FUCK");
        wordList.add("FUCK");
        wordList.add("FUCK");
        wordList.add("FUCK");
        System.out.println(wordList.toString()); // CAN HAVE DUPLICATES
    }

    private static void question8() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("hello");
        wordList.get(99); // OUT OF BOUND
    }

    private static void question7() {
        List wordList = new ArrayList();
        wordList.add("hello");
        Integer num = (Integer) wordList.get(0);
        // RUN TIME ERROR CANT CAST STRING TO INT
    }

    private static void question6() {
        List wordList = new ArrayList();
        wordList.add("hello");
//        String word = wordList.get(0);
        // Compile error
    }

    private static void question5() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("hello");
        String word = wordList.get(0);
        System.out.println(word);
        // WILL WORK
    }

    private static void question4() {
        List<String> wordList = new ArrayList<String>();
        wordList.add("hello");
//        wordList.add(4);
        // Compile error
    }

    private static void test_code() {
        List<Integer> bob = new ArrayList<>();

        // Question 2 Iterator method __________ determines whether a Collection contains more elements to look at.
        bob.add(123);

        Collections.sort(bob);

        Iterator it = bob.iterator();

        it.hasNext();
    }

}
