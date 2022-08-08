package PROGRAM;

import java.util.Scanner;

public class PROGRAM2 {
	
	private int arr[];
	private int top;
	private int capacity;
	
	// Constructor to initialize the stack
	PROGRAM2(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
		
	}
	
	Scanner input = new Scanner(System.in);
	// Utility function to add an element `x` to the stack
	public void push() {
		if(isFull()) {
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(-1);
		}
		while(capacity != size()) {
			int x;
			System.out.println("Enter number");
			x = input.nextInt();
			arr[++top] = x;
			
		}
		
	}
	
	// Utility function to pop a top element from the stack
	public int pop() {
		// check for stack underflow
		if(isEmpty()) {
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(-1);
		}
		while(!isEmpty()) {
			// decrease stack size by 1 and (optionally) return the popped element
			System.out.println("Depth searching" + peek());
			arr[top--] = peek();
		    
		}
		
		return arr[top--];
	}

	
	// Utility function to return the top element of the stack
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		else {
			System.exit(-1);
		}
		return -1;
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

class Mains{
	public static void main(String[] args) {
		PROGRAM2 stack = new PROGRAM2(3);
		stack.push();      
		stack.pop();        
	}
}


