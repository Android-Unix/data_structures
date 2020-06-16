package DataStructures;
public class Stack {
	
	private Node top;
	private int size;
	
	public boolean isEmpty()
	{
		if(top == null && size == 0)
			return true;
		
		else
			return false;
	}
	
	public void push(int data)
	{
		Node node = new Node(data);
		if(top == null)
		{
			top = node;
			size++;
			return;
		}	
		else
		{
			Node next = top;
			top = node;
			top.setNext(next);
			size++;
			return;
		}
	}
	
	public void traceStack()
	{
		Node temp = top;
		
		if(isEmpty())
			System.out.println("Stack is Empty");
		
		else
		{
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		
		else
		{
			Node temp = top;
			temp.getData();
			
			top = top.getNext();
			size--;
			
			return temp.getData();
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		
		else
		{
			return top.getData();
		}
	}
	
	public int getSize()
	{
		return size;
	}

}
