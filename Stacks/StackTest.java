class Stack
{
	final int SIZE = 10;
	private Object[] elements = new Object[SIZE];
	private int top;

	public Stack()
	{
		top = -1;
	}

	// Adds an element to the top of the stack.
	public void push(Object n)
	{
		top++;
		elements[top] = n;
	}

	// Removes the top element of the stack and returns it.
	public Object pop()
	{
		return elements[top--];
	}
	
	// Looks at the top element of the stack without removing it.
	public Object peek()
	{
		return elements[top];
	}

	// If the top is -1, then we are empty. 
	// The else statement here is redundant,
	// and the if statement is not required,
	// however, it makes the code cleaner to 
	// read for a beginner, so I have written
	// it this way.
	public boolean isEmpty()
	{
		if (top == -1)
			return true;
		else
			return false;
	}

	// If the top is 1 less than the total
	// size (zero-based indexed array), then
	// we are full. See note for isEmpty() about
	// if and else statements.
	public boolean isFull()
	{
		if (top == SIZE-1)
			return true;
		else
			return false;
	}
}

public class StackTest
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		for (int i = 0; i < 10; i++)
			s.push(i);
		System.out.println("Peek at top:");
		System.out.println("Expecting 9");
		System.out.println("Actual value: " + s.peek());
		System.out.println("Popping stack now...");
		for (int i = 0; i < 10; i++)
			System.out.println(s.pop());
	}
}
