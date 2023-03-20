import java.util.*;

public class StackTester {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your phrase:");
		String phrase = scan.nextLine();
		phrase = phrase.replace(" ", "");

		String reversedPhrase = "";
		
		Stack<Character> charStack = new Stack<Character>();
		
		for(int i=0; i<phrase.length(); i++) {
			char c = phrase.charAt(i);
			Character ch = new Character(c);
			charStack.push(ch);
		}
		
		while(!charStack.isEmpty()) {
			Character ch = charStack.pop();
			reversedPhrase += ch.toString();
		}
		
		if(phrase.equals(reversedPhrase)) {
			System.out.println("That's a palindrome!");
		} else {
			System.out.println("That's not a palindrome! :(");
		}
		
		
		
		

	}

}
