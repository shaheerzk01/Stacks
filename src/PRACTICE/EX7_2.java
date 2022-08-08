package PRACTICE;

import java.util.Stack;

public class EX7_2 {
	
	// Iterative function to reverse a given string.
	public static void reverse(char[] c) {
		
		// create an empty stack of characters
		Stack<Character> stack = new Stack<>();
		
		// push each character of the given string into thestack
		for(int i=0; i<c.length; i++) {
			stack.push(c[i]);
		}
		
		//start from index 0
		int k=0;
		
		// pop characters from the stack until it is empty
		while(!stack.empty()) {
			// assign each popped character back to the input string
			c[k++] = stack.pop();
		}
	}
	
	public static void main(String[] args) {
		
		String str = "Welcome to usman intitute";
		char[] c = str.toCharArray();
		reverse(c);
		str = new String(c);
		
		System.out.print("Reverse of the given string is " + str);
	}
}
