import java.util.*;


public class HomeworkM12Driver {

	public static void main(String[] args) {
		System.out.println("Stacks are printed \t[Bottom to Top]\n");

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Original stack is \t[1, 2, 3, 4]: \t" + stack);
		Stack<Integer> reverseStack = createReverseStack(stack);
		System.out.println("Reverse stack is \t[4, 3, 2, 1]: \t" + reverseStack);
		System.out.println("Original stack still \t[1, 2, 3, 4]:\t" + stack);

//        System.out.println();
//		stack.pop();
//        System.out.println("Original stack is \t[1, 2, 3, 4]: \t" + stack);
//        reverseStack = createReverseStack(stack);
//        System.out.println("Reverse stack is \t[4, 3, 2, 1]: \t" + reverseStack);
//        System.out.println("Original stack still \t[1, 2, 3, 4]:\t" + stack);

		stack.clear();
		System.out.println("\nOriginal stack is \t[]: \t" + stack);
		reverseStack = createReverseStack(stack);
		System.out.println("Reverse stack is \t[]: \t" + reverseStack);
		System.out.println("Original stack still \t[]:\t" + stack);

		stack.push(7);
		System.out.println("\nOriginal stack is \t[7]: \t" + stack);
		reverseStack = createReverseStack(stack);
		System.out.println("Reverse stack is \t[7]: \t" + reverseStack);
		System.out.println("Original stack still \t[7]:\t" + stack);

		stack.push(5);
		stack.push(3);
		System.out.println("\nOriginal stack is \t[7, 5, 3]: \t" + stack);
		reverseStack = createReverseStack(stack);
		System.out.println("Reverse stack is \t[3, 5, 7]: \t" + reverseStack);
		System.out.println("Original stack still \t[7, 5, 3]:\t" + stack);

//        System.out.println();
//		stack.clear();
//        stack.push(7);
//        stack.push(5);
//        stack.push(2);
//        System.out.println("Original stack is \t[7, 5, 3]: \t" + stack);
//        reverseStack = createReverseStack(stack);
//        System.out.println("Reverse stack is \t[3, 5, 7]: \t" + reverseStack);
//        System.out.println("Original stack still \t[7, 5, 3]:\t" + stack);



        // UN-COMMENT TO TEST YOUR ITEMPAIR CLASS

		System.out.println("\n");
		ItemPair<Integer> numberPair = new ItemPair<Integer>(1, 2);
		System.out.println(numberPair);
		System.out.println("Same items? false: " + numberPair.sameItemsInPair());
		numberPair.setItem2(1);
		System.out.println("Same items? true:  " + numberPair.sameItemsInPair());

		ItemPair<String> wordPair = new ItemPair<String>("hello", "bye");
		System.out.println(wordPair);
		System.out.println("Same items? false: " + wordPair.sameItemsInPair());
		wordPair.setItem1(new String("bye"));
		System.out.println("Same items? true:  " + wordPair.sameItemsInPair());

		// this line should not compile!!
//		wordPair.setItem1(4);
	}
	// REVERSE ORDER WILL REVERSE ORDER IF IN ORDER NOT IN GENERAL
	/*
		public static Stack<Integer> createReverseStack(Stack<Integer> originalStack) {
		Stack <Integer> test = new Stack<>();

		originalStack.stream()
                .sorted(Collections.reverseOrder())
                .forEach(test::add);
        System.out.println(test.toString());
		return test;
	    }
	 */

    // 1.
    //Collections.reverse(originalStack);
    /*
        //2.
		Stack <Integer> test = new Stack<>();
		originalStack.stream().forEach(test::push);
        originalStack.stream().forEachOrdered();
     */

	public static Stack<Integer> createReverseStack(Stack<Integer> originalStack) {
        Stack <Integer> tempOriginal = new Stack<>();
        for(int number: originalStack){
            tempOriginal.push(number);
        }

        Stack <Integer> tempStack = new Stack<>();
        while(!tempOriginal.isEmpty()){
            tempStack.push(tempOriginal.pop());
        }

		return tempStack;
	}





}
