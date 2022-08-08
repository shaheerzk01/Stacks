package PROGRAM;

import java.util.Stack;

class StackNode
{
    public String data;
    public StackNode next;
    public StackNode(String data, StackNode top)
    {
        this.data = data;
        this.next = top;
    }
}
class MyStack
{
    public StackNode top;
    public int count;
    public MyStack()
    {
        this.top = null;
        this.count = 0;
    }
    // Returns the number of element in stack
    public int size()
    {
        return count;
    }
    public boolean isEmpty()
    {
        if (this.size() > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    // Add a new element in stack
    public void push(String data)
    {
        // Make a new stack node
        // And set as top
        this.top = new StackNode(data, this.top);
        // Increase node value
        this.count++;
    }
    // Add a top element in stack
    public String pop()
    {
        String temp = "";
        if (this.isEmpty() == false)
        {
            // Get remove top value
            temp = this.top.data;
            this.top = this.top.next;
            // Reduce size
            this.count--;
        }
        return temp;
    }
    // Used to get top element of stack
    public String peek()
    {
        if (!this.isEmpty())
        {
            return top.data;
        }
        else
        {
            return "";
        }
    }
}
public class PROGRAM3
{
    // Check operator
    public boolean isOperator(char text)
    {
        if (text == '+' || 
            text == '-' || 
            text == '*' || 
            text == '/' || 
            text == '^' || 
            text == '%')
        {
            return true;
        }
        return false;
    }
    // Check operands
    public boolean isOperands(char text)
    {
        if ((text >= '0' && text <= '9') || 
            (text >= 'a' && text <= 'z') || 
            (text >= 'A' && text <= 'Z'))
        {
            return true;
        }
        return false;
    }
    // Converting the given postfix expression to 
    // infix expression
    public void postfixToInfix(String postfix)
    {
        // Get the size
        int size = postfix.length();
        // Create stack object
        MyStack s = new MyStack();
        // Some useful variables which is using 
        // of to storing current result
        String auxiliary = "";
        String op1 = "";
        String op2 = "";
        boolean isValid = true;
        for (int i = 0; i < size && isValid; i++)
        {
            // Check whether given postfix location
            // at [i] is an operator or not
            if (isOperator(postfix.charAt(i)))
            {
                // When operator exist
                // Check that two operands exist or not
                if (s.size() > 1)
                {
                    op1 = s.pop();
                    op2 = s.pop();
                    auxiliary = "(" + op2 + postfix.charAt(i) + op1 + ")";
                    s.push(auxiliary);
                }
                else
                {
                    isValid = false;
                }
            }
            else if (isOperands(postfix.charAt(i)))
            {
                // When get valid operands
                auxiliary = ""+postfix.charAt(i);
                s.push(auxiliary);
            }
            else
            {
                // Invalid operands or operator
                isValid = false;
            }
        }
        if (isValid == false)
        {
            // When have something wrong
            System.out.println("Invalid postfix : " + postfix);
        }
        else
        {
            // Display calculated result
            System.out.println(" Postfix : " + postfix);
            System.out.println(" Infix   : " + s.pop());
        }
    }
    public static void main(String[] args)
    {
        PROGRAM3 task = new PROGRAM3();
        String postfix = "ABC*DE*+*F+";
        task.postfixToInfix(postfix);
        
    }
}
	
	