
public class ListQueueChecker {
	
	public static void main(String[] args) {
		ListQueue<Integer> numberQueue = new ListQueue<Integer>();		
		numberQueue.enqueue(4);
		System.out.println(numberQueue);
		numberQueue.enqueue(2);
		System.out.println(numberQueue);
		numberQueue.enqueue(3);
		System.out.println(numberQueue);
		System.out.println(numberQueue.getFront());
		System.out.println(numberQueue);
		numberQueue.enqueue(6);
		System.out.println(numberQueue);
		System.out.println(numberQueue.dequeue());
		System.out.println(numberQueue);
		numberQueue.enqueue(9);
		System.out.println(numberQueue);
		numberQueue.enqueue(5);
		System.out.println(numberQueue);
		System.out.println(numberQueue.dequeue());
		System.out.println(numberQueue);
		System.out.println(numberQueue.dequeue());		
		System.out.println(numberQueue);
		System.out.println(numberQueue.getFront());
		System.out.println(numberQueue);

		System.out.println();
		ListQueue<String> wordQueue = new ListQueue<>();
		wordQueue.enqueue("FirstInLine");
		wordQueue.enqueue("SecondInLine");
		wordQueue.enqueue("ThirdInLine");
		wordQueue.enqueue("FourthInLine");
		wordQueue.enqueue("FifthInLine");
		System.out.println(wordQueue);
		while(!wordQueue.isEmpty()) {
			System.out.println(wordQueue.dequeue());
		}
		System.out.println(wordQueue.dequeue());
		
	}

}
