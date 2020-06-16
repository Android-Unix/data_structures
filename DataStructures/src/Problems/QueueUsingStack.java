package Problems;

import DataStructures.Stack;

public class QueueUsingStack {
	
	Stack stack1;
	Stack stack2;
	
	int size;
	
	public void enQueue(int data)
	{
		if(stack1 == null && size == 0)
		{
			stack1 = new Stack();
			stack2 = new Stack();
			stack1.push(data);
			size++;
			return;
		}
		
		else
		{
			stack1.push(data);
			size++;
			return;
		}
		
	}
	
	public int deQueue()
	{
		if(stack1.isEmpty() && stack2.isEmpty() && size == 0)
		{
			System.out.println("Queue is Empty Boss!!");
			return -1;
		}
		else
		{	
			if(!stack1.isEmpty() && stack2.isEmpty())
			{
				while(!stack1.isEmpty())
					stack2.push(stack1.pop());
			}
			
			size--;
			return stack2.pop();
		}
		
	}
}
