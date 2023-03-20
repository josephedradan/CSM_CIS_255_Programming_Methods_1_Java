import java.util.*;

public class CustomerTest {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList<String> customerList = new LinkedList<String> ();
		
		boolean keepGoing = true;
		while(keepGoing) {
			System.out.println("Enter \'a\' to add a customer, \'w\' to wait on a customer, 's' to see whose up next, \'p\' to print the line, or \'q\' to exit.");
			String userChoice = scan.nextLine();
			
			if(userChoice.equalsIgnoreCase("a")) {
				System.out.println("Enter the customer.");
				String customer = scan.nextLine();
				customerList.offer(customer);
			
			}else if(userChoice.equalsIgnoreCase("w")) {
				String customer = customerList.poll();
				System.out.println("Now serving customer " + customer);
			
			}else if(userChoice.equalsIgnoreCase("s")) {
				String customer = customerList.peek();
				System.out.println("Next up is " + customer);
				
			}else if(userChoice.equalsIgnoreCase("p")) {
				Iterator<String> iterator = customerList.iterator();
				int i = 1;
				while(iterator.hasNext()) {
					String customer = iterator.next();
					System.out.println("Customer " + i + " " + customer);
					i++;
				}
			
			}else {
				keepGoing = false;
				System.out.println("Goodbye");
			}
		}

	}

}
