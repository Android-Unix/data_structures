package DataStructures;

public class Queue {
	
	private Node front;
	private Node rear;
	
	private int size;
	
	public boolean isEmpty()
	{
		if(front == null && rear == null && size == 0)
			return true;
		
		else
			return false;
	}
	
	public void printQueue()
	{
		if(isEmpty())
			System.out.println("Empty Queue");
		
		else
		{
			Node temp = front;
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
	
	public Node deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		
		else
		{
			Node temp = front;
			
			if(front != rear)
			{
				front = front.getNext();
				size--;
			}
			else
			{
				temp = rear;
				front = null;
				rear = null;
				size--;
			}
			
			return temp;
		}
	}
	
	public void enQueue(int data)
	{
		Node node = new Node(data);
		if(isEmpty())
		{
			front = node;
			rear = node;
			size++;
			return;
		}
		else
		{
			rear.setNext(node);;
			rear = node;
			size++;
			return;	
		}
	}

}
