package DataStructures;
public class DlinkedList {
	
	int size;
	Dnode head;
	Dnode tail;
	
	public void append(int data)
	{
		Dnode node = new Dnode(data);
		
		if(head == null)
		{
			head = node;
			tail = node;
			size++;
			return;
			
		}
		
		else
		{
			Dnode temp = this.head;
			
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(node);
			node.setPrev(temp);
			tail = node;
		}
	}
	
	public void deleteMiddleNode()
	{
		Dnode slow = this.head;
		Dnode fast = this.head;
		
		if(slow == null)
		{
			System.out.println("Empty LinkedList cannot have middle node ");
		}
		
		while(fast != null && fast.getNext() != null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();	
		}
		
		Dnode prev = slow.getPrev();
		Dnode next = slow.getNext();
		
		if(prev != null && next != null)
		{
			prev.setNext(next);
			next.setPrev(prev);
		}
		
		else if(prev != null && next == null)
		{
			prev.setNext(null);
			tail = prev;
		}
		
		else if(prev == null && next == null)
		{
			head = null;
			tail = null;
		}
		
	
	}
	
	public void delete(int data)
	{	
		if(head.getData() == data && head.getNext() == null && head.getPrev() == null)
		{
			head = null;
			tail = null;
			return;
		}
		
		else if(head.getData() == data)
		{
			Dnode temp = this.head.getNext();
			head = temp;
			head.setPrev(null);
			return;
		}
		
		else
		{	
			Dnode temp = this.head;
			while(temp.getNext() != null)
			{
				if(temp.getNext().getData() == data)
				{
					
					temp.setNext(temp.getNext().getNext());
					Dnode next = temp.getNext();
					
					if(next != null)
						next.setPrev(temp);
					
					if(next == null)
						tail = temp;
						
					return;
				}
				
				temp = temp.getNext();
			}
			
			System.out.println("The number " + data + " doesnt exist in linked list");
		}
		
	}
		
	public void print()
	{	
		if(head == null)
		{
			System.out.println("LinkedList empty");
			return;
				
		}
			
		else
		{
			Dnode temp = this.head;
				
			while(temp != null)
			{
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
			System.out.println();
			return;
		}

	}
	
	public Dnode findMiddleNode()
	{
		Dnode slow = this.head;
		Dnode fast = this.head;
		
		if(slow == null)
		{
			System.out.println("Empty LinkedList cannot have middle node ");
		}
		
		while(fast != null && fast.getNext() != null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();	
		}
		
		return slow;
	}
	
	public void kthElementToLast(int position)
	{
		int count = 1;
		Dnode temp = this.head;
		
		if(head != null)
		{
			while(temp != null)
			{
				if(count == (position - 1))
				{
					Dnode nodeatpos = temp.getNext();
					nodeatpos.setPrev(null);
					
					temp.setNext(temp.getNext().getNext());
					Dnode next = temp.getNext();
					
					next.setPrev(temp);
					
					Dnode end = tail;
					end.setNext(nodeatpos);
					nodeatpos.setPrev(end);
					
					nodeatpos.setNext(null);
					tail = nodeatpos;
					
					return;
					
				}
				
	
				temp = temp.getNext();
				count++;
				
			}
		}		
	}
	
	public void printreverse()
	{	
		if(tail == null)
		{
			System.out.println("LinkedList empty");
			return;
				
		}
			
		else
		{
			Dnode temp = this.tail;
				
			while(temp != null)
			{
				System.out.print(temp.getData() + " ");
				temp = temp.getPrev();
			}
			System.out.println();
		}

	}
}
