package PROGRAM;

import java.util.Scanner;

public class PROGRAM4 {
	
	private String arr1[];
	private int top;
	private int capacity;
	
	// Constructor to initialize the stack
	PROGRAM4(int size){
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
	
	
	
	public String pop1() {
		if(isEmpty()) {
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(-1);
		}
		while(!isEmpty()) {
			System.out.println("Call history: " + peek1());
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

class Main{
	public static void main(String[] args) {
		PROGRAM4 stack = new PROGRAM4(3);
		stack.push1("shaheer '123'");
		stack.push1("huzaifa '3472'");
		stack.push1("zahir '7462'");
		stack.pop1();
		
	}
}

	
	