package DataStructures;
public class MyStack {

	Stack generalStack;
	Stack minStack;
	
	public int showMinimum()
	{
		return minStack.peek();
	}
	
	public void showMinStack()
	{
		minStack.traceStack();
	}
	
	public void showGeneralStack()
	{
		generalStack.traceStack();
	}
	
	public void push(int data)
	{
		if(generalStack == null && minStack == null)
		{
			generalStack = new Stack();
			minStack = new Stack();
			
			generalStack.push(data);;
			minStack.push(data);
			return;
		}
		
		else
		{
			generalStack.push(data);
			if(data <= minStack.peek())
			{
				minStack.push(data);
			}
			return;
		}
	}
	
	public int pop()
	{
		if(generalStack == null || generalStack.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			if(generalStack.peek() == minStack.peek())
			{
				minStack.pop();
			}
			
			return generalStack.pop();
		}
	}
}
