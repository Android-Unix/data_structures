package DataStructures;

public class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList()
	{
		
	}
	
	public LinkedList(Node head)
	{
		this.head = head;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty() 
	{
		if(head == null)
			return true;
		
		else
			return false;
	}
	
	
	
	public void print()
	{
		if(isEmpty())
			System.out.println("Linked list Empty");
		
		else
		{
			Node temp = this.head;
			
			while(temp != null)
			{
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
			System.out.println();
		}
	}
	public void printrev()
	{
		reverse(this.head);
		System.out.println();
	}
	
	private void reverse(Node head)
	{
		if(head == null)
			return;
		
		else
		{
			reverse(head.getNext());
			System.out.print(head.getData() + " ");
		}
	}
	
	public void delete(int data)
	{
		if(isEmpty())
			System.out.println("Cannot delete from empty Linked List");
		
		else
		{
			Node temp = this.head;
			
			if(head.getData() == data)
			{
				temp = temp.getNext();
				head.setNext(null);
				head = temp;
				size--;
			}
			
			else
			{
				while(temp.getNext() != null)
				{
					if(temp.getNext().getData() == data)
					{
						Node next = temp.getNext().getNext();
						temp.setNext(next);
						size--;
						return;
					}
					temp = temp.getNext();
				}
				
				if(temp.getNext() == null)
				{
					System.out.println("Number " + data  + " doesnt exist in LinkedList");
					return;
				}
			}
		}
	}
	
	public void append(int data)
	{
		Node node = new Node(data);
		
		if(isEmpty())
		{
			head = node;
			size++;
			return;
		}
		
		else
		{
			Node temp = this.head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(node);
			size++;
			return;
		}
	}
	
	
}
