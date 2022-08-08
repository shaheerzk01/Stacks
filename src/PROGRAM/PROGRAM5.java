package PROGRAM;

import java.util.Scanner;

public class PROGRAM5 {
	private String arr1[];
	private int top;
	private int capacity;
	
	// Constructor to initialize the stack
	PROGRAM5(int size){
		arr1 = new String[size];
		capacity = size;
		top = -1;		
	}
	
	
	public void push1(String g) {
		if(isFull()) {
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(-1);
		}
			arr1[++top] = g;
		}
	
	
	public String pop1(String b) {
		while(!isEmpty()) {
			String a = peek1();
			if(a == "The Stranger") {
				System.out.println("yes the book is present " + b);
			}
			arr1[top--] = peek1();
		}
		return arr1[top--];
	}

	public String peek1() {
		if(!isEmpty()) {
			return arr1[top];
		}
		else {
			System.exit(-1);
		}
		return "";
	}
	
	
	public int size() {
		return top + 1;
		
	}

	
	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == -1;  // or return size() == 0;
	}
	
	// Utility function to check if the stack is full or not
	public boolean isFull() {
		return top == capacity -1; // or return size() == capacity;
	}
	
}

class g{
	public static void main(String[] args) {
		PROGRAM5 stack = new PROGRAM5(10);
		stack.push1("One Hundred Years of Solitude");
		stack.push1("War and Peace");
		stack.push1("The Odyssey");
		stack.push1("Pride and Prejudice");
		stack.push1("Middlemarch");
		stack.push1("Gulliver's Travels");
		stack.push1("The Stranger");
		stack.push1("Jane Eyre");
		stack.push1("Midnight's Children");
		stack.push1("The Lord of the Rings");
		Scanner input = new Scanner(System.in);
		String b;
		System.out.println("Enter book name");
		b = input.findInLine("The Stranger");
		stack.pop1(b);
		
	}
}


